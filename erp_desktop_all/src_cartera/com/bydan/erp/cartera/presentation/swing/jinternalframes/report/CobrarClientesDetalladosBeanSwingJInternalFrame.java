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

//import com.bydan.erp.cartera.util.CobrarClientesDetalladosConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesDetalladosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesDetalladosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarClientesDetalladosBean;
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
public class CobrarClientesDetalladosBeanSwingJInternalFrame extends CobrarClientesDetalladosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarClientesDetalladosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarClientesDetallados> cobrarclientesdetalladosValidator = new ClassValidator<CobrarClientesDetallados>(CobrarClientesDetallados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarClientesDetallados cobrarclientesdetallados;	
	public CobrarClientesDetallados cobrarclientesdetalladosAux;
	public CobrarClientesDetallados cobrarclientesdetalladosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarClientesDetallados cobrarclientesdetalladosTotales;
	public Long idCobrarClientesDetalladosActual;
	public Long iIdNuevoCobrarClientesDetallados=0L;
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
	
	public Boolean isPermisoTodoCobrarClientesDetallados;
	public Boolean isPermisoNuevoCobrarClientesDetallados;
	public Boolean isPermisoActualizarCobrarClientesDetallados;
	public Boolean isPermisoActualizarOriginalCobrarClientesDetallados;
	public Boolean isPermisoEliminarCobrarClientesDetallados;
	public Boolean isPermisoGuardarCambiosCobrarClientesDetallados;
	public Boolean isPermisoConsultaCobrarClientesDetallados;
	public Boolean isPermisoBusquedaCobrarClientesDetallados;
	public Boolean isPermisoReporteCobrarClientesDetallados;
	public Boolean isPermisoPaginacionMedioCobrarClientesDetallados;
	public Boolean isPermisoPaginacionAltoCobrarClientesDetallados;
	public Boolean isPermisoPaginacionTodoCobrarClientesDetallados;
	public Boolean isPermisoCopiarCobrarClientesDetallados;
	public Boolean isPermisoVerFormCobrarClientesDetallados;
	public Boolean isPermisoDuplicarCobrarClientesDetallados;
	public Boolean isPermisoOrdenCobrarClientesDetallados;
	
	
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
	
	public CobrarClientesDetalladosParameterReturnGeneral cobrarclientesdetalladosReturnGeneral;
	public CobrarClientesDetalladosParameterReturnGeneral cobrarclientesdetalladosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarClientesDetallados=false;
	public Boolean esParaAccionDesdeFormularioCobrarClientesDetallados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarClientesDetalladosSessionBeanAdditional cobrarclientesdetalladosSessionBeanAdditional=null;
	
	public CobrarClientesDetalladosSessionBeanAdditional getCobrarClientesDetalladosSessionBeanAdditional() {
		return this.cobrarclientesdetalladosSessionBeanAdditional;
	}
	
	public void setCobrarClientesDetalladosSessionBeanAdditional(CobrarClientesDetalladosSessionBeanAdditional cobrarclientesdetalladosSessionBeanAdditional) {
		try {
			this.cobrarclientesdetalladosSessionBeanAdditional=cobrarclientesdetalladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarClientesDetalladosBeanSwingJInternalFrameAdditional cobrarclientesdetalladosBeanSwingJInternalFrameAdditional=null;
	//public class CobrarClientesDetalladosBeanSwingJInternalFrame
	
	public CobrarClientesDetalladosBeanSwingJInternalFrameAdditional getCobrarClientesDetalladosBeanSwingJInternalFrameAdditional() {
		return this.cobrarclientesdetalladosBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarClientesDetalladosBeanSwingJInternalFrameAdditional(CobrarClientesDetalladosBeanSwingJInternalFrameAdditional cobrarclientesdetalladosBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarclientesdetalladosBeanSwingJInternalFrameAdditional=cobrarclientesdetalladosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarClientesDetalladosLogic cobrarclientesdetalladosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarClientesDetallados cobrarclientesdetalladosBean;
	public CobrarClientesDetalladosConstantesFunciones cobrarclientesdetalladosConstantesFunciones;
	//public CobrarClientesDetalladosParameterReturnGeneral cobrarclientesdetalladosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarClientesDetallados> cobrarclientesdetalladoss;	
	//public List<CobrarClientesDetallados> cobrarclientesdetalladossEliminados;
	//public List<CobrarClientesDetallados> cobrarclientesdetalladossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarClientesDetallados=true;
	public Boolean isVisibilidadCeldaCopiarCobrarClientesDetallados=true;
	public Boolean isVisibilidadCeldaVerFormCobrarClientesDetallados=true;
	public Boolean isVisibilidadCeldaOrdenCobrarClientesDetallados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
	public Boolean isVisibilidadCeldaModificarCobrarClientesDetallados=false;
	public Boolean isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
	public Boolean isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
	public Boolean isVisibilidadCeldaCancelarCobrarClientesDetallados=false;
	public Boolean isVisibilidadCeldaGuardarCobrarClientesDetallados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarClientesDetallados=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCobrarClientesDetallados() {
		return this.iIdNuevoCobrarClientesDetallados;
	}

	public void setiIdNuevoCobrarClientesDetallados(Long iIdNuevoCobrarClientesDetallados) {
		this.iIdNuevoCobrarClientesDetallados = iIdNuevoCobrarClientesDetallados;
	}
	
	public Long getidCobrarClientesDetalladosActual() {
		return this.idCobrarClientesDetalladosActual;
	}

	public void setidCobrarClientesDetalladosActual(Long idCobrarClientesDetalladosActual) {
		this.idCobrarClientesDetalladosActual = idCobrarClientesDetalladosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarClientesDetallados getcobrarclientesdetallados() {
		return this.cobrarclientesdetallados;
	}

	public void setcobrarclientesdetallados(CobrarClientesDetallados cobrarclientesdetallados) {
		this.cobrarclientesdetallados = cobrarclientesdetallados;
	}
	
	public CobrarClientesDetallados getcobrarclientesdetalladosAux() {
		return this.cobrarclientesdetalladosAux;
	}

	public void setcobrarclientesdetalladosAux(CobrarClientesDetallados cobrarclientesdetalladosAux) {
		this.cobrarclientesdetalladosAux = cobrarclientesdetalladosAux;
	}				
	
	public CobrarClientesDetallados getcobrarclientesdetalladosAnterior() {
		return this.cobrarclientesdetalladosAnterior;
	}

	public void setcobrarclientesdetalladosAnterior(CobrarClientesDetallados cobrarclientesdetalladosAnterior) {
		this.cobrarclientesdetalladosAnterior = cobrarclientesdetalladosAnterior;
	}	
	
	public CobrarClientesDetallados getcobrarclientesdetalladosTotales() {
		return this.cobrarclientesdetalladosTotales;
	}

	public void setcobrarclientesdetalladosTotales(CobrarClientesDetallados cobrarclientesdetalladosTotales) {
		this.cobrarclientesdetalladosTotales = cobrarclientesdetalladosTotales;
	}	
	
	public CobrarClientesDetallados getcobrarclientesdetalladosBean() {
		return this.cobrarclientesdetalladosBean;
	}

	public void setcobrarclientesdetalladosBean(CobrarClientesDetallados cobrarclientesdetalladosBean) {
		this.cobrarclientesdetalladosBean = cobrarclientesdetalladosBean;
	}	
	
	public CobrarClientesDetalladosParameterReturnGeneral getcobrarclientesdetalladosReturnGeneral() {
		return this.cobrarclientesdetalladosReturnGeneral;
	}

	public void setcobrarclientesdetalladosReturnGeneral(CobrarClientesDetalladosParameterReturnGeneral cobrarclientesdetalladosReturnGeneral) {
		this.cobrarclientesdetalladosReturnGeneral = cobrarclientesdetalladosReturnGeneral;
	}	
	
	
	public Long idBusquedaCobrarClientesDetallados=0L;

	public Long getidBusquedaCobrarClientesDetallados() {
		return this.idBusquedaCobrarClientesDetallados;
	}

	public void setidBusquedaCobrarClientesDetallados(Long idBusquedaCobrarClientesDetallados) {
		this.idBusquedaCobrarClientesDetallados = idBusquedaCobrarClientesDetallados;
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
	
	
	public CobrarClientesDetalladosLogic getCobrarClientesDetalladosLogic()	{		
		return cobrarclientesdetalladosLogic;
	}

	public void setCobrarClientesDetalladosLogic(CobrarClientesDetalladosLogic cobrarclientesdetalladosLogic) {
		this.cobrarclientesdetalladosLogic = cobrarclientesdetalladosLogic;
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
	
	public Boolean getIsEsNuevoCobrarClientesDetallados() {
		return isEsNuevoCobrarClientesDetallados;
	}

	public void setIsEsNuevoCobrarClientesDetallados(Boolean isEsNuevoCobrarClientesDetallados) {
		this.isEsNuevoCobrarClientesDetallados = isEsNuevoCobrarClientesDetallados;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarClientesDetallados() {
		return esParaAccionDesdeFormularioCobrarClientesDetallados;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarClientesDetallados(Boolean esParaAccionDesdeFormularioCobrarClientesDetallados) {
		this.esParaAccionDesdeFormularioCobrarClientesDetallados = esParaAccionDesdeFormularioCobrarClientesDetallados;
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

			if(this.cobrarclientesdetalladosSessionBean==null) {
				this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean();
			}

			if(!this.cobrarclientesdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarclientesdetalladosSessionBean.getlidEmpresaActual());
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

					if(this.cobrarclientesdetallados!=null) {
						this.cobrarclientesdetallados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
						this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarClientesDetallados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarClientesDetalladosGenerico)throws Exception
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
				jComboBoxid_empresaCobrarClientesDetalladosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarClientesDetalladosGenerico!=null && jComboBoxid_empresaCobrarClientesDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarClientesDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarClientesDetallados cobrarclientesdetallados,JComboBox jComboBoxid_empresaCobrarClientesDetalladosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarClientesDetalladosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarClientesDetalladosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarclientesdetallados.setid_empresa(empresaAux.getId());
				cobrarclientesdetallados.setempresa_descripcion(CobrarClientesDetalladosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarclientesdetallados.setEmpresa(empresaAux);			}
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

					if(!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { 
					}

					if(!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
							this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
							this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCobrarClientesDetallados() throws Exception {
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
		
	public CobrarClientesDetalladosParameterReturnGeneral getCobrarClientesDetalladosParameterGeneral() {
		return this.cobrarclientesdetalladosParameterGeneral;
	}
	
	public void setCobrarClientesDetalladosParameterGeneral(CobrarClientesDetalladosParameterReturnGeneral cobrarclientesdetalladosParameterGeneral) {
		this.cobrarclientesdetalladosParameterGeneral = cobrarclientesdetalladosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarClientesDetallados() {
		return isPermisoTodoCobrarClientesDetallados;
	}

	public void setIsPermisoTodoCobrarClientesDetallados(Boolean isPermisoTodoCobrarClientesDetallados) {
		this.isPermisoTodoCobrarClientesDetallados = isPermisoTodoCobrarClientesDetallados;
	}

	public Boolean getIsPermisoNuevoCobrarClientesDetallados() {
		return isPermisoNuevoCobrarClientesDetallados;
	}

	public void setIsPermisoNuevoCobrarClientesDetallados(Boolean isPermisoNuevoCobrarClientesDetallados) {
		this.isPermisoNuevoCobrarClientesDetallados = isPermisoNuevoCobrarClientesDetallados;
	}

	public Boolean getIsPermisoActualizarCobrarClientesDetallados() {
		return isPermisoActualizarCobrarClientesDetallados;
	}

	public void setIsPermisoActualizarCobrarClientesDetallados(Boolean isPermisoActualizarCobrarClientesDetallados) {
		this.isPermisoActualizarCobrarClientesDetallados = isPermisoActualizarCobrarClientesDetallados;
	}

	public Boolean getIsPermisoEliminarCobrarClientesDetallados() {
		return isPermisoEliminarCobrarClientesDetallados;
	}

	public void setIsPermisoEliminarCobrarClientesDetallados(Boolean isPermisoEliminarCobrarClientesDetallados) {
		this.isPermisoEliminarCobrarClientesDetallados = isPermisoEliminarCobrarClientesDetallados;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarClientesDetallados() {
		return isPermisoGuardarCambiosCobrarClientesDetallados;
	}

	public void setIsPermisoGuardarCambiosCobrarClientesDetallados(Boolean isPermisoGuardarCambiosCobrarClientesDetallados) {
		this.isPermisoGuardarCambiosCobrarClientesDetallados = isPermisoGuardarCambiosCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoConsultaCobrarClientesDetallados() {
		return isPermisoConsultaCobrarClientesDetallados;
	}

	public void setIsPermisoConsultaCobrarClientesDetallados(Boolean isPermisoConsultaCobrarClientesDetallados) {
		this.isPermisoConsultaCobrarClientesDetallados = isPermisoConsultaCobrarClientesDetallados;
	}

	public Boolean getIsPermisoBusquedaCobrarClientesDetallados() {
		return isPermisoBusquedaCobrarClientesDetallados;
	}

	public void setIsPermisoBusquedaCobrarClientesDetallados(Boolean isPermisoBusquedaCobrarClientesDetallados) {
		this.isPermisoBusquedaCobrarClientesDetallados = isPermisoBusquedaCobrarClientesDetallados;
	}

	public Boolean getIsPermisoReporteCobrarClientesDetallados() {
		return isPermisoReporteCobrarClientesDetallados;
	}

	public void setIsPermisoReporteCobrarClientesDetallados(Boolean isPermisoReporteCobrarClientesDetallados) {
		this.isPermisoReporteCobrarClientesDetallados = isPermisoReporteCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarClientesDetallados() {
		return isPermisoPaginacionMedioCobrarClientesDetallados;
	}

	public void setIsPermisoPaginacionMedioCobrarClientesDetallados(Boolean isPermisoPaginacionMedioCobrarClientesDetallados) {
		this.isPermisoPaginacionMedioCobrarClientesDetallados = isPermisoPaginacionMedioCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarClientesDetallados() {
		return isPermisoPaginacionTodoCobrarClientesDetallados;
	}

	public void setIsPermisoPaginacionTodoCobrarClientesDetallados(Boolean isPermisoPaginacionTodoCobrarClientesDetallados) {
		this.isPermisoPaginacionTodoCobrarClientesDetallados = isPermisoPaginacionTodoCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarClientesDetallados() {
		return isPermisoPaginacionAltoCobrarClientesDetallados;
	}

	public void setIsPermisoPaginacionAltoCobrarClientesDetallados(Boolean isPermisoPaginacionAltoCobrarClientesDetallados) {
		this.isPermisoPaginacionAltoCobrarClientesDetallados = isPermisoPaginacionAltoCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoCopiarCobrarClientesDetallados() {
		return isPermisoCopiarCobrarClientesDetallados;
	}

	public void setIsPermisoCopiarCobrarClientesDetallados(Boolean isPermisoCopiarCobrarClientesDetallados) {
		this.isPermisoCopiarCobrarClientesDetallados = isPermisoCopiarCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoVerFormCobrarClientesDetallados() {
		return isPermisoVerFormCobrarClientesDetallados;
	}

	public void setIsPermisoVerFormCobrarClientesDetallados(Boolean isPermisoVerFormCobrarClientesDetallados) {
		this.isPermisoVerFormCobrarClientesDetallados = isPermisoVerFormCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoDuplicarCobrarClientesDetallados() {
		return isPermisoDuplicarCobrarClientesDetallados;
	}

	public void setIsPermisoDuplicarCobrarClientesDetallados(Boolean isPermisoDuplicarCobrarClientesDetallados) {
		this.isPermisoDuplicarCobrarClientesDetallados = isPermisoDuplicarCobrarClientesDetallados;
	}
	
	public Boolean getIsPermisoOrdenCobrarClientesDetallados() {
		return isPermisoOrdenCobrarClientesDetallados;
	}

	public void setIsPermisoOrdenCobrarClientesDetallados(Boolean isPermisoOrdenCobrarClientesDetallados) {
		this.isPermisoOrdenCobrarClientesDetallados = isPermisoOrdenCobrarClientesDetallados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarClientesDetallados() {
		return isVisibilidadCeldaNuevoCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaNuevoCobrarClientesDetallados(Boolean isVisibilidadCeldaNuevoCobrarClientesDetallados) {
		this.isVisibilidadCeldaNuevoCobrarClientesDetallados = isVisibilidadCeldaNuevoCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarClientesDetallados() {
		return isVisibilidadCeldaDuplicarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarClientesDetallados(Boolean isVisibilidadCeldaDuplicarCobrarClientesDetallados) {
		this.isVisibilidadCeldaDuplicarCobrarClientesDetallados = isVisibilidadCeldaDuplicarCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarClientesDetallados() {
		return isVisibilidadCeldaCopiarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaCopiarCobrarClientesDetallados(Boolean isVisibilidadCeldaCopiarCobrarClientesDetallados) {
		this.isVisibilidadCeldaCopiarCobrarClientesDetallados = isVisibilidadCeldaCopiarCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarClientesDetallados() {
		return isVisibilidadCeldaVerFormCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaVerFormCobrarClientesDetallados(Boolean isVisibilidadCeldaVerFormCobrarClientesDetallados) {
		this.isVisibilidadCeldaVerFormCobrarClientesDetallados = isVisibilidadCeldaVerFormCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarClientesDetallados() {
		return isVisibilidadCeldaOrdenCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaOrdenCobrarClientesDetallados(Boolean isVisibilidadCeldaOrdenCobrarClientesDetallados) {
		this.isVisibilidadCeldaOrdenCobrarClientesDetallados = isVisibilidadCeldaOrdenCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados() {
		return isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados(Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados = isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarClientesDetallados() {
		return isVisibilidadCeldaModificarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaModificarCobrarClientesDetallados(Boolean isVisibilidadCeldaModificarCobrarClientesDetallados) {
		this.isVisibilidadCeldaModificarCobrarClientesDetallados = isVisibilidadCeldaModificarCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarClientesDetallados() {
		return isVisibilidadCeldaActualizarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaActualizarCobrarClientesDetallados(Boolean isVisibilidadCeldaActualizarCobrarClientesDetallados) {
		this.isVisibilidadCeldaActualizarCobrarClientesDetallados = isVisibilidadCeldaActualizarCobrarClientesDetallados;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarClientesDetallados() {
		return isVisibilidadCeldaEliminarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaEliminarCobrarClientesDetallados(Boolean isVisibilidadCeldaEliminarCobrarClientesDetallados) {
		this.isVisibilidadCeldaEliminarCobrarClientesDetallados = isVisibilidadCeldaEliminarCobrarClientesDetallados;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarClientesDetallados() {
		return isVisibilidadCeldaCancelarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaCancelarCobrarClientesDetallados(Boolean isVisibilidadCeldaCancelarCobrarClientesDetallados) {
		this.isVisibilidadCeldaCancelarCobrarClientesDetallados = isVisibilidadCeldaCancelarCobrarClientesDetallados;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarClientesDetallados() {
		return isVisibilidadCeldaGuardarCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCobrarClientesDetallados(Boolean isVisibilidadCeldaGuardarCobrarClientesDetallados) {
		this.isVisibilidadCeldaGuardarCobrarClientesDetallados = isVisibilidadCeldaGuardarCobrarClientesDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarClientesDetallados() {
		return isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarClientesDetallados(Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados) {
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados = isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados;
	}
		
	public CobrarClientesDetalladosSessionBean getcobrarclientesdetalladosSessionBean() {
		return this.cobrarclientesdetalladosSessionBean;
	}
	
	public void setcobrarclientesdetalladosSessionBean(CobrarClientesDetalladosSessionBean cobrarclientesdetalladosSessionBean) {
		this.cobrarclientesdetalladosSessionBean=cobrarclientesdetalladosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarClientesDetallados() {
		return this.isVisibilidadBusquedaCobrarClientesDetallados;
	}

	public void setisVisibilidadBusquedaCobrarClientesDetallados(Boolean isVisibilidadBusquedaCobrarClientesDetallados) {
		this.isVisibilidadBusquedaCobrarClientesDetallados=isVisibilidadBusquedaCobrarClientesDetallados;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarclientesdetallados,null);
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
	
	public void bugActualizarReferenciaActual(CobrarClientesDetallados cobrarclientesdetallados,CobrarClientesDetallados cobrarclientesdetalladosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarClientesDetallados(cobrarclientesdetallados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarclientesdetalladosAux.setId(cobrarclientesdetallados.getId());
		cobrarclientesdetalladosAux.setVersionRow(cobrarclientesdetallados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarClientesDetallados cobrarclientesdetalladosLocal) throws Exception {
		
		if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarClientesDetallados cobrarclientesdetalladosLocal) throws Exception {	
		if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarclientesdetalladosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarClientesDetalladosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarclientesdetalladosValidator.getInvalidValues(this.cobrarclientesdetallados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarClientesDetallados cobrarclientesdetallados,List<CobrarClientesDetallados> cobrarclientesdetalladoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarClientesDetallados cobrarclientesdetallados,List<CobrarClientesDetallados> cobrarclientesdetalladoss) throws Exception {
		try	{			
			CobrarClientesDetalladosConstantesFunciones.actualizarSelectedLista(cobrarclientesdetallados,cobrarclientesdetalladoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarClientesDetallados> cobrarclientesdetalladossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarclientesdetalladossLocal=this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarclientesdetalladossLocal=this.cobrarclientesdetalladoss;
			}
			//ARCHITECTURE
		
			for(CobrarClientesDetallados cobrarclientesdetalladosLocal:cobrarclientesdetalladossLocal) {
				if(this.permiteMantenimiento(cobrarclientesdetalladosLocal) && cobrarclientesdetalladosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarClientesDetalladosConstantesFunciones.getCobrarClientesDetalladosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_ciudadCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_zonaCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.NOMBREGRUPOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_grupo_clienteCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.NOMBRETITULOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_titulo_clienteCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelcodigoCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombreCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelapellidoCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelrucCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.NOMBRECONTACTOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_contacto_clienteCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.DIRECCIONDIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabeldireccion_direccionCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.EMAILEMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabele_mail_e_mailCobrarClientesDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesDetalladosConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabeltelefono_telefonoCobrarClientesDetallados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_ciudadCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_zonaCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_grupo_clienteCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_titulo_clienteCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelcodigoCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombreCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelapellidoCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelrucCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_contacto_clienteCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabeldireccion_direccionCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabele_mail_e_mailCobrarClientesDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabeltelefono_telefonoCobrarClientesDetallados,"");
		
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
		this.iIdNuevoCobrarClientesDetallados--;	
		
		
		this.cobrarclientesdetalladosAux=new CobrarClientesDetallados();
		
		this.cobrarclientesdetalladosAux.setId(this.iIdNuevoCobrarClientesDetallados);
		this.cobrarclientesdetalladosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().add(this.cobrarclientesdetalladosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarclientesdetalladoss.add(this.cobrarclientesdetalladosAux);
		}
		//ARCHITECTURE
		
		this.cobrarclientesdetallados=this.cobrarclientesdetalladosAux;
		
		if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetallados);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesDetallados(this.cobrarclientesdetallados);
		}
				
		//this.setDefaultControlesCobrarClientesDetallados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarClientesDetallados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesDetallados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesDetallados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetalladosBean,this.cobrarclientesdetallados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral,this.cobrarclientesdetalladosBean,false);
		
		if(this.cobrarclientesdetalladosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados());
		}
		
		if(this.cobrarclientesdetalladosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados(),classes);//this.cobrarclientesdetalladosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarClientesDetallados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarClientesDetallados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.RecargarFormCobrarClientesDetallados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
						
			if(cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesDetallados();
			}
			
			this.actualizarVisualTableDatosCobrarClientesDetallados();
			
			this.jTableDatosCobrarClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesDetallados(), this.getIndiceNuevoCobrarClientesDetallados());
			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
						
			this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarClientesDetallados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarnombre_ciudadCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarnombre_zonaCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarnombre_grupo_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarnombre_titulo_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarcodigoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarnombreCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarapellidoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarrucCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarnombre_contacto_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activardireccion_direccionCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activare_mail_e_mailCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activartelefono_telefonoCobrarClientesDetallados);	
		//
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setEnabled(isHabilitar && this.cobrarclientesdetalladosConstantesFunciones.activarid_empresaCobrarClientesDetallados);
	};
	
	public void setDefaultControlesCobrarClientesDetallados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarClientesDetallados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarclientesdetalladosSessionBean.setConGuardarRelaciones(true);			
			this.cobrarclientesdetalladosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.setVisible(true);
			
					
		} else {
			//this.cobrarclientesdetalladosSessionBean.setConGuardarRelaciones(false);			
			this.cobrarclientesdetalladosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarClientesDetallados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
				if(cobrarclientesdetalladosAux.getId().equals(this.iIdNuevoCobrarClientesDetallados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladoss) {
				if(cobrarclientesdetalladosAux.getId().equals(this.iIdNuevoCobrarClientesDetallados)) {
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
	
	public int getIndiceActualCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
				if(cobrarclientesdetalladosAux.getId().equals(cobrarclientesdetallados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladoss) {
				if(cobrarclientesdetalladosAux.getId().equals(cobrarclientesdetallados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetalladosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
				if(cobrarclientesdetalladosAux.getCobrarClientesDetalladosOriginal().getId().equals(cobrarclientesdetalladosOriginal.getId())) {
					existe=true;
					cobrarclientesdetalladosOriginal.setId(cobrarclientesdetalladosAux.getId());
					cobrarclientesdetalladosOriginal.setVersionRow(cobrarclientesdetalladosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladoss) {
				if(cobrarclientesdetalladosAux.getCobrarClientesDetalladosOriginal().getId().equals(cobrarclientesdetalladosOriginal.getId())) {
					existe=true;
					cobrarclientesdetalladosOriginal.setId(cobrarclientesdetalladosAux.getId());
					cobrarclientesdetalladosOriginal.setVersionRow(cobrarclientesdetalladosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarClientesDetallados(Boolean esParaCancelar) throws Exception {
		cobrarclientesdetalladossAux=new ArrayList<CobrarClientesDetallados>();
		cobrarclientesdetalladosAux=new CobrarClientesDetallados();
		
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
					if(cobrarclientesdetalladosAux.getId()<0) {
						cobrarclientesdetalladossAux.add(cobrarclientesdetalladosAux);
					}		
				}
				this.iIdNuevoCobrarClientesDetallados=0L;
				this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().removeAll(cobrarclientesdetalladossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladoss) {
					if(cobrarclientesdetalladosAux.getId()<0) {
						cobrarclientesdetalladossAux.add(cobrarclientesdetalladosAux);
					}		
				}
				this.iIdNuevoCobrarClientesDetallados=0L;
				this.cobrarclientesdetalladoss.removeAll(cobrarclientesdetalladossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesDetallados 
					&& this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size()>0
					) {
					cobrarclientesdetalladosAux=this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().get(this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size() - 1);
				
					if(cobrarclientesdetalladosAux.getId()<0) {
						this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().remove(cobrarclientesdetalladosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesDetallados && this.cobrarclientesdetalladoss.size()>0) {
					cobrarclientesdetalladosAux=this.cobrarclientesdetalladoss.get(this.cobrarclientesdetalladoss.size() - 1);
				
					if(cobrarclientesdetalladosAux.getId()<0) {
						this.cobrarclientesdetalladoss.remove(cobrarclientesdetalladosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarClientesDetallados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarclientesdetallados.getId()<0) {
				this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().remove(this.cobrarclientesdetallados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarclientesdetallados.getId()<0) {
				this.cobrarclientesdetalladoss.remove(this.cobrarclientesdetallados);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarClientesDetallados(List<CobrarClientesDetallados> cobrarclientesdetalladossAux) throws Exception {
		CobrarClientesDetalladosConstantesFunciones.setEstadosInicialesCobrarClientesDetallados(cobrarclientesdetalladossAux);
	}
	
	public void setEstadosInicialesCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetalladosAux) throws Exception {
		CobrarClientesDetalladosConstantesFunciones.setEstadosInicialesCobrarClientesDetallados(cobrarclientesdetalladosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarClientesDetalladosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarClientesDetalladosActual()) {
				if(!this.isEsNuevoCobrarClientesDetallados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarClientesDetallados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarClientesDetalladosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Clientes Detallados ?", "MANTENIMIENTO DE Cobrar Clientes Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarClientesDetallados cobrarclientesdetallados) throws Exception {
		CobrarClientesDetalladosConstantesFunciones.seleccionarAsignar(this.cobrarclientesdetallados,cobrarclientesdetallados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarClientesDetallados=this.isPermisoActualizarOriginalCobrarClientesDetallados;
			
			
			this.seleccionarAsignar(cobrarclientesdetallados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarclientesdetalladosSessionBean.setsFuncionBusquedaRapida(this.cobrarclientesdetalladosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarClientesDetallados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarClientesDetallados(esParaCancelar);				
				this.cancelarNuevoCobrarClientesDetallados(esParaCancelar);								
			}
			
			this.cobrarclientesdetallados=new CobrarClientesDetallados();
			
			this.inicializarCobrarClientesDetallados();
			
			this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarClientesDetallados() throws Exception {
		try {
			CobrarClientesDetalladosConstantesFunciones.inicializarCobrarClientesDetallados(this.cobrarclientesdetallados);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarClientesDetalladoss(String sAccionBusqueda,List<CobrarClientesDetallados> cobrarclientesdetalladossParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarClientesDetallados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarClientesDetalladosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarClientesDetalladosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarClientesDetallados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Clientes Detalladoses");		
		parameters.put("busquedapor", CobrarClientesDetalladosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarClientesDetallados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarClientesDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarClientesDetallados=new JRBeanArrayDataSource(CobrarClientesDetalladosJInternalFrame.TraerCobrarClientesDetalladosBeans(cobrarclientesdetalladossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarClientesDetallados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarClientesDetalladosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarClientesDetalladosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarClientesDetalladosBean.TraerCobrarClientesDetalladosBeans(cobrarclientesdetalladossParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesdetalladossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesdetalladossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetalladosActionPerformed(null);
					//this.generarExcelReporteCobrarClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesdetalladossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesdetalladossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesdetalladossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarClientesDetalladoss(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesdetalladossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarClientesDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesDetallados> cobrarclientesdetalladossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesDetalladoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesDetallados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarClientesDetallados cobrarclientesdetallados : cobrarclientesdetalladossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarClientesDetalladosConstantesFunciones.generarExcelReporteDataCobrarClientesDetallados("NORMAL",row,workbook,cobrarclientesdetallados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarClientesDetallados(String sTipo,Row row,Workbook workbook) {
		
		CobrarClientesDetalladosConstantesFunciones.generarExcelReporteHeaderCobrarClientesDetallados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarClientesDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesDetallados> cobrarclientesdetalladossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarClientesDetallados cobrarclientesdetallados : cobrarclientesdetalladossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.getCobrarClientesDetalladosDescripcion(cobrarclientesdetallados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getnombre_grupo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getnombre_titulo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getnombre_contacto_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.getdireccion_direccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.gete_mail_e_mail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesdetallados.gettelefono_telefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarClientesDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesDetallados> cobrarclientesdetalladossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarClientesDetallados> cobrarclientesdetalladossRespaldo=null;
		
		classes=CobrarClientesDetalladosConstantesFunciones.getClassesRelationshipsOfCobrarClientesDetallados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarclientesdetalladosLogic.setDatosCliente(this.datosCliente);
		this.cobrarclientesdetalladosLogic.setDatosDeep(this.datosDeep);
		this.cobrarclientesdetalladosLogic.setIsConDeep(true);
		
		cobrarclientesdetalladossRespaldo=this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss();
		
		this.cobrarclientesdetalladosLogic.setCobrarClientesDetalladoss(cobrarclientesdetalladossParaReportes);	
		this.cobrarclientesdetalladosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarclientesdetalladossParaReportes=this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss();
		this.cobrarclientesdetalladosLogic.setCobrarClientesDetalladoss(cobrarclientesdetalladossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesDetallados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarClientesDetallados cobrarclientesdetallados : cobrarclientesdetalladossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarClientesDetallados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarClientesDetalladosConstantesFunciones.generarExcelReporteDataCobrarClientesDetallados("NORMAL",row,workbook,cobrarclientesdetallados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.getCobrarClientesDetalladosDescripcion(cobrarclientesdetallados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarClientesDetallados() throws Exception {		
		this.startProcessCobrarClientesDetallados(true);
	}
	
	public void startProcessCobrarClientesDetallados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarClientesDetallados ,this.jPanelParametrosReportesCobrarClientesDetallados, this.jScrollPanelDatosCobrarClientesDetallados,this.jPanelPaginacionCobrarClientesDetallados, this.jScrollPanelDatosEdicionCobrarClientesDetallados, this.jPanelAccionesCobrarClientesDetallados,this.jPanelAccionesFormularioCobrarClientesDetallados,this.jmenuBarCobrarClientesDetallados,this.jmenuBarDetalleCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,this.jTtoolBarDetalleCobrarClientesDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesDetallados=this.jTabbedPaneBusquedasCobrarClientesDetallados; 
		
		final JPanel jPanelParametrosReportesCobrarClientesDetallados=this.jPanelParametrosReportesCobrarClientesDetallados;
		//final JScrollPane jScrollPanelDatosCobrarClientesDetallados=this.jScrollPanelDatosCobrarClientesDetallados;
		final JTable jTableDatosCobrarClientesDetallados=this.jTableDatosCobrarClientesDetallados;		
		final JPanel jPanelPaginacionCobrarClientesDetallados=this.jPanelPaginacionCobrarClientesDetallados;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesDetallados=this.jScrollPanelDatosEdicionCobrarClientesDetallados;
		final JPanel jPanelAccionesCobrarClientesDetallados=this.jPanelAccionesCobrarClientesDetallados;
		
		JPanel jPanelCamposAuxiliarCobrarClientesDetallados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesDetallados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			jPanelCamposAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelCamposCobrarClientesDetallados;
			jPanelAccionesFormularioAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelAccionesFormularioCobrarClientesDetallados;
		}
		
		final JPanel jPanelCamposCobrarClientesDetallados=jPanelCamposAuxiliarCobrarClientesDetallados;
		final JPanel jPanelAccionesFormularioCobrarClientesDetallados=jPanelAccionesFormularioAuxiliarCobrarClientesDetallados;
		
		
		final JMenuBar jmenuBarCobrarClientesDetallados=this.jmenuBarCobrarClientesDetallados;
		final JToolBar jTtoolBarCobrarClientesDetallados=this.jTtoolBarCobrarClientesDetallados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesDetallados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jmenuBarDetalleCobrarClientesDetallados;
			jTtoolBarDetalleAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jTtoolBarDetalleCobrarClientesDetallados;
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesDetallados=jmenuBarDetalleAuxiliarCobrarClientesDetallados;
		final JToolBar jTtoolBarDetalleCobrarClientesDetallados=jTtoolBarDetalleAuxiliarCobrarClientesDetallados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesDetallados;
			processRunnable.jTableDatos=jTableDatosCobrarClientesDetallados;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesDetallados;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesDetallados ,jPanelParametrosReportesCobrarClientesDetallados,jTableDatosCobrarClientesDetallados, /*jScrollPanelDatosCobrarClientesDetallados,*/jPanelCamposCobrarClientesDetallados,jPanelPaginacionCobrarClientesDetallados, /*jScrollPanelDatosEdicionCobrarClientesDetallados,*/ jPanelAccionesCobrarClientesDetallados,jPanelAccionesFormularioCobrarClientesDetallados,jmenuBarCobrarClientesDetallados,jmenuBarDetalleCobrarClientesDetallados,jTtoolBarCobrarClientesDetallados,jTtoolBarDetalleCobrarClientesDetallados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesDetallados ,jPanelParametrosReportesCobrarClientesDetallados, jScrollPanelDatosCobrarClientesDetallados,jPanelPaginacionCobrarClientesDetallados, jScrollPanelDatosEdicionCobrarClientesDetallados, jPanelAccionesCobrarClientesDetallados,jPanelAccionesFormularioCobrarClientesDetallados,jmenuBarCobrarClientesDetallados,jmenuBarDetalleCobrarClientesDetallados,jTtoolBarCobrarClientesDetallados,jTtoolBarDetalleCobrarClientesDetallados);
						
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
	
	public void finishProcessCobrarClientesDetallados() {// throws Exception 
		this.finishProcessCobrarClientesDetallados(true);
	}
	
	public void finishProcessCobrarClientesDetallados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarClientesDetallados ,this.jPanelParametrosReportesCobrarClientesDetallados, this.jScrollPanelDatosCobrarClientesDetallados,this.jPanelPaginacionCobrarClientesDetallados, this.jScrollPanelDatosEdicionCobrarClientesDetallados, this.jPanelAccionesCobrarClientesDetallados,this.jPanelAccionesFormularioCobrarClientesDetallados,this.jmenuBarCobrarClientesDetallados,this.jmenuBarDetalleCobrarClientesDetallados,this.jTtoolBarCobrarClientesDetallados,this.jTtoolBarDetalleCobrarClientesDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesDetallados=this.jTabbedPaneBusquedasCobrarClientesDetallados; 
		
		final JPanel jPanelParametrosReportesCobrarClientesDetallados=this.jPanelParametrosReportesCobrarClientesDetallados;
		//final JScrollPane jScrollPanelDatosCobrarClientesDetallados=this.jScrollPanelDatosCobrarClientesDetallados;
		final JTable jTableDatosCobrarClientesDetallados=this.jTableDatosCobrarClientesDetallados;		
		final JPanel jPanelPaginacionCobrarClientesDetallados=this.jPanelPaginacionCobrarClientesDetallados;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesDetallados=this.jScrollPanelDatosEdicionCobrarClientesDetallados;
		final JPanel jPanelAccionesCobrarClientesDetallados=this.jPanelAccionesCobrarClientesDetallados;
		
		JPanel jPanelCamposAuxiliarCobrarClientesDetallados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesDetallados=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			jPanelCamposAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelCamposCobrarClientesDetallados;
			jPanelAccionesFormularioAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelAccionesFormularioCobrarClientesDetallados;
		}
		
		final JPanel jPanelCamposCobrarClientesDetallados=jPanelCamposAuxiliarCobrarClientesDetallados;
		final JPanel jPanelAccionesFormularioCobrarClientesDetallados=jPanelAccionesFormularioAuxiliarCobrarClientesDetallados;
		
		
		final JMenuBar jmenuBarCobrarClientesDetallados=this.jmenuBarCobrarClientesDetallados;		
		final JToolBar jTtoolBarCobrarClientesDetallados=this.jTtoolBarCobrarClientesDetallados;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesDetallados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jmenuBarDetalleCobrarClientesDetallados;
			jTtoolBarDetalleAuxiliarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jTtoolBarDetalleCobrarClientesDetallados;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesDetallados=jmenuBarDetalleAuxiliarCobrarClientesDetallados;
		final JToolBar jTtoolBarDetalleCobrarClientesDetallados=jTtoolBarDetalleAuxiliarCobrarClientesDetallados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesDetallados;
			processRunnable.jTableDatos=jTableDatosCobrarClientesDetallados;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesDetallados;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarClientesDetallados ,jPanelParametrosReportesCobrarClientesDetallados, jTableDatosCobrarClientesDetallados,/*jScrollPanelDatosCobrarClientesDetallados,*/jPanelCamposCobrarClientesDetallados,jPanelPaginacionCobrarClientesDetallados, /*jScrollPanelDatosEdicionCobrarClientesDetallados,*/ jPanelAccionesCobrarClientesDetallados,jPanelAccionesFormularioCobrarClientesDetallados,jmenuBarCobrarClientesDetallados,jmenuBarDetalleCobrarClientesDetallados,jTtoolBarCobrarClientesDetallados,jTtoolBarDetalleCobrarClientesDetallados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarClientesDetallados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarClientesDetallados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarClientesDetallados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarClientesDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarClientesDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarClientesDetallados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarClientesDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarClientesDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarClientesDetallados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarclientesdetalladosConstantesFunciones.getsFinalQueryCobrarClientesDetallados();
		String  finalQueryPaginacionTodos=this.cobrarclientesdetalladosConstantesFunciones.getsFinalQueryCobrarClientesDetallados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarClientesDetalladosConstantesFunciones.getArrayColumnasGlobalesNoCobrarClientesDetallados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarClientesDetalladosConstantesFunciones.getArrayColumnasGlobalesCobrarClientesDetallados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarClientesDetalladosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarclientesdetalladossEliminados= new ArrayList<CobrarClientesDetallados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarClientesDetallados();
		
				///*CobrarClientesDetalladosSessionBean*/this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean();
			
			if(this.cobrarclientesdetalladosSessionBean==null) {
				this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean();
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
					this.iNumeroPaginacion=CobrarClientesDetalladosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarClientesDetalladosConstantesFunciones.getClassesForeignKeysOfCobrarClientesDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarclientesdetallados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarclientesdetalladossAux= new ArrayList<CobrarClientesDetallados>();
			
				
			cobrarclientesdetalladosLogic.setDatosCliente(this.datosCliente);
			cobrarclientesdetalladosLogic.setDatosDeep(this.datosDeep);
			cobrarclientesdetalladosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarClientesDetallados")) {
				this.sDetalleReporte=CobrarClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesDetallados(idBusquedaCobrarClientesDetallados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarclientesdetalladosLogic.getCobrarClientesDetalladossBusquedaCobrarClientesDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaCobrarClientesDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesDetallados(idBusquedaCobrarClientesDetallados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesDetallados(idBusquedaCobrarClientesDetallados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()==null||cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarclientesdetalladoss==null|| cobrarclientesdetalladoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesdetalladossAux=new ArrayList<CobrarClientesDetallados>();
						cobrarclientesdetalladossAux.addAll(cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesdetalladossAux=new ArrayList<CobrarClientesDetallados>();
							cobrarclientesdetalladossAux.addAll(cobrarclientesdetalladoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarclientesdetalladosLogic.getCobrarClientesDetalladossBusquedaCobrarClientesDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaCobrarClientesDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesDetallados(idBusquedaCobrarClientesDetallados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesDetalladosConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesDetallados(idBusquedaCobrarClientesDetallados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarClientesDetalladoss("BusquedaCobrarClientesDetallados",cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarClientesDetalladoss("BusquedaCobrarClientesDetallados",cobrarclientesdetalladoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesdetalladosLogic.setCobrarClientesDetalladoss(new ArrayList<CobrarClientesDetallados>());
						cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().addAll(cobrarclientesdetalladossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesdetalladoss=new ArrayList<CobrarClientesDetallados>();
							cobrarclientesdetalladoss.addAll(cobrarclientesdetalladossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarClientesDetallados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarClientesDetallados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesdetalladoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesdetalladoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarClientesDetallados cobrarclientesdetallados) {
		Boolean permite=true;
		
		if(this.cobrarclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarClientesDetalladosConstantesFunciones.getOrderByListaCobrarClientesDetallados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarClientesDetalladosConstantesFunciones.getOrderByListaCobrarClientesDetallados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
				if(cobrarclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesdetalladosTotales=cobrarclientesdetallados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesDetallados cobrarclientesdetallados:this.cobrarclientesdetalladoss) {
				if(cobrarclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesdetalladosTotales=cobrarclientesdetallados;
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
			this.cobrarclientesdetalladosAux=new CobrarClientesDetallados();
			this.cobrarclientesdetalladosAux.setsType(Constantes2.S_TOTALES);
			this.cobrarclientesdetalladosAux.setIsNew(false);
			this.cobrarclientesdetalladosAux.setIsChanged(false);
			this.cobrarclientesdetalladosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarClientesDetallados(this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss(),this.cobrarclientesdetalladosAux);
				
				//this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().add(this.cobrarclientesdetalladosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarClientesDetallados(this.cobrarclientesdetalladoss,this.cobrarclientesdetalladosAux);
				
				this.cobrarclientesdetalladoss.add(this.cobrarclientesdetalladosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarclientesdetalladosTotales=new CobrarClientesDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().remove(cobrarclientesdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientesdetalladoss.remove(cobrarclientesdetalladosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarclientesdetalladosTotales=new CobrarClientesDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
				if(cobrarclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesdetalladosTotales=cobrarclientesdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarClientesDetallados(this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss(),cobrarclientesdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesDetallados cobrarclientesdetallados:this.cobrarclientesdetalladoss) {
				if(cobrarclientesdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesdetalladosTotales=cobrarclientesdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesDetalladosConstantesFunciones.TotalizarValoresFilaCobrarClientesDetallados(this.cobrarclientesdetalladoss,cobrarclientesdetalladosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarClientesDetalladossBusquedaCobrarClientesDetallados()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarClientesDetallados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesDetalladossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarClientesDetalladossBusquedaCobrarClientesDetallados(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesdetalladosLogic.getCobrarClientesDetalladossBusquedaCobrarClientesDetallados(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesDetalladossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesdetalladosLogic.getCobrarClientesDetalladossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCobrarClientesDetallados() {
		this.isPermisoTodoCobrarClientesDetallados=false;
		this.isPermisoNuevoCobrarClientesDetallados=false;
		this.isPermisoActualizarCobrarClientesDetallados=false;
		this.isPermisoActualizarOriginalCobrarClientesDetallados=false;
		this.isPermisoEliminarCobrarClientesDetallados=false;
		this.isPermisoGuardarCambiosCobrarClientesDetallados=false;
		this.isPermisoConsultaCobrarClientesDetallados=true;
		this.isPermisoBusquedaCobrarClientesDetallados=true;
		this.isPermisoReporteCobrarClientesDetallados=true;
		this.isPermisoOrdenCobrarClientesDetallados=false;		
		this.isPermisoPaginacionMedioCobrarClientesDetallados=false;		
		this.isPermisoPaginacionAltoCobrarClientesDetallados=false;		
		this.isPermisoPaginacionTodoCobrarClientesDetallados=false;		
		this.isPermisoCopiarCobrarClientesDetallados=false;		
		this.isPermisoVerFormCobrarClientesDetallados=false;		
		this.isPermisoDuplicarCobrarClientesDetallados=false;
		this.isPermisoOrdenCobrarClientesDetallados=false;
	}
	
	public void setPermisosUsuarioCobrarClientesDetallados(Boolean isPermiso) {
		this.isPermisoTodoCobrarClientesDetallados=isPermiso;
		this.isPermisoNuevoCobrarClientesDetallados=isPermiso;
		this.isPermisoActualizarCobrarClientesDetallados=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesDetallados=isPermiso;
		this.isPermisoEliminarCobrarClientesDetallados=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesDetallados=isPermiso;
		this.isPermisoConsultaCobrarClientesDetallados=isPermiso;
		this.isPermisoBusquedaCobrarClientesDetallados=isPermiso;
		this.isPermisoReporteCobrarClientesDetallados=isPermiso;
		this.isPermisoOrdenCobrarClientesDetallados=isPermiso;		
		this.isPermisoPaginacionMedioCobrarClientesDetallados=isPermiso;		
		this.isPermisoPaginacionAltoCobrarClientesDetallados=isPermiso;		
		this.isPermisoPaginacionTodoCobrarClientesDetallados=isPermiso;		
		this.isPermisoCopiarCobrarClientesDetallados=isPermiso;		
		this.isPermisoVerFormCobrarClientesDetallados=isPermiso;		
		this.isPermisoDuplicarCobrarClientesDetallados=isPermiso;
		this.isPermisoOrdenCobrarClientesDetallados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarClientesDetallados(Boolean isPermiso) {
		//this.isPermisoTodoCobrarClientesDetallados=isPermiso;
		this.isPermisoNuevoCobrarClientesDetallados=isPermiso;
		this.isPermisoActualizarCobrarClientesDetallados=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesDetallados=isPermiso;
		this.isPermisoEliminarCobrarClientesDetallados=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesDetallados=isPermiso;
		//this.isPermisoConsultaCobrarClientesDetallados=isPermiso;
		//this.isPermisoBusquedaCobrarClientesDetallados=isPermiso;
		//this.isPermisoReporteCobrarClientesDetallados=isPermiso;
		//this.isPermisoOrdenCobrarClientesDetallados=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarClientesDetallados=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarClientesDetallados=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarClientesDetallados=isPermiso;		
		//this.isPermisoCopiarCobrarClientesDetallados=isPermiso;		
		//this.isPermisoDuplicarCobrarClientesDetallados=isPermiso;
		//this.isPermisoOrdenCobrarClientesDetallados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesDetalladosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarClientesDetallados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesDetalladosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarClientesDetalladosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarClientesDetalladosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarClientesDetalladosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarClientesDetallados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarClientesDetalladosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarClientesDetallados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarClientesDetallados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarClientesDetallados=this.isPermisoActualizarCobrarClientesDetallados;
			this.isPermisoEliminarCobrarClientesDetallados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarClientesDetallados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarClientesDetallados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarClientesDetallados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarClientesDetallados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarClientesDetallados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarClientesDetallados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarClientesDetallados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarClientesDetallados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarClientesDetallados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarClientesDetallados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarClientesDetallados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarClientesDetallados.setToolTipText(this.jTableDatosCobrarClientesDetallados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarClientesDetallados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarClientesDetallados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarClientesDetallados() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarClientesDetalladosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarClientesDetalladosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarClientesDetalladosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarClientesDetallados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarclientesdetalladosSessionBean==null) {
				this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean();
			}

			if(!this.cobrarclientesdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarClientesDetallados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarClientesDetallados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesDetallados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarClientesDetallados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesDetallados()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarClientesDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarClientesDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarClientesDetallados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarClientesDetallados()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarClientesDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarClientesDetallados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public CobrarClientesDetalladosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarClientesDetalladosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarClientesDetalladosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarclientesdetalladosSessionBean=new CobrarClientesDetalladosSessionBean(); 
		this.cobrarclientesdetalladosConstantesFunciones=new CobrarClientesDetalladosConstantesFunciones(); 
		this.cobrarclientesdetalladosBean=new CobrarClientesDetallados();//(this.cobrarclientesdetalladosConstantesFunciones); 		
		this.cobrarclientesdetalladosReturnGeneral=new CobrarClientesDetalladosParameterReturnGeneral(); 
		
		this.cobrarclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarClientesDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarClientesDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarClientesDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarClientesDetallados(true);
			
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
			
			this.cobrarclientesdetalladosConstantesFunciones=new CobrarClientesDetalladosConstantesFunciones(); 
			this.cobrarclientesdetalladosBean=new CobrarClientesDetallados();//this.cobrarclientesdetalladosConstantesFunciones); 			
			this.cobrarclientesdetalladosReturnGeneral=new CobrarClientesDetalladosParameterReturnGeneral(); 
		
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Detallados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cobrarclientesdetallados=new CobrarClientesDetallados();
			this.cobrarclientesdetalladoss = new ArrayList<CobrarClientesDetallados>();
			this.cobrarclientesdetalladossAux = new ArrayList<CobrarClientesDetallados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic=new CobrarClientesDetalladosLogic();
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarclientesdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarclientesdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarClientesDetallados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesDetallados);	
					}
					
					if(this.jInternalFrameImportacionCobrarClientesDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesDetallados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarClientesDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarClientesDetallados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesDetallados);
				this.jInternalFrameDetalleFormCobrarClientesDetallados.setVisible(false);
				this.jInternalFrameDetalleFormCobrarClientesDetallados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesDetallados);
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarClientesDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesDetallados);
					this.jInternalFrameImportacionCobrarClientesDetallados.setVisible(false);
					this.jInternalFrameImportacionCobrarClientesDetallados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarClientesDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesDetallados);
					this.jInternalFrameOrderByCobrarClientesDetallados.setVisible(false);
					this.jInternalFrameOrderByCobrarClientesDetallados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarClientesDetalladosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarClientesDetalladosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarclientesdetalladosReturnGeneral=new CobrarClientesDetalladosParameterReturnGeneral();
			
			this.cobrarclientesdetalladosParameterGeneral=new CobrarClientesDetalladosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarclientesdetalladosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarClientesDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado(),this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado(),this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaCopiarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaVerFormCobrarClientesDetallados=true;
			this.isVisibilidadCeldaOrdenCobrarClientesDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
			
			
			this.isVisibilidadBusquedaCobrarClientesDetallados=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarClientesDetallados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarClientesDetallados(false);
			
			this.setPermisosUsuarioCobrarClientesDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado() && this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarClientesDetalladosClasesRelacionadas();
			}
			
			if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarClientesDetalladosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarClientesDetallados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesDetallados();
			}
			
			if(!this.isPermisoBusquedaCobrarClientesDetallados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarClientesDetallados());
				
				this.tiposColumnasSelect=CobrarClientesDetalladosConstantesFunciones.getTiposSeleccionarCobrarClientesDetallados(true);
				
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
			//if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarClientesDetallados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioCobrarClientesDetallados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioCobrarClientesDetallados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesDetallados() ;
			
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
				cobrarclientesdetalladosImplementable= (CobrarClientesDetalladosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarclientesdetalladosImplementableHome= (CobrarClientesDetalladosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarclientesdetalladoss= new ArrayList<CobrarClientesDetallados>();
			this.cobrarclientesdetalladossEliminados= new ArrayList<CobrarClientesDetallados>();
						
			this.isEsNuevoCobrarClientesDetallados=false;
			this.esParaAccionDesdeFormularioCobrarClientesDetallados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarClientesDetallados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarClientesDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarClientesDetalladosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarClientesDetallados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarClientesDetallados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarClientesDetallados();
			}
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarClientesDetallados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarClientesDetallados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarClientesDetallados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarClientesDetallados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarClientesDetallados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarClientesDetallados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarClientesDetallados")) {
				iIndex=this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarClientesDetallados();	
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
	
	public void cargarCombosForeignKeyCobrarClientesDetallados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarClientesDetallados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarClientesDetallados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarClientesDetalladosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarClientesDetallados();
		
		this.cargarCombosFrameForeignKeyCobrarClientesDetallados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarClientesDetallados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarClientesDetallados();
		}
	}
	
	
	
	public void jButtonNuevoCobrarClientesDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			
			if(jTableDatosCobrarClientesDetallados.getRowCount()>=1) {
				jTableDatosCobrarClientesDetallados.removeRowSelectionInterval(0, jTableDatosCobrarClientesDetallados.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarClientesDetallados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarClientesDetallados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarClientesDetallados(true);			
			//this.cobrarclientesdetallados=new CobrarClientesDetallados();
			//this.cobrarclientesdetallados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados() ;
			
			if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesDetallados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarclientesdetallados);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);				
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarClientesDetallados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarClientesDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarClientesDetallados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesDetallados.getSelectedRows().length;			
			}
			
			cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarClientesDetallados--;			
				//CobrarClientesDetallados cobrarclientesdetalladosAux= new CobrarClientesDetallados();			
				//cobrarclientesdetalladosAux.setId(this.iIdNuevoCobrarClientesDetallados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarClientesDetallados cobrarclientesdetalladosOrigen=new CobrarClientesDetallados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarClientesDetallados cobrarclientesdetalladosOrigen : cobrarclientesdetalladossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarclientesdetalladosOrigen =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesdetalladosOrigen =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarClientesDetallados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarclientesdetallados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarClientesDetallados(cobrarclientesdetalladosOrigen,this.cobrarclientesdetallados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().add(this.cobrarclientesdetalladosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetalladoss.add(this.cobrarclientesdetalladosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
				
				this.jTableDatosCobrarClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesDetallados(), this.getIndiceNuevoCobrarClientesDetallados());
				
				int iLastRow =  this.jTableDatosCobrarClientesDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();									
		
			CobrarClientesDetallados cobrarclientesdetalladosOrigen=new CobrarClientesDetallados();
			CobrarClientesDetallados cobrarclientesdetalladosDestino=new CobrarClientesDetallados();
				
			cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesDetallados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarclientesdetalladossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarClientesDetallados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesdetalladosOrigen =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientesdetalladosOrigen =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesdetalladosDestino =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientesdetalladosDestino =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarclientesdetalladosOrigen =cobrarclientesdetalladossSeleccionados.get(0);
				cobrarclientesdetalladosDestino =cobrarclientesdetalladossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarClientesDetallados(cobrarclientesdetalladosOrigen,cobrarclientesdetalladosDestino,true,false);
				
				cobrarclientesdetalladosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarclientesdetalladosDestino,cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarclientesdetalladosDestino,cobrarclientesdetalladoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
				
				//this.jTableDatosCobrarClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesDetallados(), this.getIndiceNuevoCobrarClientesDetallados());
				
				int iLastRow =  this.jTableDatosCobrarClientesDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarClientesDetallados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(!isVisible);
			this.jPanelPaginacionCobrarClientesDetallados.setVisible(!isVisible);
			this.jPanelAccionesCobrarClientesDetallados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarClientesDetallados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarClientesDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarClientesDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarClientesDetallados();
			
			this.abrirFrameOrderByCobrarClientesDetallados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarClientesDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarClientesDetallados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesDetallados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarClientesDetallados.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarClientesDetallados.setSize(this.jInternalFrameDetalleFormCobrarClientesDetallados.iWidthFormulario,this.jInternalFrameDetalleFormCobrarClientesDetallados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarClientesDetallados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarClientesDetallados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarClientesDetallados.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarClientesDetallados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesDetallados.jContentPaneDetalleCobrarClientesDetallados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesDetallados.jContentPaneDetalleCobrarClientesDetallados.getWidth(),CobrarClientesDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesDetallados.jContentPaneDetalleCobrarClientesDetallados.getWidth(),CobrarClientesDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesDetallados.jContentPaneDetalleCobrarClientesDetallados.getWidth(),CobrarClientesDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarClientesDetallados.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarClientesDetallados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarClientesDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarClientesDetallados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesDetallados,false,this);
				} else {
					this.jInternalFrameOrderByCobrarClientesDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesDetallados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesDetallados);
				this.jInternalFrameOrderByCobrarClientesDetallados.setVisible(false);
				this.jInternalFrameOrderByCobrarClientesDetallados.setSelected(false);
				
				this.jInternalFrameOrderByCobrarClientesDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesDetallados"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarClientesDetallados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarClientesDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarClientesDetallados==null) {
				
				this.jInternalFrameImportacionCobrarClientesDetallados=new ImportacionJInternalFrame(CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesDetallados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesDetallados);
				this.jInternalFrameImportacionCobrarClientesDetallados.setVisible(false);
				this.jInternalFrameImportacionCobrarClientesDetallados.setSelected(false);


				this.jInternalFrameImportacionCobrarClientesDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesDetallados"));
				this.jInternalFrameImportacionCobrarClientesDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesDetallados"));
				this.jInternalFrameImportacionCobrarClientesDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesDetallados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarClientesDetallados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados==null) {
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados=new ReporteDinamicoJInternalFrame(CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesDetallados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesDetallados);
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesDetallados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesDetallados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarClientesDetallados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesDetallados);
			
	       	this.jInternalFrameDetalleFormCobrarClientesDetallados.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarClientesDetallados.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarClientesDetallados.dispose();
			//this.jInternalFrameDetalleFormCobrarClientesDetallados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarClientesDetallados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarClientesDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarClientesDetallados.setVisible(true);
	        this.jInternalFrameImportacionCobrarClientesDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarClientesDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarClientesDetallados.setVisible(true);
	        this.jInternalFrameOrderByCobrarClientesDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarClientesDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarClientesDetallados.setVisible(false);
	        this.jInternalFrameOrderByCobrarClientesDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarClientesDetallados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarClientesDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarClientesDetallados.setVisible(false);
	        this.jInternalFrameImportacionCobrarClientesDetallados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarClientesDetallados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarClientesDetallados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarClientesDetallados(true);
			//this.isEsNuevoCobrarClientesDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false) ;
			
			if(cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesDetallados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarClientesDetalladosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarClientesDetallados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarClientesDetallados(true);
			//this.isEsNuevoCobrarClientesDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarclientesdetallados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false) ;
			
			if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesDetallados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesDetallados(false);
			
			//if(!this.isEsNuevoCobrarClientesDetallados) {								
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarclientesdetallados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarClientesDetallados=true;
					this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
					this.isEsNuevoCobrarClientesDetallados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarClientesDetallados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarClientesDetallados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesDetallados(false);
			
												
				
				if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarClientesDetallados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,cobrarclientesdetalladosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarClientesDetallados(this.cobrarclientesdetallados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarClientesDetallados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarclientesdetalladosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarclientesdetallados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientesdetallados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientesdetallados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarclientesdetallados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarClientesDetalladosModel) this.jTableDatosCobrarClientesDetallados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarClientesDetallados=true;
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
				this.isEsNuevoCobrarClientesDetallados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesDetallados(false);
				
				
				
				if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarClientesDetallados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarClientesDetallados.getRowCount()>=1) {
				jTableDatosCobrarClientesDetallados.removeRowSelectionInterval(0, jTableDatosCobrarClientesDetallados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarClientesDetallados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(false) ;
			
			this.isEsNuevoCobrarClientesDetallados=false;
			
			if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarClientesDetallados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarClientesDetallados(false);
				
				//SI ES MANUAL
				if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarClientesDetallados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarClientesDetallados--;			
			//CobrarClientesDetallados cobrarclientesdetalladosAux= new CobrarClientesDetallados();			
			//cobrarclientesdetalladosAux.setId(this.iIdNuevoCobrarClientesDetallados);
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarClientesDetallados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
			
			this.cobrarclientesdetallados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().add(this.cobrarclientesdetalladosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarclientesdetalladoss.add(this.cobrarclientesdetalladosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			
			this.jTableDatosCobrarClientesDetallados.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesDetallados(), this.getIndiceNuevoCobrarClientesDetallados());
			
			int iLastRow =  this.jTableDatosCobrarClientesDetallados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarClientesDetallados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarClientesDetallados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesDetallados();
			}
			
			//this.abrirFrameTreeCobrarClientesDetallados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarClientesDetallados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarClientesDetallados.setFileImportacion(this.jInternalFrameImportacionCobrarClientesDetallados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarClientesDetallados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarClientesDetallados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarClientesDetallados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarClientesDetallados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		

		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarClientesDetalladosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarClientesDetalladosBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGrupoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGrupoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGrupoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGrupoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTituloCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTituloCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTituloCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTituloCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreContactoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreContactoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreContactoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreContactoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ailEMail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ailEMail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ailEMail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ailEMail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoria="nombre_grupo_cliente";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					sNombreCampoCategoria="nombre_titulo_cliente";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE:
					sNombreCampoCategoria="nombre_contacto_cliente";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoria="direccion_direccion";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL:
					sNombreCampoCategoria="e_mail_e_mail";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					sNombreCampoCategoriaValor="nombre_grupo_cliente";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					sNombreCampoCategoriaValor="nombre_titulo_cliente";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE:
					sNombreCampoCategoriaValor="nombre_contacto_cliente";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoriaValor="direccion_direccion";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL:
					sNombreCampoCategoriaValor="e_mail_e_mail";
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Grupo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_grupo_cliente");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Titulo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_titulo_cliente");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Contacto Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_contacto_cliente");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_direccion");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"E Mail E Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"e_mail_e_mail");
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarClientesDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getnombre_grupo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getnombre_titulo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getnombre_contacto_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.getdireccion_direccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.gete_mail_e_mail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarClientesDetallados cobrarclientesdetallados:cobrarclientesdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesdetallados.gettelefono_telefono());
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
			//	this.getFilaCabeceraExportarExcelCobrarClientesDetallados(row);				
			//	iRow++;
			//}				
			
			//for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarClientesDetallados(cobrarclientesdetalladosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesDetallados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesDetallados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
			
			//SI ES MANUAL
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesDetallados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarClientesDetallados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarClientesDetallados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarClientesDetallados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarClientesDetallados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarClientesDetallados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarClientesDetallados.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarClientesDetallados.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarClientesDetallados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarClientesDetallados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarClientesDetallados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarClientesDetallados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarClientesDetallados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarClientesDetallados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarClientesDetallados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesDetallados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesDetallados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarClientesDetallados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarClientesDetallados();
		
		this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesDetallados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesDetallados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesDetallados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesDetallados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarClientesDetallados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarClientesDetallados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarClientesDetallados.jCheckBoxPostAccionNuevoCobrarClientesDetallados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarClientesDetallados.jCheckBoxPostAccionSinCerrarCobrarClientesDetallados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarClientesDetallados.jCheckBoxPostAccionSinMensajeCobrarClientesDetallados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarClientesDetallados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarClientesDetallados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
				this.jInternalFrameDetalleFormCobrarClientesDetallados.jCheckBoxPostAccionNuevoCobrarClientesDetallados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarClientesDetallados.jCheckBoxPostAccionSinCerrarCobrarClientesDetallados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarClientesDetallados.jCheckBoxPostAccionSinMensajeCobrarClientesDetallados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarClientesDetallados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarClientesDetallados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarClientesDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarClientesDetallados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarClientesDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarClientesDetallados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarClientesDetallados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarClientesDetallados(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesDetallados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesDetallados() throws Exception {
		try	{
			if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesDetallados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesDetallados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesDetallados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarClientesDetallados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarClientesDetallados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarClientesDetallados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarClientesDetallados.addItem(reporte);
			}
			
			
			if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarClientesDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarClientesDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarClientesDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarClientesDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarClientesDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarClientesDetallados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarClientesDetallados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesDetallados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesDetallados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarClientesDetallados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaCobrarClientesDetallados=Long.parseLong(this.jLabelidCobrarClientesDetalladosBusquedaCobrarClientesDetallados.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarClientesDetallados(Boolean esInicializar) throws Exception {				
		if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesDetallados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarClientesDetallados() throws Exception {
		this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarClientesDetallados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarClientesDetalladosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetalladosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarClientesDetallados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarclientesdetalladoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarClientesDetallados.setModel(new CobrarClientesDetalladosModel(this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarClientesDetallados.setModel(new CobrarClientesDetalladosModel(this.cobrarclientesdetalladoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarClientesDetallados!=null && this.jInternalFrameOrderByCobrarClientesDetallados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarClientesDetallados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,cobrarclientesdetalladosConstantesFunciones.resaltarSeleccionarCobrarClientesDetallados,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarClientesDetalladosConstantesFunciones.SCLASSWEBTITULO,cobrarclientesdetalladosConstantesFunciones.resaltarSeleccionarCobrarClientesDetallados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_ciudadCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_ciudadCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_ciudadCobrarClientesDetallados,this,true,"nombre_ciudadCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_ciudadCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_ciudadCobrarClientesDetallados,this,true,"nombre_ciudadCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_zonaCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_zonaCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_zonaCobrarClientesDetallados,this,true,"nombre_zonaCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_zonaCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_zonaCobrarClientesDetallados,this,true,"nombre_zonaCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_grupo_clienteCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_grupo_clienteCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_grupo_clienteCobrarClientesDetallados,this,true,"nombre_grupo_clienteCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_grupo_clienteCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_grupo_clienteCobrarClientesDetallados,this,true,"nombre_grupo_clienteCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_titulo_clienteCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_titulo_clienteCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_titulo_clienteCobrarClientesDetallados,this,true,"nombre_titulo_clienteCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_titulo_clienteCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_titulo_clienteCobrarClientesDetallados,this,true,"nombre_titulo_clienteCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarcodigoCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarcodigoCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarcodigoCobrarClientesDetallados,this,true,"codigoCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarcodigoCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarcodigoCobrarClientesDetallados,this,true,"codigoCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombreCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombreCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombreCobrarClientesDetallados,this,true,"nombreCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombreCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombreCobrarClientesDetallados,this,true,"nombreCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarapellidoCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarapellidoCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarapellidoCobrarClientesDetallados,this,true,"apellidoCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarapellidoCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarapellidoCobrarClientesDetallados,this,true,"apellidoCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_RUC));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarrucCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarrucCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarrucCobrarClientesDetallados,this,true,"rucCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarrucCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarrucCobrarClientesDetallados,this,true,"rucCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_contacto_clienteCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_contacto_clienteCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_contacto_clienteCobrarClientesDetallados,this,true,"nombre_contacto_clienteCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_contacto_clienteCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activarnombre_contacto_clienteCobrarClientesDetallados,this,true,"nombre_contacto_clienteCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrardireccion_direccionCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltardireccion_direccionCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activardireccion_direccionCobrarClientesDetallados,this,true,"direccion_direccionCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltardireccion_direccionCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activardireccion_direccionCobrarClientesDetallados,this,true,"direccion_direccionCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrare_mail_e_mailCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltare_mail_e_mailCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activare_mail_e_mailCobrarClientesDetallados,this,true,"e_mail_e_mailCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltare_mail_e_mailCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activare_mail_e_mailCobrarClientesDetallados,this,true,"e_mail_e_mailCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarclientesdetalladosConstantesFunciones.mostrartelefono_telefonoCobrarClientesDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltartelefono_telefonoCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activartelefono_telefonoCobrarClientesDetallados,this,true,"telefono_telefonoCobrarClientesDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesdetalladosConstantesFunciones.resaltartelefono_telefonoCobrarClientesDetallados,this.cobrarclientesdetalladosConstantesFunciones.activartelefono_telefonoCobrarClientesDetallados,this,true,"telefono_telefonoCobrarClientesDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesDetallados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesDetallados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarClientesDetallados.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarClientesDetallados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarClientesDetallados.moveColumn(this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarClientesDetallados.moveColumn(this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarClientesDetallados.moveColumn(this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarClientesDetallados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarClientesDetallados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarClientesDetallados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarClientesDetallados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarClientesDetallados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarClientesDetallados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarclientesdetalladoss.size()-1;
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
		//this.jTableDatosCobrarClientesDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarClientesDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarClientesDetallados();
			
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
				
				//this.isEsNuevoCobrarClientesDetallados=false;
					
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
				if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesDetallados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarclientesdetallados.getsType().equals("DUPLICADO")
				   || this.cobrarclientesdetallados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarClientesDetallados=true;
				
				} else {
					this.isEsNuevoCobrarClientesDetallados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarclientesdetallados.getId()>=0 && !this.cobrarclientesdetallados.getIsNew()) {						
						this.isEsNuevoCobrarClientesDetallados=false;
						
					} else {
						this.isEsNuevoCobrarClientesDetallados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarClientesDetallados(esRelaciones);						
				
				this.seleccionarCobrarClientesDetallados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarclientesdetallados.getId()<0) {
					this.isEsNuevoCobrarClientesDetallados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarClientesDetallados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarClientesDetallados(evt,rowIndex);
				}	
				
				if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarClientesDetallados: " + this.dDif); 
					}
				}								
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarClientesDetallados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarclientesdetallados)) {
					if(this.cobrarclientesdetallados.getId()>0) {
						this.cobrarclientesdetallados.setIsDeleted(true);
						
						this.cobrarclientesdetalladossEliminados.add(this.cobrarclientesdetallados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().remove(this.cobrarclientesdetallados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetalladoss.remove(this.cobrarclientesdetallados);				
					}
					
					
					((CobrarClientesDetalladosModel) this.jTableDatosCobrarClientesDetallados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarClientesDetallados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarClientesDetallados) {
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesDetallados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetallados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarClientesDetallados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarClientesDetallados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarClientesDetallados(cobrarclientesdetallados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarClientesDetallados(cobrarclientesdetallados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarClientesDetallados(cobrarclientesdetallados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesDetallados(cobrarclientesdetallados);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_titulo_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setText(cobrarclientesdetallados.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setText(cobrarclientesdetallados.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setText(cobrarclientesdetallados.getruc());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_contacto_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setText(cobrarclientesdetallados.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setText(cobrarclientesdetallados.gete_mail_e_mail());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setText(cobrarclientesdetallados.gettelefono_telefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarClientesDetallados cobrarclientesdetalladosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarclientesdetalladosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarClientesDetallados cobrarclientesdetalladosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarclientesdetalladosLocal=this.cobrarclientesdetallados;
			} else {
				cobrarclientesdetalladosLocal=this.cobrarclientesdetalladosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarclientesdetalladosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarClientesDetallados(cobrarclientesdetalladosLocal,true);
					
					if(cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarclientesdetalladosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarclientesdetalladosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(cobrarclientesdetallados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(cobrarclientesdetallados);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(cobrarclientesdetallados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			cobrarclientesdetallados.setnombre_ciudad(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_ciudadCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setnombre_zona(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_zonaCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setnombre_grupo_cliente(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_grupo_clienteCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setnombre_titulo_cliente(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_titulo_clienteCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setcodigo(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelcodigoCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setnombre(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombreCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setapellido(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelapellidoCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setruc(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelrucCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setnombre_contacto_cliente(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelnombre_contacto_clienteCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.setdireccion_direccion(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabeldireccion_direccionCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.sete_mail_e_mail(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabele_mail_e_mailCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesdetallados.settelefono_telefono(this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabeltelefono_telefonoCobrarClientesDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetalladosBean,CobrarClientesDetallados cobrarclientesdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetalladosOrigen,CobrarClientesDetallados cobrarclientesdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getId()!=null && !cobrarclientesdetalladosOrigen.getId().equals(0L))) {cobrarclientesdetallados.setId(cobrarclientesdetalladosOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getnombre_ciudad()!=null && !cobrarclientesdetalladosOrigen.getnombre_ciudad().equals(""))) {cobrarclientesdetallados.setnombre_ciudad(cobrarclientesdetalladosOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getnombre_zona()!=null && !cobrarclientesdetalladosOrigen.getnombre_zona().equals(""))) {cobrarclientesdetallados.setnombre_zona(cobrarclientesdetalladosOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getnombre_grupo_cliente()!=null && !cobrarclientesdetalladosOrigen.getnombre_grupo_cliente().equals(""))) {cobrarclientesdetallados.setnombre_grupo_cliente(cobrarclientesdetalladosOrigen.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getnombre_titulo_cliente()!=null && !cobrarclientesdetalladosOrigen.getnombre_titulo_cliente().equals(""))) {cobrarclientesdetallados.setnombre_titulo_cliente(cobrarclientesdetalladosOrigen.getnombre_titulo_cliente());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getcodigo()!=null && !cobrarclientesdetalladosOrigen.getcodigo().equals(""))) {cobrarclientesdetallados.setcodigo(cobrarclientesdetalladosOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getnombre()!=null && !cobrarclientesdetalladosOrigen.getnombre().equals(""))) {cobrarclientesdetallados.setnombre(cobrarclientesdetalladosOrigen.getnombre());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getapellido()!=null && !cobrarclientesdetalladosOrigen.getapellido().equals(""))) {cobrarclientesdetallados.setapellido(cobrarclientesdetalladosOrigen.getapellido());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getruc()!=null && !cobrarclientesdetalladosOrigen.getruc().equals(""))) {cobrarclientesdetallados.setruc(cobrarclientesdetalladosOrigen.getruc());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getnombre_contacto_cliente()!=null && !cobrarclientesdetalladosOrigen.getnombre_contacto_cliente().equals(""))) {cobrarclientesdetallados.setnombre_contacto_cliente(cobrarclientesdetalladosOrigen.getnombre_contacto_cliente());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.getdireccion_direccion()!=null && !cobrarclientesdetalladosOrigen.getdireccion_direccion().equals(""))) {cobrarclientesdetallados.setdireccion_direccion(cobrarclientesdetalladosOrigen.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.gete_mail_e_mail()!=null && !cobrarclientesdetalladosOrigen.gete_mail_e_mail().equals(""))) {cobrarclientesdetallados.sete_mail_e_mail(cobrarclientesdetalladosOrigen.gete_mail_e_mail());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosOrigen.gettelefono_telefono()!=null && !cobrarclientesdetalladosOrigen.gettelefono_telefono().equals(""))) {cobrarclientesdetallados.settelefono_telefono(cobrarclientesdetalladosOrigen.gettelefono_telefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_titulo_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setText(cobrarclientesdetallados.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setText(cobrarclientesdetallados.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setText(cobrarclientesdetallados.getruc());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setText(cobrarclientesdetallados.getnombre_contacto_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setText(cobrarclientesdetallados.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setText(cobrarclientesdetallados.gete_mail_e_mail());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setText(cobrarclientesdetallados.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesDetallados(CobrarClientesDetalladosBean cobrarclientesdetalladosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getnombre_grupo_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getnombre_titulo_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getruc());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getnombre_contacto_cliente());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.gete_mail_e_mail());
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setText(cobrarclientesdetalladosBean.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarClientesDetallados(CobrarClientesDetalladosParameterReturnGeneral cobrarclientesdetalladosReturnGeneral,CobrarClientesDetalladosBean cobrarclientesdetalladosBean,Boolean conDefault) throws Exception { 
		try {
			CobrarClientesDetallados cobrarclientesdetalladosLocal=new CobrarClientesDetallados();
			
			cobrarclientesdetalladosLocal=cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados();
			
			
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getnombre_ciudad()!=null && !cobrarclientesdetalladosLocal.getnombre_ciudad().equals(""))) {cobrarclientesdetalladosBean.setnombre_ciudad(cobrarclientesdetalladosLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getnombre_zona()!=null && !cobrarclientesdetalladosLocal.getnombre_zona().equals(""))) {cobrarclientesdetalladosBean.setnombre_zona(cobrarclientesdetalladosLocal.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getnombre_grupo_cliente()!=null && !cobrarclientesdetalladosLocal.getnombre_grupo_cliente().equals(""))) {cobrarclientesdetalladosBean.setnombre_grupo_cliente(cobrarclientesdetalladosLocal.getnombre_grupo_cliente());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getnombre_titulo_cliente()!=null && !cobrarclientesdetalladosLocal.getnombre_titulo_cliente().equals(""))) {cobrarclientesdetalladosBean.setnombre_titulo_cliente(cobrarclientesdetalladosLocal.getnombre_titulo_cliente());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getcodigo()!=null && !cobrarclientesdetalladosLocal.getcodigo().equals(""))) {cobrarclientesdetalladosBean.setcodigo(cobrarclientesdetalladosLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getnombre()!=null && !cobrarclientesdetalladosLocal.getnombre().equals(""))) {cobrarclientesdetalladosBean.setnombre(cobrarclientesdetalladosLocal.getnombre());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getapellido()!=null && !cobrarclientesdetalladosLocal.getapellido().equals(""))) {cobrarclientesdetalladosBean.setapellido(cobrarclientesdetalladosLocal.getapellido());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getruc()!=null && !cobrarclientesdetalladosLocal.getruc().equals(""))) {cobrarclientesdetalladosBean.setruc(cobrarclientesdetalladosLocal.getruc());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getnombre_contacto_cliente()!=null && !cobrarclientesdetalladosLocal.getnombre_contacto_cliente().equals(""))) {cobrarclientesdetalladosBean.setnombre_contacto_cliente(cobrarclientesdetalladosLocal.getnombre_contacto_cliente());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.getdireccion_direccion()!=null && !cobrarclientesdetalladosLocal.getdireccion_direccion().equals(""))) {cobrarclientesdetalladosBean.setdireccion_direccion(cobrarclientesdetalladosLocal.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.gete_mail_e_mail()!=null && !cobrarclientesdetalladosLocal.gete_mail_e_mail().equals(""))) {cobrarclientesdetalladosBean.sete_mail_e_mail(cobrarclientesdetalladosLocal.gete_mail_e_mail());}
			if(conDefault || (!conDefault && cobrarclientesdetalladosLocal.gettelefono_telefono()!=null && !cobrarclientesdetalladosLocal.gettelefono_telefono().equals(""))) {cobrarclientesdetalladosBean.settelefono_telefono(cobrarclientesdetalladosLocal.gettelefono_telefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarClientesDetalladosGenerico(Long idCobrarClientesDetalladosSeleccionado,JComboBox jComboBoxCobrarClientesDetallados,List<CobrarClientesDetallados> cobrarclientesdetalladossLocal)throws Exception {
		try {
			CobrarClientesDetallados  cobrarclientesdetalladosTemp=null;

			for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossLocal) {
				if(cobrarclientesdetalladosAux.getId()!=null && cobrarclientesdetalladosAux.getId().equals(idCobrarClientesDetalladosSeleccionado)) {
					cobrarclientesdetalladosTemp=cobrarclientesdetalladosAux;
					break;
				}
			}

			jComboBoxCobrarClientesDetallados.setSelectedItem(cobrarclientesdetalladosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarClientesDetalladosGenerico(JComboBox jComboBoxCobrarClientesDetallados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesDetallados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarClientesDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesDetallados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarClientesDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarClientesDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarClientesDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesdetallados=(CobrarClientesDetallados) cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientesdetallados =(CobrarClientesDetallados) cobrarclientesdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarclientesdetallados.getIsNew() && !cobrarclientesdetallados.getIsChanged() && !cobrarclientesdetallados.getIsDeleted()) {
				sDescripcion=cobrarclientesdetallados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesdetallados.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarClientesDetallados cobrarclientesdetalladosRow=new CobrarClientesDetallados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesdetalladosRow=(CobrarClientesDetallados) cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientesdetalladosRow=(CobrarClientesDetallados) cobrarclientesdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarClientesDetallados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados));			
			this.jButtonDuplicarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesDetallados && this.isPermisoDuplicarCobrarClientesDetallados));			
			this.jButtonCopiarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesDetallados && this.isPermisoCopiarCobrarClientesDetallados));
			this.jButtonVerFormCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesDetallados && this.isPermisoVerFormCobrarClientesDetallados));
			
			this.jButtonAbrirOrderByCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesDetallados && this.isPermisoOrdenCobrarClientesDetallados));			
			
			this.jButtonNuevoRelacionesCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados));			
			this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaModificarCobrarClientesDetallados && this.isPermisoActualizarCobrarClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesDetallados && this.isPermisoActualizarCobrarClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesDetallados && this.isPermisoEliminarCobrarClientesDetallados));
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarCobrarClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesDetallados);							
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados));						
			this.jButtonDuplicarToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesDetallados && this.isPermisoDuplicarCobrarClientesDetallados));						
			this.jButtonCopiarToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesDetallados && this.isPermisoCopiarCobrarClientesDetallados));			
			this.jButtonVerFormToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesDetallados && this.isPermisoVerFormCobrarClientesDetallados));			
			this.jButtonAbrirOrderByToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesDetallados && this.isPermisoOrdenCobrarClientesDetallados));
			this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));			
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaModificarCobrarClientesDetallados && this.isPermisoActualizarCobrarClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesDetallados  && this.isPermisoActualizarCobrarClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesDetallados && this.isPermisoEliminarCobrarClientesDetallados));
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarToolBarCobrarClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesDetallados);				
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados));			
			this.jMenuItemDuplicarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesDetallados && this.isPermisoDuplicarCobrarClientesDetallados));			
			this.jMenuItemCopiarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesDetallados && this.isPermisoCopiarCobrarClientesDetallados));			
			this.jMenuItemVerFormCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesDetallados && this.isPermisoVerFormCobrarClientesDetallados));			
			this.jMenuItemAbrirOrderByCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesDetallados && this.isPermisoOrdenCobrarClientesDetallados));			
			//this.jMenuItemMostrarOcultarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesDetallados && this.isPermisoOrdenCobrarClientesDetallados));
			this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesDetallados && this.isPermisoOrdenCobrarClientesDetallados));			
			//this.jMenuItemDetalleMostrarOcultarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesDetallados && this.isPermisoOrdenCobrarClientesDetallados));			
			this.jMenuItemNuevoRelacionesCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados));			
			this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesDetallados && this.isPermisoNuevoCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));									
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemModificarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaModificarCobrarClientesDetallados && this.isPermisoActualizarCobrarClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemActualizarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesDetallados && this.isPermisoActualizarCobrarClientesDetallados));	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemEliminarCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesDetallados && this.isPermisoEliminarCobrarClientesDetallados));
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemCancelarCobrarClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesDetallados);				
			}
			
			this.jMenuItemGuardarCambiosCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));						
			this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=this.jButtonNuevoCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarClientesDetallados=this.jButtonDuplicarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaCopiarCobrarClientesDetallados=this.jButtonCopiarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaVerFormCobrarClientesDetallados=this.jButtonVerFormCobrarClientesDetallados.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarClientesDetallados=this.jButtonAbrirOrderByCobrarClientesDetallados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=this.jButtonNuevoRelacionesCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=this.jButtonModificarCobrarClientesDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=this.jButtonGuardarCambiosTablaCobrarClientesDetallados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=this.jButtonNuevoToolBarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarToolBarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarToolBarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarToolBarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarToolBarCobrarClientesDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesDetallados=this.jButtonGuardarCambiosToolBarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=this.jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=this.jMenuItemNuevoCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=this.jMenuItemNuevoRelacionesCobrarClientesDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemModificarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemActualizarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemEliminarCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemCancelarCobrarClientesDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesDetallados=this.jMenuItemGuardarCambiosCobrarClientesDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarClientesDetallados(Boolean esInicializar) {
		if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesDetallados();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarClientesDetallados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarClientesDetallados() {
		this.jButtonNuevoCobrarClientesDetallados.setVisible(this.isPermisoNuevoCobrarClientesDetallados);			
		this.jButtonDuplicarCobrarClientesDetallados.setVisible(this.isPermisoDuplicarCobrarClientesDetallados);			
		this.jButtonCopiarCobrarClientesDetallados.setVisible(this.isPermisoCopiarCobrarClientesDetallados);			
		this.jButtonVerFormCobrarClientesDetallados.setVisible(this.isPermisoVerFormCobrarClientesDetallados);			
		
		this.jButtonAbrirOrderByCobrarClientesDetallados.setVisible(this.isPermisoOrdenCobrarClientesDetallados);					
		
		this.jButtonNuevoRelacionesCobrarClientesDetallados.setVisible(this.isPermisoNuevoCobrarClientesDetallados);			
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarCobrarClientesDetallados.setVisible(this.isPermisoActualizarCobrarClientesDetallados);	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarCobrarClientesDetallados.setVisible(this.isPermisoActualizarCobrarClientesDetallados);	
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarCobrarClientesDetallados.setVisible(this.isPermisoEliminarCobrarClientesDetallados);
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarCobrarClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesDetallados);						
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.setVisible(this.isPermisoGuardarCambiosCobrarClientesDetallados);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.setVisible(this.isPermisoActualizarCobrarClientesDetallados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesDetallados() {
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarCobrarClientesDetallados.setVisible(this.isPermisoActualizarCobrarClientesDetallados);	
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarCobrarClientesDetallados.setVisible(this.isPermisoActualizarCobrarClientesDetallados);	
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarCobrarClientesDetallados.setVisible(this.isPermisoEliminarCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarCobrarClientesDetallados.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesDetallados);							
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesDetallados && this.isPermisoGuardarCambiosCobrarClientesDetallados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarClientesDetallados() {
		if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesDetallados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarClientesDetallados() {
	}
	
	public void jTableDatosCobrarClientesDetalladosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarClientesDetallados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarclientesdetallados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarClientesDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarClientesDetallados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarclientesdetalladosLogic.getConnexion());

				if(this.cobrarclientesdetallados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarclientesdetallados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesDetallados=(TitledBorder)this.jScrollPanelDatosCobrarClientesDetallados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarClientesDetallados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarclientesdetallados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.cobrarclientesdetallados.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.cobrarclientesdetallados.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_grupo_clienteCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getnombre_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_grupo_cliente like '%"+this.cobrarclientesdetallados.getnombre_grupo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_titulo_clienteCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getnombre_titulo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_titulo_cliente like '%"+this.cobrarclientesdetallados.getnombre_titulo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarclientesdetallados.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrarclientesdetallados.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cobrarclientesdetallados.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.cobrarclientesdetallados.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_contacto_clienteCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getnombre_contacto_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_contacto_cliente like '%"+this.cobrarclientesdetallados.getnombre_contacto_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_direccionCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.getdireccion_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_direccion like '%"+this.cobrarclientesdetallados.getdireccion_direccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtone_mail_e_mailCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.gete_mail_e_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where e_mail_e_mail like '%"+this.cobrarclientesdetallados.gete_mail_e_mail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarClientesDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.getcobrarclientesdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesdetallados==null) {
						this.cobrarclientesdetallados = new CobrarClientesDetallados();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);
				}

				if(this.cobrarclientesdetallados.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarclientesdetallados.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);

			this.getCobrarClientesDetalladossBusquedaCobrarClientesDetallados();

			this.inicializarActualizarBindingCobrarClientesDetallados(false);

			//if(CobrarClientesDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarClientesDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);

			this.getCobrarClientesDetalladossFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarClientesDetallados(false);

			//if(CobrarClientesDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarClientesDetallados() {
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.dispose();
			this.jInternalFrameDetalleFormCobrarClientesDetallados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
			this.jInternalFrameReporteDinamicoCobrarClientesDetallados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarClientesDetallados.dispose();
			this.jInternalFrameReporteDinamicoCobrarClientesDetallados=null;
		}
		
		if(this.jInternalFrameImportacionCobrarClientesDetallados!=null) {
			this.jInternalFrameImportacionCobrarClientesDetallados.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarClientesDetallados.dispose();
			this.jInternalFrameImportacionCobrarClientesDetallados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarClientesDetallados();
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarClientesDetallados")) {
				jButtonDuplicarCobrarClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarClientesDetallados")) {
				jButtonCopiarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarClientesDetallados")) {
				jButtonVerFormCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarClientesDetallados")) {
				jButtonDuplicarCobrarClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarClientesDetallados")) {
				jButtonDuplicarCobrarClientesDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarClientesDetallados")) {
				jButtonModificarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarClientesDetallados")) {
				jButtonModificarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarClientesDetallados")) {
				jButtonModificarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarClientesDetallados")) {
				jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarClientesDetallados")) {
				jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarClientesDetallados")) {
				jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarClientesDetallados")) {
				jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarClientesDetallados")) {
				jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarClientesDetallados")) {
				jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarClientesDetallados")) {
				jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarClientesDetallados")) {
				jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarClientesDetallados")) {
				jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarClientesDetallados")) {
				jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarClientesDetallados")) {
				jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarClientesDetallados")) {
				jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarClientesDetallados")) {
				jButtonMostrarOcultarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarClientesDetallados")) {
				jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarClientesDetallados")) {
				jButtonCopiarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarClientesDetallados")) {
				jButtonVerFormCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarClientesDetallados")) {
				jButtonCopiarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarClientesDetallados")) {
				jButtonVerFormCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarClientesDetallados")) {
				jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarClientesDetallados")) {
				jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarClientesDetallados")) {
				jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarClientesDetallados")) {
				jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarClientesDetallados")) {
				jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarClientesDetallados")) {
				jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarClientesDetallados")) {
				jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarClientesDetallados")) {
				jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarClientesDetallados")) {
				jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarClientesDetallados") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarClientesDetallados")) {
				jButtonAbrirOrderByCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarClientesDetallados") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarClientesDetallados")) {
				jButtonMostrarOcultarCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarClientesDetallados")) {
				jButtonCerrarReporteDinamicoCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarClientesDetallados")) {
				jButtonGenerarReporteDinamicoCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarClientesDetallados")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarClientesDetallados")) {
				jButtonCerrarImportacionCobrarClientesDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarClientesDetallados")) {
				
				jButtonGenerarImportacionCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarClientesDetallados")) {
				
				jButtonAbrirImportacionCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarClientesDetallados")) {
				jComboBoxTiposAccionesCobrarClientesDetalladosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarClientesDetallados")) {
				jComboBoxTiposRelacionesCobrarClientesDetalladosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarClientesDetallados")) {
				jComboBoxTiposAccionesCobrarClientesDetalladosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarClientesDetallados")) {
				
				jComboBoxTiposSeleccionarCobrarClientesDetalladosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarClientesDetallados")) {
				jTextFieldValorCampoGeneralCobrarClientesDetalladosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarClientesDetallados")) {
				jButtonAbrirOrderByCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarClientesDetallados")) {
				jButtonAbrirOrderByCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarClientesDetallados")) {
				jButtonCerrarOrderByCobrarClientesDetalladosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesDetalladosBusqueda")) {
				this.jButtonidCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesDetalladosUpdate")) {
				this.jButtonid_empresaCobrarClientesDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesDetalladosBusqueda")) {
				this.jButtonid_empresaCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_zonaCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_titulo_clienteCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesDetalladosBusqueda")) {
				this.jButtoncodigoCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombreCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarClientesDetalladosBusqueda")) {
				this.jButtonapellidoCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarClientesDetalladosBusqueda")) {
				this.jButtonrucCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_contacto_clienteCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesDetalladosBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mail_e_mailCobrarClientesDetalladosBusqueda")) {
				this.jButtone_mail_e_mailCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesDetalladosBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarClientesDetalladosCobrarClientesDetallados")) {
				this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetalladosActionPerformed(evt);
			}
			
			;
			
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarClientesDetallados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarClientesDetallados cobrarclientesdetalladosLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarclientesdetalladosLocal=this.cobrarclientesdetallados;
			} else {
				cobrarclientesdetalladosLocal=this.cobrarclientesdetalladosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
							
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
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
			
			


			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
								
						
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
								
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
							
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
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
			
			


			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
								
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarClientesDetallados")) {
					jCheckBoxSeleccionarTodosCobrarClientesDetalladosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarClientesDetallados")) {
					jCheckBoxSeleccionadosCobrarClientesDetalladosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarClientesDetallados")) {
					
				}
				
				


				
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
												
				
				


				
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
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
			
			


			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesdetallados);
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
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
				
				


				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesDetallados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesdetalladosAnterior =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarClientesDetallados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarClientesDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarClientesDetallados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarclientesdetallados =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarclientesdetallados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarClientesDetallados")) {
				
				}
				
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarClientesDetallados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarClientesDetallados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarClientesDetallados")) {
			
			}
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarClientesDetallados();
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarClientesDetallados")) {
				jButtonDuplicarCobrarClientesDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarClientesDetallados")) {
				jButtonCopiarCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarClientesDetallados")) {
				jButtonVerFormCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesDetallados")) {
				jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarClientesDetallados")) {
				jButtonModificarCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarClientesDetallados")) {
				jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarClientesDetallados")) {
				jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarClientesDetallados")) {
				jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarClientesDetallados")) {
				jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarClientesDetallados")) {
				jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesDetallados")) {
				jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarClientesDetallados")) {
				jButtonAbrirOrderByCobrarClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarClientesDetallados")) {
				jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarClientesDetallados")) {
				jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarClientesDetallados")) {
				jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesDetalladosBusqueda")) {
				this.jButtonidCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesDetalladosUpdate")) {
				this.jButtonid_empresaCobrarClientesDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesDetalladosBusqueda")) {
				this.jButtonid_empresaCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_zonaCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_grupo_clienteCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_titulo_clienteCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesDetalladosBusqueda")) {
				this.jButtoncodigoCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombreCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarClientesDetalladosBusqueda")) {
				this.jButtonapellidoCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarClientesDetalladosBusqueda")) {
				this.jButtonrucCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_contacto_clienteCobrarClientesDetalladosBusqueda")) {
				this.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesDetalladosBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mail_e_mailCobrarClientesDetalladosBusqueda")) {
				this.jButtone_mail_e_mailCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesDetalladosBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesDetalladosBusquedaActionPerformed(evt);
			}
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarClientesDetallados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarClientesDetallados")) {
				closingInternalFrameCobrarClientesDetallados();
				
			} else if(sTipo.equals("jButtonCancelarCobrarClientesDetallados")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarClientesDetallados = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarClientesDetalladosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesDetallados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarClientesDetalladosActionPerformed(null);
			}
			
			CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientesdetallados,new Object(),this.cobrarclientesdetalladosParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarClientesDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarClientesDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarClientesDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarclientesdetallados)) {
			if(!esControlTabla) {
				if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);			
				}
				
				if(this.cobrarclientesdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral,this.cobrarclientesdetalladosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarclientesdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesDetallados(classes,this.cobrarclientesdetalladosReturnGeneral,this.cobrarclientesdetalladosBean,false);
					}
						
					if(this.cobrarclientesdetalladosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados());	
					}
						
					if(this.cobrarclientesdetalladosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados(),classes);//this.cobrarclientesdetalladosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesDetallados(this.cobrarclientesdetallados,classes);//this.cobrarclientesdetalladosBean);									
				}
			
				if(CobrarClientesDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarClientesDetallados(this.cobrarclientesdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesDetallados(this.cobrarclientesdetallados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarclientesdetalladosAnterior!=null) {
						this.cobrarclientesdetallados=this.cobrarclientesdetalladosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarclientesdetalladosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados(),cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetallados(),this.cobrarclientesdetalladoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarClientesDetallados.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarClientesDetallados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarClientesDetallados();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarClientesDetallados() throws Exception {
		
		CobrarClientesDetalladosModel cobrarclientesdetalladosModel=(CobrarClientesDetalladosModel)this.jTableDatosCobrarClientesDetallados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesdetalladosModel.cobrarclientesdetalladoss=this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarclientesdetalladosModel.cobrarclientesdetalladoss=this.cobrarclientesdetalladoss;
		}
		
		
		((CobrarClientesDetalladosModel) this.jTableDatosCobrarClientesDetallados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarClientesDetallados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarclientesdetalladosAnterior(),this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarclientesdetalladosAnterior(),this.cobrarclientesdetalladoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarClientesDetallados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
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
										
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientesdetallados,new Object(),generalEntityParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarClientesDetalladosConstantesFunciones.getClassesRelationshipsOfCobrarClientesDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarClientesDetalladosConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarClientesDetallados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarClientesDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientesdetallados,new Object(),generalEntityParameterGeneral,this.cobrarclientesdetalladosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarClientesDetallados(CobrarClientesDetalladosBean cobrarclientesdetalladosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesDetallados(ArrayList<Classe> classes,CobrarClientesDetalladosReturnGeneral cobrarclientesdetalladosReturnGeneral,CobrarClientesDetalladosBean cobrarclientesdetalladosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarclientesdetallados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados = new CobrarClientesDetalladosDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientesdetalladosSessionBean.getConGuardarRelaciones(),this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.setVisible(false);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.cobrarclientesdetalladosLogic=this.cobrarclientesdetalladosLogic;
		
		this.cargarCombosFrameForeignKeyCobrarClientesDetallados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesDetallados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesDetallados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarClientesDetallados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesDetallados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesDetallados"));
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesDetallados"));

		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesDetallados"));
					
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemModificarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesDetallados"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesDetallados"));
						
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemActualizarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesDetallados"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesDetallados"));
								
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemEliminarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesDetallados"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesDetallados"));
					
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemCancelarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesDetallados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemDetalleCerrarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesDetallados"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesDetallados"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesDetallados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonidCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonid_empresaCobrarClientesDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonid_empresaCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_titulo_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtoncodigoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombreCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonapellidoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonrucCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_contacto_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"e_mail_e_mailCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesDetalladosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesDetallados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarClientesDetallados"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesDetallados"));
		}
		
		this.jTableDatosCobrarClientesDetallados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarClientesDetallados"));
		
		this.jTableDatosCobrarClientesDetallados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarClientesDetallados"));
		
		this.jButtonNuevoCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"NuevoCobrarClientesDetallados"));
		
		this.jButtonDuplicarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"DuplicarCobrarClientesDetallados"));
		
		this.jButtonCopiarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"CopiarCobrarClientesDetallados"));
		
		this.jButtonVerFormCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"VerFormCobrarClientesDetallados"));
		
		
		this.jButtonNuevoToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarClientesDetallados"));
			
		this.jButtonDuplicarToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarClientesDetallados"));
			
		this.jMenuItemNuevoCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarClientesDetallados"));
			
		this.jMenuItemDuplicarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarClientesDetallados"));		
		
		
		this.jButtonNuevoRelacionesCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarClientesDetallados"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarClientesDetallados"));
			
		this.jMenuItemNuevoRelacionesCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarClientesDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonModificarToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesDetallados"));
			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemModificarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonActualizarToolBarCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesDetallados"));
				
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemActualizarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonEliminarToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesDetallados"));
						
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemEliminarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonCancelarToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesDetallados"));
			
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemCancelarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesDetallados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarClientesDetallados"));		
		
		
		this.jButtonCerrarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CerrarCobrarClientesDetallados"));
		
		
		this.jButtonCerrarToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarClientesDetallados"));
			
		this.jMenuItemCerrarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarClientesDetallados"));
			
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jMenuItemDetalleCerrarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarClientesDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesDetallados"));
		}
		
		this.jButtonCopiarToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarClientesDetallados"));
			
		this.jButtonVerFormToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarClientesDetallados"));
		
		this.jMenuItemGuardarCambiosCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarClientesDetallados"));
			
		this.jMenuItemCopiarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarClientesDetallados"));		
		
		this.jMenuItemVerFormCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarClientesDetallados"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesDetallados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarClientesDetallados"));
			
		this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesDetallados"));		
		
		
		
		this.jButtonRecargarInformacionCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarClientesDetallados"));
					
		this.jButtonRecargarInformacionToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarClientesDetallados"));
		
		this.jMenuItemRecargarInformacionCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarClientesDetallados"));		
		
		
		
		this.jButtonAnterioresCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"AnterioresCobrarClientesDetallados"));
		
		
		this.jButtonAnterioresToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarClientesDetallados"));
		
		this.jMenuItemAnterioresCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarClientesDetallados"));		
		
		
		this.jButtonSiguientesCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"SiguientesCobrarClientesDetallados"));
		
		
		this.jButtonSiguientesToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarClientesDetallados"));
			
		this.jMenuItemSiguientesCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarClientesDetallados"));
			
		this.jMenuItemAbrirOrderByCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarClientesDetallados"));
			
		this.jMenuItemMostrarOcultarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarClientesDetallados"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarClientesDetallados"));
			
		this.jMenuItemDetalleMostarOcultarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarClientesDetallados"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarClientesDetallados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarClientesDetallados"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarClientesDetallados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarClientesDetallados"));

		this.jCheckBoxSeleccionadosCobrarClientesDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarClientesDetallados"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesDetallados"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarClientesDetallados"));
			
		this.jComboBoxTiposAccionesCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarClientesDetallados"));
					
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarClientesDetallados"));
			
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarClientesDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonidCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonid_empresaCobrarClientesDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonid_empresaCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_titulo_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtoncodigoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombreCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonapellidoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonrucCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_contacto_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"e_mail_e_mailCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesDetalladosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesDetalladosCobrarClientesDetallados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesDetallados!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesDetallados"));
				this.jInternalFrameReporteDinamicoCobrarClientesDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesDetallados"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesDetallados"));				
			//this.jButtonGenerarReporteDinamicoCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesDetallados"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesDetallados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarClientesDetallados!=null) {
				this.jInternalFrameImportacionCobrarClientesDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesDetallados"));
				this.jInternalFrameImportacionCobrarClientesDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesDetallados"));
				this.jInternalFrameImportacionCobrarClientesDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesDetallados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarClientesDetallados"));
			
			this.jButtonAbrirOrderByToolBarCobrarClientesDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarClientesDetallados"));			
			
			if(this.jInternalFrameOrderByCobrarClientesDetallados!=null) {
				this.jInternalFrameOrderByCobrarClientesDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesDetallados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesDetallados.jTabbedPaneRelacionesCobrarClientesDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesDetallados"));
		
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
            		closingInternalFrameCobrarClientesDetallados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarClientesDetallados = (JInternalFrameBase)event.getSource();
	            	
	            CobrarClientesDetalladosBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesDetallados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarClientesDetalladosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarClientesDetallados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarClientesDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarClientesDetallados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarClientesDetallados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarClientesDetallados";
		inputMap = this.jButtonNuevoCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarClientesDetallados";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesDetalladosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarClientesDetallados";
		inputMap = this.jButtonModificarCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarClientesDetallados";
		inputMap = this.jButtonActualizarCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarClientesDetallados";
		inputMap = this.jButtonEliminarCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarClientesDetallados";
		inputMap = this.jButtonCancelarCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarClientesDetallados";
		inputMap = this.jButtonCerrarCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarClientesDetallados";
		inputMap = this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonGuardarCambiosCobrarClientesDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarClientesDetallados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarClientesDetalladosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarClientesDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarClientesDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarClientesDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarClientesDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarClientesDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarClientesDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonidCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonid_empresaCobrarClientesDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonid_empresaCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_ciudadCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_zonaCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_grupo_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_grupo_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_titulo_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_titulo_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtoncodigoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombreCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonapellidoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonrucCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtonnombre_contacto_clienteCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_contacto_clienteCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtondireccion_direccionCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtone_mail_e_mailCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"e_mail_e_mailCobrarClientesDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jButtontelefono_telefonoCobrarClientesDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesDetalladosBusqueda"));
		
		
		this.jButtonBusquedaCobrarClientesDetalladosCobrarClientesDetallados.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesDetalladosCobrarClientesDetallados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarClientesDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarClientesDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarClientesDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarClientesDetallados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarClientesDetallados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
					cobrarclientesdetalladosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladoss) {
					cobrarclientesdetalladosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarClientesDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
						cobrarclientesdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladoss) {
						cobrarclientesdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarClientesDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarClientesDetallados.getSelectedRows();
			
			CobrarClientesDetallados cobrarclientesdetalladosLocal=new CobrarClientesDetallados();
			
			//this.seleccionarTodosCobrarClientesDetallados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarclientesdetalladosLocal =(CobrarClientesDetallados) this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss().toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarclientesdetalladosLocal =(CobrarClientesDetallados) this.cobrarclientesdetalladoss.toArray()[this.jTableDatosCobrarClientesDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarclientesdetalladosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
						cobrarclientesdetalladosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladoss) {
						cobrarclientesdetalladosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarClientesDetalladosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarClientesDetalladosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarClientesDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarClientesDetallados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
				
						if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_titulo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientesdetalladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrarclientesdetalladosAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarclientesdetalladosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_contacto_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclientesdetalladosAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL)) {
							existe=true;
							cobrarclientesdetalladosAux.sete_mail_e_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclientesdetalladosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladoss) {
					
						if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_grupo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_titulo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientesdetalladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrarclientesdetalladosAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarclientesdetalladosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE)) {
							existe=true;
							cobrarclientesdetalladosAux.setnombre_contacto_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclientesdetalladosAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL)) {
							existe=true;
							cobrarclientesdetalladosAux.sete_mail_e_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclientesdetalladosAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarClientesDetalladosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarClientesDetallados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarClientesDetallados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarClientesDetallados) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarClientesDetallados(conSplash);
				
					this.generarReporteCobrarClientesDetalladossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarClientesDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesDetalladossSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesDetalladossSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesDetallados();
				
				this.exportarCobrarClientesDetalladossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarClientesDetalladoss();
				//this.importarCobrarClientesDetalladoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesDetallados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarClientesDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Clientes Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarClientesDetallados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarClientesDetallados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarClientesDetallados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarClientesDetalladosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarClientesDetallados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarClientesDetallados(conSplash);
					
						//this.actualizarParametrosGeneralCobrarClientesDetallados();
						
						this.generarReporteProcesoAccionCobrarClientesDetalladossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Clientes DetalladosES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Clientes Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarClientesDetallados();
				
						this.actualizarParametrosGeneralCobrarClientesDetallados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarclientesdetalladosReturnGeneral=cobrarclientesdetalladosLogic.procesarAccionCobrarClientesDetalladossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss(),this.cobrarclientesdetalladosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarClientesDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarClientesDetallados();
					
					CobrarClientesDetalladosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarClientesDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxTiposAccionesFormularioCobrarClientesDetallados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarClientesDetallados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarClientesDetalladosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarClientesDetallados();
			
			if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
			CobrarClientesDetallados cobrarclientesdetallados=new CobrarClientesDetallados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarClientesDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarClientesDetallados.getSelectedItem();
			
			
			
			
			cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarclientesdetalladossSeleccionados.size()==1) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossSeleccionados) {
					cobrarclientesdetallados=cobrarclientesdetalladosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarClientesDetallados();
			
      		//this.finishProcessCobrarClientesDetallados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarClientesDetalladosReturnGeneral() throws Exception {
		if(this.cobrarclientesdetalladosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientesdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarclientesdetalladosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientesdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarclientesdetalladosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarclientesdetalladosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
		}
		
		if(this.cobrarclientesdetalladosReturnGeneral.getConRetornoLista() || this.cobrarclientesdetalladosReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarclientesdetalladosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarclientesdetalladosLogic.setCobrarClientesDetalladoss(this.cobrarclientesdetalladosReturnGeneral.getCobrarClientesDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarClientesDetallados(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarClientesDetallados() throws Exception {
		
		
	}
	
	public ArrayList<CobrarClientesDetallados> getCobrarClientesDetalladossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarClientesDetallados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss()) {
					if(cobrarclientesdetalladosAux.getIsSelected()) {
						cobrarclientesdetalladossSeleccionados.add(cobrarclientesdetalladosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesDetallados cobrarclientesdetalladosAux:this.cobrarclientesdetalladoss) {
					if(cobrarclientesdetalladosAux.getIsSelected()) {
						cobrarclientesdetalladossSeleccionados.add(cobrarclientesdetalladosAux);				
					}
				}
			}
			
			if(cobrarclientesdetalladossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarclientesdetalladossSeleccionados.addAll(this.cobrarclientesdetalladosLogic.getCobrarClientesDetalladoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarclientesdetalladossSeleccionados.addAll(this.cobrarclientesdetalladoss);				
					}
				}
			}
		} else {
			cobrarclientesdetalladossSeleccionados.add(this.cobrarclientesdetallados);
		}
		
		return cobrarclientesdetalladossSeleccionados;
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
	
	public void generarReporteCobrarClientesDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarClientesDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarClientesDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesDetalladossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesDetalladossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Clientes Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarClientesDetalladossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarClientesDetallados();
		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarClientesDetallados();
		
		
		//this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados ,cobrarclientesdetalladosImplementable,cobrarclientesdetalladosImplementableHome);
	}
	
	public void mostrarImportacionCobrarClientesDetalladoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarClientesDetallados();
		
		this.abrirFrameImportacionCobrarClientesDetallados();		
		
			
		//this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados ,cobrarclientesdetalladosImplementable,cobrarclientesdetalladosImplementableHome);
	}
	
	public void importarCobrarClientesDetalladoss() throws Exception {		
	
	}
	
	public void exportarCobrarClientesDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarClientesDetalladossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarClientesDetalladossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarClientesDetalladossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Clientes Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarClientesDetallados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarClientesDetallados(cobrarclientesdetalladosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarclientesdetalladosAux.setsDetalleGeneralEntityReporte(cobrarclientesdetalladosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarClientesDetallados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarclientesdetallados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getnombre_grupo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getnombre_titulo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getnombre_contacto_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.getdireccion_direccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.gete_mail_e_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesdetallados.gettelefono_telefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarClientesDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarClientesDetallados(row);				
				iRow++;
			}				
			
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarClientesDetallados(cobrarclientesdetalladosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarClientesDetalladossSeleccionados() throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();		
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesdetallados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarclientesdetalladoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarclientesdetallados");
			//elementRoot.appendChild(element);
		
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossSeleccionados) {
				element = document.createElement("cobrarclientesdetallados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarClientesDetallados(cobrarclientesdetalladosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarClientesDetallados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getnombre_grupo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getnombre_titulo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getnombre_contacto_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.getdireccion_direccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.gete_mail_e_mail());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesdetallados.gettelefono_telefono());				
	}
	
	public void setFilaDatosExportarXmlCobrarClientesDetallados(CobrarClientesDetallados cobrarclientesdetallados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarClientesDetalladosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarclientesdetallados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarClientesDetalladosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarclientesdetallados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarClientesDetalladosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarclientesdetallados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_ciudad = document.createElement(CobrarClientesDetalladosConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(cobrarclientesdetallados.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(CobrarClientesDetalladosConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(cobrarclientesdetallados.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_grupo_cliente = document.createElement(CobrarClientesDetalladosConstantesFunciones.NOMBREGRUPOCLIENTE);
		elementnombre_grupo_cliente.appendChild(document.createTextNode(cobrarclientesdetallados.getnombre_grupo_cliente().trim()));
		element.appendChild(elementnombre_grupo_cliente);

		Element elementnombre_titulo_cliente = document.createElement(CobrarClientesDetalladosConstantesFunciones.NOMBRETITULOCLIENTE);
		elementnombre_titulo_cliente.appendChild(document.createTextNode(cobrarclientesdetallados.getnombre_titulo_cliente().trim()));
		element.appendChild(elementnombre_titulo_cliente);

		Element elementcodigo = document.createElement(CobrarClientesDetalladosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarclientesdetallados.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CobrarClientesDetalladosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrarclientesdetallados.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(CobrarClientesDetalladosConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cobrarclientesdetallados.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementruc = document.createElement(CobrarClientesDetalladosConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(cobrarclientesdetallados.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre_contacto_cliente = document.createElement(CobrarClientesDetalladosConstantesFunciones.NOMBRECONTACTOCLIENTE);
		elementnombre_contacto_cliente.appendChild(document.createTextNode(cobrarclientesdetallados.getnombre_contacto_cliente().trim()));
		element.appendChild(elementnombre_contacto_cliente);

		Element elementdireccion_direccion = document.createElement(CobrarClientesDetalladosConstantesFunciones.DIRECCIONDIRECCION);
		elementdireccion_direccion.appendChild(document.createTextNode(cobrarclientesdetallados.getdireccion_direccion().trim()));
		element.appendChild(elementdireccion_direccion);

		Element elemente_mail_e_mail = document.createElement(CobrarClientesDetalladosConstantesFunciones.EMAILEMAIL);
		elemente_mail_e_mail.appendChild(document.createTextNode(cobrarclientesdetallados.gete_mail_e_mail().trim()));
		element.appendChild(elemente_mail_e_mail);

		Element elementtelefono_telefono = document.createElement(CobrarClientesDetalladosConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarclientesdetallados.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);
	}
	
	public void generarReporteGroupGenericoCobrarClientesDetalladossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados=new ArrayList<CobrarClientesDetallados>();
		
		cobrarclientesdetalladossSeleccionados=this.getCobrarClientesDetalladossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarClientesDetallados(cobrarclientesdetalladossSeleccionados);
		
		this.generarReporteCobrarClientesDetalladoss("Todos",cobrarclientesdetalladossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarClientesDetallados(ArrayList<CobrarClientesDetallados> cobrarclientesdetalladossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarClientesDetallados cobrarclientesdetalladosAux:cobrarclientesdetalladossSeleccionados) {
				cobrarclientesdetalladosAux.setsDetalleGeneralEntityReporte(cobrarclientesdetalladosAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBREGRUPOCLIENTE)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getnombre_grupo_cliente());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRETITULOCLIENTE)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getnombre_titulo_cliente());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_RUC)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_NOMBRECONTACTOCLIENTE)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getnombre_contacto_cliente());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.getdireccion_direccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_EMAILEMAIL)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.gete_mail_e_mail());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesDetalladosConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarclientesdetalladosAux.setsDescripcionGeneralEntityReporte1(cobrarclientesdetalladosAux.gettelefono_telefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarClientesDetallados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarClientesDetallados=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=true;
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
			this.isVisibilidadCeldaModificarCobrarClientesDetallados=true;
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaCancelarCobrarClientesDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarClientesDetalladosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=true;
		} else {
			this.actualizarEstadoPanelsCobrarClientesDetallados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarClientesDetallados=false;
			//this.isVisibilidadCeldaVerFormCobrarClientesDetallados=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarclientesdetalladosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;												
			}
			
			this.jButtonCerrarCobrarClientesDetallados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarclientesdetallados)) {
			this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
			this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarClientesDetallados=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesDetallados=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesDetallados=false;
		//this.isVisibilidadCeldaModificarCobrarClientesDetallados=true;
		this.isVisibilidadCeldaActualizarCobrarClientesDetallados=false;
		this.isVisibilidadCeldaEliminarCobrarClientesDetallados=false;
		//this.isVisibilidadCeldaCancelarCobrarClientesDetallados=true;			
		this.isVisibilidadCeldaGuardarCobrarClientesDetallados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesDetallados() {
	}
	
	public void actualizarEstadoPanelsCobrarClientesDetallados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesDetallados!=null) {
				this.jScrollPanelDatosCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesDetallados!=null) {
				this.jPanelPaginacionCobrarClientesDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
					this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarclientesdetalladosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesDetallados!=null) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarClientesDetallados!=null) {
				this.jPanelParametrosReportesCobrarClientesDetallados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarClientesDetallados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesDetallados) {this.jTabbedPaneBusquedasCobrarClientesDetallados.remove(jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados);}
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
			
			this.inicializarActualizarBindingTablaCobrarClientesDetallados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarClientesDetallados() {
		this.updateBorderResaltarBusquedasFormularioCobrarClientesDetallados();
		this.updateVisibilidadBusquedasFormularioCobrarClientesDetallados();
		this.updateHabilitarBusquedasFormularioCobrarClientesDetallados();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarClientesDetallados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponents().length>0) {
	

		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarBusquedaCobrarClientesDetalladosCobrarClientesDetallados!=null) {
			index= this.jTabbedPaneBusquedasCobrarClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponent(index);
				jPanel.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarClientesDetallados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			if(!this.cobrarclientesdetalladosConstantesFunciones.mostrarBusquedaCobrarClientesDetalladosCobrarClientesDetallados && index>-1) {
				this.jTabbedPaneBusquedasCobrarClientesDetallados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarClientesDetallados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
				this.jTabbedPaneBusquedasCobrarClientesDetallados.setEnabledAt(index,this.cobrarclientesdetalladosConstantesFunciones.activarBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarClientesDetallados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarClientesDetallados")) {
			index= this.jTabbedPaneBusquedasCobrarClientesDetallados.indexOfComponent(this.jPanelBusquedaCobrarClientesDetalladosCobrarClientesDetallados);

			this.jTabbedPaneBusquedasCobrarClientesDetallados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesDetallados.getComponent(index);

			this.cobrarclientesdetalladosConstantesFunciones.setResaltarBusquedaCobrarClientesDetalladosCobrarClientesDetallados(resaltar);

			jPanel.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarBusquedaCobrarClientesDetalladosCobrarClientesDetallados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarClientesDetallados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarClientesDetallados() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarClientesDetallados();
		this.updateVisibilidadResaltarControlesFormularioCobrarClientesDetallados();
		this.updateHabilitarResaltarControlesFormularioCobrarClientesDetallados();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarClientesDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltaridCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelidCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltaridCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarid_empresaCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarid_empresaCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_ciudadCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_ciudadCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_zonaCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_zonaCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_grupo_clienteCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_grupo_clienteCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_titulo_clienteCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_titulo_clienteCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarcodigoCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarcodigoCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombreCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombreCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarapellidoCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarapellidoCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarrucCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarrucCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_contacto_clienteCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltarnombre_contacto_clienteCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltardireccion_direccionCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltardireccion_direccionCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltare_mail_e_mailCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltare_mail_e_mailCobrarClientesDetallados);}
		if(this.cobrarclientesdetalladosConstantesFunciones.resaltartelefono_telefonoCobrarClientesDetallados!=null && this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setBorder(this.cobrarclientesdetalladosConstantesFunciones.resaltartelefono_telefonoCobrarClientesDetallados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarClientesDetallados() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
	
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelidCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostraridCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelidCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostraridCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarid_empresaCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelid_empresaCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarid_empresaCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_ciudadCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelnombre_ciudadCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_ciudadCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_zonaCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelnombre_zonaCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_zonaCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_grupo_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelnombre_grupo_clienteCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_grupo_clienteCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_titulo_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelnombre_titulo_clienteCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_titulo_clienteCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarcodigoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelcodigoCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarcodigoCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombreCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelnombreCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombreCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarapellidoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelapellidoCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarapellidoCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarrucCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelrucCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarrucCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_contacto_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanelnombre_contacto_clienteCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrarnombre_contacto_clienteCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrardireccion_direccionCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPaneldireccion_direccionCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrardireccion_direccionCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrare_mail_e_mailCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPanele_mail_e_mailCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrare_mail_e_mailCobrarClientesDetallados);
		//this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrartelefono_telefonoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jPaneltelefono_telefonoCobrarClientesDetallados.setVisible(this.cobrarclientesdetalladosConstantesFunciones.mostrartelefono_telefonoCobrarClientesDetallados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarClientesDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesDetallados!=null) {
	
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jLabelidCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activaridCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jComboBoxid_empresaCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarid_empresaCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_ciudadCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarnombre_ciudadCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldnombre_zonaCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarnombre_zonaCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_grupo_clienteCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarnombre_grupo_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_titulo_clienteCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarnombre_titulo_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldcodigoCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarcodigoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombreCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarnombreCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreaapellidoCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarapellidoCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextFieldrucCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarrucCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreanombre_contacto_clienteCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activarnombre_contacto_clienteCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreadireccion_direccionCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activardireccion_direccionCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreae_mail_e_mailCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activare_mail_e_mailCobrarClientesDetallados);
		this.jInternalFrameDetalleFormCobrarClientesDetallados.jTextAreatelefono_telefonoCobrarClientesDetallados.setEnabled(this.cobrarclientesdetalladosConstantesFunciones.activartelefono_telefonoCobrarClientesDetallados);
		}
	}
	
		
}