package com.project.lpuniv.minho.listenLec.dao;

import com.project.lpuniv.minho.listenLec.dto.LecInfoDto;
import com.project.lpuniv.minho.listenLec.dto.LecListDto;
import com.project.lpuniv.minho.listenLec.dto.LecVideoDto;
import com.project.lpuniv.minho.listenLec.dto.SchsDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ListenLecDao {
    //강의 정보 강사 이름 강의 내용 등
    List<LecInfoDto> selectAllLitenLec();
    //학생이 듣는 강의 목록
    List<LecListDto> selectLecList(@Param("OCC_NO") int OCC_NO);
    //강의 영상 불러오기
    LecVideoDto selectLecVideo(@Param("CCIM_NO") int CCIM_NO, @Param("OCC_NO") int OCC_NO);
    //강의 영상 페이지 에서 수강 이력 조회
    SchsDto selectSchs(int stud_no);
    void insertSchs(SchsDto schsDto);
}
