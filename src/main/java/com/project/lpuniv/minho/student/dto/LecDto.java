package com.project.lpuniv.minho.student.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LecDto {
    //학생번호(FK 이름 가져올 때)
    private int stud_no;

    //강의 관리번호
    private int OCC_NO;

    //수업 전체 진도율
    private double stud_pg;

    //과제 종합 점수
    private double stud_sc;

    //학생 수료 여부
    private String stud_St;

    public LecDto(int stud_no, int OCC_NO, double stud_pg, double stud_sc, String stud_St) {
        this.stud_no = stud_no;
        this.OCC_NO = OCC_NO;
        this.stud_pg = stud_pg;
        this.stud_sc = stud_sc;
        this.stud_St = stud_St;
    }
}

//한 강사의 강의에 들어가면 학생 등록 버튼
//그 버튼 누르면 학생 리스트 엑셀 파일로 등록
//수업 전체 진도율: 수료 여부 80% , 총 시간에서 영상 100% 들은 수 카운트 둘이 나눠서 80% 넘으면 수료

