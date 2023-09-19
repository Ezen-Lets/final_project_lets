package com.vj.lets.domain.support.service;

import com.vj.lets.domain.common.web.PageParams;
import com.vj.lets.domain.support.dto.Faq;
import com.vj.lets.domain.support.dto.FaqCategory;

import java.util.List;
import java.util.Map;

/**
 * FAQ 관련 비즈니스 로직 처리 및 트랜잭션 관리 서비스 인터페이스
 *
 * @author VJ특공대 김종원
 * @version 1.0
 * @since 2023-09-10 (일)
 */
public interface FaqService {

    /**
     * FAQ 등록
     *
     * @param faq FAQ 정보
     */
    public void register(Faq faq);

    /**
     * 전체 FAQ 카테고리 목록 조회
     *
     * @return FAQ 카테고리 목록
     */
    public List<FaqCategory> getFaqCategoryList();

    /**
     * 전체 FAQ 수 조회
     *
     * @return 전체 FAQ 갯수
     */
    public int getCountFaq(String type);

    /**
     * 전체 FAQ 목록 조회 (관리자용)
     *
     * @return FAQ 목록
     */
    public List<Map<String, Object>> getFaqListForAdmin(PageParams pageParams);

    /**
     * 카테고리 별로 정렬하여 전체 FAQ 목록 조회
     *
     * @return FAQ 목록
     */
    public Map<String, List<Faq>> getFaqList();

    /**
     * FAQ 수정
     *
     * @param faq FAQ 정보
     */
    public void edit(Faq faq);

    /**
     * FAQ 삭제
     *
     * @param id FAQ ID
     */
    public void remove(int id);

}
