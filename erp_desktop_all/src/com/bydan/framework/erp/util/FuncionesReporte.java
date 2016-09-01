package com.bydan.framework.erp.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


@SuppressWarnings("unused")
public class FuncionesReporte {
		
	public static String getStringGraficoReporte(String sTipo,String sWidth,String strCategorySeries){		//sWidth=778
		String strHtmlRelacionImagenButon="";
		String strTabsBase="\t\t\t\t";
		
		String strBarChar="barChart";
		String strBarPlot="barPlot";
		String strDataSet="categoryDataset";
		
		if(sTipo.equals("NORMAL") || sTipo.equals("BARRAS") || sTipo.equals("BARRAS_3D") || sTipo.equals("BARRAS_XY") 
			|| sTipo.equals("PASTEL") || sTipo.equals("PASTEL_3D") || sTipo.equals("APILADO") || sTipo.equals("APILADO_3D")
			|| sTipo.equals("LINEA") || sTipo.equals("LINEA_XY") || sTipo.equals("AREA") || sTipo.equals("AREA_XY") || sTipo.equals("AREA_APILADA")
			|| sTipo.equals("DISPERSION")) {
			
			if(sTipo.equals("BARRAS_3D")) {
				strBarChar="bar3DChart";
				strBarPlot="bar3DPlot";
				
			} else if(sTipo.equals("PASTEL")) {
				strBarChar="pieChart";
				strBarPlot="piePlot";
				strDataSet="pieDataset";
				
			} else if(sTipo.equals("PASTEL") || sTipo.equals("PASTEL_3D")) {
				strBarChar="pie3DChart";
				strBarPlot="pie3DPlot";
				strDataSet="pieDataset";
				
			} else if(sTipo.equals("BARRAS_XY") || sTipo.equals("BARRAS_XY")) {
				strBarChar="xyBarChart";
				strBarPlot="barPlot";
				strDataSet="xyDataset";
				
			} else if(sTipo.equals("APILADO")) {
				strBarChar="stackedBarChart";
				
			} else if(sTipo.equals("APILADO_3D")) {
				strBarChar="stackedBar3DChart";
				strBarPlot="bar3DPlot";
				
			} else if(sTipo.equals("LINEA")) {
				strBarChar="lineChart";
				strBarPlot="linePlot";
				
			}  else if(sTipo.equals("LINEA_XY")) {
				strBarChar="xyLineChart";
				strBarPlot="linePlot";
				strDataSet="xyDataset";
				
			} else if(sTipo.equals("AREA")) {
				strBarChar="areaChart";
				strBarPlot="areaPlot";
				
			} else if(sTipo.equals("AREA_XY")) {
				strBarChar="xyAreaChart";
				strBarPlot="areaPlot";
				strDataSet="xyDataset";
				
			} else if(sTipo.equals("AREA_APILADA")) {
				strBarChar="xyAreaChart";
				strBarPlot="areaPlot";
				
			} else if(sTipo.equals("DISPERSION")) {
				strBarChar="scatterChart";
				strBarPlot="scatterPlot";
				strDataSet="xyDataset";
			}
			
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<"+strBarChar+">";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t<chart>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<reportElement x=\"2\" y=\"40\" width=\""+sWidth+"\" height=\"220\">";
			//strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<printWhenExpression><![CDATA[($P{con_grafico}==Boolean.TRUE)?Boolean.TRUE:Boolean.FALSE]]></printWhenExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</reportElement>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<chartTitle/>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<chartSubtitle/>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<chartLegend/>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t</chart>";

			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t<"+strDataSet+">";
			
			strHtmlRelacionImagenButon+=strCategorySeries;
			
			/*
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<categorySeries>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<seriesExpression><![CDATA[\"debito local\"]]></seriesExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<categoryExpression><![CDATA[$F{sDescripcionGeneralEntityReporte1}]]></categoryExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<valueExpression><![CDATA[$V{total_debito_local}]]></valueExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<labelExpression><![CDATA[$F{sDescripcionGeneralEntityReporte1}]]></labelExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<itemHyperlink/>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"</categorySeries>";
			
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<categorySeries>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<seriesExpression><![CDATA[\"credito local\"]]></seriesExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<categoryExpression><![CDATA[$F{sDescripcionGeneralEntityReporte1}]]></categoryExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<valueExpression><![CDATA[$V{total_credito_local}]]></valueExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<labelExpression><![CDATA[$F{sDescripcionGeneralEntityReporte1}]]></labelExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<itemHyperlink/>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"</categorySeries>";
			
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<categorySeries>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<seriesExpression><![CDATA[\"valor\"]]></seriesExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<categoryExpression><![CDATA[$F{sDescripcionGeneralEntityReporte1}]]></categoryExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<valueExpression><![CDATA[$V{total_valor}]]></valueExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<labelExpression><![CDATA[$F{sDescripcionGeneralEntityReporte1}]]></labelExpression>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"<itemHyperlink/>";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"</categorySeries>";
			*/
			
			if(sTipo.equals("PASTEL") || sTipo.equals("PASTEL_3D")) {
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t<otherSectionHyperlink/>";
			}
			
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t</"+strDataSet+">";

			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t<"+strBarPlot+">";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<plot/>";
			
			if(sTipo.equals("NORMAL") || sTipo.equals("BARRAS") || sTipo.equals("BARRAS_3D") || sTipo.equals("BARRAS_XY") 
					|| sTipo.equals("APILADO")|| sTipo.equals("APILADO_3D") || sTipo.equals("LINEA") || sTipo.equals("LINEA_XY")
					|| sTipo.equals("AREA") || sTipo.equals("AREA_XY") || sTipo.equals("AREA_APILADA")) {
				
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<categoryAxisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<labelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<tickLabelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</categoryAxisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<valueAxisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<labelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<tickLabelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</valueAxisFormat>";
				
			} else if(sTipo.equals("DISPERSION")) {
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<xAxisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<labelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<tickLabelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</xAxisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<yAxisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<labelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<tickLabelFont/>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</axisFormat>";
				strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t</yAxisFormat>";
			}
			
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t</"+strBarPlot+">";
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"</"+strBarChar+">";
		}
		
		
		System.out.println(strHtmlRelacionImagenButon);
		
		return strHtmlRelacionImagenButon;
	}	
	
