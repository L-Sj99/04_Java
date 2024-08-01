package pkg4.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 문자 기반 스트림
 * -2byte 문자(char) 단위로 입/출력하는 스트림
 * - 문자만 작성된 파일(txt), 채팅, 인터넷 요청(주소)/응답(html)
 * -Reader(입력), Writer(출력) 최상위 인터페이스
 * 
 */

public class CharService {
	/* 문자 기반 스트림을 이용해 출력하기1
	 * - 기반 스트림만 이용
	 */
	public void fileOutput1() {
		
		// StringBuilder : String불변성을 해결한 객체
		StringBuilder sb = new StringBuilder();
		sb.append("오늘은 8월 1일 입니다\n");
		sb.append("집에 가고 싶네요..\n");
		sb.append("집 보내주세요\n");
		sb.append("abcdefg\n");
		sb.append("123456789\n");
		
		String str = sb.toString();
		
		// 문자 기반 스트림 참조 변수 선언
		FileWriter fw = null;
		
		try {
			// 예외가 발생할 것 같은 코드를 작성하는 구문
			
			// 해당 폴더가 없으면 만들어주기
			File folder = new File("/io_test/char");
			if( !folder.exists()) {
				folder.mkdirs();
			}
			
			// 문자 기반 스트림 객체 생성
			fw = new FileWriter("/io_test/char/문자테스트.txt");
			
			// 문자열을 지정된 파일에 출력 -> 자동으로 전달한 String을 한 글자씩 출력
			fw.write(str);
			
			// 스트림 밖으로 데이터를 흘려보냄(flush)
			fw.flush();	
			
			System.out.println("[출력 완료]");
		} catch(Exception e) {
			// try에서 던져진 예외를 잡아서 처리하는 구문
			
			e.printStackTrace();
		} finally {
			// try에서 예외 발생 여부 관계 없이 무조건 수행하는 구문
			
			try {
				
				// close() : flush() 후 스트림 닫기
				if(fw != null); fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/* 문자 기반 스트림을 이용해 출력하기2
	 * - 기반 + 보조 스트림
	 */
	public void fileOutput2() {
		StringBuilder sb = new StringBuilder();
		sb.append("문자 기반 보조 스트림\n");
		sb.append("BufferedWriter를 이용해\n");
		sb.append("출력한 결과\n");
		
		String str = sb.toString();
		
		// 스트림 참조 변수 선언
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			// 스트림 객체 생성
			fw = new FileWriter("/io_test/char/보조스트림출력.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(str); // 보조 스트림을 이용해 출력
			bw.flush(); // 스트림에 존재하는 데이터 내보내기
			System.out.println("[출력 완료]");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림을 닫으면 기반 스트림도 같이 닫힘
				// close() 호출 시 자동으로 flush()도 호출됨
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/* 문자 기반 입력 스트림을 이용해 /io_test/char/문자테스트.txt 파일 내용을 읽어와 콘솔에 출력 */
	public void fileInput1() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("/io_test/char/문자테스트.txt");
			int value = 0;
			
			StringBuilder sb = new StringBuilder();
			while(true) {
				// fr.read() : 문자 하나(2byte)를 읽어옴, 없으면 -1
				value = fr.read();
				
				// 더 이상 읽어올 문자가 없을 경우
				if(value == -1) break;
				
				sb.append((char)value);
			}
			System.out.println(sb.toString());
			
		} catch(Exception e) {
		e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/* 문자 기반 스트림을 이용해 입력받기2 (기반 + 보조 스트림) */
	public void fileInput2() {
		
		// 스트림 참조변수
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			// 스트림 객체 생성
			fr = new FileReader("/io_test/char/문자테스트.txt");
			br = new BufferedReader(fr);
			
			// String br.read(); -> 한 줄을 읽어옴, 없으면 null 반환 -> \n은 읽어오지 않음
			
			String line = null; // 읽어온 한 줄을 저장할 변수
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				line = br.readLine();
				
				// 읽어온 내용이 없다면 반복 종료
				if(line == null) break;
				
				sb.append(line);
				sb.append("\n");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
