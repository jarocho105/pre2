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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoCargaFamiConstantesFunciones;
import com.bydan.erp.cartera.util.TipoCargaFamiParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoCargaFamiParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoCargaFamiBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCargaFamiBeanSwingJInternalFrame extends TipoCargaFamiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCargaFamiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCargaFami> tipocargafamiValidator = new ClassValidator<TipoCargaFami>(TipoCargaFami.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCargaFami tipocargafami;	
	public TipoCargaFami tipocargafamiAux;
	public TipoCargaFami tipocargafamiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCargaFami tipocargafamiTotales;
	public Long idTipoCargaFamiActual;
	public Long iIdNuevoTipoCargaFami=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCargaFamiliar_NM=false;

	public Boolean getIsTienePermisosCargaFamiliar_NM() {
		return isTienePermisosCargaFamiliar_NM;
	}

	public void setIsTienePermisosCargaFamiliar_NM(Boolean isTienePermisosCargaFamiliar_NM) {
		this.isTienePermisosCargaFamiliar_NM= isTienePermisosCargaFamiliar_NM;
	}


	public Boolean isTienePermisosCargaFamiliar=false;

	public Boolean getIsTienePermisosCargaFamiliar() {
		return isTienePermisosCargaFamiliar;
	}

	public void setIsTienePermisosCargaFamiliar(Boolean isTienePermisosCargaFamiliar) {
		this.isTienePermisosCargaFamiliar= isTienePermisosCargaFamiliar;
	}

	
	
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
	
	public Boolean isPermisoTodoTipoCargaFami;
	public Boolean isPermisoNuevoTipoCargaFami;
	public Boolean isPermisoActualizarTipoCargaFami;
	public Boolean isPermisoActualizarOriginalTipoCargaFami;
	public Boolean isPermisoEliminarTipoCargaFami;
	public Boolean isPermisoGuardarCambiosTipoCargaFami;
	public Boolean isPermisoConsultaTipoCargaFami;
	public Boolean isPermisoBusquedaTipoCargaFami;
	public Boolean isPermisoReporteTipoCargaFami;
	public Boolean isPermisoPaginacionMedioTipoCargaFami;
	public Boolean isPermisoPaginacionAltoTipoCargaFami;
	public Boolean isPermisoPaginacionTodoTipoCargaFami;
	public Boolean isPermisoCopiarTipoCargaFami;
	public Boolean isPermisoVerFormTipoCargaFami;
	public Boolean isPermisoDuplicarTipoCargaFami;
	public Boolean isPermisoOrdenTipoCargaFami;
	
	
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
	
	public TipoCargaFamiParameterReturnGeneral tipocargafamiReturnGeneral;
	public TipoCargaFamiParameterReturnGeneral tipocargafamiParameterGeneral;
	
	

	public CargaFamiliar_NMLogic cargafamiliar_nmLogic=null;

	public CargaFamiliar_NMLogic getCargaFamiliar_NMLogic() {
		return cargafamiliar_nmLogic;
	}

	public void setCargaFamiliar_NMLogic(CargaFamiliar_NMLogic cargafamiliar_nmLogic) {
		this.cargafamiliar_nmLogic = cargafamiliar_nmLogic;
	}


	public CargaFamiliarLogic cargafamiliarLogic=null;

	public CargaFamiliarLogic getCargaFamiliarLogic() {
		return cargafamiliarLogic;
	}

	public void setCargaFamiliarLogic(CargaFamiliarLogic cargafamiliarLogic) {
		this.cargafamiliarLogic = cargafamiliarLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCargaFami=false;
	public Boolean esParaAccionDesdeFormularioTipoCargaFami=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCargaFamiSessionBeanAdditional tipocargafamiSessionBeanAdditional=null;
	
	public TipoCargaFamiSessionBeanAdditional getTipoCargaFamiSessionBeanAdditional() {
		return this.tipocargafamiSessionBeanAdditional;
	}
	
	public void setTipoCargaFamiSessionBeanAdditional(TipoCargaFamiSessionBeanAdditional tipocargafamiSessionBeanAdditional) {
		try {
			this.tipocargafamiSessionBeanAdditional=tipocargafamiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCargaFamiBeanSwingJInternalFrameAdditional tipocargafamiBeanSwingJInternalFrameAdditional=null;
	//public class TipoCargaFamiBeanSwingJInternalFrame
	
	public TipoCargaFamiBeanSwingJInternalFrameAdditional getTipoCargaFamiBeanSwingJInternalFrameAdditional() {
		return this.tipocargafamiBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCargaFamiBeanSwingJInternalFrameAdditional(TipoCargaFamiBeanSwingJInternalFrameAdditional tipocargafamiBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocargafamiBeanSwingJInternalFrameAdditional=tipocargafamiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCargaFamiLogic tipocargafamiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCargaFami tipocargafamiBean;
	public TipoCargaFamiConstantesFunciones tipocargafamiConstantesFunciones;
	//public TipoCargaFamiParameterReturnGeneral tipocargafamiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCargaFami> tipocargafamis;	
	//public List<TipoCargaFami> tipocargafamisEliminados;
	//public List<TipoCargaFami> tipocargafamisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCargaFami=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCargaFami=true;
	public Boolean isVisibilidadCeldaCopiarTipoCargaFami=true;
	public Boolean isVisibilidadCeldaVerFormTipoCargaFami=true;
	public Boolean isVisibilidadCeldaOrdenTipoCargaFami=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
	public Boolean isVisibilidadCeldaModificarTipoCargaFami=false;
	public Boolean isVisibilidadCeldaActualizarTipoCargaFami=false;
	public Boolean isVisibilidadCeldaEliminarTipoCargaFami=false;
	public Boolean isVisibilidadCeldaCancelarTipoCargaFami=false;
	public Boolean isVisibilidadCeldaGuardarTipoCargaFami=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;	
	
	
	
	public Long getiIdNuevoTipoCargaFami() {
		return this.iIdNuevoTipoCargaFami;
	}

	public void setiIdNuevoTipoCargaFami(Long iIdNuevoTipoCargaFami) {
		this.iIdNuevoTipoCargaFami = iIdNuevoTipoCargaFami;
	}
	
	public Long getidTipoCargaFamiActual() {
		return this.idTipoCargaFamiActual;
	}

	public void setidTipoCargaFamiActual(Long idTipoCargaFamiActual) {
		this.idTipoCargaFamiActual = idTipoCargaFamiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCargaFami gettipocargafami() {
		return this.tipocargafami;
	}

	public void settipocargafami(TipoCargaFami tipocargafami) {
		this.tipocargafami = tipocargafami;
	}
	
	public TipoCargaFami gettipocargafamiAux() {
		return this.tipocargafamiAux;
	}

	public void settipocargafamiAux(TipoCargaFami tipocargafamiAux) {
		this.tipocargafamiAux = tipocargafamiAux;
	}				
	
	public TipoCargaFami gettipocargafamiAnterior() {
		return this.tipocargafamiAnterior;
	}

	public void settipocargafamiAnterior(TipoCargaFami tipocargafamiAnterior) {
		this.tipocargafamiAnterior = tipocargafamiAnterior;
	}	
	
	public TipoCargaFami gettipocargafamiTotales() {
		return this.tipocargafamiTotales;
	}

	public void settipocargafamiTotales(TipoCargaFami tipocargafamiTotales) {
		this.tipocargafamiTotales = tipocargafamiTotales;
	}	
	
	public TipoCargaFami gettipocargafamiBean() {
		return this.tipocargafamiBean;
	}

	public void settipocargafamiBean(TipoCargaFami tipocargafamiBean) {
		this.tipocargafamiBean = tipocargafamiBean;
	}	
	
	public TipoCargaFamiParameterReturnGeneral gettipocargafamiReturnGeneral() {
		return this.tipocargafamiReturnGeneral;
	}

	public void settipocargafamiReturnGeneral(TipoCargaFamiParameterReturnGeneral tipocargafamiReturnGeneral) {
		this.tipocargafamiReturnGeneral = tipocargafamiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCargaFamiLogic getTipoCargaFamiLogic()	{		
		return tipocargafamiLogic;
	}

	public void setTipoCargaFamiLogic(TipoCargaFamiLogic tipocargafamiLogic) {
		this.tipocargafamiLogic = tipocargafamiLogic;
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
	
	public Boolean getIsEsNuevoTipoCargaFami() {
		return isEsNuevoTipoCargaFami;
	}

	public void setIsEsNuevoTipoCargaFami(Boolean isEsNuevoTipoCargaFami) {
		this.isEsNuevoTipoCargaFami = isEsNuevoTipoCargaFami;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCargaFami() {
		return esParaAccionDesdeFormularioTipoCargaFami;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCargaFami(Boolean esParaAccionDesdeFormularioTipoCargaFami) {
		this.esParaAccionDesdeFormularioTipoCargaFami = esParaAccionDesdeFormularioTipoCargaFami;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCargaFami() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCargaFamiConstantesFunciones.refrescarForeignKeysDescripcionesTipoCargaFami(this.tipocargafamiLogic.getTipoCargaFamis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCargaFamiConstantesFunciones.refrescarForeignKeysDescripcionesTipoCargaFami(this.tipocargafamis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocargafamiLogic.setTipoCargaFamis(this.tipocargafamis);
			tipocargafamiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCargaFamiParameterReturnGeneral getTipoCargaFamiParameterGeneral() {
		return this.tipocargafamiParameterGeneral;
	}
	
	public void setTipoCargaFamiParameterGeneral(TipoCargaFamiParameterReturnGeneral tipocargafamiParameterGeneral) {
		this.tipocargafamiParameterGeneral = tipocargafamiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCargaFami() {
		return isPermisoTodoTipoCargaFami;
	}

	public void setIsPermisoTodoTipoCargaFami(Boolean isPermisoTodoTipoCargaFami) {
		this.isPermisoTodoTipoCargaFami = isPermisoTodoTipoCargaFami;
	}

	public Boolean getIsPermisoNuevoTipoCargaFami() {
		return isPermisoNuevoTipoCargaFami;
	}

	public void setIsPermisoNuevoTipoCargaFami(Boolean isPermisoNuevoTipoCargaFami) {
		this.isPermisoNuevoTipoCargaFami = isPermisoNuevoTipoCargaFami;
	}

	public Boolean getIsPermisoActualizarTipoCargaFami() {
		return isPermisoActualizarTipoCargaFami;
	}

	public void setIsPermisoActualizarTipoCargaFami(Boolean isPermisoActualizarTipoCargaFami) {
		this.isPermisoActualizarTipoCargaFami = isPermisoActualizarTipoCargaFami;
	}

	public Boolean getIsPermisoEliminarTipoCargaFami() {
		return isPermisoEliminarTipoCargaFami;
	}

	public void setIsPermisoEliminarTipoCargaFami(Boolean isPermisoEliminarTipoCargaFami) {
		this.isPermisoEliminarTipoCargaFami = isPermisoEliminarTipoCargaFami;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCargaFami() {
		return isPermisoGuardarCambiosTipoCargaFami;
	}

	public void setIsPermisoGuardarCambiosTipoCargaFami(Boolean isPermisoGuardarCambiosTipoCargaFami) {
		this.isPermisoGuardarCambiosTipoCargaFami = isPermisoGuardarCambiosTipoCargaFami;
	}
	
	public Boolean getIsPermisoConsultaTipoCargaFami() {
		return isPermisoConsultaTipoCargaFami;
	}

	public void setIsPermisoConsultaTipoCargaFami(Boolean isPermisoConsultaTipoCargaFami) {
		this.isPermisoConsultaTipoCargaFami = isPermisoConsultaTipoCargaFami;
	}

	public Boolean getIsPermisoBusquedaTipoCargaFami() {
		return isPermisoBusquedaTipoCargaFami;
	}

	public void setIsPermisoBusquedaTipoCargaFami(Boolean isPermisoBusquedaTipoCargaFami) {
		this.isPermisoBusquedaTipoCargaFami = isPermisoBusquedaTipoCargaFami;
	}

	public Boolean getIsPermisoReporteTipoCargaFami() {
		return isPermisoReporteTipoCargaFami;
	}

	public void setIsPermisoReporteTipoCargaFami(Boolean isPermisoReporteTipoCargaFami) {
		this.isPermisoReporteTipoCargaFami = isPermisoReporteTipoCargaFami;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCargaFami() {
		return isPermisoPaginacionMedioTipoCargaFami;
	}

	public void setIsPermisoPaginacionMedioTipoCargaFami(Boolean isPermisoPaginacionMedioTipoCargaFami) {
		this.isPermisoPaginacionMedioTipoCargaFami = isPermisoPaginacionMedioTipoCargaFami;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCargaFami() {
		return isPermisoPaginacionTodoTipoCargaFami;
	}

	public void setIsPermisoPaginacionTodoTipoCargaFami(Boolean isPermisoPaginacionTodoTipoCargaFami) {
		this.isPermisoPaginacionTodoTipoCargaFami = isPermisoPaginacionTodoTipoCargaFami;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCargaFami() {
		return isPermisoPaginacionAltoTipoCargaFami;
	}

	public void setIsPermisoPaginacionAltoTipoCargaFami(Boolean isPermisoPaginacionAltoTipoCargaFami) {
		this.isPermisoPaginacionAltoTipoCargaFami = isPermisoPaginacionAltoTipoCargaFami;
	}
	
	public Boolean getIsPermisoCopiarTipoCargaFami() {
		return isPermisoCopiarTipoCargaFami;
	}

	public void setIsPermisoCopiarTipoCargaFami(Boolean isPermisoCopiarTipoCargaFami) {
		this.isPermisoCopiarTipoCargaFami = isPermisoCopiarTipoCargaFami;
	}
	
	public Boolean getIsPermisoVerFormTipoCargaFami() {
		return isPermisoVerFormTipoCargaFami;
	}

	public void setIsPermisoVerFormTipoCargaFami(Boolean isPermisoVerFormTipoCargaFami) {
		this.isPermisoVerFormTipoCargaFami = isPermisoVerFormTipoCargaFami;
	}
	
	public Boolean getIsPermisoDuplicarTipoCargaFami() {
		return isPermisoDuplicarTipoCargaFami;
	}

	public void setIsPermisoDuplicarTipoCargaFami(Boolean isPermisoDuplicarTipoCargaFami) {
		this.isPermisoDuplicarTipoCargaFami = isPermisoDuplicarTipoCargaFami;
	}
	
	public Boolean getIsPermisoOrdenTipoCargaFami() {
		return isPermisoOrdenTipoCargaFami;
	}

	public void setIsPermisoOrdenTipoCargaFami(Boolean isPermisoOrdenTipoCargaFami) {
		this.isPermisoOrdenTipoCargaFami = isPermisoOrdenTipoCargaFami;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCargaFami() {
		return isVisibilidadCeldaNuevoTipoCargaFami;
	}

	public void setIsVisibilidadCeldaNuevoTipoCargaFami(Boolean isVisibilidadCeldaNuevoTipoCargaFami) {
		this.isVisibilidadCeldaNuevoTipoCargaFami = isVisibilidadCeldaNuevoTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCargaFami() {
		return isVisibilidadCeldaDuplicarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCargaFami(Boolean isVisibilidadCeldaDuplicarTipoCargaFami) {
		this.isVisibilidadCeldaDuplicarTipoCargaFami = isVisibilidadCeldaDuplicarTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCargaFami() {
		return isVisibilidadCeldaCopiarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaCopiarTipoCargaFami(Boolean isVisibilidadCeldaCopiarTipoCargaFami) {
		this.isVisibilidadCeldaCopiarTipoCargaFami = isVisibilidadCeldaCopiarTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCargaFami() {
		return isVisibilidadCeldaVerFormTipoCargaFami;
	}

	public void setIsVisibilidadCeldaVerFormTipoCargaFami(Boolean isVisibilidadCeldaVerFormTipoCargaFami) {
		this.isVisibilidadCeldaVerFormTipoCargaFami = isVisibilidadCeldaVerFormTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCargaFami() {
		return isVisibilidadCeldaOrdenTipoCargaFami;
	}

	public void setIsVisibilidadCeldaOrdenTipoCargaFami(Boolean isVisibilidadCeldaOrdenTipoCargaFami) {
		this.isVisibilidadCeldaOrdenTipoCargaFami = isVisibilidadCeldaOrdenTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCargaFami() {
		return isVisibilidadCeldaNuevoRelacionesTipoCargaFami;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCargaFami(Boolean isVisibilidadCeldaNuevoRelacionesTipoCargaFami) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami = isVisibilidadCeldaNuevoRelacionesTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCargaFami() {
		return isVisibilidadCeldaModificarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaModificarTipoCargaFami(Boolean isVisibilidadCeldaModificarTipoCargaFami) {
		this.isVisibilidadCeldaModificarTipoCargaFami = isVisibilidadCeldaModificarTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCargaFami() {
		return isVisibilidadCeldaActualizarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaActualizarTipoCargaFami(Boolean isVisibilidadCeldaActualizarTipoCargaFami) {
		this.isVisibilidadCeldaActualizarTipoCargaFami = isVisibilidadCeldaActualizarTipoCargaFami;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCargaFami() {
		return isVisibilidadCeldaEliminarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaEliminarTipoCargaFami(Boolean isVisibilidadCeldaEliminarTipoCargaFami) {
		this.isVisibilidadCeldaEliminarTipoCargaFami = isVisibilidadCeldaEliminarTipoCargaFami;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCargaFami() {
		return isVisibilidadCeldaCancelarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaCancelarTipoCargaFami(Boolean isVisibilidadCeldaCancelarTipoCargaFami) {
		this.isVisibilidadCeldaCancelarTipoCargaFami = isVisibilidadCeldaCancelarTipoCargaFami;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCargaFami() {
		return isVisibilidadCeldaGuardarTipoCargaFami;
	}

	public void setIsVisibilidadCeldaGuardarTipoCargaFami(Boolean isVisibilidadCeldaGuardarTipoCargaFami) {
		this.isVisibilidadCeldaGuardarTipoCargaFami = isVisibilidadCeldaGuardarTipoCargaFami;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCargaFami() {
		return isVisibilidadCeldaGuardarCambiosTipoCargaFami;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCargaFami(Boolean isVisibilidadCeldaGuardarCambiosTipoCargaFami) {
		this.isVisibilidadCeldaGuardarCambiosTipoCargaFami = isVisibilidadCeldaGuardarCambiosTipoCargaFami;
	}
		
	public TipoCargaFamiSessionBean gettipocargafamiSessionBean() {
		return this.tipocargafamiSessionBean;
	}
	
	public void settipocargafamiSessionBean(TipoCargaFamiSessionBean tipocargafamiSessionBean) {
		this.tipocargafamiSessionBean=tipocargafamiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(TipoCargaFami tipocargafami)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCargaFami tipocargafami,TipoCargaFami tipocargafamiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCargaFami(tipocargafami);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocargafamiAux.setId(tipocargafami.getId());
		tipocargafamiAux.setVersionRow(tipocargafami.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCargaFami();
		
			int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocargafamiValidator.getInvalidValues(this.tipocargafami);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocargafamiLogic.setDatosCliente(datosCliente);
			tipocargafamiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocargafamiAux=new  TipoCargaFami();
				
				tipocargafamiAux.setIsNew(true);
				tipocargafamiAux.setIsChanged(true);
				
				tipocargafamiAux.setTipoCargaFamiOriginal(this.tipocargafami);
				
				tipocargafamiAux.setId(this.tipocargafami.getId());	
				tipocargafamiAux.setVersionRow(this.tipocargafami.getVersionRow());	
				tipocargafamiAux.setcodigo(this.tipocargafami.getcodigo());	
				tipocargafamiAux.setnombre(this.tipocargafami.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocargafamiAux,tipocargafamiLogic.getTipoCargaFamis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargafamiAux,tipocargafamis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargafamiLogic.saveTipoCargaFamis();//WithConnection
						//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocargafami,tipocargafamiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars().addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms.addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars.addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocargafamiLogic.saveTipoCargaFamiRelaciones(tipocargafamiAux,this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());//WithConnection
								//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocargafami,tipocargafamiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars= new ArrayList<CargaFamiliar>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargafamiAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargafamiAux.setCargaFamiliars(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocargafamiAux,tipocargafamiLogic.getTipoCargaFamis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocargafamiAux,tipocargafamis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocargafami,tipocargafamiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocargafamiAux=new  TipoCargaFami();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocargafamiSessionBean.getEsGuardarRelacionado() && this.tipocargafami.getId()>=0)) {
						
					tipocargafamiAux.setIsNew(false);
				}
				
				tipocargafamiAux.setIsDeleted(false);
			
				tipocargafamiAux.setId(this.tipocargafami.getId());	
				tipocargafamiAux.setVersionRow(this.tipocargafami.getVersionRow());	
				tipocargafamiAux.setcodigo(this.tipocargafami.getcodigo());	
				tipocargafamiAux.setnombre(this.tipocargafami.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocargafamiAux,tipocargafamiLogic.getTipoCargaFamis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargafamiAux,tipocargafamis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargafamiLogic.saveTipoCargaFamis();//WithConnection
						//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocargafami,tipocargafamiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars().addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms.addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars.addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocargafamiLogic.saveTipoCargaFamiRelaciones(tipocargafamiAux,this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());//WithConnection
								//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocargafami,tipocargafamiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars= new ArrayList<CargaFamiliar>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargafamiAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargafamiAux.setCargaFamiliars(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocargafamiAux,tipocargafamiLogic.getTipoCargaFamis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocargafamiAux,tipocargafamis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocargafami,tipocargafamiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocargafamiAux=new  TipoCargaFami();
				
				tipocargafamiAux.setIsNew(false);
				tipocargafamiAux.setIsChanged(false);
				
				tipocargafamiAux.setIsDeleted(true);
				
				tipocargafamiAux.setId(this.tipocargafami.getId());	
				tipocargafamiAux.setVersionRow(this.tipocargafami.getVersionRow());	
				tipocargafamiAux.setcodigo(this.tipocargafami.getcodigo());	
				tipocargafamiAux.setnombre(this.tipocargafami.getnombre());	
				
				if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocargafamiAux.getId()>=0) {	
						this.tipocargafamisEliminados.add(tipocargafamiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocargafamiAux,tipocargafamiLogic.getTipoCargaFamis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargafamiAux,tipocargafamis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargafamiLogic.saveTipoCargaFamis();//WithConnection
						//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs().addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars().addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms.addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmsEliminados);
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars.addAll(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocargafamiLogic.saveTipoCargaFamiRelaciones(tipocargafamiAux,this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs(),this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());//WithConnection
								//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(new ArrayList<CargaFamiliar_NM>());
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(new ArrayList<CargaFamiliar>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms= new ArrayList<CargaFamiliar_NM>();
							this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars= new ArrayList<CargaFamiliar>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargafamiAux.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());

							if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocargafamiAux.setCargaFamiliars(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocargafamiAux,tipocargafamiLogic.getTipoCargaFamis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocargafamiAux,tipocargafamis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.getTipoCargaFamis().addAll(this.tipocargafamisEliminados);
					
					tipocargafamiLogic.saveTipoCargaFamis();//WithConnection
					//tipocargafamiLogic.getSetVersionRowTipoCargaFamis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocargafamisEliminados= new ArrayList<TipoCargaFami>();		
			}
			
			if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Carga Fami GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocargafami=tipocargafamiAux;
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
      		//this.finishProcessTipoCargaFami();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCargaFami tipocargafamiLocal) throws Exception {
		
		if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocargafamiLocal.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
				tipocargafamiLocal.setCargaFamiliars(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
			
			} else {
			
				tipocargafamiLocal.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nms);
				tipocargafamiLocal.setCargaFamiliars(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliars);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCargaFami tipocargafamiLocal) throws Exception {	
		if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCargaFamiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocargafamiValidator.getInvalidValues(this.tipocargafami);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCargaFami tipocargafami,List<TipoCargaFami> tipocargafamis) throws Exception {
		try	{		
			TipoCargaFamiConstantesFunciones.actualizarLista(tipocargafami,tipocargafamis,this.tipocargafamiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCargaFami tipocargafami,List<TipoCargaFami> tipocargafamis) throws Exception {
		try	{			
			TipoCargaFamiConstantesFunciones.actualizarSelectedLista(tipocargafami,tipocargafamis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCargaFami> tipocargafamisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocargafamisLocal=this.tipocargafamiLogic.getTipoCargaFamis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocargafamisLocal=this.tipocargafamis;
			}
			//ARCHITECTURE
		
			for(TipoCargaFami tipocargafamiLocal:tipocargafamisLocal) {
				if(this.permiteMantenimiento(tipocargafamiLocal) && tipocargafamiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCargaFamiConstantesFunciones.getTipoCargaFamiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCargaFamiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargaFami.jLabelcodigoTipoCargaFami,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCargaFamiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargaFami.jLabelnombreTipoCargaFami,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCargaFami.jLabelcodigoTipoCargaFami,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCargaFami.jLabelnombreTipoCargaFami,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CargaFamiliar_NM")) {
			if(this.tipocargafami==null) {
				this.tipocargafami= new TipoCargaFami();
			}

			if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCargaFami
				this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);

				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.getcargafamiliar_nm().setTipoCargaFami(this.tipocargafami);
			}

			return;
		}
		 else  if(sTipo.equals("CargaFamiliar")) {
			if(this.tipocargafami==null) {
				this.tipocargafami= new TipoCargaFami();
			}

			if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCargaFami
				this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);

				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.getcargafamiliar().setTipoCargaFami(this.tipocargafami);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCargaFami--;	
		
		
		this.tipocargafamiAux=new TipoCargaFami();
		
		this.tipocargafamiAux.setId(this.iIdNuevoTipoCargaFami);
		this.tipocargafamiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocargafamiLogic.getTipoCargaFamis().add(this.tipocargafamiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocargafamis.add(this.tipocargafamiAux);
		}
		//ARCHITECTURE
		
		this.tipocargafami=this.tipocargafamiAux;
		
		if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCargaFami(this.tipocargafami);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCargaFami(this.tipocargafami);
		}
				
		//this.setDefaultControlesTipoCargaFami();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCargaFami();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCargaFami();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCargaFami();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCargaFami(this.tipocargafamiBean,this.tipocargafami,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCargaFamiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
			classes=TipoCargaFamiConstantesFunciones.getClassesRelationshipsOfTipoCargaFami(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocargafamiReturnGeneral=tipocargafamiLogic.procesarEventosTipoCargaFamisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocargafamiLogic.getTipoCargaFamis(),this.tipocargafami,this.tipocargafamiParameterGeneral,this.isEsNuevoTipoCargaFami,classes);//this.tipocargafamiLogic.getTipoCargaFami()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCargaFami(this.tipocargafamiReturnGeneral,this.tipocargafamiBean,false);
		
		if(this.tipocargafamiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami());
		}
		
		if(this.tipocargafamiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami(),classes);//this.tipocargafamiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCargaFami();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCargaFami();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.RecargarFormTipoCargaFami(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCargaFami(false);
						
			if(tipocargafamiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliar_NMActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado() && CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliarActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCargaFami();
			}
			
			this.actualizarVisualTableDatosTipoCargaFami();
			
			this.jTableDatosTipoCargaFami.setRowSelectionInterval(this.getIndiceNuevoTipoCargaFami(), this.getIndiceNuevoTipoCargaFami());
			
			this.seleccionarFilaTablaTipoCargaFamiActual();
						
			this.actualizarEstadoCeldasBotonesTipoCargaFami("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCargaFami(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setEnabled(isHabilitar && this.tipocargafamiConstantesFunciones.activarcodigoTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setEnabled(isHabilitar && this.tipocargafamiConstantesFunciones.activarnombreTipoCargaFami);	
		
	};
	
	public void setDefaultControlesTipoCargaFami() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCargaFami(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocargafamiSessionBean.setConGuardarRelaciones(true);			
			this.tipocargafamiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocargafamiSessionBean.setConGuardarRelaciones(false);			
			this.tipocargafamiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCargaFami() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
				if(tipocargafamiAux.getId().equals(this.iIdNuevoTipoCargaFami)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargaFami tipocargafamiAux:this.tipocargafamis) {
				if(tipocargafamiAux.getId().equals(this.iIdNuevoTipoCargaFami)) {
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
	
	public int getIndiceActualTipoCargaFami(TipoCargaFami tipocargafami,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
				if(tipocargafamiAux.getId().equals(tipocargafami.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargaFami tipocargafamiAux:this.tipocargafamis) {
				if(tipocargafamiAux.getId().equals(tipocargafami.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCargaFami(TipoCargaFami tipocargafamiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
				if(tipocargafamiAux.getTipoCargaFamiOriginal().getId().equals(tipocargafamiOriginal.getId())) {
					existe=true;
					tipocargafamiOriginal.setId(tipocargafamiAux.getId());
					tipocargafamiOriginal.setVersionRow(tipocargafamiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargaFami tipocargafamiAux:this.tipocargafamis) {
				if(tipocargafamiAux.getTipoCargaFamiOriginal().getId().equals(tipocargafamiOriginal.getId())) {
					existe=true;
					tipocargafamiOriginal.setId(tipocargafamiAux.getId());
					tipocargafamiOriginal.setVersionRow(tipocargafamiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCargaFami(Boolean esParaCancelar) throws Exception {
		tipocargafamisAux=new ArrayList<TipoCargaFami>();
		tipocargafamiAux=new TipoCargaFami();
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
					if(tipocargafamiAux.getId()<0) {
						tipocargafamisAux.add(tipocargafamiAux);
					}		
				}
				this.iIdNuevoTipoCargaFami=0L;
				this.tipocargafamiLogic.getTipoCargaFamis().removeAll(tipocargafamisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargaFami tipocargafamiAux:this.tipocargafamis) {
					if(tipocargafamiAux.getId()<0) {
						tipocargafamisAux.add(tipocargafamiAux);
					}		
				}
				this.iIdNuevoTipoCargaFami=0L;
				this.tipocargafamis.removeAll(tipocargafamisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCargaFami 
					&& this.tipocargafamiLogic.getTipoCargaFamis().size()>0
					) {
					tipocargafamiAux=this.tipocargafamiLogic.getTipoCargaFamis().get(this.tipocargafamiLogic.getTipoCargaFamis().size() - 1);
				
					if(tipocargafamiAux.getId()<0) {
						this.tipocargafamiLogic.getTipoCargaFamis().remove(tipocargafamiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCargaFami && this.tipocargafamis.size()>0) {
					tipocargafamiAux=this.tipocargafamis.get(this.tipocargafamis.size() - 1);
				
					if(tipocargafamiAux.getId()<0) {
						this.tipocargafamis.remove(tipocargafamiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCargaFami(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocargafami.getId()<0) {
				this.tipocargafamiLogic.getTipoCargaFamis().remove(this.tipocargafami);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocargafami.getId()<0) {
				this.tipocargafamis.remove(this.tipocargafami);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCargaFami(List<TipoCargaFami> tipocargafamisAux) throws Exception {
		TipoCargaFamiConstantesFunciones.setEstadosInicialesTipoCargaFami(tipocargafamisAux);
	}
	
	public void setEstadosInicialesTipoCargaFami(TipoCargaFami tipocargafamiAux) throws Exception {
		TipoCargaFamiConstantesFunciones.setEstadosInicialesTipoCargaFami(tipocargafamiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCargaFamiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCargaFami("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCargaFamiActual()) {
				if(!this.isEsNuevoTipoCargaFami) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCargaFami("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCargaFami=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCargaFamiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Carga Fami ?", "MANTENIMIENTO DE Tipo Carga Fami", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCargaFami("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCargaFami tipocargafami) throws Exception {
		TipoCargaFamiConstantesFunciones.seleccionarAsignar(this.tipocargafami,tipocargafami);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCargaFami=this.isPermisoActualizarOriginalTipoCargaFami;
			
			
			this.seleccionarAsignar(tipocargafami);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCargaFamiConstantesFunciones.quitarEspaciosTipoCargaFami(this.tipocargafami,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCargaFami("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocargafamiSessionBean.setsFuncionBusquedaRapida(this.tipocargafamiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCargaFami) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCargaFami(esParaCancelar);				
				this.cancelarNuevoTipoCargaFami(esParaCancelar);								
			}
			
			this.tipocargafami=new TipoCargaFami();
			
			this.inicializarTipoCargaFami();
			
			this.actualizarEstadoCeldasBotonesTipoCargaFami("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCargaFami() throws Exception {
		try {
			TipoCargaFamiConstantesFunciones.inicializarTipoCargaFami(this.tipocargafami);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocargafamiLogic.getTipoCargaFamis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCargaFamis(String sAccionBusqueda,List<TipoCargaFami> tipocargafamisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCargaFami"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCargaFamiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCargaFamiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCargaFami"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Carga Famis");		
		parameters.put("busquedapor", TipoCargaFamiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CargaFamiliar_NM.class));
			classes.add(new Classe(CargaFamiliar.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCargaFamiLogic tipocargafamiLogicAuxiliar=new TipoCargaFamiLogic();
					tipocargafamiLogicAuxiliar.setDatosCliente(tipocargafamiLogic.getDatosCliente());				
					tipocargafamiLogicAuxiliar.setTipoCargaFamis(tipocargafamisParaReportes);
					
					tipocargafamiLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCargaFamiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocargafamisParaReportes=tipocargafamiLogicAuxiliar.getTipoCargaFamis();
					
					//tipocargafamiLogic.getNewConnexionToDeep();
					
					//for (TipoCargaFami tipocargafami:tipocargafamisParaReportes) {
					//	tipocargafamiLogic.deepLoad(tipocargafami, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocargafamiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocargafamiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCargaFamiliar_NM = AuxiliarReportes.class.getResourceAsStream("CargaFamiliar_NMDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargafamiliar_nm", reportFileCargaFamiliar_NM);

			InputStream reportFileCargaFamiliar = AuxiliarReportes.class.getResourceAsStream("CargaFamiliarDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargafamiliar", reportFileCargaFamiliar);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCargaFami=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCargaFamiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCargaFamiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCargaFami=new JRBeanArrayDataSource(TipoCargaFamiJInternalFrame.TraerTipoCargaFamiBeans(tipocargafamisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCargaFami);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCargaFamiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCargaFamiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCargaFamiBean.TraerTipoCargaFamiBeans(tipocargafamisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCargaFamis(sAccionBusqueda,sTipoArchivoReporte,tipocargafamisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCargaFamis(sAccionBusqueda,sTipoArchivoReporte,tipocargafamisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCargaFamiActionPerformed(null);
					//this.generarExcelReporteTipoCargaFamis(sAccionBusqueda,sTipoArchivoReporte,tipocargafamisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCargaFamis(sAccionBusqueda,sTipoArchivoReporte,tipocargafamisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCargaFamis(sAccionBusqueda,sTipoArchivoReporte,tipocargafamisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCargaFamis(sAccionBusqueda,sTipoArchivoReporte,tipocargafamisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCargaFamis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCargaFami> tipocargafamisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCargaFamis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCargaFami("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCargaFami tipocargafami : tipocargafamisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCargaFamiConstantesFunciones.generarExcelReporteDataTipoCargaFami("NORMAL",row,workbook,tipocargafami,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCargaFami(String sTipo,Row row,Workbook workbook) {
		
		TipoCargaFamiConstantesFunciones.generarExcelReporteHeaderTipoCargaFami(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCargaFamis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCargaFami> tipocargafamisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCargaFamis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCargaFami tipocargafami : tipocargafamisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCargaFamiConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafami));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCargaFamiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocargafami.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocargafami.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCargaFamis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCargaFami> tipocargafamisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCargaFami> tipocargafamisRespaldo=null;
		
		classes=TipoCargaFamiConstantesFunciones.getClassesRelationshipsOfTipoCargaFami(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocargafamiLogic.setDatosCliente(this.datosCliente);
		this.tipocargafamiLogic.setDatosDeep(this.datosDeep);
		this.tipocargafamiLogic.setIsConDeep(true);
		
		tipocargafamisRespaldo=this.tipocargafamiLogic.getTipoCargaFamis();
		
		this.tipocargafamiLogic.setTipoCargaFamis(tipocargafamisParaReportes);	
		this.tipocargafamiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocargafamisParaReportes=this.tipocargafamiLogic.getTipoCargaFamis();
		this.tipocargafamiLogic.setTipoCargaFamis(tipocargafamisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCargaFamis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCargaFami("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCargaFami tipocargafami : tipocargafamisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCargaFami("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCargaFamiConstantesFunciones.generarExcelReporteDataTipoCargaFami("NORMAL",row,workbook,tipocargafami,cellStyleDataAux);
		
			
			


				//CargaFamiliar_NM
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocargafami.getCargaFamiliar_NMs()!=null && tipocargafami.getCargaFamiliar_NMs().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargaFamiliar_NMConstantesFunciones.generarExcelReporteHeaderCargaFamiliar_NM("RELACIONADO",row,workbook);
				}

				if(tipocargafami.getCargaFamiliar_NMs()!=null) {
					i2=0;
					for(CargaFamiliar_NM cargafamiliar_nm : tipocargafami.getCargaFamiliar_NMs()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargaFamiliar_NMConstantesFunciones.generarExcelReporteDataCargaFamiliar_NM("RELACIONADO",row,workbook,cargafamiliar_nm,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CargaFamiliar
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocargafami.getCargaFamiliars()!=null && tipocargafami.getCargaFamiliars().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargaFamiliarConstantesFunciones.generarExcelReporteHeaderCargaFamiliar("RELACIONADO",row,workbook);
				}

				if(tipocargafami.getCargaFamiliars()!=null) {
					i2=0;
					for(CargaFamiliar cargafamiliar : tipocargafami.getCargaFamiliars()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargaFamiliarConstantesFunciones.generarExcelReporteDataCargaFamiliar("RELACIONADO",row,workbook,cargafamiliar,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCargaFamiConstantesFunciones.getTipoCargaFamiDescripcion(tipocargafami));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCargaFami.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCargaFami() throws Exception {		
		this.startProcessTipoCargaFami(true);
	}
	
	public void startProcessTipoCargaFami(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCargaFami, this.jScrollPanelDatosTipoCargaFami,this.jPanelPaginacionTipoCargaFami, this.jScrollPanelDatosEdicionTipoCargaFami, this.jPanelAccionesTipoCargaFami,this.jPanelAccionesFormularioTipoCargaFami,this.jmenuBarTipoCargaFami,this.jmenuBarDetalleTipoCargaFami,this.jTtoolBarTipoCargaFami,this.jTtoolBarDetalleTipoCargaFami);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCargaFami=null; 
		
		final JPanel jPanelParametrosReportesTipoCargaFami=this.jPanelParametrosReportesTipoCargaFami;
		//final JScrollPane jScrollPanelDatosTipoCargaFami=this.jScrollPanelDatosTipoCargaFami;
		final JTable jTableDatosTipoCargaFami=this.jTableDatosTipoCargaFami;		
		final JPanel jPanelPaginacionTipoCargaFami=this.jPanelPaginacionTipoCargaFami;
		//final JScrollPane jScrollPanelDatosEdicionTipoCargaFami=this.jScrollPanelDatosEdicionTipoCargaFami;
		final JPanel jPanelAccionesTipoCargaFami=this.jPanelAccionesTipoCargaFami;
		
		JPanel jPanelCamposAuxiliarTipoCargaFami=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCargaFami=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			jPanelCamposAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jPanelCamposTipoCargaFami;
			jPanelAccionesFormularioAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jPanelAccionesFormularioTipoCargaFami;
		}
		
		final JPanel jPanelCamposTipoCargaFami=jPanelCamposAuxiliarTipoCargaFami;
		final JPanel jPanelAccionesFormularioTipoCargaFami=jPanelAccionesFormularioAuxiliarTipoCargaFami;
		
		
		final JMenuBar jmenuBarTipoCargaFami=this.jmenuBarTipoCargaFami;
		final JToolBar jTtoolBarTipoCargaFami=this.jTtoolBarTipoCargaFami;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCargaFami=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCargaFami=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			jmenuBarDetalleAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jmenuBarDetalleTipoCargaFami;
			jTtoolBarDetalleAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jTtoolBarDetalleTipoCargaFami;
		}
		
		final JMenuBar jmenuBarDetalleTipoCargaFami=jmenuBarDetalleAuxiliarTipoCargaFami;
		final JToolBar jTtoolBarDetalleTipoCargaFami=jTtoolBarDetalleAuxiliarTipoCargaFami;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCargaFami;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCargaFami;
			processRunnable.jTableDatos=jTableDatosTipoCargaFami;
			processRunnable.jPanelCampos=jPanelCamposTipoCargaFami;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCargaFami;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCargaFami;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCargaFami;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCargaFami;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCargaFami;
			processRunnable.jTtoolBar=jTtoolBarTipoCargaFami;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCargaFami;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCargaFami ,jPanelParametrosReportesTipoCargaFami,jTableDatosTipoCargaFami, /*jScrollPanelDatosTipoCargaFami,*/jPanelCamposTipoCargaFami,jPanelPaginacionTipoCargaFami, /*jScrollPanelDatosEdicionTipoCargaFami,*/ jPanelAccionesTipoCargaFami,jPanelAccionesFormularioTipoCargaFami,jmenuBarTipoCargaFami,jmenuBarDetalleTipoCargaFami,jTtoolBarTipoCargaFami,jTtoolBarDetalleTipoCargaFami);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCargaFami, jScrollPanelDatosTipoCargaFami,jPanelPaginacionTipoCargaFami, jScrollPanelDatosEdicionTipoCargaFami, jPanelAccionesTipoCargaFami,jPanelAccionesFormularioTipoCargaFami,jmenuBarTipoCargaFami,jmenuBarDetalleTipoCargaFami,jTtoolBarTipoCargaFami,jTtoolBarDetalleTipoCargaFami);
						
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
	
	public void finishProcessTipoCargaFami() {// throws Exception 
		this.finishProcessTipoCargaFami(true);
	}
	
	public void finishProcessTipoCargaFami(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCargaFami, this.jScrollPanelDatosTipoCargaFami,this.jPanelPaginacionTipoCargaFami, this.jScrollPanelDatosEdicionTipoCargaFami, this.jPanelAccionesTipoCargaFami,this.jPanelAccionesFormularioTipoCargaFami,this.jmenuBarTipoCargaFami,this.jmenuBarDetalleTipoCargaFami,this.jTtoolBarTipoCargaFami,this.jTtoolBarDetalleTipoCargaFami);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCargaFami=null; 
		
		final JPanel jPanelParametrosReportesTipoCargaFami=this.jPanelParametrosReportesTipoCargaFami;
		//final JScrollPane jScrollPanelDatosTipoCargaFami=this.jScrollPanelDatosTipoCargaFami;
		final JTable jTableDatosTipoCargaFami=this.jTableDatosTipoCargaFami;		
		final JPanel jPanelPaginacionTipoCargaFami=this.jPanelPaginacionTipoCargaFami;
		//final JScrollPane jScrollPanelDatosEdicionTipoCargaFami=this.jScrollPanelDatosEdicionTipoCargaFami;
		final JPanel jPanelAccionesTipoCargaFami=this.jPanelAccionesTipoCargaFami;
		
		JPanel jPanelCamposAuxiliarTipoCargaFami=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCargaFami=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			jPanelCamposAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jPanelCamposTipoCargaFami;
			jPanelAccionesFormularioAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jPanelAccionesFormularioTipoCargaFami;
		}
		
		final JPanel jPanelCamposTipoCargaFami=jPanelCamposAuxiliarTipoCargaFami;
		final JPanel jPanelAccionesFormularioTipoCargaFami=jPanelAccionesFormularioAuxiliarTipoCargaFami;
		
		
		final JMenuBar jmenuBarTipoCargaFami=this.jmenuBarTipoCargaFami;		
		final JToolBar jTtoolBarTipoCargaFami=this.jTtoolBarTipoCargaFami;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCargaFami=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCargaFami=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			jmenuBarDetalleAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jmenuBarDetalleTipoCargaFami;
			jTtoolBarDetalleAuxiliarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jTtoolBarDetalleTipoCargaFami;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCargaFami=jmenuBarDetalleAuxiliarTipoCargaFami;
		final JToolBar jTtoolBarDetalleTipoCargaFami=jTtoolBarDetalleAuxiliarTipoCargaFami;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCargaFami;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCargaFami;
			processRunnable.jTableDatos=jTableDatosTipoCargaFami;
			processRunnable.jPanelCampos=jPanelCamposTipoCargaFami;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCargaFami;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCargaFami;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCargaFami;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCargaFami;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCargaFami;
			processRunnable.jTtoolBar=jTtoolBarTipoCargaFami;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCargaFami;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCargaFami ,jPanelParametrosReportesTipoCargaFami, jTableDatosTipoCargaFami,/*jScrollPanelDatosTipoCargaFami,*/jPanelCamposTipoCargaFami,jPanelPaginacionTipoCargaFami, /*jScrollPanelDatosEdicionTipoCargaFami,*/ jPanelAccionesTipoCargaFami,jPanelAccionesFormularioTipoCargaFami,jmenuBarTipoCargaFami,jmenuBarDetalleTipoCargaFami,jTtoolBarTipoCargaFami,jTtoolBarDetalleTipoCargaFami));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCargaFami(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCargaFami(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCargaFami(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCargaFami(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCargaFami,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCargaFami,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCargaFami(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCargaFami,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCargaFami,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocargafamiConstantesFunciones.getsFinalQueryTipoCargaFami();
		String  finalQueryPaginacionTodos=this.tipocargafamiConstantesFunciones.getsFinalQueryTipoCargaFami();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCargaFamiConstantesFunciones.getArrayColumnasGlobalesNoTipoCargaFami(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCargaFamiConstantesFunciones.getArrayColumnasGlobalesTipoCargaFami(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCargaFamiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocargafamisEliminados= new ArrayList<TipoCargaFami>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCargaFami();
		
				///*TipoCargaFamiSessionBean*/this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
			
			if(this.tipocargafamiSessionBean==null) {
				this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
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
					this.iNumeroPaginacion=TipoCargaFamiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCargaFamiConstantesFunciones.getClassesForeignKeysOfTipoCargaFami(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocargafami."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocargafamisAux= new ArrayList<TipoCargaFami>();
			
				
			tipocargafamiLogic.setDatosCliente(this.datosCliente);
			tipocargafamiLogic.setDatosDeep(this.datosDeep);
			tipocargafamiLogic.setIsConDeep(true);
			
			
			tipocargafamiLogic.getTipoCargaFamiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocargafamiLogic.getTodosTipoCargaFamis(finalQueryGlobal,pagination);
					
					//tipocargafamiLogic.getTodosTipoCargaFamisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocargafamiLogic.getTipoCargaFamis()==null|| tipocargafamiLogic.getTipoCargaFamis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocargafamisAux= new ArrayList<TipoCargaFami>();
							tipocargafamisAux.addAll(tipocargafamiLogic.getTipoCargaFamis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargafamisAux= new ArrayList<TipoCargaFami>();
							tipocargafamisAux.addAll(tipocargafamis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocargafamiLogic.getTodosTipoCargaFamis(finalQueryGlobal+"",this.pagination);												
							
							//tipocargafamiLogic.getTodosTipoCargaFamisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCargaFamis("Todos",tipocargafamiLogic.getTipoCargaFamis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocargafamiLogic.setTipoCargaFamis(new ArrayList<TipoCargaFami>());					
							tipocargafamiLogic.getTipoCargaFamis().addAll(tipocargafamisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargafamis=new ArrayList<TipoCargaFami>();
							tipocargafamis.addAll(tipocargafamisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCargaFami=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCargaFami=this.idActual;
				
				} else if(this.idTipoCargaFamiActual!=null && this.idTipoCargaFamiActual!=0L) {
					idTipoCargaFami=idTipoCargaFamiActual;
				}
				
					
				this.sDetalleReporte=TipoCargaFamiConstantesFunciones.getDetalleIndicePorId(idTipoCargaFami);
				
				this.tipocargafamis=new ArrayList<TipoCargaFami>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocargafamiLogic.getEntity(idTipoCargaFami);
					
					//tipocargafamiLogic.getEntityWithConnection(idTipoCargaFami);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargafamiLogic.setTipoCargaFamis(new ArrayList<TipoCargaFami>());
					tipocargafamiLogic.getTipoCargaFamis().add(tipocargafamiLogic.getTipoCargaFami());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocargafamis=new ArrayList<TipoCargaFami>();
					this.tipocargafamis.add(tipocargafami);
				}
				
				if(tipocargafamiLogic.getTipoCargaFami()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCargaFami();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCargaFami();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocargafamiLogic.getTipoCargaFamis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocargafamis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocargafamiLogic.getTipoCargaFamis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocargafamis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCargaFami tipocargafami) {
		Boolean permite=true;
		
		if(this.tipocargafami.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCargaFamiConstantesFunciones.getOrderByListaTipoCargaFami();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCargaFamiConstantesFunciones.getOrderByListaTipoCargaFami();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargaFami tipocargafami:tipocargafamiLogic.getTipoCargaFamis()) {
				if(tipocargafami.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargafamiTotales=tipocargafami;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargaFami tipocargafami:this.tipocargafamis) {
				if(tipocargafami.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargafamiTotales=tipocargafami;
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
			this.tipocargafamiAux=new TipoCargaFami();
			this.tipocargafamiAux.setsType(Constantes2.S_TOTALES);
			this.tipocargafamiAux.setIsNew(false);
			this.tipocargafamiAux.setIsChanged(false);
			this.tipocargafamiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCargaFamiConstantesFunciones.TotalizarValoresFilaTipoCargaFami(this.tipocargafamiLogic.getTipoCargaFamis(),this.tipocargafamiAux);
				
				this.tipocargafamiLogic.getTipoCargaFamis().add(this.tipocargafamiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCargaFamiConstantesFunciones.TotalizarValoresFilaTipoCargaFami(this.tipocargafamis,this.tipocargafamiAux);
				
				this.tipocargafamis.add(this.tipocargafamiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocargafamiTotales=new TipoCargaFami();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocargafamiLogic.getTipoCargaFamis().remove(tipocargafamiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocargafamis.remove(tipocargafamiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocargafamiTotales=new TipoCargaFami();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCargaFami tipocargafami:tipocargafamiLogic.getTipoCargaFamis()) {
				if(tipocargafami.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargafamiTotales=tipocargafami;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCargaFamiConstantesFunciones.TotalizarValoresFilaTipoCargaFami(this.tipocargafamiLogic.getTipoCargaFamis(),tipocargafamiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCargaFami tipocargafami:this.tipocargafamis) {
				if(tipocargafami.getsType().equals(Constantes2.S_TOTALES)) {
					tipocargafamiTotales=tipocargafami;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCargaFamiConstantesFunciones.TotalizarValoresFilaTipoCargaFami(this.tipocargafamis,tipocargafamiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCargaFami() {
		this.isPermisoTodoTipoCargaFami=false;
		this.isPermisoNuevoTipoCargaFami=false;
		this.isPermisoActualizarTipoCargaFami=false;
		this.isPermisoActualizarOriginalTipoCargaFami=false;
		this.isPermisoEliminarTipoCargaFami=false;
		this.isPermisoGuardarCambiosTipoCargaFami=false;
		this.isPermisoConsultaTipoCargaFami=false;
		this.isPermisoBusquedaTipoCargaFami=false;
		this.isPermisoReporteTipoCargaFami=false;		
		this.isPermisoOrdenTipoCargaFami=false;		
		this.isPermisoPaginacionMedioTipoCargaFami=false;		
		this.isPermisoPaginacionAltoTipoCargaFami=false;
		this.isPermisoPaginacionTodoTipoCargaFami=false;
		this.isPermisoCopiarTipoCargaFami=false;		
		this.isPermisoVerFormTipoCargaFami=false;		
		this.isPermisoDuplicarTipoCargaFami=false;		
		this.isPermisoOrdenTipoCargaFami=false;		
	}
	
	public void setPermisosUsuarioTipoCargaFami(Boolean isPermiso) {
		this.isPermisoTodoTipoCargaFami=isPermiso;
		this.isPermisoNuevoTipoCargaFami=isPermiso;
		this.isPermisoActualizarTipoCargaFami=isPermiso;
		this.isPermisoActualizarOriginalTipoCargaFami=isPermiso;
		this.isPermisoEliminarTipoCargaFami=isPermiso;
		this.isPermisoGuardarCambiosTipoCargaFami=isPermiso;
		this.isPermisoConsultaTipoCargaFami=isPermiso;
		this.isPermisoBusquedaTipoCargaFami=isPermiso;
		this.isPermisoReporteTipoCargaFami=isPermiso;
		this.isPermisoOrdenTipoCargaFami=isPermiso;		
		this.isPermisoPaginacionMedioTipoCargaFami=isPermiso;		
		this.isPermisoPaginacionAltoTipoCargaFami=isPermiso;		
		this.isPermisoPaginacionTodoTipoCargaFami=isPermiso;		
		this.isPermisoCopiarTipoCargaFami=isPermiso;		
		this.isPermisoVerFormTipoCargaFami=isPermiso;		
		this.isPermisoDuplicarTipoCargaFami=isPermiso;
		this.isPermisoOrdenTipoCargaFami=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCargaFami(Boolean isPermiso) {
		//this.isPermisoTodoTipoCargaFami=isPermiso;
		this.isPermisoNuevoTipoCargaFami=isPermiso;
		this.isPermisoActualizarTipoCargaFami=isPermiso;
		this.isPermisoActualizarOriginalTipoCargaFami=isPermiso;
		this.isPermisoEliminarTipoCargaFami=isPermiso;
		this.isPermisoGuardarCambiosTipoCargaFami=isPermiso;
		//this.isPermisoConsultaTipoCargaFami=isPermiso;
		//this.isPermisoBusquedaTipoCargaFami=isPermiso;
		//this.isPermisoReporteTipoCargaFami=isPermiso;
		//this.isPermisoOrdenTipoCargaFami=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCargaFami=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCargaFami=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCargaFami=isPermiso;		
		//this.isPermisoCopiarTipoCargaFami=isPermiso;		
		//this.isPermisoDuplicarTipoCargaFami=isPermiso;
		//this.isPermisoOrdenTipoCargaFami=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCargaFamiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCargaFamiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCargaFamiliar_NM=false;
		this.isTienePermisosCargaFamiliar_NM=this.verificarGetPermisosUsuarioOpcionTipoCargaFamiClaseRelacionada(this.opcionsRelacionadas,CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargaFamiliar=false;
		this.isTienePermisosCargaFamiliar=this.verificarGetPermisosUsuarioOpcionTipoCargaFamiClaseRelacionada(this.opcionsRelacionadas,CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCargaFami(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCargaFamiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCargaFamiliar_NM=conPermiso;
		this.isTienePermisosCargaFamiliar=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCargaFamiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCargaFamiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCargaFamiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCargaFamiliar_NM && this.jInternalFrameDetalleFormTipoCargaFami!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.remove(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargaFamiliar && this.jInternalFrameDetalleFormTipoCargaFami!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.remove(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCargaFami() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCargaFamiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCargaFamiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCargaFami=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCargaFami=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCargaFami=this.isPermisoActualizarTipoCargaFami;
			this.isPermisoEliminarTipoCargaFami=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCargaFami=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCargaFami=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCargaFami=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCargaFami=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCargaFami=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCargaFami=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCargaFami=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCargaFami=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCargaFami=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCargaFami=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCargaFami=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCargaFami=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCargaFami=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCargaFami.setToolTipText(this.jTableDatosTipoCargaFami.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCargaFami(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCargaFami(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCargaFamiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCargaFamiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCargaFami() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCargaFamiliar_NM && this.tipocargafamiConstantesFunciones.mostrarCargaFamiliar_NMTipoCargaFami && !TipoCargaFamiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Carga Familiar_ N M");
			reporte.setsDescripcion("Carga Familiar_ N M");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargaFamiliar && this.tipocargafamiConstantesFunciones.mostrarCargaFamiliarTipoCargaFami && !TipoCargaFamiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Carga Familiar");
			reporte.setsDescripcion("Carga Familiar");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoCargaFamiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCargaFamiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCargaFamiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCargaFamiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCargaFamiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCargaFami()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCargaFami()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCargaFami(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCargaFami()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCargaFami();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCargaFami(TipoCargaFami tipocargafami)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCargaFami(TipoCargaFami tipocargafami,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCargaFami()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCargaFami()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCargaFami()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCargaFami()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCargaFami()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCargaFami()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCargaFami(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCargaFami()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCargaFamiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCargaFamiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCargaFamiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean(); 
		this.tipocargafamiConstantesFunciones=new TipoCargaFamiConstantesFunciones(); 
		this.tipocargafamiBean=new TipoCargaFami();//(this.tipocargafamiConstantesFunciones); 		
		this.tipocargafamiReturnGeneral=new TipoCargaFamiParameterReturnGeneral(); 
		
		this.tipocargafamiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocargafamiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCargaFamiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCargaFamiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCargaFamiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCargaFami(true);
			
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
			
			this.tipocargafamiConstantesFunciones=new TipoCargaFamiConstantesFunciones(); 
			this.tipocargafamiBean=new TipoCargaFami();//this.tipocargafamiConstantesFunciones); 			
			this.tipocargafamiReturnGeneral=new TipoCargaFamiParameterReturnGeneral(); 
		
			TipoCargaFamiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Carga Fami Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocargafami=new TipoCargaFami();
			this.tipocargafamis = new ArrayList<TipoCargaFami>();
			this.tipocargafamisAux = new ArrayList<TipoCargaFami>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic=new TipoCargaFamiLogic();
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocargafamiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocargafamiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCargaFami);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCargaFami);	
					}
					
					if(this.jInternalFrameImportacionTipoCargaFami!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCargaFami);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCargaFami!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCargaFami);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCargaFami);
				this.jInternalFrameDetalleFormTipoCargaFami.setVisible(false);
				this.jInternalFrameDetalleFormTipoCargaFami.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCargaFami);
					this.jInternalFrameReporteDinamicoTipoCargaFami.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCargaFami.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCargaFami!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCargaFami);
					this.jInternalFrameImportacionTipoCargaFami.setVisible(false);
					this.jInternalFrameImportacionTipoCargaFami.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCargaFami!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCargaFami);
					this.jInternalFrameOrderByTipoCargaFami.setVisible(false);
					this.jInternalFrameOrderByTipoCargaFami.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCargaFamiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCargaFamiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocargafamiReturnGeneral=new TipoCargaFamiParameterReturnGeneral();
			
			this.tipocargafamiParameterGeneral=new TipoCargaFamiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocargafamiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCargaFamiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CargaFamiliar_NMConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargaFamiliarConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCargaFamiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocargafamiSessionBean.getEsGuardarRelacionado(),this.tipocargafamiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCargaFamiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocargafamiSessionBean.getEsGuardarRelacionado(),this.tipocargafamiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaDuplicarTipoCargaFami=true;
			this.isVisibilidadCeldaCopiarTipoCargaFami=true;
			this.isVisibilidadCeldaVerFormTipoCargaFami=true;
			this.isVisibilidadCeldaOrdenTipoCargaFami=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
			this.isVisibilidadCeldaModificarTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=false;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCargaFami("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCargaFami();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCargaFami(false);
			
			this.setPermisosUsuarioTipoCargaFami();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocargafamiSessionBean.getEsGuardarRelacionado() && this.tipocargafamiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCargaFamiClasesRelacionadas();
			}
			
			if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCargaFamiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCargaFami();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCargaFami();
			}
			
			if(!this.isPermisoBusquedaTipoCargaFami) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCargaFami,this.isPermisoPaginacionMedioTipoCargaFami,this.isPermisoPaginacionTodoTipoCargaFami);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCargaFamiConstantesFunciones.getTiposSeleccionarTipoCargaFami());
				
				this.tiposColumnasSelect=TipoCargaFamiConstantesFunciones.getTiposSeleccionarTipoCargaFami(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCargaFami();				
				//this.tiposRelacionesSelect=TipoCargaFamiConstantesFunciones.getTiposRelacionesTipoCargaFami(true);
				
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
			//if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCargaFami();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCargaFami(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCargaFami(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargaFami() ;
			
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
			
			
			this.cargafamiliar_nmLogic=new CargaFamiliar_NMLogic();
			this.cargafamiliarLogic=new CargaFamiliarLogic(); 
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
				tipocargafamiImplementable= (TipoCargaFamiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCargaFamiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocargafamiImplementableHome= (TipoCargaFamiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCargaFamiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocargafamis= new ArrayList<TipoCargaFami>();
			this.tipocargafamisEliminados= new ArrayList<TipoCargaFami>();
						
			this.isEsNuevoTipoCargaFami=false;
			this.esParaAccionDesdeFormularioTipoCargaFami=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCargaFami(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCargaFami();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCargaFamiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCargaFamiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCargaFami("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCargaFami(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCargaFami();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCargaFami();
			}
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCargaFami(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCargaFami: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCargaFami() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCargaFami")) {
				iIndex=this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();	
				
				

				if(sTitle.equals("Carga Familiares")) {
					if(!CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCargaFami();

						this.cargarParteTabPanelRelacionadaCargaFamiliar(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Carga Familiar_ N Mes")) {
					if(!CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCargaFami();

						this.cargarParteTabPanelRelacionadaCargaFamiliar_NM(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCargaFami();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCargaFamiliar(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCargaFami.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(false,true,iIndex);
		this.jButtonCargaFamiliarActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargaFamiliar();

		//this.jTabbedPaneRelacionesTipoCargaFami.updateUI();
		//this.jTabbedPaneRelacionesTipoCargaFami.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCargaFami.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCargaFamiliar_NM(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCargaFami.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(false,true,iIndex);
		this.jButtonCargaFamiliar_NMActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargaFamiliar_NM();

		//this.jTabbedPaneRelacionesTipoCargaFami.updateUI();
		//this.jTabbedPaneRelacionesTipoCargaFami.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCargaFami.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CargaFamiliar_NM")) {
				int row=this.jTableDatosTipoCargaFami.getSelectedRow();
				jButtonCargaFamiliar_NMActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CargaFamiliar")) {
				int row=this.jTableDatosTipoCargaFami.getSelectedRow();
				jButtonCargaFamiliarActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Carga Familiar_ N M")) {

					if(this.isTienePermisosCargaFamiliar_NM && this.tipocargafamiConstantesFunciones.mostrarCargaFamiliar_NMTipoCargaFami && !TipoCargaFamiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Carga Familiar_ N Mes"+"("+CargaFamiliar_NMConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Carga Familiar_ N Mes");

						if(tipocargafamiConstantesFunciones.resaltarCargaFamiliar_NMTipoCargaFami!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocargafamiConstantesFunciones.resaltarCargaFamiliar_NMTipoCargaFami);
						}

						jmenuItem.setEnabled(this.tipocargafamiConstantesFunciones.activarCargaFamiliar_NMTipoCargaFami);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CargaFamiliar_NM"));

						

						this.jInternalFrameDetalleFormTipoCargaFami.jmenuDetalleTipoCargaFami.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Carga Familiar")) {

					if(this.isTienePermisosCargaFamiliar && this.tipocargafamiConstantesFunciones.mostrarCargaFamiliarTipoCargaFami && !TipoCargaFamiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Carga Familiares"+"("+CargaFamiliarConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Carga Familiares");

						if(tipocargafamiConstantesFunciones.resaltarCargaFamiliarTipoCargaFami!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocargafamiConstantesFunciones.resaltarCargaFamiliarTipoCargaFami);
						}

						jmenuItem.setEnabled(this.tipocargafamiConstantesFunciones.activarCargaFamiliarTipoCargaFami);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CargaFamiliar"));

						

						this.jInternalFrameDetalleFormTipoCargaFami.jmenuDetalleTipoCargaFami.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCargaFami(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCargaFami(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCargaFami(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCargaFamiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCargaFami();
		
		this.cargarCombosFrameForeignKeyTipoCargaFami();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCargaFami();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCargaFami();
		}
	}
	
	
	
	public void jButtonNuevoTipoCargaFamiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			
			if(jTableDatosTipoCargaFami.getRowCount()>=1) {
				jTableDatosTipoCargaFami.removeRowSelectionInterval(0, jTableDatosTipoCargaFami.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCargaFami=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCargaFami(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCargaFami(true);			
			//this.tipocargafami=new TipoCargaFami();
			//this.tipocargafami.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCargaFami(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargaFami() ;
			
			if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCargaFami(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocargafami);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);				
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCargaFami: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCargaFamiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCargaFami.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCargaFami.getSelectedRows().length;			
			}
			
			tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCargaFami--;			
				//TipoCargaFami tipocargafamiAux= new TipoCargaFami();			
				//tipocargafamiAux.setId(this.iIdNuevoTipoCargaFami);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCargaFami tipocargafamiOrigen=new TipoCargaFami();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCargaFami tipocargafamiOrigen : tipocargafamisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocargafamiOrigen =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocargafamiOrigen =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCargaFami();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocargafami.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCargaFami(tipocargafamiOrigen,this.tipocargafami,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocargafamiLogic.getTipoCargaFamis().add(this.tipocargafamiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocargafamis.add(this.tipocargafamiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
				
				this.jTableDatosTipoCargaFami.setRowSelectionInterval(this.getIndiceNuevoTipoCargaFami(), this.getIndiceNuevoTipoCargaFami());
				
				int iLastRow =  this.jTableDatosTipoCargaFami.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCargaFami.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCargaFami.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCargaFami(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();									
		
			TipoCargaFami tipocargafamiOrigen=new TipoCargaFami();
			TipoCargaFami tipocargafamiDestino=new TipoCargaFami();
				
			tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCargaFami.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocargafamisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCargaFami.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargafamiOrigen =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocargafamiOrigen =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocargafamiDestino =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocargafamiDestino =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocargafamiOrigen =tipocargafamisSeleccionados.get(0);
				tipocargafamiDestino =tipocargafamisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCargaFami(tipocargafamiOrigen,tipocargafamiDestino,true,false);
				
				tipocargafamiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocargafamiDestino,tipocargafamiLogic.getTipoCargaFamis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocargafamiDestino,tipocargafamis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
				
				//this.jTableDatosTipoCargaFami.setRowSelectionInterval(this.getIndiceNuevoTipoCargaFami(), this.getIndiceNuevoTipoCargaFami());
				
				int iLastRow =  this.jTableDatosTipoCargaFami.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCargaFami.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCargaFami.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCargaFami(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCargaFami.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCargaFami.isVisible();
			
			
			this.jPanelParametrosReportesTipoCargaFami.setVisible(!isVisible);
			this.jPanelPaginacionTipoCargaFami.setVisible(!isVisible);
			this.jPanelAccionesTipoCargaFami.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCargaFami();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCargaFami();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCargaFami();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCargaFami();
			
			this.abrirFrameOrderByTipoCargaFami();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCargaFami();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCargaFami(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCargaFami);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCargaFami.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCargaFami.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCargaFami.setSize(this.jInternalFrameDetalleFormTipoCargaFami.iWidthFormulario,this.jInternalFrameDetalleFormTipoCargaFami.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCargaFami.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCargaFami.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCargaFami.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCargaFami.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCargaFami.jContentPaneDetalleTipoCargaFami.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCargaFami.jContentPaneDetalleTipoCargaFami.getWidth(),TipoCargaFamiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCargaFami.jContentPaneDetalleTipoCargaFami.getWidth(),TipoCargaFamiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCargaFami.jContentPaneDetalleTipoCargaFami.getWidth(),TipoCargaFamiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargaFamiliar();
					}

					if(CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargaFamiliar_NM();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCargaFami.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCargaFami.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCargaFami() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCargaFami==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCargaFami=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargaFami,false,this);
				} else {
					this.jInternalFrameOrderByTipoCargaFami=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCargaFami,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCargaFami);
				this.jInternalFrameOrderByTipoCargaFami.setVisible(false);
				this.jInternalFrameOrderByTipoCargaFami.setSelected(false);
				
				this.jInternalFrameOrderByTipoCargaFami.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCargaFami"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCargaFami();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCargaFami() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCargaFami==null) {
				
				this.jInternalFrameImportacionTipoCargaFami=new ImportacionJInternalFrame(TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCargaFami);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCargaFami);
				this.jInternalFrameImportacionTipoCargaFami.setVisible(false);
				this.jInternalFrameImportacionTipoCargaFami.setSelected(false);


				this.jInternalFrameImportacionTipoCargaFami.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCargaFami"));
				this.jInternalFrameImportacionTipoCargaFami.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCargaFami"));
				this.jInternalFrameImportacionTipoCargaFami.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCargaFami"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCargaFami() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCargaFami==null) {
				this.jInternalFrameReporteDinamicoTipoCargaFami=new ReporteDinamicoJInternalFrame(TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCargaFami);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCargaFami);
				this.jInternalFrameReporteDinamicoTipoCargaFami.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCargaFami.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCargaFami"));
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCargaFami"));
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCargaFami"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCargaFami();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCargaFamiliar() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCargaFami.jContentPaneDetalleTipoCargaFami.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCargaFamiliar_NM() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCargaFami.jContentPaneDetalleTipoCargaFami.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCargaFami() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCargaFami);
			
	       	this.jInternalFrameDetalleFormTipoCargaFami.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCargaFami.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCargaFami.dispose();
			//this.jInternalFrameDetalleFormTipoCargaFami=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCargaFami() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCargaFami.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCargaFami.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCargaFami() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCargaFami.setVisible(true);
	        this.jInternalFrameImportacionTipoCargaFami.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCargaFami() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCargaFami.setVisible(true);
	        this.jInternalFrameOrderByTipoCargaFami.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCargaFami() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCargaFami.setVisible(false);
	        this.jInternalFrameOrderByTipoCargaFami.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCargaFami() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCargaFami.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCargaFami.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCargaFami() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCargaFami.setVisible(false);
	        this.jInternalFrameImportacionTipoCargaFami.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCargaFami(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCargaFami(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCargaFami(true);
			//this.isEsNuevoTipoCargaFami=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCargaFami("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCargaFami(false) ;
			
			if(tipocargafamiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado() && CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliar_NMActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado() && CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargaFamiliarActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCargaFami(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargaFami(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCargaFamiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCargaFami(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCargaFami(true);
			//this.isEsNuevoTipoCargaFami=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocargafami.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCargaFami("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCargaFami(false) ;
			
			if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCargaFami(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargaFami(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCargaFami(false);
			
			//if(!this.isEsNuevoTipoCargaFami) {								
				int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
				
			}
			
			if(this.permiteMantenimiento(this.tipocargafami)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCargaFami=true;
					this.inicializarActualizarBindingTablaTipoCargaFami(false);
					this.isEsNuevoTipoCargaFami=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCargaFami=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCargaFami=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCargaFami(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCargaFami(false);
				
				this.habilitarDeshabilitarControlesTipoCargaFami(false);
			
												
				
				if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCargaFami();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCargaFamiActionPerformed(evt,tipocargafamiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCargaFami(this.tipocargafami,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCargaFami.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocargafamiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocargafami.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				this.tipocargafami.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				this.tipocargafami.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocargafami)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCargaFamiModel) this.jTableDatosTipoCargaFami.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCargaFami=true;
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
				this.isEsNuevoTipoCargaFami=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCargaFami(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCargaFami(false);
				
				this.habilitarDeshabilitarControlesTipoCargaFami(false);
				
				
				
				if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCargaFami();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCargaFami.getRowCount()>=1) {
				jTableDatosTipoCargaFami.removeRowSelectionInterval(0, jTableDatosTipoCargaFami.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCargaFami(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCargaFami(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCargaFami(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCargaFami(false) ;
			
			this.isEsNuevoTipoCargaFami=false;
			
			if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCargaFami();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCargaFami(false);
				
				//SI ES MANUAL
				if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCargaFami();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCargaFami--;			
			//TipoCargaFami tipocargafamiAux= new TipoCargaFami();			
			//tipocargafamiAux.setId(this.iIdNuevoTipoCargaFami);
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCargaFami();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
			
			this.tipocargafami.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocargafamiLogic.getTipoCargaFamis().add(this.tipocargafamiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocargafamis.add(this.tipocargafamiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCargaFami(false);
			
			this.jTableDatosTipoCargaFami.setRowSelectionInterval(this.getIndiceNuevoTipoCargaFami(), this.getIndiceNuevoTipoCargaFami());
			
			int iLastRow =  this.jTableDatosTipoCargaFami.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCargaFami.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCargaFami.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCargaFami(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargaFami(false);
			
			//SI ES MANUAL
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCargaFami();
			}
			
			//this.abrirFrameTreeTipoCargaFami();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Carga FamiS ?", "MANTENIMIENTO DE Tipo Carga Fami", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCargaFami.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCargaFami();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocargafamiReturnGeneral=tipocargafamiLogic.procesarImportacionTipoCargaFamisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocargafamiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCargaFamiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCargaFami.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCargaFami.setFileImportacion(this.jInternalFrameImportacionTipoCargaFami.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCargaFami.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCargaFami.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCargaFami.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCargaFami.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		

		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCargaFamiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCargaFamiBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCargaFamiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCargaFamiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCargaFami.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCargaFamiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCargaFamiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCargaFamiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCargaFamiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCargaFamiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCargaFamiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCargaFamis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCargaFamiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCargaFami tipocargafami:tipocargafamisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocargafami.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCargaFamiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCargaFami tipocargafami:tipocargafamisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocargafami.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCargaFami(row);				
			//	iRow++;
			//}				
			
			//for(TipoCargaFami tipocargafamiAux:tipocargafamisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCargaFami(tipocargafamiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargaFami(false);
			
			//SI ES MANUAL
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCargaFami();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargaFami(false);
			
			//SI ES MANUAL
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCargaFami();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCargaFamiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCargaFami(false);
			
			//SI ES MANUAL
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCargaFami();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocargafamiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCargaFami() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCargaFami.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCargaFami.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCargaFami.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCargaFami.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCargaFami.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCargaFami.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCargaFami.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCargaFami(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCargaFami(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCargaFami(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCargaFami(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCargaFami(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCargaFami(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargaFami(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCargaFami(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCargaFami() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCargaFami();
		
		this.inicializarActualizarBindingBotonesManualTipoCargaFami(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCargaFami();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargaFami() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCargaFami(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCargaFami(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCargaFami.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCargaFami.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCargaFami.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCargaFami.jCheckBoxPostAccionNuevoTipoCargaFami.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCargaFami.jCheckBoxPostAccionSinCerrarTipoCargaFami.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCargaFami.jCheckBoxPostAccionSinMensajeTipoCargaFami.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCargaFami.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCargaFami.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCargaFami.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
				this.jInternalFrameDetalleFormTipoCargaFami.jCheckBoxPostAccionNuevoTipoCargaFami.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCargaFami.jCheckBoxPostAccionSinCerrarTipoCargaFami.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCargaFami.jCheckBoxPostAccionSinMensajeTipoCargaFami.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCargaFami.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCargaFami.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCargaFami.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCargaFami.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCargaFami.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCargaFami.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCargaFami.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCargaFami.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCargaFami.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCargaFami(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCargaFami(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCargaFami() throws Exception {
		try	{
			if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCargaFami();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCargaFami() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCargaFami() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCargaFami.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCargaFami.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCargaFami.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCargaFami.addItem(reporte);
			}
			
			
			if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCargaFami.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCargaFami.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCargaFami.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCargaFami.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCargaFami.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCargaFami.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCargaFami.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCargaFami();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCargaFami() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCargaFami.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCargaFami.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCargaFami.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCargaFami.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCargaFami.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCargaFami()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCargaFami(Boolean esInicializar) throws Exception {				
		if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCargaFami();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCargaFami() throws Exception {
		this.inicializarActualizarBindingTablaTipoCargaFami(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCargaFami() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCargaFamiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFamiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCargaFami(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocargafamiLogic.getTipoCargaFamis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocargafamis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCargaFami.setModel(new TipoCargaFamiModel(this.tipocargafamiLogic.getTipoCargaFamis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCargaFami.setModel(new TipoCargaFamiModel(this.tipocargafamis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCargaFami!=null && this.jInternalFrameOrderByTipoCargaFami.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCargaFami();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCargaFami.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFami,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO,tipocargafamiConstantesFunciones.resaltarSeleccionarTipoCargaFami,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCargaFamiConstantesFunciones.SCLASSWEBTITULO,tipocargafamiConstantesFunciones.resaltarSeleccionarTipoCargaFami,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCargaFami.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFami,TipoCargaFamiConstantesFunciones.LABEL_ID));

		if(this.tipocargafamiConstantesFunciones.mostraridTipoCargaFami && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargaFamiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocargafamiConstantesFunciones.resaltaridTipoCargaFami,this.tipocargafamiConstantesFunciones.activaridTipoCargaFami,this,true,"idTipoCargaFami","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocargafamiConstantesFunciones.resaltaridTipoCargaFami,this.tipocargafamiConstantesFunciones.activaridTipoCargaFami,this,true,"idTipoCargaFami","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCargaFami.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFami,TipoCargaFamiConstantesFunciones.LABEL_CODIGO));

		if(this.tipocargafamiConstantesFunciones.mostrarcodigoTipoCargaFami && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargaFamiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocargafamiConstantesFunciones.resaltarcodigoTipoCargaFami,this.tipocargafamiConstantesFunciones.activarcodigoTipoCargaFami,this,true,"codigoTipoCargaFami","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocargafamiConstantesFunciones.resaltarcodigoTipoCargaFami,this.tipocargafamiConstantesFunciones.activarcodigoTipoCargaFami,this,true,"codigoTipoCargaFami","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCargaFami.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFami,TipoCargaFamiConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocargafamiConstantesFunciones.mostrarnombreTipoCargaFami && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCargaFamiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocargafamiConstantesFunciones.resaltarnombreTipoCargaFami,this.tipocargafamiConstantesFunciones.activarnombreTipoCargaFami,this,true,"nombreTipoCargaFami","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocargafamiConstantesFunciones.resaltarnombreTipoCargaFami,this.tipocargafamiConstantesFunciones.activarnombreTipoCargaFami,this,true,"nombreTipoCargaFami","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCargaFamiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCargaFamiliar_NM && this.tipocargafamiConstantesFunciones.mostrarCargaFamiliar_NMTipoCargaFami && !TipoCargaFamiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Carga Familiar_ N Mes");
				tableColumn.setHeaderValue("Carga Familiar_ N Mes");
				tableColumn.setCellRenderer(new CargaFamiliar_NMTableCell(tipocargafamiConstantesFunciones.resaltarCargaFamiliar_NMTipoCargaFami,this,this.tipocargafamiConstantesFunciones.activarCargaFamiliar_NMTipoCargaFami));
				tableColumn.setCellEditor(new CargaFamiliar_NMTableCell(tipocargafamiConstantesFunciones.resaltarCargaFamiliar_NMTipoCargaFami,this,this.tipocargafamiConstantesFunciones.activarCargaFamiliar_NMTipoCargaFami));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCargaFami.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargaFamiliar && this.tipocargafamiConstantesFunciones.mostrarCargaFamiliarTipoCargaFami && !TipoCargaFamiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Carga Familiares");
				tableColumn.setHeaderValue("Carga Familiares");
				tableColumn.setCellRenderer(new CargaFamiliarTableCell(tipocargafamiConstantesFunciones.resaltarCargaFamiliarTipoCargaFami,this,this.tipocargafamiConstantesFunciones.activarCargaFamiliarTipoCargaFami));
				tableColumn.setCellEditor(new CargaFamiliarTableCell(tipocargafamiConstantesFunciones.resaltarCargaFamiliarTipoCargaFami,this,this.tipocargafamiConstantesFunciones.activarCargaFamiliarTipoCargaFami));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCargaFami.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocargafamiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocargafamiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCargaFami.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocargafamiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocargafamiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCargaFami.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocargafamiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocargafamiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCargaFami.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoCargaFami.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCargaFami.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocargafamiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCargaFami.moveColumn(this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCargaFami.moveColumn(this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocargafamiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCargaFami.moveColumn(this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCargaFami.moveColumn(this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCargaFami.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCargaFami.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCargaFami,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCargaFami.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCargaFami.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCargaFami.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCargaFami.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCargaFami.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocargafamiLogic.getTipoCargaFamis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocargafamis.size()-1;
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
		//this.jTableDatosTipoCargaFami.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCargaFami.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCargaFami();
			
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
				
				//this.isEsNuevoTipoCargaFami=false;
					
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
				if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCargaFami==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCargaFami.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCargaFami.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocargafami.getsType().equals("DUPLICADO")
				   || this.tipocargafami.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCargaFami=true;
				
				} else {
					this.isEsNuevoTipoCargaFami=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocargafami.getId()>=0 && !this.tipocargafami.getIsNew()) {						
						this.isEsNuevoTipoCargaFami=false;
						
					} else {
						this.isEsNuevoTipoCargaFami=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCargaFami(esRelaciones);						
				
				this.seleccionarTipoCargaFami(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocargafami.getId()<0) {
					this.isEsNuevoTipoCargaFami=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCargaFami(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCargaFami(evt,rowIndex);
				}	
				
				if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCargaFami: " + this.dDif); 
					}
				}								
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCargaFami(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocargafami)) {
					if(this.tipocargafami.getId()>0) {
						this.tipocargafami.setIsDeleted(true);
						
						this.tipocargafamisEliminados.add(this.tipocargafami);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocargafamiLogic.getTipoCargaFamis().remove(this.tipocargafami);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocargafamis.remove(this.tipocargafami);				
					}
					
					
					((TipoCargaFamiModel) this.jTableDatosTipoCargaFami.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCargaFami(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCargaFami(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCargaFami) {
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCargaFami.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCargaFami.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCargaFami(this.tipocargafami);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCargaFami("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCargaFami(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCargaFami() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCargaFami(TipoCargaFami tipocargafami) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCargaFami(tipocargafami,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCargaFami(TipoCargaFami tipocargafami,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCargaFami(tipocargafami);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCargaFami(tipocargafami,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCargaFami(tipocargafami);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCargaFami(TipoCargaFami tipocargafami) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setText(tipocargafami.getId().toString());
			this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setText(tipocargafami.getcodigo());
			this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setText(tipocargafami.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCargaFami tipocargafamiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocargafamiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCargaFami tipocargafamiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocargafamiLocal=this.tipocargafami;
			} else {
				tipocargafamiLocal=this.tipocargafamiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocargafamiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCargaFami(tipocargafamiLocal,true);
					
					if(tipocargafamiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocargafamiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocargafamiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCargaFami(TipoCargaFami tipocargafami,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCargaFami(tipocargafami,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(tipocargafami);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCargaFami(TipoCargaFami tipocargafami,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCargaFami(tipocargafami,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCargaFami(TipoCargaFami tipocargafami,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.getText()==null || this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.getText()=="" || this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setText("0");
			}

			if(conColumnasBase) {tipocargafami.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCargaFamiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargaFami.jLabelIdTipoCargaFami,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocargafami.setcodigo(this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCargaFamiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargaFami.jLabelcodigoTipoCargaFami,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocargafami.setnombre(this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCargaFamiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCargaFami.jLabelnombreTipoCargaFami,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCargaFami(TipoCargaFami tipocargafamiBean,TipoCargaFami tipocargafami,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCargaFami(TipoCargaFami tipocargafamiOrigen,TipoCargaFami tipocargafami,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocargafamiOrigen.getId()!=null && !tipocargafamiOrigen.getId().equals(0L))) {tipocargafami.setId(tipocargafamiOrigen.getId());}}
			if(conDefault || (!conDefault && tipocargafamiOrigen.getcodigo()!=null && !tipocargafamiOrigen.getcodigo().equals(""))) {tipocargafami.setcodigo(tipocargafamiOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocargafamiOrigen.getnombre()!=null && !tipocargafamiOrigen.getnombre().equals(""))) {tipocargafami.setnombre(tipocargafamiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCargaFami(TipoCargaFami tipocargafami) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setText(tipocargafami.getId().toString());
			this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setText(tipocargafami.getcodigo());
			this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setText(tipocargafami.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCargaFami(TipoCargaFamiBean tipocargafamiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setText(tipocargafamiBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setText(tipocargafamiBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setText(tipocargafamiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCargaFami(TipoCargaFamiParameterReturnGeneral tipocargafamiReturnGeneral,TipoCargaFamiBean tipocargafamiBean,Boolean conDefault) throws Exception { 
		try {
			TipoCargaFami tipocargafamiLocal=new TipoCargaFami();
			
			tipocargafamiLocal=tipocargafamiReturnGeneral.getTipoCargaFami();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocargafamiLocal.getId()!=null && !tipocargafamiLocal.getId().equals(0L))) {tipocargafamiBean.setId(tipocargafamiLocal.getId());}}
			if(conDefault || (!conDefault && tipocargafamiLocal.getcodigo()!=null && !tipocargafamiLocal.getcodigo().equals(""))) {tipocargafamiBean.setcodigo(tipocargafamiLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocargafamiLocal.getnombre()!=null && !tipocargafamiLocal.getnombre().equals(""))) {tipocargafamiBean.setnombre(tipocargafamiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCargaFamiGenerico(Long idTipoCargaFamiSeleccionado,JComboBox jComboBoxTipoCargaFami,List<TipoCargaFami> tipocargafamisLocal)throws Exception {
		try {
			TipoCargaFami  tipocargafamiTemp=null;

			for(TipoCargaFami tipocargafamiAux:tipocargafamisLocal) {
				if(tipocargafamiAux.getId()!=null && tipocargafamiAux.getId().equals(idTipoCargaFamiSeleccionado)) {
					tipocargafamiTemp=tipocargafamiAux;
					break;
				}
			}

			jComboBoxTipoCargaFami.setSelectedItem(tipocargafamiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCargaFamiGenerico(JComboBox jComboBoxTipoCargaFami,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCargaFami.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCargaFami.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCargaFami.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCargaFami.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCargaFami.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCargaFami.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCargaFami.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCargaFami.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCargaFami.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCargaFami.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CargaFamiliar_NM")) {
			jButtonCargaFamiliar_NMActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CargaFamiliar")) {
			jButtonCargaFamiliarActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocargafami=(TipoCargaFami) tipocargafamiLogic.getTipoCargaFamis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocargafami =(TipoCargaFami) tipocargafamis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCargaFami tipocargafamiRow=new TipoCargaFami();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocargafamiRow=(TipoCargaFami) tipocargafamiLogic.getTipoCargaFamis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocargafamiRow=(TipoCargaFami) tipocargafamis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCargaFamiliar_NMActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCargaFami tipocargafami) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCargaFami==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafami = (TipoCargaFami)this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocargafami = (TipoCargaFami)this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocargafami!=null) {
						this.tipocargafami = tipocargafami;
					} else {
						this.tipocargafami = new TipoCargaFami();
					}
				}

				if(this.isTienePermisosCargaFamiliar_NM && this.permiteMantenimiento(this.tipocargafami)) {
					CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargafamiliar_nmBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup;
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame;
					}

					List<TipoCargaFami> tipocargafamis=new ArrayList<TipoCargaFami>();
					tipocargafamis.add(this.tipocargafami);
					if(!esRelacionado) {
						//cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
						//cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargafamiliar_nmBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCargaFami.cargarCargaFamiliar_NMBeanSwingJInternalFrame(tipocargafamis,this.tipocargafami,cargafamiliar_nmBeanSwingJInternalFrame,/*conInicializar,*/cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getConGuardarRelaciones(),cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.getEsGuardarRelacionado());
					cargafamiliar_nmBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");

						cargafamiliar_nmBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA + (CargaFamiliar_NMConstantesFunciones.ITAMANIOFILATABLA/2));

						cargafamiliar_nmBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCargaFami=(TitledBorder)this.jScrollPanelDatosTipoCargaFami.getBorder();
						TitledBorder titledBorderCargaFamiliar_NM=(TitledBorder)cargafamiliar_nmBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar_NM.getBorder();

						titledBorderCargaFamiliar_NM.setTitle(titledBorderTipoCargaFami.getTitle() + " -> Carga Familiar_ N M");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargafamiliar_nmBeanSwingJInternalFrame);
						}

						cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargafamiliar_nmBeanSwingJInternalFrame);

						cargafamiliar_nmBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Carga Familiar_ N M",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargaFamiliarActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCargaFami tipocargafami) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCargaFami==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafami = (TipoCargaFami)this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocargafami = (TipoCargaFami)this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocargafami!=null) {
						this.tipocargafami = tipocargafami;
					} else {
						this.tipocargafami = new TipoCargaFami();
					}
				}

				if(this.isTienePermisosCargaFamiliar && this.permiteMantenimiento(this.tipocargafami)) {
					CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargafamiliarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup;
					} else {
						cargafamiliarBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame;
					}

					List<TipoCargaFami> tipocargafamis=new ArrayList<TipoCargaFami>();
					tipocargafamis.add(this.tipocargafami);
					if(!esRelacionado) {
						//cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setConGuardarRelaciones(false);
						//cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargafamiliarBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCargaFami.cargarCargaFamiliarBeanSwingJInternalFrame(tipocargafamis,this.tipocargafami,cargafamiliarBeanSwingJInternalFrame,/*conInicializar,*/cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getConGuardarRelaciones(),cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.getEsGuardarRelacionado());
					cargafamiliarBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");

						cargafamiliarBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA + (CargaFamiliarConstantesFunciones.ITAMANIOFILATABLA/2));

						cargafamiliarBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCargaFami=(TitledBorder)this.jScrollPanelDatosTipoCargaFami.getBorder();
						TitledBorder titledBorderCargaFamiliar=(TitledBorder)cargafamiliarBeanSwingJInternalFrame.jScrollPanelDatosCargaFamiliar.getBorder();

						titledBorderCargaFamiliar.setTitle(titledBorderTipoCargaFami.getTitle() + " -> Carga Familiar");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargafamiliarBeanSwingJInternalFrame);
						}

						cargafamiliarBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargafamiliarBeanSwingJInternalFrame);

						cargafamiliarBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Carga Familiar",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCargaFami(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoTipoCargaFami && this.isPermisoNuevoTipoCargaFami));			
			this.jButtonDuplicarTipoCargaFami.setVisible((this.isVisibilidadCeldaDuplicarTipoCargaFami && this.isPermisoDuplicarTipoCargaFami));			
			this.jButtonCopiarTipoCargaFami.setVisible((this.isVisibilidadCeldaCopiarTipoCargaFami && this.isPermisoCopiarTipoCargaFami));
			this.jButtonVerFormTipoCargaFami.setVisible((this.isVisibilidadCeldaVerFormTipoCargaFami && this.isPermisoVerFormTipoCargaFami));
			
			this.jButtonAbrirOrderByTipoCargaFami.setVisible((this.isVisibilidadCeldaOrdenTipoCargaFami && this.isPermisoOrdenTipoCargaFami));			
			
			this.jButtonNuevoRelacionesTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami && this.isPermisoNuevoTipoCargaFami));			
			this.jButtonNuevoGuardarCambiosTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoTipoCargaFami && this.isPermisoNuevoTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarTipoCargaFami.setVisible((this.isVisibilidadCeldaModificarTipoCargaFami && this.isPermisoActualizarTipoCargaFami));	
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarTipoCargaFami.setVisible((this.isVisibilidadCeldaActualizarTipoCargaFami && this.isPermisoActualizarTipoCargaFami));	
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarTipoCargaFami.setVisible((this.isVisibilidadCeldaEliminarTipoCargaFami && this.isPermisoEliminarTipoCargaFami));
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarTipoCargaFami.setVisible(this.isVisibilidadCeldaCancelarTipoCargaFami);							
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoTipoCargaFami && this.isPermisoNuevoTipoCargaFami));						
			this.jButtonDuplicarToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaDuplicarTipoCargaFami && this.isPermisoDuplicarTipoCargaFami));						
			this.jButtonCopiarToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaCopiarTipoCargaFami && this.isPermisoCopiarTipoCargaFami));			
			this.jButtonVerFormToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaVerFormTipoCargaFami && this.isPermisoVerFormTipoCargaFami));			
			this.jButtonAbrirOrderByToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaOrdenTipoCargaFami && this.isPermisoOrdenTipoCargaFami));
			this.jButtonNuevoRelacionesToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami && this.isPermisoNuevoTipoCargaFami));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoTipoCargaFami && this.isPermisoNuevoTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));			
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaModificarTipoCargaFami && this.isPermisoActualizarTipoCargaFami));	
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaActualizarTipoCargaFami  && this.isPermisoActualizarTipoCargaFami));	
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaEliminarTipoCargaFami && this.isPermisoEliminarTipoCargaFami));
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarToolBarTipoCargaFami.setVisible(this.isVisibilidadCeldaCancelarTipoCargaFami);				
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoTipoCargaFami && this.isPermisoNuevoTipoCargaFami));			
			this.jMenuItemDuplicarTipoCargaFami.setVisible((this.isVisibilidadCeldaDuplicarTipoCargaFami && this.isPermisoDuplicarTipoCargaFami));			
			this.jMenuItemCopiarTipoCargaFami.setVisible((this.isVisibilidadCeldaCopiarTipoCargaFami && this.isPermisoCopiarTipoCargaFami));			
			this.jMenuItemVerFormTipoCargaFami.setVisible((this.isVisibilidadCeldaVerFormTipoCargaFami && this.isPermisoVerFormTipoCargaFami));			
			this.jMenuItemAbrirOrderByTipoCargaFami.setVisible((this.isVisibilidadCeldaOrdenTipoCargaFami && this.isPermisoOrdenTipoCargaFami));			
			//this.jMenuItemMostrarOcultarTipoCargaFami.setVisible((this.isVisibilidadCeldaOrdenTipoCargaFami && this.isPermisoOrdenTipoCargaFami));
			this.jMenuItemDetalleAbrirOrderByTipoCargaFami.setVisible((this.isVisibilidadCeldaOrdenTipoCargaFami && this.isPermisoOrdenTipoCargaFami));			
			//this.jMenuItemDetalleMostrarOcultarTipoCargaFami.setVisible((this.isVisibilidadCeldaOrdenTipoCargaFami && this.isPermisoOrdenTipoCargaFami));			
			this.jMenuItemNuevoRelacionesTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami && this.isPermisoNuevoTipoCargaFami));			
			this.jMenuItemNuevoGuardarCambiosTipoCargaFami.setVisible((this.isVisibilidadCeldaNuevoTipoCargaFami && this.isPermisoNuevoTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));									
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemModificarTipoCargaFami.setVisible((this.isVisibilidadCeldaModificarTipoCargaFami && this.isPermisoActualizarTipoCargaFami));	
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemActualizarTipoCargaFami.setVisible((this.isVisibilidadCeldaActualizarTipoCargaFami && this.isPermisoActualizarTipoCargaFami));	
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemEliminarTipoCargaFami.setVisible((this.isVisibilidadCeldaEliminarTipoCargaFami && this.isPermisoEliminarTipoCargaFami));
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemCancelarTipoCargaFami.setVisible(this.isVisibilidadCeldaCancelarTipoCargaFami);				
			}
			
			this.jMenuItemGuardarCambiosTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));						
			this.jMenuItemGuardarCambiosTablaTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCargaFami=this.jButtonNuevoTipoCargaFami.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCargaFami=this.jButtonDuplicarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaCopiarTipoCargaFami=this.jButtonCopiarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaVerFormTipoCargaFami=this.jButtonVerFormTipoCargaFami.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCargaFami=this.jButtonAbrirOrderByTipoCargaFami.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=this.jButtonNuevoRelacionesTipoCargaFami.isVisible();
			this.isVisibilidadCeldaModificarTipoCargaFami=this.jButtonModificarTipoCargaFami.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.isVisibilidadCeldaActualizarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaEliminarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaCancelarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaGuardarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=this.jButtonGuardarCambiosTablaTipoCargaFami.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCargaFami=this.jButtonNuevoToolBarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=this.jButtonNuevoRelacionesToolBarTipoCargaFami.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.isVisibilidadCeldaModificarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarToolBarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaActualizarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarToolBarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaEliminarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarToolBarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaCancelarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarToolBarTipoCargaFami.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCargaFami=this.jButtonGuardarCambiosToolBarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=this.jButtonGuardarCambiosTablaToolBarTipoCargaFami.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCargaFami=this.jMenuItemNuevoTipoCargaFami.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=this.jMenuItemNuevoRelacionesTipoCargaFami.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.isVisibilidadCeldaModificarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemModificarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaActualizarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemActualizarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaEliminarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemEliminarTipoCargaFami.isVisible();
			this.isVisibilidadCeldaCancelarTipoCargaFami=this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemCancelarTipoCargaFami.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCargaFami=this.jMenuItemGuardarCambiosTipoCargaFami.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=this.jMenuItemGuardarCambiosTablaTipoCargaFami.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCargaFami(Boolean esInicializar) {
		if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCargaFami();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCargaFami(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCargaFami() {
		this.jButtonNuevoTipoCargaFami.setVisible(this.isPermisoNuevoTipoCargaFami);			
		this.jButtonDuplicarTipoCargaFami.setVisible(this.isPermisoDuplicarTipoCargaFami);			
		this.jButtonCopiarTipoCargaFami.setVisible(this.isPermisoCopiarTipoCargaFami);			
		this.jButtonVerFormTipoCargaFami.setVisible(this.isPermisoVerFormTipoCargaFami);			
		
		this.jButtonAbrirOrderByTipoCargaFami.setVisible(this.isPermisoOrdenTipoCargaFami);					
		
		this.jButtonNuevoRelacionesTipoCargaFami.setVisible(this.isPermisoNuevoTipoCargaFami);			
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarTipoCargaFami.setVisible(this.isPermisoActualizarTipoCargaFami);	
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarTipoCargaFami.setVisible(this.isPermisoActualizarTipoCargaFami);	
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarTipoCargaFami.setVisible(this.isPermisoEliminarTipoCargaFami);
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarTipoCargaFami.setVisible(this.isVisibilidadCeldaCancelarTipoCargaFami);						
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.setVisible(this.isPermisoGuardarCambiosTipoCargaFami);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.setVisible(this.isPermisoActualizarTipoCargaFami);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCargaFami() {
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarTipoCargaFami.setVisible(this.isPermisoActualizarTipoCargaFami);	
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarTipoCargaFami.setVisible(this.isPermisoActualizarTipoCargaFami);	
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarTipoCargaFami.setVisible(this.isPermisoEliminarTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarTipoCargaFami.setVisible(this.isVisibilidadCeldaCancelarTipoCargaFami);							
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.setVisible((this.isVisibilidadCeldaGuardarTipoCargaFami && this.isPermisoGuardarCambiosTipoCargaFami));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCargaFami() {
		if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCargaFami();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCargaFami() {
	}
	
	public void jTableDatosTipoCargaFamiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCargaFami(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCargaFamiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.gettipocargafami(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargafami==null) {
						this.tipocargafami = new TipoCargaFami();
					}

					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
				}

				if(this.tipocargafami.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocargafami.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargaFami(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCargaFamiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.gettipocargafami(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargafami==null) {
						this.tipocargafami = new TipoCargaFami();
					}

					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
				}

				if(this.tipocargafami.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocargafami.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargaFami(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCargaFamiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.gettipocargafami(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocargafami==null) {
						this.tipocargafami = new TipoCargaFami();
					}

					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);
				}

				if(this.tipocargafami.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocargafami.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCargaFami(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCargaFami() {
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
			this.jInternalFrameDetalleFormTipoCargaFami.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCargaFami.dispose();
			this.jInternalFrameDetalleFormTipoCargaFami=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
			this.jInternalFrameReporteDinamicoTipoCargaFami.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCargaFami.dispose();
			this.jInternalFrameReporteDinamicoTipoCargaFami=null;
		}
		
		if(this.jInternalFrameImportacionTipoCargaFami!=null) {
			this.jInternalFrameImportacionTipoCargaFami.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCargaFami.dispose();
			this.jInternalFrameImportacionTipoCargaFami=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCargaFami();
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCargaFami")) {
				jButtonDuplicarTipoCargaFamiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCargaFami")) {
				jButtonCopiarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCargaFami")) {
				jButtonVerFormTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCargaFami")) {
				jButtonDuplicarTipoCargaFamiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCargaFami")) {
				jButtonDuplicarTipoCargaFamiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCargaFami")) {
				jButtonModificarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCargaFami")) {
				jButtonModificarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCargaFami")) {
				jButtonModificarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCargaFami")) {
				jButtonActualizarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCargaFami")) {
				jButtonActualizarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCargaFami")) {
				jButtonActualizarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCargaFami")) {
				jButtonEliminarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCargaFami")) {
				jButtonEliminarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCargaFami")) {
				jButtonEliminarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCargaFami")) {
				jButtonCancelarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCargaFami")) {
				jButtonCancelarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCargaFami")) {
				jButtonCancelarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCargaFami")) {
				jButtonCerrarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCargaFami")) {
				jButtonCerrarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCargaFami")) {
				jButtonCerrarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCargaFami")) {
				jButtonMostrarOcultarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCargaFami")) {
				jButtonCancelarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCargaFami")) {
				jButtonCopiarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCargaFami")) {
				jButtonVerFormTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCargaFami")) {
				jButtonCopiarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCargaFami")) {
				jButtonVerFormTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCargaFami")) {
				jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCargaFami")) {
				jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCargaFami")) {
				jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCargaFami")) {
				jButtonAnterioresTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCargaFami")) {
				jButtonAnterioresTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCargaFami")) {
				jButtonAnterioresTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCargaFami")) {
				jButtonSiguientesTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCargaFami")) {
				jButtonSiguientesTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCargaFami")) {
				jButtonSiguientesTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCargaFami") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCargaFami")) {
				jButtonAbrirOrderByTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCargaFami") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCargaFami")) {
				jButtonMostrarOcultarTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCargaFami")) {
				jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCargaFami")) {
				jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCargaFami")) {
				jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCargaFami")) {
				jButtonCerrarReporteDinamicoTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCargaFami")) {
				jButtonGenerarReporteDinamicoTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCargaFami")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCargaFami")) {
				jButtonCerrarImportacionTipoCargaFamiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCargaFami")) {
				
				jButtonGenerarImportacionTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCargaFami")) {
				
				jButtonAbrirImportacionTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCargaFami")) {
				jComboBoxTiposAccionesTipoCargaFamiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCargaFami")) {
				jComboBoxTiposRelacionesTipoCargaFamiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCargaFami")) {
				jComboBoxTiposAccionesTipoCargaFamiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCargaFami")) {
				
				jComboBoxTiposSeleccionarTipoCargaFamiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCargaFami")) {
				jTextFieldValorCampoGeneralTipoCargaFamiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCargaFami")) {
				jButtonAbrirOrderByTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCargaFami")) {
				jButtonAbrirOrderByTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCargaFami")) {
				jButtonCerrarOrderByTipoCargaFamiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCargaFamiBusqueda")) {
				this.jButtonidTipoCargaFamiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCargaFamiBusqueda")) {
				this.jButtoncodigoTipoCargaFamiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCargaFamiBusqueda")) {
				this.jButtonnombreTipoCargaFamiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCargaFami();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCargaFami tipocargafamiLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocargafamiLocal=this.tipocargafami;
			} else {
				tipocargafamiLocal=this.tipocargafamiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
							
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
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
			
			


			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
								
						
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
								
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
							
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
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
			
			


			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
								
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCargaFami")) {
					jCheckBoxSeleccionarTodosTipoCargaFamiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCargaFami")) {
					jCheckBoxSeleccionadosTipoCargaFamiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCargaFami")) {
					
				}
				
				


				
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
												
				
				


				
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
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
			
			


			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCargaFamiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocargafami);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocargafami);
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
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
				
				


				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCargaFami.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCargaFami.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCargaFamiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocargafamiAnterior =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCargaFami")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCargaFamiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCargaFami.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocargafami =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocargafami =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocargafami);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCargaFami")) {
				
				}
				
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCargaFami")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCargaFami.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCargaFami")) {
			
			}
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCargaFami();
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCargaFami")) {
				jButtonDuplicarTipoCargaFamiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCargaFami")) {
				jButtonCopiarTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCargaFami")) {
				jButtonVerFormTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCargaFami")) {
				jButtonNuevoTipoCargaFamiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCargaFami")) {
				jButtonModificarTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCargaFami")) {
				jButtonActualizarTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCargaFami")) {
				jButtonEliminarTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCargaFami")) {
				jButtonCancelarTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCargaFami")) {
				jButtonCerrarTipoCargaFamiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCargaFami")) {
				jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCargaFami")) {
				jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCargaFami")) {
				jButtonAbrirOrderByTipoCargaFamiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCargaFami")) {
				jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCargaFami")) {
				jButtonAnterioresTipoCargaFamiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCargaFami")) {
				jButtonSiguientesTipoCargaFamiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCargaFamiBusqueda")) {
				this.jButtonidTipoCargaFamiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCargaFamiBusqueda")) {
				this.jButtoncodigoTipoCargaFamiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCargaFamiBusqueda")) {
				this.jButtonnombreTipoCargaFamiBusquedaActionPerformed(evt);
			}
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCargaFami();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCargaFami")) {
				closingInternalFrameTipoCargaFami();
				
			} else if(sTipo.equals("jButtonCancelarTipoCargaFami")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCargaFami = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCargaFamiBeanSwingJInternalFrame jInternalFrameParent=(TipoCargaFamiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCargaFami.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCargaFamiActionPerformed(null);
			}
			
			TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocargafami,new Object(),this.tipocargafamiParameterGeneral,this.tipocargafamiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCargaFami(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCargaFami(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCargaFami(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocargafami)) {
			if(!esControlTabla) {
				if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);			
				}
				
				if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCargaFami(this.tipocargafami,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocargafamiReturnGeneral=tipocargafamiLogic.procesarEventosTipoCargaFamisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargafamiLogic.getTipoCargaFamis(),this.tipocargafami,this.tipocargafamiParameterGeneral,this.isEsNuevoTipoCargaFami,classes);//this.tipocargafamiLogic.getTipoCargaFami()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCargaFami(this.tipocargafamiReturnGeneral,this.tipocargafamiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCargaFami(classes,this.tipocargafamiReturnGeneral,this.tipocargafamiBean,false);
					}
						
					if(this.tipocargafamiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami());	
					}
						
					if(this.tipocargafamiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami(),classes);//this.tipocargafamiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCargaFami(this.tipocargafami,classes);//this.tipocargafamiBean);									
				}
			
				if(TipoCargaFamiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCargaFami(this.tipocargafami,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCargaFami(this.tipocargafami);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocargafamiAnterior!=null) {
						this.tipocargafami=this.tipocargafamiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocargafamiReturnGeneral=tipocargafamiLogic.procesarEventosTipoCargaFamisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargafamiLogic.getTipoCargaFamis(),this.tipocargafami,this.tipocargafamiParameterGeneral,this.isEsNuevoTipoCargaFami,classes);//this.tipocargafamiLogic.getTipoCargaFami()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocargafamiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocargafamiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocargafamiReturnGeneral.getTipoCargaFami(),tipocargafamiLogic.getTipoCargaFamis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocargafamiReturnGeneral.getTipoCargaFami(),this.tipocargafamis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCargaFami.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCargaFami.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCargaFami();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCargaFami() throws Exception {
		
		TipoCargaFamiModel tipocargafamiModel=(TipoCargaFamiModel)this.jTableDatosTipoCargaFami.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocargafamiModel.tipocargafamis=this.tipocargafamiLogic.getTipoCargaFamis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocargafamiModel.tipocargafamis=this.tipocargafamis;
		}
		
		
		((TipoCargaFamiModel) this.jTableDatosTipoCargaFami.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCargaFami() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocargafamiAnterior(),this.tipocargafamiLogic.getTipoCargaFamis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocargafamiAnterior(),this.tipocargafamis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCargaFami();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCargaFami(TipoCargaFami tipocargafami,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(tipocargafami.getCargaFamiliar_NMs());
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(tipocargafami.getCargaFamiliars());
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
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
										
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargafami,new Object(),generalEntityParameterGeneral,this.tipocargafamiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocargafamiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCargaFamiConstantesFunciones.getClassesRelationshipsOfTipoCargaFami(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCargaFamiConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCargaFami(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCargaFami(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCargaFamiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocargafami,new Object(),generalEntityParameterGeneral,this.tipocargafamiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCargaFami(TipoCargaFamiBean tipocargafamiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.setCargaFamiliar_NMs(tipocargafami.getCargaFamiliar_NMs());
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.setCargaFamiliars(tipocargafami.getCargaFamiliars());
					this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCargaFami(ArrayList<Classe> classes,TipoCargaFamiReturnGeneral tipocargafamiReturnGeneral,TipoCargaFamiBean tipocargafamiBean,Boolean conDefault) throws Exception {
		
			this.tipocargafamiBean.setCargaFamiliar_NMs(tipocargafamiReturnGeneral.getTipoCargaFami().getCargaFamiliar_NMs());
			this.tipocargafamiBean.setCargaFamiliars(tipocargafamiReturnGeneral.getTipoCargaFami().getCargaFamiliars());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCargaFami(TipoCargaFami tipocargafami,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar_NM.class)) {
					tipocargafami.setCargaFamiliar_NMs(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmLogic.getCargaFamiliar_NMs());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CargaFamiliar.class)) {
					tipocargafami.setCargaFamiliars(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarBeanSwingJInternalFrame.cargafamiliarLogic.getCargaFamiliars());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocargafami)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCargaFami = new TipoCargaFamiDetalleFormJInternalFrame(jDesktopPane,this.tipocargafamiSessionBean.getConGuardarRelaciones(),this.tipocargafamiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.setVisible(false);
		this.jInternalFrameDetalleFormTipoCargaFami.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCargaFami.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCargaFami.tipocargafamiLogic=this.tipocargafamiLogic;
		
		this.cargarCombosFrameForeignKeyTipoCargaFami("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCargaFami();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCargaFami();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCargaFami("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCargaFami();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCargaFami.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCargaFami"));
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarTipoCargaFami.addActionListener(new ButtonActionListener(this,"ModificarTipoCargaFami"));

		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCargaFami"));
					
		this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemModificarTipoCargaFami.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCargaFami"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarTipoCargaFami.addActionListener (new ButtonActionListener(this,"ActualizarTipoCargaFami"));
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCargaFami"));
						
		this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemActualizarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCargaFami"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarTipoCargaFami.addActionListener (new ButtonActionListener(this,"EliminarTipoCargaFami"));
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCargaFami"));
								
		this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemEliminarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCargaFami"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CancelarTipoCargaFami"));
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCargaFami"));
					
		this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemCancelarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCargaFami"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemDetalleCerrarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCargaFami"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCargaFami"));
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCargaFami"));
		
		
		
		this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCargaFami"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonidTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCargaFamiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtoncodigoTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCargaFamiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonnombreTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCargaFamiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCargaFami"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCargaFami"));
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCargaFami"));
		}
		
		this.jTableDatosTipoCargaFami.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCargaFami"));
		
		this.jTableDatosTipoCargaFami.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCargaFami"));
		
		this.jButtonNuevoTipoCargaFami.addActionListener(new ButtonActionListener(this,"NuevoTipoCargaFami"));
		
		this.jButtonDuplicarTipoCargaFami.addActionListener(new ButtonActionListener(this,"DuplicarTipoCargaFami"));
		
		this.jButtonCopiarTipoCargaFami.addActionListener(new ButtonActionListener(this,"CopiarTipoCargaFami"));
		
		this.jButtonVerFormTipoCargaFami.addActionListener(new ButtonActionListener(this,"VerFormTipoCargaFami"));
		
		
		this.jButtonNuevoToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCargaFami"));
			
		this.jButtonDuplicarToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCargaFami"));
			
		this.jMenuItemNuevoTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCargaFami"));
			
		this.jMenuItemDuplicarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCargaFami"));		
		
		
		this.jButtonNuevoRelacionesTipoCargaFami.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCargaFami"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCargaFami"));
			
		this.jMenuItemNuevoRelacionesTipoCargaFami.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCargaFami"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarTipoCargaFami.addActionListener(new ButtonActionListener(this,"ModificarTipoCargaFami"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonModificarToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCargaFami"));
			
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemModificarTipoCargaFami.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCargaFami"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarTipoCargaFami.addActionListener (new ButtonActionListener(this,"ActualizarTipoCargaFami"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonActualizarToolBarTipoCargaFami.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCargaFami"));
				
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemActualizarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCargaFami"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarTipoCargaFami.addActionListener (new ButtonActionListener(this,"EliminarTipoCargaFami"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonEliminarToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCargaFami"));
						
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemEliminarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCargaFami"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CancelarTipoCargaFami"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonCancelarToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCargaFami"));
			
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemCancelarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCargaFami"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCargaFami"));		
		
		
		this.jButtonCerrarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CerrarTipoCargaFami"));
		
		
		this.jButtonCerrarToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCargaFami"));
			
		this.jMenuItemCerrarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCargaFami"));
			
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jMenuItemDetalleCerrarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCargaFami"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCargaFami"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCargaFami"));
		}
		
		this.jButtonCopiarToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCargaFami"));
			
		this.jButtonVerFormToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCargaFami"));
		
		this.jMenuItemGuardarCambiosTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCargaFami"));
			
		this.jMenuItemCopiarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCargaFami"));		
		
		this.jMenuItemVerFormTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCargaFami"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCargaFami"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCargaFami"));
			
		this.jMenuItemGuardarCambiosTablaTipoCargaFami.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCargaFami"));		
		
		
		
		this.jButtonRecargarInformacionTipoCargaFami.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCargaFami"));
					
		this.jButtonRecargarInformacionToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCargaFami"));
		
		this.jMenuItemRecargarInformacionTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCargaFami"));		
		
		
		
		this.jButtonAnterioresTipoCargaFami.addActionListener (new ButtonActionListener(this,"AnterioresTipoCargaFami"));
		
		
		this.jButtonAnterioresToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCargaFami"));
		
		this.jMenuItemAnterioresTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCargaFami"));		
		
		
		this.jButtonSiguientesTipoCargaFami.addActionListener (new ButtonActionListener(this,"SiguientesTipoCargaFami"));
		
		
		this.jButtonSiguientesToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCargaFami"));
			
		this.jMenuItemSiguientesTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCargaFami"));
			
		this.jMenuItemAbrirOrderByTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCargaFami"));
			
		this.jMenuItemMostrarOcultarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCargaFami"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCargaFami"));
			
		this.jMenuItemDetalleMostarOcultarTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCargaFami"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCargaFami.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCargaFami"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCargaFami"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCargaFami.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCargaFami"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCargaFami.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCargaFami"));

		this.jCheckBoxSeleccionadosTipoCargaFami.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCargaFami"));
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCargaFami"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCargaFami.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCargaFami"));
			
		this.jComboBoxTiposAccionesTipoCargaFami.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCargaFami"));
					
		this.jComboBoxTiposSeleccionarTipoCargaFami.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCargaFami"));
			
		this.jTextFieldValorCampoGeneralTipoCargaFami.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCargaFami"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonidTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCargaFamiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtoncodigoTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCargaFamiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonnombreTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCargaFamiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCargaFami!=null) {
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCargaFami"));
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCargaFami"));
				this.jInternalFrameReporteDinamicoTipoCargaFami.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCargaFami"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCargaFami.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCargaFami"));				
			//this.jButtonGenerarReporteDinamicoTipoCargaFami.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCargaFami"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCargaFami.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCargaFami"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCargaFami!=null) {
				this.jInternalFrameImportacionTipoCargaFami.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCargaFami"));
				this.jInternalFrameImportacionTipoCargaFami.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCargaFami"));
				this.jInternalFrameImportacionTipoCargaFami.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCargaFami"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCargaFami.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCargaFami"));
			
			this.jButtonAbrirOrderByToolBarTipoCargaFami.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCargaFami"));			
			
			if(this.jInternalFrameOrderByTipoCargaFami!=null) {
				this.jInternalFrameOrderByTipoCargaFami.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCargaFami"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCargaFami.jTabbedPaneRelacionesTipoCargaFami.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCargaFami"));
		
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
            		closingInternalFrameTipoCargaFami();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCargaFami.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCargaFami = (JInternalFrameBase)event.getSource();
	            	
	            TipoCargaFamiBeanSwingJInternalFrame jInternalFrameParent=(TipoCargaFamiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCargaFami.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCargaFamiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCargaFami.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCargaFamiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCargaFami.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCargaFami.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargaFamiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargaFamiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargaFamiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCargaFami";
		inputMap = this.jButtonNuevoTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCargaFamiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargaFamiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargaFamiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCargaFamiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCargaFami";
		inputMap = this.jButtonNuevoRelacionesTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCargaFamiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCargaFami";
		inputMap = this.jButtonModificarTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCargaFamiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCargaFami";
		inputMap = this.jButtonActualizarTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCargaFamiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCargaFami";
		inputMap = this.jButtonEliminarTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCargaFamiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCargaFami";
		inputMap = this.jButtonCancelarTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCargaFamiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCargaFami";
		inputMap = this.jButtonCerrarTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCargaFamiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCargaFami";
		inputMap = this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonGuardarCambiosTipoCargaFami.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCargaFamiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCargaFami.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCargaFamiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCargaFami.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCargaFamiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCargaFami.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCargaFamiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCargaFami.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCargaFamiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonidTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCargaFamiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtoncodigoTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCargaFamiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCargaFami.jButtonnombreTipoCargaFamiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCargaFamiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCargaFami.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCargaFamiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCargaFamiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCargaFami.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCargaFami(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
					tipocargafamiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargaFami tipocargafamiAux:tipocargafamis) {
					tipocargafamiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCargaFamiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCargaFami(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
						tipocargafamiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCargaFami tipocargafamiAux:tipocargafamis) {
						tipocargafamiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCargaFami tipocargafamiAux:tipocargafamis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCargaFami.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCargaFami.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFami,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCargaFamiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCargaFami(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCargaFami.getSelectedRows();
			
			TipoCargaFami tipocargafamiLocal=new TipoCargaFami();
			
			//this.seleccionarTodosTipoCargaFami(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocargafamiLocal =(TipoCargaFami) this.tipocargafamiLogic.getTipoCargaFamis().toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocargafamiLocal =(TipoCargaFami) this.tipocargafamis.toArray()[this.jTableDatosTipoCargaFami.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocargafamiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
						tipocargafamiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCargaFami tipocargafamiAux:tipocargafamis) {
						tipocargafamiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCargaFami.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCargaFami.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCargaFami,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCargaFamiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCargaFamiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCargaFamiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCargaFami(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCargaFami.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCargaFami tipocargafamiAux:this.tipocargafamiLogic.getTipoCargaFamis()) {
				
						if(sTipoSeleccionar.equals(TipoCargaFamiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocargafamiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocargafamiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargaFami tipocargafamiAux:tipocargafamis) {
					
						if(sTipoSeleccionar.equals(TipoCargaFamiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocargafamiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocargafamiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCargaFami(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCargaFamiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCargaFami(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCargaFami=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCargaFami.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCargaFami) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCargaFami(conSplash);
				
					this.generarReporteTipoCargaFamisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCargaFamisSeleccionados();
				//this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCargaFamisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCargaFamisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCargaFami();
				
				this.exportarTipoCargaFamisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCargaFamis();
				//this.importarTipoCargaFamis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCargaFami();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCargaFamisSeleccionados();
				//this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Carga Fami", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCargaFami();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCargaFami)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCargaFami(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCargaFamiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCargaFami) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCargaFami(conSplash);
					
						//this.actualizarParametrosGeneralTipoCargaFami();
						
						this.generarReporteProcesoAccionTipoCargaFamisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCargaFamiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Carga FamiS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Carga Fami", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCargaFami();
				
						this.actualizarParametrosGeneralTipoCargaFami();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocargafamiReturnGeneral=tipocargafamiLogic.procesarAccionTipoCargaFamisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocargafamiLogic.getTipoCargaFamis(),this.tipocargafamiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCargaFamiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCargaFami();
					
					TipoCargaFamiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCargaFamiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCargaFami.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCargaFami.jComboBoxTiposAccionesFormularioTipoCargaFami.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCargaFami(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCargaFamiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCargaFami();
			
			if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
			TipoCargaFami tipocargafami=new TipoCargaFami();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCargaFami(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCargaFami.getSelectedItem();
			
			
			
			
			tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocargafamisSeleccionados.size()==1) {
				for(TipoCargaFami tipocargafamiAux:tipocargafamisSeleccionados) {
					tipocargafami=tipocargafamiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Carga Familiar_ N M")) {
					jButtonCargaFamiliar_NMActionPerformed(null,rowIndex,true,false,tipocargafami);
				}
				else if(this.sTipoRelacion.equals("Carga Familiar")) {
					jButtonCargaFamiliarActionPerformed(null,rowIndex,true,false,tipocargafami);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCargaFami();
			
      		//this.finishProcessTipoCargaFami(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCargaFamiReturnGeneral() throws Exception {
		if(this.tipocargafamiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocargafamiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocargafamiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocargafamiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocargafamiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocargafamiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCargaFami(false);
		}
		
		if(this.tipocargafamiReturnGeneral.getConRetornoLista() || this.tipocargafamiReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocargafamiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocargafamiLogic.setTipoCargaFamis(this.tipocargafamiReturnGeneral.getTipoCargaFamis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocargafamiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocargafamiLogic.setTipoCargaFami(this.tipocargafamiReturnGeneral.getTipoCargaFami());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCargaFami(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCargaFami() throws Exception {
		
		
	}
	
	public ArrayList<TipoCargaFami> getTipoCargaFamisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCargaFami) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCargaFami tipocargafamiAux:tipocargafamiLogic.getTipoCargaFamis()) {
					if(tipocargafamiAux.getIsSelected()) {
						tipocargafamisSeleccionados.add(tipocargafamiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCargaFami tipocargafamiAux:this.tipocargafamis) {
					if(tipocargafamiAux.getIsSelected()) {
						tipocargafamisSeleccionados.add(tipocargafamiAux);				
					}
				}
			}
			
			if(tipocargafamisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocargafamisSeleccionados.addAll(this.tipocargafamiLogic.getTipoCargaFamis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocargafamisSeleccionados.addAll(this.tipocargafamis);				
					}
				}
			}
		} else {
			tipocargafamisSeleccionados.add(this.tipocargafami);
		}
		
		return tipocargafamisSeleccionados;
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
	
	public void generarReporteTipoCargaFamisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCargaFamisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCargaFamisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCargaFamisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCargaFamisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCargaFamisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Carga Fami",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCargaFamisSeleccionados() throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCargaFamisSeleccionados() throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCargaFamisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCargaFamisSeleccionados() throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCargaFami();
		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCargaFami();
		
		
		//this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados ,tipocargafamiImplementable,tipocargafamiImplementableHome);
	}
	
	public void mostrarImportacionTipoCargaFamis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCargaFami();
		
		this.abrirFrameImportacionTipoCargaFami();		
		
			
		//this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados ,tipocargafamiImplementable,tipocargafamiImplementableHome);
	}
	
	public void importarTipoCargaFamis() throws Exception {		
	
	}
	
	public void exportarTipoCargaFamisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCargaFamisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCargaFamisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCargaFamisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Carga Fami",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCargaFamisSeleccionados() throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCargaFami(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCargaFami tipocargafamiAux:tipocargafamisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCargaFami(tipocargafamiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocargafamiAux.setsDetalleGeneralEntityReporte(tipocargafamiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCargaFami(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCargaFamiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargaFamiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargaFamiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCargaFamiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCargaFami(TipoCargaFami tipocargafami,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocargafami.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargafami.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargafami.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocargafami.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCargaFamisSeleccionados() throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCargaFamis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCargaFami(row);				
				iRow++;
			}				
			
			for(TipoCargaFami tipocargafamiAux:tipocargafamisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCargaFami(tipocargafamiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCargaFamisSeleccionados() throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();		
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocargafami.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocargafamis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocargafami");
			//elementRoot.appendChild(element);
		
			for(TipoCargaFami tipocargafamiAux:tipocargafamisSeleccionados) {
				element = document.createElement("tipocargafami");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCargaFami(tipocargafamiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Carga Fami",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCargaFami(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCargaFami(TipoCargaFami tipocargafami,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargafami.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargafami.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocargafami.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCargaFami(TipoCargaFami tipocargafami,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCargaFamiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocargafami.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCargaFamiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocargafami.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCargaFamiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocargafami.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCargaFamiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocargafami.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCargaFamisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCargaFami> tipocargafamisSeleccionados=new ArrayList<TipoCargaFami>();
		
		tipocargafamisSeleccionados=this.getTipoCargaFamisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCargaFami(tipocargafamisSeleccionados);
		
		this.generarReporteTipoCargaFamis("Todos",tipocargafamisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCargaFami(ArrayList<TipoCargaFami> tipocargafamisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCargaFami tipocargafamiAux:tipocargafamisSeleccionados) {
				tipocargafamiAux.setsDetalleGeneralEntityReporte(tipocargafamiAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCargaFamiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocargafamiAux.setsDescripcionGeneralEntityReporte1(tipocargafamiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCargaFamiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocargafamiAux.setsDescripcionGeneralEntityReporte1(tipocargafamiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCargaFamiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCargaFami(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCargaFami=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=false;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
			this.isVisibilidadCeldaModificarTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=true;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
			this.isVisibilidadCeldaModificarTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=true;
			this.isVisibilidadCeldaEliminarTipoCargaFami=true;
			this.isVisibilidadCeldaCancelarTipoCargaFami=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
			this.isVisibilidadCeldaModificarTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=true;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCargaFami=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=true;
			this.isVisibilidadCeldaModificarTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=false;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
			this.isVisibilidadCeldaActualizarTipoCargaFami=false;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
			this.isVisibilidadCeldaModificarTipoCargaFami=true;
			this.isVisibilidadCeldaActualizarTipoCargaFami=false;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
			this.isVisibilidadCeldaCancelarTipoCargaFami=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCargaFami=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCargaFamiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCargaFami=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=true;
		} else {
			this.actualizarEstadoPanelsTipoCargaFami(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCargaFami=false;
			//this.isVisibilidadCeldaVerFormTipoCargaFami=false;
			this.isVisibilidadCeldaDuplicarTipoCargaFami=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocargafamiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCargaFami=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocargafamiSessionBean.getEsGuardarRelacionado()) {
			if(!tipocargafamiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;												
			}
			
			this.jButtonCerrarTipoCargaFami.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCargaFami=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocargafami)) {
			this.isVisibilidadCeldaActualizarTipoCargaFami=false;
			this.isVisibilidadCeldaEliminarTipoCargaFami=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCargaFami() {
		this.isVisibilidadCeldaNuevoTipoCargaFami=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCargaFami=false;
	}
	
	public void actualizarEstadoPanelsTipoCargaFami(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCargaFami!=null) {
				this.jScrollPanelDatosEdicionTipoCargaFami.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCargaFami!=null) {
				this.jScrollPanelDatosTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCargaFami!=null) {
				this.jPanelPaginacionTipoCargaFami.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCargaFami!=null) {
				this.jPanelParametrosReportesTipoCargaFami.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocargafamiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoCargaFamiParaCargaFamiliar_NMes() throws Exception {
		Boolean isPaginaPopupCargaFamiliar_NM=false;

		try {

			if(this.tipocargafamiSessionBean==null) {
				this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.setsPathNavegacionActual(tipocargafamiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargaFamiliar_NMConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargaFamiliar_NM=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(true);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar_NM(TipoCargaFamiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionTipoCargaFami(true);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliar_nmSessionBean.setlidTipoCargaFamiActual(this.idTipoCargaFamiActual);

			tipocargafamiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCargaFami(true);
			tipocargafamiSessionBean.setlIdTipoCargaFamiActualForeignKey(this.idTipoCargaFamiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoCargaFamiParaCargaFamiliares() throws Exception {
		Boolean isPaginaPopupCargaFamiliar=false;

		try {

			if(this.tipocargafamiSessionBean==null) {
				this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.setsPathNavegacionActual(tipocargafamiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargaFamiliarConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargaFamiliar=this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargaFamiliar(true);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargaFamiliar(TipoCargaFamiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionTipoCargaFami(true);
			this.jInternalFrameDetalleFormTipoCargaFami.cargafamiliarSessionBean.setlidTipoCargaFamiActual(this.idTipoCargaFamiActual);

			tipocargafamiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCargaFami(true);
			tipocargafamiSessionBean.setlIdTipoCargaFamiActualForeignKey(this.idTipoCargaFamiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCargaFamiSessionBean tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
		
		if(this.tipocargafamiSessionBean==null) {
			this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
		}
		
		this.tipocargafamiSessionBean.setsUltimaBusquedaTipoCargaFami(this.getsAccionBusqueda());
		this.tipocargafamiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocargafamiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCargaFamiSessionBean tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
		
		if(this.tipocargafamiSessionBean==null) {
			this.tipocargafamiSessionBean=new TipoCargaFamiSessionBean();
		}
		
		if(this.tipocargafamiSessionBean.getsUltimaBusquedaTipoCargaFami()!=null&&!this.tipocargafamiSessionBean.getsUltimaBusquedaTipoCargaFami().equals("")) {
			this.setsAccionBusqueda(tipocargafamiSessionBean.getsUltimaBusquedaTipoCargaFami());
			this.setiNumeroPaginacion(tipocargafamiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocargafamiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocargafamiSessionBean.setsUltimaBusquedaTipoCargaFami("");
		this.tipocargafamiSessionBean.setiNumeroPaginacion(TipoCargaFamiConstantesFunciones.INUMEROPAGINACION);
		this.tipocargafamiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCargaFami(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCargaFami() {
		this.updateBorderResaltarBusquedasFormularioTipoCargaFami();
		this.updateVisibilidadBusquedasFormularioTipoCargaFami();
		this.updateHabilitarBusquedasFormularioTipoCargaFami();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCargaFami() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCargaFami() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCargaFami() {
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
	
	public void updateControlesFormularioTipoCargaFami() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCargaFami();
		this.updateVisibilidadResaltarControlesFormularioTipoCargaFami();
		this.updateHabilitarResaltarControlesFormularioTipoCargaFami();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCargaFami() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocargafamiConstantesFunciones.resaltaridTipoCargaFami!=null && this.jInternalFrameDetalleFormTipoCargaFami!=null) {this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setBorder(this.tipocargafamiConstantesFunciones.resaltaridTipoCargaFami);}
		if(this.tipocargafamiConstantesFunciones.resaltarcodigoTipoCargaFami!=null && this.jInternalFrameDetalleFormTipoCargaFami!=null) {this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setBorder(this.tipocargafamiConstantesFunciones.resaltarcodigoTipoCargaFami);}
		if(this.tipocargafamiConstantesFunciones.resaltarnombreTipoCargaFami!=null && this.jInternalFrameDetalleFormTipoCargaFami!=null) {this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setBorder(this.tipocargafamiConstantesFunciones.resaltarnombreTipoCargaFami);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCargaFami() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
	
		//this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setVisible(this.tipocargafamiConstantesFunciones.mostraridTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jPanelidTipoCargaFami.setVisible(this.tipocargafamiConstantesFunciones.mostraridTipoCargaFami);
		//this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setVisible(this.tipocargafamiConstantesFunciones.mostrarcodigoTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jPanelcodigoTipoCargaFami.setVisible(this.tipocargafamiConstantesFunciones.mostrarcodigoTipoCargaFami);
		//this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setVisible(this.tipocargafamiConstantesFunciones.mostrarnombreTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jPanelnombreTipoCargaFami.setVisible(this.tipocargafamiConstantesFunciones.mostrarnombreTipoCargaFami);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCargaFami() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCargaFami==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCargaFami!=null) {
	
		this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldidTipoCargaFami.setEnabled(this.tipocargafamiConstantesFunciones.activaridTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jTextFieldcodigoTipoCargaFami.setEnabled(this.tipocargafamiConstantesFunciones.activarcodigoTipoCargaFami);
		this.jInternalFrameDetalleFormTipoCargaFami.jTextAreanombreTipoCargaFami.setEnabled(this.tipocargafamiConstantesFunciones.activarnombreTipoCargaFami);
		}
	}
	
		
}