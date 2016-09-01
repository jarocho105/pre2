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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.ChequesPagosAutorizadosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ChequesPagosAutorizadosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ChequesPagosAutorizadosParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.ChequesPagosAutorizadosBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class ChequesPagosAutorizadosBeanSwingJInternalFrame extends ChequesPagosAutorizadosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ChequesPagosAutorizadosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ChequesPagosAutorizados> chequespagosautorizadosValidator = new ClassValidator<ChequesPagosAutorizados>(ChequesPagosAutorizados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ChequesPagosAutorizados chequespagosautorizados;	
	public ChequesPagosAutorizados chequespagosautorizadosAux;
	public ChequesPagosAutorizados chequespagosautorizadosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ChequesPagosAutorizados chequespagosautorizadosTotales;
	public Long idChequesPagosAutorizadosActual;
	public Long iIdNuevoChequesPagosAutorizados=0L;
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
	
	public Boolean isPermisoTodoChequesPagosAutorizados;
	public Boolean isPermisoNuevoChequesPagosAutorizados;
	public Boolean isPermisoActualizarChequesPagosAutorizados;
	public Boolean isPermisoActualizarOriginalChequesPagosAutorizados;
	public Boolean isPermisoEliminarChequesPagosAutorizados;
	public Boolean isPermisoGuardarCambiosChequesPagosAutorizados;
	public Boolean isPermisoConsultaChequesPagosAutorizados;
	public Boolean isPermisoBusquedaChequesPagosAutorizados;
	public Boolean isPermisoReporteChequesPagosAutorizados;
	public Boolean isPermisoPaginacionMedioChequesPagosAutorizados;
	public Boolean isPermisoPaginacionAltoChequesPagosAutorizados;
	public Boolean isPermisoPaginacionTodoChequesPagosAutorizados;
	public Boolean isPermisoCopiarChequesPagosAutorizados;
	public Boolean isPermisoVerFormChequesPagosAutorizados;
	public Boolean isPermisoDuplicarChequesPagosAutorizados;
	public Boolean isPermisoOrdenChequesPagosAutorizados;
	
	
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
	
	public ChequesPagosAutorizadosParameterReturnGeneral chequespagosautorizadosReturnGeneral;
	public ChequesPagosAutorizadosParameterReturnGeneral chequespagosautorizadosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoChequesPagosAutorizados=false;
	public Boolean esParaAccionDesdeFormularioChequesPagosAutorizados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ChequesPagosAutorizadosSessionBeanAdditional chequespagosautorizadosSessionBeanAdditional=null;
	
	public ChequesPagosAutorizadosSessionBeanAdditional getChequesPagosAutorizadosSessionBeanAdditional() {
		return this.chequespagosautorizadosSessionBeanAdditional;
	}
	
	public void setChequesPagosAutorizadosSessionBeanAdditional(ChequesPagosAutorizadosSessionBeanAdditional chequespagosautorizadosSessionBeanAdditional) {
		try {
			this.chequespagosautorizadosSessionBeanAdditional=chequespagosautorizadosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional chequespagosautorizadosBeanSwingJInternalFrameAdditional=null;
	//public class ChequesPagosAutorizadosBeanSwingJInternalFrame
	
	public ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional getChequesPagosAutorizadosBeanSwingJInternalFrameAdditional() {
		return this.chequespagosautorizadosBeanSwingJInternalFrameAdditional;
	}
	
	public void setChequesPagosAutorizadosBeanSwingJInternalFrameAdditional(ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional chequespagosautorizadosBeanSwingJInternalFrameAdditional) {
		try {
			this.chequespagosautorizadosBeanSwingJInternalFrameAdditional=chequespagosautorizadosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ChequesPagosAutorizadosLogic chequespagosautorizadosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ChequesPagosAutorizados chequespagosautorizadosBean;
	public ChequesPagosAutorizadosConstantesFunciones chequespagosautorizadosConstantesFunciones;
	//public ChequesPagosAutorizadosParameterReturnGeneral chequespagosautorizadosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ChequesPagosAutorizados> chequespagosautorizadoss;	
	//public List<ChequesPagosAutorizados> chequespagosautorizadossEliminados;
	//public List<ChequesPagosAutorizados> chequespagosautorizadossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaDuplicarChequesPagosAutorizados=true;
	public Boolean isVisibilidadCeldaCopiarChequesPagosAutorizados=true;
	public Boolean isVisibilidadCeldaVerFormChequesPagosAutorizados=true;
	public Boolean isVisibilidadCeldaOrdenChequesPagosAutorizados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaModificarChequesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaCancelarChequesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaGuardarChequesPagosAutorizados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;	
	
	
	public Boolean isVisibilidadBusquedaChequesPagosAutorizados=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoChequesPagosAutorizados() {
		return this.iIdNuevoChequesPagosAutorizados;
	}

	public void setiIdNuevoChequesPagosAutorizados(Long iIdNuevoChequesPagosAutorizados) {
		this.iIdNuevoChequesPagosAutorizados = iIdNuevoChequesPagosAutorizados;
	}
	
	public Long getidChequesPagosAutorizadosActual() {
		return this.idChequesPagosAutorizadosActual;
	}

	public void setidChequesPagosAutorizadosActual(Long idChequesPagosAutorizadosActual) {
		this.idChequesPagosAutorizadosActual = idChequesPagosAutorizadosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ChequesPagosAutorizados getchequespagosautorizados() {
		return this.chequespagosautorizados;
	}

	public void setchequespagosautorizados(ChequesPagosAutorizados chequespagosautorizados) {
		this.chequespagosautorizados = chequespagosautorizados;
	}
	
	public ChequesPagosAutorizados getchequespagosautorizadosAux() {
		return this.chequespagosautorizadosAux;
	}

	public void setchequespagosautorizadosAux(ChequesPagosAutorizados chequespagosautorizadosAux) {
		this.chequespagosautorizadosAux = chequespagosautorizadosAux;
	}				
	
	public ChequesPagosAutorizados getchequespagosautorizadosAnterior() {
		return this.chequespagosautorizadosAnterior;
	}

	public void setchequespagosautorizadosAnterior(ChequesPagosAutorizados chequespagosautorizadosAnterior) {
		this.chequespagosautorizadosAnterior = chequespagosautorizadosAnterior;
	}	
	
	public ChequesPagosAutorizados getchequespagosautorizadosTotales() {
		return this.chequespagosautorizadosTotales;
	}

	public void setchequespagosautorizadosTotales(ChequesPagosAutorizados chequespagosautorizadosTotales) {
		this.chequespagosautorizadosTotales = chequespagosautorizadosTotales;
	}	
	
	public ChequesPagosAutorizados getchequespagosautorizadosBean() {
		return this.chequespagosautorizadosBean;
	}

	public void setchequespagosautorizadosBean(ChequesPagosAutorizados chequespagosautorizadosBean) {
		this.chequespagosautorizadosBean = chequespagosautorizadosBean;
	}	
	
	public ChequesPagosAutorizadosParameterReturnGeneral getchequespagosautorizadosReturnGeneral() {
		return this.chequespagosautorizadosReturnGeneral;
	}

	public void setchequespagosautorizadosReturnGeneral(ChequesPagosAutorizadosParameterReturnGeneral chequespagosautorizadosReturnGeneral) {
		this.chequespagosautorizadosReturnGeneral = chequespagosautorizadosReturnGeneral;
	}	
	
	
	public Date fecha_desdeBusquedaChequesPagosAutorizados=new Date();

	public Date getfecha_desdeBusquedaChequesPagosAutorizados() {
		return this.fecha_desdeBusquedaChequesPagosAutorizados;
	}

	public void setfecha_desdeBusquedaChequesPagosAutorizados(Date fecha_desdeBusquedaChequesPagosAutorizados) {
		this.fecha_desdeBusquedaChequesPagosAutorizados = fecha_desdeBusquedaChequesPagosAutorizados;
	}

;
	public Date fecha_hastaBusquedaChequesPagosAutorizados=new Date();

	public Date getfecha_hastaBusquedaChequesPagosAutorizados() {
		return this.fecha_hastaBusquedaChequesPagosAutorizados;
	}

	public void setfecha_hastaBusquedaChequesPagosAutorizados(Date fecha_hastaBusquedaChequesPagosAutorizados) {
		this.fecha_hastaBusquedaChequesPagosAutorizados = fecha_hastaBusquedaChequesPagosAutorizados;
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
	
	
	public ChequesPagosAutorizadosLogic getChequesPagosAutorizadosLogic()	{		
		return chequespagosautorizadosLogic;
	}

	public void setChequesPagosAutorizadosLogic(ChequesPagosAutorizadosLogic chequespagosautorizadosLogic) {
		this.chequespagosautorizadosLogic = chequespagosautorizadosLogic;
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
	
	public Boolean getIsEsNuevoChequesPagosAutorizados() {
		return isEsNuevoChequesPagosAutorizados;
	}

	public void setIsEsNuevoChequesPagosAutorizados(Boolean isEsNuevoChequesPagosAutorizados) {
		this.isEsNuevoChequesPagosAutorizados = isEsNuevoChequesPagosAutorizados;
	}

	public Boolean getEsParaAccionDesdeFormularioChequesPagosAutorizados() {
		return esParaAccionDesdeFormularioChequesPagosAutorizados;
	}
	
	public void setEsParaAccionDesdeFormularioChequesPagosAutorizados(Boolean esParaAccionDesdeFormularioChequesPagosAutorizados) {
		this.esParaAccionDesdeFormularioChequesPagosAutorizados = esParaAccionDesdeFormularioChequesPagosAutorizados;
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

			if(this.chequespagosautorizadosSessionBean==null) {
				this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean();
			}

			if(!this.chequespagosautorizadosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(chequespagosautorizadosSessionBean.getlidEmpresaActual());
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

					if(this.chequespagosautorizados!=null) {
						this.chequespagosautorizados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
						this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaChequesPagosAutorizados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
						if(this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.getItemCount()>0) {
							this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaChequesPagosAutorizadosGenerico)throws Exception
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
				jComboBoxid_empresaChequesPagosAutorizadosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaChequesPagosAutorizadosGenerico!=null && jComboBoxid_empresaChequesPagosAutorizadosGenerico.getItemCount()>0) {
					jComboBoxid_empresaChequesPagosAutorizadosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ChequesPagosAutorizados chequespagosautorizados,JComboBox jComboBoxid_empresaChequesPagosAutorizadosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaChequesPagosAutorizadosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaChequesPagosAutorizadosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				chequespagosautorizados.setid_empresa(empresaAux.getId());
				chequespagosautorizados.setempresa_descripcion(ChequesPagosAutorizadosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				chequespagosautorizados.setEmpresa(empresaAux);			}
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

					if(!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { 
							this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { 
					}

					if(!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
							this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
							this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesChequesPagosAutorizados() throws Exception {
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
		
	public ChequesPagosAutorizadosParameterReturnGeneral getChequesPagosAutorizadosParameterGeneral() {
		return this.chequespagosautorizadosParameterGeneral;
	}
	
	public void setChequesPagosAutorizadosParameterGeneral(ChequesPagosAutorizadosParameterReturnGeneral chequespagosautorizadosParameterGeneral) {
		this.chequespagosautorizadosParameterGeneral = chequespagosautorizadosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoChequesPagosAutorizados() {
		return isPermisoTodoChequesPagosAutorizados;
	}

	public void setIsPermisoTodoChequesPagosAutorizados(Boolean isPermisoTodoChequesPagosAutorizados) {
		this.isPermisoTodoChequesPagosAutorizados = isPermisoTodoChequesPagosAutorizados;
	}

	public Boolean getIsPermisoNuevoChequesPagosAutorizados() {
		return isPermisoNuevoChequesPagosAutorizados;
	}

	public void setIsPermisoNuevoChequesPagosAutorizados(Boolean isPermisoNuevoChequesPagosAutorizados) {
		this.isPermisoNuevoChequesPagosAutorizados = isPermisoNuevoChequesPagosAutorizados;
	}

	public Boolean getIsPermisoActualizarChequesPagosAutorizados() {
		return isPermisoActualizarChequesPagosAutorizados;
	}

	public void setIsPermisoActualizarChequesPagosAutorizados(Boolean isPermisoActualizarChequesPagosAutorizados) {
		this.isPermisoActualizarChequesPagosAutorizados = isPermisoActualizarChequesPagosAutorizados;
	}

	public Boolean getIsPermisoEliminarChequesPagosAutorizados() {
		return isPermisoEliminarChequesPagosAutorizados;
	}

	public void setIsPermisoEliminarChequesPagosAutorizados(Boolean isPermisoEliminarChequesPagosAutorizados) {
		this.isPermisoEliminarChequesPagosAutorizados = isPermisoEliminarChequesPagosAutorizados;
	}

	public Boolean getIsPermisoGuardarCambiosChequesPagosAutorizados() {
		return isPermisoGuardarCambiosChequesPagosAutorizados;
	}

	public void setIsPermisoGuardarCambiosChequesPagosAutorizados(Boolean isPermisoGuardarCambiosChequesPagosAutorizados) {
		this.isPermisoGuardarCambiosChequesPagosAutorizados = isPermisoGuardarCambiosChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoConsultaChequesPagosAutorizados() {
		return isPermisoConsultaChequesPagosAutorizados;
	}

	public void setIsPermisoConsultaChequesPagosAutorizados(Boolean isPermisoConsultaChequesPagosAutorizados) {
		this.isPermisoConsultaChequesPagosAutorizados = isPermisoConsultaChequesPagosAutorizados;
	}

	public Boolean getIsPermisoBusquedaChequesPagosAutorizados() {
		return isPermisoBusquedaChequesPagosAutorizados;
	}

	public void setIsPermisoBusquedaChequesPagosAutorizados(Boolean isPermisoBusquedaChequesPagosAutorizados) {
		this.isPermisoBusquedaChequesPagosAutorizados = isPermisoBusquedaChequesPagosAutorizados;
	}

	public Boolean getIsPermisoReporteChequesPagosAutorizados() {
		return isPermisoReporteChequesPagosAutorizados;
	}

	public void setIsPermisoReporteChequesPagosAutorizados(Boolean isPermisoReporteChequesPagosAutorizados) {
		this.isPermisoReporteChequesPagosAutorizados = isPermisoReporteChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoPaginacionMedioChequesPagosAutorizados() {
		return isPermisoPaginacionMedioChequesPagosAutorizados;
	}

	public void setIsPermisoPaginacionMedioChequesPagosAutorizados(Boolean isPermisoPaginacionMedioChequesPagosAutorizados) {
		this.isPermisoPaginacionMedioChequesPagosAutorizados = isPermisoPaginacionMedioChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoPaginacionTodoChequesPagosAutorizados() {
		return isPermisoPaginacionTodoChequesPagosAutorizados;
	}

	public void setIsPermisoPaginacionTodoChequesPagosAutorizados(Boolean isPermisoPaginacionTodoChequesPagosAutorizados) {
		this.isPermisoPaginacionTodoChequesPagosAutorizados = isPermisoPaginacionTodoChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoPaginacionAltoChequesPagosAutorizados() {
		return isPermisoPaginacionAltoChequesPagosAutorizados;
	}

	public void setIsPermisoPaginacionAltoChequesPagosAutorizados(Boolean isPermisoPaginacionAltoChequesPagosAutorizados) {
		this.isPermisoPaginacionAltoChequesPagosAutorizados = isPermisoPaginacionAltoChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoCopiarChequesPagosAutorizados() {
		return isPermisoCopiarChequesPagosAutorizados;
	}

	public void setIsPermisoCopiarChequesPagosAutorizados(Boolean isPermisoCopiarChequesPagosAutorizados) {
		this.isPermisoCopiarChequesPagosAutorizados = isPermisoCopiarChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoVerFormChequesPagosAutorizados() {
		return isPermisoVerFormChequesPagosAutorizados;
	}

	public void setIsPermisoVerFormChequesPagosAutorizados(Boolean isPermisoVerFormChequesPagosAutorizados) {
		this.isPermisoVerFormChequesPagosAutorizados = isPermisoVerFormChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoDuplicarChequesPagosAutorizados() {
		return isPermisoDuplicarChequesPagosAutorizados;
	}

	public void setIsPermisoDuplicarChequesPagosAutorizados(Boolean isPermisoDuplicarChequesPagosAutorizados) {
		this.isPermisoDuplicarChequesPagosAutorizados = isPermisoDuplicarChequesPagosAutorizados;
	}
	
	public Boolean getIsPermisoOrdenChequesPagosAutorizados() {
		return isPermisoOrdenChequesPagosAutorizados;
	}

	public void setIsPermisoOrdenChequesPagosAutorizados(Boolean isPermisoOrdenChequesPagosAutorizados) {
		this.isPermisoOrdenChequesPagosAutorizados = isPermisoOrdenChequesPagosAutorizados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoChequesPagosAutorizados() {
		return isVisibilidadCeldaNuevoChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaNuevoChequesPagosAutorizados(Boolean isVisibilidadCeldaNuevoChequesPagosAutorizados) {
		this.isVisibilidadCeldaNuevoChequesPagosAutorizados = isVisibilidadCeldaNuevoChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarChequesPagosAutorizados() {
		return isVisibilidadCeldaDuplicarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaDuplicarChequesPagosAutorizados(Boolean isVisibilidadCeldaDuplicarChequesPagosAutorizados) {
		this.isVisibilidadCeldaDuplicarChequesPagosAutorizados = isVisibilidadCeldaDuplicarChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarChequesPagosAutorizados() {
		return isVisibilidadCeldaCopiarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaCopiarChequesPagosAutorizados(Boolean isVisibilidadCeldaCopiarChequesPagosAutorizados) {
		this.isVisibilidadCeldaCopiarChequesPagosAutorizados = isVisibilidadCeldaCopiarChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormChequesPagosAutorizados() {
		return isVisibilidadCeldaVerFormChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaVerFormChequesPagosAutorizados(Boolean isVisibilidadCeldaVerFormChequesPagosAutorizados) {
		this.isVisibilidadCeldaVerFormChequesPagosAutorizados = isVisibilidadCeldaVerFormChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenChequesPagosAutorizados() {
		return isVisibilidadCeldaOrdenChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaOrdenChequesPagosAutorizados(Boolean isVisibilidadCeldaOrdenChequesPagosAutorizados) {
		this.isVisibilidadCeldaOrdenChequesPagosAutorizados = isVisibilidadCeldaOrdenChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados() {
		return isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados(Boolean isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados) {
		this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados = isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarChequesPagosAutorizados() {
		return isVisibilidadCeldaModificarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaModificarChequesPagosAutorizados(Boolean isVisibilidadCeldaModificarChequesPagosAutorizados) {
		this.isVisibilidadCeldaModificarChequesPagosAutorizados = isVisibilidadCeldaModificarChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarChequesPagosAutorizados() {
		return isVisibilidadCeldaActualizarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaActualizarChequesPagosAutorizados(Boolean isVisibilidadCeldaActualizarChequesPagosAutorizados) {
		this.isVisibilidadCeldaActualizarChequesPagosAutorizados = isVisibilidadCeldaActualizarChequesPagosAutorizados;
	}

	public Boolean getIsVisibilidadCeldaEliminarChequesPagosAutorizados() {
		return isVisibilidadCeldaEliminarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaEliminarChequesPagosAutorizados(Boolean isVisibilidadCeldaEliminarChequesPagosAutorizados) {
		this.isVisibilidadCeldaEliminarChequesPagosAutorizados = isVisibilidadCeldaEliminarChequesPagosAutorizados;
	}

	public Boolean getIsVisibilidadCeldaCancelarChequesPagosAutorizados() {
		return isVisibilidadCeldaCancelarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaCancelarChequesPagosAutorizados(Boolean isVisibilidadCeldaCancelarChequesPagosAutorizados) {
		this.isVisibilidadCeldaCancelarChequesPagosAutorizados = isVisibilidadCeldaCancelarChequesPagosAutorizados;
	}

	public Boolean getIsVisibilidadCeldaGuardarChequesPagosAutorizados() {
		return isVisibilidadCeldaGuardarChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaGuardarChequesPagosAutorizados(Boolean isVisibilidadCeldaGuardarChequesPagosAutorizados) {
		this.isVisibilidadCeldaGuardarChequesPagosAutorizados = isVisibilidadCeldaGuardarChequesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosChequesPagosAutorizados() {
		return isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosChequesPagosAutorizados(Boolean isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados) {
		this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados = isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados;
	}
		
	public ChequesPagosAutorizadosSessionBean getchequespagosautorizadosSessionBean() {
		return this.chequespagosautorizadosSessionBean;
	}
	
	public void setchequespagosautorizadosSessionBean(ChequesPagosAutorizadosSessionBean chequespagosautorizadosSessionBean) {
		this.chequespagosautorizadosSessionBean=chequespagosautorizadosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaChequesPagosAutorizados() {
		return this.isVisibilidadBusquedaChequesPagosAutorizados;
	}

	public void setisVisibilidadBusquedaChequesPagosAutorizados(Boolean isVisibilidadBusquedaChequesPagosAutorizados) {
		this.isVisibilidadBusquedaChequesPagosAutorizados=isVisibilidadBusquedaChequesPagosAutorizados;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(chequespagosautorizados,null);
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
	
	public void bugActualizarReferenciaActual(ChequesPagosAutorizados chequespagosautorizados,ChequesPagosAutorizados chequespagosautorizadosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalChequesPagosAutorizados(chequespagosautorizados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		chequespagosautorizadosAux.setId(chequespagosautorizados.getId());
		chequespagosautorizadosAux.setVersionRow(chequespagosautorizados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ChequesPagosAutorizados chequespagosautorizadosLocal) throws Exception {
		
		if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ChequesPagosAutorizados chequespagosautorizadosLocal) throws Exception {	
		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				chequespagosautorizadosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarChequesPagosAutorizadosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = chequespagosautorizadosValidator.getInvalidValues(this.chequespagosautorizados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ChequesPagosAutorizados chequespagosautorizados,List<ChequesPagosAutorizados> chequespagosautorizadoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ChequesPagosAutorizados chequespagosautorizados,List<ChequesPagosAutorizados> chequespagosautorizadoss) throws Exception {
		try	{			
			ChequesPagosAutorizadosConstantesFunciones.actualizarSelectedLista(chequespagosautorizados,chequespagosautorizadoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ChequesPagosAutorizados> chequespagosautorizadossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				chequespagosautorizadossLocal=this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				chequespagosautorizadossLocal=this.chequespagosautorizadoss;
			}
			//ARCHITECTURE
		
			for(ChequesPagosAutorizados chequespagosautorizadosLocal:chequespagosautorizadossLocal) {
				if(this.permiteMantenimiento(chequespagosautorizadosLocal) && chequespagosautorizadosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.getChequesPagosAutorizadosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnombre_clienteChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_facturaChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabeldebito_mone_localChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelfechaChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnombre_bancoChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelvalorChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_chequeChequesPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ChequesPagosAutorizadosConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_cuentaChequesPagosAutorizados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnombre_clienteChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_facturaChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabeldebito_mone_localChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelfechaChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnombre_bancoChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelvalorChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_chequeChequesPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_cuentaChequesPagosAutorizados,"");
		
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
		this.iIdNuevoChequesPagosAutorizados--;	
		
		
		this.chequespagosautorizadosAux=new ChequesPagosAutorizados();
		
		this.chequespagosautorizadosAux.setId(this.iIdNuevoChequesPagosAutorizados);
		this.chequespagosautorizadosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().add(this.chequespagosautorizadosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.chequespagosautorizadoss.add(this.chequespagosautorizadosAux);
		}
		//ARCHITECTURE
		
		this.chequespagosautorizados=this.chequespagosautorizadosAux;
		
		if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizados);
			this.setVariablesObjetoActualToFormularioForeignKeyChequesPagosAutorizados(this.chequespagosautorizados);
		}
				
		//this.setDefaultControlesChequesPagosAutorizados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyChequesPagosAutorizados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyChequesPagosAutorizados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyChequesPagosAutorizados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualChequesPagosAutorizados(this.chequespagosautorizadosBean,this.chequespagosautorizados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral,this.chequespagosautorizadosBean,false);
		
		if(this.chequespagosautorizadosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados());
		}
		
		if(this.chequespagosautorizadosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados(),classes);//this.chequespagosautorizadosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyChequesPagosAutorizados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyChequesPagosAutorizados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.RecargarFormChequesPagosAutorizados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
						
			if(chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualChequesPagosAutorizados();
			}
			
			this.actualizarVisualTableDatosChequesPagosAutorizados();
			
			this.jTableDatosChequesPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoChequesPagosAutorizados(), this.getIndiceNuevoChequesPagosAutorizados());
			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
						
			this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesChequesPagosAutorizados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_desdeChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarfecha_desdeChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_hastaChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarfecha_hastaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarnombre_clienteChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarnumero_facturaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activardebito_mone_localChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarfechaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarnombre_bancoChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarvalorChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarnumero_chequeChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarnumero_cuentaChequesPagosAutorizados);	
		//
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setEnabled(isHabilitar && this.chequespagosautorizadosConstantesFunciones.activarid_empresaChequesPagosAutorizados);
	};
	
	public void setDefaultControlesChequesPagosAutorizados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoChequesPagosAutorizados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.chequespagosautorizadosSessionBean.setConGuardarRelaciones(true);			
			this.chequespagosautorizadosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.setVisible(true);
			
					
		} else {
			//this.chequespagosautorizadosSessionBean.setConGuardarRelaciones(false);			
			this.chequespagosautorizadosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoChequesPagosAutorizados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
				if(chequespagosautorizadosAux.getId().equals(this.iIdNuevoChequesPagosAutorizados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadoss) {
				if(chequespagosautorizadosAux.getId().equals(this.iIdNuevoChequesPagosAutorizados)) {
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
	
	public int getIndiceActualChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
				if(chequespagosautorizadosAux.getId().equals(chequespagosautorizados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadoss) {
				if(chequespagosautorizadosAux.getId().equals(chequespagosautorizados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizadosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
				if(chequespagosautorizadosAux.getChequesPagosAutorizadosOriginal().getId().equals(chequespagosautorizadosOriginal.getId())) {
					existe=true;
					chequespagosautorizadosOriginal.setId(chequespagosautorizadosAux.getId());
					chequespagosautorizadosOriginal.setVersionRow(chequespagosautorizadosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadoss) {
				if(chequespagosautorizadosAux.getChequesPagosAutorizadosOriginal().getId().equals(chequespagosautorizadosOriginal.getId())) {
					existe=true;
					chequespagosautorizadosOriginal.setId(chequespagosautorizadosAux.getId());
					chequespagosautorizadosOriginal.setVersionRow(chequespagosautorizadosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosChequesPagosAutorizados(Boolean esParaCancelar) throws Exception {
		chequespagosautorizadossAux=new ArrayList<ChequesPagosAutorizados>();
		chequespagosautorizadosAux=new ChequesPagosAutorizados();
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
					if(chequespagosautorizadosAux.getId()<0) {
						chequespagosautorizadossAux.add(chequespagosautorizadosAux);
					}		
				}
				this.iIdNuevoChequesPagosAutorizados=0L;
				this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().removeAll(chequespagosautorizadossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadoss) {
					if(chequespagosautorizadosAux.getId()<0) {
						chequespagosautorizadossAux.add(chequespagosautorizadosAux);
					}		
				}
				this.iIdNuevoChequesPagosAutorizados=0L;
				this.chequespagosautorizadoss.removeAll(chequespagosautorizadossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoChequesPagosAutorizados 
					&& this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size()>0
					) {
					chequespagosautorizadosAux=this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().get(this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size() - 1);
				
					if(chequespagosautorizadosAux.getId()<0) {
						this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().remove(chequespagosautorizadosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoChequesPagosAutorizados && this.chequespagosautorizadoss.size()>0) {
					chequespagosautorizadosAux=this.chequespagosautorizadoss.get(this.chequespagosautorizadoss.size() - 1);
				
					if(chequespagosautorizadosAux.getId()<0) {
						this.chequespagosautorizadoss.remove(chequespagosautorizadosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoChequesPagosAutorizados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(chequespagosautorizados.getId()<0) {
				this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().remove(this.chequespagosautorizados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(chequespagosautorizados.getId()<0) {
				this.chequespagosautorizadoss.remove(this.chequespagosautorizados);
			}
		}			
	}
	
	public void setEstadosInicialesChequesPagosAutorizados(List<ChequesPagosAutorizados> chequespagosautorizadossAux) throws Exception {
		ChequesPagosAutorizadosConstantesFunciones.setEstadosInicialesChequesPagosAutorizados(chequespagosautorizadossAux);
	}
	
	public void setEstadosInicialesChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizadosAux) throws Exception {
		ChequesPagosAutorizadosConstantesFunciones.setEstadosInicialesChequesPagosAutorizados(chequespagosautorizadosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarChequesPagosAutorizadosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarChequesPagosAutorizadosActual()) {
				if(!this.isEsNuevoChequesPagosAutorizados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoChequesPagosAutorizados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarChequesPagosAutorizadosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cheques Pagos Autorizados ?", "MANTENIMIENTO DE Cheques Pagos Autorizados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ChequesPagosAutorizados chequespagosautorizados) throws Exception {
		ChequesPagosAutorizadosConstantesFunciones.seleccionarAsignar(this.chequespagosautorizados,chequespagosautorizados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarChequesPagosAutorizados=this.isPermisoActualizarOriginalChequesPagosAutorizados;
			
			
			this.seleccionarAsignar(chequespagosautorizados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.chequespagosautorizadosSessionBean.setsFuncionBusquedaRapida(this.chequespagosautorizadosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoChequesPagosAutorizados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosChequesPagosAutorizados(esParaCancelar);				
				this.cancelarNuevoChequesPagosAutorizados(esParaCancelar);								
			}
			
			this.chequespagosautorizados=new ChequesPagosAutorizados();
			
			this.inicializarChequesPagosAutorizados();
			
			this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarChequesPagosAutorizados() throws Exception {
		try {
			ChequesPagosAutorizadosConstantesFunciones.inicializarChequesPagosAutorizados(this.chequespagosautorizados);
			
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
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteChequesPagosAutorizadoss(String sAccionBusqueda,List<ChequesPagosAutorizados> chequespagosautorizadossParaReportes) throws Exception {
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
					sPathReporteFinal="ChequesPagosAutorizados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ChequesPagosAutorizadosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ChequesPagosAutorizadosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ChequesPagosAutorizados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cheques Pagos Autorizadoses");		
		parameters.put("busquedapor", ChequesPagosAutorizadosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceChequesPagosAutorizados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ChequesPagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ChequesPagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceChequesPagosAutorizados=new JRBeanArrayDataSource(ChequesPagosAutorizadosJInternalFrame.TraerChequesPagosAutorizadosBeans(chequespagosautorizadossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceChequesPagosAutorizados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ChequesPagosAutorizadosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ChequesPagosAutorizadosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ChequesPagosAutorizadosBean.TraerChequesPagosAutorizadosBeans(chequespagosautorizadossParaReportes).toArray()));
							
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
				this.generarExcelReporteChequesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,chequespagosautorizadossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalChequesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,chequespagosautorizadossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizadosActionPerformed(null);
					//this.generarExcelReporteChequesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,chequespagosautorizadossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalChequesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,chequespagosautorizadossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesChequesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,chequespagosautorizadossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesChequesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,chequespagosautorizadossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteChequesPagosAutorizadoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ChequesPagosAutorizados> chequespagosautorizadossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ChequesPagosAutorizadoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderChequesPagosAutorizados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ChequesPagosAutorizados chequespagosautorizados : chequespagosautorizadossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ChequesPagosAutorizadosConstantesFunciones.generarExcelReporteDataChequesPagosAutorizados("NORMAL",row,workbook,chequespagosautorizados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderChequesPagosAutorizados(String sTipo,Row row,Workbook workbook) {
		
		ChequesPagosAutorizadosConstantesFunciones.generarExcelReporteHeaderChequesPagosAutorizados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalChequesPagosAutorizadoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ChequesPagosAutorizados> chequespagosautorizadossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ChequesPagosAutorizadoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ChequesPagosAutorizados chequespagosautorizados : chequespagosautorizadossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.getChequesPagosAutorizadosDescripcion(chequespagosautorizados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(chequespagosautorizados.getnumero_cuenta());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesChequesPagosAutorizadoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ChequesPagosAutorizados> chequespagosautorizadossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ChequesPagosAutorizados> chequespagosautorizadossRespaldo=null;
		
		classes=ChequesPagosAutorizadosConstantesFunciones.getClassesRelationshipsOfChequesPagosAutorizados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.chequespagosautorizadosLogic.setDatosCliente(this.datosCliente);
		this.chequespagosautorizadosLogic.setDatosDeep(this.datosDeep);
		this.chequespagosautorizadosLogic.setIsConDeep(true);
		
		chequespagosautorizadossRespaldo=this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss();
		
		this.chequespagosautorizadosLogic.setChequesPagosAutorizadoss(chequespagosautorizadossParaReportes);	
		this.chequespagosautorizadosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		chequespagosautorizadossParaReportes=this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss();
		this.chequespagosautorizadosLogic.setChequesPagosAutorizadoss(chequespagosautorizadossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ChequesPagosAutorizadoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderChequesPagosAutorizados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ChequesPagosAutorizados chequespagosautorizados : chequespagosautorizadossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderChequesPagosAutorizados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ChequesPagosAutorizadosConstantesFunciones.generarExcelReporteDataChequesPagosAutorizados("NORMAL",row,workbook,chequespagosautorizados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.getChequesPagosAutorizadosDescripcion(chequespagosautorizados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessChequesPagosAutorizados() throws Exception {		
		this.startProcessChequesPagosAutorizados(true);
	}
	
	public void startProcessChequesPagosAutorizados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasChequesPagosAutorizados ,this.jPanelParametrosReportesChequesPagosAutorizados, this.jScrollPanelDatosChequesPagosAutorizados,this.jPanelPaginacionChequesPagosAutorizados, this.jScrollPanelDatosEdicionChequesPagosAutorizados, this.jPanelAccionesChequesPagosAutorizados,this.jPanelAccionesFormularioChequesPagosAutorizados,this.jmenuBarChequesPagosAutorizados,this.jmenuBarDetalleChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,this.jTtoolBarDetalleChequesPagosAutorizados);		
		
		final JTabbedPane jTabbedPaneBusquedasChequesPagosAutorizados=this.jTabbedPaneBusquedasChequesPagosAutorizados; 
		
		final JPanel jPanelParametrosReportesChequesPagosAutorizados=this.jPanelParametrosReportesChequesPagosAutorizados;
		//final JScrollPane jScrollPanelDatosChequesPagosAutorizados=this.jScrollPanelDatosChequesPagosAutorizados;
		final JTable jTableDatosChequesPagosAutorizados=this.jTableDatosChequesPagosAutorizados;		
		final JPanel jPanelPaginacionChequesPagosAutorizados=this.jPanelPaginacionChequesPagosAutorizados;
		//final JScrollPane jScrollPanelDatosEdicionChequesPagosAutorizados=this.jScrollPanelDatosEdicionChequesPagosAutorizados;
		final JPanel jPanelAccionesChequesPagosAutorizados=this.jPanelAccionesChequesPagosAutorizados;
		
		JPanel jPanelCamposAuxiliarChequesPagosAutorizados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarChequesPagosAutorizados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			jPanelCamposAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelCamposChequesPagosAutorizados;
			jPanelAccionesFormularioAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelAccionesFormularioChequesPagosAutorizados;
		}
		
		final JPanel jPanelCamposChequesPagosAutorizados=jPanelCamposAuxiliarChequesPagosAutorizados;
		final JPanel jPanelAccionesFormularioChequesPagosAutorizados=jPanelAccionesFormularioAuxiliarChequesPagosAutorizados;
		
		
		final JMenuBar jmenuBarChequesPagosAutorizados=this.jmenuBarChequesPagosAutorizados;
		final JToolBar jTtoolBarChequesPagosAutorizados=this.jTtoolBarChequesPagosAutorizados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarChequesPagosAutorizados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarChequesPagosAutorizados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			jmenuBarDetalleAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jmenuBarDetalleChequesPagosAutorizados;
			jTtoolBarDetalleAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jTtoolBarDetalleChequesPagosAutorizados;
		}
		
		final JMenuBar jmenuBarDetalleChequesPagosAutorizados=jmenuBarDetalleAuxiliarChequesPagosAutorizados;
		final JToolBar jTtoolBarDetalleChequesPagosAutorizados=jTtoolBarDetalleAuxiliarChequesPagosAutorizados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasChequesPagosAutorizados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesChequesPagosAutorizados;
			processRunnable.jTableDatos=jTableDatosChequesPagosAutorizados;
			processRunnable.jPanelCampos=jPanelCamposChequesPagosAutorizados;
			processRunnable.jPanelPaginacion=jPanelPaginacionChequesPagosAutorizados;
			processRunnable.jPanelAcciones=jPanelAccionesChequesPagosAutorizados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioChequesPagosAutorizados;
			
			
			processRunnable.jmenuBar=jmenuBarChequesPagosAutorizados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleChequesPagosAutorizados;
			processRunnable.jTtoolBar=jTtoolBarChequesPagosAutorizados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleChequesPagosAutorizados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasChequesPagosAutorizados ,jPanelParametrosReportesChequesPagosAutorizados,jTableDatosChequesPagosAutorizados, /*jScrollPanelDatosChequesPagosAutorizados,*/jPanelCamposChequesPagosAutorizados,jPanelPaginacionChequesPagosAutorizados, /*jScrollPanelDatosEdicionChequesPagosAutorizados,*/ jPanelAccionesChequesPagosAutorizados,jPanelAccionesFormularioChequesPagosAutorizados,jmenuBarChequesPagosAutorizados,jmenuBarDetalleChequesPagosAutorizados,jTtoolBarChequesPagosAutorizados,jTtoolBarDetalleChequesPagosAutorizados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasChequesPagosAutorizados ,jPanelParametrosReportesChequesPagosAutorizados, jScrollPanelDatosChequesPagosAutorizados,jPanelPaginacionChequesPagosAutorizados, jScrollPanelDatosEdicionChequesPagosAutorizados, jPanelAccionesChequesPagosAutorizados,jPanelAccionesFormularioChequesPagosAutorizados,jmenuBarChequesPagosAutorizados,jmenuBarDetalleChequesPagosAutorizados,jTtoolBarChequesPagosAutorizados,jTtoolBarDetalleChequesPagosAutorizados);
						
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
	
	public void finishProcessChequesPagosAutorizados() {// throws Exception 
		this.finishProcessChequesPagosAutorizados(true);
	}
	
	public void finishProcessChequesPagosAutorizados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasChequesPagosAutorizados ,this.jPanelParametrosReportesChequesPagosAutorizados, this.jScrollPanelDatosChequesPagosAutorizados,this.jPanelPaginacionChequesPagosAutorizados, this.jScrollPanelDatosEdicionChequesPagosAutorizados, this.jPanelAccionesChequesPagosAutorizados,this.jPanelAccionesFormularioChequesPagosAutorizados,this.jmenuBarChequesPagosAutorizados,this.jmenuBarDetalleChequesPagosAutorizados,this.jTtoolBarChequesPagosAutorizados,this.jTtoolBarDetalleChequesPagosAutorizados);		
		
		final JTabbedPane jTabbedPaneBusquedasChequesPagosAutorizados=this.jTabbedPaneBusquedasChequesPagosAutorizados; 
		
		final JPanel jPanelParametrosReportesChequesPagosAutorizados=this.jPanelParametrosReportesChequesPagosAutorizados;
		//final JScrollPane jScrollPanelDatosChequesPagosAutorizados=this.jScrollPanelDatosChequesPagosAutorizados;
		final JTable jTableDatosChequesPagosAutorizados=this.jTableDatosChequesPagosAutorizados;		
		final JPanel jPanelPaginacionChequesPagosAutorizados=this.jPanelPaginacionChequesPagosAutorizados;
		//final JScrollPane jScrollPanelDatosEdicionChequesPagosAutorizados=this.jScrollPanelDatosEdicionChequesPagosAutorizados;
		final JPanel jPanelAccionesChequesPagosAutorizados=this.jPanelAccionesChequesPagosAutorizados;
		
		JPanel jPanelCamposAuxiliarChequesPagosAutorizados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarChequesPagosAutorizados=new JPanel();
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			jPanelCamposAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelCamposChequesPagosAutorizados;
			jPanelAccionesFormularioAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelAccionesFormularioChequesPagosAutorizados;
		}
		
		final JPanel jPanelCamposChequesPagosAutorizados=jPanelCamposAuxiliarChequesPagosAutorizados;
		final JPanel jPanelAccionesFormularioChequesPagosAutorizados=jPanelAccionesFormularioAuxiliarChequesPagosAutorizados;
		
		
		final JMenuBar jmenuBarChequesPagosAutorizados=this.jmenuBarChequesPagosAutorizados;		
		final JToolBar jTtoolBarChequesPagosAutorizados=this.jTtoolBarChequesPagosAutorizados;
				
		JMenuBar jmenuBarDetalleAuxiliarChequesPagosAutorizados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarChequesPagosAutorizados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			jmenuBarDetalleAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jmenuBarDetalleChequesPagosAutorizados;
			jTtoolBarDetalleAuxiliarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jTtoolBarDetalleChequesPagosAutorizados;		
		}
		
		final JMenuBar jmenuBarDetalleChequesPagosAutorizados=jmenuBarDetalleAuxiliarChequesPagosAutorizados;
		final JToolBar jTtoolBarDetalleChequesPagosAutorizados=jTtoolBarDetalleAuxiliarChequesPagosAutorizados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasChequesPagosAutorizados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesChequesPagosAutorizados;
			processRunnable.jTableDatos=jTableDatosChequesPagosAutorizados;
			processRunnable.jPanelCampos=jPanelCamposChequesPagosAutorizados;
			processRunnable.jPanelPaginacion=jPanelPaginacionChequesPagosAutorizados;
			processRunnable.jPanelAcciones=jPanelAccionesChequesPagosAutorizados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioChequesPagosAutorizados;
			
			
			processRunnable.jmenuBar=jmenuBarChequesPagosAutorizados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleChequesPagosAutorizados;
			processRunnable.jTtoolBar=jTtoolBarChequesPagosAutorizados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleChequesPagosAutorizados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasChequesPagosAutorizados ,jPanelParametrosReportesChequesPagosAutorizados, jTableDatosChequesPagosAutorizados,/*jScrollPanelDatosChequesPagosAutorizados,*/jPanelCamposChequesPagosAutorizados,jPanelPaginacionChequesPagosAutorizados, /*jScrollPanelDatosEdicionChequesPagosAutorizados,*/ jPanelAccionesChequesPagosAutorizados,jPanelAccionesFormularioChequesPagosAutorizados,jmenuBarChequesPagosAutorizados,jmenuBarDetalleChequesPagosAutorizados,jTtoolBarChequesPagosAutorizados,jTtoolBarDetalleChequesPagosAutorizados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesChequesPagosAutorizados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarChequesPagosAutorizados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuChequesPagosAutorizados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarChequesPagosAutorizados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarChequesPagosAutorizados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleChequesPagosAutorizados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuChequesPagosAutorizados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarChequesPagosAutorizados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleChequesPagosAutorizados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.chequespagosautorizadosConstantesFunciones.getsFinalQueryChequesPagosAutorizados();
		String  finalQueryPaginacionTodos=this.chequespagosautorizadosConstantesFunciones.getsFinalQueryChequesPagosAutorizados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ChequesPagosAutorizadosConstantesFunciones.getArrayColumnasGlobalesNoChequesPagosAutorizados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ChequesPagosAutorizadosConstantesFunciones.getArrayColumnasGlobalesChequesPagosAutorizados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ChequesPagosAutorizadosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.chequespagosautorizadossEliminados= new ArrayList<ChequesPagosAutorizados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessChequesPagosAutorizados();
		
				///*ChequesPagosAutorizadosSessionBean*/this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean();
			
			if(this.chequespagosautorizadosSessionBean==null) {
				this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean();
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
					this.iNumeroPaginacion=ChequesPagosAutorizadosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ChequesPagosAutorizadosConstantesFunciones.getClassesForeignKeysOfChequesPagosAutorizados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/chequespagosautorizados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			chequespagosautorizadossAux= new ArrayList<ChequesPagosAutorizados>();
			
				
			chequespagosautorizadosLogic.setDatosCliente(this.datosCliente);
			chequespagosautorizadosLogic.setDatosDeep(this.datosDeep);
			chequespagosautorizadosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaChequesPagosAutorizados")) {
				this.sDetalleReporte=ChequesPagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaChequesPagosAutorizados(fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					chequespagosautorizadosLogic.getChequesPagosAutorizadossBusquedaChequesPagosAutorizados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequesPagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaChequesPagosAutorizados(fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequesPagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaChequesPagosAutorizados(fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=chequespagosautorizadosLogic.getChequesPagosAutorizadoss()==null||chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=chequespagosautorizadoss==null|| chequespagosautorizadoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						chequespagosautorizadossAux=new ArrayList<ChequesPagosAutorizados>();
						chequespagosautorizadossAux.addAll(chequespagosautorizadosLogic.getChequesPagosAutorizadoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequespagosautorizadossAux=new ArrayList<ChequesPagosAutorizados>();
							chequespagosautorizadossAux.addAll(chequespagosautorizadoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							chequespagosautorizadosLogic.getChequesPagosAutorizadossBusquedaChequesPagosAutorizados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ChequesPagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaChequesPagosAutorizados(fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ChequesPagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaChequesPagosAutorizados(fecha_desdeBusquedaChequesPagosAutorizados,fecha_hastaBusquedaChequesPagosAutorizados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteChequesPagosAutorizadoss("BusquedaChequesPagosAutorizados",chequespagosautorizadosLogic.getChequesPagosAutorizadoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteChequesPagosAutorizadoss("BusquedaChequesPagosAutorizados",chequespagosautorizadoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						chequespagosautorizadosLogic.setChequesPagosAutorizadoss(new ArrayList<ChequesPagosAutorizados>());
						chequespagosautorizadosLogic.getChequesPagosAutorizadoss().addAll(chequespagosautorizadossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequespagosautorizadoss=new ArrayList<ChequesPagosAutorizados>();
							chequespagosautorizadoss.addAll(chequespagosautorizadossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesChequesPagosAutorizados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessChequesPagosAutorizados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=chequespagosautorizadoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=chequespagosautorizadoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ChequesPagosAutorizados chequespagosautorizados) {
		Boolean permite=true;
		
		if(this.chequespagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ChequesPagosAutorizadosConstantesFunciones.getOrderByListaChequesPagosAutorizados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ChequesPagosAutorizadosConstantesFunciones.getOrderByListaChequesPagosAutorizados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
				if(chequespagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					chequespagosautorizadosTotales=chequespagosautorizados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequesPagosAutorizados chequespagosautorizados:this.chequespagosautorizadoss) {
				if(chequespagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					chequespagosautorizadosTotales=chequespagosautorizados;
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
			this.chequespagosautorizadosAux=new ChequesPagosAutorizados();
			this.chequespagosautorizadosAux.setsType(Constantes2.S_TOTALES);
			this.chequespagosautorizadosAux.setIsNew(false);
			this.chequespagosautorizadosAux.setIsChanged(false);
			this.chequespagosautorizadosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ChequesPagosAutorizadosConstantesFunciones.TotalizarValoresFilaChequesPagosAutorizados(this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss(),this.chequespagosautorizadosAux);
				
				//this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().add(this.chequespagosautorizadosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ChequesPagosAutorizadosConstantesFunciones.TotalizarValoresFilaChequesPagosAutorizados(this.chequespagosautorizadoss,this.chequespagosautorizadosAux);
				
				this.chequespagosautorizadoss.add(this.chequespagosautorizadosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		chequespagosautorizadosTotales=new ChequesPagosAutorizados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().remove(chequespagosautorizadosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.chequespagosautorizadoss.remove(chequespagosautorizadosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		chequespagosautorizadosTotales=new ChequesPagosAutorizados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
				if(chequespagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					chequespagosautorizadosTotales=chequespagosautorizados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ChequesPagosAutorizadosConstantesFunciones.TotalizarValoresFilaChequesPagosAutorizados(this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss(),chequespagosautorizadosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ChequesPagosAutorizados chequespagosautorizados:this.chequespagosautorizadoss) {
				if(chequespagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					chequespagosautorizadosTotales=chequespagosautorizados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ChequesPagosAutorizadosConstantesFunciones.TotalizarValoresFilaChequesPagosAutorizados(this.chequespagosautorizadoss,chequespagosautorizadosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getChequesPagosAutorizadossBusquedaChequesPagosAutorizados()throws Exception {
		try {
			sAccionBusqueda="BusquedaChequesPagosAutorizados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getChequesPagosAutorizadossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getChequesPagosAutorizadossBusquedaChequesPagosAutorizados(String sFinalQuery,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//chequespagosautorizadosLogic.getChequesPagosAutorizadossBusquedaChequesPagosAutorizados(sFinalQuery,this.pagination,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getChequesPagosAutorizadossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//chequespagosautorizadosLogic.getChequesPagosAutorizadossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosChequesPagosAutorizados() {
		this.isPermisoTodoChequesPagosAutorizados=false;
		this.isPermisoNuevoChequesPagosAutorizados=false;
		this.isPermisoActualizarChequesPagosAutorizados=false;
		this.isPermisoActualizarOriginalChequesPagosAutorizados=false;
		this.isPermisoEliminarChequesPagosAutorizados=false;
		this.isPermisoGuardarCambiosChequesPagosAutorizados=false;
		this.isPermisoConsultaChequesPagosAutorizados=true;
		this.isPermisoBusquedaChequesPagosAutorizados=true;
		this.isPermisoReporteChequesPagosAutorizados=true;
		this.isPermisoOrdenChequesPagosAutorizados=false;		
		this.isPermisoPaginacionMedioChequesPagosAutorizados=false;		
		this.isPermisoPaginacionAltoChequesPagosAutorizados=false;		
		this.isPermisoPaginacionTodoChequesPagosAutorizados=false;		
		this.isPermisoCopiarChequesPagosAutorizados=false;		
		this.isPermisoVerFormChequesPagosAutorizados=false;		
		this.isPermisoDuplicarChequesPagosAutorizados=false;
		this.isPermisoOrdenChequesPagosAutorizados=false;
	}
	
	public void setPermisosUsuarioChequesPagosAutorizados(Boolean isPermiso) {
		this.isPermisoTodoChequesPagosAutorizados=isPermiso;
		this.isPermisoNuevoChequesPagosAutorizados=isPermiso;
		this.isPermisoActualizarChequesPagosAutorizados=isPermiso;
		this.isPermisoActualizarOriginalChequesPagosAutorizados=isPermiso;
		this.isPermisoEliminarChequesPagosAutorizados=isPermiso;
		this.isPermisoGuardarCambiosChequesPagosAutorizados=isPermiso;
		this.isPermisoConsultaChequesPagosAutorizados=isPermiso;
		this.isPermisoBusquedaChequesPagosAutorizados=isPermiso;
		this.isPermisoReporteChequesPagosAutorizados=isPermiso;
		this.isPermisoOrdenChequesPagosAutorizados=isPermiso;		
		this.isPermisoPaginacionMedioChequesPagosAutorizados=isPermiso;		
		this.isPermisoPaginacionAltoChequesPagosAutorizados=isPermiso;		
		this.isPermisoPaginacionTodoChequesPagosAutorizados=isPermiso;		
		this.isPermisoCopiarChequesPagosAutorizados=isPermiso;		
		this.isPermisoVerFormChequesPagosAutorizados=isPermiso;		
		this.isPermisoDuplicarChequesPagosAutorizados=isPermiso;
		this.isPermisoOrdenChequesPagosAutorizados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioChequesPagosAutorizados(Boolean isPermiso) {
		//this.isPermisoTodoChequesPagosAutorizados=isPermiso;
		this.isPermisoNuevoChequesPagosAutorizados=isPermiso;
		this.isPermisoActualizarChequesPagosAutorizados=isPermiso;
		this.isPermisoActualizarOriginalChequesPagosAutorizados=isPermiso;
		this.isPermisoEliminarChequesPagosAutorizados=isPermiso;
		this.isPermisoGuardarCambiosChequesPagosAutorizados=isPermiso;
		//this.isPermisoConsultaChequesPagosAutorizados=isPermiso;
		//this.isPermisoBusquedaChequesPagosAutorizados=isPermiso;
		//this.isPermisoReporteChequesPagosAutorizados=isPermiso;
		//this.isPermisoOrdenChequesPagosAutorizados=isPermiso;		
		//this.isPermisoPaginacionMedioChequesPagosAutorizados=isPermiso;		
		//this.isPermisoPaginacionAltoChequesPagosAutorizados=isPermiso;		
		//this.isPermisoPaginacionTodoChequesPagosAutorizados=isPermiso;		
		//this.isPermisoCopiarChequesPagosAutorizados=isPermiso;		
		//this.isPermisoDuplicarChequesPagosAutorizados=isPermiso;
		//this.isPermisoOrdenChequesPagosAutorizados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioChequesPagosAutorizadosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ChequesPagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebChequesPagosAutorizados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioChequesPagosAutorizadosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioChequesPagosAutorizadosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionChequesPagosAutorizadosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioChequesPagosAutorizadosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioChequesPagosAutorizados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ChequesPagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ChequesPagosAutorizadosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoChequesPagosAutorizados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarChequesPagosAutorizados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalChequesPagosAutorizados=this.isPermisoActualizarChequesPagosAutorizados;
			this.isPermisoEliminarChequesPagosAutorizados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosChequesPagosAutorizados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaChequesPagosAutorizados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaChequesPagosAutorizados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoChequesPagosAutorizados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteChequesPagosAutorizados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenChequesPagosAutorizados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioChequesPagosAutorizados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoChequesPagosAutorizados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoChequesPagosAutorizados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarChequesPagosAutorizados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormChequesPagosAutorizados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarChequesPagosAutorizados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenChequesPagosAutorizados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosChequesPagosAutorizados.setToolTipText(this.jTableDatosChequesPagosAutorizados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioChequesPagosAutorizados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioChequesPagosAutorizados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioChequesPagosAutorizados() throws Exception {
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
	public void inicializarCombosForeignKeyChequesPagosAutorizadosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyChequesPagosAutorizadosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ChequesPagosAutorizadosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyChequesPagosAutorizados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.chequespagosautorizadosSessionBean==null) {
				this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean();
			}

			if(!this.chequespagosautorizadosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyChequesPagosAutorizados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyChequesPagosAutorizados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyChequesPagosAutorizados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyChequesPagosAutorizados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyChequesPagosAutorizados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyChequesPagosAutorizados()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyChequesPagosAutorizados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyChequesPagosAutorizados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroChequesPagosAutorizados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyChequesPagosAutorizados()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyChequesPagosAutorizados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyChequesPagosAutorizados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.getItemCount()>0) {
				this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ChequesPagosAutorizadosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ChequesPagosAutorizadosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ChequesPagosAutorizadosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean(); 
		this.chequespagosautorizadosConstantesFunciones=new ChequesPagosAutorizadosConstantesFunciones(); 
		this.chequespagosautorizadosBean=new ChequesPagosAutorizados();//(this.chequespagosautorizadosConstantesFunciones); 		
		this.chequespagosautorizadosReturnGeneral=new ChequesPagosAutorizadosParameterReturnGeneral(); 
		
		this.chequespagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.chequespagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ChequesPagosAutorizadosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ChequesPagosAutorizadosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ChequesPagosAutorizadosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessChequesPagosAutorizados(true);
			
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
			
			this.chequespagosautorizadosConstantesFunciones=new ChequesPagosAutorizadosConstantesFunciones(); 
			this.chequespagosautorizadosBean=new ChequesPagosAutorizados();//this.chequespagosautorizadosConstantesFunciones); 			
			this.chequespagosautorizadosReturnGeneral=new ChequesPagosAutorizadosParameterReturnGeneral(); 
		
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cheques Pagos Autorizados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.chequespagosautorizados=new ChequesPagosAutorizados();
			this.chequespagosautorizadoss = new ArrayList<ChequesPagosAutorizados>();
			this.chequespagosautorizadossAux = new ArrayList<ChequesPagosAutorizados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic=new ChequesPagosAutorizadosLogic();
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			//this.chequespagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.chequespagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormChequesPagosAutorizados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoChequesPagosAutorizados);	
					}
					
					if(this.jInternalFrameImportacionChequesPagosAutorizados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionChequesPagosAutorizados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByChequesPagosAutorizados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByChequesPagosAutorizados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormChequesPagosAutorizados);
				this.jInternalFrameDetalleFormChequesPagosAutorizados.setVisible(false);
				this.jInternalFrameDetalleFormChequesPagosAutorizados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoChequesPagosAutorizados);
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setVisible(false);
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionChequesPagosAutorizados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionChequesPagosAutorizados);
					this.jInternalFrameImportacionChequesPagosAutorizados.setVisible(false);
					this.jInternalFrameImportacionChequesPagosAutorizados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByChequesPagosAutorizados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByChequesPagosAutorizados);
					this.jInternalFrameOrderByChequesPagosAutorizados.setVisible(false);
					this.jInternalFrameOrderByChequesPagosAutorizados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idChequesPagosAutorizadosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ChequesPagosAutorizadosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.chequespagosautorizadosReturnGeneral=new ChequesPagosAutorizadosParameterReturnGeneral();
			
			this.chequespagosautorizadosParameterGeneral=new ChequesPagosAutorizadosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.chequespagosautorizadosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ChequesPagosAutorizadosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),this.chequespagosautorizadosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ChequesPagosAutorizadosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),this.chequespagosautorizadosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaDuplicarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaCopiarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaVerFormChequesPagosAutorizados=true;
			this.isVisibilidadCeldaOrdenChequesPagosAutorizados=true;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
			
			
			this.isVisibilidadBusquedaChequesPagosAutorizados=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosChequesPagosAutorizados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioChequesPagosAutorizados(false);
			
			this.setPermisosUsuarioChequesPagosAutorizados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() 
				|| (this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() && this.chequespagosautorizadosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioChequesPagosAutorizadosClasesRelacionadas();
			}
			
			if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioChequesPagosAutorizadosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosChequesPagosAutorizados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualChequesPagosAutorizados();
			}
			
			if(!this.isPermisoBusquedaChequesPagosAutorizados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ChequesPagosAutorizadosConstantesFunciones.getTiposSeleccionarChequesPagosAutorizados());
				
				this.tiposColumnasSelect=ChequesPagosAutorizadosConstantesFunciones.getTiposSeleccionarChequesPagosAutorizados(true);
				
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
			//if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioChequesPagosAutorizados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioChequesPagosAutorizados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioChequesPagosAutorizados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesChequesPagosAutorizados() ;
			
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
				chequespagosautorizadosImplementable= (ChequesPagosAutorizadosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ChequesPagosAutorizadosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				chequespagosautorizadosImplementableHome= (ChequesPagosAutorizadosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ChequesPagosAutorizadosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.chequespagosautorizadoss= new ArrayList<ChequesPagosAutorizados>();
			this.chequespagosautorizadossEliminados= new ArrayList<ChequesPagosAutorizados>();
						
			this.isEsNuevoChequesPagosAutorizados=false;
			this.esParaAccionDesdeFormularioChequesPagosAutorizados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyChequesPagosAutorizados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroChequesPagosAutorizados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ChequesPagosAutorizadosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingChequesPagosAutorizados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioChequesPagosAutorizados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioChequesPagosAutorizados();
			}
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasChequesPagosAutorizados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasChequesPagosAutorizados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasChequesPagosAutorizados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessChequesPagosAutorizados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ChequesPagosAutorizados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectChequesPagosAutorizados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesChequesPagosAutorizados")) {
				iIndex=this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessChequesPagosAutorizados();	
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
	
	public void cargarCombosForeignKeyChequesPagosAutorizados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyChequesPagosAutorizados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyChequesPagosAutorizados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyChequesPagosAutorizadosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyChequesPagosAutorizados();
		
		this.cargarCombosFrameForeignKeyChequesPagosAutorizados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyChequesPagosAutorizados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyChequesPagosAutorizados();
		}
	}
	
	
	
	public void jButtonNuevoChequesPagosAutorizadosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			
			if(jTableDatosChequesPagosAutorizados.getRowCount()>=1) {
				jTableDatosChequesPagosAutorizados.removeRowSelectionInterval(0, jTableDatosChequesPagosAutorizados.getRowCount()-1);						
			}
			
			this.isEsNuevoChequesPagosAutorizados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoChequesPagosAutorizados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesChequesPagosAutorizados(true);			
			//this.chequespagosautorizados=new ChequesPagosAutorizados();
			//this.chequespagosautorizados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados() ;
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleChequesPagosAutorizados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.chequespagosautorizados);	
			this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);				
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ChequesPagosAutorizados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarChequesPagosAutorizadosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosChequesPagosAutorizados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosChequesPagosAutorizados.getSelectedRows().length;			
			}
			
			chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoChequesPagosAutorizados--;			
				//ChequesPagosAutorizados chequespagosautorizadosAux= new ChequesPagosAutorizados();			
				//chequespagosautorizadosAux.setId(this.iIdNuevoChequesPagosAutorizados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ChequesPagosAutorizados chequespagosautorizadosOrigen=new ChequesPagosAutorizados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ChequesPagosAutorizados chequespagosautorizadosOrigen : chequespagosautorizadossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							chequespagosautorizadosOrigen =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							chequespagosautorizadosOrigen =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaChequesPagosAutorizados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.chequespagosautorizados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosChequesPagosAutorizados(chequespagosautorizadosOrigen,this.chequespagosautorizados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().add(this.chequespagosautorizadosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizadoss.add(this.chequespagosautorizadosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
				
				this.jTableDatosChequesPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoChequesPagosAutorizados(), this.getIndiceNuevoChequesPagosAutorizados());
				
				int iLastRow =  this.jTableDatosChequesPagosAutorizados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosChequesPagosAutorizados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosChequesPagosAutorizados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();									
		
			ChequesPagosAutorizados chequespagosautorizadosOrigen=new ChequesPagosAutorizados();
			ChequesPagosAutorizados chequespagosautorizadosDestino=new ChequesPagosAutorizados();
				
			chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosChequesPagosAutorizados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || chequespagosautorizadossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosChequesPagosAutorizados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequespagosautorizadosOrigen =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						chequespagosautorizadosOrigen =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						chequespagosautorizadosDestino =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						chequespagosautorizadosDestino =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				chequespagosautorizadosOrigen =chequespagosautorizadossSeleccionados.get(0);
				chequespagosautorizadosDestino =chequespagosautorizadossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosChequesPagosAutorizados(chequespagosautorizadosOrigen,chequespagosautorizadosDestino,true,false);
				
				chequespagosautorizadosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(chequespagosautorizadosDestino,chequespagosautorizadosLogic.getChequesPagosAutorizadoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(chequespagosautorizadosDestino,chequespagosautorizadoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
				
				//this.jTableDatosChequesPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoChequesPagosAutorizados(), this.getIndiceNuevoChequesPagosAutorizados());
				
				int iLastRow =  this.jTableDatosChequesPagosAutorizados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosChequesPagosAutorizados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosChequesPagosAutorizados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesChequesPagosAutorizados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(!isVisible);
			this.jPanelPaginacionChequesPagosAutorizados.setVisible(!isVisible);
			this.jPanelAccionesChequesPagosAutorizados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameChequesPagosAutorizados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoChequesPagosAutorizados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionChequesPagosAutorizados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByChequesPagosAutorizados();
			
			this.abrirFrameOrderByChequesPagosAutorizados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByChequesPagosAutorizados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleChequesPagosAutorizados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormChequesPagosAutorizados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormChequesPagosAutorizados.isMaximum()) {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormChequesPagosAutorizados.setSize(this.jInternalFrameDetalleFormChequesPagosAutorizados.iWidthFormulario,this.jInternalFrameDetalleFormChequesPagosAutorizados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormChequesPagosAutorizados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormChequesPagosAutorizados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormChequesPagosAutorizados.isMaximum()) {
						this.jInternalFrameDetalleFormChequesPagosAutorizados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormChequesPagosAutorizados.jContentPaneDetalleChequesPagosAutorizados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormChequesPagosAutorizados.jContentPaneDetalleChequesPagosAutorizados.getWidth(),ChequesPagosAutorizadosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormChequesPagosAutorizados.jContentPaneDetalleChequesPagosAutorizados.getWidth(),ChequesPagosAutorizadosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormChequesPagosAutorizados.jContentPaneDetalleChequesPagosAutorizados.getWidth(),ChequesPagosAutorizadosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormChequesPagosAutorizados.setVisible(true);
	        this.jInternalFrameDetalleFormChequesPagosAutorizados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByChequesPagosAutorizados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByChequesPagosAutorizados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByChequesPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequesPagosAutorizados,false,this);
				} else {
					this.jInternalFrameOrderByChequesPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByChequesPagosAutorizados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByChequesPagosAutorizados);
				this.jInternalFrameOrderByChequesPagosAutorizados.setVisible(false);
				this.jInternalFrameOrderByChequesPagosAutorizados.setSelected(false);
				
				this.jInternalFrameOrderByChequesPagosAutorizados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByChequesPagosAutorizados"));
				
				this.inicializarActualizarBindingTablaOrderByChequesPagosAutorizados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionChequesPagosAutorizados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionChequesPagosAutorizados==null) {
				
				this.jInternalFrameImportacionChequesPagosAutorizados=new ImportacionJInternalFrame(ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionChequesPagosAutorizados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionChequesPagosAutorizados);
				this.jInternalFrameImportacionChequesPagosAutorizados.setVisible(false);
				this.jInternalFrameImportacionChequesPagosAutorizados.setSelected(false);


				this.jInternalFrameImportacionChequesPagosAutorizados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionChequesPagosAutorizados"));
				this.jInternalFrameImportacionChequesPagosAutorizados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionChequesPagosAutorizados"));
				this.jInternalFrameImportacionChequesPagosAutorizados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionChequesPagosAutorizados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoChequesPagosAutorizados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados==null) {
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados=new ReporteDinamicoJInternalFrame(ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoChequesPagosAutorizados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoChequesPagosAutorizados);
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setVisible(false);
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoChequesPagosAutorizados"));
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoChequesPagosAutorizados"));
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoChequesPagosAutorizados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualChequesPagosAutorizados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleChequesPagosAutorizados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormChequesPagosAutorizados);
			
	       	this.jInternalFrameDetalleFormChequesPagosAutorizados.setVisible(false);
	        this.jInternalFrameDetalleFormChequesPagosAutorizados.setSelected(false);
			
			//this.jInternalFrameDetalleFormChequesPagosAutorizados.dispose();
			//this.jInternalFrameDetalleFormChequesPagosAutorizados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoChequesPagosAutorizados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setVisible(true);
	        this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionChequesPagosAutorizados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionChequesPagosAutorizados.setVisible(true);
	        this.jInternalFrameImportacionChequesPagosAutorizados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByChequesPagosAutorizados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByChequesPagosAutorizados.setVisible(true);
	        this.jInternalFrameOrderByChequesPagosAutorizados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByChequesPagosAutorizados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByChequesPagosAutorizados.setVisible(false);
	        this.jInternalFrameOrderByChequesPagosAutorizados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoChequesPagosAutorizados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setVisible(false);
	        this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionChequesPagosAutorizados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionChequesPagosAutorizados.setVisible(false);
	        this.jInternalFrameImportacionChequesPagosAutorizados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarChequesPagosAutorizados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarChequesPagosAutorizados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesChequesPagosAutorizados(true);
			//this.isEsNuevoChequesPagosAutorizados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false) ;
			
			if(chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleChequesPagosAutorizados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaChequesPagosAutorizadosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarChequesPagosAutorizados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesChequesPagosAutorizados(true);
			//this.isEsNuevoChequesPagosAutorizados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.chequespagosautorizados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false) ;
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleChequesPagosAutorizados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesChequesPagosAutorizados(false);
			
			//if(!this.isEsNuevoChequesPagosAutorizados) {								
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				
			}
			
			if(this.permiteMantenimiento(this.chequespagosautorizados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoChequesPagosAutorizados=true;
					this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
					this.isEsNuevoChequesPagosAutorizados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoChequesPagosAutorizados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoChequesPagosAutorizados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(false);
				
				this.habilitarDeshabilitarControlesChequesPagosAutorizados(false);
			
												
				
				if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleChequesPagosAutorizados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,chequespagosautorizadosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualChequesPagosAutorizados(this.chequespagosautorizados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosChequesPagosAutorizados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,chequespagosautorizadosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.chequespagosautorizados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				this.chequespagosautorizados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				this.chequespagosautorizados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.chequespagosautorizados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ChequesPagosAutorizadosModel) this.jTableDatosChequesPagosAutorizados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoChequesPagosAutorizados=true;
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
				this.isEsNuevoChequesPagosAutorizados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(false);
				
				this.habilitarDeshabilitarControlesChequesPagosAutorizados(false);
				
				
				
				if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleChequesPagosAutorizados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosChequesPagosAutorizados.getRowCount()>=1) {
				jTableDatosChequesPagosAutorizados.removeRowSelectionInterval(0, jTableDatosChequesPagosAutorizados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesChequesPagosAutorizados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(false) ;
			
			this.isEsNuevoChequesPagosAutorizados=false;
			
			if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleChequesPagosAutorizados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingChequesPagosAutorizados(false);
				
				//SI ES MANUAL
				if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualChequesPagosAutorizados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoChequesPagosAutorizados--;			
			//ChequesPagosAutorizados chequespagosautorizadosAux= new ChequesPagosAutorizados();			
			//chequespagosautorizadosAux.setId(this.iIdNuevoChequesPagosAutorizados);
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaChequesPagosAutorizados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
			
			this.chequespagosautorizados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().add(this.chequespagosautorizadosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.chequespagosautorizadoss.add(this.chequespagosautorizadosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			
			this.jTableDatosChequesPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoChequesPagosAutorizados(), this.getIndiceNuevoChequesPagosAutorizados());
			
			int iLastRow =  this.jTableDatosChequesPagosAutorizados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosChequesPagosAutorizados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosChequesPagosAutorizados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
			
			//SI ES MANUAL
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualChequesPagosAutorizados();
			}
			
			//this.abrirFrameTreeChequesPagosAutorizados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionChequesPagosAutorizados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionChequesPagosAutorizados.setFileImportacion(this.jInternalFrameImportacionChequesPagosAutorizados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionChequesPagosAutorizados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionChequesPagosAutorizados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionChequesPagosAutorizados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionChequesPagosAutorizados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		

		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ChequesPagosAutorizadosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ChequesPagosAutorizadosBaseDesign.jrxml";
			
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
			
			this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
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
	
	public void jButtonGenerarExcelReporteDinamicoChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ChequesPagosAutorizadoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(ChequesPagosAutorizados chequespagosautorizados:chequespagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(chequespagosautorizados.getnumero_cuenta());
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
			//	this.getFilaCabeceraExportarExcelChequesPagosAutorizados(row);				
			//	iRow++;
			//}				
			
			//for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelChequesPagosAutorizados(chequespagosautorizadosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
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
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
			
			//SI ES MANUAL
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualChequesPagosAutorizados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
			
			//SI ES MANUAL
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualChequesPagosAutorizados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
			
			//SI ES MANUAL
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualChequesPagosAutorizados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaChequesPagosAutorizados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosChequesPagosAutorizados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosChequesPagosAutorizados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosChequesPagosAutorizados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosChequesPagosAutorizados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosChequesPagosAutorizados.setMinimumSize(dimensionMinimum);
		this.jTableDatosChequesPagosAutorizados.setMaximumSize(dimensionMaximum);
		this.jTableDatosChequesPagosAutorizados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingChequesPagosAutorizados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingChequesPagosAutorizados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingChequesPagosAutorizados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaChequesPagosAutorizados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesChequesPagosAutorizados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasChequesPagosAutorizados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesChequesPagosAutorizados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesChequesPagosAutorizados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualChequesPagosAutorizados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaChequesPagosAutorizados();
		
		this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualChequesPagosAutorizados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesChequesPagosAutorizados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualChequesPagosAutorizados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualChequesPagosAutorizados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosChequesPagosAutorizados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteChequesPagosAutorizados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormChequesPagosAutorizados.jCheckBoxPostAccionNuevoChequesPagosAutorizados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormChequesPagosAutorizados.jCheckBoxPostAccionSinCerrarChequesPagosAutorizados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormChequesPagosAutorizados.jCheckBoxPostAccionSinMensajeChequesPagosAutorizados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosChequesPagosAutorizados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteChequesPagosAutorizados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
				this.jInternalFrameDetalleFormChequesPagosAutorizados.jCheckBoxPostAccionNuevoChequesPagosAutorizados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormChequesPagosAutorizados.jCheckBoxPostAccionSinCerrarChequesPagosAutorizados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormChequesPagosAutorizados.jCheckBoxPostAccionSinMensajeChequesPagosAutorizados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionChequesPagosAutorizados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionChequesPagosAutorizados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesChequesPagosAutorizados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesChequesPagosAutorizados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarChequesPagosAutorizados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesChequesPagosAutorizados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralChequesPagosAutorizados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesChequesPagosAutorizados(Boolean esInicializar) throws Exception {
		try	{	
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualChequesPagosAutorizados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesChequesPagosAutorizados() throws Exception {
		try	{
			if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualChequesPagosAutorizados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleChequesPagosAutorizados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualChequesPagosAutorizados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesChequesPagosAutorizados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesChequesPagosAutorizados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesChequesPagosAutorizados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionChequesPagosAutorizados.addItem(reporte);
			}
			
			
			if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionChequesPagosAutorizados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionChequesPagosAutorizados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesChequesPagosAutorizados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesChequesPagosAutorizados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarChequesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarChequesPagosAutorizados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarChequesPagosAutorizados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualChequesPagosAutorizados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualChequesPagosAutorizados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
				
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ChequesPagosAutorizadosConstantesFunciones.getTiposSeleccionarChequesPagosAutorizados(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ChequesPagosAutorizadosConstantesFunciones.getTiposSeleccionarChequesPagosAutorizados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ChequesPagosAutorizadosConstantesFunciones.getTiposSeleccionarChequesPagosAutorizados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualChequesPagosAutorizados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_desdeBusquedaChequesPagosAutorizados=new Date(this.jDateChooserfecha_desdeBusquedaChequesPagosAutorizadosChequesPagosAutorizados.getDate().getTime());
		this.fecha_hastaBusquedaChequesPagosAutorizados=new Date(this.jDateChooserfecha_hastaBusquedaChequesPagosAutorizadosChequesPagosAutorizados.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasChequesPagosAutorizados(Boolean esInicializar) throws Exception {				
		if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualChequesPagosAutorizados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaChequesPagosAutorizados() throws Exception {
		this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByChequesPagosAutorizados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosChequesPagosAutorizadosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizadosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaChequesPagosAutorizados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=chequespagosautorizadoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosChequesPagosAutorizados.setModel(new ChequesPagosAutorizadosModel(this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosChequesPagosAutorizados.setModel(new ChequesPagosAutorizadosModel(this.chequespagosautorizadoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByChequesPagosAutorizados!=null && this.jInternalFrameOrderByChequesPagosAutorizados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByChequesPagosAutorizados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,chequespagosautorizadosConstantesFunciones.resaltarSeleccionarChequesPagosAutorizados,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,chequespagosautorizadosConstantesFunciones.resaltarSeleccionarChequesPagosAutorizados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_ID));

		if(this.chequespagosautorizadosConstantesFunciones.mostraridChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.chequespagosautorizadosConstantesFunciones.resaltaridChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activaridChequesPagosAutorizados,iSizeTabla,this,true,"idChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltaridChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activaridChequesPagosAutorizados,this,true,"idChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarnombre_clienteChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_clienteChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnombre_clienteChequesPagosAutorizados,iSizeTabla,this,true,"nombre_clienteChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_clienteChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnombre_clienteChequesPagosAutorizados,this,true,"nombre_clienteChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_facturaChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_facturaChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnumero_facturaChequesPagosAutorizados,iSizeTabla,this,true,"numero_facturaChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_facturaChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnumero_facturaChequesPagosAutorizados,this,true,"numero_facturaChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.chequespagosautorizadosConstantesFunciones.mostrardebito_mone_localChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.chequespagosautorizadosConstantesFunciones.resaltardebito_mone_localChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activardebito_mone_localChequesPagosAutorizados,iSizeTabla,this,true,"debito_mone_localChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltardebito_mone_localChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activardebito_mone_localChequesPagosAutorizados,this,true,"debito_mone_localChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarfechaChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarfechaChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarfechaChequesPagosAutorizados,iSizeTabla,this,true,"fechaChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarfechaChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarfechaChequesPagosAutorizados,this,true,"fechaChequesPagosAutorizados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarnombre_bancoChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_bancoChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnombre_bancoChequesPagosAutorizados,iSizeTabla,this,true,"nombre_bancoChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_bancoChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnombre_bancoChequesPagosAutorizados,this,true,"nombre_bancoChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarvalorChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarvalorChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarvalorChequesPagosAutorizados,iSizeTabla,this,true,"valorChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarvalorChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarvalorChequesPagosAutorizados,this,true,"valorChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_chequeChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_chequeChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnumero_chequeChequesPagosAutorizados,iSizeTabla,this,true,"numero_chequeChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_chequeChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnumero_chequeChequesPagosAutorizados,this,true,"numero_chequeChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_cuentaChequesPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_cuentaChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnumero_cuentaChequesPagosAutorizados,iSizeTabla,this,true,"numero_cuentaChequesPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_cuentaChequesPagosAutorizados,this.chequespagosautorizadosConstantesFunciones.activarnumero_cuentaChequesPagosAutorizados,this,true,"numero_cuentaChequesPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ChequesPagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosChequesPagosAutorizados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosChequesPagosAutorizados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosChequesPagosAutorizados.addColumn(tableColumn);
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
			
			this.jTableDatosChequesPagosAutorizados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosChequesPagosAutorizados.moveColumn(this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosChequesPagosAutorizados.moveColumn(this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosChequesPagosAutorizados.moveColumn(this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosChequesPagosAutorizados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosChequesPagosAutorizados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosChequesPagosAutorizados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosChequesPagosAutorizados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosChequesPagosAutorizados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosChequesPagosAutorizados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=chequespagosautorizadosLogic.getChequesPagosAutorizadoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=chequespagosautorizadoss.size()-1;
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
		//this.jTableDatosChequesPagosAutorizados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosChequesPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosChequesPagosAutorizados();
			
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
				
				//this.isEsNuevoChequesPagosAutorizados=false;
					
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
				if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosChequesPagosAutorizados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosChequesPagosAutorizados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.chequespagosautorizados.getsType().equals("DUPLICADO")
				   || this.chequespagosautorizados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoChequesPagosAutorizados=true;
				
				} else {
					this.isEsNuevoChequesPagosAutorizados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					if(this.chequespagosautorizados.getId()>=0 && !this.chequespagosautorizados.getIsNew()) {						
						this.isEsNuevoChequesPagosAutorizados=false;
						
					} else {
						this.isEsNuevoChequesPagosAutorizados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoChequesPagosAutorizados(esRelaciones);						
				
				this.seleccionarChequesPagosAutorizados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.chequespagosautorizados.getId()<0) {
					this.isEsNuevoChequesPagosAutorizados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarChequesPagosAutorizados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarChequesPagosAutorizados(evt,rowIndex);
				}	
				
				if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ChequesPagosAutorizados: " + this.dDif); 
					}
				}								
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarChequesPagosAutorizados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.chequespagosautorizados)) {
					if(this.chequespagosautorizados.getId()>0) {
						this.chequespagosautorizados.setIsDeleted(true);
						
						this.chequespagosautorizadossEliminados.add(this.chequespagosautorizados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().remove(this.chequespagosautorizados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizadoss.remove(this.chequespagosautorizados);				
					}
					
					
					((ChequesPagosAutorizadosModel) this.jTableDatosChequesPagosAutorizados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarChequesPagosAutorizados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoChequesPagosAutorizados) {
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosChequesPagosAutorizados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosChequesPagosAutorizados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesChequesPagosAutorizados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesChequesPagosAutorizados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoChequesPagosAutorizados(chequespagosautorizados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioChequesPagosAutorizados(chequespagosautorizados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyChequesPagosAutorizados(chequespagosautorizados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyChequesPagosAutorizados(chequespagosautorizados);
	}
	
	public void setVariablesObjetoActualToFormularioChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setText(chequespagosautorizados.getId().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setText(chequespagosautorizados.getnombre_cliente());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setText(chequespagosautorizados.getnumero_factura());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setText(chequespagosautorizados.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setDate(chequespagosautorizados.getfecha());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setText(chequespagosautorizados.getnombre_banco());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setText(chequespagosautorizados.getvalor().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setText(chequespagosautorizados.getnumero_cheque());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setText(chequespagosautorizados.getnumero_cuenta());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ChequesPagosAutorizados chequespagosautorizadosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,chequespagosautorizadosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ChequesPagosAutorizados chequespagosautorizadosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				chequespagosautorizadosLocal=this.chequespagosautorizados;
			} else {
				chequespagosautorizadosLocal=this.chequespagosautorizadosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(chequespagosautorizadosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoChequesPagosAutorizados(chequespagosautorizadosLocal,true);
					
					if(chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(chequespagosautorizadosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(chequespagosautorizadosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(chequespagosautorizados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(chequespagosautorizados);
	}
	
	public void setVariablesFormularioToObjetoActualChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(chequespagosautorizados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.getText()==null || this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.getText()=="" || this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.getText()=="Id") {
				this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setText("0");
			}

			if(conColumnasBase) {chequespagosautorizados.setId(Long.parseLong(this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelIdChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setnombre_cliente(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnombre_clienteChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setnumero_factura(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_facturaChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabeldebito_mone_localChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setfecha(this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelfechaChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setnombre_banco(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnombre_bancoChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelvalorChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setnumero_cheque(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_chequeChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			chequespagosautorizados.setnumero_cuenta(this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelnumero_cuentaChequesPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizadosBean,ChequesPagosAutorizados chequespagosautorizados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizadosOrigen,ChequesPagosAutorizados chequespagosautorizados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getId()!=null && !chequespagosautorizadosOrigen.getId().equals(0L))) {chequespagosautorizados.setId(chequespagosautorizadosOrigen.getId());}}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getfecha_desde()!=null && !chequespagosautorizadosOrigen.getfecha_desde().equals(new Date()))) {chequespagosautorizados.setfecha_desde(chequespagosautorizadosOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getfecha_hasta()!=null && !chequespagosautorizadosOrigen.getfecha_hasta().equals(new Date()))) {chequespagosautorizados.setfecha_hasta(chequespagosautorizadosOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getnombre_cliente()!=null && !chequespagosautorizadosOrigen.getnombre_cliente().equals(""))) {chequespagosautorizados.setnombre_cliente(chequespagosautorizadosOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getnumero_factura()!=null && !chequespagosautorizadosOrigen.getnumero_factura().equals(""))) {chequespagosautorizados.setnumero_factura(chequespagosautorizadosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getdebito_mone_local()!=null && !chequespagosautorizadosOrigen.getdebito_mone_local().equals(0.0))) {chequespagosautorizados.setdebito_mone_local(chequespagosautorizadosOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getfecha()!=null && !chequespagosautorizadosOrigen.getfecha().equals(new Date()))) {chequespagosautorizados.setfecha(chequespagosautorizadosOrigen.getfecha());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getnombre_banco()!=null && !chequespagosautorizadosOrigen.getnombre_banco().equals(""))) {chequespagosautorizados.setnombre_banco(chequespagosautorizadosOrigen.getnombre_banco());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getvalor()!=null && !chequespagosautorizadosOrigen.getvalor().equals(0.0))) {chequespagosautorizados.setvalor(chequespagosautorizadosOrigen.getvalor());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getnumero_cheque()!=null && !chequespagosautorizadosOrigen.getnumero_cheque().equals(""))) {chequespagosautorizados.setnumero_cheque(chequespagosautorizadosOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && chequespagosautorizadosOrigen.getnumero_cuenta()!=null && !chequespagosautorizadosOrigen.getnumero_cuenta().equals(""))) {chequespagosautorizados.setnumero_cuenta(chequespagosautorizadosOrigen.getnumero_cuenta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setText(chequespagosautorizados.getId().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setText(chequespagosautorizados.getnombre_cliente());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setText(chequespagosautorizados.getnumero_factura());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setText(chequespagosautorizados.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setDate(chequespagosautorizados.getfecha());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setText(chequespagosautorizados.getnombre_banco());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setText(chequespagosautorizados.getvalor().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setText(chequespagosautorizados.getnumero_cheque());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setText(chequespagosautorizados.getnumero_cuenta());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioChequesPagosAutorizados(ChequesPagosAutorizadosBean chequespagosautorizadosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setText(chequespagosautorizadosBean.getId().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setText(chequespagosautorizadosBean.getnombre_cliente());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setText(chequespagosautorizadosBean.getnumero_factura());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setText(chequespagosautorizadosBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setDate(chequespagosautorizadosBean.getfecha());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setText(chequespagosautorizadosBean.getnombre_banco());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setText(chequespagosautorizadosBean.getvalor().toString());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setText(chequespagosautorizadosBean.getnumero_cheque());
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setText(chequespagosautorizadosBean.getnumero_cuenta());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanChequesPagosAutorizados(ChequesPagosAutorizadosParameterReturnGeneral chequespagosautorizadosReturnGeneral,ChequesPagosAutorizadosBean chequespagosautorizadosBean,Boolean conDefault) throws Exception { 
		try {
			ChequesPagosAutorizados chequespagosautorizadosLocal=new ChequesPagosAutorizados();
			
			chequespagosautorizadosLocal=chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && chequespagosautorizadosLocal.getId()!=null && !chequespagosautorizadosLocal.getId().equals(0L))) {chequespagosautorizadosBean.setId(chequespagosautorizadosLocal.getId());}}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getnombre_cliente()!=null && !chequespagosautorizadosLocal.getnombre_cliente().equals(""))) {chequespagosautorizadosBean.setnombre_cliente(chequespagosautorizadosLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getnumero_factura()!=null && !chequespagosautorizadosLocal.getnumero_factura().equals(""))) {chequespagosautorizadosBean.setnumero_factura(chequespagosautorizadosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getdebito_mone_local()!=null && !chequespagosautorizadosLocal.getdebito_mone_local().equals(0.0))) {chequespagosautorizadosBean.setdebito_mone_local(chequespagosautorizadosLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getfecha()!=null && !chequespagosautorizadosLocal.getfecha().equals(new Date()))) {chequespagosautorizadosBean.setfecha(chequespagosautorizadosLocal.getfecha());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getnombre_banco()!=null && !chequespagosautorizadosLocal.getnombre_banco().equals(""))) {chequespagosautorizadosBean.setnombre_banco(chequespagosautorizadosLocal.getnombre_banco());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getvalor()!=null && !chequespagosautorizadosLocal.getvalor().equals(0.0))) {chequespagosautorizadosBean.setvalor(chequespagosautorizadosLocal.getvalor());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getnumero_cheque()!=null && !chequespagosautorizadosLocal.getnumero_cheque().equals(""))) {chequespagosautorizadosBean.setnumero_cheque(chequespagosautorizadosLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && chequespagosautorizadosLocal.getnumero_cuenta()!=null && !chequespagosautorizadosLocal.getnumero_cuenta().equals(""))) {chequespagosautorizadosBean.setnumero_cuenta(chequespagosautorizadosLocal.getnumero_cuenta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxChequesPagosAutorizadosGenerico(Long idChequesPagosAutorizadosSeleccionado,JComboBox jComboBoxChequesPagosAutorizados,List<ChequesPagosAutorizados> chequespagosautorizadossLocal)throws Exception {
		try {
			ChequesPagosAutorizados  chequespagosautorizadosTemp=null;

			for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossLocal) {
				if(chequespagosautorizadosAux.getId()!=null && chequespagosautorizadosAux.getId().equals(idChequesPagosAutorizadosSeleccionado)) {
					chequespagosautorizadosTemp=chequespagosautorizadosAux;
					break;
				}
			}

			jComboBoxChequesPagosAutorizados.setSelectedItem(chequespagosautorizadosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxChequesPagosAutorizadosGenerico(JComboBox jComboBoxChequesPagosAutorizados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxChequesPagosAutorizados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxChequesPagosAutorizados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxChequesPagosAutorizados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxChequesPagosAutorizados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			chequespagosautorizados=(ChequesPagosAutorizados) chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			chequespagosautorizados =(ChequesPagosAutorizados) chequespagosautorizadoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!chequespagosautorizados.getIsNew() && !chequespagosautorizados.getIsChanged() && !chequespagosautorizados.getIsDeleted()) {
				sDescripcion=chequespagosautorizados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=chequespagosautorizados.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ChequesPagosAutorizados chequespagosautorizadosRow=new ChequesPagosAutorizados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			chequespagosautorizadosRow=(ChequesPagosAutorizados) chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			chequespagosautorizadosRow=(ChequesPagosAutorizados) chequespagosautorizadoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualChequesPagosAutorizados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados));			
			this.jButtonDuplicarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaDuplicarChequesPagosAutorizados && this.isPermisoDuplicarChequesPagosAutorizados));			
			this.jButtonCopiarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaCopiarChequesPagosAutorizados && this.isPermisoCopiarChequesPagosAutorizados));
			this.jButtonVerFormChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaVerFormChequesPagosAutorizados && this.isPermisoVerFormChequesPagosAutorizados));
			
			this.jButtonAbrirOrderByChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenChequesPagosAutorizados && this.isPermisoOrdenChequesPagosAutorizados));			
			
			this.jButtonNuevoRelacionesChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados));			
			this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaModificarChequesPagosAutorizados && this.isPermisoActualizarChequesPagosAutorizados));	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaActualizarChequesPagosAutorizados && this.isPermisoActualizarChequesPagosAutorizados));	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaEliminarChequesPagosAutorizados && this.isPermisoEliminarChequesPagosAutorizados));
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarChequesPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarChequesPagosAutorizados);							
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));			
			
			}
						
			this.jButtonGuardarCambiosTablaChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados));						
			this.jButtonDuplicarToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaDuplicarChequesPagosAutorizados && this.isPermisoDuplicarChequesPagosAutorizados));						
			this.jButtonCopiarToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaCopiarChequesPagosAutorizados && this.isPermisoCopiarChequesPagosAutorizados));			
			this.jButtonVerFormToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaVerFormChequesPagosAutorizados && this.isPermisoVerFormChequesPagosAutorizados));			
			this.jButtonAbrirOrderByToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenChequesPagosAutorizados && this.isPermisoOrdenChequesPagosAutorizados));
			this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados));			
			this.jButtonNuevoGuardarCambiosToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));			
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaModificarChequesPagosAutorizados && this.isPermisoActualizarChequesPagosAutorizados));	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaActualizarChequesPagosAutorizados  && this.isPermisoActualizarChequesPagosAutorizados));	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaEliminarChequesPagosAutorizados && this.isPermisoEliminarChequesPagosAutorizados));
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarToolBarChequesPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarChequesPagosAutorizados);				
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados));			
			this.jMenuItemDuplicarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaDuplicarChequesPagosAutorizados && this.isPermisoDuplicarChequesPagosAutorizados));			
			this.jMenuItemCopiarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaCopiarChequesPagosAutorizados && this.isPermisoCopiarChequesPagosAutorizados));			
			this.jMenuItemVerFormChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaVerFormChequesPagosAutorizados && this.isPermisoVerFormChequesPagosAutorizados));			
			this.jMenuItemAbrirOrderByChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenChequesPagosAutorizados && this.isPermisoOrdenChequesPagosAutorizados));			
			//this.jMenuItemMostrarOcultarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenChequesPagosAutorizados && this.isPermisoOrdenChequesPagosAutorizados));
			this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenChequesPagosAutorizados && this.isPermisoOrdenChequesPagosAutorizados));			
			//this.jMenuItemDetalleMostrarOcultarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenChequesPagosAutorizados && this.isPermisoOrdenChequesPagosAutorizados));			
			this.jMenuItemNuevoRelacionesChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados));			
			this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoChequesPagosAutorizados && this.isPermisoNuevoChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));									
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemModificarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaModificarChequesPagosAutorizados && this.isPermisoActualizarChequesPagosAutorizados));	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemActualizarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaActualizarChequesPagosAutorizados && this.isPermisoActualizarChequesPagosAutorizados));	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemEliminarChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaEliminarChequesPagosAutorizados && this.isPermisoEliminarChequesPagosAutorizados));
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemCancelarChequesPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarChequesPagosAutorizados);				
			}
			
			this.jMenuItemGuardarCambiosChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));						
			this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=this.jButtonNuevoChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaDuplicarChequesPagosAutorizados=this.jButtonDuplicarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCopiarChequesPagosAutorizados=this.jButtonCopiarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaVerFormChequesPagosAutorizados=this.jButtonVerFormChequesPagosAutorizados.isVisible();
			
			this.isVisibilidadCeldaOrdenChequesPagosAutorizados=this.jButtonAbrirOrderByChequesPagosAutorizados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=this.jButtonNuevoRelacionesChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=this.jButtonModificarChequesPagosAutorizados.isVisible();
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaGuardarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=this.jButtonGuardarCambiosTablaChequesPagosAutorizados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=this.jButtonNuevoToolBarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados.isVisible();
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarToolBarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarToolBarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarToolBarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarToolBarChequesPagosAutorizados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarChequesPagosAutorizados=this.jButtonGuardarCambiosToolBarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=this.jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=this.jMenuItemNuevoChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=this.jMenuItemNuevoRelacionesChequesPagosAutorizados.isVisible();
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemModificarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemActualizarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemEliminarChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemCancelarChequesPagosAutorizados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarChequesPagosAutorizados=this.jMenuItemGuardarCambiosChequesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesChequesPagosAutorizados(Boolean esInicializar) {
		if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
				//if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesChequesPagosAutorizados();
			}
			
			this.inicializarActualizarBindingBotonesManualChequesPagosAutorizados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualChequesPagosAutorizados() {
		this.jButtonNuevoChequesPagosAutorizados.setVisible(this.isPermisoNuevoChequesPagosAutorizados);			
		this.jButtonDuplicarChequesPagosAutorizados.setVisible(this.isPermisoDuplicarChequesPagosAutorizados);			
		this.jButtonCopiarChequesPagosAutorizados.setVisible(this.isPermisoCopiarChequesPagosAutorizados);			
		this.jButtonVerFormChequesPagosAutorizados.setVisible(this.isPermisoVerFormChequesPagosAutorizados);			
		
		this.jButtonAbrirOrderByChequesPagosAutorizados.setVisible(this.isPermisoOrdenChequesPagosAutorizados);					
		
		this.jButtonNuevoRelacionesChequesPagosAutorizados.setVisible(this.isPermisoNuevoChequesPagosAutorizados);			
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarChequesPagosAutorizados.setVisible(this.isPermisoActualizarChequesPagosAutorizados);	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarChequesPagosAutorizados.setVisible(this.isPermisoActualizarChequesPagosAutorizados);	
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarChequesPagosAutorizados.setVisible(this.isPermisoEliminarChequesPagosAutorizados);
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarChequesPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarChequesPagosAutorizados);						
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.setVisible(this.isPermisoGuardarCambiosChequesPagosAutorizados);							
		}
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.setVisible(this.isPermisoActualizarChequesPagosAutorizados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleChequesPagosAutorizados() {
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarChequesPagosAutorizados.setVisible(this.isPermisoActualizarChequesPagosAutorizados);	
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarChequesPagosAutorizados.setVisible(this.isPermisoActualizarChequesPagosAutorizados);	
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarChequesPagosAutorizados.setVisible(this.isPermisoEliminarChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarChequesPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarChequesPagosAutorizados);							
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarChequesPagosAutorizados && this.isPermisoGuardarCambiosChequesPagosAutorizados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosChequesPagosAutorizados() {
		if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualChequesPagosAutorizados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesChequesPagosAutorizados() {
	}
	
	public void jTableDatosChequesPagosAutorizadosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarChequesPagosAutorizados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.chequespagosautorizados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaChequesPagosAutorizadosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebChequesPagosAutorizados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosChequesPagosAutorizados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosChequesPagosAutorizados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.chequespagosautorizadosLogic.getConnexion());

				if(this.chequespagosautorizados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.chequespagosautorizados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderChequesPagosAutorizados=(TitledBorder)this.jScrollPanelDatosChequesPagosAutorizados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderChequesPagosAutorizados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.chequespagosautorizados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.chequespagosautorizados.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.chequespagosautorizados.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.chequespagosautorizados.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.chequespagosautorizados.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.chequespagosautorizados.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.chequespagosautorizados.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.chequespagosautorizados.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.chequespagosautorizados.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.chequespagosautorizados.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaChequesPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.getchequespagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.chequespagosautorizados==null) {
						this.chequespagosautorizados = new ChequesPagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);
				}

				if(this.chequespagosautorizados.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.chequespagosautorizados.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingChequesPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);

			this.getChequesPagosAutorizadossBusquedaChequesPagosAutorizados();

			this.inicializarActualizarBindingChequesPagosAutorizados(false);

			//if(ChequesPagosAutorizadosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaChequesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);

			this.getChequesPagosAutorizadossFK_IdEmpresa();

			this.inicializarActualizarBindingChequesPagosAutorizados(false);

			//if(ChequesPagosAutorizadosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.chequespagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameChequesPagosAutorizados() {
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.setVisible(false);	    			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.dispose();
			this.jInternalFrameDetalleFormChequesPagosAutorizados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
			this.jInternalFrameReporteDinamicoChequesPagosAutorizados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoChequesPagosAutorizados.dispose();
			this.jInternalFrameReporteDinamicoChequesPagosAutorizados=null;
		}
		
		if(this.jInternalFrameImportacionChequesPagosAutorizados!=null) {
			this.jInternalFrameImportacionChequesPagosAutorizados.setVisible(false);	    			
			this.jInternalFrameImportacionChequesPagosAutorizados.dispose();
			this.jInternalFrameImportacionChequesPagosAutorizados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessChequesPagosAutorizados();
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			
			if(sTipo.equals("NuevoChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarChequesPagosAutorizados")) {
				jButtonDuplicarChequesPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarChequesPagosAutorizados")) {
				jButtonCopiarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("VerFormChequesPagosAutorizados")) {
				jButtonVerFormChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarChequesPagosAutorizados")) {
				jButtonDuplicarChequesPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarChequesPagosAutorizados")) {
				jButtonDuplicarChequesPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarChequesPagosAutorizados")) {
				jButtonModificarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarChequesPagosAutorizados")) {
				jButtonModificarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarChequesPagosAutorizados")) {
				jButtonModificarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarChequesPagosAutorizados")) {
				jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarChequesPagosAutorizados")) {
				jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarChequesPagosAutorizados")) {
				jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("EliminarChequesPagosAutorizados")) {
				jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarChequesPagosAutorizados")) {
				jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarChequesPagosAutorizados")) {
				jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CancelarChequesPagosAutorizados")) {
				jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarChequesPagosAutorizados")) {
				jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarChequesPagosAutorizados")) {
				jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CerrarChequesPagosAutorizados")) {
				jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarChequesPagosAutorizados")) {
				jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarChequesPagosAutorizados")) {
				jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarChequesPagosAutorizados")) {
				jButtonMostrarOcultarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarChequesPagosAutorizados")) {
				jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarChequesPagosAutorizados")) {
				jButtonCopiarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarChequesPagosAutorizados")) {
				jButtonVerFormChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarChequesPagosAutorizados")) {
				jButtonCopiarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormChequesPagosAutorizados")) {
				jButtonVerFormChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionChequesPagosAutorizados")) {
				jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarChequesPagosAutorizados")) {
				jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionChequesPagosAutorizados")) {
				jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresChequesPagosAutorizados")) {
				jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarChequesPagosAutorizados")) {
				jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreChequesPagosAutorizados")) {
				jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesChequesPagosAutorizados")) {
				jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarChequesPagosAutorizados")) {
				jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesChequesPagosAutorizados")) {
				jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByChequesPagosAutorizados") || sTipo.equals("MenuItemDetalleAbrirOrderByChequesPagosAutorizados")) {
				jButtonAbrirOrderByChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarChequesPagosAutorizados") || sTipo.equals("MenuItemDetalleMostrarOcultarChequesPagosAutorizados")) {
				jButtonMostrarOcultarChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosChequesPagosAutorizados")) {
				jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarChequesPagosAutorizados")) {
				jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosChequesPagosAutorizados")) {
				jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoChequesPagosAutorizados")) {
				jButtonCerrarReporteDinamicoChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoChequesPagosAutorizados")) {
				jButtonGenerarReporteDinamicoChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoChequesPagosAutorizados")) {
				
				jButtonGenerarExcelReporteDinamicoChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionChequesPagosAutorizados")) {
				jButtonCerrarImportacionChequesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionChequesPagosAutorizados")) {
				
				jButtonGenerarImportacionChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionChequesPagosAutorizados")) {
				
				jButtonAbrirImportacionChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesChequesPagosAutorizados")) {
				jComboBoxTiposAccionesChequesPagosAutorizadosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesChequesPagosAutorizados")) {
				jComboBoxTiposRelacionesChequesPagosAutorizadosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioChequesPagosAutorizados")) {
				jComboBoxTiposAccionesChequesPagosAutorizadosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarChequesPagosAutorizados")) {
				
				jComboBoxTiposSeleccionarChequesPagosAutorizadosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralChequesPagosAutorizados")) {
				jTextFieldValorCampoGeneralChequesPagosAutorizadosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByChequesPagosAutorizados")) {
				jButtonAbrirOrderByChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarChequesPagosAutorizados")) {
				jButtonAbrirOrderByChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByChequesPagosAutorizados")) {
				jButtonCerrarOrderByChequesPagosAutorizadosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idChequesPagosAutorizadosBusqueda")) {
				this.jButtonidChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaChequesPagosAutorizadosUpdate")) {
				this.jButtonid_empresaChequesPagosAutorizadosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaChequesPagosAutorizadosBusqueda")) {
				this.jButtonid_empresaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeChequesPagosAutorizadosBusqueda")) {
				this.jButtonfecha_desdeChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaChequesPagosAutorizadosBusqueda")) {
				this.jButtonfecha_hastaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteChequesPagosAutorizadosBusqueda")) {
				this.jButtonnombre_clienteChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaChequesPagosAutorizadosBusqueda")) {
				this.jButtonnumero_facturaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localChequesPagosAutorizadosBusqueda")) {
				this.jButtondebito_mone_localChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaChequesPagosAutorizadosBusqueda")) {
				this.jButtonfechaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoChequesPagosAutorizadosBusqueda")) {
				this.jButtonnombre_bancoChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorChequesPagosAutorizadosBusqueda")) {
				this.jButtonvalorChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeChequesPagosAutorizadosBusqueda")) {
				this.jButtonnumero_chequeChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaChequesPagosAutorizadosBusqueda")) {
				this.jButtonnumero_cuentaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaChequesPagosAutorizadosChequesPagosAutorizados")) {
				this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizadosActionPerformed(evt);
			}
			
			;
			
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessChequesPagosAutorizados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ChequesPagosAutorizados chequespagosautorizadosLocal=null;
			
			if(!this.getEsControlTabla()) {
				chequespagosautorizadosLocal=this.chequespagosautorizados;
			} else {
				chequespagosautorizadosLocal=this.chequespagosautorizadosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
							
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
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
			
			


			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
								
						
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
								
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
							
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
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
			
			


			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
								
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosChequesPagosAutorizados")) {
					jCheckBoxSeleccionarTodosChequesPagosAutorizadosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosChequesPagosAutorizados")) {
					jCheckBoxSeleccionadosChequesPagosAutorizadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarChequesPagosAutorizados")) {
					
				}
				
				


				
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
												
				
				


				
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
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
			
			


			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.chequespagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.chequespagosautorizados);
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
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
				
				


				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ChequesPagosAutorizados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ChequesPagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaChequesPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.chequespagosautorizadosAnterior =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarChequesPagosAutorizados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosChequesPagosAutorizadosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosChequesPagosAutorizados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.chequespagosautorizados =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.chequespagosautorizados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarChequesPagosAutorizados")) {
				
				}
				
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarChequesPagosAutorizados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosChequesPagosAutorizados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarChequesPagosAutorizados")) {
			
			}
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessChequesPagosAutorizados();
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			if(sTipo.equals("NuevoChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarChequesPagosAutorizados")) {
				jButtonDuplicarChequesPagosAutorizadosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarChequesPagosAutorizados")) {
				jButtonCopiarChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormChequesPagosAutorizados")) {
				jButtonVerFormChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesChequesPagosAutorizados")) {
				jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarChequesPagosAutorizados")) {
				jButtonModificarChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarChequesPagosAutorizados")) {
				jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarChequesPagosAutorizados")) {
				jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarChequesPagosAutorizados")) {
				jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarChequesPagosAutorizados")) {
				jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosChequesPagosAutorizados")) {
				jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosChequesPagosAutorizados")) {
				jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByChequesPagosAutorizados")) {
				jButtonAbrirOrderByChequesPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionChequesPagosAutorizados")) {
				jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresChequesPagosAutorizados")) {
				jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesChequesPagosAutorizados")) {
				jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idChequesPagosAutorizadosBusqueda")) {
				this.jButtonidChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaChequesPagosAutorizadosUpdate")) {
				this.jButtonid_empresaChequesPagosAutorizadosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaChequesPagosAutorizadosBusqueda")) {
				this.jButtonid_empresaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeChequesPagosAutorizadosBusqueda")) {
				this.jButtonfecha_desdeChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaChequesPagosAutorizadosBusqueda")) {
				this.jButtonfecha_hastaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteChequesPagosAutorizadosBusqueda")) {
				this.jButtonnombre_clienteChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaChequesPagosAutorizadosBusqueda")) {
				this.jButtonnumero_facturaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localChequesPagosAutorizadosBusqueda")) {
				this.jButtondebito_mone_localChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaChequesPagosAutorizadosBusqueda")) {
				this.jButtonfechaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoChequesPagosAutorizadosBusqueda")) {
				this.jButtonnombre_bancoChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorChequesPagosAutorizadosBusqueda")) {
				this.jButtonvalorChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeChequesPagosAutorizadosBusqueda")) {
				this.jButtonnumero_chequeChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaChequesPagosAutorizadosBusqueda")) {
				this.jButtonnumero_cuentaChequesPagosAutorizadosBusquedaActionPerformed(evt);
			}
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessChequesPagosAutorizados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameChequesPagosAutorizados")) {
				closingInternalFrameChequesPagosAutorizados();
				
			} else if(sTipo.equals("jButtonCancelarChequesPagosAutorizados")) {
				JInternalFrameBase jInternalFrameDetalleFormChequesPagosAutorizados = (JInternalFrameBase)evt.getSource();
	            	
	            ChequesPagosAutorizadosBeanSwingJInternalFrame jInternalFrameParent=(ChequesPagosAutorizadosBeanSwingJInternalFrame)jInternalFrameDetalleFormChequesPagosAutorizados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarChequesPagosAutorizadosActionPerformed(null);
			}
			
			ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.chequespagosautorizados,new Object(),this.chequespagosautorizadosParameterGeneral,this.chequespagosautorizadosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormChequesPagosAutorizados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormChequesPagosAutorizados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormChequesPagosAutorizados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.chequespagosautorizados)) {
			if(!esControlTabla) {
				if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);			
				}
				
				if(this.chequespagosautorizadosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral,this.chequespagosautorizadosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.chequespagosautorizadosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanChequesPagosAutorizados(classes,this.chequespagosautorizadosReturnGeneral,this.chequespagosautorizadosBean,false);
					}
						
					if(this.chequespagosautorizadosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados());	
					}
						
					if(this.chequespagosautorizadosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados(),classes);//this.chequespagosautorizadosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioChequesPagosAutorizados(this.chequespagosautorizados,classes);//this.chequespagosautorizadosBean);									
				}
			
				if(ChequesPagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualChequesPagosAutorizados(this.chequespagosautorizados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysChequesPagosAutorizados(this.chequespagosautorizados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.chequespagosautorizadosAnterior!=null) {
						this.chequespagosautorizados=this.chequespagosautorizadosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.chequespagosautorizadosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados(),chequespagosautorizadosLogic.getChequesPagosAutorizadoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizados(),this.chequespagosautorizadoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosChequesPagosAutorizados.repaint();
				
				//((AbstractTableModel) this.jTableDatosChequesPagosAutorizados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosChequesPagosAutorizados();
			}
		}
	}
	
	public void actualizarVisualTableDatosChequesPagosAutorizados() throws Exception {
		
		ChequesPagosAutorizadosModel chequespagosautorizadosModel=(ChequesPagosAutorizadosModel)this.jTableDatosChequesPagosAutorizados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			chequespagosautorizadosModel.chequespagosautorizadoss=this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			chequespagosautorizadosModel.chequespagosautorizadoss=this.chequespagosautorizadoss;
		}
		
		
		((ChequesPagosAutorizadosModel) this.jTableDatosChequesPagosAutorizados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaChequesPagosAutorizados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getchequespagosautorizadosAnterior(),this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getchequespagosautorizadosAnterior(),this.chequespagosautorizadoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosChequesPagosAutorizados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
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
										
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.chequespagosautorizados,new Object(),generalEntityParameterGeneral,this.chequespagosautorizadosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ChequesPagosAutorizadosConstantesFunciones.getClassesRelationshipsOfChequesPagosAutorizados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ChequesPagosAutorizadosConstantesFunciones.getClassesRelationshipsFromStringsOfChequesPagosAutorizados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormChequesPagosAutorizados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.chequespagosautorizados,new Object(),generalEntityParameterGeneral,this.chequespagosautorizadosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioChequesPagosAutorizados(ChequesPagosAutorizadosBean chequespagosautorizadosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanChequesPagosAutorizados(ArrayList<Classe> classes,ChequesPagosAutorizadosReturnGeneral chequespagosautorizadosReturnGeneral,ChequesPagosAutorizadosBean chequespagosautorizadosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.chequespagosautorizados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados = new ChequesPagosAutorizadosDetalleFormJInternalFrame(jDesktopPane,this.chequespagosautorizadosSessionBean.getConGuardarRelaciones(),this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.setVisible(false);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.setSelected(false);						
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.chequespagosautorizadosLogic=this.chequespagosautorizadosLogic;
		
		this.cargarCombosFrameForeignKeyChequesPagosAutorizados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleChequesPagosAutorizados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleChequesPagosAutorizados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyChequesPagosAutorizados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyChequesPagosAutorizados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarChequesPagosAutorizados"));
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarChequesPagosAutorizados"));

		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarToolBarChequesPagosAutorizados"));
					
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemModificarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"MenuItemModificarChequesPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"ActualizarChequesPagosAutorizados"));
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarChequesPagosAutorizados"));
						
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemActualizarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarChequesPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarChequesPagosAutorizados"));
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarToolBarChequesPagosAutorizados"));
								
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemEliminarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarChequesPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarChequesPagosAutorizados"));
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarToolBarChequesPagosAutorizados"));
					
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemCancelarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarChequesPagosAutorizados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemDetalleCerrarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarChequesPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarChequesPagosAutorizados"));
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarChequesPagosAutorizados"));
		
		
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioChequesPagosAutorizados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonidChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"idChequesPagosAutorizadosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonid_empresaChequesPagosAutorizadosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaChequesPagosAutorizadosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonid_empresaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfechaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fechaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonvalorChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valorChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaChequesPagosAutorizadosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesChequesPagosAutorizados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameChequesPagosAutorizados"));
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarChequesPagosAutorizados"));
		}
		
		this.jTableDatosChequesPagosAutorizados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarChequesPagosAutorizados"));
		
		this.jTableDatosChequesPagosAutorizados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarChequesPagosAutorizados"));
		
		this.jButtonNuevoChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"NuevoChequesPagosAutorizados"));
		
		this.jButtonDuplicarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"DuplicarChequesPagosAutorizados"));
		
		this.jButtonCopiarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"CopiarChequesPagosAutorizados"));
		
		this.jButtonVerFormChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"VerFormChequesPagosAutorizados"));
		
		
		this.jButtonNuevoToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"NuevoToolBarChequesPagosAutorizados"));
			
		this.jButtonDuplicarToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarChequesPagosAutorizados"));
			
		this.jMenuItemNuevoChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoChequesPagosAutorizados"));
			
		this.jMenuItemDuplicarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarChequesPagosAutorizados"));		
		
		
		this.jButtonNuevoRelacionesChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesChequesPagosAutorizados"));
		
		
		this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarChequesPagosAutorizados"));
			
		this.jMenuItemNuevoRelacionesChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesChequesPagosAutorizados"));		
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarChequesPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonModificarToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarToolBarChequesPagosAutorizados"));
			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemModificarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"MenuItemModificarChequesPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"ActualizarChequesPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonActualizarToolBarChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarChequesPagosAutorizados"));
				
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemActualizarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarChequesPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarChequesPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonEliminarToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarToolBarChequesPagosAutorizados"));
						
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemEliminarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarChequesPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarChequesPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonCancelarToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarToolBarChequesPagosAutorizados"));
			
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemCancelarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarChequesPagosAutorizados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarChequesPagosAutorizados"));		
		
		
		this.jButtonCerrarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CerrarChequesPagosAutorizados"));
		
		
		this.jButtonCerrarToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CerrarToolBarChequesPagosAutorizados"));
			
		this.jMenuItemCerrarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarChequesPagosAutorizados"));
			
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jMenuItemDetalleCerrarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarChequesPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosChequesPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarChequesPagosAutorizados"));
		}
		
		this.jButtonCopiarToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CopiarToolBarChequesPagosAutorizados"));
			
		this.jButtonVerFormToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"VerFormToolBarChequesPagosAutorizados"));
		
		this.jMenuItemGuardarCambiosChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosChequesPagosAutorizados"));
			
		this.jMenuItemCopiarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarChequesPagosAutorizados"));		
		
		this.jMenuItemVerFormChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormChequesPagosAutorizados"));		
		
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaChequesPagosAutorizados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarChequesPagosAutorizados"));
			
		this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaChequesPagosAutorizados"));		
		
		
		
		this.jButtonRecargarInformacionChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"RecargarInformacionChequesPagosAutorizados"));
					
		this.jButtonRecargarInformacionToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarChequesPagosAutorizados"));
		
		this.jMenuItemRecargarInformacionChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionChequesPagosAutorizados"));		
		
		
		
		this.jButtonAnterioresChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"AnterioresChequesPagosAutorizados"));
		
		
		this.jButtonAnterioresToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarChequesPagosAutorizados"));
		
		this.jMenuItemAnterioresChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresChequesPagosAutorizados"));		
		
		
		this.jButtonSiguientesChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"SiguientesChequesPagosAutorizados"));
		
		
		this.jButtonSiguientesToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarChequesPagosAutorizados"));
			
		this.jMenuItemSiguientesChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesChequesPagosAutorizados"));
			
		this.jMenuItemAbrirOrderByChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByChequesPagosAutorizados"));
			
		this.jMenuItemMostrarOcultarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarChequesPagosAutorizados"));
			
		this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByChequesPagosAutorizados"));
			
		this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarChequesPagosAutorizados"));		
		
		
		this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosChequesPagosAutorizados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarChequesPagosAutorizados"));
			
		this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosChequesPagosAutorizados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosChequesPagosAutorizados"));

		this.jCheckBoxSeleccionadosChequesPagosAutorizados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosChequesPagosAutorizados"));
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioChequesPagosAutorizados"));
		}
		
		
		this.jComboBoxTiposRelacionesChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposRelacionesChequesPagosAutorizados"));
			
		this.jComboBoxTiposAccionesChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposAccionesChequesPagosAutorizados"));
					
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarChequesPagosAutorizados"));
			
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralChequesPagosAutorizados"));		
		
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonidChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"idChequesPagosAutorizadosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonid_empresaChequesPagosAutorizadosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaChequesPagosAutorizadosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonid_empresaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfechaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fechaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonvalorChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valorChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaChequesPagosAutorizadosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"BusquedaChequesPagosAutorizadosChequesPagosAutorizados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoChequesPagosAutorizados!=null) {
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoChequesPagosAutorizados"));
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoChequesPagosAutorizados"));
				this.jInternalFrameReporteDinamicoChequesPagosAutorizados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoChequesPagosAutorizados"));
			}
			
			//this.jButtonCerrarReporteDinamicoChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoChequesPagosAutorizados"));				
			//this.jButtonGenerarReporteDinamicoChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoChequesPagosAutorizados"));
			//this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoChequesPagosAutorizados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionChequesPagosAutorizados!=null) {
				this.jInternalFrameImportacionChequesPagosAutorizados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionChequesPagosAutorizados"));
				this.jInternalFrameImportacionChequesPagosAutorizados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionChequesPagosAutorizados"));
				this.jInternalFrameImportacionChequesPagosAutorizados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionChequesPagosAutorizados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"AbrirOrderByChequesPagosAutorizados"));
			
			this.jButtonAbrirOrderByToolBarChequesPagosAutorizados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarChequesPagosAutorizados"));			
			
			if(this.jInternalFrameOrderByChequesPagosAutorizados!=null) {
				this.jInternalFrameOrderByChequesPagosAutorizados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByChequesPagosAutorizados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormChequesPagosAutorizados.jTabbedPaneRelacionesChequesPagosAutorizados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesChequesPagosAutorizados"));
		
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
            		closingInternalFrameChequesPagosAutorizados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormChequesPagosAutorizados = (JInternalFrameBase)event.getSource();
	            	
	            ChequesPagosAutorizadosBeanSwingJInternalFrame jInternalFrameParent=(ChequesPagosAutorizadosBeanSwingJInternalFrame)jInternalFrameDetalleFormChequesPagosAutorizados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarChequesPagosAutorizadosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosChequesPagosAutorizados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosChequesPagosAutorizadosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosChequesPagosAutorizados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosChequesPagosAutorizados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoChequesPagosAutorizados";
		inputMap = this.jButtonNuevoChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesChequesPagosAutorizados";
		inputMap = this.jButtonNuevoRelacionesChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoChequesPagosAutorizadosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarChequesPagosAutorizados";
		inputMap = this.jButtonModificarChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarChequesPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarChequesPagosAutorizados";
		inputMap = this.jButtonActualizarChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarChequesPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarChequesPagosAutorizados";
		inputMap = this.jButtonEliminarChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarChequesPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarChequesPagosAutorizados";
		inputMap = this.jButtonCancelarChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarChequesPagosAutorizados";
		inputMap = this.jButtonCerrarChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarChequesPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosChequesPagosAutorizados";
		inputMap = this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonGuardarCambiosChequesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosChequesPagosAutorizados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosChequesPagosAutorizadosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesChequesPagosAutorizados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesChequesPagosAutorizadosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarChequesPagosAutorizados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarChequesPagosAutorizadosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralChequesPagosAutorizados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralChequesPagosAutorizadosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonidChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"idChequesPagosAutorizadosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonid_empresaChequesPagosAutorizadosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaChequesPagosAutorizadosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonid_empresaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonfechaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fechaChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonvalorChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valorChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeChequesPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaChequesPagosAutorizadosBusqueda"));
		
		
		this.jButtonBusquedaChequesPagosAutorizadosChequesPagosAutorizados.addActionListener(new ButtonActionListener(this,"BusquedaChequesPagosAutorizadosChequesPagosAutorizados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionChequesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionChequesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarChequesPagosAutorizadosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarChequesPagosAutorizados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosChequesPagosAutorizados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
					chequespagosautorizadosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadoss) {
					chequespagosautorizadosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosChequesPagosAutorizadosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
						chequespagosautorizadosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadoss) {
						chequespagosautorizadosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosChequesPagosAutorizados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosChequesPagosAutorizados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosChequesPagosAutorizadosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosChequesPagosAutorizados.getSelectedRows();
			
			ChequesPagosAutorizados chequespagosautorizadosLocal=new ChequesPagosAutorizados();
			
			//this.seleccionarTodosChequesPagosAutorizados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					chequespagosautorizadosLocal =(ChequesPagosAutorizados) this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss().toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					chequespagosautorizadosLocal =(ChequesPagosAutorizados) this.chequespagosautorizadoss.toArray()[this.jTableDatosChequesPagosAutorizados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				chequespagosautorizadosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
						chequespagosautorizadosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadoss) {
						chequespagosautorizadosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosChequesPagosAutorizados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosChequesPagosAutorizados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosChequesPagosAutorizados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualChequesPagosAutorizadosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarChequesPagosAutorizadosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralChequesPagosAutorizadosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralChequesPagosAutorizados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
				
						if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							chequespagosautorizadosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							chequespagosautorizadosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							chequespagosautorizadosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							chequespagosautorizadosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							chequespagosautorizadosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							chequespagosautorizadosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							chequespagosautorizadosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							chequespagosautorizadosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							chequespagosautorizadosAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							chequespagosautorizadosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadoss) {
					
						if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							chequespagosautorizadosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							chequespagosautorizadosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							chequespagosautorizadosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							chequespagosautorizadosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							chequespagosautorizadosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							chequespagosautorizadosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							chequespagosautorizadosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							chequespagosautorizadosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							chequespagosautorizadosAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							chequespagosautorizadosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesChequesPagosAutorizadosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioChequesPagosAutorizados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesChequesPagosAutorizados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteChequesPagosAutorizados) {				
					conSplash=true;//false;										
					
					//this.startProcessChequesPagosAutorizados(conSplash);
				
					this.generarReporteChequesPagosAutorizadossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoChequesPagosAutorizadossSeleccionados();
				//this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoChequesPagosAutorizadossSeleccionados(false);
				//this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoChequesPagosAutorizadossSeleccionados(true);
				//this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessChequesPagosAutorizados();
				
				this.exportarChequesPagosAutorizadossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionChequesPagosAutorizadoss();
				//this.importarChequesPagosAutorizadoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessChequesPagosAutorizados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelChequesPagosAutorizadossSeleccionados();
				//this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cheques Pagos Autorizados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessChequesPagosAutorizados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoChequesPagosAutorizados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyChequesPagosAutorizados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
				}	
			} 			
			else if(ChequesPagosAutorizadosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteChequesPagosAutorizados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessChequesPagosAutorizados(conSplash);
					
						//this.actualizarParametrosGeneralChequesPagosAutorizados();
						
						this.generarReporteProcesoAccionChequesPagosAutorizadossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cheques Pagos AutorizadosES SELECCIONADOS?", "MANTENIMIENTO DE Cheques Pagos Autorizados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessChequesPagosAutorizados();
				
						this.actualizarParametrosGeneralChequesPagosAutorizados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.chequespagosautorizadosReturnGeneral=chequespagosautorizadosLogic.procesarAccionChequesPagosAutorizadossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss(),this.chequespagosautorizadosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarChequesPagosAutorizadosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralChequesPagosAutorizados();
					
					ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarChequesPagosAutorizadosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesChequesPagosAutorizados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessChequesPagosAutorizados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesChequesPagosAutorizadosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessChequesPagosAutorizados();
			
			if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
			ChequesPagosAutorizados chequespagosautorizados=new ChequesPagosAutorizados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingChequesPagosAutorizados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesChequesPagosAutorizados.getSelectedItem();
			
			
			
			
			chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
			//this.sTipoAccion;
			
			if(chequespagosautorizadossSeleccionados.size()==1) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossSeleccionados) {
					chequespagosautorizados=chequespagosautorizadosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessChequesPagosAutorizados();
			
      		//this.finishProcessChequesPagosAutorizados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarChequesPagosAutorizadosReturnGeneral() throws Exception {
		if(this.chequespagosautorizadosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.chequespagosautorizadosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.chequespagosautorizadosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.chequespagosautorizadosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.chequespagosautorizadosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.chequespagosautorizadosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
		}
		
		if(this.chequespagosautorizadosReturnGeneral.getConRetornoLista() || this.chequespagosautorizadosReturnGeneral.getConRetornoObjeto()) {
			if(this.chequespagosautorizadosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.chequespagosautorizadosLogic.setChequesPagosAutorizadoss(this.chequespagosautorizadosReturnGeneral.getChequesPagosAutorizadoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingChequesPagosAutorizados(false);
		}
	}
	
	public void actualizarParametrosGeneralChequesPagosAutorizados() throws Exception {
		
		
	}
	
	public ArrayList<ChequesPagosAutorizados> getChequesPagosAutorizadossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioChequesPagosAutorizados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadosLogic.getChequesPagosAutorizadoss()) {
					if(chequespagosautorizadosAux.getIsSelected()) {
						chequespagosautorizadossSeleccionados.add(chequespagosautorizadosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ChequesPagosAutorizados chequespagosautorizadosAux:this.chequespagosautorizadoss) {
					if(chequespagosautorizadosAux.getIsSelected()) {
						chequespagosautorizadossSeleccionados.add(chequespagosautorizadosAux);				
					}
				}
			}
			
			if(chequespagosautorizadossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						chequespagosautorizadossSeleccionados.addAll(this.chequespagosautorizadosLogic.getChequesPagosAutorizadoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						chequespagosautorizadossSeleccionados.addAll(this.chequespagosautorizadoss);				
					}
				}
			}
		} else {
			chequespagosautorizadossSeleccionados.add(this.chequespagosautorizados);
		}
		
		return chequespagosautorizadossSeleccionados;
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
	
	public void generarReporteChequesPagosAutorizadossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalChequesPagosAutorizadossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoChequesPagosAutorizadossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoChequesPagosAutorizadossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoChequesPagosAutorizadossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cheques Pagos Autorizados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesChequesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados);
		
	}	
	
	public void generarReporteNormalChequesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionChequesPagosAutorizadossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoChequesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoChequesPagosAutorizados();
		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoChequesPagosAutorizados();
		
		
		//this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados ,chequespagosautorizadosImplementable,chequespagosautorizadosImplementableHome);
	}
	
	public void mostrarImportacionChequesPagosAutorizadoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionChequesPagosAutorizados();
		
		this.abrirFrameImportacionChequesPagosAutorizados();		
		
			
		//this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados ,chequespagosautorizadosImplementable,chequespagosautorizadosImplementableHome);
	}
	
	public void importarChequesPagosAutorizadoss() throws Exception {		
	
	}
	
	public void exportarChequesPagosAutorizadossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelChequesPagosAutorizadossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoChequesPagosAutorizadossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlChequesPagosAutorizadossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cheques Pagos Autorizados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoChequesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarChequesPagosAutorizados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarChequesPagosAutorizados(chequespagosautorizadosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//chequespagosautorizadosAux.setsDetalleGeneralEntityReporte(chequespagosautorizadosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarChequesPagosAutorizados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=chequespagosautorizados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=chequespagosautorizados.getnumero_cuenta();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelChequesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ChequesPagosAutorizadoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelChequesPagosAutorizados(row);				
				iRow++;
			}				
			
			for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelChequesPagosAutorizados(chequespagosautorizadosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlChequesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();		
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"chequespagosautorizados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("chequespagosautorizadoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("chequespagosautorizados");
			//elementRoot.appendChild(element);
		
			for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossSeleccionados) {
				element = document.createElement("chequespagosautorizados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlChequesPagosAutorizados(chequespagosautorizadosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cheques Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelChequesPagosAutorizados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(chequespagosautorizados.getnumero_cuenta());				
	}
	
	public void setFilaDatosExportarXmlChequesPagosAutorizados(ChequesPagosAutorizados chequespagosautorizados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ChequesPagosAutorizadosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(chequespagosautorizados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ChequesPagosAutorizadosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(chequespagosautorizados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ChequesPagosAutorizadosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(chequespagosautorizados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_desde = document.createElement(ChequesPagosAutorizadosConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(chequespagosautorizados.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(ChequesPagosAutorizadosConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(chequespagosautorizados.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnombre_cliente = document.createElement(ChequesPagosAutorizadosConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(chequespagosautorizados.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnumero_factura = document.createElement(ChequesPagosAutorizadosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(chequespagosautorizados.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementdebito_mone_local = document.createElement(ChequesPagosAutorizadosConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(chequespagosautorizados.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementfecha = document.createElement(ChequesPagosAutorizadosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(chequespagosautorizados.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnombre_banco = document.createElement(ChequesPagosAutorizadosConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(chequespagosautorizados.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementvalor = document.createElement(ChequesPagosAutorizadosConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(chequespagosautorizados.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_cheque = document.createElement(ChequesPagosAutorizadosConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(chequespagosautorizados.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementnumero_cuenta = document.createElement(ChequesPagosAutorizadosConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(chequespagosautorizados.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);
	}
	
	public void generarReporteGroupGenericoChequesPagosAutorizadossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados=new ArrayList<ChequesPagosAutorizados>();
		
		chequespagosautorizadossSeleccionados=this.getChequesPagosAutorizadossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoChequesPagosAutorizados(chequespagosautorizadossSeleccionados);
		
		this.generarReporteChequesPagosAutorizadoss("Todos",chequespagosautorizadossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoChequesPagosAutorizados(ArrayList<ChequesPagosAutorizados> chequespagosautorizadossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ChequesPagosAutorizados chequespagosautorizadosAux:chequespagosautorizadossSeleccionados) {
				chequespagosautorizadosAux.setsDetalleGeneralEntityReporte(chequespagosautorizadosAux.toString());
			
				if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(chequespagosautorizadosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(chequespagosautorizadosAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(chequespagosautorizadosAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(chequespagosautorizadosAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(chequespagosautorizadosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(chequespagosautorizadosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(chequespagosautorizadosAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(chequespagosautorizadosAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					chequespagosautorizadosAux.setsDescripcionGeneralEntityReporte1(chequespagosautorizadosAux.getnumero_cuenta());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ChequesPagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesChequesPagosAutorizados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoChequesPagosAutorizados=true;
				this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=true;
				this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=true;
			}
			
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=true;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=true;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=true;
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
			this.isVisibilidadCeldaModificarChequesPagosAutorizados=true;
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarChequesPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				} else {
					this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=true;
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=true;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=true;
		} else {
			this.actualizarEstadoPanelsChequesPagosAutorizados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarChequesPagosAutorizados=false;
			//this.isVisibilidadCeldaVerFormChequesPagosAutorizados=false;
			this.isVisibilidadCeldaDuplicarChequesPagosAutorizados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
		} else {
			this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			if(!chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;												
			}
			
			this.jButtonCerrarChequesPagosAutorizados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
		}
		
		if(!this.permiteMantenimiento(this.chequespagosautorizados)) {
			this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoChequesPagosAutorizados=false;
		this.isVisibilidadCeldaNuevoRelacionesChequesPagosAutorizados=false;
		this.isVisibilidadCeldaGuardarCambiosChequesPagosAutorizados=false;
		//this.isVisibilidadCeldaModificarChequesPagosAutorizados=true;
		this.isVisibilidadCeldaActualizarChequesPagosAutorizados=false;
		this.isVisibilidadCeldaEliminarChequesPagosAutorizados=false;
		//this.isVisibilidadCeldaCancelarChequesPagosAutorizados=true;			
		this.isVisibilidadCeldaGuardarChequesPagosAutorizados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesChequesPagosAutorizados() {
	}
	
	public void actualizarEstadoPanelsChequesPagosAutorizados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionChequesPagosAutorizados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosChequesPagosAutorizados!=null) {
				this.jScrollPanelDatosChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionChequesPagosAutorizados!=null) {
				this.jPanelPaginacionChequesPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
					this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasChequesPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesChequesPagosAutorizados!=null) {
				this.jPanelParametrosReportesChequesPagosAutorizados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaChequesPagosAutorizados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaChequesPagosAutorizados) {this.jTabbedPaneBusquedasChequesPagosAutorizados.remove(jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados);}
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
			
			this.inicializarActualizarBindingTablaChequesPagosAutorizados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioChequesPagosAutorizados() {
		this.updateBorderResaltarBusquedasFormularioChequesPagosAutorizados();
		this.updateVisibilidadBusquedasFormularioChequesPagosAutorizados();
		this.updateHabilitarBusquedasFormularioChequesPagosAutorizados();
	}
	
	public void updateBorderResaltarBusquedasFormularioChequesPagosAutorizados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponents().length>0) {
	

		if(this.chequespagosautorizadosConstantesFunciones.resaltarBusquedaChequesPagosAutorizadosChequesPagosAutorizados!=null) {
			index= this.jTabbedPaneBusquedasChequesPagosAutorizados.indexOfComponent(this.jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponent(index);
				jPanel.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioChequesPagosAutorizados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasChequesPagosAutorizados.indexOfComponent(this.jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			if(!this.chequespagosautorizadosConstantesFunciones.mostrarBusquedaChequesPagosAutorizadosChequesPagosAutorizados && index>-1) {
				this.jTabbedPaneBusquedasChequesPagosAutorizados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioChequesPagosAutorizados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasChequesPagosAutorizados.indexOfComponent(this.jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
				this.jTabbedPaneBusquedasChequesPagosAutorizados.setEnabledAt(index,this.chequespagosautorizadosConstantesFunciones.activarBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaChequesPagosAutorizados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaChequesPagosAutorizados")) {
			index= this.jTabbedPaneBusquedasChequesPagosAutorizados.indexOfComponent(this.jPanelBusquedaChequesPagosAutorizadosChequesPagosAutorizados);

			this.jTabbedPaneBusquedasChequesPagosAutorizados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasChequesPagosAutorizados.getComponent(index);

			this.chequespagosautorizadosConstantesFunciones.setResaltarBusquedaChequesPagosAutorizadosChequesPagosAutorizados(resaltar);

			jPanel.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarBusquedaChequesPagosAutorizadosChequesPagosAutorizados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarChequesPagosAutorizados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioChequesPagosAutorizados() throws Exception {

		if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioChequesPagosAutorizados();
		this.updateVisibilidadResaltarControlesFormularioChequesPagosAutorizados();
		this.updateHabilitarResaltarControlesFormularioChequesPagosAutorizados();
		
	}
	
	public void updateBorderResaltarControlesFormularioChequesPagosAutorizados() throws Exception {
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.chequespagosautorizadosConstantesFunciones.resaltaridChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltaridChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarid_empresaChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarid_empresaChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarfecha_desdeChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_desdeChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarfecha_desdeChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarfecha_hastaChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_hastaChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarfecha_hastaChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_clienteChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_clienteChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_facturaChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_facturaChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltardebito_mone_localChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltardebito_mone_localChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarfechaChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarfechaChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_bancoChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarnombre_bancoChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarvalorChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarvalorChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_chequeChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_chequeChequesPagosAutorizados);}
		if(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_cuentaChequesPagosAutorizados!=null && this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setBorder(this.chequespagosautorizadosConstantesFunciones.resaltarnumero_cuentaChequesPagosAutorizados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioChequesPagosAutorizados() throws Exception {		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
	
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostraridChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelidChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostraridChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarid_empresaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelid_empresaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarid_empresaChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_desdeChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarfecha_desdeChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelfecha_desdeChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarfecha_desdeChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_hastaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarfecha_hastaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelfecha_hastaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarfecha_hastaChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnombre_clienteChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelnombre_clienteChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnombre_clienteChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_facturaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelnumero_facturaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_facturaChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrardebito_mone_localChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPaneldebito_mone_localChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrardebito_mone_localChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarfechaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelfechaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarfechaChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnombre_bancoChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelnombre_bancoChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnombre_bancoChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarvalorChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelvalorChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarvalorChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_chequeChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelnumero_chequeChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_chequeChequesPagosAutorizados);
		//this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_cuentaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jPanelnumero_cuentaChequesPagosAutorizados.setVisible(this.chequespagosautorizadosConstantesFunciones.mostrarnumero_cuentaChequesPagosAutorizados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioChequesPagosAutorizados() throws Exception {
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormChequesPagosAutorizados!=null) {
	
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jLabelidChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activaridChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jComboBoxid_empresaChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarid_empresaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_desdeChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarfecha_desdeChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfecha_hastaChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarfecha_hastaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_clienteChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarnombre_clienteChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_facturaChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarnumero_facturaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFielddebito_mone_localChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activardebito_mone_localChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jDateChooserfechaChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarfechaChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextAreanombre_bancoChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarnombre_bancoChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldvalorChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarvalorChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_chequeChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarnumero_chequeChequesPagosAutorizados);
		this.jInternalFrameDetalleFormChequesPagosAutorizados.jTextFieldnumero_cuentaChequesPagosAutorizados.setEnabled(this.chequespagosautorizadosConstantesFunciones.activarnumero_cuentaChequesPagosAutorizados);
		}
	}
	
		
}