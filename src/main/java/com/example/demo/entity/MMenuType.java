package com.example.demo.entity;

public class MMenuType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_menu_type.menu_type_id
     *
     * @mbg.generated Mon Jun 10 00:51:47 JST 2019
     */
    private Integer menuTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_menu_type.menu_type_name
     *
     * @mbg.generated Mon Jun 10 00:51:47 JST 2019
     */
    private String menuTypeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_menu_type.menu_type_id
     *
     * @return the value of m_menu_type.menu_type_id
     *
     * @mbg.generated Mon Jun 10 00:51:47 JST 2019
     */
    public Integer getMenuTypeId() {
        return menuTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_menu_type.menu_type_id
     *
     * @param menuTypeId the value for m_menu_type.menu_type_id
     *
     * @mbg.generated Mon Jun 10 00:51:47 JST 2019
     */
    public void setMenuTypeId(Integer menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_menu_type.menu_type_name
     *
     * @return the value of m_menu_type.menu_type_name
     *
     * @mbg.generated Mon Jun 10 00:51:47 JST 2019
     */
    public String getMenuTypeName() {
        return menuTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_menu_type.menu_type_name
     *
     * @param menuTypeName the value for m_menu_type.menu_type_name
     *
     * @mbg.generated Mon Jun 10 00:51:47 JST 2019
     */
    public void setMenuTypeName(String menuTypeName) {
        this.menuTypeName = menuTypeName;
    }
}