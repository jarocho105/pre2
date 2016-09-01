/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.seguridad.util.ColorGeneralConstantesFunciones;
import com.bydan.erp.seguridad.util.ColorGeneralParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ColorGeneralParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ColorGeneralBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ColorGeneralBeanSwingJInternalFrame extends ColorGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ColorGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ColorGeneral> colorgeneralValidator = new ClassValidator<ColorGeneral>(ColorGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ColorGeneral colorgeneral;	
	public ColorGeneral colorgeneralAux;
	public ColorGeneral colorgeneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ColorGeneral colorgeneralTotales;
	public Long idColorGeneralActual;
	public Long iIdNuevoColorGeneral=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoColorGeneral;
	public Boolean isPermisoNuevoColorGeneral;
	public Boolean isPermisoActualizarColorGeneral;
	public Boolean isPermisoActualizarOriginalColorGeneral;
	public Boolean isPermisoEliminarColorGeneral;
	public Boolean isPermisoGuardarCambiosColorGeneral;
	public Boolean isPermisoConsultaColorGeneral;
	public Boolean isPermisoBusquedaColorGeneral;
	public Boolean isPermisoReporteColorGeneral;
	public Boolean isPermisoPaginacionMedioColorGeneral;
	public Boolean isPermisoPaginacionAltoColorGeneral;
	public Boolean isPermisoPaginacionTodoColorGeneral;
	public Boolean isPermisoCopiarColorGeneral;
	public Boolean isPermisoVerFormColorGeneral;
	public Boolean isPermisoDuplicarColorGeneral;
	public Boolean isPermisoOrdenColorGeneral;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public ColorGeneralParameterReturnGeneral colorgeneralReturnGeneral;
	public ColorGeneralParameterReturnGeneral colorgeneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoColorGeneral=false;
	public Boolean esParaAccionDesdeFormularioColorGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public ColorGeneralLogic colorgeneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ColorGeneral colorgeneralBean;
	public ColorGeneralConstantesFunciones colorgeneralConstantesFunciones;
	//public ColorGeneralParameterReturnGeneral colorgeneralReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ColorGeneral> colorgenerals;	
	//public List<ColorGeneral> colorgeneralsEliminados;
	//public List<ColorGeneral> colorgeneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoColorGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarColorGeneral=true;
	public Boolean isVisibilidadCeldaCopiarColorGeneral=true;
	public Boolean isVisibilidadCeldaVerFormColorGeneral=true;
	public Boolean isVisibilidadCeldaOrdenColorGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
	public Boolean isVisibilidadCeldaModificarColorGeneral=false;
	public Boolean isVisibilidadCeldaActualizarColorGeneral=false;
	public Boolean isVisibilidadCeldaEliminarColorGeneral=false;
	public Boolean isVisibilidadCeldaCancelarColorGeneral=false;
	public Boolean isVisibilidadCeldaGuardarColorGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosColorGeneral=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoColorGeneral() {
		return this.iIdNuevoColorGeneral;
	}

	public void setiIdNuevoColorGeneral(Long iIdNuevoColorGeneral) {
		this.iIdNuevoColorGeneral = iIdNuevoColorGeneral;
	}
	
	public Long getidColorGeneralActual() {
		return this.idColorGeneralActual;
	}

	public void setidColorGeneralActual(Long idColorGeneralActual) {
		this.idColorGeneralActual = idColorGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ColorGeneral getcolorgeneral() {
		return this.colorgeneral;
	}

	public void setcolorgeneral(ColorGeneral colorgeneral) {
		this.colorgeneral = colorgeneral;
	}
	
	public ColorGeneral getcolorgeneralAux() {
		return this.colorgeneralAux;
	}

	public void setcolorgeneralAux(ColorGeneral colorgeneralAux) {
		this.colorgeneralAux = colorgeneralAux;
	}				
	
	public ColorGeneral getcolorgeneralAnterior() {
		return this.colorgeneralAnterior;
	}

	public void setcolorgeneralAnterior(ColorGeneral colorgeneralAnterior) {
		this.colorgeneralAnterior = colorgeneralAnterior;
	}	
	
	public ColorGeneral getcolorgeneralTotales() {
		return this.colorgeneralTotales;
	}

	public void setcolorgeneralTotales(ColorGeneral colorgeneralTotales) {
		this.colorgeneralTotales = colorgeneralTotales;
	}	
	
	public ColorGeneral getcolorgeneralBean() {
		return this.colorgeneralBean;
	}

	public void setcolorgeneralBean(ColorGeneral colorgeneralBean) {
		this.colorgeneralBean = colorgeneralBean;
	}	
	
	public ColorGeneralParameterReturnGeneral getcolorgeneralReturnGeneral() {
		return this.colorgeneralReturnGeneral;
	}

	public void setcolorgeneralReturnGeneral(ColorGeneralParameterReturnGeneral colorgeneralReturnGeneral) {
		this.colorgeneralReturnGeneral = colorgeneralReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ColorGeneralLogic getColorGeneralLogic()	{		
		return colorgeneralLogic;
	}

	public void setColorGeneralLogic(ColorGeneralLogic colorgeneralLogic) {
		this.colorgeneralLogic = colorgeneralLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoColorGeneral() {
		return isEsNuevoColorGeneral;
	}

	public void setIsEsNuevoColorGeneral(Boolean isEsNuevoColorGeneral) {
		this.isEsNuevoColorGeneral = isEsNuevoColorGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioColorGeneral() {
		return esParaAccionDesdeFormularioColorGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioColorGeneral(Boolean esParaAccionDesdeFormularioColorGeneral) {
		this.esParaAccionDesdeFormularioColorGeneral = esParaAccionDesdeFormularioColorGeneral;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesColorGeneral() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ColorGeneralConstantesFunciones.refrescarForeignKeysDescripcionesColorGeneral(this.colorgeneralLogic.getColorGenerals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ColorGeneralConstantesFunciones.refrescarForeignKeysDescripcionesColorGeneral(this.colorgenerals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//colorgeneralLogic.setColorGenerals(this.colorgenerals);
			colorgeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public ColorGeneralParameterReturnGeneral getColorGeneralParameterGeneral() {
		return this.colorgeneralParameterGeneral;
	}
	
	public void setColorGeneralParameterGeneral(ColorGeneralParameterReturnGeneral colorgeneralParameterGeneral) {
		this.colorgeneralParameterGeneral = colorgeneralParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoColorGeneral() {
		return isPermisoTodoColorGeneral;
	}

	public void setIsPermisoTodoColorGeneral(Boolean isPermisoTodoColorGeneral) {
		this.isPermisoTodoColorGeneral = isPermisoTodoColorGeneral;
	}

	public Boolean getIsPermisoNuevoColorGeneral() {
		return isPermisoNuevoColorGeneral;
	}

	public void setIsPermisoNuevoColorGeneral(Boolean isPermisoNuevoColorGeneral) {
		this.isPermisoNuevoColorGeneral = isPermisoNuevoColorGeneral;
	}

	public Boolean getIsPermisoActualizarColorGeneral() {
		return isPermisoActualizarColorGeneral;
	}

	public void setIsPermisoActualizarColorGeneral(Boolean isPermisoActualizarColorGeneral) {
		this.isPermisoActualizarColorGeneral = isPermisoActualizarColorGeneral;
	}

	public Boolean getIsPermisoEliminarColorGeneral() {
		return isPermisoEliminarColorGeneral;
	}

	public void setIsPermisoEliminarColorGeneral(Boolean isPermisoEliminarColorGeneral) {
		this.isPermisoEliminarColorGeneral = isPermisoEliminarColorGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosColorGeneral() {
		return isPermisoGuardarCambiosColorGeneral;
	}

	public void setIsPermisoGuardarCambiosColorGeneral(Boolean isPermisoGuardarCambiosColorGeneral) {
		this.isPermisoGuardarCambiosColorGeneral = isPermisoGuardarCambiosColorGeneral;
	}
	
	public Boolean getIsPermisoConsultaColorGeneral() {
		return isPermisoConsultaColorGeneral;
	}

	public void setIsPermisoConsultaColorGeneral(Boolean isPermisoConsultaColorGeneral) {
		this.isPermisoConsultaColorGeneral = isPermisoConsultaColorGeneral;
	}

	public Boolean getIsPermisoBusquedaColorGeneral() {
		return isPermisoBusquedaColorGeneral;
	}

	public void setIsPermisoBusquedaColorGeneral(Boolean isPermisoBusquedaColorGeneral) {
		this.isPermisoBusquedaColorGeneral = isPermisoBusquedaColorGeneral;
	}

	public Boolean getIsPermisoReporteColorGeneral() {
		return isPermisoReporteColorGeneral;
	}

	public void setIsPermisoReporteColorGeneral(Boolean isPermisoReporteColorGeneral) {
		this.isPermisoReporteColorGeneral = isPermisoReporteColorGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioColorGeneral() {
		return isPermisoPaginacionMedioColorGeneral;
	}

	public void setIsPermisoPaginacionMedioColorGeneral(Boolean isPermisoPaginacionMedioColorGeneral) {
		this.isPermisoPaginacionMedioColorGeneral = isPermisoPaginacionMedioColorGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoColorGeneral() {
		return isPermisoPaginacionTodoColorGeneral;
	}

	public void setIsPermisoPaginacionTodoColorGeneral(Boolean isPermisoPaginacionTodoColorGeneral) {
		this.isPermisoPaginacionTodoColorGeneral = isPermisoPaginacionTodoColorGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoColorGeneral() {
		return isPermisoPaginacionAltoColorGeneral;
	}

	public void setIsPermisoPaginacionAltoColorGeneral(Boolean isPermisoPaginacionAltoColorGeneral) {
		this.isPermisoPaginacionAltoColorGeneral = isPermisoPaginacionAltoColorGeneral;
	}
	
	public Boolean getIsPermisoCopiarColorGeneral() {
		return isPermisoCopiarColorGeneral;
	}

	public void setIsPermisoCopiarColorGeneral(Boolean isPermisoCopiarColorGeneral) {
		this.isPermisoCopiarColorGeneral = isPermisoCopiarColorGeneral;
	}
	
	public Boolean getIsPermisoVerFormColorGeneral() {
		return isPermisoVerFormColorGeneral;
	}

	public void setIsPermisoVerFormColorGeneral(Boolean isPermisoVerFormColorGeneral) {
		this.isPermisoVerFormColorGeneral = isPermisoVerFormColorGeneral;
	}
	
	public Boolean getIsPermisoDuplicarColorGeneral() {
		return isPermisoDuplicarColorGeneral;
	}

	public void setIsPermisoDuplicarColorGeneral(Boolean isPermisoDuplicarColorGeneral) {
		this.isPermisoDuplicarColorGeneral = isPermisoDuplicarColorGeneral;
	}
	
	public Boolean getIsPermisoOrdenColorGeneral() {
		return isPermisoOrdenColorGeneral;
	}

	public void setIsPermisoOrdenColorGeneral(Boolean isPermisoOrdenColorGeneral) {
		this.isPermisoOrdenColorGeneral = isPermisoOrdenColorGeneral;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoColorGeneral() {
		return isVisibilidadCeldaNuevoColorGeneral;
	}

	public void setIsVisibilidadCeldaNuevoColorGeneral(Boolean isVisibilidadCeldaNuevoColorGeneral) {
		this.isVisibilidadCeldaNuevoColorGeneral = isVisibilidadCeldaNuevoColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarColorGeneral() {
		return isVisibilidadCeldaDuplicarColorGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarColorGeneral(Boolean isVisibilidadCeldaDuplicarColorGeneral) {
		this.isVisibilidadCeldaDuplicarColorGeneral = isVisibilidadCeldaDuplicarColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarColorGeneral() {
		return isVisibilidadCeldaCopiarColorGeneral;
	}

	public void setIsVisibilidadCeldaCopiarColorGeneral(Boolean isVisibilidadCeldaCopiarColorGeneral) {
		this.isVisibilidadCeldaCopiarColorGeneral = isVisibilidadCeldaCopiarColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormColorGeneral() {
		return isVisibilidadCeldaVerFormColorGeneral;
	}

	public void setIsVisibilidadCeldaVerFormColorGeneral(Boolean isVisibilidadCeldaVerFormColorGeneral) {
		this.isVisibilidadCeldaVerFormColorGeneral = isVisibilidadCeldaVerFormColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenColorGeneral() {
		return isVisibilidadCeldaOrdenColorGeneral;
	}

	public void setIsVisibilidadCeldaOrdenColorGeneral(Boolean isVisibilidadCeldaOrdenColorGeneral) {
		this.isVisibilidadCeldaOrdenColorGeneral = isVisibilidadCeldaOrdenColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesColorGeneral() {
		return isVisibilidadCeldaNuevoRelacionesColorGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesColorGeneral(Boolean isVisibilidadCeldaNuevoRelacionesColorGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesColorGeneral = isVisibilidadCeldaNuevoRelacionesColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarColorGeneral() {
		return isVisibilidadCeldaModificarColorGeneral;
	}

	public void setIsVisibilidadCeldaModificarColorGeneral(Boolean isVisibilidadCeldaModificarColorGeneral) {
		this.isVisibilidadCeldaModificarColorGeneral = isVisibilidadCeldaModificarColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarColorGeneral() {
		return isVisibilidadCeldaActualizarColorGeneral;
	}

	public void setIsVisibilidadCeldaActualizarColorGeneral(Boolean isVisibilidadCeldaActualizarColorGeneral) {
		this.isVisibilidadCeldaActualizarColorGeneral = isVisibilidadCeldaActualizarColorGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarColorGeneral() {
		return isVisibilidadCeldaEliminarColorGeneral;
	}

	public void setIsVisibilidadCeldaEliminarColorGeneral(Boolean isVisibilidadCeldaEliminarColorGeneral) {
		this.isVisibilidadCeldaEliminarColorGeneral = isVisibilidadCeldaEliminarColorGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarColorGeneral() {
		return isVisibilidadCeldaCancelarColorGeneral;
	}

	public void setIsVisibilidadCeldaCancelarColorGeneral(Boolean isVisibilidadCeldaCancelarColorGeneral) {
		this.isVisibilidadCeldaCancelarColorGeneral = isVisibilidadCeldaCancelarColorGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarColorGeneral() {
		return isVisibilidadCeldaGuardarColorGeneral;
	}

	public void setIsVisibilidadCeldaGuardarColorGeneral(Boolean isVisibilidadCeldaGuardarColorGeneral) {
		this.isVisibilidadCeldaGuardarColorGeneral = isVisibilidadCeldaGuardarColorGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosColorGeneral() {
		return isVisibilidadCeldaGuardarCambiosColorGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosColorGeneral(Boolean isVisibilidadCeldaGuardarCambiosColorGeneral) {
		this.isVisibilidadCeldaGuardarCambiosColorGeneral = isVisibilidadCeldaGuardarCambiosColorGeneral;
	}
		
	public ColorGeneralSessionBean getcolorgeneralSessionBean() {
		return this.colorgeneralSessionBean;
	}
	
	public void setcolorgeneralSessionBean(ColorGeneralSessionBean colorgeneralSessionBean) {
		this.colorgeneralSessionBean=colorgeneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysColorGeneral(ColorGeneral colorgeneral)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(ColorGeneral colorgeneral,ColorGeneral colorgeneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalColorGeneral(colorgeneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		colorgeneralAux.setId(colorgeneral.getId());
		colorgeneralAux.setVersionRow(colorgeneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessColorGeneral();
		
			int intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = colorgeneralValidator.getInvalidValues(this.colorgeneral);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			colorgeneralLogic.setDatosCliente(datosCliente);
			colorgeneralLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				colorgeneralAux=new  ColorGeneral();
				
				colorgeneralAux.setIsNew(true);
				colorgeneralAux.setIsChanged(true);
				
				colorgeneralAux.setColorGeneralOriginal(this.colorgeneral);
				
				colorgeneralAux.setId(this.colorgeneral.getId());	
				colorgeneralAux.setVersionRow(this.colorgeneral.getVersionRow());	
				colorgeneralAux.setnombre(this.colorgeneral.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.colorgeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.colorgeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(colorgeneralAux,colorgeneralLogic.getColorGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorgeneralAux,colorgenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.colorgeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.colorgeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralLogic.saveColorGenerals();//WithConnection
						//colorgeneralLogic.getSetVersionRowColorGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.colorgeneral,colorgeneralAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				colorgeneralAux=new  ColorGeneral();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.colorgeneralSessionBean.getEsGuardarRelacionado() 
					|| (this.colorgeneralSessionBean.getEsGuardarRelacionado() && this.colorgeneral.getId()>=0)) {
						
					colorgeneralAux.setIsNew(false);
				}
				
				colorgeneralAux.setIsDeleted(false);
			
				colorgeneralAux.setId(this.colorgeneral.getId());	
				colorgeneralAux.setVersionRow(this.colorgeneral.getVersionRow());	
				colorgeneralAux.setnombre(this.colorgeneral.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(colorgeneralAux,colorgeneralLogic.getColorGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorgeneralAux,colorgenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.colorgeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.colorgeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralLogic.saveColorGenerals();//WithConnection
						//colorgeneralLogic.getSetVersionRowColorGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.colorgeneral,colorgeneralAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				colorgeneralAux=new  ColorGeneral();
				
				colorgeneralAux.setIsNew(false);
				colorgeneralAux.setIsChanged(false);
				
				colorgeneralAux.setIsDeleted(true);
				
				colorgeneralAux.setId(this.colorgeneral.getId());	
				colorgeneralAux.setVersionRow(this.colorgeneral.getVersionRow());	
				colorgeneralAux.setnombre(this.colorgeneral.getnombre());	
				
				if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.colorgeneralAux.getId()>=0) {	
						this.colorgeneralsEliminados.add(colorgeneralAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(colorgeneralAux,colorgeneralLogic.getColorGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorgeneralAux,colorgenerals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.colorgeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.colorgeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralLogic.saveColorGenerals();//WithConnection
						//colorgeneralLogic.getSetVersionRowColorGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.getColorGenerals().addAll(this.colorgeneralsEliminados);
					
					colorgeneralLogic.saveColorGenerals();//WithConnection
					//colorgeneralLogic.getSetVersionRowColorGenerals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.colorgeneralsEliminados= new ArrayList<ColorGeneral>();		
			}
			
			if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Color GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.colorgeneral=colorgeneralAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessColorGeneral();
      	}
		
	}	
	
	public void actualizarRelaciones(ColorGeneral colorgeneralLocal) throws Exception {
		
		if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ColorGeneral colorgeneralLocal) throws Exception {	
		if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarColorGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = colorgeneralValidator.getInvalidValues(this.colorgeneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ColorGeneral colorgeneral,List<ColorGeneral> colorgenerals) throws Exception {
		try	{		
			ColorGeneralConstantesFunciones.actualizarLista(colorgeneral,colorgenerals,this.colorgeneralSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ColorGeneral colorgeneral,List<ColorGeneral> colorgenerals) throws Exception {
		try	{			
			ColorGeneralConstantesFunciones.actualizarSelectedLista(colorgeneral,colorgenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ColorGeneral> colorgeneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				colorgeneralsLocal=this.colorgeneralLogic.getColorGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				colorgeneralsLocal=this.colorgenerals;
			}
			//ARCHITECTURE
		
			for(ColorGeneral colorgeneralLocal:colorgeneralsLocal) {
				if(this.permiteMantenimiento(colorgeneralLocal) && colorgeneralLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+ColorGeneralConstantesFunciones.getColorGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ColorGeneralConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorGeneral.jLabelnombreColorGeneral,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormColorGeneral.jLabelnombreColorGeneral,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoColorGeneral--;	
		
		
		this.colorgeneralAux=new ColorGeneral();
		
		this.colorgeneralAux.setId(this.iIdNuevoColorGeneral);
		this.colorgeneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.colorgeneralLogic.getColorGenerals().add(this.colorgeneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.colorgenerals.add(this.colorgeneralAux);
		}
		//ARCHITECTURE
		
		this.colorgeneral=this.colorgeneralAux;
		
		if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioColorGeneral(this.colorgeneral);
			this.setVariablesObjetoActualToFormularioForeignKeyColorGeneral(this.colorgeneral);
		}
				
		//this.setDefaultControlesColorGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyColorGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyColorGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyColorGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualColorGeneral(this.colorgeneralBean,this.colorgeneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ColorGeneralConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
			classes=ColorGeneralConstantesFunciones.getClassesRelationshipsOfColorGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.colorgeneralReturnGeneral=colorgeneralLogic.procesarEventosColorGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.colorgeneralLogic.getColorGenerals(),this.colorgeneral,this.colorgeneralParameterGeneral,this.isEsNuevoColorGeneral,classes);//this.colorgeneralLogic.getColorGeneral()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanColorGeneral(this.colorgeneralReturnGeneral,this.colorgeneralBean,false);
		
		if(this.colorgeneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral());
		}
		
		if(this.colorgeneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral(),classes);//this.colorgeneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyColorGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyColorGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingColorGeneral(false);
						
			if(colorgeneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualColorGeneral();
			}
			
			this.actualizarVisualTableDatosColorGeneral();
			
			this.jTableDatosColorGeneral.setRowSelectionInterval(this.getIndiceNuevoColorGeneral(), this.getIndiceNuevoColorGeneral());
			
			this.seleccionarFilaTablaColorGeneralActual();
						
			this.actualizarEstadoCeldasBotonesColorGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesColorGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setEnabled(isHabilitar && this.colorgeneralConstantesFunciones.activarnombreColorGeneral);	
		
	};
	
	public void setDefaultControlesColorGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoColorGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.colorgeneralSessionBean.setConGuardarRelaciones(true);			
			this.colorgeneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.setVisible(true);
			
					
		} else {
			//this.colorgeneralSessionBean.setConGuardarRelaciones(false);			
			this.colorgeneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoColorGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
				if(colorgeneralAux.getId().equals(this.iIdNuevoColorGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorGeneral colorgeneralAux:this.colorgenerals) {
				if(colorgeneralAux.getId().equals(this.iIdNuevoColorGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualColorGeneral(ColorGeneral colorgeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
				if(colorgeneralAux.getId().equals(colorgeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorGeneral colorgeneralAux:this.colorgenerals) {
				if(colorgeneralAux.getId().equals(colorgeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalColorGeneral(ColorGeneral colorgeneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
				if(colorgeneralAux.getColorGeneralOriginal().getId().equals(colorgeneralOriginal.getId())) {
					existe=true;
					colorgeneralOriginal.setId(colorgeneralAux.getId());
					colorgeneralOriginal.setVersionRow(colorgeneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorGeneral colorgeneralAux:this.colorgenerals) {
				if(colorgeneralAux.getColorGeneralOriginal().getId().equals(colorgeneralOriginal.getId())) {
					existe=true;
					colorgeneralOriginal.setId(colorgeneralAux.getId());
					colorgeneralOriginal.setVersionRow(colorgeneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosColorGeneral(Boolean esParaCancelar) throws Exception {
		colorgeneralsAux=new ArrayList<ColorGeneral>();
		colorgeneralAux=new ColorGeneral();
		
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
					if(colorgeneralAux.getId()<0) {
						colorgeneralsAux.add(colorgeneralAux);
					}		
				}
				this.iIdNuevoColorGeneral=0L;
				this.colorgeneralLogic.getColorGenerals().removeAll(colorgeneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorGeneral colorgeneralAux:this.colorgenerals) {
					if(colorgeneralAux.getId()<0) {
						colorgeneralsAux.add(colorgeneralAux);
					}		
				}
				this.iIdNuevoColorGeneral=0L;
				this.colorgenerals.removeAll(colorgeneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoColorGeneral 
					&& this.colorgeneralLogic.getColorGenerals().size()>0
					) {
					colorgeneralAux=this.colorgeneralLogic.getColorGenerals().get(this.colorgeneralLogic.getColorGenerals().size() - 1);
				
					if(colorgeneralAux.getId()<0) {
						this.colorgeneralLogic.getColorGenerals().remove(colorgeneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoColorGeneral && this.colorgenerals.size()>0) {
					colorgeneralAux=this.colorgenerals.get(this.colorgenerals.size() - 1);
				
					if(colorgeneralAux.getId()<0) {
						this.colorgenerals.remove(colorgeneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoColorGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(colorgeneral.getId()<0) {
				this.colorgeneralLogic.getColorGenerals().remove(this.colorgeneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(colorgeneral.getId()<0) {
				this.colorgenerals.remove(this.colorgeneral);
			}
		}			
	}
	
	public void setEstadosInicialesColorGeneral(List<ColorGeneral> colorgeneralsAux) throws Exception {
		ColorGeneralConstantesFunciones.setEstadosInicialesColorGeneral(colorgeneralsAux);
	}
	
	public void setEstadosInicialesColorGeneral(ColorGeneral colorgeneralAux) throws Exception {
		ColorGeneralConstantesFunciones.setEstadosInicialesColorGeneral(colorgeneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarColorGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesColorGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarColorGeneralActual()) {
				if(!this.isEsNuevoColorGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesColorGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoColorGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarColorGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Color ?", "MANTENIMIENTO DE Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesColorGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ColorGeneral colorgeneral) throws Exception {
		ColorGeneralConstantesFunciones.seleccionarAsignar(this.colorgeneral,colorgeneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarColorGeneral=this.isPermisoActualizarOriginalColorGeneral;
			
			
			this.seleccionarAsignar(colorgeneral);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ColorGeneralConstantesFunciones.quitarEspaciosColorGeneral(this.colorgeneral,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesColorGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.colorgeneralSessionBean.setsFuncionBusquedaRapida(this.colorgeneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoColorGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosColorGeneral(esParaCancelar);				
				this.cancelarNuevoColorGeneral(esParaCancelar);								
			}
			
			this.colorgeneral=new ColorGeneral();
			
			this.inicializarColorGeneral();
			
			this.actualizarEstadoCeldasBotonesColorGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarColorGeneral() throws Exception {
		try {
			ColorGeneralConstantesFunciones.inicializarColorGeneral(this.colorgeneral);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.colorgeneralLogic.getColorGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteColorGenerals(String sAccionBusqueda,List<ColorGeneral> colorgeneralsParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="ColorGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ColorGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ColorGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ColorGeneral"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Colores");		
		parameters.put("busquedapor", ColorGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceColorGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ColorGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ColorGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceColorGeneral=new JRBeanArrayDataSource(ColorGeneralJInternalFrame.TraerColorGeneralBeans(colorgeneralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceColorGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ColorGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ColorGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ColorGeneralBean.TraerColorGeneralBeans(colorgeneralsParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteColorGenerals(sAccionBusqueda,sTipoArchivoReporte,colorgeneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalColorGenerals(sAccionBusqueda,sTipoArchivoReporte,colorgeneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoColorGeneralActionPerformed(null);
					//this.generarExcelReporteColorGenerals(sAccionBusqueda,sTipoArchivoReporte,colorgeneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalColorGenerals(sAccionBusqueda,sTipoArchivoReporte,colorgeneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesColorGenerals(sAccionBusqueda,sTipoArchivoReporte,colorgeneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesColorGenerals(sAccionBusqueda,sTipoArchivoReporte,colorgeneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteColorGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ColorGeneral> colorgeneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ColorGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderColorGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ColorGeneral colorgeneral : colorgeneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ColorGeneralConstantesFunciones.generarExcelReporteDataColorGeneral("NORMAL",row,workbook,colorgeneral,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderColorGeneral(String sTipo,Row row,Workbook workbook) {
		
		ColorGeneralConstantesFunciones.generarExcelReporteHeaderColorGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalColorGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ColorGeneral> colorgeneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ColorGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ColorGeneral colorgeneral : colorgeneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ColorGeneralConstantesFunciones.getColorGeneralDescripcion(colorgeneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ColorGeneralConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ColorGeneralConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(colorgeneral.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesColorGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ColorGeneral> colorgeneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ColorGeneral> colorgeneralsRespaldo=null;
		
		classes=ColorGeneralConstantesFunciones.getClassesRelationshipsOfColorGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.colorgeneralLogic.setDatosCliente(this.datosCliente);
		this.colorgeneralLogic.setDatosDeep(this.datosDeep);
		this.colorgeneralLogic.setIsConDeep(true);
		
		colorgeneralsRespaldo=this.colorgeneralLogic.getColorGenerals();
		
		this.colorgeneralLogic.setColorGenerals(colorgeneralsParaReportes);	
		this.colorgeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		colorgeneralsParaReportes=this.colorgeneralLogic.getColorGenerals();
		this.colorgeneralLogic.setColorGenerals(colorgeneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ColorGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderColorGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ColorGeneral colorgeneral : colorgeneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderColorGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ColorGeneralConstantesFunciones.generarExcelReporteDataColorGeneral("NORMAL",row,workbook,colorgeneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ColorGeneralConstantesFunciones.getColorGeneralDescripcion(colorgeneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoColorGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessColorGeneral() throws Exception {		
		this.startProcessColorGeneral(true);
	}
	
	public void startProcessColorGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasColorGeneral ,this.jPanelParametrosReportesColorGeneral, this.jScrollPanelDatosColorGeneral,this.jPanelPaginacionColorGeneral, this.jScrollPanelDatosEdicionColorGeneral, this.jPanelAccionesColorGeneral,this.jPanelAccionesFormularioColorGeneral,this.jmenuBarColorGeneral,this.jmenuBarDetalleColorGeneral,this.jTtoolBarColorGeneral,this.jTtoolBarDetalleColorGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasColorGeneral=this.jTabbedPaneBusquedasColorGeneral; 
		
		final JPanel jPanelParametrosReportesColorGeneral=this.jPanelParametrosReportesColorGeneral;
		//final JScrollPane jScrollPanelDatosColorGeneral=this.jScrollPanelDatosColorGeneral;
		final JTable jTableDatosColorGeneral=this.jTableDatosColorGeneral;		
		final JPanel jPanelPaginacionColorGeneral=this.jPanelPaginacionColorGeneral;
		//final JScrollPane jScrollPanelDatosEdicionColorGeneral=this.jScrollPanelDatosEdicionColorGeneral;
		final JPanel jPanelAccionesColorGeneral=this.jPanelAccionesColorGeneral;
		
		JPanel jPanelCamposAuxiliarColorGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarColorGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			jPanelCamposAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jPanelCamposColorGeneral;
			jPanelAccionesFormularioAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jPanelAccionesFormularioColorGeneral;
		}
		
		final JPanel jPanelCamposColorGeneral=jPanelCamposAuxiliarColorGeneral;
		final JPanel jPanelAccionesFormularioColorGeneral=jPanelAccionesFormularioAuxiliarColorGeneral;
		
		
		final JMenuBar jmenuBarColorGeneral=this.jmenuBarColorGeneral;
		final JToolBar jTtoolBarColorGeneral=this.jTtoolBarColorGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarColorGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarColorGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			jmenuBarDetalleAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jmenuBarDetalleColorGeneral;
			jTtoolBarDetalleAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jTtoolBarDetalleColorGeneral;
		}
		
		final JMenuBar jmenuBarDetalleColorGeneral=jmenuBarDetalleAuxiliarColorGeneral;
		final JToolBar jTtoolBarDetalleColorGeneral=jTtoolBarDetalleAuxiliarColorGeneral;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasColorGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesColorGeneral;
			processRunnable.jTableDatos=jTableDatosColorGeneral;
			processRunnable.jPanelCampos=jPanelCamposColorGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionColorGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesColorGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioColorGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarColorGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleColorGeneral;
			processRunnable.jTtoolBar=jTtoolBarColorGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleColorGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasColorGeneral ,jPanelParametrosReportesColorGeneral,jTableDatosColorGeneral, /*jScrollPanelDatosColorGeneral,*/jPanelCamposColorGeneral,jPanelPaginacionColorGeneral, /*jScrollPanelDatosEdicionColorGeneral,*/ jPanelAccionesColorGeneral,jPanelAccionesFormularioColorGeneral,jmenuBarColorGeneral,jmenuBarDetalleColorGeneral,jTtoolBarColorGeneral,jTtoolBarDetalleColorGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasColorGeneral ,jPanelParametrosReportesColorGeneral, jScrollPanelDatosColorGeneral,jPanelPaginacionColorGeneral, jScrollPanelDatosEdicionColorGeneral, jPanelAccionesColorGeneral,jPanelAccionesFormularioColorGeneral,jmenuBarColorGeneral,jmenuBarDetalleColorGeneral,jTtoolBarColorGeneral,jTtoolBarDetalleColorGeneral);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessColorGeneral() {// throws Exception 
		this.finishProcessColorGeneral(true);
	}
	
	public void finishProcessColorGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasColorGeneral ,this.jPanelParametrosReportesColorGeneral, this.jScrollPanelDatosColorGeneral,this.jPanelPaginacionColorGeneral, this.jScrollPanelDatosEdicionColorGeneral, this.jPanelAccionesColorGeneral,this.jPanelAccionesFormularioColorGeneral,this.jmenuBarColorGeneral,this.jmenuBarDetalleColorGeneral,this.jTtoolBarColorGeneral,this.jTtoolBarDetalleColorGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasColorGeneral=this.jTabbedPaneBusquedasColorGeneral; 
		
		final JPanel jPanelParametrosReportesColorGeneral=this.jPanelParametrosReportesColorGeneral;
		//final JScrollPane jScrollPanelDatosColorGeneral=this.jScrollPanelDatosColorGeneral;
		final JTable jTableDatosColorGeneral=this.jTableDatosColorGeneral;		
		final JPanel jPanelPaginacionColorGeneral=this.jPanelPaginacionColorGeneral;
		//final JScrollPane jScrollPanelDatosEdicionColorGeneral=this.jScrollPanelDatosEdicionColorGeneral;
		final JPanel jPanelAccionesColorGeneral=this.jPanelAccionesColorGeneral;
		
		JPanel jPanelCamposAuxiliarColorGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarColorGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			jPanelCamposAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jPanelCamposColorGeneral;
			jPanelAccionesFormularioAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jPanelAccionesFormularioColorGeneral;
		}
		
		final JPanel jPanelCamposColorGeneral=jPanelCamposAuxiliarColorGeneral;
		final JPanel jPanelAccionesFormularioColorGeneral=jPanelAccionesFormularioAuxiliarColorGeneral;
		
		
		final JMenuBar jmenuBarColorGeneral=this.jmenuBarColorGeneral;		
		final JToolBar jTtoolBarColorGeneral=this.jTtoolBarColorGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarColorGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarColorGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			jmenuBarDetalleAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jmenuBarDetalleColorGeneral;
			jTtoolBarDetalleAuxiliarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jTtoolBarDetalleColorGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleColorGeneral=jmenuBarDetalleAuxiliarColorGeneral;
		final JToolBar jTtoolBarDetalleColorGeneral=jTtoolBarDetalleAuxiliarColorGeneral;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasColorGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesColorGeneral;
			processRunnable.jTableDatos=jTableDatosColorGeneral;
			processRunnable.jPanelCampos=jPanelCamposColorGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionColorGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesColorGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioColorGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarColorGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleColorGeneral;
			processRunnable.jTtoolBar=jTtoolBarColorGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleColorGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasColorGeneral ,jPanelParametrosReportesColorGeneral, jTableDatosColorGeneral,/*jScrollPanelDatosColorGeneral,*/jPanelCamposColorGeneral,jPanelPaginacionColorGeneral, /*jScrollPanelDatosEdicionColorGeneral,*/ jPanelAccionesColorGeneral,jPanelAccionesFormularioColorGeneral,jmenuBarColorGeneral,jmenuBarDetalleColorGeneral,jTtoolBarColorGeneral,jTtoolBarDetalleColorGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesColorGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarColorGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuColorGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarColorGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarColorGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleColorGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuColorGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarColorGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleColorGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.colorgeneralConstantesFunciones.getsFinalQueryColorGeneral();
		String  finalQueryPaginacionTodos=this.colorgeneralConstantesFunciones.getsFinalQueryColorGeneral();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesNoColorGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ColorGeneralConstantesFunciones.getArrayColumnasGlobalesColorGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ColorGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.colorgeneralsEliminados= new ArrayList<ColorGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessColorGeneral();
		
				///*ColorGeneralSessionBean*/this.colorgeneralSessionBean=new ColorGeneralSessionBean();
			
			if(this.colorgeneralSessionBean==null) {
				this.colorgeneralSessionBean=new ColorGeneralSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=ColorGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ColorGeneralConstantesFunciones.getClassesForeignKeysOfColorGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/colorgeneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			colorgeneralsAux= new ArrayList<ColorGeneral>();
			
				
			colorgeneralLogic.setDatosCliente(this.datosCliente);
			colorgeneralLogic.setDatosDeep(this.datosDeep);
			colorgeneralLogic.setIsConDeep(true);
			
			
			colorgeneralLogic.getColorGeneralDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					colorgeneralLogic.getTodosColorGenerals(finalQueryGlobal,pagination);
					
					//colorgeneralLogic.getTodosColorGeneralsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(colorgeneralLogic.getColorGenerals()==null|| colorgeneralLogic.getColorGenerals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							colorgeneralsAux= new ArrayList<ColorGeneral>();
							colorgeneralsAux.addAll(colorgeneralLogic.getColorGenerals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorgeneralsAux= new ArrayList<ColorGeneral>();
							colorgeneralsAux.addAll(colorgenerals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							colorgeneralLogic.getTodosColorGenerals(finalQueryGlobal+"",this.pagination);												
							
							//colorgeneralLogic.getTodosColorGeneralsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteColorGenerals("Todos",colorgeneralLogic.getColorGenerals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							colorgeneralLogic.setColorGenerals(new ArrayList<ColorGeneral>());					
							colorgeneralLogic.getColorGenerals().addAll(colorgeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorgenerals=new ArrayList<ColorGeneral>();
							colorgenerals.addAll(colorgeneralsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idColorGeneral=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idColorGeneral=this.idActual;
				
				} else if(this.idColorGeneralActual!=null && this.idColorGeneralActual!=0L) {
					idColorGeneral=idColorGeneralActual;
				}
				
					
				this.sDetalleReporte=ColorGeneralConstantesFunciones.getDetalleIndicePorId(idColorGeneral);
				
				this.colorgenerals=new ArrayList<ColorGeneral>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					colorgeneralLogic.getEntity(idColorGeneral);
					
					//colorgeneralLogic.getEntityWithConnection(idColorGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLogic.setColorGenerals(new ArrayList<ColorGeneral>());
					colorgeneralLogic.getColorGenerals().add(colorgeneralLogic.getColorGeneral());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorgenerals=new ArrayList<ColorGeneral>();
					this.colorgenerals.add(colorgeneral);
				}
				
				if(colorgeneralLogic.getColorGeneral()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ColorGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					colorgeneralLogic.getColorGeneralsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=colorgeneralLogic.getColorGenerals()==null||colorgeneralLogic.getColorGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=colorgenerals==null|| colorgenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralsAux=new ArrayList<ColorGeneral>();
						colorgeneralsAux.addAll(colorgeneralLogic.getColorGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorgeneralsAux=new ArrayList<ColorGeneral>();
							colorgeneralsAux.addAll(colorgenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							colorgeneralLogic.getColorGeneralsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ColorGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ColorGeneralConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteColorGenerals("BusquedaPorNombre",colorgeneralLogic.getColorGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteColorGenerals("BusquedaPorNombre",colorgenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralLogic.setColorGenerals(new ArrayList<ColorGeneral>());
						colorgeneralLogic.getColorGenerals().addAll(colorgeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorgenerals=new ArrayList<ColorGeneral>();
							colorgenerals.addAll(colorgeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesColorGeneral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessColorGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=colorgeneralLogic.getColorGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=colorgenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=colorgeneralLogic.getColorGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=colorgenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ColorGeneral colorgeneral) {
		Boolean permite=true;
		
		if(this.colorgeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ColorGeneralConstantesFunciones.getOrderByListaColorGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ColorGeneralConstantesFunciones.getOrderByListaColorGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorGeneral colorgeneral:colorgeneralLogic.getColorGenerals()) {
				if(colorgeneral.getsType().equals(Constantes2.S_TOTALES)) {
					colorgeneralTotales=colorgeneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorGeneral colorgeneral:this.colorgenerals) {
				if(colorgeneral.getsType().equals(Constantes2.S_TOTALES)) {
					colorgeneralTotales=colorgeneral;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.colorgeneralAux=new ColorGeneral();
			this.colorgeneralAux.setsType(Constantes2.S_TOTALES);
			this.colorgeneralAux.setIsNew(false);
			this.colorgeneralAux.setIsChanged(false);
			this.colorgeneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ColorGeneralConstantesFunciones.TotalizarValoresFilaColorGeneral(this.colorgeneralLogic.getColorGenerals(),this.colorgeneralAux);
				
				this.colorgeneralLogic.getColorGenerals().add(this.colorgeneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ColorGeneralConstantesFunciones.TotalizarValoresFilaColorGeneral(this.colorgenerals,this.colorgeneralAux);
				
				this.colorgenerals.add(this.colorgeneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		colorgeneralTotales=new ColorGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.colorgeneralLogic.getColorGenerals().remove(colorgeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.colorgenerals.remove(colorgeneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		colorgeneralTotales=new ColorGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ColorGeneral colorgeneral:colorgeneralLogic.getColorGenerals()) {
				if(colorgeneral.getsType().equals(Constantes2.S_TOTALES)) {
					colorgeneralTotales=colorgeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ColorGeneralConstantesFunciones.TotalizarValoresFilaColorGeneral(this.colorgeneralLogic.getColorGenerals(),colorgeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ColorGeneral colorgeneral:this.colorgenerals) {
				if(colorgeneral.getsType().equals(Constantes2.S_TOTALES)) {
					colorgeneralTotales=colorgeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ColorGeneralConstantesFunciones.TotalizarValoresFilaColorGeneral(this.colorgenerals,colorgeneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getColorGeneralsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getColorGeneralsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLogic.getColorGeneralsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosColorGeneral() {
		this.isPermisoTodoColorGeneral=false;
		this.isPermisoNuevoColorGeneral=false;
		this.isPermisoActualizarColorGeneral=false;
		this.isPermisoActualizarOriginalColorGeneral=false;
		this.isPermisoEliminarColorGeneral=false;
		this.isPermisoGuardarCambiosColorGeneral=false;
		this.isPermisoConsultaColorGeneral=false;
		this.isPermisoBusquedaColorGeneral=false;
		this.isPermisoReporteColorGeneral=false;		
		this.isPermisoOrdenColorGeneral=false;		
		this.isPermisoPaginacionMedioColorGeneral=false;		
		this.isPermisoPaginacionAltoColorGeneral=false;
		this.isPermisoPaginacionTodoColorGeneral=false;
		this.isPermisoCopiarColorGeneral=false;		
		this.isPermisoVerFormColorGeneral=false;		
		this.isPermisoDuplicarColorGeneral=false;		
		this.isPermisoOrdenColorGeneral=false;		
	}
	
	public void setPermisosUsuarioColorGeneral(Boolean isPermiso) {
		this.isPermisoTodoColorGeneral=isPermiso;
		this.isPermisoNuevoColorGeneral=isPermiso;
		this.isPermisoActualizarColorGeneral=isPermiso;
		this.isPermisoActualizarOriginalColorGeneral=isPermiso;
		this.isPermisoEliminarColorGeneral=isPermiso;
		this.isPermisoGuardarCambiosColorGeneral=isPermiso;
		this.isPermisoConsultaColorGeneral=isPermiso;
		this.isPermisoBusquedaColorGeneral=isPermiso;
		this.isPermisoReporteColorGeneral=isPermiso;
		this.isPermisoOrdenColorGeneral=isPermiso;		
		this.isPermisoPaginacionMedioColorGeneral=isPermiso;		
		this.isPermisoPaginacionAltoColorGeneral=isPermiso;		
		this.isPermisoPaginacionTodoColorGeneral=isPermiso;		
		this.isPermisoCopiarColorGeneral=isPermiso;		
		this.isPermisoVerFormColorGeneral=isPermiso;		
		this.isPermisoDuplicarColorGeneral=isPermiso;
		this.isPermisoOrdenColorGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioColorGeneral(Boolean isPermiso) {
		//this.isPermisoTodoColorGeneral=isPermiso;
		this.isPermisoNuevoColorGeneral=isPermiso;
		this.isPermisoActualizarColorGeneral=isPermiso;
		this.isPermisoActualizarOriginalColorGeneral=isPermiso;
		this.isPermisoEliminarColorGeneral=isPermiso;
		this.isPermisoGuardarCambiosColorGeneral=isPermiso;
		//this.isPermisoConsultaColorGeneral=isPermiso;
		//this.isPermisoBusquedaColorGeneral=isPermiso;
		//this.isPermisoReporteColorGeneral=isPermiso;
		//this.isPermisoOrdenColorGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioColorGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoColorGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoColorGeneral=isPermiso;		
		//this.isPermisoCopiarColorGeneral=isPermiso;		
		//this.isPermisoDuplicarColorGeneral=isPermiso;
		//this.isPermisoOrdenColorGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioColorGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ColorGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebColorGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioColorGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioColorGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionColorGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioColorGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioColorGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ColorGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ColorGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoColorGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarColorGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalColorGeneral=this.isPermisoActualizarColorGeneral;
			this.isPermisoEliminarColorGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosColorGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaColorGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaColorGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoColorGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteColorGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenColorGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioColorGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoColorGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoColorGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarColorGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormColorGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarColorGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenColorGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosColorGeneral.setToolTipText(this.jTableDatosColorGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioColorGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioColorGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ColorGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(ColorGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioColorGeneral() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyColorGeneralListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyColorGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ColorGeneralJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyColorGeneralListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyColorGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyColorGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyColorGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyColorGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyColorGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyColorGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyColorGeneral(ColorGeneral colorgeneral)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyColorGeneral(ColorGeneral colorgeneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyColorGeneral()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyColorGeneral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyColorGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyColorGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroColorGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyColorGeneral()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyColorGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyColorGeneral()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ColorGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ColorGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ColorGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.colorgeneralSessionBean=new ColorGeneralSessionBean(); 
		this.colorgeneralConstantesFunciones=new ColorGeneralConstantesFunciones(); 
		this.colorgeneralBean=new ColorGeneral();//(this.colorgeneralConstantesFunciones); 		
		this.colorgeneralReturnGeneral=new ColorGeneralParameterReturnGeneral(); 
		
		this.colorgeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.colorgeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ColorGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ColorGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ColorGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessColorGeneral(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.colorgeneralConstantesFunciones=new ColorGeneralConstantesFunciones(); 
			this.colorgeneralBean=new ColorGeneral();//this.colorgeneralConstantesFunciones); 			
			this.colorgeneralReturnGeneral=new ColorGeneralParameterReturnGeneral(); 
		
			ColorGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Color Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.colorgeneral=new ColorGeneral();
			this.colorgenerals = new ArrayList<ColorGeneral>();
			this.colorgeneralsAux = new ArrayList<ColorGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic=new ColorGeneralLogic();
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.colorgeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.colorgeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormColorGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoColorGeneral);	
					}
					
					if(this.jInternalFrameImportacionColorGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionColorGeneral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByColorGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByColorGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormColorGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormColorGeneral);
				this.jInternalFrameDetalleFormColorGeneral.setVisible(false);
				this.jInternalFrameDetalleFormColorGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoColorGeneral);
					this.jInternalFrameReporteDinamicoColorGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoColorGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionColorGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionColorGeneral);
					this.jInternalFrameImportacionColorGeneral.setVisible(false);
					this.jInternalFrameImportacionColorGeneral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByColorGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByColorGeneral);
					this.jInternalFrameOrderByColorGeneral.setVisible(false);
					this.jInternalFrameOrderByColorGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idColorGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ColorGeneralConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.colorgeneralReturnGeneral=new ColorGeneralParameterReturnGeneral();
			
			this.colorgeneralParameterGeneral=new ColorGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.colorgeneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(ColorGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ColorGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.colorgeneralSessionBean.getEsGuardarRelacionado(),this.colorgeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ColorGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.colorgeneralSessionBean.getEsGuardarRelacionado(),this.colorgeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaDuplicarColorGeneral=true;
			this.isVisibilidadCeldaCopiarColorGeneral=true;
			this.isVisibilidadCeldaVerFormColorGeneral=true;
			this.isVisibilidadCeldaOrdenColorGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
			this.isVisibilidadCeldaModificarColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=false;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=false;
			this.isVisibilidadCeldaGuardarColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesColorGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosColorGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioColorGeneral(false);
			
			this.setPermisosUsuarioColorGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.colorgeneralSessionBean.getEsGuardarRelacionado() 
				|| (this.colorgeneralSessionBean.getEsGuardarRelacionado() && this.colorgeneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioColorGeneralClasesRelacionadas();
			}
			
			if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioColorGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosColorGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualColorGeneral();
			}
			
			if(!this.isPermisoBusquedaColorGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasColorGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioColorGeneral,this.isPermisoPaginacionMedioColorGeneral,this.isPermisoPaginacionTodoColorGeneral);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ColorGeneralConstantesFunciones.getTiposSeleccionarColorGeneral());
				
				this.tiposColumnasSelect=ColorGeneralConstantesFunciones.getTiposSeleccionarColorGeneral(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioColorGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioColorGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioColorGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesColorGeneral() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				colorgeneralImplementable= (ColorGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ColorGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				colorgeneralImplementableHome= (ColorGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ColorGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.colorgenerals= new ArrayList<ColorGeneral>();
			this.colorgeneralsEliminados= new ArrayList<ColorGeneral>();
						
			this.isEsNuevoColorGeneral=false;
			this.esParaAccionDesdeFormularioColorGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyColorGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroColorGeneral();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ColorGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesColorGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingColorGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioColorGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioColorGeneral();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasColorGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasColorGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasColorGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessColorGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ColorGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectColorGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesColorGeneral")) {
				iIndex=this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessColorGeneral();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyColorGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyColorGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyColorGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyColorGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyColorGeneral();
		
		this.cargarCombosFrameForeignKeyColorGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyColorGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyColorGeneral();
		}
	}
	
	
	
	public void jButtonNuevoColorGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			
			if(jTableDatosColorGeneral.getRowCount()>=1) {
				jTableDatosColorGeneral.removeRowSelectionInterval(0, jTableDatosColorGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoColorGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoColorGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesColorGeneral(true);			
			//this.colorgeneral=new ColorGeneral();
			//this.colorgeneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesColorGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorGeneral() ;
			
			if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleColorGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.colorgeneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);				
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ColorGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarColorGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosColorGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosColorGeneral.getSelectedRows().length;			
			}
			
			colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoColorGeneral--;			
				//ColorGeneral colorgeneralAux= new ColorGeneral();			
				//colorgeneralAux.setId(this.iIdNuevoColorGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ColorGeneral colorgeneralOrigen=new ColorGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ColorGeneral colorgeneralOrigen : colorgeneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							colorgeneralOrigen =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							colorgeneralOrigen =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaColorGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.colorgeneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosColorGeneral(colorgeneralOrigen,this.colorgeneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.colorgeneralLogic.getColorGenerals().add(this.colorgeneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.colorgenerals.add(this.colorgeneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaColorGeneral(false);
				
				this.jTableDatosColorGeneral.setRowSelectionInterval(this.getIndiceNuevoColorGeneral(), this.getIndiceNuevoColorGeneral());
				
				int iLastRow =  this.jTableDatosColorGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosColorGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosColorGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaColorGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();									
		
			ColorGeneral colorgeneralOrigen=new ColorGeneral();
			ColorGeneral colorgeneralDestino=new ColorGeneral();
				
			colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosColorGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || colorgeneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosColorGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralOrigen =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						colorgeneralOrigen =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						colorgeneralDestino =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						colorgeneralDestino =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				colorgeneralOrigen =colorgeneralsSeleccionados.get(0);
				colorgeneralDestino =colorgeneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosColorGeneral(colorgeneralOrigen,colorgeneralDestino,true,false);
				
				colorgeneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(colorgeneralDestino,colorgeneralLogic.getColorGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(colorgeneralDestino,colorgenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaColorGeneral(false);
				
				//this.jTableDatosColorGeneral.setRowSelectionInterval(this.getIndiceNuevoColorGeneral(), this.getIndiceNuevoColorGeneral());
				
				int iLastRow =  this.jTableDatosColorGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosColorGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosColorGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaColorGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormColorGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesColorGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasColorGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesColorGeneral.setVisible(!isVisible);
			this.jPanelPaginacionColorGeneral.setVisible(!isVisible);
			this.jPanelAccionesColorGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameColorGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoColorGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionColorGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByColorGeneral();
			
			this.abrirFrameOrderByColorGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByColorGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleColorGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormColorGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormColorGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormColorGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormColorGeneral.setSize(this.jInternalFrameDetalleFormColorGeneral.iWidthFormulario,this.jInternalFrameDetalleFormColorGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormColorGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormColorGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormColorGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormColorGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormColorGeneral.jContentPaneDetalleColorGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormColorGeneral.jContentPaneDetalleColorGeneral.getWidth(),ColorGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormColorGeneral.jContentPaneDetalleColorGeneral.getWidth(),ColorGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormColorGeneral.jContentPaneDetalleColorGeneral.getWidth(),ColorGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormColorGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormColorGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByColorGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByColorGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByColorGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorGeneral,false,this);
				} else {
					this.jInternalFrameOrderByColorGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByColorGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByColorGeneral);
				this.jInternalFrameOrderByColorGeneral.setVisible(false);
				this.jInternalFrameOrderByColorGeneral.setSelected(false);
				
				this.jInternalFrameOrderByColorGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByColorGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByColorGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionColorGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionColorGeneral==null) {
				
				this.jInternalFrameImportacionColorGeneral=new ImportacionJInternalFrame(ColorGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionColorGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionColorGeneral);
				this.jInternalFrameImportacionColorGeneral.setVisible(false);
				this.jInternalFrameImportacionColorGeneral.setSelected(false);


				this.jInternalFrameImportacionColorGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionColorGeneral"));
				this.jInternalFrameImportacionColorGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionColorGeneral"));
				this.jInternalFrameImportacionColorGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionColorGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoColorGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoColorGeneral==null) {
				this.jInternalFrameReporteDinamicoColorGeneral=new ReporteDinamicoJInternalFrame(ColorGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoColorGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoColorGeneral);
				this.jInternalFrameReporteDinamicoColorGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoColorGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoColorGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoColorGeneral"));
				this.jInternalFrameReporteDinamicoColorGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoColorGeneral"));
				this.jInternalFrameReporteDinamicoColorGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoColorGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualColorGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleColorGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormColorGeneral);
			
	       	this.jInternalFrameDetalleFormColorGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormColorGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormColorGeneral.dispose();
			//this.jInternalFrameDetalleFormColorGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoColorGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoColorGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoColorGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionColorGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionColorGeneral.setVisible(true);
	        this.jInternalFrameImportacionColorGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByColorGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByColorGeneral.setVisible(true);
	        this.jInternalFrameOrderByColorGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByColorGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByColorGeneral.setVisible(false);
	        this.jInternalFrameOrderByColorGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoColorGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoColorGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoColorGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionColorGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionColorGeneral.setVisible(false);
	        this.jInternalFrameImportacionColorGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarColorGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarColorGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesColorGeneral(true);
			//this.isEsNuevoColorGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesColorGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesColorGeneral(false) ;
			
			if(colorgeneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleColorGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaColorGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarColorGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesColorGeneral(true);
			//this.isEsNuevoColorGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.colorgeneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesColorGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesColorGeneral(false) ;
			
			if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleColorGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesColorGeneral(false);
			
			//if(!this.isEsNuevoColorGeneral) {								
				int intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
				
			}
			
			if(this.permiteMantenimiento(this.colorgeneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoColorGeneral=true;
					this.inicializarActualizarBindingTablaColorGeneral(false);
					this.isEsNuevoColorGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoColorGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoColorGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesColorGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualColorGeneral(false);
				
				this.habilitarDeshabilitarControlesColorGeneral(false);
			
												
				
				if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleColorGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoColorGeneralActionPerformed(evt,colorgeneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualColorGeneral(this.colorgeneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosColorGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,colorgeneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.colorgeneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarColorGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				this.colorgeneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				this.colorgeneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.colorgeneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ColorGeneralModel) this.jTableDatosColorGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoColorGeneral=true;
				this.inicializarActualizarBindingTablaColorGeneral(false);
				this.isEsNuevoColorGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesColorGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualColorGeneral(false);
				
				this.habilitarDeshabilitarControlesColorGeneral(false);
				
				
				
				if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleColorGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarColorGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosColorGeneral.getRowCount()>=1) {
				jTableDatosColorGeneral.removeRowSelectionInterval(0, jTableDatosColorGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesColorGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaColorGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesColorGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualColorGeneral(false) ;
			
			this.isEsNuevoColorGeneral=false;
			
			if(ColorGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleColorGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosColorGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingColorGeneral(false);
				
				//SI ES MANUAL
				if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualColorGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosColorGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoColorGeneral--;			
			//ColorGeneral colorgeneralAux= new ColorGeneral();			
			//colorgeneralAux.setId(this.iIdNuevoColorGeneral);
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaColorGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
			
			this.colorgeneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.colorgeneralLogic.getColorGenerals().add(this.colorgeneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.colorgenerals.add(this.colorgeneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaColorGeneral(false);
			
			this.jTableDatosColorGeneral.setRowSelectionInterval(this.getIndiceNuevoColorGeneral(), this.getIndiceNuevoColorGeneral());
			
			int iLastRow =  this.jTableDatosColorGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosColorGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosColorGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaColorGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionColorGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingColorGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorGeneral(false);
			
			//SI ES MANUAL
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualColorGeneral();
			}
			
			//this.abrirFrameTreeColorGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionColorGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ColorES ?", "MANTENIMIENTO DE Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionColorGeneral.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralColorGeneral();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.colorgeneralReturnGeneral=colorgeneralLogic.procesarImportacionColorGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.colorgeneralParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarColorGeneralReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionColorGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionColorGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionColorGeneral.setFileImportacion(this.jInternalFrameImportacionColorGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionColorGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionColorGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionColorGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionColorGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoColorGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		

		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ColorGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ColorGeneralBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ColorGeneralConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoColorGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ColorGeneralConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ColorGeneralConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ColorGeneralConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoColorGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("ColorGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ColorGeneralConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ColorGeneralConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ColorGeneral colorgeneral:colorgeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(colorgeneral.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelColorGeneral(row);				
			//	iRow++;
			//}				
			
			//for(ColorGeneral colorgeneralAux:colorgeneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelColorGeneral(colorgeneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorGeneral(false);
			
			//SI ES MANUAL
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualColorGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresColorGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorGeneral(false);
			
			//SI ES MANUAL
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualColorGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesColorGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingColorGeneral(false);
			
			//SI ES MANUAL
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualColorGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaColorGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosColorGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosColorGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosColorGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosColorGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosColorGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosColorGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosColorGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingColorGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingColorGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingColorGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaColorGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesColorGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasColorGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesColorGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesColorGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualColorGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaColorGeneral();
		
		this.inicializarActualizarBindingBotonesManualColorGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualColorGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesColorGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualColorGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualColorGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosColorGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosColorGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteColorGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormColorGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormColorGeneral.jCheckBoxPostAccionNuevoColorGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormColorGeneral.jCheckBoxPostAccionSinCerrarColorGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormColorGeneral.jCheckBoxPostAccionSinMensajeColorGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosColorGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosColorGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteColorGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormColorGeneral!=null) {
				this.jInternalFrameDetalleFormColorGeneral.jCheckBoxPostAccionNuevoColorGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormColorGeneral.jCheckBoxPostAccionSinCerrarColorGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormColorGeneral.jCheckBoxPostAccionSinMensajeColorGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionColorGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionColorGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesColorGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesColorGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesColorGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarColorGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesColorGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesColorGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralColorGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesColorGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualColorGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesColorGeneral() throws Exception {
		try	{
			if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualColorGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleColorGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualColorGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesColorGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesColorGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesColorGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionColorGeneral.addItem(reporte);
			}
			
			
			if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionColorGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionColorGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesColorGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesColorGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarColorGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarColorGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarColorGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualColorGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualColorGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
				this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
				this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoColorGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoColorGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoColorGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoColorGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoColorGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualColorGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreColorGeneral.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasColorGeneral(Boolean esInicializar) throws Exception {				
		if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualColorGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaColorGeneral() throws Exception {
		this.inicializarActualizarBindingTablaColorGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByColorGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ColorGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ColorGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosColorGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ColorGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ColorGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaColorGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=colorgeneralLogic.getColorGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=colorgenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosColorGeneral.setModel(new ColorGeneralModel(this.colorgeneralLogic.getColorGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosColorGeneral.setModel(new ColorGeneralModel(this.colorgenerals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByColorGeneral!=null && this.jInternalFrameOrderByColorGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByColorGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosColorGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ColorGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO,colorgeneralConstantesFunciones.resaltarSeleccionarColorGeneral,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ColorGeneralConstantesFunciones.SCLASSWEBTITULO,colorgeneralConstantesFunciones.resaltarSeleccionarColorGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosColorGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorGeneral,ColorGeneralConstantesFunciones.LABEL_ID));

		if(this.colorgeneralConstantesFunciones.mostraridColorGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.colorgeneralConstantesFunciones.resaltaridColorGeneral,this.colorgeneralConstantesFunciones.activaridColorGeneral,this,true,"idColorGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.colorgeneralConstantesFunciones.resaltaridColorGeneral,this.colorgeneralConstantesFunciones.activaridColorGeneral,this,true,"idColorGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosColorGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosColorGeneral,ColorGeneralConstantesFunciones.LABEL_NOMBRE));

		if(this.colorgeneralConstantesFunciones.mostrarnombreColorGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ColorGeneralConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.colorgeneralConstantesFunciones.resaltarnombreColorGeneral,this.colorgeneralConstantesFunciones.activarnombreColorGeneral,this,true,"nombreColorGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.colorgeneralConstantesFunciones.resaltarnombreColorGeneral,this.colorgeneralConstantesFunciones.activarnombreColorGeneral,this,true,"nombreColorGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ColorGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.colorgeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.colorgeneralSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosColorGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.colorgeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.colorgeneralSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosColorGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarColorGeneral && this.isPermisoGuardarCambiosColorGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.colorgeneralSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.colorgeneralSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosColorGeneral.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosColorGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarColorGeneral && this.isPermisoGuardarCambiosColorGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarColorGeneral && this.isPermisoGuardarCambiosColorGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosColorGeneral.moveColumn(this.jTableDatosColorGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosColorGeneral.moveColumn(this.jTableDatosColorGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosColorGeneral.moveColumn(this.jTableDatosColorGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosColorGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosColorGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosColorGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosColorGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosColorGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosColorGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosColorGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosColorGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=colorgeneralLogic.getColorGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=colorgenerals.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosColorGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosColorGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosColorGeneral();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoColorGeneral=false;
					
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
				if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormColorGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosColorGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosColorGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.colorgeneral.getsType().equals("DUPLICADO")
				   || this.colorgeneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoColorGeneral=true;
				
				} else {
					this.isEsNuevoColorGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
					if(this.colorgeneral.getId()>=0 && !this.colorgeneral.getIsNew()) {						
						this.isEsNuevoColorGeneral=false;
						
					} else {
						this.isEsNuevoColorGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoColorGeneral(esRelaciones);						
				
				this.seleccionarColorGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.colorgeneral.getId()<0) {
					this.isEsNuevoColorGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarColorGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarColorGeneral(evt,rowIndex);
				}	
				
				if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ColorGeneral: " + this.dDif); 
					}
				}								
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarColorGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.colorgeneral)) {
					if(this.colorgeneral.getId()>0) {
						this.colorgeneral.setIsDeleted(true);
						
						this.colorgeneralsEliminados.add(this.colorgeneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.colorgeneralLogic.getColorGenerals().remove(this.colorgeneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.colorgenerals.remove(this.colorgeneral);				
					}
					
					
					((ColorGeneralModel) this.jTableDatosColorGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaColorGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarColorGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoColorGeneral) {
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosColorGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosColorGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioColorGeneral(this.colorgeneral);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesColorGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesColorGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualColorGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoColorGeneral(ColorGeneral colorgeneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoColorGeneral(colorgeneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoColorGeneral(ColorGeneral colorgeneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioColorGeneral(colorgeneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyColorGeneral(colorgeneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyColorGeneral(colorgeneral);
	}
	
	public void setVariablesObjetoActualToFormularioColorGeneral(ColorGeneral colorgeneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setText(colorgeneral.getId().toString());
			this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setText(colorgeneral.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ColorGeneral colorgeneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,colorgeneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ColorGeneral colorgeneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				colorgeneralLocal=this.colorgeneral;
			} else {
				colorgeneralLocal=this.colorgeneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(colorgeneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoColorGeneral(colorgeneralLocal,true);
					
					if(colorgeneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(colorgeneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(colorgeneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoColorGeneral(ColorGeneral colorgeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualColorGeneral(colorgeneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(colorgeneral);
	}
	
	public void setVariablesFormularioToObjetoActualColorGeneral(ColorGeneral colorgeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualColorGeneral(colorgeneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualColorGeneral(ColorGeneral colorgeneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.getText()==null || this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.getText()=="" || this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setText("0");
			}

			if(conColumnasBase) {colorgeneral.setId(Long.parseLong(this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ColorGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorGeneral.jLabelIdColorGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			colorgeneral.setnombre(this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ColorGeneralConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormColorGeneral.jLabelnombreColorGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualColorGeneral(ColorGeneral colorgeneralBean,ColorGeneral colorgeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosColorGeneral(ColorGeneral colorgeneralOrigen,ColorGeneral colorgeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && colorgeneralOrigen.getId()!=null && !colorgeneralOrigen.getId().equals(0L))) {colorgeneral.setId(colorgeneralOrigen.getId());}}
			if(conDefault || (!conDefault && colorgeneralOrigen.getnombre()!=null && !colorgeneralOrigen.getnombre().equals(""))) {colorgeneral.setnombre(colorgeneralOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioColorGeneral(ColorGeneral colorgeneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setText(colorgeneral.getId().toString());
			this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setText(colorgeneral.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioColorGeneral(ColorGeneralBean colorgeneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setText(colorgeneralBean.getId().toString());
			this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setText(colorgeneralBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanColorGeneral(ColorGeneralParameterReturnGeneral colorgeneralReturnGeneral,ColorGeneralBean colorgeneralBean,Boolean conDefault) throws Exception { 
		try {
			ColorGeneral colorgeneralLocal=new ColorGeneral();
			
			colorgeneralLocal=colorgeneralReturnGeneral.getColorGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && colorgeneralLocal.getId()!=null && !colorgeneralLocal.getId().equals(0L))) {colorgeneralBean.setId(colorgeneralLocal.getId());}}
			if(conDefault || (!conDefault && colorgeneralLocal.getnombre()!=null && !colorgeneralLocal.getnombre().equals(""))) {colorgeneralBean.setnombre(colorgeneralLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxColorGeneralGenerico(Long idColorGeneralSeleccionado,JComboBox jComboBoxColorGeneral,List<ColorGeneral> colorgeneralsLocal)throws Exception {
		try {
			ColorGeneral  colorgeneralTemp=null;

			for(ColorGeneral colorgeneralAux:colorgeneralsLocal) {
				if(colorgeneralAux.getId()!=null && colorgeneralAux.getId().equals(idColorGeneralSeleccionado)) {
					colorgeneralTemp=colorgeneralAux;
					break;
				}
			}

			jComboBoxColorGeneral.setSelectedItem(colorgeneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxColorGeneralGenerico(JComboBox jComboBoxColorGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxColorGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxColorGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxColorGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxColorGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxColorGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxColorGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxColorGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxColorGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxColorGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxColorGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			colorgeneral=(ColorGeneral) colorgeneralLogic.getColorGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			colorgeneral =(ColorGeneral) colorgenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ColorGeneral colorgeneralRow=new ColorGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			colorgeneralRow=(ColorGeneral) colorgeneralLogic.getColorGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			colorgeneralRow=(ColorGeneral) colorgenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualColorGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoColorGeneral.setVisible((this.isVisibilidadCeldaNuevoColorGeneral && this.isPermisoNuevoColorGeneral));			
			this.jButtonDuplicarColorGeneral.setVisible((this.isVisibilidadCeldaDuplicarColorGeneral && this.isPermisoDuplicarColorGeneral));			
			this.jButtonCopiarColorGeneral.setVisible((this.isVisibilidadCeldaCopiarColorGeneral && this.isPermisoCopiarColorGeneral));
			this.jButtonVerFormColorGeneral.setVisible((this.isVisibilidadCeldaVerFormColorGeneral && this.isPermisoVerFormColorGeneral));
			
			this.jButtonAbrirOrderByColorGeneral.setVisible((this.isVisibilidadCeldaOrdenColorGeneral && this.isPermisoOrdenColorGeneral));			
			
			this.jButtonNuevoRelacionesColorGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesColorGeneral && this.isPermisoNuevoColorGeneral));			
			this.jButtonNuevoGuardarCambiosColorGeneral.setVisible((this.isVisibilidadCeldaNuevoColorGeneral && this.isPermisoNuevoColorGeneral && this.isPermisoGuardarCambiosColorGeneral));
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonModificarColorGeneral.setVisible((this.isVisibilidadCeldaModificarColorGeneral && this.isPermisoActualizarColorGeneral));	
			this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarColorGeneral.setVisible((this.isVisibilidadCeldaActualizarColorGeneral && this.isPermisoActualizarColorGeneral));	
			this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarColorGeneral.setVisible((this.isVisibilidadCeldaEliminarColorGeneral && this.isPermisoEliminarColorGeneral));
			this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarColorGeneral.setVisible(this.isVisibilidadCeldaCancelarColorGeneral);							
			this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.setVisible((this.isVisibilidadCeldaGuardarColorGeneral && this.isPermisoGuardarCambiosColorGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaColorGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosColorGeneral && this.isPermisoGuardarCambiosColorGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarColorGeneral.setVisible((this.isVisibilidadCeldaNuevoColorGeneral && this.isPermisoNuevoColorGeneral));						
			this.jButtonDuplicarToolBarColorGeneral.setVisible((this.isVisibilidadCeldaDuplicarColorGeneral && this.isPermisoDuplicarColorGeneral));						
			this.jButtonCopiarToolBarColorGeneral.setVisible((this.isVisibilidadCeldaCopiarColorGeneral && this.isPermisoCopiarColorGeneral));			
			this.jButtonVerFormToolBarColorGeneral.setVisible((this.isVisibilidadCeldaVerFormColorGeneral && this.isPermisoVerFormColorGeneral));			
			this.jButtonAbrirOrderByToolBarColorGeneral.setVisible((this.isVisibilidadCeldaOrdenColorGeneral && this.isPermisoOrdenColorGeneral));
			this.jButtonNuevoRelacionesToolBarColorGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesColorGeneral && this.isPermisoNuevoColorGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarColorGeneral.setVisible((this.isVisibilidadCeldaNuevoColorGeneral && this.isPermisoNuevoColorGeneral && this.isPermisoGuardarCambiosColorGeneral));			
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonModificarToolBarColorGeneral.setVisible((this.isVisibilidadCeldaModificarColorGeneral && this.isPermisoActualizarColorGeneral));	
			this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarToolBarColorGeneral.setVisible((this.isVisibilidadCeldaActualizarColorGeneral  && this.isPermisoActualizarColorGeneral));	
			this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarToolBarColorGeneral.setVisible((this.isVisibilidadCeldaEliminarColorGeneral && this.isPermisoEliminarColorGeneral));
			this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarToolBarColorGeneral.setVisible(this.isVisibilidadCeldaCancelarColorGeneral);				
			this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosToolBarColorGeneral.setVisible((this.isVisibilidadCeldaGuardarColorGeneral && this.isPermisoGuardarCambiosColorGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarColorGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosColorGeneral && this.isPermisoGuardarCambiosColorGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoColorGeneral.setVisible((this.isVisibilidadCeldaNuevoColorGeneral && this.isPermisoNuevoColorGeneral));			
			this.jMenuItemDuplicarColorGeneral.setVisible((this.isVisibilidadCeldaDuplicarColorGeneral && this.isPermisoDuplicarColorGeneral));			
			this.jMenuItemCopiarColorGeneral.setVisible((this.isVisibilidadCeldaCopiarColorGeneral && this.isPermisoCopiarColorGeneral));			
			this.jMenuItemVerFormColorGeneral.setVisible((this.isVisibilidadCeldaVerFormColorGeneral && this.isPermisoVerFormColorGeneral));			
			this.jMenuItemAbrirOrderByColorGeneral.setVisible((this.isVisibilidadCeldaOrdenColorGeneral && this.isPermisoOrdenColorGeneral));			
			//this.jMenuItemMostrarOcultarColorGeneral.setVisible((this.isVisibilidadCeldaOrdenColorGeneral && this.isPermisoOrdenColorGeneral));
			this.jMenuItemDetalleAbrirOrderByColorGeneral.setVisible((this.isVisibilidadCeldaOrdenColorGeneral && this.isPermisoOrdenColorGeneral));			
			//this.jMenuItemDetalleMostrarOcultarColorGeneral.setVisible((this.isVisibilidadCeldaOrdenColorGeneral && this.isPermisoOrdenColorGeneral));			
			this.jMenuItemNuevoRelacionesColorGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesColorGeneral && this.isPermisoNuevoColorGeneral));			
			this.jMenuItemNuevoGuardarCambiosColorGeneral.setVisible((this.isVisibilidadCeldaNuevoColorGeneral && this.isPermisoNuevoColorGeneral && this.isPermisoGuardarCambiosColorGeneral));									
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemModificarColorGeneral.setVisible((this.isVisibilidadCeldaModificarColorGeneral && this.isPermisoActualizarColorGeneral));	
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemActualizarColorGeneral.setVisible((this.isVisibilidadCeldaActualizarColorGeneral && this.isPermisoActualizarColorGeneral));	
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemEliminarColorGeneral.setVisible((this.isVisibilidadCeldaEliminarColorGeneral && this.isPermisoEliminarColorGeneral));
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemCancelarColorGeneral.setVisible(this.isVisibilidadCeldaCancelarColorGeneral);				
			}
			
			this.jMenuItemGuardarCambiosColorGeneral.setVisible((this.isVisibilidadCeldaGuardarColorGeneral && this.isPermisoGuardarCambiosColorGeneral));						
			this.jMenuItemGuardarCambiosTablaColorGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosColorGeneral && this.isPermisoGuardarCambiosColorGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoColorGeneral=this.jButtonNuevoColorGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarColorGeneral=this.jButtonDuplicarColorGeneral.isVisible();
			this.isVisibilidadCeldaCopiarColorGeneral=this.jButtonCopiarColorGeneral.isVisible();
			this.isVisibilidadCeldaVerFormColorGeneral=this.jButtonVerFormColorGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenColorGeneral=this.jButtonAbrirOrderByColorGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=this.jButtonNuevoRelacionesColorGeneral.isVisible();
			this.isVisibilidadCeldaModificarColorGeneral=this.jButtonModificarColorGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.isVisibilidadCeldaActualizarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarColorGeneral.isVisible();
			this.isVisibilidadCeldaEliminarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarColorGeneral.isVisible();
			this.isVisibilidadCeldaCancelarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarColorGeneral.isVisible();
			this.isVisibilidadCeldaGuardarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=this.jButtonGuardarCambiosTablaColorGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoColorGeneral=this.jButtonNuevoToolBarColorGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=this.jButtonNuevoRelacionesToolBarColorGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.isVisibilidadCeldaModificarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonModificarToolBarColorGeneral.isVisible();
			this.isVisibilidadCeldaActualizarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarToolBarColorGeneral.isVisible();
			this.isVisibilidadCeldaEliminarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarToolBarColorGeneral.isVisible();
			this.isVisibilidadCeldaCancelarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarToolBarColorGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarColorGeneral=this.jButtonGuardarCambiosToolBarColorGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=this.jButtonGuardarCambiosTablaToolBarColorGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoColorGeneral=this.jMenuItemNuevoColorGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=this.jMenuItemNuevoRelacionesColorGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.isVisibilidadCeldaModificarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jMenuItemModificarColorGeneral.isVisible();
			this.isVisibilidadCeldaActualizarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jMenuItemActualizarColorGeneral.isVisible();
			this.isVisibilidadCeldaEliminarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jMenuItemEliminarColorGeneral.isVisible();
			this.isVisibilidadCeldaCancelarColorGeneral=this.jInternalFrameDetalleFormColorGeneral.jMenuItemCancelarColorGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarColorGeneral=this.jMenuItemGuardarCambiosColorGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=this.jMenuItemGuardarCambiosTablaColorGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesColorGeneral(Boolean esInicializar) {
		if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
				//if(this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesColorGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualColorGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualColorGeneral() {
		this.jButtonNuevoColorGeneral.setVisible(this.isPermisoNuevoColorGeneral);			
		this.jButtonDuplicarColorGeneral.setVisible(this.isPermisoDuplicarColorGeneral);			
		this.jButtonCopiarColorGeneral.setVisible(this.isPermisoCopiarColorGeneral);			
		this.jButtonVerFormColorGeneral.setVisible(this.isPermisoVerFormColorGeneral);			
		
		this.jButtonAbrirOrderByColorGeneral.setVisible(this.isPermisoOrdenColorGeneral);					
		
		this.jButtonNuevoRelacionesColorGeneral.setVisible(this.isPermisoNuevoColorGeneral);			
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonModificarColorGeneral.setVisible(this.isPermisoActualizarColorGeneral);	
			this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarColorGeneral.setVisible(this.isPermisoActualizarColorGeneral);	
			this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarColorGeneral.setVisible(this.isPermisoEliminarColorGeneral);
			this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarColorGeneral.setVisible(this.isVisibilidadCeldaCancelarColorGeneral);						
			this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.setVisible(this.isPermisoGuardarCambiosColorGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaColorGeneral.setVisible(this.isPermisoActualizarColorGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleColorGeneral() {
		this.jInternalFrameDetalleFormColorGeneral.jButtonModificarColorGeneral.setVisible(this.isPermisoActualizarColorGeneral);	
		this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarColorGeneral.setVisible(this.isPermisoActualizarColorGeneral);	
		this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarColorGeneral.setVisible(this.isPermisoEliminarColorGeneral);
		this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarColorGeneral.setVisible(this.isVisibilidadCeldaCancelarColorGeneral);							
		this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.setVisible((this.isVisibilidadCeldaGuardarColorGeneral && this.isPermisoGuardarCambiosColorGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosColorGeneral() {
		if(ColorGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualColorGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesColorGeneral() {
	}
	
	public void jTableDatosColorGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarColorGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidColorGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorGeneral(this.getcolorgeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorgeneral==null) {
						this.colorgeneral = new ColorGeneral();
					}

					this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
				}

				if(this.colorgeneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.colorgeneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreColorGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualColorGeneral(this.getcolorgeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.colorgeneral==null) {
						this.colorgeneral = new ColorGeneral();
					}

					this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);
				}

				if(this.colorgeneral.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.colorgeneral.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingColorGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreColorGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingColorGeneral(false,false);

			this.getColorGeneralsBusquedaPorNombre();

			this.inicializarActualizarBindingColorGeneral(false);

			//if(ColorGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingColorGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.colorgeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameColorGeneral() {
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
			this.jInternalFrameDetalleFormColorGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormColorGeneral.dispose();
			this.jInternalFrameDetalleFormColorGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
			this.jInternalFrameReporteDinamicoColorGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoColorGeneral.dispose();
			this.jInternalFrameReporteDinamicoColorGeneral=null;
		}
		
		if(this.jInternalFrameImportacionColorGeneral!=null) {
			this.jInternalFrameImportacionColorGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionColorGeneral.dispose();
			this.jInternalFrameImportacionColorGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessColorGeneral();
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarColorGeneral")) {
				jButtonDuplicarColorGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarColorGeneral")) {
				jButtonCopiarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormColorGeneral")) {
				jButtonVerFormColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarColorGeneral")) {
				jButtonDuplicarColorGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarColorGeneral")) {
				jButtonDuplicarColorGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarColorGeneral")) {
				jButtonModificarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarColorGeneral")) {
				jButtonModificarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarColorGeneral")) {
				jButtonModificarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarColorGeneral")) {
				jButtonActualizarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarColorGeneral")) {
				jButtonActualizarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarColorGeneral")) {
				jButtonActualizarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarColorGeneral")) {
				jButtonEliminarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarColorGeneral")) {
				jButtonEliminarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarColorGeneral")) {
				jButtonEliminarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarColorGeneral")) {
				jButtonCancelarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarColorGeneral")) {
				jButtonCancelarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarColorGeneral")) {
				jButtonCancelarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarColorGeneral")) {
				jButtonCerrarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarColorGeneral")) {
				jButtonCerrarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarColorGeneral")) {
				jButtonCerrarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarColorGeneral")) {
				jButtonMostrarOcultarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarColorGeneral")) {
				jButtonCancelarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarColorGeneral")) {
				jButtonCopiarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarColorGeneral")) {
				jButtonVerFormColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarColorGeneral")) {
				jButtonCopiarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormColorGeneral")) {
				jButtonVerFormColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionColorGeneral")) {
				jButtonRecargarInformacionColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarColorGeneral")) {
				jButtonRecargarInformacionColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionColorGeneral")) {
				jButtonRecargarInformacionColorGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresColorGeneral")) {
				jButtonAnterioresColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarColorGeneral")) {
				jButtonAnterioresColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreColorGeneral")) {
				jButtonAnterioresColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesColorGeneral")) {
				jButtonSiguientesColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarColorGeneral")) {
				jButtonSiguientesColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesColorGeneral")) {
				jButtonSiguientesColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByColorGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByColorGeneral")) {
				jButtonAbrirOrderByColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarColorGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarColorGeneral")) {
				jButtonMostrarOcultarColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosColorGeneral")) {
				jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarColorGeneral")) {
				jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosColorGeneral")) {
				jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoColorGeneral")) {
				jButtonCerrarReporteDinamicoColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoColorGeneral")) {
				jButtonGenerarReporteDinamicoColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoColorGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionColorGeneral")) {
				jButtonCerrarImportacionColorGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionColorGeneral")) {
				
				jButtonGenerarImportacionColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionColorGeneral")) {
				
				jButtonAbrirImportacionColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesColorGeneral")) {
				jComboBoxTiposAccionesColorGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesColorGeneral")) {
				jComboBoxTiposRelacionesColorGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioColorGeneral")) {
				jComboBoxTiposAccionesColorGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarColorGeneral")) {
				
				jComboBoxTiposSeleccionarColorGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralColorGeneral")) {
				jTextFieldValorCampoGeneralColorGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByColorGeneral")) {
				jButtonAbrirOrderByColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarColorGeneral")) {
				jButtonAbrirOrderByColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByColorGeneral")) {
				jButtonCerrarOrderByColorGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idColorGeneralBusqueda")) {
				this.jButtonidColorGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreColorGeneralBusqueda")) {
				this.jButtonnombreColorGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreColorGeneral")) {
				this.jButtonBusquedaPorNombreColorGeneralActionPerformed(evt);
			}
			
			;
			
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessColorGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ColorGeneral colorgeneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				colorgeneralLocal=this.colorgeneral;
			} else {
				colorgeneralLocal=this.colorgeneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
							
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
								
						
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
								
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
							
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
								
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosColorGeneral")) {
					jCheckBoxSeleccionarTodosColorGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosColorGeneral")) {
					jCheckBoxSeleccionadosColorGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarColorGeneral")) {
					
				}
				
				


				
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
												
				
				


				
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaColorGeneralActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.colorgeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.colorgeneral);
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ColorGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ColorGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaColorGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.colorgeneralAnterior =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarColorGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosColorGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosColorGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.colorgeneral =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.colorgeneral =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.colorgeneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarColorGeneral")) {
				
				}
				
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarColorGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosColorGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarColorGeneral")) {
			
			}
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessColorGeneral();
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			if(sTipo.equals("NuevoColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarColorGeneral")) {
				jButtonDuplicarColorGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarColorGeneral")) {
				jButtonCopiarColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormColorGeneral")) {
				jButtonVerFormColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesColorGeneral")) {
				jButtonNuevoColorGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarColorGeneral")) {
				jButtonModificarColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarColorGeneral")) {
				jButtonActualizarColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarColorGeneral")) {
				jButtonEliminarColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarColorGeneral")) {
				jButtonCancelarColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarColorGeneral")) {
				jButtonCerrarColorGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosColorGeneral")) {
				jButtonGuardarCambiosColorGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosColorGeneral")) {
				jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByColorGeneral")) {
				jButtonAbrirOrderByColorGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionColorGeneral")) {
				jButtonRecargarInformacionColorGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresColorGeneral")) {
				jButtonAnterioresColorGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesColorGeneral")) {
				jButtonSiguientesColorGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idColorGeneralBusqueda")) {
				this.jButtonidColorGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreColorGeneralBusqueda")) {
				this.jButtonnombreColorGeneralBusquedaActionPerformed(evt);
			}
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessColorGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameColorGeneral")) {
				closingInternalFrameColorGeneral();
				
			} else if(sTipo.equals("jButtonCancelarColorGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormColorGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            ColorGeneralBeanSwingJInternalFrame jInternalFrameParent=(ColorGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormColorGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarColorGeneralActionPerformed(null);
			}
			
			ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.colorgeneral,new Object(),this.colorgeneralParameterGeneral,this.colorgeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormColorGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormColorGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormColorGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.colorgeneral)) {
			if(!esControlTabla) {
				if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);			
				}
				
				if(this.colorgeneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualColorGeneral(this.colorgeneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.colorgeneralReturnGeneral=colorgeneralLogic.procesarEventosColorGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorgeneralLogic.getColorGenerals(),this.colorgeneral,this.colorgeneralParameterGeneral,this.isEsNuevoColorGeneral,classes);//this.colorgeneralLogic.getColorGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanColorGeneral(this.colorgeneralReturnGeneral,this.colorgeneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.colorgeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanColorGeneral(classes,this.colorgeneralReturnGeneral,this.colorgeneralBean,false);
					}
						
					if(this.colorgeneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral());	
					}
						
					if(this.colorgeneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral(),classes);//this.colorgeneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioColorGeneral(this.colorgeneral,classes);//this.colorgeneralBean);									
				}
			
				if(ColorGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualColorGeneral(this.colorgeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysColorGeneral(this.colorgeneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.colorgeneralAnterior!=null) {
						this.colorgeneral=this.colorgeneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.colorgeneralReturnGeneral=colorgeneralLogic.procesarEventosColorGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorgeneralLogic.getColorGenerals(),this.colorgeneral,this.colorgeneralParameterGeneral,this.isEsNuevoColorGeneral,classes);//this.colorgeneralLogic.getColorGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.colorgeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.colorgeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.colorgeneralReturnGeneral.getColorGeneral(),colorgeneralLogic.getColorGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.colorgeneralReturnGeneral.getColorGeneral(),this.colorgenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosColorGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosColorGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosColorGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosColorGeneral() throws Exception {
		
		ColorGeneralModel colorgeneralModel=(ColorGeneralModel)this.jTableDatosColorGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			colorgeneralModel.colorgenerals=this.colorgeneralLogic.getColorGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			colorgeneralModel.colorgenerals=this.colorgenerals;
		}
		
		
		((ColorGeneralModel) this.jTableDatosColorGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaColorGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcolorgeneralAnterior(),this.colorgeneralLogic.getColorGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcolorgeneralAnterior(),this.colorgenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosColorGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioColorGeneral(ColorGeneral colorgeneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorgeneral,new Object(),generalEntityParameterGeneral,this.colorgeneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.colorgeneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ColorGeneralConstantesFunciones.getClassesRelationshipsOfColorGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ColorGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfColorGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormColorGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ColorGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.colorgeneral,new Object(),generalEntityParameterGeneral,this.colorgeneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioColorGeneral(ColorGeneralBean colorgeneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanColorGeneral(ArrayList<Classe> classes,ColorGeneralReturnGeneral colorgeneralReturnGeneral,ColorGeneralBean colorgeneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualColorGeneral(ColorGeneral colorgeneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.colorgeneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormColorGeneral = new ColorGeneralDetalleFormJInternalFrame(jDesktopPane,this.colorgeneralSessionBean.getConGuardarRelaciones(),this.colorgeneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormColorGeneral);
		this.jInternalFrameDetalleFormColorGeneral.setVisible(false);
		this.jInternalFrameDetalleFormColorGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormColorGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormColorGeneral.colorgeneralLogic=this.colorgeneralLogic;
		
		this.cargarCombosFrameForeignKeyColorGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleColorGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleColorGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyColorGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyColorGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormColorGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarColorGeneral"));
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonModificarColorGeneral.addActionListener(new ButtonActionListener(this,"ModificarColorGeneral"));

		
		this.jInternalFrameDetalleFormColorGeneral.jButtonModificarToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarColorGeneral"));
					
		this.jInternalFrameDetalleFormColorGeneral.jMenuItemModificarColorGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarColorGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarColorGeneral.addActionListener (new ButtonActionListener(this,"ActualizarColorGeneral"));
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarColorGeneral"));
						
		this.jInternalFrameDetalleFormColorGeneral.jMenuItemActualizarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarColorGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarColorGeneral.addActionListener (new ButtonActionListener(this,"EliminarColorGeneral"));
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarColorGeneral"));
								
		this.jInternalFrameDetalleFormColorGeneral.jMenuItemEliminarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarColorGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarColorGeneral.addActionListener (new ButtonActionListener(this,"CancelarColorGeneral"));
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarColorGeneral"));
					
		this.jInternalFrameDetalleFormColorGeneral.jMenuItemCancelarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarColorGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jMenuItemDetalleCerrarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarColorGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarColorGeneral"));
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarColorGeneral"));
		
		
		
		this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioColorGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorGeneral.jButtonidColorGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idColorGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorGeneral.jButtonnombreColorGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreColorGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesColorGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameColorGeneral"));
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarColorGeneral"));
		}
		
		this.jTableDatosColorGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarColorGeneral"));
		
		this.jTableDatosColorGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarColorGeneral"));
		
		this.jButtonNuevoColorGeneral.addActionListener(new ButtonActionListener(this,"NuevoColorGeneral"));
		
		this.jButtonDuplicarColorGeneral.addActionListener(new ButtonActionListener(this,"DuplicarColorGeneral"));
		
		this.jButtonCopiarColorGeneral.addActionListener(new ButtonActionListener(this,"CopiarColorGeneral"));
		
		this.jButtonVerFormColorGeneral.addActionListener(new ButtonActionListener(this,"VerFormColorGeneral"));
		
		
		this.jButtonNuevoToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarColorGeneral"));
			
		this.jButtonDuplicarToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarColorGeneral"));
			
		this.jMenuItemNuevoColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoColorGeneral"));
			
		this.jMenuItemDuplicarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarColorGeneral"));		
		
		
		this.jButtonNuevoRelacionesColorGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesColorGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarColorGeneral"));
			
		this.jMenuItemNuevoRelacionesColorGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesColorGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonModificarColorGeneral.addActionListener(new ButtonActionListener(this,"ModificarColorGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonModificarToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarColorGeneral"));
			
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemModificarColorGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarColorGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarColorGeneral.addActionListener (new ButtonActionListener(this,"ActualizarColorGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonActualizarToolBarColorGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarColorGeneral"));
				
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemActualizarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarColorGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarColorGeneral.addActionListener (new ButtonActionListener(this,"EliminarColorGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonEliminarToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarColorGeneral"));
						
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemEliminarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarColorGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarColorGeneral.addActionListener (new ButtonActionListener(this,"CancelarColorGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonCancelarToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarColorGeneral"));
			
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemCancelarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarColorGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarColorGeneral"));		
		
		
		this.jButtonCerrarColorGeneral.addActionListener (new ButtonActionListener(this,"CerrarColorGeneral"));
		
		
		this.jButtonCerrarToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarColorGeneral"));
			
		this.jMenuItemCerrarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarColorGeneral"));
			
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jMenuItemDetalleCerrarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarColorGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosColorGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarColorGeneral"));
		}
		
		this.jButtonCopiarToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarColorGeneral"));
			
		this.jButtonVerFormToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarColorGeneral"));
		
		this.jMenuItemGuardarCambiosColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosColorGeneral"));
			
		this.jMenuItemCopiarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarColorGeneral"));		
		
		this.jMenuItemVerFormColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormColorGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaColorGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarColorGeneral"));
			
		this.jMenuItemGuardarCambiosTablaColorGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaColorGeneral"));		
		
		
		
		this.jButtonRecargarInformacionColorGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionColorGeneral"));
					
		this.jButtonRecargarInformacionToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarColorGeneral"));
		
		this.jMenuItemRecargarInformacionColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionColorGeneral"));		
		
		
		
		this.jButtonAnterioresColorGeneral.addActionListener (new ButtonActionListener(this,"AnterioresColorGeneral"));
		
		
		this.jButtonAnterioresToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarColorGeneral"));
		
		this.jMenuItemAnterioresColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresColorGeneral"));		
		
		
		this.jButtonSiguientesColorGeneral.addActionListener (new ButtonActionListener(this,"SiguientesColorGeneral"));
		
		
		this.jButtonSiguientesToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarColorGeneral"));
			
		this.jMenuItemSiguientesColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesColorGeneral"));
			
		this.jMenuItemAbrirOrderByColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByColorGeneral"));
			
		this.jMenuItemMostrarOcultarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarColorGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByColorGeneral"));
			
		this.jMenuItemDetalleMostarOcultarColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarColorGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosColorGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosColorGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarColorGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosColorGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosColorGeneral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosColorGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosColorGeneral"));

		this.jCheckBoxSeleccionadosColorGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosColorGeneral"));
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioColorGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesColorGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesColorGeneral"));
			
		this.jComboBoxTiposAccionesColorGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesColorGeneral"));
					
		this.jComboBoxTiposSeleccionarColorGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarColorGeneral"));
			
		this.jTextFieldValorCampoGeneralColorGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralColorGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorGeneral.jButtonidColorGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idColorGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorGeneral.jButtonnombreColorGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreColorGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreColorGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreColorGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoColorGeneral!=null) {
				this.jInternalFrameReporteDinamicoColorGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoColorGeneral"));
				this.jInternalFrameReporteDinamicoColorGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoColorGeneral"));
				this.jInternalFrameReporteDinamicoColorGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoColorGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoColorGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoColorGeneral"));				
			//this.jButtonGenerarReporteDinamicoColorGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoColorGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoColorGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoColorGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionColorGeneral!=null) {
				this.jInternalFrameImportacionColorGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionColorGeneral"));
				this.jInternalFrameImportacionColorGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionColorGeneral"));
				this.jInternalFrameImportacionColorGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionColorGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByColorGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByColorGeneral"));
			
			this.jButtonAbrirOrderByToolBarColorGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarColorGeneral"));			
			
			if(this.jInternalFrameOrderByColorGeneral!=null) {
				this.jInternalFrameOrderByColorGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByColorGeneral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormColorGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormColorGeneral.jTabbedPaneRelacionesColorGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesColorGeneral"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameColorGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormColorGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormColorGeneral = (JInternalFrameBase)event.getSource();
	            	
	            ColorGeneralBeanSwingJInternalFrame jInternalFrameParent=(ColorGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormColorGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarColorGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosColorGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosColorGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosColorGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosColorGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoColorGeneral";
		inputMap = this.jButtonNuevoColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoColorGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoColorGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesColorGeneral";
		inputMap = this.jButtonNuevoRelacionesColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoColorGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarColorGeneral";
		inputMap = this.jButtonModificarColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarColorGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarColorGeneral";
		inputMap = this.jButtonActualizarColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarColorGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarColorGeneral";
		inputMap = this.jButtonEliminarColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarColorGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarColorGeneral";
		inputMap = this.jButtonCancelarColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarColorGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarColorGeneral";
		inputMap = this.jButtonCerrarColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarColorGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosColorGeneral";
		inputMap = this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormColorGeneral.jButtonGuardarCambiosColorGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosColorGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosColorGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosColorGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesColorGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesColorGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarColorGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarColorGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralColorGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralColorGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorGeneral.jButtonidColorGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idColorGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormColorGeneral.jButtonnombreColorGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreColorGeneralBusqueda"));
		
		
		this.jButtonBusquedaPorNombreColorGeneral.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreColorGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionColorGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionColorGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarColorGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarColorGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosColorGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
					colorgeneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorGeneral colorgeneralAux:colorgenerals) {
					colorgeneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosColorGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingColorGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
						colorgeneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ColorGeneral colorgeneralAux:colorgenerals) {
						colorgeneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ColorGeneral colorgeneralAux:colorgenerals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaColorGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosColorGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosColorGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosColorGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosColorGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingColorGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosColorGeneral.getSelectedRows();
			
			ColorGeneral colorgeneralLocal=new ColorGeneral();
			
			//this.seleccionarTodosColorGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					colorgeneralLocal =(ColorGeneral) this.colorgeneralLogic.getColorGenerals().toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					colorgeneralLocal =(ColorGeneral) this.colorgenerals.toArray()[this.jTableDatosColorGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				colorgeneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
						colorgeneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ColorGeneral colorgeneralAux:colorgenerals) {
						colorgeneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaColorGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosColorGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosColorGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosColorGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualColorGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarColorGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralColorGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingColorGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralColorGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ColorGeneral colorgeneralAux:this.colorgeneralLogic.getColorGenerals()) {
				
						if(sTipoSeleccionar.equals(ColorGeneralConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							colorgeneralAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorGeneral colorgeneralAux:colorgenerals) {
					
						if(sTipoSeleccionar.equals(ColorGeneralConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							colorgeneralAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaColorGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesColorGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingColorGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioColorGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesColorGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteColorGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessColorGeneral(conSplash);
				
					this.generarReporteColorGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoColorGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoColorGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoColorGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessColorGeneral();
				
				this.exportarColorGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionColorGenerals();
				//this.importarColorGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessColorGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelColorGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Color", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessColorGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoColorGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyColorGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesColorGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormColorGeneral.jComboBoxTiposAccionesFormularioColorGeneral.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralColorGeneral();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessColorGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesColorGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessColorGeneral();
			
			if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
			ColorGeneral colorgeneral=new ColorGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingColorGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesColorGeneral.getSelectedItem();
			
			
			
			
			colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(colorgeneralsSeleccionados.size()==1) {
				for(ColorGeneral colorgeneralAux:colorgeneralsSeleccionados) {
					colorgeneral=colorgeneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessColorGeneral();
			
      		//this.finishProcessColorGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarColorGeneralReturnGeneral() throws Exception {
		if(this.colorgeneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.colorgeneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.colorgeneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.colorgeneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.colorgeneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.colorgeneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingColorGeneral(false);
		}
		
		if(this.colorgeneralReturnGeneral.getConRetornoLista() || this.colorgeneralReturnGeneral.getConRetornoObjeto()) {
			if(this.colorgeneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.colorgeneralLogic.setColorGenerals(this.colorgeneralReturnGeneral.getColorGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.colorgeneralReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.colorgeneralLogic.setColorGeneral(this.colorgeneralReturnGeneral.getColorGeneral());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingColorGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralColorGeneral() throws Exception {
		
		
	}
	
	public ArrayList<ColorGeneral> getColorGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioColorGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ColorGeneral colorgeneralAux:colorgeneralLogic.getColorGenerals()) {
					if(colorgeneralAux.getIsSelected()) {
						colorgeneralsSeleccionados.add(colorgeneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ColorGeneral colorgeneralAux:this.colorgenerals) {
					if(colorgeneralAux.getIsSelected()) {
						colorgeneralsSeleccionados.add(colorgeneralAux);				
					}
				}
			}
			
			if(colorgeneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						colorgeneralsSeleccionados.addAll(this.colorgeneralLogic.getColorGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						colorgeneralsSeleccionados.addAll(this.colorgenerals);				
					}
				}
			}
		} else {
			colorgeneralsSeleccionados.add(this.colorgeneral);
		}
		
		return colorgeneralsSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteColorGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalColorGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoColorGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoColorGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoColorGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Color",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesColorGeneralsSeleccionados() throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalColorGeneralsSeleccionados() throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionColorGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoColorGeneralsSeleccionados() throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoColorGeneral();
		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoColorGeneral();
		
		
		//this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados ,colorgeneralImplementable,colorgeneralImplementableHome);
	}
	
	public void mostrarImportacionColorGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionColorGeneral();
		
		this.abrirFrameImportacionColorGeneral();		
		
			
		//this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados ,colorgeneralImplementable,colorgeneralImplementableHome);
	}
	
	public void importarColorGenerals() throws Exception {		
	
	}
	
	public void exportarColorGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelColorGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoColorGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlColorGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Color",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoColorGeneralsSeleccionados() throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarColorGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ColorGeneral colorgeneralAux:colorgeneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarColorGeneral(colorgeneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//colorgeneralAux.setsDetalleGeneralEntityReporte(colorgeneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarColorGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ColorGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ColorGeneralConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarColorGeneral(ColorGeneral colorgeneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=colorgeneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=colorgeneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=colorgeneral.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelColorGeneralsSeleccionados() throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ColorGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelColorGeneral(row);				
				iRow++;
			}				
			
			for(ColorGeneral colorgeneralAux:colorgeneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelColorGeneral(colorgeneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlColorGeneralsSeleccionados() throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();		
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"colorgeneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("colorgenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("colorgeneral");
			//elementRoot.appendChild(element);
		
			for(ColorGeneral colorgeneralAux:colorgeneralsSeleccionados) {
				element = document.createElement("colorgeneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlColorGeneral(colorgeneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Color",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelColorGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ColorGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ColorGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ColorGeneralConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelColorGeneral(ColorGeneral colorgeneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(colorgeneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(colorgeneral.getnombre());				
	}
	
	public void setFilaDatosExportarXmlColorGeneral(ColorGeneral colorgeneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ColorGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(colorgeneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ColorGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(colorgeneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(ColorGeneralConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(colorgeneral.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoColorGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ColorGeneral> colorgeneralsSeleccionados=new ArrayList<ColorGeneral>();
		
		colorgeneralsSeleccionados=this.getColorGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoColorGeneral(colorgeneralsSeleccionados);
		
		this.generarReporteColorGenerals("Todos",colorgeneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoColorGeneral(ArrayList<ColorGeneral> colorgeneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ColorGeneral colorgeneralAux:colorgeneralsSeleccionados) {
				colorgeneralAux.setsDetalleGeneralEntityReporte(colorgeneralAux.toString());
			
				if(sTipoSeleccionar.equals(ColorGeneralConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					colorgeneralAux.setsDescripcionGeneralEntityReporte1(colorgeneralAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ColorGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesColorGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoColorGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesColorGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosColorGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=false;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
			this.isVisibilidadCeldaModificarColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=true;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
			this.isVisibilidadCeldaModificarColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=true;
			this.isVisibilidadCeldaEliminarColorGeneral=true;
			this.isVisibilidadCeldaCancelarColorGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
			this.isVisibilidadCeldaModificarColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=true;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoColorGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=true;
			this.isVisibilidadCeldaModificarColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=false;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
			this.isVisibilidadCeldaActualizarColorGeneral=false;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
			this.isVisibilidadCeldaModificarColorGeneral=true;
			this.isVisibilidadCeldaActualizarColorGeneral=false;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
			this.isVisibilidadCeldaCancelarColorGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarColorGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ColorGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoColorGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=true;
		} else {
			this.actualizarEstadoPanelsColorGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarColorGeneral=false;
			//this.isVisibilidadCeldaVerFormColorGeneral=false;
			this.isVisibilidadCeldaDuplicarColorGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!colorgeneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoColorGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosColorGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(colorgeneralSessionBean.getEsGuardarRelacionado()) {
			if(!colorgeneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;												
			}
			
			this.jButtonCerrarColorGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesColorGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.colorgeneral)) {
			this.isVisibilidadCeldaActualizarColorGeneral=false;
			this.isVisibilidadCeldaEliminarColorGeneral=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesColorGeneral() {
	}
	
	public void actualizarEstadoPanelsColorGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionColorGeneral!=null) {
				this.jScrollPanelDatosEdicionColorGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosColorGeneral!=null) {
				this.jScrollPanelDatosColorGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionColorGeneral!=null) {
				this.jPanelPaginacionColorGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasColorGeneral!=null) {
					this.jTabbedPaneBusquedasColorGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.colorgeneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasColorGeneral!=null) {
				this.jTabbedPaneBusquedasColorGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesColorGeneral!=null) {
				this.jPanelParametrosReportesColorGeneral.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ColorGeneralSessionBean colorgeneralSessionBean=new ColorGeneralSessionBean();
		
		if(this.colorgeneralSessionBean==null) {
			this.colorgeneralSessionBean=new ColorGeneralSessionBean();
		}
		
		this.colorgeneralSessionBean.setsUltimaBusquedaColorGeneral(this.getsAccionBusqueda());
		this.colorgeneralSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.colorgeneralSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			colorgeneralSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ColorGeneralSessionBean colorgeneralSessionBean=new ColorGeneralSessionBean();
		
		if(this.colorgeneralSessionBean==null) {
			this.colorgeneralSessionBean=new ColorGeneralSessionBean();
		}
		
		if(this.colorgeneralSessionBean.getsUltimaBusquedaColorGeneral()!=null&&!this.colorgeneralSessionBean.getsUltimaBusquedaColorGeneral().equals("")) {
			this.setsAccionBusqueda(colorgeneralSessionBean.getsUltimaBusquedaColorGeneral());
			this.setiNumeroPaginacion(colorgeneralSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(colorgeneralSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(colorgeneralSessionBean.getnombre());
				colorgeneralSessionBean.setnombre("");
			}
		}
		
		this.colorgeneralSessionBean.setsUltimaBusquedaColorGeneral("");
		this.colorgeneralSessionBean.setiNumeroPaginacion(ColorGeneralConstantesFunciones.INUMEROPAGINACION);
		this.colorgeneralSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaColorGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioColorGeneral() {
		this.updateBorderResaltarBusquedasFormularioColorGeneral();
		this.updateVisibilidadBusquedasFormularioColorGeneral();
		this.updateHabilitarBusquedasFormularioColorGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioColorGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasColorGeneral.getComponents().length>0) {
	

		if(this.colorgeneralConstantesFunciones.resaltarBusquedaPorNombreColorGeneral!=null) {
			index= this.jTabbedPaneBusquedasColorGeneral.indexOfComponent(this.jPanelBusquedaPorNombreColorGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorGeneral.getComponent(index);
				jPanel.setBorder(this.colorgeneralConstantesFunciones.resaltarBusquedaPorNombreColorGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioColorGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasColorGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasColorGeneral.indexOfComponent(this.jPanelBusquedaPorNombreColorGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasColorGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.colorgeneralConstantesFunciones.mostrarBusquedaPorNombreColorGeneral);
			if(!this.colorgeneralConstantesFunciones.mostrarBusquedaPorNombreColorGeneral && index>-1) {
				this.jTabbedPaneBusquedasColorGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioColorGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasColorGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasColorGeneral.indexOfComponent(this.jPanelBusquedaPorNombreColorGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasColorGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.colorgeneralConstantesFunciones.activarBusquedaPorNombreColorGeneral);
				this.jTabbedPaneBusquedasColorGeneral.setEnabledAt(index,this.colorgeneralConstantesFunciones.activarBusquedaPorNombreColorGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaColorGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasColorGeneral.indexOfComponent(this.jPanelBusquedaPorNombreColorGeneral);

			this.jTabbedPaneBusquedasColorGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasColorGeneral.getComponent(index);

			this.colorgeneralConstantesFunciones.setResaltarBusquedaPorNombreColorGeneral(resaltar);

			jPanel.setBorder(this.colorgeneralConstantesFunciones.resaltarBusquedaPorNombreColorGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarColorGeneral.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioColorGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioColorGeneral();
		this.updateVisibilidadResaltarControlesFormularioColorGeneral();
		this.updateHabilitarResaltarControlesFormularioColorGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioColorGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.colorgeneralConstantesFunciones.resaltaridColorGeneral!=null && this.jInternalFrameDetalleFormColorGeneral!=null) {this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setBorder(this.colorgeneralConstantesFunciones.resaltaridColorGeneral);}
		if(this.colorgeneralConstantesFunciones.resaltarnombreColorGeneral!=null && this.jInternalFrameDetalleFormColorGeneral!=null) {this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setBorder(this.colorgeneralConstantesFunciones.resaltarnombreColorGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioColorGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
	
		//this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setVisible(this.colorgeneralConstantesFunciones.mostraridColorGeneral);
		this.jInternalFrameDetalleFormColorGeneral.jPanelidColorGeneral.setVisible(this.colorgeneralConstantesFunciones.mostraridColorGeneral);
		//this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setVisible(this.colorgeneralConstantesFunciones.mostrarnombreColorGeneral);
		this.jInternalFrameDetalleFormColorGeneral.jPanelnombreColorGeneral.setVisible(this.colorgeneralConstantesFunciones.mostrarnombreColorGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioColorGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormColorGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormColorGeneral!=null) {
	
		this.jInternalFrameDetalleFormColorGeneral.jTextFieldidColorGeneral.setEnabled(this.colorgeneralConstantesFunciones.activaridColorGeneral);
		this.jInternalFrameDetalleFormColorGeneral.jTextFieldnombreColorGeneral.setEnabled(this.colorgeneralConstantesFunciones.activarnombreColorGeneral);
		}
	}
	
		
}