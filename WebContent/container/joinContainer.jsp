<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container">
	<div class="join">
		<div class="join-con">
			<form action="memberInsert.do" method="POST" id="joinform">

				<table>
					<tr>
						<th colspan="2">회원가입</th>
					</tr>
					<tr>
						<td><label for="userId">아이디</label></td>
						<td><input type="text" name="userId" id="userId"></td>
					</tr>
					<tr>
						<td><label for="userPw">비밀번호</label></td>
						<td><input type="password" name="userPw" id="userPw"></td>
					</tr>
					<tr>
						<td><label for="gender">성별</label></td>
						<td><input type="radio" name="gender" class="gender"
							value="남자" checked>남 <input type="radio" name="gender"
							class="gender" value="여자">여</td>
					</tr>
					<tr>
						<td><label for="hobbys">취미</label></td>
						<td><input type="checkbox" name="hobbys" class="hobbys"
							value="등산">등산 <input type="checkbox" name="hobbys"
							class="hobbys" value="영화">영화 <input type="checkbox"
							name="hobbys" class="hobbys" value="게임">게임 <input
							type="checkbox" name="hobbys" class="hobbys" value="여행">여행
						</td>
					</tr>

					<tr>
						<td><label for="hometown">출신고향</label></td>
						<td><select name="hometown" id="hometown" class="hometown">
								<option value="" selected>::출신고향선택::</option>
								<option value="서울">서울</option>
								<option value="경기">경기</option>
								<option value="전라">전라</option>
								<option value="충청">충청</option>
								<option value="경상">경상</option>
						</select></td>
					</tr>

					<tr>
						<td colspan="2"><label for="memo">메모</label><br></td>
					</tr>

					<tr>
						<td colspan="2"><textarea name="memo" id="memo" cols="30"
								rows="10"></textarea> <br></td>
					</tr>

					<tr class="lastTr">
						<td colspan="2"><input type="reset" value="초기화"> <input
							type="submit" value="회원가입 실행" id="btn"></td>
					</tr>

				</table>
			</form>
		</div>
	</div>
</div>