	public static String getStringCategoryGraficoNormalReporte(String sTipo,String sLabel,String sNombreCampoCategoria,String sNombreCampoValor) {
		String strHtmlRelacionImagenButon="";
		
		strHtmlRelacionImagenButon=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipo,sLabel,sNombreCampoCategoria,sNombreCampoValor/*sNombreCampoCategoriaValor*/,sNombreCampoValor);
		
		return strHtmlRelacionImagenButon;
	}
	
	public static String getStringCategoryGraficoNormalReporte(String sTipo,String sLabel,String sNombreCampoCategoria,String sNombreCampoCategoriaValor,String sNombreCampoValor) {
		String strHtmlRelacionImagenButon="";
		String strTabsBase="\t\t\t\t";
		
		String strSeries="categorySeries";
		String strCategory="categoryExpression";
		String strHyperlink="itemHyperlink";
		String strValueExpression="valueExpression";
		String sNombreCampoCategoriaOriginal=sNombreCampoCategoria;
		
		if(sTipo.equals("PASTEL")|| sTipo.equals("PASTEL_3D")) {
			strSeries="pieSeries";
			strCategory="keyExpression";
			strHyperlink="sectionHyperlink";
			
		} else if(sTipo.equals("BARRAS_XY") || sTipo.equals("LINEA_XY") || sTipo.equals("AREA_XY") || sTipo.equals("DISPERSION")) {
			strSeries="xySeries";
			strCategory="xValueExpression";
			strValueExpression="yValueExpression";
			strHyperlink="itemHyperlink";
			
		}
		
		strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t<"+strSeries+">";
		
		if(sTipo.equals("NORMAL") || sTipo.equals("BARRAS") || sTipo.equals("BARRAS_3D")|| sTipo.equals("BARRAS_XY") 
		  || sTipo.equals("APILADO") || sTipo.equals("APILADO_3D") || sTipo.equals("LINEA") || sTipo.equals("LINEA_XY")
		  || sTipo.equals("AREA") || sTipo.equals("AREA_XY") || sTipo.equals("AREA_APILADA") || sTipo.equals("DISPERSION")) {
			
			strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<seriesExpression><![CDATA[\""+sLabel+"\"]]></seriesExpression>";
		}
		
		if(sTipo.equals("BARRAS_XY") || sTipo.equals("LINEA_XY") || sTipo.equals("AREA_XY") || sTipo.equals("DISPERSION")) {
			sNombreCampoCategoria=sNombreCampoCategoriaValor;//sNombreCampoValor;
		}
		
		strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<"+strCategory+"><![CDATA[$F{"+sNombreCampoCategoria+"}]]></"+strCategory+">";
		strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<"+strValueExpression+"><![CDATA[$F{"+sNombreCampoValor+"}]]></"+strValueExpression+">";
		strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<labelExpression><![CDATA[$F{"+sNombreCampoCategoriaOriginal+"}]]></labelExpression>";
		
		strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t\t<"+strHyperlink+"/>";
		
		strHtmlRelacionImagenButon+="\r\n"+strTabsBase+"\t</"+strSeries+">";
		
		return strHtmlRelacionImagenButon;
	}
	
	public static String getStringCategoryGraficoNormalReporte(String sLabel,String sNombreCampoCategoria,String sNombreCampoValor) {
		String strHtmlRelacionImagenButon="";
	
		strHtmlRelacionImagenButon=FuncionesReporte.getStringCategoryGraficoNormalReporte("NORMAL",sLabel, sNombreCampoCategoria, sNombreCampoValor);
		
		return strHtmlRelacionImagenButon;
	}
}
