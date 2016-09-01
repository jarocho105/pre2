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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.CobrarMorosidadClientesDetalladosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarMorosidadClientesDetalladosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarMorosidadClientesDetalladosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarMorosidadClientesDetalladosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame extends CobrarMorosidadClientesDetalladosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladosValidator = new ClassValidator<CobrarMorosidadClientesDetallados>(CobrarMorosidadClientesDetallados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados;	
	public CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux;
	public CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosTotales;
	public Long idCobrarMorosidadClientesDetalladosActual;
	public Long iIdNuevoCobrarMorosidadClientesDetallados=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
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
	
	public Boolean isPermisoTodoCobrarMorosidadClientesDetallados;
	public Boolean isPermisoNuevoCobrarMorosidadClientesDetallados;
	public Boolean isPermisoActualizarCobrarMorosidadClientesDetallados;
	public Boolean isPermisoActualizarOriginalCobrarMorosidadClientesDetallados;
	public Boolean isPermisoEliminarCobrarMorosidadClientesDetallados;
	public Boolean isPermisoGuardarCambiosCobrarMorosidadClientesDetallados;
	public Boolean isPermisoConsultaCobrarMorosidadClientesDetallados;
	public Boolean isPermisoBusquedaCobrarMorosidadClientesDetallados;
	public Boolean isPermisoReporteCobrarMorosidadClientesDetallados;
	public Boolean isPermisoPaginacionMedioCobrarMorosidadClientesDetallados;
	public Boolean isPermisoPaginacionAltoCobrarMorosidadClientesDetallados;
	public Boolean isPermisoPaginacionTodoCobrarMorosidadClientesDetallados;
	public Boolean isPermisoCopiarCobrarMorosidadClientesDetallados;
	public Boolean isPermisoVerFormCobrarMorosidadClientesDetallados;
	public Boolean isPermisoDuplicarCobrarMorosidadClientesDetallados;
	public Boolean isPermisoOrdenCobrarMorosidadClientesDetallados;
	
	
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
	
	public CobrarMorosidadClientesDetalladosParameterReturnGeneral cobrarmorosidadclientesdetalladosReturnGeneral;
	public CobrarMorosidadClientesDetalladosParameterReturnGeneral cobrarmorosidadclientesdetalladosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarMorosidadClientesDetallados=false;
	public Boolean esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarMorosidadClientesDetalladosSessionBeanAdditional cobrarmorosidadclientesdetalladosSessionBeanAdditional=null;
	
	public CobrarMorosidadClientesDetalladosSessionBeanAdditional getCobrarMorosidadClientesDetalladosSessionBeanAdditional() {
		return this.cobrarmorosidadclientesdetalladosSessionBeanAdditional;
	}
	
	public void setCobrarMorosidadClientesDetalladosSessionBeanAdditional(CobrarMorosidadClientesDetalladosSessionBeanAdditional cobrarmorosidadclientesdetalladosSessionBeanAdditional) {
		try {
			this.cobrarmorosidadclientesdetalladosSessionBeanAdditional=cobrarmorosidadclientesdetalladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional cobrarmorosidadclientesdetalladosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame
	
	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional getCobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional() {
		return this.cobrarmorosidadclientesdetalladosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional cobrarmorosidadclientesdetalladosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarmorosidadclientesdetalladosBeanSwingJInternalFrameAdditional=cobrarmorosidadclientesdetalladosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarMorosidadClientesDetalladosLogic cobrarmorosidadclientesdetalladosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosBean;
	public CobrarMorosidadClientesDetalladosConstantesFunciones cobrarmorosidadclientesdetalladosConstantesFunciones;
	//public CobrarMorosidadClientesDetalladosParameterReturnGeneral cobrarmorosidadclientesdetalladosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladoss;	
	//public List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossEliminados;
	//public List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados=true;
	public Boolean isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados=true;
	public Boolean isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados=true;
	public Boolean isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarMorosidadClientesDetallados=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCobrarMorosidadClientesDetallados() {
		return this.iIdNuevoCobrarMorosidadClientesDetallados;
	}

	public void setiIdNuevoCobrarMorosidadClientesDetallados(Long iIdNuevoCobrarMorosidadClientesDetallados) {
		this.iIdNuevoCobrarMorosidadClientesDetallados = iIdNuevoCobrarMorosidadClientesDetallados;
	}
	
	public Long getidCobrarMorosidadClientesDetalladosActual() {
		return this.idCobrarMorosidadClientesDetalladosActual;
	}

	public void setidCobrarMorosidadClientesDetalladosActual(Long idCobrarMorosidadClientesDetalladosActual) {
		this.idCobrarMorosidadClientesDetalladosActual = idCobrarMorosidadClientesDetalladosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarMorosidadClientesDetallados getcobrarmorosidadclientesdetallados() {
		return this.cobrarmorosidadclientesdetallados;
	}

	public void setcobrarmorosidadclientesdetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados) {
		this.cobrarmorosidadclientesdetallados = cobrarmorosidadclientesdetallados;
	}
	
	public CobrarMorosidadClientesDetallados getcobrarmorosidadclientesdetalladosAux() {
		return this.cobrarmorosidadclientesdetalladosAux;
	}

	public void setcobrarmorosidadclientesdetalladosAux(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux) {
		this.cobrarmorosidadclientesdetalladosAux = cobrarmorosidadclientesdetalladosAux;
	}				
	
	public CobrarMorosidadClientesDetallados getcobrarmorosidadclientesdetalladosAnterior() {
		return this.cobrarmorosidadclientesdetalladosAnterior;
	}

	public void setcobrarmorosidadclientesdetalladosAnterior(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAnterior) {
		this.cobrarmorosidadclientesdetalladosAnterior = cobrarmorosidadclientesdetalladosAnterior;
	}	
	
	public CobrarMorosidadClientesDetallados getcobrarmorosidadclientesdetalladosTotales() {
		return this.cobrarmorosidadclientesdetalladosTotales;
	}

	public void setcobrarmorosidadclientesdetalladosTotales(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosTotales) {
		this.cobrarmorosidadclientesdetalladosTotales = cobrarmorosidadclientesdetalladosTotales;
	}	
	
	public CobrarMorosidadClientesDetallados getcobrarmorosidadclientesdetalladosBean() {
		return this.cobrarmorosidadclientesdetalladosBean;
	}

	public void setcobrarmorosidadclientesdetalladosBean(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosBean) {
		this.cobrarmorosidadclientesdetalladosBean = cobrarmorosidadclientesdetalladosBean;
	}	
	
	public CobrarMorosidadClientesDetalladosParameterReturnGeneral getcobrarmorosidadclientesdetalladosReturnGeneral() {
		return this.cobrarmorosidadclientesdetalladosReturnGeneral;
	}

	public void setcobrarmorosidadclientesdetalladosReturnGeneral(CobrarMorosidadClientesDetalladosParameterReturnGeneral cobrarmorosidadclientesdetalladosReturnGeneral) {
		this.cobrarmorosidadclientesdetalladosReturnGeneral = cobrarmorosidadclientesdetalladosReturnGeneral;
	}	
	
	
	public Date fecha_venceBusquedaCobrarMorosidadClientesDetallados=new Date();

	public Date getfecha_venceBusquedaCobrarMorosidadClientesDetallados() {
		return this.fecha_venceBusquedaCobrarMorosidadClientesDetallados;
	}

	public void setfecha_venceBusquedaCobrarMorosidadClientesDetallados(Date fecha_venceBusquedaCobrarMorosidadClientesDetallados) {
		this.fecha_venceBusquedaCobrarMorosidadClientesDetallados = fecha_venceBusquedaCobrarMorosidadClientesDetallados;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarMorosidadClientesDetalladosLogic getCobrarMorosidadClientesDetalladosLogic()	{		
		return cobrarmorosidadclientesdetalladosLogic;
	}

	public void setCobrarMorosidadClientesDetalladosLogic(CobrarMorosidadClientesDetalladosLogic cobrarmorosidadclientesdetalladosLogic) {
		this.cobrarmorosidadclientesdetalladosLogic = cobrarmorosidadclientesdetalladosLogic;
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
	
	public Boolean getIsEsNuevoCobrarMorosidadClientesDetallados() {
		return isEsNuevoCobrarMorosidadClientesDetallados;
	}

	public void setIsEsNuevoCobrarMorosidadClientesDetallados(Boolean isEsNuevoCobrarMorosidadClientesDetallados) {
		this.isEsNuevoCobrarMorosidadClientesDetallados = isEsNuevoCobrarMorosidadClientesDetallados;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarMorosidadClientesDetallados() {
		return esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarMorosidadClientesDetallados(Boolean esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados) {
		this.esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados = esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarmorosidadclientesdetalladosSessionBean==null) {
				this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean();
			}

			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(cobrarmorosidadclientesdetalladosSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.cobrarmorosidadclientesdetallados!=null) {
						this.cobrarmorosidadclientesdetallados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
						this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarMorosidadClientesDetallados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
						if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico!=null && jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,JComboBox jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarMorosidadClientesDetalladosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarmorosidadclientesdetallados.setid_empresa(empresaAux.getId());
				cobrarmorosidadclientesdetallados.setempresa_descripcion(CobrarMorosidadClientesDetalladosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarmorosidadclientesdetallados.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { 
							this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { 
					}

					if(!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
							this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
							this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarMorosidadClientesDetallados() throws Exception {
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
		
	public CobrarMorosidadClientesDetalladosParameterReturnGeneral getCobrarMorosidadClientesDetalladosParameterGeneral() {
		return this.cobrarmorosidadclientesdetalladosParameterGeneral;
	}
	
	public void setCobrarMorosidadClientesDetalladosParameterGeneral(CobrarMorosidadClientesDetalladosParameterReturnGeneral cobrarmorosidadclientesdetalladosParameterGeneral) {
		this.cobrarmorosidadclientesdetalladosParameterGeneral = cobrarmorosidadclientesdetalladosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarMorosidadClientesDetallados() {
		return isPermisoTodoCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoTodoCobrarMorosidadClientesDetallados(Boolean isPermisoTodoCobrarMorosidadClientesDetallados) {
		this.isPermisoTodoCobrarMorosidadClientesDetallados = isPermisoTodoCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsPermisoNuevoCobrarMorosidadClientesDetallados() {
		return isPermisoNuevoCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoNuevoCobrarMorosidadClientesDetallados(Boolean isPermisoNuevoCobrarMorosidadClientesDetallados) {
		this.isPermisoNuevoCobrarMorosidadClientesDetallados = isPermisoNuevoCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsPermisoActualizarCobrarMorosidadClientesDetallados() {
		return isPermisoActualizarCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoActualizarCobrarMorosidadClientesDetallados(Boolean isPermisoActualizarCobrarMorosidadClientesDetallados) {
		this.isPermisoActualizarCobrarMorosidadClientesDetallados = isPermisoActualizarCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsPermisoEliminarCobrarMorosidadClientesDetallados() {
		return isPermisoEliminarCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoEliminarCobrarMorosidadClientesDetallados(Boolean isPermisoEliminarCobrarMorosidadClientesDetallados) {
		this.isPermisoEliminarCobrarMorosidadClientesDetallados = isPermisoEliminarCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarMorosidadClientesDetallados() {
		return isPermisoGuardarCambiosCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoGuardarCambiosCobrarMorosidadClientesDetallados(Boolean isPermisoGuardarCambiosCobrarMorosidadClientesDetallados) {
		this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados = isPermisoGuardarCambiosCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoConsultaCobrarMorosidadClientesDetallados() {
		return isPermisoConsultaCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoConsultaCobrarMorosidadClientesDetallados(Boolean isPermisoConsultaCobrarMorosidadClientesDetallados) {
		this.isPermisoConsultaCobrarMorosidadClientesDetallados = isPermisoConsultaCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsPermisoBusquedaCobrarMorosidadClientesDetallados() {
		return isPermisoBusquedaCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoBusquedaCobrarMorosidadClientesDetallados(Boolean isPermisoBusquedaCobrarMorosidadClientesDetallados) {
		this.isPermisoBusquedaCobrarMorosidadClientesDetallados = isPermisoBusquedaCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsPermisoReporteCobrarMorosidadClientesDetallados() {
		return isPermisoReporteCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoReporteCobrarMorosidadClientesDetallados(Boolean isPermisoReporteCobrarMorosidadClientesDetallados) {
		this.isPermisoReporteCobrarMorosidadClientesDetallados = isPermisoReporteCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarMorosidadClientesDetallados() {
		return isPermisoPaginacionMedioCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoPaginacionMedioCobrarMorosidadClientesDetallados(Boolean isPermisoPaginacionMedioCobrarMorosidadClientesDetallados) {
		this.isPermisoPaginacionMedioCobrarMorosidadClientesDetallados = isPermisoPaginacionMedioCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarMorosidadClientesDetallados() {
		return isPermisoPaginacionTodoCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoPaginacionTodoCobrarMorosidadClientesDetallados(Boolean isPermisoPaginacionTodoCobrarMorosidadClientesDetallados) {
		this.isPermisoPaginacionTodoCobrarMorosidadClientesDetallados = isPermisoPaginacionTodoCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarMorosidadClientesDetallados() {
		return isPermisoPaginacionAltoCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoPaginacionAltoCobrarMorosidadClientesDetallados(Boolean isPermisoPaginacionAltoCobrarMorosidadClientesDetallados) {
		this.isPermisoPaginacionAltoCobrarMorosidadClientesDetallados = isPermisoPaginacionAltoCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoCopiarCobrarMorosidadClientesDetallados() {
		return isPermisoCopiarCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoCopiarCobrarMorosidadClientesDetallados(Boolean isPermisoCopiarCobrarMorosidadClientesDetallados) {
		this.isPermisoCopiarCobrarMorosidadClientesDetallados = isPermisoCopiarCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoVerFormCobrarMorosidadClientesDetallados() {
		return isPermisoVerFormCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoVerFormCobrarMorosidadClientesDetallados(Boolean isPermisoVerFormCobrarMorosidadClientesDetallados) {
		this.isPermisoVerFormCobrarMorosidadClientesDetallados = isPermisoVerFormCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoDuplicarCobrarMorosidadClientesDetallados() {
		return isPermisoDuplicarCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoDuplicarCobrarMorosidadClientesDetallados(Boolean isPermisoDuplicarCobrarMorosidadClientesDetallados) {
		this.isPermisoDuplicarCobrarMorosidadClientesDetallados = isPermisoDuplicarCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsPermisoOrdenCobrarMorosidadClientesDetallados() {
		return isPermisoOrdenCobrarMorosidadClientesDetallados;
	}

	public void setIsPermisoOrdenCobrarMorosidadClientesDetallados(Boolean isPermisoOrdenCobrarMorosidadClientesDetallados) {
		this.isPermisoOrdenCobrarMorosidadClientesDetallados = isPermisoOrdenCobrarMorosidadClientesDetallados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados = isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados = isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados = isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados = isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados = isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados = isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaModificarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados = isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados = isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados = isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados = isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados = isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados() {
		return isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados(Boolean isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados) {
		this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados = isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados;
	}
		
	public CobrarMorosidadClientesDetalladosSessionBean getcobrarmorosidadclientesdetalladosSessionBean() {
		return this.cobrarmorosidadclientesdetalladosSessionBean;
	}
	
	public void setcobrarmorosidadclientesdetalladosSessionBean(CobrarMorosidadClientesDetalladosSessionBean cobrarmorosidadclientesdetalladosSessionBean) {
		this.cobrarmorosidadclientesdetalladosSessionBean=cobrarmorosidadclientesdetalladosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarMorosidadClientesDetallados() {
		return this.isVisibilidadBusquedaCobrarMorosidadClientesDetallados;
	}

	public void setisVisibilidadBusquedaCobrarMorosidadClientesDetallados(Boolean isVisibilidadBusquedaCobrarMorosidadClientesDetallados) {
		this.isVisibilidadBusquedaCobrarMorosidadClientesDetallados=isVisibilidadBusquedaCobrarMorosidadClientesDetallados;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarmorosidadclientesdetallados,null);
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
	
	public void bugActualizarReferenciaActual(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarmorosidadclientesdetalladosAux.setId(cobrarmorosidadclientesdetallados.getId());
		cobrarmorosidadclientesdetalladosAux.setVersionRow(cobrarmorosidadclientesdetallados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal) throws Exception {
		
		if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal) throws Exception {	
		if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarmorosidadclientesdetalladosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarMorosidadClientesDetalladosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarmorosidadclientesdetalladosValidator.getInvalidValues(this.cobrarmorosidadclientesdetallados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladoss) throws Exception {
		try	{			
			CobrarMorosidadClientesDetalladosConstantesFunciones.actualizarSelectedLista(cobrarmorosidadclientesdetallados,cobrarmorosidadclientesdetalladoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarmorosidadclientesdetalladossLocal=this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarmorosidadclientesdetalladossLocal=this.cobrarmorosidadclientesdetalladoss;
			}
			//ARCHITECTURE
		
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal:cobrarmorosidadclientesdetalladossLocal) {
				if(this.permiteMantenimiento(cobrarmorosidadclientesdetalladosLocal) && cobrarmorosidadclientesdetalladosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.getCobrarMorosidadClientesDetalladosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarMorosidadClientesDetalladosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelcodigoCobrarMorosidadClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarMorosidadClientesDetalladosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelnombre_completoCobrarMorosidadClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarMorosidadClientesDetalladosConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarMorosidadClientesDetalladosConstantesFunciones.SALDOVENCIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarMorosidadClientesDetalladosConstantesFunciones.SALDOVENCER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelsaldo_vencerCobrarMorosidadClientesDetallados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelcodigoCobrarMorosidadClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelnombre_completoCobrarMorosidadClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelsaldo_vencerCobrarMorosidadClientesDetallados,"");
		
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
		this.iIdNuevoCobrarMorosidadClientesDetallados--;	
		
		
		this.cobrarmorosidadclientesdetalladosAux=new CobrarMorosidadClientesDetallados();
		
		this.cobrarmorosidadclientesdetalladosAux.setId(this.iIdNuevoCobrarMorosidadClientesDetallados);
		this.cobrarmorosidadclientesdetalladosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().add(this.cobrarmorosidadclientesdetalladosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarmorosidadclientesdetalladoss.add(this.cobrarmorosidadclientesdetalladosAux);
		}
		//ARCHITECTURE
		
		this.cobrarmorosidadclientesdetallados=this.cobrarmorosidadclientesdetalladosAux;
		
		if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
		}
				
		//this.setDefaultControlesCobrarMorosidadClientesDetallados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarMorosidadClientesDetallados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarMorosidadClientesDetallados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarMorosidadClientesDetallados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosBean,this.cobrarmorosidadclientesdetallados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral,this.cobrarmorosidadclientesdetalladosBean,false);
		
		if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados());
		}
		
		if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados(),classes);//this.cobrarmorosidadclientesdetalladosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarMorosidadClientesDetallados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarMorosidadClientesDetallados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.RecargarFormCobrarMorosidadClientesDetallados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
						
			if(cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarMorosidadClientesDetallados();
			}
			
			this.actualizarVisualTableDatosCobrarMorosidadClientesDetallados();
			
			this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarMorosidadClientesDetallados(), this.getIndiceNuevoCobrarMorosidadClientesDetallados());
			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarfecha_venceCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarcodigoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnombre_completoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencidoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencerCobrarMorosidadClientesDetallados);	
		//
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setEnabled(isHabilitar && this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarid_empresaCobrarMorosidadClientesDetallados);
	};
	
	public void setDefaultControlesCobrarMorosidadClientesDetallados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarMorosidadClientesDetallados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarmorosidadclientesdetalladosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarmorosidadclientesdetalladosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setVisible(true);
			
					
		} else {
			//this.cobrarmorosidadclientesdetalladosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarmorosidadclientesdetalladosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarMorosidadClientesDetallados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
				if(cobrarmorosidadclientesdetalladosAux.getId().equals(this.iIdNuevoCobrarMorosidadClientesDetallados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladoss) {
				if(cobrarmorosidadclientesdetalladosAux.getId().equals(this.iIdNuevoCobrarMorosidadClientesDetallados)) {
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
	
	public int getIndiceActualCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
				if(cobrarmorosidadclientesdetalladosAux.getId().equals(cobrarmorosidadclientesdetallados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladoss) {
				if(cobrarmorosidadclientesdetalladosAux.getId().equals(cobrarmorosidadclientesdetallados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
				if(cobrarmorosidadclientesdetalladosAux.getCobrarMorosidadClientesDetalladosOriginal().getId().equals(cobrarmorosidadclientesdetalladosOriginal.getId())) {
					existe=true;
					cobrarmorosidadclientesdetalladosOriginal.setId(cobrarmorosidadclientesdetalladosAux.getId());
					cobrarmorosidadclientesdetalladosOriginal.setVersionRow(cobrarmorosidadclientesdetalladosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladoss) {
				if(cobrarmorosidadclientesdetalladosAux.getCobrarMorosidadClientesDetalladosOriginal().getId().equals(cobrarmorosidadclientesdetalladosOriginal.getId())) {
					existe=true;
					cobrarmorosidadclientesdetalladosOriginal.setId(cobrarmorosidadclientesdetalladosAux.getId());
					cobrarmorosidadclientesdetalladosOriginal.setVersionRow(cobrarmorosidadclientesdetalladosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarMorosidadClientesDetallados(Boolean esParaCancelar) throws Exception {
		cobrarmorosidadclientesdetalladossAux=new ArrayList<CobrarMorosidadClientesDetallados>();
		cobrarmorosidadclientesdetalladosAux=new CobrarMorosidadClientesDetallados();
		
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
					if(cobrarmorosidadclientesdetalladosAux.getId()<0) {
						cobrarmorosidadclientesdetalladossAux.add(cobrarmorosidadclientesdetalladosAux);
					}		
				}
				this.iIdNuevoCobrarMorosidadClientesDetallados=0L;
				this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().removeAll(cobrarmorosidadclientesdetalladossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladoss) {
					if(cobrarmorosidadclientesdetalladosAux.getId()<0) {
						cobrarmorosidadclientesdetalladossAux.add(cobrarmorosidadclientesdetalladosAux);
					}		
				}
				this.iIdNuevoCobrarMorosidadClientesDetallados=0L;
				this.cobrarmorosidadclientesdetalladoss.removeAll(cobrarmorosidadclientesdetalladossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarMorosidadClientesDetallados 
					&& this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size()>0
					) {
					cobrarmorosidadclientesdetalladosAux=this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().get(this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size() - 1);
				
					if(cobrarmorosidadclientesdetalladosAux.getId()<0) {
						this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().remove(cobrarmorosidadclientesdetalladosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarMorosidadClientesDetallados && this.cobrarmorosidadclientesdetalladoss.size()>0) {
					cobrarmorosidadclientesdetalladosAux=this.cobrarmorosidadclientesdetalladoss.get(this.cobrarmorosidadclientesdetalladoss.size() - 1);
				
					if(cobrarmorosidadclientesdetalladosAux.getId()<0) {
						this.cobrarmorosidadclientesdetalladoss.remove(cobrarmorosidadclientesdetalladosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarMorosidadClientesDetallados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarmorosidadclientesdetallados.getId()<0) {
				this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().remove(this.cobrarmorosidadclientesdetallados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarmorosidadclientesdetallados.getId()<0) {
				this.cobrarmorosidadclientesdetalladoss.remove(this.cobrarmorosidadclientesdetallados);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarMorosidadClientesDetallados(List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossAux) throws Exception {
		CobrarMorosidadClientesDetalladosConstantesFunciones.setEstadosInicialesCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladossAux);
	}
	
	public void setEstadosInicialesCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux) throws Exception {
		CobrarMorosidadClientesDetalladosConstantesFunciones.setEstadosInicialesCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarMorosidadClientesDetalladosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarMorosidadClientesDetalladosActual()) {
				if(!this.isEsNuevoCobrarMorosidadClientesDetallados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarMorosidadClientesDetallados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarMorosidadClientesDetalladosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Morosidad Clientes Detallados ?", "MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados) throws Exception {
		CobrarMorosidadClientesDetalladosConstantesFunciones.seleccionarAsignar(this.cobrarmorosidadclientesdetallados,cobrarmorosidadclientesdetallados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarMorosidadClientesDetallados=this.isPermisoActualizarOriginalCobrarMorosidadClientesDetallados;
			
			
			this.seleccionarAsignar(cobrarmorosidadclientesdetallados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarmorosidadclientesdetalladosSessionBean.setsFuncionBusquedaRapida(this.cobrarmorosidadclientesdetalladosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarMorosidadClientesDetallados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarMorosidadClientesDetallados(esParaCancelar);				
				this.cancelarNuevoCobrarMorosidadClientesDetallados(esParaCancelar);								
			}
			
			this.cobrarmorosidadclientesdetallados=new CobrarMorosidadClientesDetallados();
			
			this.inicializarCobrarMorosidadClientesDetallados();
			
			this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarMorosidadClientesDetallados() throws Exception {
		try {
			CobrarMorosidadClientesDetalladosConstantesFunciones.inicializarCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarMorosidadClientesDetalladoss(String sAccionBusqueda,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarMorosidadClientesDetallados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarMorosidadClientesDetalladosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarMorosidadClientesDetalladosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarMorosidadClientesDetallados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Morosidad Clientes Detalladoses");		
		parameters.put("busquedapor", CobrarMorosidadClientesDetalladosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarMorosidadClientesDetallados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarMorosidadClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarMorosidadClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarMorosidadClientesDetallados=new JRBeanArrayDataSource(CobrarMorosidadClientesDetalladosJInternalFrame.TraerCobrarMorosidadClientesDetalladosBeans(cobrarmorosidadclientesdetalladossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarMorosidadClientesDetallados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarMorosidadClientesDetalladosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarMorosidadClientesDetalladosBean.TraerCobrarMorosidadClientesDetalladosBeans(cobrarmorosidadclientesdetalladossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarMorosidadClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarmorosidadclientesdetalladossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarMorosidadClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarmorosidadclientesdetalladossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(null);
					//this.generarExcelReporteCobrarMorosidadClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarmorosidadclientesdetalladossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarMorosidadClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarmorosidadclientesdetalladossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarMorosidadClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarmorosidadclientesdetalladossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarMorosidadClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarmorosidadclientesdetalladossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarMorosidadClientesDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarMorosidadClientesDetalladoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarMorosidadClientesDetallados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados : cobrarmorosidadclientesdetalladossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarMorosidadClientesDetalladosConstantesFunciones.generarExcelReporteDataCobrarMorosidadClientesDetallados("NORMAL",row,workbook,cobrarmorosidadclientesdetallados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarMorosidadClientesDetallados(String sTipo,Row row,Workbook workbook) {
		
		CobrarMorosidadClientesDetalladosConstantesFunciones.generarExcelReporteHeaderCobrarMorosidadClientesDetallados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarMorosidadClientesDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarMorosidadClientesDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados : cobrarmorosidadclientesdetalladossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.getCobrarMorosidadClientesDetalladosDescripcion(cobrarmorosidadclientesdetallados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getsaldo_vencido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarmorosidadclientesdetallados.getsaldo_vencer());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarMorosidadClientesDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossRespaldo=null;
		
		classes=CobrarMorosidadClientesDetalladosConstantesFunciones.getClassesRelationshipsOfCobrarMorosidadClientesDetallados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarmorosidadclientesdetalladosLogic.setDatosCliente(this.datosCliente);
		this.cobrarmorosidadclientesdetalladosLogic.setDatosDeep(this.datosDeep);
		this.cobrarmorosidadclientesdetalladosLogic.setIsConDeep(true);
		
		cobrarmorosidadclientesdetalladossRespaldo=this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss();
		
		this.cobrarmorosidadclientesdetalladosLogic.setCobrarMorosidadClientesDetalladoss(cobrarmorosidadclientesdetalladossParaReportes);	
		this.cobrarmorosidadclientesdetalladosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarmorosidadclientesdetalladossParaReportes=this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss();
		this.cobrarmorosidadclientesdetalladosLogic.setCobrarMorosidadClientesDetalladoss(cobrarmorosidadclientesdetalladossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarMorosidadClientesDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarMorosidadClientesDetallados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados : cobrarmorosidadclientesdetalladossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarMorosidadClientesDetallados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarMorosidadClientesDetalladosConstantesFunciones.generarExcelReporteDataCobrarMorosidadClientesDetallados("NORMAL",row,workbook,cobrarmorosidadclientesdetallados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.getCobrarMorosidadClientesDetalladosDescripcion(cobrarmorosidadclientesdetallados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarMorosidadClientesDetallados() throws Exception {		
		this.startProcessCobrarMorosidadClientesDetallados(true);
	}
	
	public void startProcessCobrarMorosidadClientesDetallados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados ,this.jPanelParametrosReportesCobrarMorosidadClientesDetallados, this.jScrollPanelDatosCobrarMorosidadClientesDetallados,this.jPanelPaginacionCobrarMorosidadClientesDetallados, this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados, this.jPanelAccionesCobrarMorosidadClientesDetallados,this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados,this.jmenuBarCobrarMorosidadClientesDetallados,this.jmenuBarDetalleCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,this.jTtoolBarDetalleCobrarMorosidadClientesDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarMorosidadClientesDetallados=this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados; 
		
		final JPanel jPanelParametrosReportesCobrarMorosidadClientesDetallados=this.jPanelParametrosReportesCobrarMorosidadClientesDetallados;
		//final JScrollPane jScrollPanelDatosCobrarMorosidadClientesDetallados=this.jScrollPanelDatosCobrarMorosidadClientesDetallados;
		final JTable jTableDatosCobrarMorosidadClientesDetallados=this.jTableDatosCobrarMorosidadClientesDetallados;		
		final JPanel jPanelPaginacionCobrarMorosidadClientesDetallados=this.jPanelPaginacionCobrarMorosidadClientesDetallados;
		//final JScrollPane jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados=this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados;
		final JPanel jPanelAccionesCobrarMorosidadClientesDetallados=this.jPanelAccionesCobrarMorosidadClientesDetallados;
		
		JPanel jPanelCamposAuxiliarCobrarMorosidadClientesDetallados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarMorosidadClientesDetallados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			jPanelCamposAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelCamposCobrarMorosidadClientesDetallados;
			jPanelAccionesFormularioAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelAccionesFormularioCobrarMorosidadClientesDetallados;
		}
		
		final JPanel jPanelCamposCobrarMorosidadClientesDetallados=jPanelCamposAuxiliarCobrarMorosidadClientesDetallados;
		final JPanel jPanelAccionesFormularioCobrarMorosidadClientesDetallados=jPanelAccionesFormularioAuxiliarCobrarMorosidadClientesDetallados;
		
		
		final JMenuBar jmenuBarCobrarMorosidadClientesDetallados=this.jmenuBarCobrarMorosidadClientesDetallados;
		final JToolBar jTtoolBarCobrarMorosidadClientesDetallados=this.jTtoolBarCobrarMorosidadClientesDetallados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarMorosidadClientesDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarMorosidadClientesDetallados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			jmenuBarDetalleAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jmenuBarDetalleCobrarMorosidadClientesDetallados;
			jTtoolBarDetalleAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTtoolBarDetalleCobrarMorosidadClientesDetallados;
		}
		
		final JMenuBar jmenuBarDetalleCobrarMorosidadClientesDetallados=jmenuBarDetalleAuxiliarCobrarMorosidadClientesDetallados;
		final JToolBar jTtoolBarDetalleCobrarMorosidadClientesDetallados=jTtoolBarDetalleAuxiliarCobrarMorosidadClientesDetallados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarMorosidadClientesDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarMorosidadClientesDetallados;
			processRunnable.jTableDatos=jTableDatosCobrarMorosidadClientesDetallados;
			processRunnable.jPanelCampos=jPanelCamposCobrarMorosidadClientesDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarMorosidadClientesDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarMorosidadClientesDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarMorosidadClientesDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarMorosidadClientesDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarMorosidadClientesDetallados;
			processRunnable.jTtoolBar=jTtoolBarCobrarMorosidadClientesDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarMorosidadClientesDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarMorosidadClientesDetallados ,jPanelParametrosReportesCobrarMorosidadClientesDetallados,jTableDatosCobrarMorosidadClientesDetallados, /*jScrollPanelDatosCobrarMorosidadClientesDetallados,*/jPanelCamposCobrarMorosidadClientesDetallados,jPanelPaginacionCobrarMorosidadClientesDetallados, /*jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados,*/ jPanelAccionesCobrarMorosidadClientesDetallados,jPanelAccionesFormularioCobrarMorosidadClientesDetallados,jmenuBarCobrarMorosidadClientesDetallados,jmenuBarDetalleCobrarMorosidadClientesDetallados,jTtoolBarCobrarMorosidadClientesDetallados,jTtoolBarDetalleCobrarMorosidadClientesDetallados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarMorosidadClientesDetallados ,jPanelParametrosReportesCobrarMorosidadClientesDetallados, jScrollPanelDatosCobrarMorosidadClientesDetallados,jPanelPaginacionCobrarMorosidadClientesDetallados, jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados, jPanelAccionesCobrarMorosidadClientesDetallados,jPanelAccionesFormularioCobrarMorosidadClientesDetallados,jmenuBarCobrarMorosidadClientesDetallados,jmenuBarDetalleCobrarMorosidadClientesDetallados,jTtoolBarCobrarMorosidadClientesDetallados,jTtoolBarDetalleCobrarMorosidadClientesDetallados);
						
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
	
	public void finishProcessCobrarMorosidadClientesDetallados() {// throws Exception 
		this.finishProcessCobrarMorosidadClientesDetallados(true);
	}
	
	public void finishProcessCobrarMorosidadClientesDetallados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados ,this.jPanelParametrosReportesCobrarMorosidadClientesDetallados, this.jScrollPanelDatosCobrarMorosidadClientesDetallados,this.jPanelPaginacionCobrarMorosidadClientesDetallados, this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados, this.jPanelAccionesCobrarMorosidadClientesDetallados,this.jPanelAccionesFormularioCobrarMorosidadClientesDetallados,this.jmenuBarCobrarMorosidadClientesDetallados,this.jmenuBarDetalleCobrarMorosidadClientesDetallados,this.jTtoolBarCobrarMorosidadClientesDetallados,this.jTtoolBarDetalleCobrarMorosidadClientesDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarMorosidadClientesDetallados=this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados; 
		
		final JPanel jPanelParametrosReportesCobrarMorosidadClientesDetallados=this.jPanelParametrosReportesCobrarMorosidadClientesDetallados;
		//final JScrollPane jScrollPanelDatosCobrarMorosidadClientesDetallados=this.jScrollPanelDatosCobrarMorosidadClientesDetallados;
		final JTable jTableDatosCobrarMorosidadClientesDetallados=this.jTableDatosCobrarMorosidadClientesDetallados;		
		final JPanel jPanelPaginacionCobrarMorosidadClientesDetallados=this.jPanelPaginacionCobrarMorosidadClientesDetallados;
		//final JScrollPane jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados=this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados;
		final JPanel jPanelAccionesCobrarMorosidadClientesDetallados=this.jPanelAccionesCobrarMorosidadClientesDetallados;
		
		JPanel jPanelCamposAuxiliarCobrarMorosidadClientesDetallados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarMorosidadClientesDetallados=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			jPanelCamposAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelCamposCobrarMorosidadClientesDetallados;
			jPanelAccionesFormularioAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelAccionesFormularioCobrarMorosidadClientesDetallados;
		}
		
		final JPanel jPanelCamposCobrarMorosidadClientesDetallados=jPanelCamposAuxiliarCobrarMorosidadClientesDetallados;
		final JPanel jPanelAccionesFormularioCobrarMorosidadClientesDetallados=jPanelAccionesFormularioAuxiliarCobrarMorosidadClientesDetallados;
		
		
		final JMenuBar jmenuBarCobrarMorosidadClientesDetallados=this.jmenuBarCobrarMorosidadClientesDetallados;		
		final JToolBar jTtoolBarCobrarMorosidadClientesDetallados=this.jTtoolBarCobrarMorosidadClientesDetallados;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarMorosidadClientesDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarMorosidadClientesDetallados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			jmenuBarDetalleAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jmenuBarDetalleCobrarMorosidadClientesDetallados;
			jTtoolBarDetalleAuxiliarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTtoolBarDetalleCobrarMorosidadClientesDetallados;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarMorosidadClientesDetallados=jmenuBarDetalleAuxiliarCobrarMorosidadClientesDetallados;
		final JToolBar jTtoolBarDetalleCobrarMorosidadClientesDetallados=jTtoolBarDetalleAuxiliarCobrarMorosidadClientesDetallados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarMorosidadClientesDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarMorosidadClientesDetallados;
			processRunnable.jTableDatos=jTableDatosCobrarMorosidadClientesDetallados;
			processRunnable.jPanelCampos=jPanelCamposCobrarMorosidadClientesDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarMorosidadClientesDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarMorosidadClientesDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarMorosidadClientesDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarMorosidadClientesDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarMorosidadClientesDetallados;
			processRunnable.jTtoolBar=jTtoolBarCobrarMorosidadClientesDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarMorosidadClientesDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarMorosidadClientesDetallados ,jPanelParametrosReportesCobrarMorosidadClientesDetallados, jTableDatosCobrarMorosidadClientesDetallados,/*jScrollPanelDatosCobrarMorosidadClientesDetallados,*/jPanelCamposCobrarMorosidadClientesDetallados,jPanelPaginacionCobrarMorosidadClientesDetallados, /*jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados,*/ jPanelAccionesCobrarMorosidadClientesDetallados,jPanelAccionesFormularioCobrarMorosidadClientesDetallados,jmenuBarCobrarMorosidadClientesDetallados,jmenuBarDetalleCobrarMorosidadClientesDetallados,jTtoolBarCobrarMorosidadClientesDetallados,jTtoolBarDetalleCobrarMorosidadClientesDetallados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarMorosidadClientesDetallados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarMorosidadClientesDetallados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarMorosidadClientesDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarMorosidadClientesDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarMorosidadClientesDetallados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarMorosidadClientesDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarMorosidadClientesDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarMorosidadClientesDetallados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarmorosidadclientesdetalladosConstantesFunciones.getsFinalQueryCobrarMorosidadClientesDetallados();
		String  finalQueryPaginacionTodos=this.cobrarmorosidadclientesdetalladosConstantesFunciones.getsFinalQueryCobrarMorosidadClientesDetallados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarMorosidadClientesDetalladosConstantesFunciones.getArrayColumnasGlobalesNoCobrarMorosidadClientesDetallados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarMorosidadClientesDetalladosConstantesFunciones.getArrayColumnasGlobalesCobrarMorosidadClientesDetallados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarMorosidadClientesDetalladosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarmorosidadclientesdetalladossEliminados= new ArrayList<CobrarMorosidadClientesDetallados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarMorosidadClientesDetallados();
		
				///*CobrarMorosidadClientesDetalladosSessionBean*/this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean();
			
			if(this.cobrarmorosidadclientesdetalladosSessionBean==null) {
				this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean();
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
					this.iNumeroPaginacion=CobrarMorosidadClientesDetalladosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarMorosidadClientesDetalladosConstantesFunciones.getClassesForeignKeysOfCobrarMorosidadClientesDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarmorosidadclientesdetallados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarmorosidadclientesdetalladossAux= new ArrayList<CobrarMorosidadClientesDetallados>();
			
				
			cobrarmorosidadclientesdetalladosLogic.setDatosCliente(this.datosCliente);
			cobrarmorosidadclientesdetalladosLogic.setDatosDeep(this.datosDeep);
			cobrarmorosidadclientesdetalladosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarMorosidadClientesDetallados")) {
				this.sDetalleReporte=CobrarMorosidadClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarMorosidadClientesDetallados(fecha_venceBusquedaCobrarMorosidadClientesDetallados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladossBusquedaCobrarMorosidadClientesDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_venceBusquedaCobrarMorosidadClientesDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarMorosidadClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarMorosidadClientesDetallados(fecha_venceBusquedaCobrarMorosidadClientesDetallados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarMorosidadClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarMorosidadClientesDetallados(fecha_venceBusquedaCobrarMorosidadClientesDetallados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()==null||cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarmorosidadclientesdetalladoss==null|| cobrarmorosidadclientesdetalladoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarmorosidadclientesdetalladossAux=new ArrayList<CobrarMorosidadClientesDetallados>();
						cobrarmorosidadclientesdetalladossAux.addAll(cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarmorosidadclientesdetalladossAux=new ArrayList<CobrarMorosidadClientesDetallados>();
							cobrarmorosidadclientesdetalladossAux.addAll(cobrarmorosidadclientesdetalladoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladossBusquedaCobrarMorosidadClientesDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_venceBusquedaCobrarMorosidadClientesDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarMorosidadClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarMorosidadClientesDetallados(fecha_venceBusquedaCobrarMorosidadClientesDetallados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarMorosidadClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarMorosidadClientesDetallados(fecha_venceBusquedaCobrarMorosidadClientesDetallados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarMorosidadClientesDetalladoss("BusquedaCobrarMorosidadClientesDetallados",cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarMorosidadClientesDetalladoss("BusquedaCobrarMorosidadClientesDetallados",cobrarmorosidadclientesdetalladoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarmorosidadclientesdetalladosLogic.setCobrarMorosidadClientesDetalladoss(new ArrayList<CobrarMorosidadClientesDetallados>());
						cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().addAll(cobrarmorosidadclientesdetalladossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarmorosidadclientesdetalladoss=new ArrayList<CobrarMorosidadClientesDetallados>();
							cobrarmorosidadclientesdetalladoss.addAll(cobrarmorosidadclientesdetalladossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarMorosidadClientesDetallados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarMorosidadClientesDetallados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarmorosidadclientesdetalladoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarmorosidadclientesdetalladoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados) {
		Boolean permite=true;
		
		if(this.cobrarmorosidadclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarMorosidadClientesDetalladosConstantesFunciones.getOrderByListaCobrarMorosidadClientesDetallados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarMorosidadClientesDetalladosConstantesFunciones.getOrderByListaCobrarMorosidadClientesDetallados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
				if(cobrarmorosidadclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarmorosidadclientesdetalladosTotales=cobrarmorosidadclientesdetallados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:this.cobrarmorosidadclientesdetalladoss) {
				if(cobrarmorosidadclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarmorosidadclientesdetalladosTotales=cobrarmorosidadclientesdetallados;
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
			this.cobrarmorosidadclientesdetalladosAux=new CobrarMorosidadClientesDetallados();
			this.cobrarmorosidadclientesdetalladosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarmorosidadclientesdetalladosAux.setIsNew(false);
			this.cobrarmorosidadclientesdetalladosAux.setIsChanged(false);
			this.cobrarmorosidadclientesdetalladosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarMorosidadClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss(),this.cobrarmorosidadclientesdetalladosAux);
				
				//this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().add(this.cobrarmorosidadclientesdetalladosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarMorosidadClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladoss,this.cobrarmorosidadclientesdetalladosAux);
				
				this.cobrarmorosidadclientesdetalladoss.add(this.cobrarmorosidadclientesdetalladosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarmorosidadclientesdetalladosTotales=new CobrarMorosidadClientesDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().remove(cobrarmorosidadclientesdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarmorosidadclientesdetalladoss.remove(cobrarmorosidadclientesdetalladosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarmorosidadclientesdetalladosTotales=new CobrarMorosidadClientesDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
				if(cobrarmorosidadclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarmorosidadclientesdetalladosTotales=cobrarmorosidadclientesdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarMorosidadClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss(),cobrarmorosidadclientesdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:this.cobrarmorosidadclientesdetalladoss) {
				if(cobrarmorosidadclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarmorosidadclientesdetalladosTotales=cobrarmorosidadclientesdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarMorosidadClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladoss,cobrarmorosidadclientesdetalladosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarMorosidadClientesDetalladossBusquedaCobrarMorosidadClientesDetallados()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarMorosidadClientesDetallados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarMorosidadClientesDetalladossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarMorosidadClientesDetalladossBusquedaCobrarMorosidadClientesDetallados(String sFinalQuery,Date fecha_vence)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladossBusquedaCobrarMorosidadClientesDetallados(sFinalQuery,this.pagination,fecha_vence);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarMorosidadClientesDetalladossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCobrarMorosidadClientesDetallados() {
		this.isPermisoTodoCobrarMorosidadClientesDetallados=false;
		this.isPermisoNuevoCobrarMorosidadClientesDetallados=false;
		this.isPermisoActualizarCobrarMorosidadClientesDetallados=false;
		this.isPermisoActualizarOriginalCobrarMorosidadClientesDetallados=false;
		this.isPermisoEliminarCobrarMorosidadClientesDetallados=false;
		this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados=false;
		this.isPermisoConsultaCobrarMorosidadClientesDetallados=true;
		this.isPermisoBusquedaCobrarMorosidadClientesDetallados=true;
		this.isPermisoReporteCobrarMorosidadClientesDetallados=true;
		this.isPermisoOrdenCobrarMorosidadClientesDetallados=false;		
		this.isPermisoPaginacionMedioCobrarMorosidadClientesDetallados=false;		
		this.isPermisoPaginacionAltoCobrarMorosidadClientesDetallados=false;		
		this.isPermisoPaginacionTodoCobrarMorosidadClientesDetallados=false;		
		this.isPermisoCopiarCobrarMorosidadClientesDetallados=false;		
		this.isPermisoVerFormCobrarMorosidadClientesDetallados=false;		
		this.isPermisoDuplicarCobrarMorosidadClientesDetallados=false;
		this.isPermisoOrdenCobrarMorosidadClientesDetallados=false;
	}
	
	public void setPermisosUsuarioCobrarMorosidadClientesDetallados(Boolean isPermiso) {
		this.isPermisoTodoCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoNuevoCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoActualizarCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoActualizarOriginalCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoEliminarCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoConsultaCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoBusquedaCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoReporteCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoOrdenCobrarMorosidadClientesDetallados=isPermiso;		
		this.isPermisoPaginacionMedioCobrarMorosidadClientesDetallados=isPermiso;		
		this.isPermisoPaginacionAltoCobrarMorosidadClientesDetallados=isPermiso;		
		this.isPermisoPaginacionTodoCobrarMorosidadClientesDetallados=isPermiso;		
		this.isPermisoCopiarCobrarMorosidadClientesDetallados=isPermiso;		
		this.isPermisoVerFormCobrarMorosidadClientesDetallados=isPermiso;		
		this.isPermisoDuplicarCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoOrdenCobrarMorosidadClientesDetallados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarMorosidadClientesDetallados(Boolean isPermiso) {
		//this.isPermisoTodoCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoNuevoCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoActualizarCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoActualizarOriginalCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoEliminarCobrarMorosidadClientesDetallados=isPermiso;
		this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados=isPermiso;
		//this.isPermisoConsultaCobrarMorosidadClientesDetallados=isPermiso;
		//this.isPermisoBusquedaCobrarMorosidadClientesDetallados=isPermiso;
		//this.isPermisoReporteCobrarMorosidadClientesDetallados=isPermiso;
		//this.isPermisoOrdenCobrarMorosidadClientesDetallados=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarMorosidadClientesDetallados=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarMorosidadClientesDetallados=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarMorosidadClientesDetallados=isPermiso;		
		//this.isPermisoCopiarCobrarMorosidadClientesDetallados=isPermiso;		
		//this.isPermisoDuplicarCobrarMorosidadClientesDetallados=isPermiso;
		//this.isPermisoOrdenCobrarMorosidadClientesDetallados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarMorosidadClientesDetalladosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarMorosidadClientesDetallados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarMorosidadClientesDetalladosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarMorosidadClientesDetalladosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarMorosidadClientesDetalladosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarMorosidadClientesDetalladosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarMorosidadClientesDetallados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarMorosidadClientesDetalladosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarMorosidadClientesDetallados=this.isPermisoActualizarCobrarMorosidadClientesDetallados;
			this.isPermisoEliminarCobrarMorosidadClientesDetallados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarMorosidadClientesDetallados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarMorosidadClientesDetallados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarMorosidadClientesDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarMorosidadClientesDetallados.setToolTipText(this.jTableDatosCobrarMorosidadClientesDetallados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarMorosidadClientesDetallados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarMorosidadClientesDetallados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarMorosidadClientesDetallados() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyCobrarMorosidadClientesDetalladosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarMorosidadClientesDetalladosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarmorosidadclientesdetalladosSessionBean==null) {
				this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean();
			}

			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarMorosidadClientesDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarMorosidadClientesDetallados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarMorosidadClientesDetallados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarMorosidadClientesDetallados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarMorosidadClientesDetallados()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarMorosidadClientesDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarMorosidadClientesDetallados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarmorosidadclientesdetalladosSessionBean=new CobrarMorosidadClientesDetalladosSessionBean(); 
		this.cobrarmorosidadclientesdetalladosConstantesFunciones=new CobrarMorosidadClientesDetalladosConstantesFunciones(); 
		this.cobrarmorosidadclientesdetalladosBean=new CobrarMorosidadClientesDetallados();//(this.cobrarmorosidadclientesdetalladosConstantesFunciones); 		
		this.cobrarmorosidadclientesdetalladosReturnGeneral=new CobrarMorosidadClientesDetalladosParameterReturnGeneral(); 
		
		this.cobrarmorosidadclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarmorosidadclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarMorosidadClientesDetallados(true);
			
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
			
			this.cobrarmorosidadclientesdetalladosConstantesFunciones=new CobrarMorosidadClientesDetalladosConstantesFunciones(); 
			this.cobrarmorosidadclientesdetalladosBean=new CobrarMorosidadClientesDetallados();//this.cobrarmorosidadclientesdetalladosConstantesFunciones); 			
			this.cobrarmorosidadclientesdetalladosReturnGeneral=new CobrarMorosidadClientesDetalladosParameterReturnGeneral(); 
		
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Morosidad Clientes Detallados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarmorosidadclientesdetallados=new CobrarMorosidadClientesDetallados();
			this.cobrarmorosidadclientesdetalladoss = new ArrayList<CobrarMorosidadClientesDetallados>();
			this.cobrarmorosidadclientesdetalladossAux = new ArrayList<CobrarMorosidadClientesDetallados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic=new CobrarMorosidadClientesDetalladosLogic();
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarmorosidadclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarmorosidadclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados);	
					}
					
					if(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarMorosidadClientesDetallados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarMorosidadClientesDetallados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados);
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setVisible(false);
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados);
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados);
					this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setVisible(false);
					this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados);
					this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setVisible(false);
					this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarMorosidadClientesDetalladosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarMorosidadClientesDetalladosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarmorosidadclientesdetalladosReturnGeneral=new CobrarMorosidadClientesDetalladosParameterReturnGeneral();
			
			this.cobrarmorosidadclientesdetalladosParameterGeneral=new CobrarMorosidadClientesDetalladosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarmorosidadclientesdetalladosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarMorosidadClientesDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarMorosidadClientesDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
			
			
			this.isVisibilidadBusquedaCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarMorosidadClientesDetallados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarMorosidadClientesDetallados(false);
			
			this.setPermisosUsuarioCobrarMorosidadClientesDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado() && this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarMorosidadClientesDetalladosClasesRelacionadas();
			}
			
			if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarMorosidadClientesDetalladosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarMorosidadClientesDetallados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarMorosidadClientesDetallados();
			}
			
			if(!this.isPermisoBusquedaCobrarMorosidadClientesDetallados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarMorosidadClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarMorosidadClientesDetallados());
				
				this.tiposColumnasSelect=CobrarMorosidadClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarMorosidadClientesDetallados(true);
				
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
			//if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarMorosidadClientesDetallados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarMorosidadClientesDetallados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarMorosidadClientesDetallados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarMorosidadClientesDetallados() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrarmorosidadclientesdetalladosImplementable= (CobrarMorosidadClientesDetalladosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarMorosidadClientesDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarmorosidadclientesdetalladosImplementableHome= (CobrarMorosidadClientesDetalladosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarMorosidadClientesDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarmorosidadclientesdetalladoss= new ArrayList<CobrarMorosidadClientesDetallados>();
			this.cobrarmorosidadclientesdetalladossEliminados= new ArrayList<CobrarMorosidadClientesDetallados>();
						
			this.isEsNuevoCobrarMorosidadClientesDetallados=false;
			this.esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarMorosidadClientesDetallados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarMorosidadClientesDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarMorosidadClientesDetalladosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarMorosidadClientesDetallados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarMorosidadClientesDetallados();
			}
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarMorosidadClientesDetallados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarMorosidadClientesDetallados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarMorosidadClientesDetallados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarMorosidadClientesDetallados")) {
				iIndex=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarMorosidadClientesDetallados();	
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
	
	public void cargarCombosForeignKeyCobrarMorosidadClientesDetallados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarMorosidadClientesDetallados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarMorosidadClientesDetallados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarMorosidadClientesDetalladosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarMorosidadClientesDetallados();
		
		this.cargarCombosFrameForeignKeyCobrarMorosidadClientesDetallados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarMorosidadClientesDetallados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarMorosidadClientesDetallados();
		}
	}
	
	
	
	public void jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			
			if(jTableDatosCobrarMorosidadClientesDetallados.getRowCount()>=1) {
				jTableDatosCobrarMorosidadClientesDetallados.removeRowSelectionInterval(0, jTableDatosCobrarMorosidadClientesDetallados.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarMorosidadClientesDetallados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarMorosidadClientesDetallados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(true);			
			//this.cobrarmorosidadclientesdetallados=new CobrarMorosidadClientesDetallados();
			//this.cobrarmorosidadclientesdetallados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados() ;
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarMorosidadClientesDetallados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarmorosidadclientesdetallados);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);				
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarMorosidadClientesDetallados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRows().length;			
			}
			
			cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarMorosidadClientesDetallados--;			
				//CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux= new CobrarMorosidadClientesDetallados();			
				//cobrarmorosidadclientesdetalladosAux.setId(this.iIdNuevoCobrarMorosidadClientesDetallados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosOrigen=new CobrarMorosidadClientesDetallados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosOrigen : cobrarmorosidadclientesdetalladossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarmorosidadclientesdetalladosOrigen =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarmorosidadclientesdetalladosOrigen =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarMorosidadClientesDetallados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarmorosidadclientesdetallados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosOrigen,this.cobrarmorosidadclientesdetallados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().add(this.cobrarmorosidadclientesdetalladosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetalladoss.add(this.cobrarmorosidadclientesdetalladosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
				
				this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarMorosidadClientesDetallados(), this.getIndiceNuevoCobrarMorosidadClientesDetallados());
				
				int iLastRow =  this.jTableDatosCobrarMorosidadClientesDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarMorosidadClientesDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarMorosidadClientesDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();									
		
			CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosOrigen=new CobrarMorosidadClientesDetallados();
			CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosDestino=new CobrarMorosidadClientesDetallados();
				
			cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarmorosidadclientesdetalladossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarmorosidadclientesdetalladosOrigen =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarmorosidadclientesdetalladosOrigen =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarmorosidadclientesdetalladosDestino =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarmorosidadclientesdetalladosDestino =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarmorosidadclientesdetalladosOrigen =cobrarmorosidadclientesdetalladossSeleccionados.get(0);
				cobrarmorosidadclientesdetalladosDestino =cobrarmorosidadclientesdetalladossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosOrigen,cobrarmorosidadclientesdetalladosDestino,true,false);
				
				cobrarmorosidadclientesdetalladosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarmorosidadclientesdetalladosDestino,cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarmorosidadclientesdetalladosDestino,cobrarmorosidadclientesdetalladoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
				
				//this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarMorosidadClientesDetallados(), this.getIndiceNuevoCobrarMorosidadClientesDetallados());
				
				int iLastRow =  this.jTableDatosCobrarMorosidadClientesDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarMorosidadClientesDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarMorosidadClientesDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(!isVisible);
			this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(!isVisible);
			this.jPanelAccionesCobrarMorosidadClientesDetallados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarMorosidadClientesDetallados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarMorosidadClientesDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarMorosidadClientesDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarMorosidadClientesDetallados();
			
			this.abrirFrameOrderByCobrarMorosidadClientesDetallados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarMorosidadClientesDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarMorosidadClientesDetallados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarMorosidadClientesDetallados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSize(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.iWidthFormulario,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jContentPaneDetalleCobrarMorosidadClientesDetallados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jContentPaneDetalleCobrarMorosidadClientesDetallados.getWidth(),CobrarMorosidadClientesDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jContentPaneDetalleCobrarMorosidadClientesDetallados.getWidth(),CobrarMorosidadClientesDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jContentPaneDetalleCobrarMorosidadClientesDetallados.getWidth(),CobrarMorosidadClientesDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarMorosidadClientesDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarMorosidadClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados,false,this);
				} else {
					this.jInternalFrameOrderByCobrarMorosidadClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados);
				this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setVisible(false);
				this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setSelected(false);
				
				this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarMorosidadClientesDetallados"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarMorosidadClientesDetallados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarMorosidadClientesDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados==null) {
				
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados=new ImportacionJInternalFrame(CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarMorosidadClientesDetallados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados);
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setVisible(false);
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setSelected(false);


				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarMorosidadClientesDetallados"));
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarMorosidadClientesDetallados"));
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarMorosidadClientesDetallados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarMorosidadClientesDetallados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados==null) {
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados=new ReporteDinamicoJInternalFrame(CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados);
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarMorosidadClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarMorosidadClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarMorosidadClientesDetallados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarMorosidadClientesDetallados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarMorosidadClientesDetallados);
			
	       	this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.dispose();
			//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarMorosidadClientesDetallados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarMorosidadClientesDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setVisible(true);
	        this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarMorosidadClientesDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setVisible(true);
	        this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarMorosidadClientesDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setVisible(false);
	        this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarMorosidadClientesDetallados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarMorosidadClientesDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setVisible(false);
	        this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarMorosidadClientesDetallados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarMorosidadClientesDetallados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(true);
			//this.isEsNuevoCobrarMorosidadClientesDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false) ;
			
			if(cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarMorosidadClientesDetallados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarMorosidadClientesDetallados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(true);
			//this.isEsNuevoCobrarMorosidadClientesDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarmorosidadclientesdetallados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false) ;
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarMorosidadClientesDetallados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarMorosidadClientesDetallados(false);
			
			//if(!this.isEsNuevoCobrarMorosidadClientesDetallados) {								
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarmorosidadclientesdetallados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarMorosidadClientesDetallados=true;
					this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
					this.isEsNuevoCobrarMorosidadClientesDetallados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarMorosidadClientesDetallados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarMorosidadClientesDetallados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(false);
				
				this.habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(false);
			
												
				
				if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarMorosidadClientesDetallados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarmorosidadclientesdetallados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				this.cobrarmorosidadclientesdetallados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				this.cobrarmorosidadclientesdetallados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarmorosidadclientesdetallados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarMorosidadClientesDetalladosModel) this.jTableDatosCobrarMorosidadClientesDetallados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarMorosidadClientesDetallados=true;
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
				this.isEsNuevoCobrarMorosidadClientesDetallados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(false);
				
				this.habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(false);
				
				
				
				if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarMorosidadClientesDetallados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarMorosidadClientesDetallados.getRowCount()>=1) {
				jTableDatosCobrarMorosidadClientesDetallados.removeRowSelectionInterval(0, jTableDatosCobrarMorosidadClientesDetallados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarMorosidadClientesDetallados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(false) ;
			
			this.isEsNuevoCobrarMorosidadClientesDetallados=false;
			
			if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarMorosidadClientesDetallados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				
				//SI ES MANUAL
				if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarMorosidadClientesDetallados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarMorosidadClientesDetallados--;			
			//CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux= new CobrarMorosidadClientesDetallados();			
			//cobrarmorosidadclientesdetalladosAux.setId(this.iIdNuevoCobrarMorosidadClientesDetallados);
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarMorosidadClientesDetallados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
			
			this.cobrarmorosidadclientesdetallados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().add(this.cobrarmorosidadclientesdetalladosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarmorosidadclientesdetalladoss.add(this.cobrarmorosidadclientesdetalladosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			
			this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarMorosidadClientesDetallados(), this.getIndiceNuevoCobrarMorosidadClientesDetallados());
			
			int iLastRow =  this.jTableDatosCobrarMorosidadClientesDetallados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarMorosidadClientesDetallados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarMorosidadClientesDetallados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarMorosidadClientesDetallados();
			}
			
			//this.abrirFrameTreeCobrarMorosidadClientesDetallados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setFileImportacion(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarMorosidadClientesDetallados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		

		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarMorosidadClientesDetalladosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarMorosidadClientesDetalladosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoVencido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoVencido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoVencido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoVencido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoVencer_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoVencer_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoVencer_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoVencer_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO:
					sNombreCampoCategoria="saldo_vencido";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER:
					sNombreCampoCategoria="saldo_vencer";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO:
					sNombreCampoCategoriaValor="saldo_vencido";
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER:
					sNombreCampoCategoriaValor="saldo_vencer";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Venco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_vencido");
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Vencer",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_vencer");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarMorosidadClientesDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getsaldo_vencido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER);
					iRow++;

					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados:cobrarmorosidadclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarmorosidadclientesdetallados.getsaldo_vencer());
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
			//	this.getFilaCabeceraExportarExcelCobrarMorosidadClientesDetallados(row);				
			//	iRow++;
			//}				
			
			//for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarMorosidadClientesDetallados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarMorosidadClientesDetallados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarMorosidadClientesDetallados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarMorosidadClientesDetallados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarMorosidadClientesDetallados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarMorosidadClientesDetallados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarMorosidadClientesDetallados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarMorosidadClientesDetallados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarMorosidadClientesDetallados.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarMorosidadClientesDetallados.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarMorosidadClientesDetallados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarMorosidadClientesDetallados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarMorosidadClientesDetallados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarMorosidadClientesDetallados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarMorosidadClientesDetallados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarMorosidadClientesDetallados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarMorosidadClientesDetallados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados();
		
		this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarMorosidadClientesDetallados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarMorosidadClientesDetallados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarMorosidadClientesDetallados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarMorosidadClientesDetallados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarMorosidadClientesDetallados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jCheckBoxPostAccionNuevoCobrarMorosidadClientesDetallados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jCheckBoxPostAccionSinCerrarCobrarMorosidadClientesDetallados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jCheckBoxPostAccionSinMensajeCobrarMorosidadClientesDetallados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarMorosidadClientesDetallados(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarMorosidadClientesDetallados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarMorosidadClientesDetallados() throws Exception {
		try	{
			if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarMorosidadClientesDetallados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarMorosidadClientesDetallados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarMorosidadClientesDetallados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			
			if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarMorosidadClientesDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarMorosidadClientesDetallados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarMorosidadClientesDetallados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarMorosidadClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarMorosidadClientesDetallados(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarMorosidadClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarMorosidadClientesDetallados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarMorosidadClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarMorosidadClientesDetallados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarMorosidadClientesDetallados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_venceBusquedaCobrarMorosidadClientesDetallados=new Date(this.jDateChooserfecha_venceBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarMorosidadClientesDetallados(Boolean esInicializar) throws Exception {				
		if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarMorosidadClientesDetallados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados() throws Exception {
		this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarMorosidadClientesDetallados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetalladosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarmorosidadclientesdetalladoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarMorosidadClientesDetallados.setModel(new CobrarMorosidadClientesDetalladosModel(this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarMorosidadClientesDetallados.setModel(new CobrarMorosidadClientesDetalladosModel(this.cobrarmorosidadclientesdetalladoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados!=null && this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarMorosidadClientesDetallados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarSeleccionarCobrarMorosidadClientesDetallados,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarMorosidadClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarSeleccionarCobrarMorosidadClientesDetallados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_ID));

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostraridCobrarMorosidadClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltaridCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activaridCobrarMorosidadClientesDetallados,iSizeTabla,this,true,"idCobrarMorosidadClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltaridCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activaridCobrarMorosidadClientesDetallados,this,true,"idCobrarMorosidadClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarcodigoCobrarMorosidadClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarcodigoCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarcodigoCobrarMorosidadClientesDetallados,iSizeTabla,this,true,"codigoCobrarMorosidadClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarcodigoCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarcodigoCobrarMorosidadClientesDetallados,this,true,"codigoCobrarMorosidadClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarnombre_completoCobrarMorosidadClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnombre_completoCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnombre_completoCobrarMorosidadClientesDetallados,iSizeTabla,this,true,"nombre_completoCobrarMorosidadClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnombre_completoCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnombre_completoCobrarMorosidadClientesDetallados,this,true,"nombre_completoCobrarMorosidadClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,iSizeTabla,this,true,"numero_pre_impreso_facturaCobrarMorosidadClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,this,true,"numero_pre_impreso_facturaCobrarMorosidadClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO));

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarsaldo_vencidoCobrarMorosidadClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencidoCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencidoCobrarMorosidadClientesDetallados,iSizeTabla,this,true,"saldo_vencidoCobrarMorosidadClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencidoCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencidoCobrarMorosidadClientesDetallados,this,true,"saldo_vencidoCobrarMorosidadClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER));

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarsaldo_vencerCobrarMorosidadClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencerCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencerCobrarMorosidadClientesDetallados,iSizeTabla,this,true,"saldo_vencerCobrarMorosidadClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencerCobrarMorosidadClientesDetallados,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencerCobrarMorosidadClientesDetallados,this,true,"saldo_vencerCobrarMorosidadClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarMorosidadClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarMorosidadClientesDetallados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarMorosidadClientesDetallados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarMorosidadClientesDetallados.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarMorosidadClientesDetallados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarMorosidadClientesDetallados.moveColumn(this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarMorosidadClientesDetallados.moveColumn(this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarMorosidadClientesDetallados.moveColumn(this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarMorosidadClientesDetallados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarMorosidadClientesDetallados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarMorosidadClientesDetallados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarMorosidadClientesDetallados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarMorosidadClientesDetallados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarMorosidadClientesDetallados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarmorosidadclientesdetalladoss.size()-1;
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
		//this.jTableDatosCobrarMorosidadClientesDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarMorosidadClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarMorosidadClientesDetallados();
			
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
				
				//this.isEsNuevoCobrarMorosidadClientesDetallados=false;
					
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
				if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarMorosidadClientesDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarmorosidadclientesdetallados.getsType().equals("DUPLICADO")
				   || this.cobrarmorosidadclientesdetallados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarMorosidadClientesDetallados=true;
				
				} else {
					this.isEsNuevoCobrarMorosidadClientesDetallados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarmorosidadclientesdetallados.getId()>=0 && !this.cobrarmorosidadclientesdetallados.getIsNew()) {						
						this.isEsNuevoCobrarMorosidadClientesDetallados=false;
						
					} else {
						this.isEsNuevoCobrarMorosidadClientesDetallados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarMorosidadClientesDetallados(esRelaciones);						
				
				this.seleccionarCobrarMorosidadClientesDetallados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarmorosidadclientesdetallados.getId()<0) {
					this.isEsNuevoCobrarMorosidadClientesDetallados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarMorosidadClientesDetallados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarMorosidadClientesDetallados(evt,rowIndex);
				}	
				
				if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarMorosidadClientesDetallados: " + this.dDif); 
					}
				}								
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarMorosidadClientesDetallados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarmorosidadclientesdetallados)) {
					if(this.cobrarmorosidadclientesdetallados.getId()>0) {
						this.cobrarmorosidadclientesdetallados.setIsDeleted(true);
						
						this.cobrarmorosidadclientesdetalladossEliminados.add(this.cobrarmorosidadclientesdetallados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().remove(this.cobrarmorosidadclientesdetallados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetalladoss.remove(this.cobrarmorosidadclientesdetallados);				
					}
					
					
					((CobrarMorosidadClientesDetalladosModel) this.jTableDatosCobrarMorosidadClientesDetallados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarMorosidadClientesDetallados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarMorosidadClientesDetallados) {
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarMorosidadClientesDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getId().toString());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getcodigo());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getsaldo_vencido().toString());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getsaldo_vencer().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarmorosidadclientesdetalladosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarmorosidadclientesdetalladosLocal=this.cobrarmorosidadclientesdetallados;
			} else {
				cobrarmorosidadclientesdetalladosLocal=this.cobrarmorosidadclientesdetalladosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarmorosidadclientesdetalladosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosLocal,true);
					
					if(cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarmorosidadclientesdetalladosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarmorosidadclientesdetalladosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetallados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.getText()==null || this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.getText()=="" || this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setText("0");
			}

			if(conColumnasBase) {cobrarmorosidadclientesdetallados.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelIdCobrarMorosidadClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarmorosidadclientesdetallados.setcodigo(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelcodigoCobrarMorosidadClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarmorosidadclientesdetallados.setnombre_completo(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelnombre_completoCobrarMorosidadClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarmorosidadclientesdetallados.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarmorosidadclientesdetallados.setsaldo_vencido(Double.parseDouble(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelsaldo_vencidoCobrarMorosidadClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarmorosidadclientesdetallados.setsaldo_vencer(Double.parseDouble(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelsaldo_vencerCobrarMorosidadClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosBean,CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosOrigen,CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getId()!=null && !cobrarmorosidadclientesdetalladosOrigen.getId().equals(0L))) {cobrarmorosidadclientesdetallados.setId(cobrarmorosidadclientesdetalladosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getfecha_vence()!=null && !cobrarmorosidadclientesdetalladosOrigen.getfecha_vence().equals(new Date()))) {cobrarmorosidadclientesdetallados.setfecha_vence(cobrarmorosidadclientesdetalladosOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getcodigo()!=null && !cobrarmorosidadclientesdetalladosOrigen.getcodigo().equals(""))) {cobrarmorosidadclientesdetallados.setcodigo(cobrarmorosidadclientesdetalladosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getnombre_completo()!=null && !cobrarmorosidadclientesdetalladosOrigen.getnombre_completo().equals(""))) {cobrarmorosidadclientesdetallados.setnombre_completo(cobrarmorosidadclientesdetalladosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getnumero_pre_impreso_factura()!=null && !cobrarmorosidadclientesdetalladosOrigen.getnumero_pre_impreso_factura().equals(""))) {cobrarmorosidadclientesdetallados.setnumero_pre_impreso_factura(cobrarmorosidadclientesdetalladosOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getsaldo_vencido()!=null && !cobrarmorosidadclientesdetalladosOrigen.getsaldo_vencido().equals(0.0))) {cobrarmorosidadclientesdetallados.setsaldo_vencido(cobrarmorosidadclientesdetalladosOrigen.getsaldo_vencido());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosOrigen.getsaldo_vencer()!=null && !cobrarmorosidadclientesdetalladosOrigen.getsaldo_vencer().equals(0.0))) {cobrarmorosidadclientesdetallados.setsaldo_vencer(cobrarmorosidadclientesdetalladosOrigen.getsaldo_vencer());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getId().toString());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getcodigo());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getsaldo_vencido().toString());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetallados.getsaldo_vencer().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetalladosBean cobrarmorosidadclientesdetalladosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetalladosBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetalladosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetalladosBean.getnombre_completo());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetalladosBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetalladosBean.getsaldo_vencido().toString());
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setText(cobrarmorosidadclientesdetalladosBean.getsaldo_vencer().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetalladosParameterReturnGeneral cobrarmorosidadclientesdetalladosReturnGeneral,CobrarMorosidadClientesDetalladosBean cobrarmorosidadclientesdetalladosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal=new CobrarMorosidadClientesDetallados();
			
			cobrarmorosidadclientesdetalladosLocal=cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosLocal.getId()!=null && !cobrarmorosidadclientesdetalladosLocal.getId().equals(0L))) {cobrarmorosidadclientesdetalladosBean.setId(cobrarmorosidadclientesdetalladosLocal.getId());}}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosLocal.getcodigo()!=null && !cobrarmorosidadclientesdetalladosLocal.getcodigo().equals(""))) {cobrarmorosidadclientesdetalladosBean.setcodigo(cobrarmorosidadclientesdetalladosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosLocal.getnombre_completo()!=null && !cobrarmorosidadclientesdetalladosLocal.getnombre_completo().equals(""))) {cobrarmorosidadclientesdetalladosBean.setnombre_completo(cobrarmorosidadclientesdetalladosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosLocal.getnumero_pre_impreso_factura()!=null && !cobrarmorosidadclientesdetalladosLocal.getnumero_pre_impreso_factura().equals(""))) {cobrarmorosidadclientesdetalladosBean.setnumero_pre_impreso_factura(cobrarmorosidadclientesdetalladosLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosLocal.getsaldo_vencido()!=null && !cobrarmorosidadclientesdetalladosLocal.getsaldo_vencido().equals(0.0))) {cobrarmorosidadclientesdetalladosBean.setsaldo_vencido(cobrarmorosidadclientesdetalladosLocal.getsaldo_vencido());}
			if(conDefault || (!conDefault && cobrarmorosidadclientesdetalladosLocal.getsaldo_vencer()!=null && !cobrarmorosidadclientesdetalladosLocal.getsaldo_vencer().equals(0.0))) {cobrarmorosidadclientesdetalladosBean.setsaldo_vencer(cobrarmorosidadclientesdetalladosLocal.getsaldo_vencer());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarMorosidadClientesDetalladosGenerico(Long idCobrarMorosidadClientesDetalladosSeleccionado,JComboBox jComboBoxCobrarMorosidadClientesDetallados,List<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossLocal)throws Exception {
		try {
			CobrarMorosidadClientesDetallados  cobrarmorosidadclientesdetalladosTemp=null;

			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossLocal) {
				if(cobrarmorosidadclientesdetalladosAux.getId()!=null && cobrarmorosidadclientesdetalladosAux.getId().equals(idCobrarMorosidadClientesDetalladosSeleccionado)) {
					cobrarmorosidadclientesdetalladosTemp=cobrarmorosidadclientesdetalladosAux;
					break;
				}
			}

			jComboBoxCobrarMorosidadClientesDetallados.setSelectedItem(cobrarmorosidadclientesdetalladosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarMorosidadClientesDetalladosGenerico(JComboBox jComboBoxCobrarMorosidadClientesDetallados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarMorosidadClientesDetallados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarMorosidadClientesDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarMorosidadClientesDetallados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarMorosidadClientesDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarMorosidadClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarMorosidadClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarmorosidadclientesdetallados=(CobrarMorosidadClientesDetallados) cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) cobrarmorosidadclientesdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarmorosidadclientesdetallados.getIsNew() && !cobrarmorosidadclientesdetallados.getIsChanged() && !cobrarmorosidadclientesdetallados.getIsDeleted()) {
				sDescripcion=cobrarmorosidadclientesdetallados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarmorosidadclientesdetallados.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosRow=new CobrarMorosidadClientesDetallados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarmorosidadclientesdetalladosRow=(CobrarMorosidadClientesDetallados) cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarmorosidadclientesdetalladosRow=(CobrarMorosidadClientesDetallados) cobrarmorosidadclientesdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados));			
			this.jButtonDuplicarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados && this.isPermisoDuplicarCobrarMorosidadClientesDetallados));			
			this.jButtonCopiarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados && this.isPermisoCopiarCobrarMorosidadClientesDetallados));
			this.jButtonVerFormCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados && this.isPermisoVerFormCobrarMorosidadClientesDetallados));
			
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados && this.isPermisoOrdenCobrarMorosidadClientesDetallados));			
			
			this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados));			
			this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados && this.isPermisoActualizarCobrarMorosidadClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados && this.isPermisoActualizarCobrarMorosidadClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados && this.isPermisoEliminarCobrarMorosidadClientesDetallados));
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarCobrarMorosidadClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados);							
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados));						
			this.jButtonDuplicarToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados && this.isPermisoDuplicarCobrarMorosidadClientesDetallados));						
			this.jButtonCopiarToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados && this.isPermisoCopiarCobrarMorosidadClientesDetallados));			
			this.jButtonVerFormToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados && this.isPermisoVerFormCobrarMorosidadClientesDetallados));			
			this.jButtonAbrirOrderByToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados && this.isPermisoOrdenCobrarMorosidadClientesDetallados));
			this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));			
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados && this.isPermisoActualizarCobrarMorosidadClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados  && this.isPermisoActualizarCobrarMorosidadClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados && this.isPermisoEliminarCobrarMorosidadClientesDetallados));
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarToolBarCobrarMorosidadClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados);				
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados));			
			this.jMenuItemDuplicarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados && this.isPermisoDuplicarCobrarMorosidadClientesDetallados));			
			this.jMenuItemCopiarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados && this.isPermisoCopiarCobrarMorosidadClientesDetallados));			
			this.jMenuItemVerFormCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados && this.isPermisoVerFormCobrarMorosidadClientesDetallados));			
			this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados && this.isPermisoOrdenCobrarMorosidadClientesDetallados));			
			//this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados && this.isPermisoOrdenCobrarMorosidadClientesDetallados));
			this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados && this.isPermisoOrdenCobrarMorosidadClientesDetallados));			
			//this.jMenuItemDetalleMostrarOcultarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados && this.isPermisoOrdenCobrarMorosidadClientesDetallados));			
			this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados));			
			this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados && this.isPermisoNuevoCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));									
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemModificarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados && this.isPermisoActualizarCobrarMorosidadClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemActualizarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados && this.isPermisoActualizarCobrarMorosidadClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemEliminarCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados && this.isPermisoEliminarCobrarMorosidadClientesDetallados));
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemCancelarCobrarMorosidadClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados);				
			}
			
			this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));						
			this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=this.jButtonNuevoCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados=this.jButtonDuplicarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados=this.jButtonCopiarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados=this.jButtonVerFormCobrarMorosidadClientesDetallados.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarMorosidadClientesDetallados=this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=this.jButtonModificarCobrarMorosidadClientesDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=this.jButtonNuevoToolBarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarToolBarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarToolBarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarToolBarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarToolBarCobrarMorosidadClientesDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=this.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=this.jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=this.jMenuItemNuevoCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemModificarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemActualizarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemEliminarCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemCancelarCobrarMorosidadClientesDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarMorosidadClientesDetallados(Boolean esInicializar) {
		if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarMorosidadClientesDetallados();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarMorosidadClientesDetallados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarMorosidadClientesDetallados() {
		this.jButtonNuevoCobrarMorosidadClientesDetallados.setVisible(this.isPermisoNuevoCobrarMorosidadClientesDetallados);			
		this.jButtonDuplicarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoDuplicarCobrarMorosidadClientesDetallados);			
		this.jButtonCopiarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoCopiarCobrarMorosidadClientesDetallados);			
		this.jButtonVerFormCobrarMorosidadClientesDetallados.setVisible(this.isPermisoVerFormCobrarMorosidadClientesDetallados);			
		
		this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.setVisible(this.isPermisoOrdenCobrarMorosidadClientesDetallados);					
		
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.setVisible(this.isPermisoNuevoCobrarMorosidadClientesDetallados);			
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoActualizarCobrarMorosidadClientesDetallados);	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoActualizarCobrarMorosidadClientesDetallados);	
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoEliminarCobrarMorosidadClientesDetallados);
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarCobrarMorosidadClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados);						
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.setVisible(this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.setVisible(this.isPermisoActualizarCobrarMorosidadClientesDetallados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarMorosidadClientesDetallados() {
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoActualizarCobrarMorosidadClientesDetallados);	
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoActualizarCobrarMorosidadClientesDetallados);	
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarCobrarMorosidadClientesDetallados.setVisible(this.isPermisoEliminarCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarCobrarMorosidadClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados);							
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados && this.isPermisoGuardarCambiosCobrarMorosidadClientesDetallados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarMorosidadClientesDetallados() {
		if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarMorosidadClientesDetallados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarMorosidadClientesDetallados() {
	}
	
	public void jTableDatosCobrarMorosidadClientesDetalladosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarMorosidadClientesDetallados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarmorosidadclientesdetallados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarMorosidadClientesDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarMorosidadClientesDetallados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarMorosidadClientesDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarMorosidadClientesDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarmorosidadclientesdetalladosLogic.getConnexion());

				if(this.cobrarmorosidadclientesdetallados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarmorosidadclientesdetallados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarMorosidadClientesDetallados=(TitledBorder)this.jScrollPanelDatosCobrarMorosidadClientesDetallados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarMorosidadClientesDetallados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarmorosidadclientesdetallados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.cobrarmorosidadclientesdetallados.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarmorosidadclientesdetallados.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.cobrarmorosidadclientesdetallados.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getsaldo_vencido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_vencido = "+this.cobrarmorosidadclientesdetallados.getsaldo_vencido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.getcobrarmorosidadclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarmorosidadclientesdetallados==null) {
						this.cobrarmorosidadclientesdetallados = new CobrarMorosidadClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);
				}

				if(this.cobrarmorosidadclientesdetallados.getsaldo_vencer()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_vencer = "+this.cobrarmorosidadclientesdetallados.getsaldo_vencer().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);

			this.getCobrarMorosidadClientesDetalladossBusquedaCobrarMorosidadClientesDetallados();

			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);

			//if(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarMorosidadClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);

			this.getCobrarMorosidadClientesDetalladossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);

			//if(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarmorosidadclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarMorosidadClientesDetallados() {
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.dispose();
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
			this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.dispose();
			this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados=null;
		}
		
		if(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados!=null) {
			this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.dispose();
			this.jInternalFrameImportacionCobrarMorosidadClientesDetallados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarMorosidadClientesDetallados();
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarMorosidadClientesDetallados")) {
				jButtonDuplicarCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarMorosidadClientesDetallados")) {
				jButtonCopiarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarMorosidadClientesDetallados")) {
				jButtonVerFormCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonDuplicarCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarMorosidadClientesDetallados")) {
				jButtonDuplicarCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarMorosidadClientesDetallados")) {
				jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarMorosidadClientesDetallados")) {
				jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarMorosidadClientesDetallados")) {
				jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarMorosidadClientesDetallados")) {
				jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarMorosidadClientesDetallados")) {
				jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarMorosidadClientesDetallados")) {
				jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarMorosidadClientesDetallados")) {
				jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarMorosidadClientesDetallados")) {
				jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarMorosidadClientesDetallados")) {
				jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarMorosidadClientesDetallados")) {
				jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonMostrarOcultarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarMorosidadClientesDetallados")) {
				jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarMorosidadClientesDetallados")) {
				jButtonCopiarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarMorosidadClientesDetallados")) {
				jButtonVerFormCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarMorosidadClientesDetallados")) {
				jButtonCopiarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarMorosidadClientesDetallados")) {
				jButtonVerFormCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarMorosidadClientesDetallados")) {
				jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarMorosidadClientesDetallados")) {
				jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarMorosidadClientesDetallados")) {
				jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarMorosidadClientesDetallados")) {
				jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarMorosidadClientesDetallados")) {
				jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarMorosidadClientesDetallados")) {
				jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarMorosidadClientesDetallados")) {
				jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarMorosidadClientesDetallados")) {
				jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarMorosidadClientesDetallados")) {
				jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarMorosidadClientesDetallados") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados")) {
				jButtonAbrirOrderByCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarMorosidadClientesDetallados") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarMorosidadClientesDetallados")) {
				jButtonMostrarOcultarCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarMorosidadClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarMorosidadClientesDetallados")) {
				jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarMorosidadClientesDetallados")) {
				jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarMorosidadClientesDetallados")) {
				jButtonCerrarImportacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarMorosidadClientesDetallados")) {
				
				jButtonGenerarImportacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarMorosidadClientesDetallados")) {
				
				jButtonAbrirImportacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarMorosidadClientesDetallados")) {
				jComboBoxTiposAccionesCobrarMorosidadClientesDetalladosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarMorosidadClientesDetallados")) {
				jComboBoxTiposRelacionesCobrarMorosidadClientesDetalladosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarMorosidadClientesDetallados")) {
				jComboBoxTiposAccionesCobrarMorosidadClientesDetalladosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarMorosidadClientesDetallados")) {
				
				jComboBoxTiposSeleccionarCobrarMorosidadClientesDetalladosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarMorosidadClientesDetallados")) {
				jTextFieldValorCampoGeneralCobrarMorosidadClientesDetalladosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarMorosidadClientesDetallados")) {
				jButtonAbrirOrderByCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarMorosidadClientesDetallados")) {
				jButtonAbrirOrderByCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarMorosidadClientesDetallados")) {
				jButtonCerrarOrderByCobrarMorosidadClientesDetalladosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonidCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarMorosidadClientesDetalladosUpdate")) {
				this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtoncodigoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_vencidoCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_vencerCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados")) {
				this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			}
			
			;
			
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarMorosidadClientesDetallados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarmorosidadclientesdetalladosLocal=this.cobrarmorosidadclientesdetallados;
			} else {
				cobrarmorosidadclientesdetalladosLocal=this.cobrarmorosidadclientesdetalladosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
							
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
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
			
			


			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
								
						
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
								
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
							
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
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
			
			


			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
								
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarMorosidadClientesDetallados")) {
					jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetalladosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarMorosidadClientesDetallados")) {
					jCheckBoxSeleccionadosCobrarMorosidadClientesDetalladosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarMorosidadClientesDetallados")) {
					
				}
				
				


				
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
												
				
				


				
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
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
			
			


			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarmorosidadclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarmorosidadclientesdetallados);
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
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
				
				


				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarMorosidadClientesDetallados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarMorosidadClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarMorosidadClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarmorosidadclientesdetalladosAnterior =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarMorosidadClientesDetallados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarMorosidadClientesDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarmorosidadclientesdetallados =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarmorosidadclientesdetallados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarMorosidadClientesDetallados")) {
				
				}
				
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarMorosidadClientesDetallados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarMorosidadClientesDetallados")) {
			
			}
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarMorosidadClientesDetallados();
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarMorosidadClientesDetallados")) {
				jButtonDuplicarCobrarMorosidadClientesDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarMorosidadClientesDetallados")) {
				jButtonCopiarCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarMorosidadClientesDetallados")) {
				jButtonVerFormCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarMorosidadClientesDetallados")) {
				jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarMorosidadClientesDetallados")) {
				jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarMorosidadClientesDetallados")) {
				jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarMorosidadClientesDetallados")) {
				jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarMorosidadClientesDetallados")) {
				jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarMorosidadClientesDetallados")) {
				jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarMorosidadClientesDetallados")) {
				jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarMorosidadClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarMorosidadClientesDetallados")) {
				jButtonAbrirOrderByCobrarMorosidadClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarMorosidadClientesDetallados")) {
				jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarMorosidadClientesDetallados")) {
				jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarMorosidadClientesDetallados")) {
				jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonidCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarMorosidadClientesDetalladosUpdate")) {
				this.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonid_empresaCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtoncodigoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_vencidoCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_vencerCobrarMorosidadClientesDetalladosBusqueda")) {
				this.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusquedaActionPerformed(evt);
			}
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarMorosidadClientesDetallados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarMorosidadClientesDetallados")) {
				closingInternalFrameCobrarMorosidadClientesDetallados();
				
			} else if(sTipo.equals("jButtonCancelarCobrarMorosidadClientesDetallados")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarMorosidadClientesDetallados = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame jInternalFrameParent=(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(null);
			}
			
			CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),this.cobrarmorosidadclientesdetalladosParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarMorosidadClientesDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarMorosidadClientesDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarMorosidadClientesDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarmorosidadclientesdetallados)) {
			if(!esControlTabla) {
				if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);			
				}
				
				if(this.cobrarmorosidadclientesdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral,this.cobrarmorosidadclientesdetalladosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarmorosidadclientesdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarMorosidadClientesDetallados(classes,this.cobrarmorosidadclientesdetalladosReturnGeneral,this.cobrarmorosidadclientesdetalladosBean,false);
					}
						
					if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados());	
					}
						
					if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados(),classes);//this.cobrarmorosidadclientesdetalladosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,classes);//this.cobrarmorosidadclientesdetalladosBean);									
				}
			
				if(CobrarMorosidadClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarMorosidadClientesDetallados(this.cobrarmorosidadclientesdetallados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarmorosidadclientesdetalladosAnterior!=null) {
						this.cobrarmorosidadclientesdetallados=this.cobrarmorosidadclientesdetalladosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarmorosidadclientesdetalladosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados(),cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetallados(),this.cobrarmorosidadclientesdetalladoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarMorosidadClientesDetallados.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarMorosidadClientesDetallados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarMorosidadClientesDetallados();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarMorosidadClientesDetallados() throws Exception {
		
		CobrarMorosidadClientesDetalladosModel cobrarmorosidadclientesdetalladosModel=(CobrarMorosidadClientesDetalladosModel)this.jTableDatosCobrarMorosidadClientesDetallados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarmorosidadclientesdetalladosModel.cobrarmorosidadclientesdetalladoss=this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarmorosidadclientesdetalladosModel.cobrarmorosidadclientesdetalladoss=this.cobrarmorosidadclientesdetalladoss;
		}
		
		
		((CobrarMorosidadClientesDetalladosModel) this.jTableDatosCobrarMorosidadClientesDetallados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarMorosidadClientesDetallados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarmorosidadclientesdetalladosAnterior(),this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarmorosidadclientesdetalladosAnterior(),this.cobrarmorosidadclientesdetalladoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarMorosidadClientesDetallados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
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
										
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),generalEntityParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarMorosidadClientesDetalladosConstantesFunciones.getClassesRelationshipsOfCobrarMorosidadClientesDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarMorosidadClientesDetalladosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarMorosidadClientesDetallados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarMorosidadClientesDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarmorosidadclientesdetallados,new Object(),generalEntityParameterGeneral,this.cobrarmorosidadclientesdetalladosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetalladosBean cobrarmorosidadclientesdetalladosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarMorosidadClientesDetallados(ArrayList<Classe> classes,CobrarMorosidadClientesDetalladosReturnGeneral cobrarmorosidadclientesdetalladosReturnGeneral,CobrarMorosidadClientesDetalladosBean cobrarmorosidadclientesdetalladosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarmorosidadclientesdetallados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados = new CobrarMorosidadClientesDetalladosDetalleFormJInternalFrame(jDesktopPane,this.cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones(),this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setVisible(false);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.cobrarmorosidadclientesdetalladosLogic=this.cobrarmorosidadclientesdetalladosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarMorosidadClientesDetallados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarMorosidadClientesDetallados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarMorosidadClientesDetallados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarMorosidadClientesDetallados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarMorosidadClientesDetallados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarMorosidadClientesDetallados"));
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarCobrarMorosidadClientesDetallados"));

		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarMorosidadClientesDetallados"));
					
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemModificarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarMorosidadClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"ActualizarCobrarMorosidadClientesDetallados"));
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarMorosidadClientesDetallados"));
						
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemActualizarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarMorosidadClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarCobrarMorosidadClientesDetallados"));
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarMorosidadClientesDetallados"));
								
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemEliminarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarMorosidadClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarCobrarMorosidadClientesDetallados"));
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarMorosidadClientesDetallados"));
					
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemCancelarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarMorosidadClientesDetallados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarMorosidadClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarMorosidadClientesDetallados"));
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarMorosidadClientesDetallados"));
		
		
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarMorosidadClientesDetallados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonidCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarMorosidadClientesDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarMorosidadClientesDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_vencidoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_vencerCobrarMorosidadClientesDetalladosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarMorosidadClientesDetallados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarMorosidadClientesDetallados"));
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarMorosidadClientesDetallados"));
		}
		
		this.jTableDatosCobrarMorosidadClientesDetallados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarMorosidadClientesDetallados"));
		
		this.jTableDatosCobrarMorosidadClientesDetallados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarMorosidadClientesDetallados"));
		
		this.jButtonNuevoCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"NuevoCobrarMorosidadClientesDetallados"));
		
		this.jButtonDuplicarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"DuplicarCobrarMorosidadClientesDetallados"));
		
		this.jButtonCopiarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"CopiarCobrarMorosidadClientesDetallados"));
		
		this.jButtonVerFormCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"VerFormCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonNuevoToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarMorosidadClientesDetallados"));
			
		this.jButtonDuplicarToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemNuevoCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemDuplicarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarMorosidadClientesDetallados"));		
		
		
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarMorosidadClientesDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarCobrarMorosidadClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonModificarToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarMorosidadClientesDetallados"));
			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemModificarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarMorosidadClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"ActualizarCobrarMorosidadClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonActualizarToolBarCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarMorosidadClientesDetallados"));
				
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemActualizarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarMorosidadClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarCobrarMorosidadClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonEliminarToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarMorosidadClientesDetallados"));
						
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemEliminarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarMorosidadClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarCobrarMorosidadClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonCancelarToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarMorosidadClientesDetallados"));
			
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemCancelarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarMorosidadClientesDetallados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarMorosidadClientesDetallados"));		
		
		
		this.jButtonCerrarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CerrarCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonCerrarToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemCerrarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarMorosidadClientesDetallados"));
			
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarMorosidadClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarMorosidadClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarMorosidadClientesDetallados"));
		}
		
		this.jButtonCopiarToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarMorosidadClientesDetallados"));
			
		this.jButtonVerFormToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarMorosidadClientesDetallados"));
		
		this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemCopiarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarMorosidadClientesDetallados"));		
		
		this.jMenuItemVerFormCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarMorosidadClientesDetallados"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarMorosidadClientesDetallados"));		
		
		
		
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarMorosidadClientesDetallados"));
					
		this.jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarMorosidadClientesDetallados"));
		
		this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarMorosidadClientesDetallados"));		
		
		
		
		this.jButtonAnterioresCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"AnterioresCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonAnterioresToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarMorosidadClientesDetallados"));
		
		this.jMenuItemAnterioresCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarMorosidadClientesDetallados"));		
		
		
		this.jButtonSiguientesCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"SiguientesCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonSiguientesToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemSiguientesCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemAbrirOrderByCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemMostrarOcultarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemDetalleMostarOcultarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarMorosidadClientesDetallados"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarMorosidadClientesDetallados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarMorosidadClientesDetallados"));

		this.jCheckBoxSeleccionadosCobrarMorosidadClientesDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarMorosidadClientesDetallados"));
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarMorosidadClientesDetallados"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarMorosidadClientesDetallados"));
			
		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarMorosidadClientesDetallados"));
					
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarMorosidadClientesDetallados"));
			
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarMorosidadClientesDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonidCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarMorosidadClientesDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarMorosidadClientesDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_vencidoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_vencerCobrarMorosidadClientesDetalladosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"BusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados!=null) {
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarMorosidadClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarMorosidadClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarMorosidadClientesDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarMorosidadClientesDetallados"));				
			//this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarMorosidadClientesDetallados"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarMorosidadClientesDetallados!=null) {
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarMorosidadClientesDetallados"));
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarMorosidadClientesDetallados"));
				this.jInternalFrameImportacionCobrarMorosidadClientesDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarMorosidadClientesDetallados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarMorosidadClientesDetallados"));
			
			this.jButtonAbrirOrderByToolBarCobrarMorosidadClientesDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarMorosidadClientesDetallados"));			
			
			if(this.jInternalFrameOrderByCobrarMorosidadClientesDetallados!=null) {
				this.jInternalFrameOrderByCobrarMorosidadClientesDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarMorosidadClientesDetallados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTabbedPaneRelacionesCobrarMorosidadClientesDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarMorosidadClientesDetallados"));
		
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
            		closingInternalFrameCobrarMorosidadClientesDetallados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarMorosidadClientesDetallados = (JInternalFrameBase)event.getSource();
	            	
	            CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame jInternalFrameParent=(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarMorosidadClientesDetallados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarMorosidadClientesDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarMorosidadClientesDetallados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarMorosidadClientesDetallados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonNuevoCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarMorosidadClientesDetalladosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonModificarCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarMorosidadClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonActualizarCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarMorosidadClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonEliminarCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarMorosidadClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonCancelarCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarMorosidadClientesDetallados";
		inputMap = this.jButtonCerrarCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarMorosidadClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarMorosidadClientesDetallados";
		inputMap = this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonGuardarCambiosCobrarMorosidadClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetallados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetalladosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarMorosidadClientesDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarMorosidadClientesDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarMorosidadClientesDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonidCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarMorosidadClientesDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonid_empresaCobrarMorosidadClientesDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarMorosidadClientesDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonid_empresaCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonfecha_venceCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtoncodigoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonnombre_completoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonnumero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonsaldo_vencidoCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_vencidoCobrarMorosidadClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jButtonsaldo_vencerCobrarMorosidadClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"saldo_vencerCobrarMorosidadClientesDetalladosBusqueda"));
		
		
		this.jButtonBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados.addActionListener(new ButtonActionListener(this,"BusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarMorosidadClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarMorosidadClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarMorosidadClientesDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarMorosidadClientesDetallados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarMorosidadClientesDetallados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
					cobrarmorosidadclientesdetalladosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladoss) {
					cobrarmorosidadclientesdetalladosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarMorosidadClientesDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
						cobrarmorosidadclientesdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladoss) {
						cobrarmorosidadclientesdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarMorosidadClientesDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarMorosidadClientesDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarMorosidadClientesDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarMorosidadClientesDetallados.getSelectedRows();
			
			CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosLocal=new CobrarMorosidadClientesDetallados();
			
			//this.seleccionarTodosCobrarMorosidadClientesDetallados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarmorosidadclientesdetalladosLocal =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss().toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarmorosidadclientesdetalladosLocal =(CobrarMorosidadClientesDetallados) this.cobrarmorosidadclientesdetalladoss.toArray()[this.jTableDatosCobrarMorosidadClientesDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarmorosidadclientesdetalladosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
						cobrarmorosidadclientesdetalladosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladoss) {
						cobrarmorosidadclientesdetalladosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarMorosidadClientesDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarMorosidadClientesDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarMorosidadClientesDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarMorosidadClientesDetalladosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarMorosidadClientesDetalladosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarMorosidadClientesDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarMorosidadClientesDetallados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
				
						if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setsaldo_vencido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setsaldo_vencer(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladoss) {
					
						if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setsaldo_vencido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER)) {
							existe=true;
							cobrarmorosidadclientesdetalladosAux.setsaldo_vencer(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarMorosidadClientesDetalladosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarMorosidadClientesDetallados) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarMorosidadClientesDetallados(conSplash);
				
					this.generarReporteCobrarMorosidadClientesDetalladossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarMorosidadClientesDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarMorosidadClientesDetalladossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarMorosidadClientesDetalladossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarMorosidadClientesDetallados();
				
				this.exportarCobrarMorosidadClientesDetalladossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarMorosidadClientesDetalladoss();
				//this.importarCobrarMorosidadClientesDetalladoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarMorosidadClientesDetallados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarMorosidadClientesDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarMorosidadClientesDetallados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarMorosidadClientesDetallados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarMorosidadClientesDetallados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarMorosidadClientesDetallados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarMorosidadClientesDetallados(conSplash);
					
						//this.actualizarParametrosGeneralCobrarMorosidadClientesDetallados();
						
						this.generarReporteProcesoAccionCobrarMorosidadClientesDetalladossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Morosidad Clientes DetalladosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarMorosidadClientesDetallados();
				
						this.actualizarParametrosGeneralCobrarMorosidadClientesDetallados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarmorosidadclientesdetalladosReturnGeneral=cobrarmorosidadclientesdetalladosLogic.procesarAccionCobrarMorosidadClientesDetalladossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss(),this.cobrarmorosidadclientesdetalladosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarMorosidadClientesDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarMorosidadClientesDetallados();
					
					CobrarMorosidadClientesDetalladosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarMorosidadClientesDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxTiposAccionesFormularioCobrarMorosidadClientesDetallados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarMorosidadClientesDetallados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarMorosidadClientesDetalladosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarMorosidadClientesDetallados();
			
			if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
			CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados=new CobrarMorosidadClientesDetallados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarMorosidadClientesDetallados.getSelectedItem();
			
			
			
			
			cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarmorosidadclientesdetalladossSeleccionados.size()==1) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossSeleccionados) {
					cobrarmorosidadclientesdetallados=cobrarmorosidadclientesdetalladosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarMorosidadClientesDetallados();
			
      		//this.finishProcessCobrarMorosidadClientesDetallados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarMorosidadClientesDetalladosReturnGeneral() throws Exception {
		if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarmorosidadclientesdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarmorosidadclientesdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarmorosidadclientesdetalladosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
		}
		
		if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRetornoLista() || this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarmorosidadclientesdetalladosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarmorosidadclientesdetalladosLogic.setCobrarMorosidadClientesDetalladoss(this.cobrarmorosidadclientesdetalladosReturnGeneral.getCobrarMorosidadClientesDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarMorosidadClientesDetallados(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarMorosidadClientesDetallados() throws Exception {
		
		
	}
	
	public ArrayList<CobrarMorosidadClientesDetallados> getCobrarMorosidadClientesDetalladossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarMorosidadClientesDetallados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss()) {
					if(cobrarmorosidadclientesdetalladosAux.getIsSelected()) {
						cobrarmorosidadclientesdetalladossSeleccionados.add(cobrarmorosidadclientesdetalladosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:this.cobrarmorosidadclientesdetalladoss) {
					if(cobrarmorosidadclientesdetalladosAux.getIsSelected()) {
						cobrarmorosidadclientesdetalladossSeleccionados.add(cobrarmorosidadclientesdetalladosAux);				
					}
				}
			}
			
			if(cobrarmorosidadclientesdetalladossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarmorosidadclientesdetalladossSeleccionados.addAll(this.cobrarmorosidadclientesdetalladosLogic.getCobrarMorosidadClientesDetalladoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarmorosidadclientesdetalladossSeleccionados.addAll(this.cobrarmorosidadclientesdetalladoss);				
					}
				}
			}
		} else {
			cobrarmorosidadclientesdetalladossSeleccionados.add(this.cobrarmorosidadclientesdetallados);
		}
		
		return cobrarmorosidadclientesdetalladossSeleccionados;
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
	
	public void generarReporteCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarMorosidadClientesDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarMorosidadClientesDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarMorosidadClientesDetalladossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarMorosidadClientesDetalladossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Morosidad Clientes Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarMorosidadClientesDetalladossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarMorosidadClientesDetallados();
		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarMorosidadClientesDetallados();
		
		
		//this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados ,cobrarmorosidadclientesdetalladosImplementable,cobrarmorosidadclientesdetalladosImplementableHome);
	}
	
	public void mostrarImportacionCobrarMorosidadClientesDetalladoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarMorosidadClientesDetallados();
		
		this.abrirFrameImportacionCobrarMorosidadClientesDetallados();		
		
			
		//this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados ,cobrarmorosidadclientesdetalladosImplementable,cobrarmorosidadclientesdetalladosImplementableHome);
	}
	
	public void importarCobrarMorosidadClientesDetalladoss() throws Exception {		
	
	}
	
	public void exportarCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarMorosidadClientesDetalladossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarMorosidadClientesDetalladossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarMorosidadClientesDetalladossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Morosidad Clientes Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarMorosidadClientesDetallados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarmorosidadclientesdetalladosAux.setsDetalleGeneralEntityReporte(cobrarmorosidadclientesdetalladosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarMorosidadClientesDetallados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarmorosidadclientesdetallados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getsaldo_vencido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarmorosidadclientesdetallados.getsaldo_vencer().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarMorosidadClientesDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarMorosidadClientesDetallados(row);				
				iRow++;
			}				
			
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarMorosidadClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();		
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarmorosidadclientesdetallados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarmorosidadclientesdetalladoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarmorosidadclientesdetallados");
			//elementRoot.appendChild(element);
		
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossSeleccionados) {
				element = document.createElement("cobrarmorosidadclientesdetallados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Morosidad Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarMorosidadClientesDetallados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_SALDOVENCER);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getsaldo_vencido());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarmorosidadclientesdetallados.getsaldo_vencer());				
	}
	
	public void setFilaDatosExportarXmlCobrarMorosidadClientesDetallados(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetallados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_vence = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementcodigo = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementnumero_pre_impreso_factura = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementsaldo_vencido = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.SALDOVENCIDO);
		elementsaldo_vencido.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getsaldo_vencido().toString().trim()));
		element.appendChild(elementsaldo_vencido);

		Element elementsaldo_vencer = document.createElement(CobrarMorosidadClientesDetalladosConstantesFunciones.SALDOVENCER);
		elementsaldo_vencer.appendChild(document.createTextNode(cobrarmorosidadclientesdetallados.getsaldo_vencer().toString().trim()));
		element.appendChild(elementsaldo_vencer);
	}
	
	public void generarReporteGroupGenericoCobrarMorosidadClientesDetalladossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados=new ArrayList<CobrarMorosidadClientesDetallados>();
		
		cobrarmorosidadclientesdetalladossSeleccionados=this.getCobrarMorosidadClientesDetalladossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarMorosidadClientesDetallados(cobrarmorosidadclientesdetalladossSeleccionados);
		
		this.generarReporteCobrarMorosidadClientesDetalladoss("Todos",cobrarmorosidadclientesdetalladossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarMorosidadClientesDetallados(ArrayList<CobrarMorosidadClientesDetallados> cobrarmorosidadclientesdetalladossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarMorosidadClientesDetallados cobrarmorosidadclientesdetalladosAux:cobrarmorosidadclientesdetalladossSeleccionados) {
				cobrarmorosidadclientesdetalladosAux.setsDetalleGeneralEntityReporte(cobrarmorosidadclientesdetalladosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarmorosidadclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarmorosidadclientesdetalladosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					cobrarmorosidadclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarmorosidadclientesdetalladosAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarmorosidadclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarmorosidadclientesdetalladosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					cobrarmorosidadclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarmorosidadclientesdetalladosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CobrarMorosidadClientesDetalladosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					cobrarmorosidadclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarmorosidadclientesdetalladosAux.getnumero_pre_impreso_factura());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarMorosidadClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarMorosidadClientesDetallados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarMorosidadClientesDetalladosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=true;
		} else {
			this.actualizarEstadoPanelsCobrarMorosidadClientesDetallados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarMorosidadClientesDetallados=false;
			//this.isVisibilidadCeldaVerFormCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaDuplicarCobrarMorosidadClientesDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarmorosidadclientesdetalladosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;												
			}
			
			this.jButtonCerrarCobrarMorosidadClientesDetallados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarmorosidadclientesdetallados)) {
			this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarMorosidadClientesDetallados=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarMorosidadClientesDetallados=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarMorosidadClientesDetallados=false;
		//this.isVisibilidadCeldaModificarCobrarMorosidadClientesDetallados=true;
		this.isVisibilidadCeldaActualizarCobrarMorosidadClientesDetallados=false;
		this.isVisibilidadCeldaEliminarCobrarMorosidadClientesDetallados=false;
		//this.isVisibilidadCeldaCancelarCobrarMorosidadClientesDetallados=true;			
		this.isVisibilidadCeldaGuardarCobrarMorosidadClientesDetallados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarMorosidadClientesDetallados() {
	}
	
	public void actualizarEstadoPanelsCobrarMorosidadClientesDetallados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarMorosidadClientesDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarMorosidadClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarMorosidadClientesDetallados!=null) {
				this.jPanelPaginacionCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
					this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarmorosidadclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarMorosidadClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarMorosidadClientesDetallados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarMorosidadClientesDetallados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarMorosidadClientesDetallados) {this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.remove(jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCobrarMorosidadClientesDetallados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarMorosidadClientesDetallados() {
		this.updateBorderResaltarBusquedasFormularioCobrarMorosidadClientesDetallados();
		this.updateVisibilidadBusquedasFormularioCobrarMorosidadClientesDetallados();
		this.updateHabilitarBusquedasFormularioCobrarMorosidadClientesDetallados();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarMorosidadClientesDetallados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponents().length>0) {
	

		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados!=null) {
			index= this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponent(index);
				jPanel.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarMorosidadClientesDetallados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			if(!this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados && index>-1) {
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarMorosidadClientesDetallados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
				this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setEnabledAt(index,this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarMorosidadClientesDetallados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarMorosidadClientesDetallados")) {
			index= this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);

			this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarMorosidadClientesDetallados.getComponent(index);

			this.cobrarmorosidadclientesdetalladosConstantesFunciones.setResaltarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados(resaltar);

			jPanel.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarBusquedaCobrarMorosidadClientesDetalladosCobrarMorosidadClientesDetallados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarMorosidadClientesDetallados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarMorosidadClientesDetallados() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarMorosidadClientesDetallados();
		this.updateVisibilidadResaltarControlesFormularioCobrarMorosidadClientesDetallados();
		this.updateHabilitarResaltarControlesFormularioCobrarMorosidadClientesDetallados();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarMorosidadClientesDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltaridCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltaridCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarid_empresaCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarid_empresaCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarfecha_venceCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarfecha_venceCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarcodigoCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarcodigoCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnombre_completoCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnombre_completoCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencidoCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencidoCobrarMorosidadClientesDetallados);}
		if(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencerCobrarMorosidadClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setBorder(this.cobrarmorosidadclientesdetalladosConstantesFunciones.resaltarsaldo_vencerCobrarMorosidadClientesDetallados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarMorosidadClientesDetallados() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
	
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostraridCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelidCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostraridCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarid_empresaCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelid_empresaCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarid_empresaCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarfecha_venceCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelfecha_venceCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarfecha_venceCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarcodigoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelcodigoCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarcodigoCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarnombre_completoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelnombre_completoCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarnombre_completoCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarsaldo_vencidoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelsaldo_vencidoCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarsaldo_vencidoCobrarMorosidadClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarsaldo_vencerCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jPanelsaldo_vencerCobrarMorosidadClientesDetallados.setVisible(this.cobrarmorosidadclientesdetalladosConstantesFunciones.mostrarsaldo_vencerCobrarMorosidadClientesDetallados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarMorosidadClientesDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados!=null) {
	
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jLabelidCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activaridCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jComboBoxid_empresaCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarid_empresaCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jDateChooserfecha_venceCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarfecha_venceCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldcodigoCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarcodigoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextAreanombre_completoCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnombre_completoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarnumero_pre_impreso_facturaCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencidoCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencidoCobrarMorosidadClientesDetallados);
		this.jInternalFrameDetalleFormCobrarMorosidadClientesDetallados.jTextFieldsaldo_vencerCobrarMorosidadClientesDetallados.setEnabled(this.cobrarmorosidadclientesdetalladosConstantesFunciones.activarsaldo_vencerCobrarMorosidadClientesDetallados);
		}
	}
	
		
}