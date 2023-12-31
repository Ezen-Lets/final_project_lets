package com.vj.lets.domain.cafe.mapper;

import com.vj.lets.domain.cafe.dto.Cafe;
import com.vj.lets.domain.cafe.dto.CafeSearch;
import com.vj.lets.domain.common.web.PageParams;
import com.vj.lets.domain.common.web.PageParamsForCafe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Cafe 테이블 관련 명세
 *
 * @author VJ특공대 강소영
 * @author VJ특공대 김종원
 * @version 1.0
 * @since 2023. 9. 7.
 */
@Mapper
public interface CafeMapper {

    /**
     * 카페 생성
     *
     * @param cafe 카페 정보
     * @see com.vj.lets.web.dashboard.controller.AdminController
     */
    public void create(Cafe cafe);

    /**
     * 카페 정보 업데이트
     *
     * @param cafe 카페 정보
     */
    public void update(Cafe cafe);

    /**
     * 카페 ID로 카페 조회
     *
     * @param id 카페 ID
     * @return 카페 정보
     */
    public Map<String, Object> findById(int id);

    /**
     * 멤버 ID로 카페 검색
     *
     * @param id 멤버 ID
     * @return 카페 정보
     */
    public Map<String, Object> findByMemberId(int id);

    /**
     * 카페 전체목록 출력
     *
     * @param pageParamsForCafe 페이지
     * @return 카페 전체 목록
     */
    public List<Map<String, Object>> findByAll(PageParamsForCafe pageParamsForCafe);

    /**
     * 카페 목록 개수 출력
     *
     * @param cafeSearch 카페 검색
     * @return 카페 개수
     */
    public int countByCafeList(CafeSearch cafeSearch);

    /**
     * 누적 예약이 가장 많은 카페 6개 출력
     *
     * @return 출력 카페 목록
     */
    public List<Map<String, Object>> findByBest();


    /**
     * 카패 검색 결과 출력
     *
     * @param cafeSearch        카페 검색 객체
     * @param pageParamsForCafe 페이징 정보
     * @return 검색 결과 목록
     */
    public List<Map<String, Object>> findBySearch(@Param("cafeSearch") CafeSearch cafeSearch,
                                                  @Param("pageParamsForCafe") PageParamsForCafe pageParamsForCafe);

    /**
     * 전체 입점 카페 수 조회
     *
     * @return 전체 입점 카페 수
     * @see com.vj.lets.web.dashboard.controller.AdminController
     */
    public int readCountAllForAdmin();

    /**
     * 전체 카페 목록 조회 (관리자용)
     *
     * @param pageParams 페이징 정보
     * @return 카페 목록
     * @see com.vj.lets.web.dashboard.controller.AdminController
     */
    public List<Map<String, Object>> readAllForAdmin(PageParams pageParams);

    /**
     * 최근 1년간 월별 신규 카페 수 조회
     *
     * @return 신규 카페 수 목록
     * @see com.vj.lets.web.dashboard.controller.AdminController
     */
    public List<Map<String, Object>> readCountByRegMonth();

    /**
     * 최근 한달간 신규 카페 수 조회
     *
     * @return 신규 카페 수
     * @see com.vj.lets.web.dashboard.controller.AdminController
     */
    public int readCountByLastMonth();

    /**
     * 카페 삭제
     *
     * @param id 카페 ID
     */
    public void delete(int id);
}
