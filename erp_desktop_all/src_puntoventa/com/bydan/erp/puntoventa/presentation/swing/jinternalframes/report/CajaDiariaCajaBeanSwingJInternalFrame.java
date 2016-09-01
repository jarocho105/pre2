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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.CajaDiariaCajaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.CajaDiariaCajaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.CajaDiariaCajaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.CajaDiariaCajaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajaDiariaCajaBeanSwingJInternalFrame extends CajaDiariaCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaDiariaCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaDiariaCaja> cajadiariacajaValidator = new ClassValidator<CajaDiariaCaja>(CajaDiariaCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaDiariaCaja cajadiariacaja;	
	public CajaDiariaCaja cajadiariacajaAux;
	public CajaDiariaCaja cajadiariacajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaDiariaCaja cajadiariacajaTotales;
	public Long idCajaDiariaCajaActual;
	public Long iIdNuevoCajaDiariaCaja=0L;
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

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoCajaDiariaCaja;
	public Boolean isPermisoNuevoCajaDiariaCaja;
	public Boolean isPermisoActualizarCajaDiariaCaja;
	public Boolean isPermisoActualizarOriginalCajaDiariaCaja;
	public Boolean isPermisoEliminarCajaDiariaCaja;
	public Boolean isPermisoGuardarCambiosCajaDiariaCaja;
	public Boolean isPermisoConsultaCajaDiariaCaja;
	public Boolean isPermisoBusquedaCajaDiariaCaja;
	public Boolean isPermisoReporteCajaDiariaCaja;
	public Boolean isPermisoPaginacionMedioCajaDiariaCaja;
	public Boolean isPermisoPaginacionAltoCajaDiariaCaja;
	public Boolean isPermisoPaginacionTodoCajaDiariaCaja;
	public Boolean isPermisoCopiarCajaDiariaCaja;
	public Boolean isPermisoVerFormCajaDiariaCaja;
	public Boolean isPermisoDuplicarCajaDiariaCaja;
	public Boolean isPermisoOrdenCajaDiariaCaja;
	
	
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
	
	public CajaDiariaCajaParameterReturnGeneral cajadiariacajaReturnGeneral;
	public CajaDiariaCajaParameterReturnGeneral cajadiariacajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaDiariaCaja=false;
	public Boolean esParaAccionDesdeFormularioCajaDiariaCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaDiariaCajaSessionBeanAdditional cajadiariacajaSessionBeanAdditional=null;
	
	public CajaDiariaCajaSessionBeanAdditional getCajaDiariaCajaSessionBeanAdditional() {
		return this.cajadiariacajaSessionBeanAdditional;
	}
	
	public void setCajaDiariaCajaSessionBeanAdditional(CajaDiariaCajaSessionBeanAdditional cajadiariacajaSessionBeanAdditional) {
		try {
			this.cajadiariacajaSessionBeanAdditional=cajadiariacajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaDiariaCajaBeanSwingJInternalFrameAdditional cajadiariacajaBeanSwingJInternalFrameAdditional=null;
	//public class CajaDiariaCajaBeanSwingJInternalFrame
	
	public CajaDiariaCajaBeanSwingJInternalFrameAdditional getCajaDiariaCajaBeanSwingJInternalFrameAdditional() {
		return this.cajadiariacajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaDiariaCajaBeanSwingJInternalFrameAdditional(CajaDiariaCajaBeanSwingJInternalFrameAdditional cajadiariacajaBeanSwingJInternalFrameAdditional) {
		try {
			this.cajadiariacajaBeanSwingJInternalFrameAdditional=cajadiariacajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaDiariaCajaLogic cajadiariacajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaDiariaCaja cajadiariacajaBean;
	public CajaDiariaCajaConstantesFunciones cajadiariacajaConstantesFunciones;
	//public CajaDiariaCajaParameterReturnGeneral cajadiariacajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CajaLogic cajaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<CajaDiariaCaja> cajadiariacajas;	
	//public List<CajaDiariaCaja> cajadiariacajasEliminados;
	//public List<CajaDiariaCaja> cajadiariacajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaDiariaCaja=false;
	public Boolean isVisibilidadCeldaDuplicarCajaDiariaCaja=true;
	public Boolean isVisibilidadCeldaCopiarCajaDiariaCaja=true;
	public Boolean isVisibilidadCeldaVerFormCajaDiariaCaja=true;
	public Boolean isVisibilidadCeldaOrdenCajaDiariaCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
	public Boolean isVisibilidadCeldaModificarCajaDiariaCaja=false;
	public Boolean isVisibilidadCeldaActualizarCajaDiariaCaja=false;
	public Boolean isVisibilidadCeldaEliminarCajaDiariaCaja=false;
	public Boolean isVisibilidadCeldaCancelarCajaDiariaCaja=false;
	public Boolean isVisibilidadCeldaGuardarCajaDiariaCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaCajaDiariaCaja=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCajaDiariaCaja() {
		return this.iIdNuevoCajaDiariaCaja;
	}

	public void setiIdNuevoCajaDiariaCaja(Long iIdNuevoCajaDiariaCaja) {
		this.iIdNuevoCajaDiariaCaja = iIdNuevoCajaDiariaCaja;
	}
	
	public Long getidCajaDiariaCajaActual() {
		return this.idCajaDiariaCajaActual;
	}

	public void setidCajaDiariaCajaActual(Long idCajaDiariaCajaActual) {
		this.idCajaDiariaCajaActual = idCajaDiariaCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaDiariaCaja getcajadiariacaja() {
		return this.cajadiariacaja;
	}

	public void setcajadiariacaja(CajaDiariaCaja cajadiariacaja) {
		this.cajadiariacaja = cajadiariacaja;
	}
	
	public CajaDiariaCaja getcajadiariacajaAux() {
		return this.cajadiariacajaAux;
	}

	public void setcajadiariacajaAux(CajaDiariaCaja cajadiariacajaAux) {
		this.cajadiariacajaAux = cajadiariacajaAux;
	}				
	
	public CajaDiariaCaja getcajadiariacajaAnterior() {
		return this.cajadiariacajaAnterior;
	}

	public void setcajadiariacajaAnterior(CajaDiariaCaja cajadiariacajaAnterior) {
		this.cajadiariacajaAnterior = cajadiariacajaAnterior;
	}	
	
	public CajaDiariaCaja getcajadiariacajaTotales() {
		return this.cajadiariacajaTotales;
	}

	public void setcajadiariacajaTotales(CajaDiariaCaja cajadiariacajaTotales) {
		this.cajadiariacajaTotales = cajadiariacajaTotales;
	}	
	
	public CajaDiariaCaja getcajadiariacajaBean() {
		return this.cajadiariacajaBean;
	}

	public void setcajadiariacajaBean(CajaDiariaCaja cajadiariacajaBean) {
		this.cajadiariacajaBean = cajadiariacajaBean;
	}	
	
	public CajaDiariaCajaParameterReturnGeneral getcajadiariacajaReturnGeneral() {
		return this.cajadiariacajaReturnGeneral;
	}

	public void setcajadiariacajaReturnGeneral(CajaDiariaCajaParameterReturnGeneral cajadiariacajaReturnGeneral) {
		this.cajadiariacajaReturnGeneral = cajadiariacajaReturnGeneral;
	}	
	
	
	public Long id_cajaBusquedaCajaDiariaCaja=-1L;

	public Long getid_cajaBusquedaCajaDiariaCaja() {
		return this.id_cajaBusquedaCajaDiariaCaja;
	}

	public void setid_cajaBusquedaCajaDiariaCaja(Long id_cajaBusquedaCajaDiariaCaja) {
		this.id_cajaBusquedaCajaDiariaCaja = id_cajaBusquedaCajaDiariaCaja;
	}

;
	public Date fecha_inicioBusquedaCajaDiariaCaja=new Date();

	public Date getfecha_inicioBusquedaCajaDiariaCaja() {
		return this.fecha_inicioBusquedaCajaDiariaCaja;
	}

	public void setfecha_inicioBusquedaCajaDiariaCaja(Date fecha_inicioBusquedaCajaDiariaCaja) {
		this.fecha_inicioBusquedaCajaDiariaCaja = fecha_inicioBusquedaCajaDiariaCaja;
	}

;
	public Date fecha_finBusquedaCajaDiariaCaja=new Date();

	public Date getfecha_finBusquedaCajaDiariaCaja() {
		return this.fecha_finBusquedaCajaDiariaCaja;
	}

	public void setfecha_finBusquedaCajaDiariaCaja(Date fecha_finBusquedaCajaDiariaCaja) {
		this.fecha_finBusquedaCajaDiariaCaja = fecha_finBusquedaCajaDiariaCaja;
	}

	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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
	
	
	public CajaDiariaCajaLogic getCajaDiariaCajaLogic()	{		
		return cajadiariacajaLogic;
	}

	public void setCajaDiariaCajaLogic(CajaDiariaCajaLogic cajadiariacajaLogic) {
		this.cajadiariacajaLogic = cajadiariacajaLogic;
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
	
	public Boolean getIsEsNuevoCajaDiariaCaja() {
		return isEsNuevoCajaDiariaCaja;
	}

	public void setIsEsNuevoCajaDiariaCaja(Boolean isEsNuevoCajaDiariaCaja) {
		this.isEsNuevoCajaDiariaCaja = isEsNuevoCajaDiariaCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaDiariaCaja() {
		return esParaAccionDesdeFormularioCajaDiariaCaja;
	}
	
	public void setEsParaAccionDesdeFormularioCajaDiariaCaja(Boolean esParaAccionDesdeFormularioCajaDiariaCaja) {
		this.esParaAccionDesdeFormularioCajaDiariaCaja = esParaAccionDesdeFormularioCajaDiariaCaja;
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

			if(this.cajadiariacajaSessionBean==null) {
				this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
			}

			if(!this.cajadiariacajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajadiariacajaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.cajadiariacajaSessionBean==null) {
				this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
			}

			if(!this.cajadiariacajaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(cajadiariacajaSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.cajadiariacajaSessionBean==null) {
				this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
			}

			if(!this.cajadiariacajaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(cajadiariacajaSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

					if(this.cajadiariacaja!=null) {
						this.cajadiariacaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
						this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaDiariaCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaDiariaCajaGenerico)throws Exception
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
				jComboBoxid_empresaCajaDiariaCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaDiariaCajaGenerico!=null && jComboBoxid_empresaCajaDiariaCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaDiariaCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.cajadiariacaja!=null) {
						this.cajadiariacaja.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
						this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajaDiariaCaja.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCajaDiariaCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja!=null) {
						jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja!=null) {
							//jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.getItemCount()>0) {
								jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajaDiariaCajaGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaCajaDiariaCajaGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajaDiariaCajaGenerico!=null && jComboBoxid_cajaCajaDiariaCajaGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajaDiariaCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.cajadiariacaja!=null) {
						this.cajadiariacaja.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
						this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCajaDiariaCaja.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCajaDiariaCajaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteCajaDiariaCajaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCajaDiariaCajaGenerico!=null && jComboBoxid_clienteCajaDiariaCajaGenerico.getItemCount()>0) {
					jComboBoxid_clienteCajaDiariaCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaDiariaCaja cajadiariacaja,JComboBox jComboBoxid_empresaCajaDiariaCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaDiariaCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaDiariaCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajadiariacaja.setid_empresa(empresaAux.getId());
				cajadiariacaja.setempresa_descripcion(CajaDiariaCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajadiariacaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(CajaDiariaCaja cajadiariacaja,JComboBox jComboBoxid_cajaCajaDiariaCajaGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajaDiariaCajaGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajaDiariaCajaGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajadiariacaja.setid_caja(cajaAux.getId());
				cajadiariacaja.setcaja_descripcion(CajaDiariaCajaConstantesFunciones.getCajaDescripcion(cajaAux));
				cajadiariacaja.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CajaDiariaCaja cajadiariacaja,JComboBox jComboBoxid_clienteCajaDiariaCajaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCajaDiariaCajaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCajaDiariaCajaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cajadiariacaja.setid_cliente(clienteAux.getId());
				cajadiariacaja.setcliente_descripcion(CajaDiariaCajaConstantesFunciones.getClienteDescripcion(clienteAux));
				cajadiariacaja.setCliente(clienteAux);			}
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

					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { 
					}

					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { 
					}

					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCajaDiariaCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.addItem(caja);
							}
						}

						if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { 
					}

					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCajaDiariaCaja() throws Exception {
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
		
	public CajaDiariaCajaParameterReturnGeneral getCajaDiariaCajaParameterGeneral() {
		return this.cajadiariacajaParameterGeneral;
	}
	
	public void setCajaDiariaCajaParameterGeneral(CajaDiariaCajaParameterReturnGeneral cajadiariacajaParameterGeneral) {
		this.cajadiariacajaParameterGeneral = cajadiariacajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajaDiariaCaja() {
		return isPermisoTodoCajaDiariaCaja;
	}

	public void setIsPermisoTodoCajaDiariaCaja(Boolean isPermisoTodoCajaDiariaCaja) {
		this.isPermisoTodoCajaDiariaCaja = isPermisoTodoCajaDiariaCaja;
	}

	public Boolean getIsPermisoNuevoCajaDiariaCaja() {
		return isPermisoNuevoCajaDiariaCaja;
	}

	public void setIsPermisoNuevoCajaDiariaCaja(Boolean isPermisoNuevoCajaDiariaCaja) {
		this.isPermisoNuevoCajaDiariaCaja = isPermisoNuevoCajaDiariaCaja;
	}

	public Boolean getIsPermisoActualizarCajaDiariaCaja() {
		return isPermisoActualizarCajaDiariaCaja;
	}

	public void setIsPermisoActualizarCajaDiariaCaja(Boolean isPermisoActualizarCajaDiariaCaja) {
		this.isPermisoActualizarCajaDiariaCaja = isPermisoActualizarCajaDiariaCaja;
	}

	public Boolean getIsPermisoEliminarCajaDiariaCaja() {
		return isPermisoEliminarCajaDiariaCaja;
	}

	public void setIsPermisoEliminarCajaDiariaCaja(Boolean isPermisoEliminarCajaDiariaCaja) {
		this.isPermisoEliminarCajaDiariaCaja = isPermisoEliminarCajaDiariaCaja;
	}

	public Boolean getIsPermisoGuardarCambiosCajaDiariaCaja() {
		return isPermisoGuardarCambiosCajaDiariaCaja;
	}

	public void setIsPermisoGuardarCambiosCajaDiariaCaja(Boolean isPermisoGuardarCambiosCajaDiariaCaja) {
		this.isPermisoGuardarCambiosCajaDiariaCaja = isPermisoGuardarCambiosCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoConsultaCajaDiariaCaja() {
		return isPermisoConsultaCajaDiariaCaja;
	}

	public void setIsPermisoConsultaCajaDiariaCaja(Boolean isPermisoConsultaCajaDiariaCaja) {
		this.isPermisoConsultaCajaDiariaCaja = isPermisoConsultaCajaDiariaCaja;
	}

	public Boolean getIsPermisoBusquedaCajaDiariaCaja() {
		return isPermisoBusquedaCajaDiariaCaja;
	}

	public void setIsPermisoBusquedaCajaDiariaCaja(Boolean isPermisoBusquedaCajaDiariaCaja) {
		this.isPermisoBusquedaCajaDiariaCaja = isPermisoBusquedaCajaDiariaCaja;
	}

	public Boolean getIsPermisoReporteCajaDiariaCaja() {
		return isPermisoReporteCajaDiariaCaja;
	}

	public void setIsPermisoReporteCajaDiariaCaja(Boolean isPermisoReporteCajaDiariaCaja) {
		this.isPermisoReporteCajaDiariaCaja = isPermisoReporteCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaDiariaCaja() {
		return isPermisoPaginacionMedioCajaDiariaCaja;
	}

	public void setIsPermisoPaginacionMedioCajaDiariaCaja(Boolean isPermisoPaginacionMedioCajaDiariaCaja) {
		this.isPermisoPaginacionMedioCajaDiariaCaja = isPermisoPaginacionMedioCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaDiariaCaja() {
		return isPermisoPaginacionTodoCajaDiariaCaja;
	}

	public void setIsPermisoPaginacionTodoCajaDiariaCaja(Boolean isPermisoPaginacionTodoCajaDiariaCaja) {
		this.isPermisoPaginacionTodoCajaDiariaCaja = isPermisoPaginacionTodoCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaDiariaCaja() {
		return isPermisoPaginacionAltoCajaDiariaCaja;
	}

	public void setIsPermisoPaginacionAltoCajaDiariaCaja(Boolean isPermisoPaginacionAltoCajaDiariaCaja) {
		this.isPermisoPaginacionAltoCajaDiariaCaja = isPermisoPaginacionAltoCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoCopiarCajaDiariaCaja() {
		return isPermisoCopiarCajaDiariaCaja;
	}

	public void setIsPermisoCopiarCajaDiariaCaja(Boolean isPermisoCopiarCajaDiariaCaja) {
		this.isPermisoCopiarCajaDiariaCaja = isPermisoCopiarCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoVerFormCajaDiariaCaja() {
		return isPermisoVerFormCajaDiariaCaja;
	}

	public void setIsPermisoVerFormCajaDiariaCaja(Boolean isPermisoVerFormCajaDiariaCaja) {
		this.isPermisoVerFormCajaDiariaCaja = isPermisoVerFormCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoDuplicarCajaDiariaCaja() {
		return isPermisoDuplicarCajaDiariaCaja;
	}

	public void setIsPermisoDuplicarCajaDiariaCaja(Boolean isPermisoDuplicarCajaDiariaCaja) {
		this.isPermisoDuplicarCajaDiariaCaja = isPermisoDuplicarCajaDiariaCaja;
	}
	
	public Boolean getIsPermisoOrdenCajaDiariaCaja() {
		return isPermisoOrdenCajaDiariaCaja;
	}

	public void setIsPermisoOrdenCajaDiariaCaja(Boolean isPermisoOrdenCajaDiariaCaja) {
		this.isPermisoOrdenCajaDiariaCaja = isPermisoOrdenCajaDiariaCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajaDiariaCaja() {
		return isVisibilidadCeldaNuevoCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaNuevoCajaDiariaCaja(Boolean isVisibilidadCeldaNuevoCajaDiariaCaja) {
		this.isVisibilidadCeldaNuevoCajaDiariaCaja = isVisibilidadCeldaNuevoCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaDiariaCaja() {
		return isVisibilidadCeldaDuplicarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaDuplicarCajaDiariaCaja(Boolean isVisibilidadCeldaDuplicarCajaDiariaCaja) {
		this.isVisibilidadCeldaDuplicarCajaDiariaCaja = isVisibilidadCeldaDuplicarCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaDiariaCaja() {
		return isVisibilidadCeldaCopiarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaCopiarCajaDiariaCaja(Boolean isVisibilidadCeldaCopiarCajaDiariaCaja) {
		this.isVisibilidadCeldaCopiarCajaDiariaCaja = isVisibilidadCeldaCopiarCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaDiariaCaja() {
		return isVisibilidadCeldaVerFormCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaVerFormCajaDiariaCaja(Boolean isVisibilidadCeldaVerFormCajaDiariaCaja) {
		this.isVisibilidadCeldaVerFormCajaDiariaCaja = isVisibilidadCeldaVerFormCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaDiariaCaja() {
		return isVisibilidadCeldaOrdenCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaOrdenCajaDiariaCaja(Boolean isVisibilidadCeldaOrdenCajaDiariaCaja) {
		this.isVisibilidadCeldaOrdenCajaDiariaCaja = isVisibilidadCeldaOrdenCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaDiariaCaja() {
		return isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaDiariaCaja(Boolean isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja) {
		this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja = isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaDiariaCaja() {
		return isVisibilidadCeldaModificarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaModificarCajaDiariaCaja(Boolean isVisibilidadCeldaModificarCajaDiariaCaja) {
		this.isVisibilidadCeldaModificarCajaDiariaCaja = isVisibilidadCeldaModificarCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaDiariaCaja() {
		return isVisibilidadCeldaActualizarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaActualizarCajaDiariaCaja(Boolean isVisibilidadCeldaActualizarCajaDiariaCaja) {
		this.isVisibilidadCeldaActualizarCajaDiariaCaja = isVisibilidadCeldaActualizarCajaDiariaCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaDiariaCaja() {
		return isVisibilidadCeldaEliminarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaEliminarCajaDiariaCaja(Boolean isVisibilidadCeldaEliminarCajaDiariaCaja) {
		this.isVisibilidadCeldaEliminarCajaDiariaCaja = isVisibilidadCeldaEliminarCajaDiariaCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaDiariaCaja() {
		return isVisibilidadCeldaCancelarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaCancelarCajaDiariaCaja(Boolean isVisibilidadCeldaCancelarCajaDiariaCaja) {
		this.isVisibilidadCeldaCancelarCajaDiariaCaja = isVisibilidadCeldaCancelarCajaDiariaCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaDiariaCaja() {
		return isVisibilidadCeldaGuardarCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaGuardarCajaDiariaCaja(Boolean isVisibilidadCeldaGuardarCajaDiariaCaja) {
		this.isVisibilidadCeldaGuardarCajaDiariaCaja = isVisibilidadCeldaGuardarCajaDiariaCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaDiariaCaja() {
		return isVisibilidadCeldaGuardarCambiosCajaDiariaCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaDiariaCaja(Boolean isVisibilidadCeldaGuardarCambiosCajaDiariaCaja) {
		this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja = isVisibilidadCeldaGuardarCambiosCajaDiariaCaja;
	}
		
	public CajaDiariaCajaSessionBean getcajadiariacajaSessionBean() {
		return this.cajadiariacajaSessionBean;
	}
	
	public void setcajadiariacajaSessionBean(CajaDiariaCajaSessionBean cajadiariacajaSessionBean) {
		this.cajadiariacajaSessionBean=cajadiariacajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCajaDiariaCaja() {
		return this.isVisibilidadBusquedaCajaDiariaCaja;
	}

	public void setisVisibilidadBusquedaCajaDiariaCaja(Boolean isVisibilidadBusquedaCajaDiariaCaja) {
		this.isVisibilidadBusquedaCajaDiariaCaja=isVisibilidadBusquedaCajaDiariaCaja;
	}

	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(CajaDiariaCaja cajadiariacaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajadiariacaja,null);
				this.setActualParaGuardarCajaForeignKey(cajadiariacaja,null);
				this.setActualParaGuardarClienteForeignKey(cajadiariacaja,null);
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
	
	public void bugActualizarReferenciaActual(CajaDiariaCaja cajadiariacaja,CajaDiariaCaja cajadiariacajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaDiariaCaja(cajadiariacaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajadiariacajaAux.setId(cajadiariacaja.getId());
		cajadiariacajaAux.setVersionRow(cajadiariacaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CajaDiariaCaja cajadiariacajaLocal) throws Exception {
		
		if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaDiariaCaja cajadiariacajaLocal) throws Exception {	
		if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajadiariacajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajadiariacajaLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cajadiariacajaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaDiariaCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajadiariacajaValidator.getInvalidValues(this.cajadiariacaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaDiariaCaja cajadiariacaja,List<CajaDiariaCaja> cajadiariacajas) throws Exception {
	}		
	
	public void actualizarSelectedLista(CajaDiariaCaja cajadiariacaja,List<CajaDiariaCaja> cajadiariacajas) throws Exception {
		try	{			
			CajaDiariaCajaConstantesFunciones.actualizarSelectedLista(cajadiariacaja,cajadiariacajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaDiariaCaja> cajadiariacajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajadiariacajasLocal=this.cajadiariacajaLogic.getCajaDiariaCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajadiariacajasLocal=this.cajadiariacajas;
			}
			//ARCHITECTURE
		
			for(CajaDiariaCaja cajadiariacajaLocal:cajadiariacajasLocal) {
				if(this.permiteMantenimiento(cajadiariacajaLocal) && cajadiariacajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajaDiariaCajaConstantesFunciones.getCajaDiariaCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelid_cajaCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelid_clienteCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelnombre_cajaCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelsecuencialCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelcodigo_clienteCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelnombre_clienteCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelsubtotalCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelivaCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeldescuentoCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.FINANCIAMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelfinanciamientoCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelfleteCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeliceCajaDiariaCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaCajaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeltotalCajaDiariaCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelid_cajaCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelid_clienteCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelnombre_cajaCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelsecuencialCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelcodigo_clienteCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelnombre_clienteCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelsubtotalCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelivaCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeldescuentoCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelfinanciamientoCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelfleteCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeliceCajaDiariaCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeltotalCajaDiariaCaja,"");
		
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
		this.iIdNuevoCajaDiariaCaja--;	
		
		
		this.cajadiariacajaAux=new CajaDiariaCaja();
		
		this.cajadiariacajaAux.setId(this.iIdNuevoCajaDiariaCaja);
		this.cajadiariacajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajadiariacajaLogic.getCajaDiariaCajas().add(this.cajadiariacajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajadiariacajas.add(this.cajadiariacajaAux);
		}
		//ARCHITECTURE
		
		this.cajadiariacaja=this.cajadiariacajaAux;
		
		if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacaja);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaCaja(this.cajadiariacaja);
		}
				
		//this.setDefaultControlesCajaDiariaCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaDiariaCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaDiariaCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaDiariaCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaDiariaCaja(this.cajadiariacajaBean,this.cajadiariacaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaDiariaCaja(this.cajadiariacajaReturnGeneral,this.cajadiariacajaBean,false);
		
		if(this.cajadiariacajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaCaja(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja());
		}
		
		if(this.cajadiariacajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja(),classes);//this.cajadiariacajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaDiariaCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaDiariaCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.RecargarFormCajaDiariaCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaDiariaCaja(false);
						
			if(cajadiariacajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaDiariaCaja();
			}
			
			this.actualizarVisualTableDatosCajaDiariaCaja();
			
			this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaCaja(), this.getIndiceNuevoCajaDiariaCaja());
			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
						
			this.actualizarEstadoCeldasBotonesCajaDiariaCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaDiariaCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_inicioCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarfecha_inicioCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_finCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarfecha_finCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarnombre_cajaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarsecuencialCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarcodigo_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarnombre_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarsubtotalCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarivaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activardescuentoCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarfinanciamientoCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarfleteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activariceCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activartotalCajaDiariaCaja);	
		//
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarid_empresaCajaDiariaCaja);//
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarid_cajaCajaDiariaCaja);//
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setEnabled(isHabilitar && this.cajadiariacajaConstantesFunciones.activarid_clienteCajaDiariaCaja);
	};
	
	public void setDefaultControlesCajaDiariaCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaDiariaCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajadiariacajaSessionBean.setConGuardarRelaciones(true);			
			this.cajadiariacajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.setVisible(true);
			
					
		} else {
			//this.cajadiariacajaSessionBean.setConGuardarRelaciones(false);			
			this.cajadiariacajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajaDiariaCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
				if(cajadiariacajaAux.getId().equals(this.iIdNuevoCajaDiariaCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajas) {
				if(cajadiariacajaAux.getId().equals(this.iIdNuevoCajaDiariaCaja)) {
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
	
	public int getIndiceActualCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
				if(cajadiariacajaAux.getId().equals(cajadiariacaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajas) {
				if(cajadiariacajaAux.getId().equals(cajadiariacaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajaDiariaCaja(CajaDiariaCaja cajadiariacajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
				if(cajadiariacajaAux.getCajaDiariaCajaOriginal().getId().equals(cajadiariacajaOriginal.getId())) {
					existe=true;
					cajadiariacajaOriginal.setId(cajadiariacajaAux.getId());
					cajadiariacajaOriginal.setVersionRow(cajadiariacajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajas) {
				if(cajadiariacajaAux.getCajaDiariaCajaOriginal().getId().equals(cajadiariacajaOriginal.getId())) {
					existe=true;
					cajadiariacajaOriginal.setId(cajadiariacajaAux.getId());
					cajadiariacajaOriginal.setVersionRow(cajadiariacajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaDiariaCaja(Boolean esParaCancelar) throws Exception {
		cajadiariacajasAux=new ArrayList<CajaDiariaCaja>();
		cajadiariacajaAux=new CajaDiariaCaja();
		
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
					if(cajadiariacajaAux.getId()<0) {
						cajadiariacajasAux.add(cajadiariacajaAux);
					}		
				}
				this.iIdNuevoCajaDiariaCaja=0L;
				this.cajadiariacajaLogic.getCajaDiariaCajas().removeAll(cajadiariacajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajas) {
					if(cajadiariacajaAux.getId()<0) {
						cajadiariacajasAux.add(cajadiariacajaAux);
					}		
				}
				this.iIdNuevoCajaDiariaCaja=0L;
				this.cajadiariacajas.removeAll(cajadiariacajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaDiariaCaja 
					&& this.cajadiariacajaLogic.getCajaDiariaCajas().size()>0
					) {
					cajadiariacajaAux=this.cajadiariacajaLogic.getCajaDiariaCajas().get(this.cajadiariacajaLogic.getCajaDiariaCajas().size() - 1);
				
					if(cajadiariacajaAux.getId()<0) {
						this.cajadiariacajaLogic.getCajaDiariaCajas().remove(cajadiariacajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaDiariaCaja && this.cajadiariacajas.size()>0) {
					cajadiariacajaAux=this.cajadiariacajas.get(this.cajadiariacajas.size() - 1);
				
					if(cajadiariacajaAux.getId()<0) {
						this.cajadiariacajas.remove(cajadiariacajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaDiariaCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajadiariacaja.getId()<0) {
				this.cajadiariacajaLogic.getCajaDiariaCajas().remove(this.cajadiariacaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajadiariacaja.getId()<0) {
				this.cajadiariacajas.remove(this.cajadiariacaja);
			}
		}			
	}
	
	public void setEstadosInicialesCajaDiariaCaja(List<CajaDiariaCaja> cajadiariacajasAux) throws Exception {
		CajaDiariaCajaConstantesFunciones.setEstadosInicialesCajaDiariaCaja(cajadiariacajasAux);
	}
	
	public void setEstadosInicialesCajaDiariaCaja(CajaDiariaCaja cajadiariacajaAux) throws Exception {
		CajaDiariaCajaConstantesFunciones.setEstadosInicialesCajaDiariaCaja(cajadiariacajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaDiariaCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaDiariaCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaDiariaCajaActual()) {
				if(!this.isEsNuevoCajaDiariaCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaDiariaCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaDiariaCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaDiariaCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Diaria Caja ?", "MANTENIMIENTO DE Caja Diaria Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaDiariaCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaDiariaCaja cajadiariacaja) throws Exception {
		CajaDiariaCajaConstantesFunciones.seleccionarAsignar(this.cajadiariacaja,cajadiariacaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaDiariaCaja=this.isPermisoActualizarOriginalCajaDiariaCaja;
			
			
			this.seleccionarAsignar(cajadiariacaja);
			
			

			idClienteActual=cajadiariacaja.getid_cliente();
			this.seleccionarClienteActual();
			
			
			
			this.actualizarEstadoCeldasBotonesCajaDiariaCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajadiariacajaSessionBean.setsFuncionBusquedaRapida(this.cajadiariacajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajaDiariaCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaDiariaCaja(esParaCancelar);				
				this.cancelarNuevoCajaDiariaCaja(esParaCancelar);								
			}
			
			this.cajadiariacaja=new CajaDiariaCaja();
			
			this.inicializarCajaDiariaCaja();
			
			this.actualizarEstadoCeldasBotonesCajaDiariaCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaDiariaCaja() throws Exception {
		try {
			CajaDiariaCajaConstantesFunciones.inicializarCajaDiariaCaja(this.cajadiariacaja);
			
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
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajadiariacajaLogic.getCajaDiariaCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaDiariaCajas(String sAccionBusqueda,List<CajaDiariaCaja> cajadiariacajasParaReportes) throws Exception {
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
					sPathReporteFinal="CajaDiariaCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaDiariaCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaDiariaCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaDiariaCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caja Diaria Cajas");		
		parameters.put("busquedapor", CajaDiariaCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaDiariaCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaDiariaCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaDiariaCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaDiariaCaja=new JRBeanArrayDataSource(CajaDiariaCajaJInternalFrame.TraerCajaDiariaCajaBeans(cajadiariacajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaDiariaCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaDiariaCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaDiariaCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaDiariaCajaBean.TraerCajaDiariaCajaBeans(cajadiariacajasParaReportes).toArray()));
							
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
				this.generarExcelReporteCajaDiariaCajas(sAccionBusqueda,sTipoArchivoReporte,cajadiariacajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaDiariaCajas(sAccionBusqueda,sTipoArchivoReporte,cajadiariacajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaDiariaCajaActionPerformed(null);
					//this.generarExcelReporteCajaDiariaCajas(sAccionBusqueda,sTipoArchivoReporte,cajadiariacajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaDiariaCajas(sAccionBusqueda,sTipoArchivoReporte,cajadiariacajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaDiariaCajas(sAccionBusqueda,sTipoArchivoReporte,cajadiariacajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaDiariaCajas(sAccionBusqueda,sTipoArchivoReporte,cajadiariacajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaDiariaCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaDiariaCaja> cajadiariacajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaDiariaCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaDiariaCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaDiariaCaja cajadiariacaja : cajadiariacajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaDiariaCajaConstantesFunciones.generarExcelReporteDataCajaDiariaCaja("NORMAL",row,workbook,cajadiariacaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaDiariaCaja(String sTipo,Row row,Workbook workbook) {
		
		CajaDiariaCajaConstantesFunciones.generarExcelReporteHeaderCajaDiariaCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaDiariaCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaDiariaCaja> cajadiariacajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaDiariaCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaDiariaCaja cajadiariacaja : cajadiariacajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaDiariaCajaConstantesFunciones.getCajaDiariaCajaDescripcion(cajadiariacaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getfinanciamiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariacaja.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaDiariaCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaDiariaCaja> cajadiariacajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaDiariaCaja> cajadiariacajasRespaldo=null;
		
		classes=CajaDiariaCajaConstantesFunciones.getClassesRelationshipsOfCajaDiariaCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajadiariacajaLogic.setDatosCliente(this.datosCliente);
		this.cajadiariacajaLogic.setDatosDeep(this.datosDeep);
		this.cajadiariacajaLogic.setIsConDeep(true);
		
		cajadiariacajasRespaldo=this.cajadiariacajaLogic.getCajaDiariaCajas();
		
		this.cajadiariacajaLogic.setCajaDiariaCajas(cajadiariacajasParaReportes);	
		this.cajadiariacajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajadiariacajasParaReportes=this.cajadiariacajaLogic.getCajaDiariaCajas();
		this.cajadiariacajaLogic.setCajaDiariaCajas(cajadiariacajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaDiariaCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaDiariaCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaDiariaCaja cajadiariacaja : cajadiariacajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaDiariaCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaDiariaCajaConstantesFunciones.generarExcelReporteDataCajaDiariaCaja("NORMAL",row,workbook,cajadiariacaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajaDiariaCajaConstantesFunciones.getCajaDiariaCajaDescripcion(cajadiariacaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaDiariaCaja() throws Exception {		
		this.startProcessCajaDiariaCaja(true);
	}
	
	public void startProcessCajaDiariaCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaDiariaCaja ,this.jPanelParametrosReportesCajaDiariaCaja, this.jScrollPanelDatosCajaDiariaCaja,this.jPanelPaginacionCajaDiariaCaja, this.jScrollPanelDatosEdicionCajaDiariaCaja, this.jPanelAccionesCajaDiariaCaja,this.jPanelAccionesFormularioCajaDiariaCaja,this.jmenuBarCajaDiariaCaja,this.jmenuBarDetalleCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,this.jTtoolBarDetalleCajaDiariaCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaDiariaCaja=this.jTabbedPaneBusquedasCajaDiariaCaja; 
		
		final JPanel jPanelParametrosReportesCajaDiariaCaja=this.jPanelParametrosReportesCajaDiariaCaja;
		//final JScrollPane jScrollPanelDatosCajaDiariaCaja=this.jScrollPanelDatosCajaDiariaCaja;
		final JTable jTableDatosCajaDiariaCaja=this.jTableDatosCajaDiariaCaja;		
		final JPanel jPanelPaginacionCajaDiariaCaja=this.jPanelPaginacionCajaDiariaCaja;
		//final JScrollPane jScrollPanelDatosEdicionCajaDiariaCaja=this.jScrollPanelDatosEdicionCajaDiariaCaja;
		final JPanel jPanelAccionesCajaDiariaCaja=this.jPanelAccionesCajaDiariaCaja;
		
		JPanel jPanelCamposAuxiliarCajaDiariaCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaDiariaCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			jPanelCamposAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelCamposCajaDiariaCaja;
			jPanelAccionesFormularioAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelAccionesFormularioCajaDiariaCaja;
		}
		
		final JPanel jPanelCamposCajaDiariaCaja=jPanelCamposAuxiliarCajaDiariaCaja;
		final JPanel jPanelAccionesFormularioCajaDiariaCaja=jPanelAccionesFormularioAuxiliarCajaDiariaCaja;
		
		
		final JMenuBar jmenuBarCajaDiariaCaja=this.jmenuBarCajaDiariaCaja;
		final JToolBar jTtoolBarCajaDiariaCaja=this.jTtoolBarCajaDiariaCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaDiariaCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaDiariaCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			jmenuBarDetalleAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jmenuBarDetalleCajaDiariaCaja;
			jTtoolBarDetalleAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jTtoolBarDetalleCajaDiariaCaja;
		}
		
		final JMenuBar jmenuBarDetalleCajaDiariaCaja=jmenuBarDetalleAuxiliarCajaDiariaCaja;
		final JToolBar jTtoolBarDetalleCajaDiariaCaja=jTtoolBarDetalleAuxiliarCajaDiariaCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaDiariaCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaDiariaCaja;
			processRunnable.jTableDatos=jTableDatosCajaDiariaCaja;
			processRunnable.jPanelCampos=jPanelCamposCajaDiariaCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaDiariaCaja;
			processRunnable.jPanelAcciones=jPanelAccionesCajaDiariaCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaDiariaCaja;
			
			
			processRunnable.jmenuBar=jmenuBarCajaDiariaCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaDiariaCaja;
			processRunnable.jTtoolBar=jTtoolBarCajaDiariaCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaDiariaCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaDiariaCaja ,jPanelParametrosReportesCajaDiariaCaja,jTableDatosCajaDiariaCaja, /*jScrollPanelDatosCajaDiariaCaja,*/jPanelCamposCajaDiariaCaja,jPanelPaginacionCajaDiariaCaja, /*jScrollPanelDatosEdicionCajaDiariaCaja,*/ jPanelAccionesCajaDiariaCaja,jPanelAccionesFormularioCajaDiariaCaja,jmenuBarCajaDiariaCaja,jmenuBarDetalleCajaDiariaCaja,jTtoolBarCajaDiariaCaja,jTtoolBarDetalleCajaDiariaCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaDiariaCaja ,jPanelParametrosReportesCajaDiariaCaja, jScrollPanelDatosCajaDiariaCaja,jPanelPaginacionCajaDiariaCaja, jScrollPanelDatosEdicionCajaDiariaCaja, jPanelAccionesCajaDiariaCaja,jPanelAccionesFormularioCajaDiariaCaja,jmenuBarCajaDiariaCaja,jmenuBarDetalleCajaDiariaCaja,jTtoolBarCajaDiariaCaja,jTtoolBarDetalleCajaDiariaCaja);
						
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
	
	public void finishProcessCajaDiariaCaja() {// throws Exception 
		this.finishProcessCajaDiariaCaja(true);
	}
	
	public void finishProcessCajaDiariaCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaDiariaCaja ,this.jPanelParametrosReportesCajaDiariaCaja, this.jScrollPanelDatosCajaDiariaCaja,this.jPanelPaginacionCajaDiariaCaja, this.jScrollPanelDatosEdicionCajaDiariaCaja, this.jPanelAccionesCajaDiariaCaja,this.jPanelAccionesFormularioCajaDiariaCaja,this.jmenuBarCajaDiariaCaja,this.jmenuBarDetalleCajaDiariaCaja,this.jTtoolBarCajaDiariaCaja,this.jTtoolBarDetalleCajaDiariaCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaDiariaCaja=this.jTabbedPaneBusquedasCajaDiariaCaja; 
		
		final JPanel jPanelParametrosReportesCajaDiariaCaja=this.jPanelParametrosReportesCajaDiariaCaja;
		//final JScrollPane jScrollPanelDatosCajaDiariaCaja=this.jScrollPanelDatosCajaDiariaCaja;
		final JTable jTableDatosCajaDiariaCaja=this.jTableDatosCajaDiariaCaja;		
		final JPanel jPanelPaginacionCajaDiariaCaja=this.jPanelPaginacionCajaDiariaCaja;
		//final JScrollPane jScrollPanelDatosEdicionCajaDiariaCaja=this.jScrollPanelDatosEdicionCajaDiariaCaja;
		final JPanel jPanelAccionesCajaDiariaCaja=this.jPanelAccionesCajaDiariaCaja;
		
		JPanel jPanelCamposAuxiliarCajaDiariaCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaDiariaCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			jPanelCamposAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelCamposCajaDiariaCaja;
			jPanelAccionesFormularioAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelAccionesFormularioCajaDiariaCaja;
		}
		
		final JPanel jPanelCamposCajaDiariaCaja=jPanelCamposAuxiliarCajaDiariaCaja;
		final JPanel jPanelAccionesFormularioCajaDiariaCaja=jPanelAccionesFormularioAuxiliarCajaDiariaCaja;
		
		
		final JMenuBar jmenuBarCajaDiariaCaja=this.jmenuBarCajaDiariaCaja;		
		final JToolBar jTtoolBarCajaDiariaCaja=this.jTtoolBarCajaDiariaCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaDiariaCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaDiariaCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			jmenuBarDetalleAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jmenuBarDetalleCajaDiariaCaja;
			jTtoolBarDetalleAuxiliarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jTtoolBarDetalleCajaDiariaCaja;		
		}
		
		final JMenuBar jmenuBarDetalleCajaDiariaCaja=jmenuBarDetalleAuxiliarCajaDiariaCaja;
		final JToolBar jTtoolBarDetalleCajaDiariaCaja=jTtoolBarDetalleAuxiliarCajaDiariaCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaDiariaCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaDiariaCaja;
			processRunnable.jTableDatos=jTableDatosCajaDiariaCaja;
			processRunnable.jPanelCampos=jPanelCamposCajaDiariaCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaDiariaCaja;
			processRunnable.jPanelAcciones=jPanelAccionesCajaDiariaCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaDiariaCaja;
			
			
			processRunnable.jmenuBar=jmenuBarCajaDiariaCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaDiariaCaja;
			processRunnable.jTtoolBar=jTtoolBarCajaDiariaCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaDiariaCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaDiariaCaja ,jPanelParametrosReportesCajaDiariaCaja, jTableDatosCajaDiariaCaja,/*jScrollPanelDatosCajaDiariaCaja,*/jPanelCamposCajaDiariaCaja,jPanelPaginacionCajaDiariaCaja, /*jScrollPanelDatosEdicionCajaDiariaCaja,*/ jPanelAccionesCajaDiariaCaja,jPanelAccionesFormularioCajaDiariaCaja,jmenuBarCajaDiariaCaja,jmenuBarDetalleCajaDiariaCaja,jTtoolBarCajaDiariaCaja,jTtoolBarDetalleCajaDiariaCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaDiariaCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaDiariaCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaDiariaCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaDiariaCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaDiariaCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaDiariaCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaDiariaCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaDiariaCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaDiariaCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajadiariacajaConstantesFunciones.getsFinalQueryCajaDiariaCaja();
		String  finalQueryPaginacionTodos=this.cajadiariacajaConstantesFunciones.getsFinalQueryCajaDiariaCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajaDiariaCajaConstantesFunciones.getArrayColumnasGlobalesNoCajaDiariaCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaDiariaCajaConstantesFunciones.getArrayColumnasGlobalesCajaDiariaCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaDiariaCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajadiariacajasEliminados= new ArrayList<CajaDiariaCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaDiariaCaja();
		
				///*CajaDiariaCajaSessionBean*/this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
			
			if(this.cajadiariacajaSessionBean==null) {
				this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
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
					this.iNumeroPaginacion=CajaDiariaCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaDiariaCajaConstantesFunciones.getClassesForeignKeysOfCajaDiariaCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajadiariacaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajadiariacajasAux= new ArrayList<CajaDiariaCaja>();
			
				
			cajadiariacajaLogic.setDatosCliente(this.datosCliente);
			cajadiariacajaLogic.setDatosDeep(this.datosDeep);
			cajadiariacajaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCajaDiariaCaja")) {
				this.sDetalleReporte=CajaDiariaCajaConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaCaja(id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajadiariacajaLogic.getCajaDiariaCajasBusquedaCajaDiariaCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaDiariaCajaConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaCaja(id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaDiariaCajaConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaCaja(id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajadiariacajaLogic.getCajaDiariaCajas()==null||cajadiariacajaLogic.getCajaDiariaCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajadiariacajas==null|| cajadiariacajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariacajasAux=new ArrayList<CajaDiariaCaja>();
						cajadiariacajasAux.addAll(cajadiariacajaLogic.getCajaDiariaCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajadiariacajasAux=new ArrayList<CajaDiariaCaja>();
							cajadiariacajasAux.addAll(cajadiariacajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajadiariacajaLogic.getCajaDiariaCajasBusquedaCajaDiariaCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaDiariaCajaConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaCaja(id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaDiariaCajaConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaCaja(id_cajaBusquedaCajaDiariaCaja,fecha_inicioBusquedaCajaDiariaCaja,fecha_finBusquedaCajaDiariaCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaDiariaCajas("BusquedaCajaDiariaCaja",cajadiariacajaLogic.getCajaDiariaCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaDiariaCajas("BusquedaCajaDiariaCaja",cajadiariacajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariacajaLogic.setCajaDiariaCajas(new ArrayList<CajaDiariaCaja>());
						cajadiariacajaLogic.getCajaDiariaCajas().addAll(cajadiariacajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajadiariacajas=new ArrayList<CajaDiariaCaja>();
							cajadiariacajas.addAll(cajadiariacajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaDiariaCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaDiariaCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajadiariacajaLogic.getCajaDiariaCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajadiariacajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajadiariacajaLogic.getCajaDiariaCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajadiariacajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaDiariaCaja cajadiariacaja) {
		Boolean permite=true;
		
		if(this.cajadiariacaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaDiariaCajaConstantesFunciones.getOrderByListaCajaDiariaCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaDiariaCajaConstantesFunciones.getOrderByListaCajaDiariaCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaCaja cajadiariacaja:cajadiariacajaLogic.getCajaDiariaCajas()) {
				if(cajadiariacaja.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariacajaTotales=cajadiariacaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaCaja cajadiariacaja:this.cajadiariacajas) {
				if(cajadiariacaja.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariacajaTotales=cajadiariacaja;
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
			this.cajadiariacajaAux=new CajaDiariaCaja();
			this.cajadiariacajaAux.setsType(Constantes2.S_TOTALES);
			this.cajadiariacajaAux.setIsNew(false);
			this.cajadiariacajaAux.setIsChanged(false);
			this.cajadiariacajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CajaDiariaCajaConstantesFunciones.TotalizarValoresFilaCajaDiariaCaja(this.cajadiariacajaLogic.getCajaDiariaCajas(),this.cajadiariacajaAux);
				
				//this.cajadiariacajaLogic.getCajaDiariaCajas().add(this.cajadiariacajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaDiariaCajaConstantesFunciones.TotalizarValoresFilaCajaDiariaCaja(this.cajadiariacajas,this.cajadiariacajaAux);
				
				this.cajadiariacajas.add(this.cajadiariacajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajadiariacajaTotales=new CajaDiariaCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajadiariacajaLogic.getCajaDiariaCajas().remove(cajadiariacajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajadiariacajas.remove(cajadiariacajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajadiariacajaTotales=new CajaDiariaCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaCaja cajadiariacaja:cajadiariacajaLogic.getCajaDiariaCajas()) {
				if(cajadiariacaja.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariacajaTotales=cajadiariacaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaDiariaCajaConstantesFunciones.TotalizarValoresFilaCajaDiariaCaja(this.cajadiariacajaLogic.getCajaDiariaCajas(),cajadiariacajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaCaja cajadiariacaja:this.cajadiariacajas) {
				if(cajadiariacaja.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariacajaTotales=cajadiariacaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaDiariaCajaConstantesFunciones.TotalizarValoresFilaCajaDiariaCaja(this.cajadiariacajas,cajadiariacajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaDiariaCajasBusquedaCajaDiariaCaja()throws Exception {
		try {
			sAccionBusqueda="BusquedaCajaDiariaCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaCajasFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaCajasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaDiariaCajasBusquedaCajaDiariaCaja(String sFinalQuery,Long id_caja,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariacajaLogic.getCajaDiariaCajasBusquedaCajaDiariaCaja(sFinalQuery,this.pagination,id_caja,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaCajasFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariacajaLogic.getCajaDiariaCajasFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaCajasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariacajaLogic.getCajaDiariaCajasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariacajaLogic.getCajaDiariaCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCajaDiariaCaja() {
		this.isPermisoTodoCajaDiariaCaja=false;
		this.isPermisoNuevoCajaDiariaCaja=false;
		this.isPermisoActualizarCajaDiariaCaja=false;
		this.isPermisoActualizarOriginalCajaDiariaCaja=false;
		this.isPermisoEliminarCajaDiariaCaja=false;
		this.isPermisoGuardarCambiosCajaDiariaCaja=false;
		this.isPermisoConsultaCajaDiariaCaja=true;
		this.isPermisoBusquedaCajaDiariaCaja=true;
		this.isPermisoReporteCajaDiariaCaja=true;
		this.isPermisoOrdenCajaDiariaCaja=false;		
		this.isPermisoPaginacionMedioCajaDiariaCaja=false;		
		this.isPermisoPaginacionAltoCajaDiariaCaja=false;		
		this.isPermisoPaginacionTodoCajaDiariaCaja=false;		
		this.isPermisoCopiarCajaDiariaCaja=false;		
		this.isPermisoVerFormCajaDiariaCaja=false;		
		this.isPermisoDuplicarCajaDiariaCaja=false;
		this.isPermisoOrdenCajaDiariaCaja=false;
	}
	
	public void setPermisosUsuarioCajaDiariaCaja(Boolean isPermiso) {
		this.isPermisoTodoCajaDiariaCaja=isPermiso;
		this.isPermisoNuevoCajaDiariaCaja=isPermiso;
		this.isPermisoActualizarCajaDiariaCaja=isPermiso;
		this.isPermisoActualizarOriginalCajaDiariaCaja=isPermiso;
		this.isPermisoEliminarCajaDiariaCaja=isPermiso;
		this.isPermisoGuardarCambiosCajaDiariaCaja=isPermiso;
		this.isPermisoConsultaCajaDiariaCaja=isPermiso;
		this.isPermisoBusquedaCajaDiariaCaja=isPermiso;
		this.isPermisoReporteCajaDiariaCaja=isPermiso;
		this.isPermisoOrdenCajaDiariaCaja=isPermiso;		
		this.isPermisoPaginacionMedioCajaDiariaCaja=isPermiso;		
		this.isPermisoPaginacionAltoCajaDiariaCaja=isPermiso;		
		this.isPermisoPaginacionTodoCajaDiariaCaja=isPermiso;		
		this.isPermisoCopiarCajaDiariaCaja=isPermiso;		
		this.isPermisoVerFormCajaDiariaCaja=isPermiso;		
		this.isPermisoDuplicarCajaDiariaCaja=isPermiso;
		this.isPermisoOrdenCajaDiariaCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaDiariaCaja(Boolean isPermiso) {
		//this.isPermisoTodoCajaDiariaCaja=isPermiso;
		this.isPermisoNuevoCajaDiariaCaja=isPermiso;
		this.isPermisoActualizarCajaDiariaCaja=isPermiso;
		this.isPermisoActualizarOriginalCajaDiariaCaja=isPermiso;
		this.isPermisoEliminarCajaDiariaCaja=isPermiso;
		this.isPermisoGuardarCambiosCajaDiariaCaja=isPermiso;
		//this.isPermisoConsultaCajaDiariaCaja=isPermiso;
		//this.isPermisoBusquedaCajaDiariaCaja=isPermiso;
		//this.isPermisoReporteCajaDiariaCaja=isPermiso;
		//this.isPermisoOrdenCajaDiariaCaja=isPermiso;		
		//this.isPermisoPaginacionMedioCajaDiariaCaja=isPermiso;		
		//this.isPermisoPaginacionAltoCajaDiariaCaja=isPermiso;		
		//this.isPermisoPaginacionTodoCajaDiariaCaja=isPermiso;		
		//this.isPermisoCopiarCajaDiariaCaja=isPermiso;		
		//this.isPermisoDuplicarCajaDiariaCaja=isPermiso;
		//this.isPermisoOrdenCajaDiariaCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaDiariaCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajaDiariaCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaDiariaCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaDiariaCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajaDiariaCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaDiariaCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaDiariaCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajaDiariaCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaDiariaCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaDiariaCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaDiariaCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaDiariaCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaDiariaCaja=this.isPermisoActualizarCajaDiariaCaja;
			this.isPermisoEliminarCajaDiariaCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaDiariaCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaDiariaCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaDiariaCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaDiariaCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaDiariaCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaDiariaCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaDiariaCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaDiariaCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaDiariaCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaDiariaCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaDiariaCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaDiariaCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaDiariaCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaDiariaCaja.setToolTipText(this.jTableDatosCajaDiariaCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaDiariaCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaDiariaCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaDiariaCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajaDiariaCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajaDiariaCaja() throws Exception {
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
	public void inicializarCombosForeignKeyCajaDiariaCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajaDiariaCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaDiariaCajaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyCajaDiariaCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCaja();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cajadiariacajaSessionBean==null) {
				this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
			}

			if(!this.cajadiariacajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.cajadiariacajaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.cajadiariacajaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCajaDiariaCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaDiariaCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaDiariaCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaDiariaCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaDiariaCaja(CajaDiariaCaja cajadiariacaja)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(cajadiariacaja.getid_caja(),false,"Formulario");
			this.setActualClienteForeignKey(cajadiariacaja.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cajadiariacaja.getCliente()!=null && !sTipoEvento.equals("id_clienteCajaDiariaCaja")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cajadiariacaja.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaDiariaCaja()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.cajadiariacajaConstantesFunciones.getid_caja(),false,"Formulario");
			this.setActualClienteForeignKey(this.cajadiariacajaConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaDiariaCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaDiariaCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaDiariaCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaDiariaCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaDiariaCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajaDiariaCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajaDiariaCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CajaDiariaCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaDiariaCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaDiariaCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean(); 
		this.cajadiariacajaConstantesFunciones=new CajaDiariaCajaConstantesFunciones(); 
		this.cajadiariacajaBean=new CajaDiariaCaja();//(this.cajadiariacajaConstantesFunciones); 		
		this.cajadiariacajaReturnGeneral=new CajaDiariaCajaParameterReturnGeneral(); 
		
		this.cajadiariacajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajadiariacajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaDiariaCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaDiariaCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaDiariaCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaDiariaCaja(true);
			
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
			
			this.cajadiariacajaConstantesFunciones=new CajaDiariaCajaConstantesFunciones(); 
			this.cajadiariacajaBean=new CajaDiariaCaja();//this.cajadiariacajaConstantesFunciones); 			
			this.cajadiariacajaReturnGeneral=new CajaDiariaCajaParameterReturnGeneral(); 
		
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Diaria Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cajadiariacaja=new CajaDiariaCaja();
			this.cajadiariacajas = new ArrayList<CajaDiariaCaja>();
			this.cajadiariacajasAux = new ArrayList<CajaDiariaCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic=new CajaDiariaCajaLogic();
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			//this.cajadiariacajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajadiariacajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaDiariaCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaDiariaCaja);	
					}
					
					if(this.jInternalFrameImportacionCajaDiariaCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaDiariaCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaDiariaCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaDiariaCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaDiariaCaja);
				this.jInternalFrameDetalleFormCajaDiariaCaja.setVisible(false);
				this.jInternalFrameDetalleFormCajaDiariaCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaDiariaCaja);
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaDiariaCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaDiariaCaja);
					this.jInternalFrameImportacionCajaDiariaCaja.setVisible(false);
					this.jInternalFrameImportacionCajaDiariaCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaDiariaCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaDiariaCaja);
					this.jInternalFrameOrderByCajaDiariaCaja.setVisible(false);
					this.jInternalFrameOrderByCajaDiariaCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaDiariaCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaDiariaCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajadiariacajaReturnGeneral=new CajaDiariaCajaParameterReturnGeneral();
			
			this.cajadiariacajaParameterGeneral=new CajaDiariaCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajadiariacajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajaDiariaCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaDiariaCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),this.cajadiariacajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaDiariaCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),this.cajadiariacajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaDuplicarCajaDiariaCaja=true;
			this.isVisibilidadCeldaCopiarCajaDiariaCaja=true;
			this.isVisibilidadCeldaVerFormCajaDiariaCaja=true;
			this.isVisibilidadCeldaOrdenCajaDiariaCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
			this.isVisibilidadCeldaModificarCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
			
			
			this.isVisibilidadBusquedaCajaDiariaCaja=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaDiariaCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaDiariaCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaDiariaCaja(false);
			
			this.setPermisosUsuarioCajaDiariaCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado() 
				|| (this.cajadiariacajaSessionBean.getEsGuardarRelacionado() && this.cajadiariacajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaDiariaCajaClasesRelacionadas();
			}
			
			if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaDiariaCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaDiariaCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaDiariaCaja();
			}
			
			if(!this.isPermisoBusquedaCajaDiariaCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaDiariaCajaConstantesFunciones.getTiposSeleccionarCajaDiariaCaja());
				
				this.tiposColumnasSelect=CajaDiariaCajaConstantesFunciones.getTiposSeleccionarCajaDiariaCaja(true);
				
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
			//if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaDiariaCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCajaDiariaCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCajaDiariaCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaCaja() ;
			
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
			this.cajaLogic=new CajaLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cajadiariacajaImplementable= (CajaDiariaCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaDiariaCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajadiariacajaImplementableHome= (CajaDiariaCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaDiariaCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajadiariacajas= new ArrayList<CajaDiariaCaja>();
			this.cajadiariacajasEliminados= new ArrayList<CajaDiariaCaja>();
						
			this.isEsNuevoCajaDiariaCaja=false;
			this.esParaAccionDesdeFormularioCajaDiariaCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajaDiariaCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaDiariaCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaDiariaCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaDiariaCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaDiariaCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaDiariaCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaDiariaCaja();
			}
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaDiariaCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaDiariaCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaDiariaCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaDiariaCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaDiariaCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaDiariaCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaDiariaCaja")) {
				iIndex=this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaDiariaCaja();	
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
	
	public void cargarCombosForeignKeyCajaDiariaCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaDiariaCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaDiariaCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaDiariaCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaDiariaCaja();
		
		this.cargarCombosFrameForeignKeyCajaDiariaCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaDiariaCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaDiariaCaja();
		}
	}
	
	

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCajaDiariaCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			
			if(jTableDatosCajaDiariaCaja.getRowCount()>=1) {
				jTableDatosCajaDiariaCaja.removeRowSelectionInterval(0, jTableDatosCajaDiariaCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaDiariaCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaDiariaCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaDiariaCaja(true);			
			//this.cajadiariacaja=new CajaDiariaCaja();
			//this.cajadiariacaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaDiariaCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja() ;
			
			if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaDiariaCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajadiariacaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);				
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaDiariaCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaDiariaCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaDiariaCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaDiariaCaja.getSelectedRows().length;			
			}
			
			cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaDiariaCaja--;			
				//CajaDiariaCaja cajadiariacajaAux= new CajaDiariaCaja();			
				//cajadiariacajaAux.setId(this.iIdNuevoCajaDiariaCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaDiariaCaja cajadiariacajaOrigen=new CajaDiariaCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaDiariaCaja cajadiariacajaOrigen : cajadiariacajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajadiariacajaOrigen =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajadiariacajaOrigen =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaDiariaCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajadiariacaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaDiariaCaja(cajadiariacajaOrigen,this.cajadiariacaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajadiariacajaLogic.getCajaDiariaCajas().add(this.cajadiariacajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajadiariacajas.add(this.cajadiariacajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
				
				this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaCaja(), this.getIndiceNuevoCajaDiariaCaja());
				
				int iLastRow =  this.jTableDatosCajaDiariaCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaDiariaCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaDiariaCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();									
		
			CajaDiariaCaja cajadiariacajaOrigen=new CajaDiariaCaja();
			CajaDiariaCaja cajadiariacajaDestino=new CajaDiariaCaja();
				
			cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaDiariaCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajadiariacajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaDiariaCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariacajaOrigen =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajadiariacajaOrigen =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariacajaDestino =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajadiariacajaDestino =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajadiariacajaOrigen =cajadiariacajasSeleccionados.get(0);
				cajadiariacajaDestino =cajadiariacajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaDiariaCaja(cajadiariacajaOrigen,cajadiariacajaDestino,true,false);
				
				cajadiariacajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajadiariacajaDestino,cajadiariacajaLogic.getCajaDiariaCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajadiariacajaDestino,cajadiariacajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
				
				//this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaCaja(), this.getIndiceNuevoCajaDiariaCaja());
				
				int iLastRow =  this.jTableDatosCajaDiariaCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaDiariaCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaDiariaCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaDiariaCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaDiariaCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaDiariaCaja.setVisible(!isVisible);
			this.jPanelPaginacionCajaDiariaCaja.setVisible(!isVisible);
			this.jPanelAccionesCajaDiariaCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaDiariaCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaDiariaCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaDiariaCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaDiariaCaja();
			
			this.abrirFrameOrderByCajaDiariaCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaDiariaCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaDiariaCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaDiariaCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaDiariaCaja.isMaximum()) {
					this.jInternalFrameDetalleFormCajaDiariaCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaDiariaCaja.setSize(this.jInternalFrameDetalleFormCajaDiariaCaja.iWidthFormulario,this.jInternalFrameDetalleFormCajaDiariaCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaDiariaCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaDiariaCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaDiariaCaja.isMaximum()) {
						this.jInternalFrameDetalleFormCajaDiariaCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaDiariaCaja.jContentPaneDetalleCajaDiariaCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaDiariaCaja.jContentPaneDetalleCajaDiariaCaja.getWidth(),CajaDiariaCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaDiariaCaja.jContentPaneDetalleCajaDiariaCaja.getWidth(),CajaDiariaCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaDiariaCaja.jContentPaneDetalleCajaDiariaCaja.getWidth(),CajaDiariaCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaDiariaCaja.setVisible(true);
	        this.jInternalFrameDetalleFormCajaDiariaCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaDiariaCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaDiariaCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaDiariaCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaCaja,false,this);
				} else {
					this.jInternalFrameOrderByCajaDiariaCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaDiariaCaja);
				this.jInternalFrameOrderByCajaDiariaCaja.setVisible(false);
				this.jInternalFrameOrderByCajaDiariaCaja.setSelected(false);
				
				this.jInternalFrameOrderByCajaDiariaCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaDiariaCaja"));
				
				this.inicializarActualizarBindingTablaOrderByCajaDiariaCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaDiariaCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaDiariaCaja==null) {
				
				this.jInternalFrameImportacionCajaDiariaCaja=new ImportacionJInternalFrame(CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaDiariaCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaDiariaCaja);
				this.jInternalFrameImportacionCajaDiariaCaja.setVisible(false);
				this.jInternalFrameImportacionCajaDiariaCaja.setSelected(false);


				this.jInternalFrameImportacionCajaDiariaCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaDiariaCaja"));
				this.jInternalFrameImportacionCajaDiariaCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaDiariaCaja"));
				this.jInternalFrameImportacionCajaDiariaCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaDiariaCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaDiariaCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaDiariaCaja==null) {
				this.jInternalFrameReporteDinamicoCajaDiariaCaja=new ReporteDinamicoJInternalFrame(CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaDiariaCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaDiariaCaja);
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaDiariaCaja"));
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaDiariaCaja"));
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaDiariaCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaDiariaCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajaDiariaCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaDiariaCaja);
			
	       	this.jInternalFrameDetalleFormCajaDiariaCaja.setVisible(false);
	        this.jInternalFrameDetalleFormCajaDiariaCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaDiariaCaja.dispose();
			//this.jInternalFrameDetalleFormCajaDiariaCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaDiariaCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaDiariaCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaDiariaCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaDiariaCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaDiariaCaja.setVisible(true);
	        this.jInternalFrameImportacionCajaDiariaCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaDiariaCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaDiariaCaja.setVisible(true);
	        this.jInternalFrameOrderByCajaDiariaCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaDiariaCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaDiariaCaja.setVisible(false);
	        this.jInternalFrameOrderByCajaDiariaCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaDiariaCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaDiariaCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaDiariaCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaDiariaCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaDiariaCaja.setVisible(false);
	        this.jInternalFrameImportacionCajaDiariaCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaDiariaCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaDiariaCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaDiariaCaja(true);
			//this.isEsNuevoCajaDiariaCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaDiariaCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaDiariaCaja(false) ;
			
			if(cajadiariacajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaDiariaCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaDiariaCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaDiariaCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaDiariaCaja(true);
			//this.isEsNuevoCajaDiariaCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajadiariacaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaDiariaCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaDiariaCaja(false) ;
			
			if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaDiariaCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cajadiariacajaConstantesFunciones.cargarid_clienteCajaDiariaCaja) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaDiariaCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaDiariaCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaDiariaCaja(false);
			
			//if(!this.isEsNuevoCajaDiariaCaja) {								
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				
			}
			
			if(this.permiteMantenimiento(this.cajadiariacaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaDiariaCaja=true;
					this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
					this.isEsNuevoCajaDiariaCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaDiariaCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaDiariaCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaDiariaCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(false);
				
				this.habilitarDeshabilitarControlesCajaDiariaCaja(false);
			
												
				
				if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaDiariaCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaDiariaCajaActionPerformed(evt,cajadiariacajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaDiariaCaja(this.cajadiariacaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajadiariacajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajadiariacaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				this.cajadiariacaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				this.cajadiariacaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajadiariacaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaDiariaCajaModel) this.jTableDatosCajaDiariaCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaDiariaCaja=true;
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
				this.isEsNuevoCajaDiariaCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaDiariaCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(false);
				
				this.habilitarDeshabilitarControlesCajaDiariaCaja(false);
				
				
				
				if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaDiariaCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaDiariaCaja.getRowCount()>=1) {
				jTableDatosCajaDiariaCaja.removeRowSelectionInterval(0, jTableDatosCajaDiariaCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaDiariaCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaDiariaCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(false) ;
			
			this.isEsNuevoCajaDiariaCaja=false;
			
			if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaDiariaCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaDiariaCaja(false);
				
				//SI ES MANUAL
				if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaDiariaCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaDiariaCaja--;			
			//CajaDiariaCaja cajadiariacajaAux= new CajaDiariaCaja();			
			//cajadiariacajaAux.setId(this.iIdNuevoCajaDiariaCaja);
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaDiariaCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
			
			this.cajadiariacaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajadiariacajaLogic.getCajaDiariaCajas().add(this.cajadiariacajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajadiariacajas.add(this.cajadiariacajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			
			this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaCaja(), this.getIndiceNuevoCajaDiariaCaja());
			
			int iLastRow =  this.jTableDatosCajaDiariaCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaDiariaCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaDiariaCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaCaja(false);
			
			//SI ES MANUAL
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaDiariaCaja();
			}
			
			//this.abrirFrameTreeCajaDiariaCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaDiariaCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaDiariaCaja.setFileImportacion(this.jInternalFrameImportacionCajaDiariaCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaDiariaCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaDiariaCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaDiariaCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaDiariaCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		

		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaDiariaCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaDiariaCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciamiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciamiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciamiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciamiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoria="financiamiento";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoriaValor="financiamiento";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiamiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiamiento");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CajaDiariaCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getfinanciamiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaCajaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(CajaDiariaCaja cajadiariacaja:cajadiariacajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariacaja.gettotal());
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
			//	this.getFilaCabeceraExportarExcelCajaDiariaCaja(row);				
			//	iRow++;
			//}				
			
			//for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaDiariaCaja(cajadiariacajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaCaja(false);
			
			//SI ES MANUAL
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaDiariaCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaCaja(false);
			
			//SI ES MANUAL
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaDiariaCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaCaja(false);
			
			//SI ES MANUAL
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaDiariaCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaDiariaCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaDiariaCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaDiariaCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaDiariaCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaDiariaCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaDiariaCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaDiariaCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaDiariaCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaDiariaCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaDiariaCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaDiariaCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaDiariaCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaDiariaCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaDiariaCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaDiariaCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaDiariaCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaDiariaCaja();
		
		this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaDiariaCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaDiariaCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaDiariaCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaDiariaCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaDiariaCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaDiariaCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaDiariaCaja.jCheckBoxPostAccionNuevoCajaDiariaCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaDiariaCaja.jCheckBoxPostAccionSinCerrarCajaDiariaCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaDiariaCaja.jCheckBoxPostAccionSinMensajeCajaDiariaCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaDiariaCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaDiariaCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaDiariaCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
				this.jInternalFrameDetalleFormCajaDiariaCaja.jCheckBoxPostAccionNuevoCajaDiariaCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaDiariaCaja.jCheckBoxPostAccionSinCerrarCajaDiariaCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaDiariaCaja.jCheckBoxPostAccionSinMensajeCajaDiariaCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaDiariaCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaDiariaCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaDiariaCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaDiariaCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaDiariaCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaDiariaCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaDiariaCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaDiariaCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaDiariaCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaDiariaCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaDiariaCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaCaja() throws Exception {
		try	{
			if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaDiariaCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaDiariaCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaDiariaCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaDiariaCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaDiariaCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaDiariaCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaDiariaCaja.addItem(reporte);
			}
			
			
			if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaDiariaCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaDiariaCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaDiariaCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaDiariaCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaDiariaCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaDiariaCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaDiariaCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaDiariaCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaDiariaCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CajaDiariaCajaConstantesFunciones.getTiposSeleccionarCajaDiariaCaja(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CajaDiariaCajaConstantesFunciones.getTiposSeleccionarCajaDiariaCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CajaDiariaCajaConstantesFunciones.getTiposSeleccionarCajaDiariaCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaDiariaCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.getSelectedItem()!=null){this.id_cajaBusquedaCajaDiariaCaja=((Caja)this.jComboBoxid_cajaBusquedaCajaDiariaCajaCajaDiariaCaja.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaCajaDiariaCaja=new Date(this.jDateChooserfecha_inicioBusquedaCajaDiariaCajaCajaDiariaCaja.getDate().getTime());
		this.fecha_finBusquedaCajaDiariaCaja=new Date(this.jDateChooserfecha_finBusquedaCajaDiariaCajaCajaDiariaCaja.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaDiariaCaja(Boolean esInicializar) throws Exception {				
		if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaDiariaCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaDiariaCaja() throws Exception {
		this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaDiariaCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaDiariaCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaDiariaCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajadiariacajaLogic.getCajaDiariaCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajadiariacajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaDiariaCaja.setModel(new CajaDiariaCajaModel(this.cajadiariacajaLogic.getCajaDiariaCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaDiariaCaja.setModel(new CajaDiariaCajaModel(this.cajadiariacajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaDiariaCaja!=null && this.jInternalFrameOrderByCajaDiariaCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaDiariaCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO,cajadiariacajaConstantesFunciones.resaltarSeleccionarCajaDiariaCaja,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaDiariaCajaConstantesFunciones.SCLASSWEBTITULO,cajadiariacajaConstantesFunciones.resaltarSeleccionarCajaDiariaCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_ID));

		if(this.cajadiariacajaConstantesFunciones.mostraridCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltaridCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activaridCajaDiariaCaja,iSizeTabla,this,true,"idCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltaridCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activaridCajaDiariaCaja,this,true,"idCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.cajadiariacajaConstantesFunciones.mostrarnombre_cajaCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariacajaConstantesFunciones.resaltarnombre_cajaCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarnombre_cajaCajaDiariaCaja,iSizeTabla,this,true,"nombre_cajaCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarnombre_cajaCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarnombre_cajaCajaDiariaCaja,this,true,"nombre_cajaCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL));

		if(this.cajadiariacajaConstantesFunciones.mostrarsecuencialCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariacajaConstantesFunciones.resaltarsecuencialCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarsecuencialCajaDiariaCaja,iSizeTabla,this,true,"secuencialCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarsecuencialCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarsecuencialCajaDiariaCaja,this,true,"secuencialCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.cajadiariacajaConstantesFunciones.mostrarcodigo_clienteCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariacajaConstantesFunciones.resaltarcodigo_clienteCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarcodigo_clienteCajaDiariaCaja,iSizeTabla,this,true,"codigo_clienteCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarcodigo_clienteCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarcodigo_clienteCajaDiariaCaja,this,true,"codigo_clienteCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.cajadiariacajaConstantesFunciones.mostrarnombre_clienteCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariacajaConstantesFunciones.resaltarnombre_clienteCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarnombre_clienteCajaDiariaCaja,iSizeTabla,this,true,"nombre_clienteCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarnombre_clienteCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarnombre_clienteCajaDiariaCaja,this,true,"nombre_clienteCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL));

		if(this.cajadiariacajaConstantesFunciones.mostrarsubtotalCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltarsubtotalCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarsubtotalCajaDiariaCaja,iSizeTabla,this,true,"subtotalCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarsubtotalCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarsubtotalCajaDiariaCaja,this,true,"subtotalCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_IVA));

		if(this.cajadiariacajaConstantesFunciones.mostrarivaCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltarivaCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarivaCajaDiariaCaja,iSizeTabla,this,true,"ivaCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarivaCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarivaCajaDiariaCaja,this,true,"ivaCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO));

		if(this.cajadiariacajaConstantesFunciones.mostrardescuentoCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltardescuentoCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activardescuentoCajaDiariaCaja,iSizeTabla,this,true,"descuentoCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltardescuentoCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activardescuentoCajaDiariaCaja,this,true,"descuentoCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO));

		if(this.cajadiariacajaConstantesFunciones.mostrarfinanciamientoCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltarfinanciamientoCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarfinanciamientoCajaDiariaCaja,iSizeTabla,this,true,"financiamientoCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarfinanciamientoCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarfinanciamientoCajaDiariaCaja,this,true,"financiamientoCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_FLETE));

		if(this.cajadiariacajaConstantesFunciones.mostrarfleteCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltarfleteCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarfleteCajaDiariaCaja,iSizeTabla,this,true,"fleteCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltarfleteCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activarfleteCajaDiariaCaja,this,true,"fleteCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_ICE));

		if(this.cajadiariacajaConstantesFunciones.mostrariceCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltariceCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activariceCajaDiariaCaja,iSizeTabla,this,true,"iceCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltariceCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activariceCajaDiariaCaja,this,true,"iceCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,CajaDiariaCajaConstantesFunciones.LABEL_TOTAL));

		if(this.cajadiariacajaConstantesFunciones.mostrartotalCajaDiariaCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaCajaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariacajaConstantesFunciones.resaltartotalCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activartotalCajaDiariaCaja,iSizeTabla,this,true,"totalCajaDiariaCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariacajaConstantesFunciones.resaltartotalCajaDiariaCaja,this.cajadiariacajaConstantesFunciones.activartotalCajaDiariaCaja,this,true,"totalCajaDiariaCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaDiariaCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaDiariaCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaDiariaCaja.addColumn(tableColumn);
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
			
			this.jTableDatosCajaDiariaCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaDiariaCaja.moveColumn(this.jTableDatosCajaDiariaCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaDiariaCaja.moveColumn(this.jTableDatosCajaDiariaCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaDiariaCaja.moveColumn(this.jTableDatosCajaDiariaCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaDiariaCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaDiariaCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaDiariaCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaDiariaCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaDiariaCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaDiariaCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaDiariaCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cajadiariacajaLogic.getCajaDiariaCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajadiariacajas.size()-1;
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
		//this.jTableDatosCajaDiariaCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaDiariaCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaDiariaCaja();
			
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
				
				//this.isEsNuevoCajaDiariaCaja=false;
					
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
				if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaDiariaCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaDiariaCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajadiariacaja.getsType().equals("DUPLICADO")
				   || this.cajadiariacaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaDiariaCaja=true;
				
				} else {
					this.isEsNuevoCajaDiariaCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
					if(this.cajadiariacaja.getId()>=0 && !this.cajadiariacaja.getIsNew()) {						
						this.isEsNuevoCajaDiariaCaja=false;
						
					} else {
						this.isEsNuevoCajaDiariaCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaDiariaCaja(esRelaciones);						
				
				this.seleccionarCajaDiariaCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajadiariacaja.getId()<0) {
					this.isEsNuevoCajaDiariaCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaDiariaCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaDiariaCaja(evt,rowIndex);
				}	
				
				if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaDiariaCaja: " + this.dDif); 
					}
				}								
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaDiariaCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajadiariacaja)) {
					if(this.cajadiariacaja.getId()>0) {
						this.cajadiariacaja.setIsDeleted(true);
						
						this.cajadiariacajasEliminados.add(this.cajadiariacaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajadiariacajaLogic.getCajaDiariaCajas().remove(this.cajadiariacaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajadiariacajas.remove(this.cajadiariacaja);				
					}
					
					
					((CajaDiariaCajaModel) this.jTableDatosCajaDiariaCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaDiariaCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaDiariaCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaDiariaCaja) {
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaDiariaCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaDiariaCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Caja
					if(!this.cajadiariacajaConstantesFunciones.cargarid_cajaCajaDiariaCaja || this.cajadiariacajaConstantesFunciones.event_dependid_cajaCajaDiariaCaja) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajadiariacaja.getid_caja());
									//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajadiariacaja.getCaja()!=null) {
							this.cajasForeignKey.add(cajadiariacaja.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajadiariacaja.getid_caja(),false,"Formulario");

					//Cliente
					if(!this.cajadiariacajaConstantesFunciones.cargarid_clienteCajaDiariaCaja || this.cajadiariacajaConstantesFunciones.event_dependid_clienteCajaDiariaCaja) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cajadiariacaja.getid_cliente());
									//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cajadiariacaja.getCliente()!=null) {
							this.clientesForeignKey.add(cajadiariacaja.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cajadiariacaja.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaDiariaCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaDiariaCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaDiariaCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaDiariaCaja(CajaDiariaCaja cajadiariacaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaDiariaCaja(cajadiariacaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaDiariaCaja(cajadiariacaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaDiariaCaja(cajadiariacaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaCaja(cajadiariacaja);
	}
	
	public void setVariablesObjetoActualToFormularioCajaDiariaCaja(CajaDiariaCaja cajadiariacaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setText(cajadiariacaja.getId().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setText(cajadiariacaja.getnombre_caja());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setText(cajadiariacaja.getsecuencial());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setText(cajadiariacaja.getcodigo_cliente());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setText(cajadiariacaja.getnombre_cliente());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setText(cajadiariacaja.getsubtotal().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setText(cajadiariacaja.getiva().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setText(cajadiariacaja.getdescuento().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setText(cajadiariacaja.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setText(cajadiariacaja.getflete().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setText(cajadiariacaja.getice().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setText(cajadiariacaja.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaDiariaCaja cajadiariacajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajadiariacajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaDiariaCaja cajadiariacajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajadiariacajaLocal=this.cajadiariacaja;
			} else {
				cajadiariacajaLocal=this.cajadiariacajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajadiariacajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaDiariaCaja(cajadiariacajaLocal,true);
					
					if(cajadiariacajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajadiariacajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajadiariacajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaDiariaCaja(cajadiariacaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(cajadiariacaja);
	}
	
	public void setVariablesFormularioToObjetoActualCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaDiariaCaja(cajadiariacaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.getText()==null || this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.getText()=="" || this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setText("0");
			}

			if(conColumnasBase) {cajadiariacaja.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelIdCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setnombre_caja(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelnombre_cajaCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setsecuencial(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelsecuencialCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setcodigo_cliente(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelcodigo_clienteCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setnombre_cliente(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelnombre_clienteCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelsubtotalCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setiva(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelivaCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeldescuentoCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setfinanciamiento(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelfinanciamientoCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setflete(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelfleteCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.setice(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeliceCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariacaja.settotal(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaCajaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaCaja.jLabeltotalCajaDiariaCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaDiariaCaja(CajaDiariaCaja cajadiariacajaBean,CajaDiariaCaja cajadiariacaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaDiariaCaja(CajaDiariaCaja cajadiariacajaOrigen,CajaDiariaCaja cajadiariacaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajadiariacajaOrigen.getId()!=null && !cajadiariacajaOrigen.getId().equals(0L))) {cajadiariacaja.setId(cajadiariacajaOrigen.getId());}}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getid_caja()!=null && !cajadiariacajaOrigen.getid_caja().equals(-1L))) {cajadiariacaja.setid_caja(cajadiariacajaOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getid_cliente()!=null && !cajadiariacajaOrigen.getid_cliente().equals(-1L))) {cajadiariacaja.setid_cliente(cajadiariacajaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getfecha_inicio()!=null && !cajadiariacajaOrigen.getfecha_inicio().equals(new Date()))) {cajadiariacaja.setfecha_inicio(cajadiariacajaOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getfecha_fin()!=null && !cajadiariacajaOrigen.getfecha_fin().equals(new Date()))) {cajadiariacaja.setfecha_fin(cajadiariacajaOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getnombre_caja()!=null && !cajadiariacajaOrigen.getnombre_caja().equals(""))) {cajadiariacaja.setnombre_caja(cajadiariacajaOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getsecuencial()!=null && !cajadiariacajaOrigen.getsecuencial().equals(""))) {cajadiariacaja.setsecuencial(cajadiariacajaOrigen.getsecuencial());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getcodigo_cliente()!=null && !cajadiariacajaOrigen.getcodigo_cliente().equals(""))) {cajadiariacaja.setcodigo_cliente(cajadiariacajaOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getnombre_cliente()!=null && !cajadiariacajaOrigen.getnombre_cliente().equals(""))) {cajadiariacaja.setnombre_cliente(cajadiariacajaOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getsubtotal()!=null && !cajadiariacajaOrigen.getsubtotal().equals(0.0))) {cajadiariacaja.setsubtotal(cajadiariacajaOrigen.getsubtotal());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getiva()!=null && !cajadiariacajaOrigen.getiva().equals(0.0))) {cajadiariacaja.setiva(cajadiariacajaOrigen.getiva());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getdescuento()!=null && !cajadiariacajaOrigen.getdescuento().equals(0.0))) {cajadiariacaja.setdescuento(cajadiariacajaOrigen.getdescuento());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getfinanciamiento()!=null && !cajadiariacajaOrigen.getfinanciamiento().equals(0.0))) {cajadiariacaja.setfinanciamiento(cajadiariacajaOrigen.getfinanciamiento());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getflete()!=null && !cajadiariacajaOrigen.getflete().equals(0.0))) {cajadiariacaja.setflete(cajadiariacajaOrigen.getflete());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.getice()!=null && !cajadiariacajaOrigen.getice().equals(0.0))) {cajadiariacaja.setice(cajadiariacajaOrigen.getice());}
			if(conDefault || (!conDefault && cajadiariacajaOrigen.gettotal()!=null && !cajadiariacajaOrigen.gettotal().equals(0.0))) {cajadiariacaja.settotal(cajadiariacajaOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaDiariaCaja(CajaDiariaCaja cajadiariacaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setText(cajadiariacaja.getId().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setText(cajadiariacaja.getnombre_caja());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setText(cajadiariacaja.getsecuencial());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setText(cajadiariacaja.getcodigo_cliente());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setText(cajadiariacaja.getnombre_cliente());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setText(cajadiariacaja.getsubtotal().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setText(cajadiariacaja.getiva().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setText(cajadiariacaja.getdescuento().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setText(cajadiariacaja.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setText(cajadiariacaja.getflete().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setText(cajadiariacaja.getice().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setText(cajadiariacaja.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaDiariaCaja(CajaDiariaCajaBean cajadiariacajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setText(cajadiariacajaBean.getId().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setText(cajadiariacajaBean.getnombre_caja());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setText(cajadiariacajaBean.getsecuencial());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setText(cajadiariacajaBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setText(cajadiariacajaBean.getnombre_cliente());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setText(cajadiariacajaBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setText(cajadiariacajaBean.getiva().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setText(cajadiariacajaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setText(cajadiariacajaBean.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setText(cajadiariacajaBean.getflete().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setText(cajadiariacajaBean.getice().toString());
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setText(cajadiariacajaBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaDiariaCaja(CajaDiariaCajaParameterReturnGeneral cajadiariacajaReturnGeneral,CajaDiariaCajaBean cajadiariacajaBean,Boolean conDefault) throws Exception { 
		try {
			CajaDiariaCaja cajadiariacajaLocal=new CajaDiariaCaja();
			
			cajadiariacajaLocal=cajadiariacajaReturnGeneral.getCajaDiariaCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajadiariacajaLocal.getId()!=null && !cajadiariacajaLocal.getId().equals(0L))) {cajadiariacajaBean.setId(cajadiariacajaLocal.getId());}}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getnombre_caja()!=null && !cajadiariacajaLocal.getnombre_caja().equals(""))) {cajadiariacajaBean.setnombre_caja(cajadiariacajaLocal.getnombre_caja());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getsecuencial()!=null && !cajadiariacajaLocal.getsecuencial().equals(""))) {cajadiariacajaBean.setsecuencial(cajadiariacajaLocal.getsecuencial());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getcodigo_cliente()!=null && !cajadiariacajaLocal.getcodigo_cliente().equals(""))) {cajadiariacajaBean.setcodigo_cliente(cajadiariacajaLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getnombre_cliente()!=null && !cajadiariacajaLocal.getnombre_cliente().equals(""))) {cajadiariacajaBean.setnombre_cliente(cajadiariacajaLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getsubtotal()!=null && !cajadiariacajaLocal.getsubtotal().equals(0.0))) {cajadiariacajaBean.setsubtotal(cajadiariacajaLocal.getsubtotal());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getiva()!=null && !cajadiariacajaLocal.getiva().equals(0.0))) {cajadiariacajaBean.setiva(cajadiariacajaLocal.getiva());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getdescuento()!=null && !cajadiariacajaLocal.getdescuento().equals(0.0))) {cajadiariacajaBean.setdescuento(cajadiariacajaLocal.getdescuento());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getfinanciamiento()!=null && !cajadiariacajaLocal.getfinanciamiento().equals(0.0))) {cajadiariacajaBean.setfinanciamiento(cajadiariacajaLocal.getfinanciamiento());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getflete()!=null && !cajadiariacajaLocal.getflete().equals(0.0))) {cajadiariacajaBean.setflete(cajadiariacajaLocal.getflete());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.getice()!=null && !cajadiariacajaLocal.getice().equals(0.0))) {cajadiariacajaBean.setice(cajadiariacajaLocal.getice());}
			if(conDefault || (!conDefault && cajadiariacajaLocal.gettotal()!=null && !cajadiariacajaLocal.gettotal().equals(0.0))) {cajadiariacajaBean.settotal(cajadiariacajaLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaDiariaCajaGenerico(Long idCajaDiariaCajaSeleccionado,JComboBox jComboBoxCajaDiariaCaja,List<CajaDiariaCaja> cajadiariacajasLocal)throws Exception {
		try {
			CajaDiariaCaja  cajadiariacajaTemp=null;

			for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasLocal) {
				if(cajadiariacajaAux.getId()!=null && cajadiariacajaAux.getId().equals(idCajaDiariaCajaSeleccionado)) {
					cajadiariacajaTemp=cajadiariacajaAux;
					break;
				}
			}

			jComboBoxCajaDiariaCaja.setSelectedItem(cajadiariacajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaDiariaCajaGenerico(JComboBox jComboBoxCajaDiariaCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaDiariaCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaDiariaCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaDiariaCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaDiariaCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaDiariaCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaDiariaCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajadiariacaja=(CajaDiariaCaja) cajadiariacajaLogic.getCajaDiariaCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajadiariacaja =(CajaDiariaCaja) cajadiariacajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajadiariacaja.getIsNew() && !cajadiariacaja.getIsChanged() && !cajadiariacaja.getIsDeleted()) {
				sDescripcion=cajadiariacaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariacaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajadiariacaja.getIsNew() && !cajadiariacaja.getIsChanged() && !cajadiariacaja.getIsDeleted()) {
				sDescripcion=cajadiariacaja.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariacaja.getcaja_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cajadiariacaja.getIsNew() && !cajadiariacaja.getIsChanged() && !cajadiariacaja.getIsDeleted()) {
				sDescripcion=cajadiariacaja.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariacaja.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaDiariaCaja cajadiariacajaRow=new CajaDiariaCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajadiariacajaRow=(CajaDiariaCaja) cajadiariacajaLogic.getCajaDiariaCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajadiariacajaRow=(CajaDiariaCaja) cajadiariacajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaDiariaCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja));			
			this.jButtonDuplicarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaDuplicarCajaDiariaCaja && this.isPermisoDuplicarCajaDiariaCaja));			
			this.jButtonCopiarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaCopiarCajaDiariaCaja && this.isPermisoCopiarCajaDiariaCaja));
			this.jButtonVerFormCajaDiariaCaja.setVisible((this.isVisibilidadCeldaVerFormCajaDiariaCaja && this.isPermisoVerFormCajaDiariaCaja));
			
			this.jButtonAbrirOrderByCajaDiariaCaja.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaCaja && this.isPermisoOrdenCajaDiariaCaja));			
			
			this.jButtonNuevoRelacionesCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja));			
			this.jButtonNuevoGuardarCambiosCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaModificarCajaDiariaCaja && this.isPermisoActualizarCajaDiariaCaja));	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaActualizarCajaDiariaCaja && this.isPermisoActualizarCajaDiariaCaja));	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaEliminarCajaDiariaCaja && this.isPermisoEliminarCajaDiariaCaja));
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarCajaDiariaCaja.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaCaja);							
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja));						
			this.jButtonDuplicarToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaDuplicarCajaDiariaCaja && this.isPermisoDuplicarCajaDiariaCaja));						
			this.jButtonCopiarToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaCopiarCajaDiariaCaja && this.isPermisoCopiarCajaDiariaCaja));			
			this.jButtonVerFormToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaVerFormCajaDiariaCaja && this.isPermisoVerFormCajaDiariaCaja));			
			this.jButtonAbrirOrderByToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaCaja && this.isPermisoOrdenCajaDiariaCaja));
			this.jButtonNuevoRelacionesToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja));			
			this.jButtonNuevoGuardarCambiosToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));			
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaModificarCajaDiariaCaja && this.isPermisoActualizarCajaDiariaCaja));	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaActualizarCajaDiariaCaja  && this.isPermisoActualizarCajaDiariaCaja));	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaEliminarCajaDiariaCaja && this.isPermisoEliminarCajaDiariaCaja));
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarToolBarCajaDiariaCaja.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaCaja);				
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja));			
			this.jMenuItemDuplicarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaDuplicarCajaDiariaCaja && this.isPermisoDuplicarCajaDiariaCaja));			
			this.jMenuItemCopiarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaCopiarCajaDiariaCaja && this.isPermisoCopiarCajaDiariaCaja));			
			this.jMenuItemVerFormCajaDiariaCaja.setVisible((this.isVisibilidadCeldaVerFormCajaDiariaCaja && this.isPermisoVerFormCajaDiariaCaja));			
			this.jMenuItemAbrirOrderByCajaDiariaCaja.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaCaja && this.isPermisoOrdenCajaDiariaCaja));			
			//this.jMenuItemMostrarOcultarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaCaja && this.isPermisoOrdenCajaDiariaCaja));
			this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaCaja && this.isPermisoOrdenCajaDiariaCaja));			
			//this.jMenuItemDetalleMostrarOcultarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaCaja && this.isPermisoOrdenCajaDiariaCaja));			
			this.jMenuItemNuevoRelacionesCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja));			
			this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaCaja && this.isPermisoNuevoCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));									
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemModificarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaModificarCajaDiariaCaja && this.isPermisoActualizarCajaDiariaCaja));	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemActualizarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaActualizarCajaDiariaCaja && this.isPermisoActualizarCajaDiariaCaja));	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemEliminarCajaDiariaCaja.setVisible((this.isVisibilidadCeldaEliminarCajaDiariaCaja && this.isPermisoEliminarCajaDiariaCaja));
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemCancelarCajaDiariaCaja.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaCaja);				
			}
			
			this.jMenuItemGuardarCambiosCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));						
			this.jMenuItemGuardarCambiosTablaCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=this.jButtonNuevoCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaDuplicarCajaDiariaCaja=this.jButtonDuplicarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaCopiarCajaDiariaCaja=this.jButtonCopiarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaVerFormCajaDiariaCaja=this.jButtonVerFormCajaDiariaCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaDiariaCaja=this.jButtonAbrirOrderByCajaDiariaCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=this.jButtonNuevoRelacionesCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaModificarCajaDiariaCaja=this.jButtonModificarCajaDiariaCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaGuardarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=this.jButtonGuardarCambiosTablaCajaDiariaCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=this.jButtonNuevoToolBarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=this.jButtonNuevoRelacionesToolBarCajaDiariaCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.isVisibilidadCeldaModificarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarToolBarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarToolBarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarToolBarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarToolBarCajaDiariaCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaDiariaCaja=this.jButtonGuardarCambiosToolBarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=this.jButtonGuardarCambiosTablaToolBarCajaDiariaCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=this.jMenuItemNuevoCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=this.jMenuItemNuevoRelacionesCajaDiariaCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.isVisibilidadCeldaModificarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemModificarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemActualizarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemEliminarCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemCancelarCajaDiariaCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaDiariaCaja=this.jMenuItemGuardarCambiosCajaDiariaCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=this.jMenuItemGuardarCambiosTablaCajaDiariaCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaDiariaCaja(Boolean esInicializar) {
		if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
				//if(this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaDiariaCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaDiariaCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaDiariaCaja() {
		this.jButtonNuevoCajaDiariaCaja.setVisible(this.isPermisoNuevoCajaDiariaCaja);			
		this.jButtonDuplicarCajaDiariaCaja.setVisible(this.isPermisoDuplicarCajaDiariaCaja);			
		this.jButtonCopiarCajaDiariaCaja.setVisible(this.isPermisoCopiarCajaDiariaCaja);			
		this.jButtonVerFormCajaDiariaCaja.setVisible(this.isPermisoVerFormCajaDiariaCaja);			
		
		this.jButtonAbrirOrderByCajaDiariaCaja.setVisible(this.isPermisoOrdenCajaDiariaCaja);					
		
		this.jButtonNuevoRelacionesCajaDiariaCaja.setVisible(this.isPermisoNuevoCajaDiariaCaja);			
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarCajaDiariaCaja.setVisible(this.isPermisoActualizarCajaDiariaCaja);	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarCajaDiariaCaja.setVisible(this.isPermisoActualizarCajaDiariaCaja);	
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarCajaDiariaCaja.setVisible(this.isPermisoEliminarCajaDiariaCaja);
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarCajaDiariaCaja.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaCaja);						
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.setVisible(this.isPermisoGuardarCambiosCajaDiariaCaja);							
		}
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.setVisible(this.isPermisoActualizarCajaDiariaCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaDiariaCaja() {
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarCajaDiariaCaja.setVisible(this.isPermisoActualizarCajaDiariaCaja);	
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarCajaDiariaCaja.setVisible(this.isPermisoActualizarCajaDiariaCaja);	
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarCajaDiariaCaja.setVisible(this.isPermisoEliminarCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarCajaDiariaCaja.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaCaja);							
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaCaja && this.isPermisoGuardarCambiosCajaDiariaCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaDiariaCaja() {
		if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaDiariaCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaDiariaCaja() {
	}
	
	public void jTableDatosCajaDiariaCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaDiariaCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajadiariacaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaDiariaCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaDiariaCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajadiariacajaLogic.getConnexion());

				if(this.cajadiariacaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajadiariacaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaCaja=(TitledBorder)this.jScrollPanelDatosCajaDiariaCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaDiariaCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajadiariacaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajaDiariaCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajaDiariaCaja(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajadiariacajaLogic.getConnexion());

				if(this.cajadiariacaja.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajadiariacaja.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaCaja=(TitledBorder)this.jScrollPanelDatosCajaDiariaCaja.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajaDiariaCaja.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajadiariacaja.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCajaDiariaCajaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCajaDiariaCaja=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCajaDiariaCaja.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCajaDiariaCaja=(TitledBorder)this.jScrollPanelDatosCajaDiariaCaja.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaDiariaCaja.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCajaDiariaCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCajaDiariaCaja(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cajadiariacajaLogic.getConnexion());

				if(this.cajadiariacaja.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cajadiariacaja.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaCaja=(TitledBorder)this.jScrollPanelDatosCajaDiariaCaja.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaDiariaCaja.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cajadiariacaja.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.cajadiariacaja.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.cajadiariacaja.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.cajadiariacaja.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.cajadiariacaja.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.cajadiariacaja.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.cajadiariacaja.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.cajadiariacaja.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.cajadiariacaja.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.cajadiariacaja.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinanciamientoCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getfinanciamiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiamiento = "+this.cajadiariacaja.getfinanciamiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.cajadiariacaja.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.cajadiariacaja.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalCajaDiariaCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.getcajadiariacaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariacaja==null) {
						this.cajadiariacaja = new CajaDiariaCaja();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);
				}

				if(this.cajadiariacaja.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.cajadiariacaja.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCajaDiariaCajaCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);

			this.getCajaDiariaCajasBusquedaCajaDiariaCaja();

			this.inicializarActualizarBindingCajaDiariaCaja(false);

			//if(CajaDiariaCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);

			this.getCajaDiariaCajasFK_IdCaja();

			this.inicializarActualizarBindingCajaDiariaCaja(false);

			//if(CajaDiariaCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);

			this.getCajaDiariaCajasFK_IdCliente();

			this.inicializarActualizarBindingCajaDiariaCaja(false);

			//if(CajaDiariaCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaDiariaCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);

			this.getCajaDiariaCajasFK_IdEmpresa();

			this.inicializarActualizarBindingCajaDiariaCaja(false);

			//if(CajaDiariaCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariacajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaDiariaCaja() {
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaDiariaCaja.dispose();
			this.jInternalFrameDetalleFormCajaDiariaCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
			this.jInternalFrameReporteDinamicoCajaDiariaCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaDiariaCaja.dispose();
			this.jInternalFrameReporteDinamicoCajaDiariaCaja=null;
		}
		
		if(this.jInternalFrameImportacionCajaDiariaCaja!=null) {
			this.jInternalFrameImportacionCajaDiariaCaja.setVisible(false);	    			
			this.jInternalFrameImportacionCajaDiariaCaja.dispose();
			this.jInternalFrameImportacionCajaDiariaCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaDiariaCaja();
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaDiariaCaja")) {
				jButtonDuplicarCajaDiariaCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaDiariaCaja")) {
				jButtonCopiarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaDiariaCaja")) {
				jButtonVerFormCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaDiariaCaja")) {
				jButtonDuplicarCajaDiariaCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaDiariaCaja")) {
				jButtonDuplicarCajaDiariaCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaDiariaCaja")) {
				jButtonModificarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaDiariaCaja")) {
				jButtonModificarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaDiariaCaja")) {
				jButtonModificarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaDiariaCaja")) {
				jButtonActualizarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaDiariaCaja")) {
				jButtonActualizarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaDiariaCaja")) {
				jButtonActualizarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaDiariaCaja")) {
				jButtonEliminarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaDiariaCaja")) {
				jButtonEliminarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaDiariaCaja")) {
				jButtonEliminarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaDiariaCaja")) {
				jButtonCancelarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaDiariaCaja")) {
				jButtonCancelarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaDiariaCaja")) {
				jButtonCancelarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaDiariaCaja")) {
				jButtonCerrarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaDiariaCaja")) {
				jButtonCerrarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaDiariaCaja")) {
				jButtonCerrarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaDiariaCaja")) {
				jButtonMostrarOcultarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaDiariaCaja")) {
				jButtonCancelarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaDiariaCaja")) {
				jButtonCopiarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaDiariaCaja")) {
				jButtonVerFormCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaDiariaCaja")) {
				jButtonCopiarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaDiariaCaja")) {
				jButtonVerFormCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaDiariaCaja")) {
				jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaDiariaCaja")) {
				jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaDiariaCaja")) {
				jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaDiariaCaja")) {
				jButtonAnterioresCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaDiariaCaja")) {
				jButtonAnterioresCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaDiariaCaja")) {
				jButtonAnterioresCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaDiariaCaja")) {
				jButtonSiguientesCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaDiariaCaja")) {
				jButtonSiguientesCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaDiariaCaja")) {
				jButtonSiguientesCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaDiariaCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaDiariaCaja")) {
				jButtonAbrirOrderByCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaDiariaCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaDiariaCaja")) {
				jButtonMostrarOcultarCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaDiariaCaja")) {
				jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaDiariaCaja")) {
				jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaDiariaCaja")) {
				jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaDiariaCaja")) {
				jButtonCerrarReporteDinamicoCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaDiariaCaja")) {
				jButtonGenerarReporteDinamicoCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaDiariaCaja")) {
				
				jButtonGenerarExcelReporteDinamicoCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaDiariaCaja")) {
				jButtonCerrarImportacionCajaDiariaCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaDiariaCaja")) {
				
				jButtonGenerarImportacionCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaDiariaCaja")) {
				
				jButtonAbrirImportacionCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaDiariaCaja")) {
				jComboBoxTiposAccionesCajaDiariaCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaDiariaCaja")) {
				jComboBoxTiposRelacionesCajaDiariaCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaDiariaCaja")) {
				jComboBoxTiposAccionesCajaDiariaCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaDiariaCaja")) {
				
				jComboBoxTiposSeleccionarCajaDiariaCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaDiariaCaja")) {
				jTextFieldValorCampoGeneralCajaDiariaCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaDiariaCaja")) {
				jButtonAbrirOrderByCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaDiariaCaja")) {
				jButtonAbrirOrderByCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaDiariaCaja")) {
				jButtonCerrarOrderByCajaDiariaCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaDiariaCajaBusqueda")) {
				this.jButtonidCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaCajaUpdate")) {
				this.jButtonid_empresaCajaDiariaCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaCajaBusqueda")) {
				this.jButtonid_empresaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaCajaUpdate")) {
				this.jButtonid_cajaCajaDiariaCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaCajaBusqueda")) {
				this.jButtonid_cajaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaCaja")) {
				this.jButtonid_clienteCajaDiariaCajaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaCajaUpdate")) {
				this.jButtonid_clienteCajaDiariaCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaCajaBusqueda")) {
				this.jButtonid_clienteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCajaDiariaCajaBusqueda")) {
				this.jButtonfecha_inicioCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCajaDiariaCajaBusqueda")) {
				this.jButtonfecha_finCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaCajaDiariaCajaBusqueda")) {
				this.jButtonnombre_cajaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaDiariaCajaBusqueda")) {
				this.jButtonsecuencialCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteCajaDiariaCajaBusqueda")) {
				this.jButtoncodigo_clienteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteCajaDiariaCajaBusqueda")) {
				this.jButtonnombre_clienteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalCajaDiariaCajaBusqueda")) {
				this.jButtonsubtotalCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaCajaDiariaCajaBusqueda")) {
				this.jButtonivaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoCajaDiariaCajaBusqueda")) {
				this.jButtondescuentoCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoCajaDiariaCajaBusqueda")) {
				this.jButtonfinanciamientoCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteCajaDiariaCajaBusqueda")) {
				this.jButtonfleteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceCajaDiariaCajaBusqueda")) {
				this.jButtoniceCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCajaDiariaCajaBusqueda")) {
				this.jButtontotalCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCajaDiariaCajaCajaDiariaCaja")) {
				this.jButtonBusquedaCajaDiariaCajaCajaDiariaCajaActionPerformed(evt);
			}
			
			;
			
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaDiariaCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaDiariaCaja cajadiariacajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajadiariacajaLocal=this.cajadiariacaja;
			} else {
				cajadiariacajaLocal=this.cajadiariacajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
							
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
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
			
			


			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
								
						
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
								
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
							
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
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
			
			


			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
								
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaDiariaCaja")) {
					jCheckBoxSeleccionarTodosCajaDiariaCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaDiariaCaja")) {
					jCheckBoxSeleccionadosCajaDiariaCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaDiariaCaja")) {
					
				}
				
				


				
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
												
				
				


				
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
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
			
			


			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariacaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariacaja);
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
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
				
				


				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariacajaAnterior =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaDiariaCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaDiariaCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaDiariaCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajadiariacaja =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajadiariacaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaDiariaCaja")) {
				
				}
				
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaDiariaCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaDiariaCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaDiariaCaja")) {
			
			}
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaDiariaCaja();
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			if(sTipo.equals("NuevoCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaDiariaCaja")) {
				jButtonDuplicarCajaDiariaCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaDiariaCaja")) {
				jButtonCopiarCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaDiariaCaja")) {
				jButtonVerFormCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaDiariaCaja")) {
				jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaDiariaCaja")) {
				jButtonModificarCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaDiariaCaja")) {
				jButtonActualizarCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaDiariaCaja")) {
				jButtonEliminarCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaDiariaCaja")) {
				jButtonCancelarCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaDiariaCaja")) {
				jButtonCerrarCajaDiariaCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaDiariaCaja")) {
				jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaDiariaCaja")) {
				jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaDiariaCaja")) {
				jButtonAbrirOrderByCajaDiariaCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaDiariaCaja")) {
				jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaDiariaCaja")) {
				jButtonAnterioresCajaDiariaCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaDiariaCaja")) {
				jButtonSiguientesCajaDiariaCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaDiariaCajaBusqueda")) {
				this.jButtonidCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaCajaUpdate")) {
				this.jButtonid_empresaCajaDiariaCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaCajaBusqueda")) {
				this.jButtonid_empresaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaCajaUpdate")) {
				this.jButtonid_cajaCajaDiariaCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaCajaBusqueda")) {
				this.jButtonid_cajaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaCaja")) {
				this.jButtonid_clienteCajaDiariaCajaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaCajaUpdate")) {
				this.jButtonid_clienteCajaDiariaCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaCajaBusqueda")) {
				this.jButtonid_clienteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCajaDiariaCajaBusqueda")) {
				this.jButtonfecha_inicioCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCajaDiariaCajaBusqueda")) {
				this.jButtonfecha_finCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaCajaDiariaCajaBusqueda")) {
				this.jButtonnombre_cajaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaDiariaCajaBusqueda")) {
				this.jButtonsecuencialCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteCajaDiariaCajaBusqueda")) {
				this.jButtoncodigo_clienteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteCajaDiariaCajaBusqueda")) {
				this.jButtonnombre_clienteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalCajaDiariaCajaBusqueda")) {
				this.jButtonsubtotalCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaCajaDiariaCajaBusqueda")) {
				this.jButtonivaCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoCajaDiariaCajaBusqueda")) {
				this.jButtondescuentoCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoCajaDiariaCajaBusqueda")) {
				this.jButtonfinanciamientoCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteCajaDiariaCajaBusqueda")) {
				this.jButtonfleteCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceCajaDiariaCajaBusqueda")) {
				this.jButtoniceCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCajaDiariaCajaBusqueda")) {
				this.jButtontotalCajaDiariaCajaBusquedaActionPerformed(evt);
			}
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaDiariaCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaDiariaCaja")) {
				closingInternalFrameCajaDiariaCaja();
				
			} else if(sTipo.equals("jButtonCancelarCajaDiariaCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaDiariaCaja = (JInternalFrameBase)evt.getSource();
	            	
	            CajaDiariaCajaBeanSwingJInternalFrame jInternalFrameParent=(CajaDiariaCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaDiariaCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaDiariaCajaActionPerformed(null);
			}
			
			CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajadiariacaja,new Object(),this.cajadiariacajaParameterGeneral,this.cajadiariacajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaDiariaCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaDiariaCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaDiariaCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajadiariacaja)) {
			if(!esControlTabla) {
				if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);			
				}
				
				if(this.cajadiariacajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaDiariaCaja(this.cajadiariacaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaDiariaCaja(this.cajadiariacajaReturnGeneral,this.cajadiariacajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajadiariacajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaDiariaCaja(classes,this.cajadiariacajaReturnGeneral,this.cajadiariacajaBean,false);
					}
						
					if(this.cajadiariacajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaCaja(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja());	
					}
						
					if(this.cajadiariacajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja(),classes);//this.cajadiariacajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaDiariaCaja(this.cajadiariacaja,classes);//this.cajadiariacajaBean);									
				}
			
				if(CajaDiariaCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaDiariaCaja(this.cajadiariacaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaCaja(this.cajadiariacaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajadiariacajaAnterior!=null) {
						this.cajadiariacaja=this.cajadiariacajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajadiariacajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajadiariacajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja(),cajadiariacajaLogic.getCajaDiariaCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajadiariacajaReturnGeneral.getCajaDiariaCaja(),this.cajadiariacajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaDiariaCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaDiariaCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaDiariaCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaDiariaCaja() throws Exception {
		
		CajaDiariaCajaModel cajadiariacajaModel=(CajaDiariaCajaModel)this.jTableDatosCajaDiariaCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajadiariacajaModel.cajadiariacajas=this.cajadiariacajaLogic.getCajaDiariaCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajadiariacajaModel.cajadiariacajas=this.cajadiariacajas;
		}
		
		
		((CajaDiariaCajaModel) this.jTableDatosCajaDiariaCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaDiariaCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajadiariacajaAnterior(),this.cajadiariacajaLogic.getCajaDiariaCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajadiariacajaAnterior(),this.cajadiariacajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaDiariaCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
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
										
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajadiariacaja,new Object(),generalEntityParameterGeneral,this.cajadiariacajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajadiariacajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaDiariaCajaConstantesFunciones.getClassesRelationshipsOfCajaDiariaCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaDiariaCajaConstantesFunciones.getClassesRelationshipsFromStringsOfCajaDiariaCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaDiariaCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaDiariaCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajadiariacaja,new Object(),generalEntityParameterGeneral,this.cajadiariacajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaDiariaCaja(CajaDiariaCajaBean cajadiariacajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaDiariaCaja(ArrayList<Classe> classes,CajaDiariaCajaReturnGeneral cajadiariacajaReturnGeneral,CajaDiariaCajaBean cajadiariacajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajadiariacaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaDiariaCaja = new CajaDiariaCajaDetalleFormJInternalFrame(jDesktopPane,this.cajadiariacajaSessionBean.getConGuardarRelaciones(),this.cajadiariacajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.setVisible(false);
		this.jInternalFrameDetalleFormCajaDiariaCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.cajadiariacajaLogic=this.cajadiariacajaLogic;
		
		this.cargarCombosFrameForeignKeyCajaDiariaCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaDiariaCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaDiariaCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaDiariaCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaDiariaCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaDiariaCaja"));
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"ModificarCajaDiariaCaja"));

		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaDiariaCaja"));
					
		this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemModificarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaDiariaCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"ActualizarCajaDiariaCaja"));
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaDiariaCaja"));
						
		this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemActualizarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaDiariaCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"EliminarCajaDiariaCaja"));
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaDiariaCaja"));
								
		this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemEliminarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaDiariaCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CancelarCajaDiariaCaja"));
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaDiariaCaja"));
					
		this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemCancelarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaDiariaCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemDetalleCerrarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaDiariaCaja"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaDiariaCaja"));
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaDiariaCaja"));
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaDiariaCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonidCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCajaDiariaCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_empresaCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_empresaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_cajaCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_cajaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaCajaBusqueda"));
		//jButtonid_clienteCajaDiariaCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaDiariaCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCaja"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfecha_inicioCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfecha_finCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonnombre_cajaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonsecuencialCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtoncodigo_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonnombre_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonsubtotalCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonivaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"ivaCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtondescuentoCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfinanciamientoCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfleteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fleteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtoniceCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"iceCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtontotalCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalCajaDiariaCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaDiariaCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaDiariaCaja"));
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaDiariaCaja"));
		}
		
		this.jTableDatosCajaDiariaCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaDiariaCaja"));
		
		this.jTableDatosCajaDiariaCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaDiariaCaja"));
		
		this.jButtonNuevoCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"NuevoCajaDiariaCaja"));
		
		this.jButtonDuplicarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"DuplicarCajaDiariaCaja"));
		
		this.jButtonCopiarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"CopiarCajaDiariaCaja"));
		
		this.jButtonVerFormCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"VerFormCajaDiariaCaja"));
		
		
		this.jButtonNuevoToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaDiariaCaja"));
			
		this.jButtonDuplicarToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaDiariaCaja"));
			
		this.jMenuItemNuevoCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaDiariaCaja"));
			
		this.jMenuItemDuplicarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaDiariaCaja"));		
		
		
		this.jButtonNuevoRelacionesCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaDiariaCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaDiariaCaja"));
			
		this.jMenuItemNuevoRelacionesCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaDiariaCaja"));		
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"ModificarCajaDiariaCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonModificarToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaDiariaCaja"));
			
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemModificarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaDiariaCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"ActualizarCajaDiariaCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonActualizarToolBarCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaDiariaCaja"));
				
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemActualizarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaDiariaCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"EliminarCajaDiariaCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonEliminarToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaDiariaCaja"));
						
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemEliminarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaDiariaCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CancelarCajaDiariaCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonCancelarToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaDiariaCaja"));
			
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemCancelarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaDiariaCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaDiariaCaja"));		
		
		
		this.jButtonCerrarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CerrarCajaDiariaCaja"));
		
		
		this.jButtonCerrarToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaDiariaCaja"));
			
		this.jMenuItemCerrarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaDiariaCaja"));
			
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jMenuItemDetalleCerrarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaDiariaCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaDiariaCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaDiariaCaja"));
		}
		
		this.jButtonCopiarToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaDiariaCaja"));
			
		this.jButtonVerFormToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaDiariaCaja"));
		
		this.jMenuItemGuardarCambiosCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaDiariaCaja"));
			
		this.jMenuItemCopiarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaDiariaCaja"));		
		
		this.jMenuItemVerFormCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaDiariaCaja"));		
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaDiariaCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaDiariaCaja"));
			
		this.jMenuItemGuardarCambiosTablaCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaDiariaCaja"));		
		
		
		
		this.jButtonRecargarInformacionCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaDiariaCaja"));
					
		this.jButtonRecargarInformacionToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaDiariaCaja"));
		
		this.jMenuItemRecargarInformacionCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaDiariaCaja"));		
		
		
		
		this.jButtonAnterioresCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"AnterioresCajaDiariaCaja"));
		
		
		this.jButtonAnterioresToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaDiariaCaja"));
		
		this.jMenuItemAnterioresCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaDiariaCaja"));		
		
		
		this.jButtonSiguientesCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"SiguientesCajaDiariaCaja"));
		
		
		this.jButtonSiguientesToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaDiariaCaja"));
			
		this.jMenuItemSiguientesCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaDiariaCaja"));
			
		this.jMenuItemAbrirOrderByCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaDiariaCaja"));
			
		this.jMenuItemMostrarOcultarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaDiariaCaja"));
			
		this.jMenuItemDetalleAbrirOrderByCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaDiariaCaja"));
			
		this.jMenuItemDetalleMostarOcultarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaDiariaCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaDiariaCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaDiariaCaja"));
			
		this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaDiariaCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaDiariaCaja"));

		this.jCheckBoxSeleccionadosCajaDiariaCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaDiariaCaja"));
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaDiariaCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaDiariaCaja"));
			
		this.jComboBoxTiposAccionesCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaDiariaCaja"));
					
		this.jComboBoxTiposSeleccionarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaDiariaCaja"));
			
		this.jTextFieldValorCampoGeneralCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaDiariaCaja"));		
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonidCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCajaDiariaCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_empresaCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_empresaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_cajaCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_cajaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaCajaBusqueda"));
		//jButtonid_clienteCajaDiariaCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaDiariaCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCaja"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfecha_inicioCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfecha_finCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonnombre_cajaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonsecuencialCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtoncodigo_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonnombre_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonsubtotalCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonivaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"ivaCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtondescuentoCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfinanciamientoCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfleteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fleteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtoniceCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"iceCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtontotalCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalCajaDiariaCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"BusquedaCajaDiariaCajaCajaDiariaCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaDiariaCaja!=null) {
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaDiariaCaja"));
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaDiariaCaja"));
				this.jInternalFrameReporteDinamicoCajaDiariaCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaDiariaCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaDiariaCaja"));				
			//this.jButtonGenerarReporteDinamicoCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaDiariaCaja"));
			//this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaDiariaCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaDiariaCaja!=null) {
				this.jInternalFrameImportacionCajaDiariaCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaDiariaCaja"));
				this.jInternalFrameImportacionCajaDiariaCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaDiariaCaja"));
				this.jInternalFrameImportacionCajaDiariaCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaDiariaCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaDiariaCaja"));
			
			this.jButtonAbrirOrderByToolBarCajaDiariaCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaDiariaCaja"));			
			
			if(this.jInternalFrameOrderByCajaDiariaCaja!=null) {
				this.jInternalFrameOrderByCajaDiariaCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaDiariaCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaCaja.jTabbedPaneRelacionesCajaDiariaCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaDiariaCaja"));
		
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
            		closingInternalFrameCajaDiariaCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaDiariaCaja = (JInternalFrameBase)event.getSource();
	            	
	            CajaDiariaCajaBeanSwingJInternalFrame jInternalFrameParent=(CajaDiariaCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaDiariaCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaDiariaCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaDiariaCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaDiariaCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaDiariaCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaDiariaCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaDiariaCaja";
		inputMap = this.jButtonNuevoCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaDiariaCaja";
		inputMap = this.jButtonNuevoRelacionesCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaDiariaCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaDiariaCaja";
		inputMap = this.jButtonModificarCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaDiariaCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaDiariaCaja";
		inputMap = this.jButtonActualizarCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaDiariaCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaDiariaCaja";
		inputMap = this.jButtonEliminarCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaDiariaCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaDiariaCaja";
		inputMap = this.jButtonCancelarCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaDiariaCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaDiariaCaja";
		inputMap = this.jButtonCerrarCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaDiariaCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaDiariaCaja";
		inputMap = this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonGuardarCambiosCajaDiariaCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaDiariaCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaDiariaCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaDiariaCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaDiariaCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaDiariaCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaDiariaCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaDiariaCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaDiariaCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaDiariaCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonidCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"idCajaDiariaCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_empresaCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_empresaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_cajaCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_cajaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaCajaBusqueda"));
		//jButtonid_clienteCajaDiariaCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaDiariaCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCaja"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCajaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfecha_inicioCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfecha_finCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonnombre_cajaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonsecuencialCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtoncodigo_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonnombre_clienteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonsubtotalCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonivaCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"ivaCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtondescuentoCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfinanciamientoCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonfleteCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"fleteCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtoniceCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"iceCajaDiariaCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaCaja.jButtontotalCajaDiariaCajaBusqueda.addActionListener(new ButtonActionListener(this,"totalCajaDiariaCajaBusqueda"));
		
		
		this.jButtonBusquedaCajaDiariaCajaCajaDiariaCaja.addActionListener(new ButtonActionListener(this,"BusquedaCajaDiariaCajaCajaDiariaCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaDiariaCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaDiariaCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaDiariaCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaDiariaCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaDiariaCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
					cajadiariacajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajas) {
					cajadiariacajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaDiariaCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
						cajadiariacajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajas) {
						cajadiariacajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaDiariaCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaDiariaCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaDiariaCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaDiariaCaja.getSelectedRows();
			
			CajaDiariaCaja cajadiariacajaLocal=new CajaDiariaCaja();
			
			//this.seleccionarTodosCajaDiariaCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajadiariacajaLocal =(CajaDiariaCaja) this.cajadiariacajaLogic.getCajaDiariaCajas().toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajadiariacajaLocal =(CajaDiariaCaja) this.cajadiariacajas.toArray()[this.jTableDatosCajaDiariaCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajadiariacajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
						cajadiariacajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajas) {
						cajadiariacajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaDiariaCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaDiariaCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaDiariaCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaDiariaCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaDiariaCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaDiariaCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajaLogic.getCajaDiariaCajas()) {
				
						if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cajadiariacajaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cajadiariacajaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							cajadiariacajaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajadiariacajaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							cajadiariacajaAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							cajadiariacajaAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							cajadiariacajaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							cajadiariacajaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							cajadiariacajaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							cajadiariacajaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							cajadiariacajaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							cajadiariacajaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cajadiariacajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajas) {
					
						if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cajadiariacajaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cajadiariacajaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							cajadiariacajaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajadiariacajaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							cajadiariacajaAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							cajadiariacajaAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							cajadiariacajaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							cajadiariacajaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							cajadiariacajaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							cajadiariacajaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							cajadiariacajaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							cajadiariacajaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cajadiariacajaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaDiariaCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaDiariaCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaDiariaCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaDiariaCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaDiariaCaja(conSplash);
				
					this.generarReporteCajaDiariaCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaDiariaCajasSeleccionados();
				//this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaDiariaCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaDiariaCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaDiariaCaja();
				
				this.exportarCajaDiariaCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaDiariaCajas();
				//this.importarCajaDiariaCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaDiariaCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaDiariaCajasSeleccionados();
				//this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Diaria Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaDiariaCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaDiariaCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaDiariaCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaDiariaCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaDiariaCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaDiariaCaja(conSplash);
					
						//this.actualizarParametrosGeneralCajaDiariaCaja();
						
						this.generarReporteProcesoAccionCajaDiariaCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaDiariaCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja Diaria CajaS SELECCIONADOS?", "MANTENIMIENTO DE Caja Diaria Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaDiariaCaja();
				
						this.actualizarParametrosGeneralCajaDiariaCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajadiariacajaReturnGeneral=cajadiariacajaLogic.procesarAccionCajaDiariaCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajadiariacajaLogic.getCajaDiariaCajas(),this.cajadiariacajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaDiariaCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaDiariaCaja();
					
					CajaDiariaCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaDiariaCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaDiariaCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxTiposAccionesFormularioCajaDiariaCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaDiariaCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaDiariaCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaDiariaCaja();
			
			if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
			CajaDiariaCaja cajadiariacaja=new CajaDiariaCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaDiariaCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaDiariaCaja.getSelectedItem();
			
			
			
			
			cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajadiariacajasSeleccionados.size()==1) {
				for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasSeleccionados) {
					cajadiariacaja=cajadiariacajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaDiariaCaja();
			
      		//this.finishProcessCajaDiariaCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaDiariaCajaReturnGeneral() throws Exception {
		if(this.cajadiariacajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajadiariacajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajadiariacajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajadiariacajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajadiariacajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajadiariacajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaDiariaCaja(false);
		}
		
		if(this.cajadiariacajaReturnGeneral.getConRetornoLista() || this.cajadiariacajaReturnGeneral.getConRetornoObjeto()) {
			if(this.cajadiariacajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajadiariacajaLogic.setCajaDiariaCajas(this.cajadiariacajaReturnGeneral.getCajaDiariaCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCajaDiariaCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaDiariaCaja() throws Exception {
		
		
	}
	
	public ArrayList<CajaDiariaCaja> getCajaDiariaCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaDiariaCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajaLogic.getCajaDiariaCajas()) {
					if(cajadiariacajaAux.getIsSelected()) {
						cajadiariacajasSeleccionados.add(cajadiariacajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaCaja cajadiariacajaAux:this.cajadiariacajas) {
					if(cajadiariacajaAux.getIsSelected()) {
						cajadiariacajasSeleccionados.add(cajadiariacajaAux);				
					}
				}
			}
			
			if(cajadiariacajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajadiariacajasSeleccionados.addAll(this.cajadiariacajaLogic.getCajaDiariaCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajadiariacajasSeleccionados.addAll(this.cajadiariacajas);				
					}
				}
			}
		} else {
			cajadiariacajasSeleccionados.add(this.cajadiariacaja);
		}
		
		return cajadiariacajasSeleccionados;
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
	
	public void generarReporteCajaDiariaCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaDiariaCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaDiariaCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaDiariaCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaDiariaCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Diaria Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaDiariaCajasSeleccionados() throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaDiariaCajasSeleccionados() throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaDiariaCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaDiariaCajasSeleccionados() throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaDiariaCaja();
		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaDiariaCaja();
		
		
		//this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados ,cajadiariacajaImplementable,cajadiariacajaImplementableHome);
	}
	
	public void mostrarImportacionCajaDiariaCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaDiariaCaja();
		
		this.abrirFrameImportacionCajaDiariaCaja();		
		
			
		//this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados ,cajadiariacajaImplementable,cajadiariacajaImplementableHome);
	}
	
	public void importarCajaDiariaCajas() throws Exception {		
	
	}
	
	public void exportarCajaDiariaCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaDiariaCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaDiariaCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaDiariaCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Diaria Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaDiariaCajasSeleccionados() throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaDiariaCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaDiariaCaja(cajadiariacajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajadiariacajaAux.setsDetalleGeneralEntityReporte(cajadiariacajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaDiariaCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaCajaConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajadiariacaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getfinanciamiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariacaja.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaDiariaCajasSeleccionados() throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaDiariaCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaDiariaCaja(row);				
				iRow++;
			}				
			
			for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaDiariaCaja(cajadiariacajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaDiariaCajasSeleccionados() throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();		
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariacaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajadiariacajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajadiariacaja");
			//elementRoot.appendChild(element);
		
			for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasSeleccionados) {
				element = document.createElement("cajadiariacaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaDiariaCaja(cajadiariacajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaDiariaCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FINANCIAMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaCajaConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getfinanciamiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariacaja.gettotal());				
	}
	
	public void setFilaDatosExportarXmlCajaDiariaCaja(CajaDiariaCaja cajadiariacaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaDiariaCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajadiariacaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaDiariaCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajadiariacaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajaDiariaCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajadiariacaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcaja_descripcion = document.createElement(CajaDiariaCajaConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajadiariacaja.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementcliente_descripcion = document.createElement(CajaDiariaCajaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cajadiariacaja.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfecha_inicio = document.createElement(CajaDiariaCajaConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(cajadiariacaja.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(CajaDiariaCajaConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(cajadiariacaja.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_caja = document.createElement(CajaDiariaCajaConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(cajadiariacaja.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementsecuencial = document.createElement(CajaDiariaCajaConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(cajadiariacaja.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcodigo_cliente = document.createElement(CajaDiariaCajaConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(cajadiariacaja.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementnombre_cliente = document.createElement(CajaDiariaCajaConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(cajadiariacaja.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementsubtotal = document.createElement(CajaDiariaCajaConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(cajadiariacaja.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementiva = document.createElement(CajaDiariaCajaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(cajadiariacaja.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(CajaDiariaCajaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(cajadiariacaja.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementfinanciamiento = document.createElement(CajaDiariaCajaConstantesFunciones.FINANCIAMIENTO);
		elementfinanciamiento.appendChild(document.createTextNode(cajadiariacaja.getfinanciamiento().toString().trim()));
		element.appendChild(elementfinanciamiento);

		Element elementflete = document.createElement(CajaDiariaCajaConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(cajadiariacaja.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementice = document.createElement(CajaDiariaCajaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(cajadiariacaja.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementtotal = document.createElement(CajaDiariaCajaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(cajadiariacaja.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoCajaDiariaCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados=new ArrayList<CajaDiariaCaja>();
		
		cajadiariacajasSeleccionados=this.getCajaDiariaCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajaDiariaCaja(cajadiariacajasSeleccionados);
		
		this.generarReporteCajaDiariaCajas("Todos",cajadiariacajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaDiariaCaja(ArrayList<CajaDiariaCaja> cajadiariacajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaDiariaCaja cajadiariacajaAux:cajadiariacajasSeleccionados) {
				cajadiariacajaAux.setsDetalleGeneralEntityReporte(cajadiariacajaAux.toString());
			
				if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajadiariacajaAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajadiariacajaAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getnombre_caja());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaCajaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					cajadiariacajaAux.setsDescripcionGeneralEntityReporte1(cajadiariacajaAux.getnombre_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaDiariaCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaDiariaCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=true;
				this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=true;
			}
			
			this.isVisibilidadCeldaModificarCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
			this.isVisibilidadCeldaModificarCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=true;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
			this.isVisibilidadCeldaModificarCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=true;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=true;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
			this.isVisibilidadCeldaModificarCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=true;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=true;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=true;
			this.isVisibilidadCeldaModificarCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
			this.isVisibilidadCeldaModificarCajaDiariaCaja=true;
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
			this.isVisibilidadCeldaCancelarCajaDiariaCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaDiariaCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=true;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=true;
		} else {
			this.actualizarEstadoPanelsCajaDiariaCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaDiariaCaja=false;
			//this.isVisibilidadCeldaVerFormCajaDiariaCaja=false;
			this.isVisibilidadCeldaDuplicarCajaDiariaCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajadiariacajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			if(!cajadiariacajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;												
			}
			
			this.jButtonCerrarCajaDiariaCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.cajadiariacaja)) {
			this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
			this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCajaDiariaCaja=false;
		this.isVisibilidadCeldaNuevoRelacionesCajaDiariaCaja=false;
		this.isVisibilidadCeldaGuardarCambiosCajaDiariaCaja=false;
		//this.isVisibilidadCeldaModificarCajaDiariaCaja=true;
		this.isVisibilidadCeldaActualizarCajaDiariaCaja=false;
		this.isVisibilidadCeldaEliminarCajaDiariaCaja=false;
		//this.isVisibilidadCeldaCancelarCajaDiariaCaja=true;			
		this.isVisibilidadCeldaGuardarCajaDiariaCaja=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaDiariaCaja() {
	}
	
	public void actualizarEstadoPanelsCajaDiariaCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaDiariaCaja!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaCaja!=null) {
				this.jScrollPanelDatosCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaCaja!=null) {
				this.jPanelPaginacionCajaDiariaCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
					this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajadiariacajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaCaja!=null) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaDiariaCaja!=null) {
				this.jPanelParametrosReportesCajaDiariaCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCajaDiariaCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCajaDiariaCaja) {this.jTabbedPaneBusquedasCajaDiariaCaja.remove(jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaCajaDiariaCaja=isParaCaja;
			if(!this.isVisibilidadBusquedaCajaDiariaCaja) {this.jTabbedPaneBusquedasCajaDiariaCaja.remove(jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaCajaDiariaCaja=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaCajaDiariaCaja) {this.jTabbedPaneBusquedasCajaDiariaCaja.remove(jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);}
		}
		
	}
	
	
	
	

	public String registrarSesionCajaDiariaCajaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cajadiariacajaSessionBean==null) {
				cajadiariacajaSessionBean=new CajaDiariaCajaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cajadiariacajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cajadiariacajaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CajaDiariaCajaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCajaDiariaCaja(true);
			//clienteSessionBean.setlidCajaDiariaCajaActual(this.idCajaDiariaCajaActual);

			cajadiariacajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaCaja(true);
			cajadiariacajaSessionBean.setlIdCajaDiariaCajaActualForeignKey(this.idCajaDiariaCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaDiariaCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaDiariaCaja() {
		this.updateBorderResaltarBusquedasFormularioCajaDiariaCaja();
		this.updateVisibilidadBusquedasFormularioCajaDiariaCaja();
		this.updateHabilitarBusquedasFormularioCajaDiariaCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaDiariaCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaDiariaCaja.getComponents().length>0) {
	

		if(this.cajadiariacajaConstantesFunciones.resaltarBusquedaCajaDiariaCajaCajaDiariaCaja!=null) {
			index= this.jTabbedPaneBusquedasCajaDiariaCaja.indexOfComponent(this.jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaCaja.getComponent(index);
				jPanel.setBorder(this.cajadiariacajaConstantesFunciones.resaltarBusquedaCajaDiariaCajaCajaDiariaCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaDiariaCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaDiariaCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaDiariaCaja.indexOfComponent(this.jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajadiariacajaConstantesFunciones.mostrarBusquedaCajaDiariaCajaCajaDiariaCaja);
			if(!this.cajadiariacajaConstantesFunciones.mostrarBusquedaCajaDiariaCajaCajaDiariaCaja && index>-1) {
				this.jTabbedPaneBusquedasCajaDiariaCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaDiariaCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaDiariaCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaDiariaCaja.indexOfComponent(this.jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajadiariacajaConstantesFunciones.activarBusquedaCajaDiariaCajaCajaDiariaCaja);
				this.jTabbedPaneBusquedasCajaDiariaCaja.setEnabledAt(index,this.cajadiariacajaConstantesFunciones.activarBusquedaCajaDiariaCajaCajaDiariaCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaDiariaCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCajaDiariaCaja")) {
			index= this.jTabbedPaneBusquedasCajaDiariaCaja.indexOfComponent(this.jPanelBusquedaCajaDiariaCajaCajaDiariaCaja);

			this.jTabbedPaneBusquedasCajaDiariaCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaCaja.getComponent(index);

			this.cajadiariacajaConstantesFunciones.setResaltarBusquedaCajaDiariaCajaCajaDiariaCaja(resaltar);

			jPanel.setBorder(this.cajadiariacajaConstantesFunciones.resaltarBusquedaCajaDiariaCajaCajaDiariaCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaDiariaCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajaDiariaCaja() throws Exception {

		if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaDiariaCaja();
		this.updateVisibilidadResaltarControlesFormularioCajaDiariaCaja();
		this.updateHabilitarResaltarControlesFormularioCajaDiariaCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaDiariaCaja() throws Exception {
		if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajadiariacajaConstantesFunciones.resaltaridCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltaridCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarid_empresaCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarid_empresaCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarid_cajaCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarid_cajaCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarid_clienteCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarid_clienteCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarfecha_inicioCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_inicioCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarfecha_inicioCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarfecha_finCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_finCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarfecha_finCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarnombre_cajaCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarnombre_cajaCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarsecuencialCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarsecuencialCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarcodigo_clienteCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarcodigo_clienteCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarnombre_clienteCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarnombre_clienteCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarsubtotalCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarsubtotalCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarivaCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarivaCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltardescuentoCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltardescuentoCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarfinanciamientoCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarfinanciamientoCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltarfleteCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltarfleteCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltariceCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltariceCajaDiariaCaja);}
		if(this.cajadiariacajaConstantesFunciones.resaltartotalCajaDiariaCaja!=null && this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setBorder(this.cajadiariacajaConstantesFunciones.resaltartotalCajaDiariaCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaDiariaCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
	
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostraridCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelidCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostraridCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_empresaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelid_empresaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_empresaCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_cajaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelid_cajaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_cajaCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelid_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_clienteCajaDiariaCaja);
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarid_clienteCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_inicioCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfecha_inicioCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelfecha_inicioCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfecha_inicioCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_finCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfecha_finCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelfecha_finCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfecha_finCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarnombre_cajaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelnombre_cajaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarnombre_cajaCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarsecuencialCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelsecuencialCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarsecuencialCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarcodigo_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelcodigo_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarcodigo_clienteCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarnombre_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelnombre_clienteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarnombre_clienteCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarsubtotalCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelsubtotalCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarsubtotalCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarivaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelivaCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarivaCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrardescuentoCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPaneldescuentoCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrardescuentoCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfinanciamientoCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelfinanciamientoCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfinanciamientoCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfleteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPanelfleteCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrarfleteCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrariceCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPaneliceCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrariceCajaDiariaCaja);
		//this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrartotalCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jPaneltotalCajaDiariaCaja.setVisible(this.cajadiariacajaConstantesFunciones.mostrartotalCajaDiariaCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaDiariaCaja() throws Exception {
		if(this.jInternalFrameDetalleFormCajaDiariaCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaDiariaCaja!=null) {
	
		this.jInternalFrameDetalleFormCajaDiariaCaja.jLabelidCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activaridCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_empresaCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarid_empresaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_cajaCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarid_cajaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jComboBoxid_clienteCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarid_clienteCajaDiariaCaja);
			this.jInternalFrameDetalleFormCajaDiariaCaja.jButtonid_clienteCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarid_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_inicioCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarfecha_inicioCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jDateChooserfecha_finCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarfecha_finCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_cajaCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarnombre_cajaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsecuencialCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarsecuencialCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldcodigo_clienteCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarcodigo_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextAreanombre_clienteCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarnombre_clienteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldsubtotalCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarsubtotalCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldivaCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarivaCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFielddescuentoCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activardescuentoCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfinanciamientoCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarfinanciamientoCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldfleteCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activarfleteCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldiceCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activariceCajaDiariaCaja);
		this.jInternalFrameDetalleFormCajaDiariaCaja.jTextFieldtotalCajaDiariaCaja.setEnabled(this.cajadiariacajaConstantesFunciones.activartotalCajaDiariaCaja);
		}
	}
	
		
}