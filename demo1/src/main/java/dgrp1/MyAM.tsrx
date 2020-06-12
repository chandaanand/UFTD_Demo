<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>dgrp1</className>
    <objects>
        <object type="Page" technology="Web">
            <name>Advantage Shopping</name>
            <codeName>AdvantageShoppingPage</codeName>
            <description></description>
            <identification/>
            <children>
                <object type="Button" technology="Web">
                    <name>check_out_btn</name>
                    <codeName>CheckOutBtnButton</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ButtonType" type="string" isRegExp="false">submit</property>
                            <property name="Id" type="string" isRegExp="false">checkOutButton</property>
                            <property name="Name" type="string" isRegExp="true">CHECKOUT \(\$.*</property>
                            <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Total_Cart_Amt</name>
                    <codeName>Total_Cart_Amt</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="ClassName" type="string" isRegExp="false">roboto-medium ng-binding</property>
                            <property name="InnerText" type="string" isRegExp="true">\$.*</property>
                            <property name="TagName" type="string" isRegExp="false">SPAN</property>
                        </properties>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Item_Amount</name>
                    <codeName>Item_Amount</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="AccessibilityName" type="string" isRegExp="false"></property>
                            <property name="ClassName" type="string" isRegExp="false">price roboto-regular ng-binding</property>
                            <property name="TagName" type="string" isRegExp="false">P</property>
                        </properties>
                        <index>1</index>
                    </identification>
                </object>
                <object type="WebElement" technology="Web">
                    <name>Item_quantity</name>
                    <codeName>Item_quantity</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="true">QUANTITY \d* </property>
                            <property name="TagName" type="string" isRegExp="false">TD</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
