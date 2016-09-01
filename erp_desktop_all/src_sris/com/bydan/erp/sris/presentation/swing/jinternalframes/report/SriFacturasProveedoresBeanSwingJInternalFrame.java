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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.sris.util.SriFacturasProveedoresConstantesFunciones;
import com.bydan.erp.sris.util.report.SriFacturasProveedoresParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.SriFacturasProveedoresParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.SriFacturasProveedoresBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SriFacturasProveedoresBeanSwingJInternalFrame extends SriFacturasProveedoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SriFacturasProveedoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SriFacturasProveedores> srifacturasproveedoresValidator = new ClassValidator<SriFacturasProveedores>(SriFacturasProveedores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SriFacturasProveedores srifacturasproveedores;	
	public SriFacturasProveedores srifacturasproveedoresAux;
	public SriFacturasProveedores srifacturasproveedoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SriFacturasProveedores srifacturasproveedoresTotales;
	public Long idSriFacturasProveedoresActual;
	public Long iIdNuevoSriFacturasProveedores=0L;
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

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
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
	
	public Boolean isPermisoTodoSriFacturasProveedores;
	public Boolean isPermisoNuevoSriFacturasProveedores;
	public Boolean isPermisoActualizarSriFacturasProveedores;
	public Boolean isPermisoActualizarOriginalSriFacturasProveedores;
	public Boolean isPermisoEliminarSriFacturasProveedores;
	public Boolean isPermisoGuardarCambiosSriFacturasProveedores;
	public Boolean isPermisoConsultaSriFacturasProveedores;
	public Boolean isPermisoBusquedaSriFacturasProveedores;
	public Boolean isPermisoReporteSriFacturasProveedores;
	public Boolean isPermisoPaginacionMedioSriFacturasProveedores;
	public Boolean isPermisoPaginacionAltoSriFacturasProveedores;
	public Boolean isPermisoPaginacionTodoSriFacturasProveedores;
	public Boolean isPermisoCopiarSriFacturasProveedores;
	public Boolean isPermisoVerFormSriFacturasProveedores;
	public Boolean isPermisoDuplicarSriFacturasProveedores;
	public Boolean isPermisoOrdenSriFacturasProveedores;
	
	
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
	
	public SriFacturasProveedoresParameterReturnGeneral srifacturasproveedoresReturnGeneral;
	public SriFacturasProveedoresParameterReturnGeneral srifacturasproveedoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSriFacturasProveedores=false;
	public Boolean esParaAccionDesdeFormularioSriFacturasProveedores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SriFacturasProveedoresSessionBeanAdditional srifacturasproveedoresSessionBeanAdditional=null;
	
	public SriFacturasProveedoresSessionBeanAdditional getSriFacturasProveedoresSessionBeanAdditional() {
		return this.srifacturasproveedoresSessionBeanAdditional;
	}
	
	public void setSriFacturasProveedoresSessionBeanAdditional(SriFacturasProveedoresSessionBeanAdditional srifacturasproveedoresSessionBeanAdditional) {
		try {
			this.srifacturasproveedoresSessionBeanAdditional=srifacturasproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SriFacturasProveedoresBeanSwingJInternalFrameAdditional srifacturasproveedoresBeanSwingJInternalFrameAdditional=null;
	//public class SriFacturasProveedoresBeanSwingJInternalFrame
	
	public SriFacturasProveedoresBeanSwingJInternalFrameAdditional getSriFacturasProveedoresBeanSwingJInternalFrameAdditional() {
		return this.srifacturasproveedoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setSriFacturasProveedoresBeanSwingJInternalFrameAdditional(SriFacturasProveedoresBeanSwingJInternalFrameAdditional srifacturasproveedoresBeanSwingJInternalFrameAdditional) {
		try {
			this.srifacturasproveedoresBeanSwingJInternalFrameAdditional=srifacturasproveedoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SriFacturasProveedoresLogic srifacturasproveedoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SriFacturasProveedores srifacturasproveedoresBean;
	public SriFacturasProveedoresConstantesFunciones srifacturasproveedoresConstantesFunciones;
	//public SriFacturasProveedoresParameterReturnGeneral srifacturasproveedoresReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TransaccionLogic transaccionLogic;
	
	//PARAMETROS
	
	
	//public List<SriFacturasProveedores> srifacturasproveedoress;	
	//public List<SriFacturasProveedores> srifacturasproveedoressEliminados;
	//public List<SriFacturasProveedores> srifacturasproveedoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSriFacturasProveedores=false;
	public Boolean isVisibilidadCeldaDuplicarSriFacturasProveedores=true;
	public Boolean isVisibilidadCeldaCopiarSriFacturasProveedores=true;
	public Boolean isVisibilidadCeldaVerFormSriFacturasProveedores=true;
	public Boolean isVisibilidadCeldaOrdenSriFacturasProveedores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
	public Boolean isVisibilidadCeldaModificarSriFacturasProveedores=false;
	public Boolean isVisibilidadCeldaActualizarSriFacturasProveedores=false;
	public Boolean isVisibilidadCeldaEliminarSriFacturasProveedores=false;
	public Boolean isVisibilidadCeldaCancelarSriFacturasProveedores=false;
	public Boolean isVisibilidadCeldaGuardarSriFacturasProveedores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;	
	
	
	public Boolean isVisibilidadBusquedaSriFacturasProveedores=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoSriFacturasProveedores() {
		return this.iIdNuevoSriFacturasProveedores;
	}

	public void setiIdNuevoSriFacturasProveedores(Long iIdNuevoSriFacturasProveedores) {
		this.iIdNuevoSriFacturasProveedores = iIdNuevoSriFacturasProveedores;
	}
	
	public Long getidSriFacturasProveedoresActual() {
		return this.idSriFacturasProveedoresActual;
	}

	public void setidSriFacturasProveedoresActual(Long idSriFacturasProveedoresActual) {
		this.idSriFacturasProveedoresActual = idSriFacturasProveedoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SriFacturasProveedores getsrifacturasproveedores() {
		return this.srifacturasproveedores;
	}

	public void setsrifacturasproveedores(SriFacturasProveedores srifacturasproveedores) {
		this.srifacturasproveedores = srifacturasproveedores;
	}
	
	public SriFacturasProveedores getsrifacturasproveedoresAux() {
		return this.srifacturasproveedoresAux;
	}

	public void setsrifacturasproveedoresAux(SriFacturasProveedores srifacturasproveedoresAux) {
		this.srifacturasproveedoresAux = srifacturasproveedoresAux;
	}				
	
	public SriFacturasProveedores getsrifacturasproveedoresAnterior() {
		return this.srifacturasproveedoresAnterior;
	}

	public void setsrifacturasproveedoresAnterior(SriFacturasProveedores srifacturasproveedoresAnterior) {
		this.srifacturasproveedoresAnterior = srifacturasproveedoresAnterior;
	}	
	
	public SriFacturasProveedores getsrifacturasproveedoresTotales() {
		return this.srifacturasproveedoresTotales;
	}

	public void setsrifacturasproveedoresTotales(SriFacturasProveedores srifacturasproveedoresTotales) {
		this.srifacturasproveedoresTotales = srifacturasproveedoresTotales;
	}	
	
	public SriFacturasProveedores getsrifacturasproveedoresBean() {
		return this.srifacturasproveedoresBean;
	}

	public void setsrifacturasproveedoresBean(SriFacturasProveedores srifacturasproveedoresBean) {
		this.srifacturasproveedoresBean = srifacturasproveedoresBean;
	}	
	
	public SriFacturasProveedoresParameterReturnGeneral getsrifacturasproveedoresReturnGeneral() {
		return this.srifacturasproveedoresReturnGeneral;
	}

	public void setsrifacturasproveedoresReturnGeneral(SriFacturasProveedoresParameterReturnGeneral srifacturasproveedoresReturnGeneral) {
		this.srifacturasproveedoresReturnGeneral = srifacturasproveedoresReturnGeneral;
	}	
	
	
	public Long id_transaccionBusquedaSriFacturasProveedores=-1L;

	public Long getid_transaccionBusquedaSriFacturasProveedores() {
		return this.id_transaccionBusquedaSriFacturasProveedores;
	}

	public void setid_transaccionBusquedaSriFacturasProveedores(Long id_transaccionBusquedaSriFacturasProveedores) {
		this.id_transaccionBusquedaSriFacturasProveedores = id_transaccionBusquedaSriFacturasProveedores;
	}

;
	public Date fecha_emision_desdeBusquedaSriFacturasProveedores=new Date();

	public Date getfecha_emision_desdeBusquedaSriFacturasProveedores() {
		return this.fecha_emision_desdeBusquedaSriFacturasProveedores;
	}

	public void setfecha_emision_desdeBusquedaSriFacturasProveedores(Date fecha_emision_desdeBusquedaSriFacturasProveedores) {
		this.fecha_emision_desdeBusquedaSriFacturasProveedores = fecha_emision_desdeBusquedaSriFacturasProveedores;
	}

;
	public Date fecha_emision_hastaBusquedaSriFacturasProveedores=new Date();

	public Date getfecha_emision_hastaBusquedaSriFacturasProveedores() {
		return this.fecha_emision_hastaBusquedaSriFacturasProveedores;
	}

	public void setfecha_emision_hastaBusquedaSriFacturasProveedores(Date fecha_emision_hastaBusquedaSriFacturasProveedores) {
		this.fecha_emision_hastaBusquedaSriFacturasProveedores = fecha_emision_hastaBusquedaSriFacturasProveedores;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SriFacturasProveedoresLogic getSriFacturasProveedoresLogic()	{		
		return srifacturasproveedoresLogic;
	}

	public void setSriFacturasProveedoresLogic(SriFacturasProveedoresLogic srifacturasproveedoresLogic) {
		this.srifacturasproveedoresLogic = srifacturasproveedoresLogic;
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
	
	public Boolean getIsEsNuevoSriFacturasProveedores() {
		return isEsNuevoSriFacturasProveedores;
	}

	public void setIsEsNuevoSriFacturasProveedores(Boolean isEsNuevoSriFacturasProveedores) {
		this.isEsNuevoSriFacturasProveedores = isEsNuevoSriFacturasProveedores;
	}

	public Boolean getEsParaAccionDesdeFormularioSriFacturasProveedores() {
		return esParaAccionDesdeFormularioSriFacturasProveedores;
	}
	
	public void setEsParaAccionDesdeFormularioSriFacturasProveedores(Boolean esParaAccionDesdeFormularioSriFacturasProveedores) {
		this.esParaAccionDesdeFormularioSriFacturasProveedores = esParaAccionDesdeFormularioSriFacturasProveedores;
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

			if(this.srifacturasproveedoresSessionBean==null) {
				this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
			}

			if(!this.srifacturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(srifacturasproveedoresSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.srifacturasproveedoresSessionBean==null) {
				this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
			}

			if(!this.srifacturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(srifacturasproveedoresSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

					if(this.srifacturasproveedores!=null) {
						this.srifacturasproveedores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
						this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSriFacturasProveedores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSriFacturasProveedoresGenerico)throws Exception
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
				jComboBoxid_empresaSriFacturasProveedoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSriFacturasProveedoresGenerico!=null && jComboBoxid_empresaSriFacturasProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaSriFacturasProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.srifacturasproveedores!=null) {
						this.srifacturasproveedores.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
						this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionSriFacturasProveedores.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaSriFacturasProveedores") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores!=null) {
						jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores!=null) {
							//jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionSriFacturasProveedoresGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionSriFacturasProveedoresGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionSriFacturasProveedoresGenerico!=null && jComboBoxid_transaccionSriFacturasProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_transaccionSriFacturasProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SriFacturasProveedores srifacturasproveedores,JComboBox jComboBoxid_empresaSriFacturasProveedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSriFacturasProveedoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSriFacturasProveedoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				srifacturasproveedores.setid_empresa(empresaAux.getId());
				srifacturasproveedores.setempresa_descripcion(SriFacturasProveedoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				srifacturasproveedores.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(SriFacturasProveedores srifacturasproveedores,JComboBox jComboBoxid_transaccionSriFacturasProveedoresGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionSriFacturasProveedoresGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionSriFacturasProveedoresGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				srifacturasproveedores.setid_transaccion(transaccionAux.getId());
				srifacturasproveedores.settransaccion_descripcion(SriFacturasProveedoresConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				srifacturasproveedores.setTransaccion(transaccionAux);			}
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

					if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { 
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { 
					}

					if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { 
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { 
					}

					if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaSriFacturasProveedores") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.addItem(transaccion);
							}
						}

						if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSriFacturasProveedores() throws Exception {
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
		
	public SriFacturasProveedoresParameterReturnGeneral getSriFacturasProveedoresParameterGeneral() {
		return this.srifacturasproveedoresParameterGeneral;
	}
	
	public void setSriFacturasProveedoresParameterGeneral(SriFacturasProveedoresParameterReturnGeneral srifacturasproveedoresParameterGeneral) {
		this.srifacturasproveedoresParameterGeneral = srifacturasproveedoresParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSriFacturasProveedores() {
		return isPermisoTodoSriFacturasProveedores;
	}

	public void setIsPermisoTodoSriFacturasProveedores(Boolean isPermisoTodoSriFacturasProveedores) {
		this.isPermisoTodoSriFacturasProveedores = isPermisoTodoSriFacturasProveedores;
	}

	public Boolean getIsPermisoNuevoSriFacturasProveedores() {
		return isPermisoNuevoSriFacturasProveedores;
	}

	public void setIsPermisoNuevoSriFacturasProveedores(Boolean isPermisoNuevoSriFacturasProveedores) {
		this.isPermisoNuevoSriFacturasProveedores = isPermisoNuevoSriFacturasProveedores;
	}

	public Boolean getIsPermisoActualizarSriFacturasProveedores() {
		return isPermisoActualizarSriFacturasProveedores;
	}

	public void setIsPermisoActualizarSriFacturasProveedores(Boolean isPermisoActualizarSriFacturasProveedores) {
		this.isPermisoActualizarSriFacturasProveedores = isPermisoActualizarSriFacturasProveedores;
	}

	public Boolean getIsPermisoEliminarSriFacturasProveedores() {
		return isPermisoEliminarSriFacturasProveedores;
	}

	public void setIsPermisoEliminarSriFacturasProveedores(Boolean isPermisoEliminarSriFacturasProveedores) {
		this.isPermisoEliminarSriFacturasProveedores = isPermisoEliminarSriFacturasProveedores;
	}

	public Boolean getIsPermisoGuardarCambiosSriFacturasProveedores() {
		return isPermisoGuardarCambiosSriFacturasProveedores;
	}

	public void setIsPermisoGuardarCambiosSriFacturasProveedores(Boolean isPermisoGuardarCambiosSriFacturasProveedores) {
		this.isPermisoGuardarCambiosSriFacturasProveedores = isPermisoGuardarCambiosSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoConsultaSriFacturasProveedores() {
		return isPermisoConsultaSriFacturasProveedores;
	}

	public void setIsPermisoConsultaSriFacturasProveedores(Boolean isPermisoConsultaSriFacturasProveedores) {
		this.isPermisoConsultaSriFacturasProveedores = isPermisoConsultaSriFacturasProveedores;
	}

	public Boolean getIsPermisoBusquedaSriFacturasProveedores() {
		return isPermisoBusquedaSriFacturasProveedores;
	}

	public void setIsPermisoBusquedaSriFacturasProveedores(Boolean isPermisoBusquedaSriFacturasProveedores) {
		this.isPermisoBusquedaSriFacturasProveedores = isPermisoBusquedaSriFacturasProveedores;
	}

	public Boolean getIsPermisoReporteSriFacturasProveedores() {
		return isPermisoReporteSriFacturasProveedores;
	}

	public void setIsPermisoReporteSriFacturasProveedores(Boolean isPermisoReporteSriFacturasProveedores) {
		this.isPermisoReporteSriFacturasProveedores = isPermisoReporteSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionMedioSriFacturasProveedores() {
		return isPermisoPaginacionMedioSriFacturasProveedores;
	}

	public void setIsPermisoPaginacionMedioSriFacturasProveedores(Boolean isPermisoPaginacionMedioSriFacturasProveedores) {
		this.isPermisoPaginacionMedioSriFacturasProveedores = isPermisoPaginacionMedioSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionTodoSriFacturasProveedores() {
		return isPermisoPaginacionTodoSriFacturasProveedores;
	}

	public void setIsPermisoPaginacionTodoSriFacturasProveedores(Boolean isPermisoPaginacionTodoSriFacturasProveedores) {
		this.isPermisoPaginacionTodoSriFacturasProveedores = isPermisoPaginacionTodoSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionAltoSriFacturasProveedores() {
		return isPermisoPaginacionAltoSriFacturasProveedores;
	}

	public void setIsPermisoPaginacionAltoSriFacturasProveedores(Boolean isPermisoPaginacionAltoSriFacturasProveedores) {
		this.isPermisoPaginacionAltoSriFacturasProveedores = isPermisoPaginacionAltoSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoCopiarSriFacturasProveedores() {
		return isPermisoCopiarSriFacturasProveedores;
	}

	public void setIsPermisoCopiarSriFacturasProveedores(Boolean isPermisoCopiarSriFacturasProveedores) {
		this.isPermisoCopiarSriFacturasProveedores = isPermisoCopiarSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoVerFormSriFacturasProveedores() {
		return isPermisoVerFormSriFacturasProveedores;
	}

	public void setIsPermisoVerFormSriFacturasProveedores(Boolean isPermisoVerFormSriFacturasProveedores) {
		this.isPermisoVerFormSriFacturasProveedores = isPermisoVerFormSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoDuplicarSriFacturasProveedores() {
		return isPermisoDuplicarSriFacturasProveedores;
	}

	public void setIsPermisoDuplicarSriFacturasProveedores(Boolean isPermisoDuplicarSriFacturasProveedores) {
		this.isPermisoDuplicarSriFacturasProveedores = isPermisoDuplicarSriFacturasProveedores;
	}
	
	public Boolean getIsPermisoOrdenSriFacturasProveedores() {
		return isPermisoOrdenSriFacturasProveedores;
	}

	public void setIsPermisoOrdenSriFacturasProveedores(Boolean isPermisoOrdenSriFacturasProveedores) {
		this.isPermisoOrdenSriFacturasProveedores = isPermisoOrdenSriFacturasProveedores;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSriFacturasProveedores() {
		return isVisibilidadCeldaNuevoSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaNuevoSriFacturasProveedores(Boolean isVisibilidadCeldaNuevoSriFacturasProveedores) {
		this.isVisibilidadCeldaNuevoSriFacturasProveedores = isVisibilidadCeldaNuevoSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSriFacturasProveedores() {
		return isVisibilidadCeldaDuplicarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaDuplicarSriFacturasProveedores(Boolean isVisibilidadCeldaDuplicarSriFacturasProveedores) {
		this.isVisibilidadCeldaDuplicarSriFacturasProveedores = isVisibilidadCeldaDuplicarSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSriFacturasProveedores() {
		return isVisibilidadCeldaCopiarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaCopiarSriFacturasProveedores(Boolean isVisibilidadCeldaCopiarSriFacturasProveedores) {
		this.isVisibilidadCeldaCopiarSriFacturasProveedores = isVisibilidadCeldaCopiarSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSriFacturasProveedores() {
		return isVisibilidadCeldaVerFormSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaVerFormSriFacturasProveedores(Boolean isVisibilidadCeldaVerFormSriFacturasProveedores) {
		this.isVisibilidadCeldaVerFormSriFacturasProveedores = isVisibilidadCeldaVerFormSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSriFacturasProveedores() {
		return isVisibilidadCeldaOrdenSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaOrdenSriFacturasProveedores(Boolean isVisibilidadCeldaOrdenSriFacturasProveedores) {
		this.isVisibilidadCeldaOrdenSriFacturasProveedores = isVisibilidadCeldaOrdenSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSriFacturasProveedores() {
		return isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSriFacturasProveedores(Boolean isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores) {
		this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores = isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSriFacturasProveedores() {
		return isVisibilidadCeldaModificarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaModificarSriFacturasProveedores(Boolean isVisibilidadCeldaModificarSriFacturasProveedores) {
		this.isVisibilidadCeldaModificarSriFacturasProveedores = isVisibilidadCeldaModificarSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSriFacturasProveedores() {
		return isVisibilidadCeldaActualizarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaActualizarSriFacturasProveedores(Boolean isVisibilidadCeldaActualizarSriFacturasProveedores) {
		this.isVisibilidadCeldaActualizarSriFacturasProveedores = isVisibilidadCeldaActualizarSriFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaEliminarSriFacturasProveedores() {
		return isVisibilidadCeldaEliminarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaEliminarSriFacturasProveedores(Boolean isVisibilidadCeldaEliminarSriFacturasProveedores) {
		this.isVisibilidadCeldaEliminarSriFacturasProveedores = isVisibilidadCeldaEliminarSriFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaCancelarSriFacturasProveedores() {
		return isVisibilidadCeldaCancelarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaCancelarSriFacturasProveedores(Boolean isVisibilidadCeldaCancelarSriFacturasProveedores) {
		this.isVisibilidadCeldaCancelarSriFacturasProveedores = isVisibilidadCeldaCancelarSriFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaGuardarSriFacturasProveedores() {
		return isVisibilidadCeldaGuardarSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaGuardarSriFacturasProveedores(Boolean isVisibilidadCeldaGuardarSriFacturasProveedores) {
		this.isVisibilidadCeldaGuardarSriFacturasProveedores = isVisibilidadCeldaGuardarSriFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSriFacturasProveedores() {
		return isVisibilidadCeldaGuardarCambiosSriFacturasProveedores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSriFacturasProveedores(Boolean isVisibilidadCeldaGuardarCambiosSriFacturasProveedores) {
		this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores = isVisibilidadCeldaGuardarCambiosSriFacturasProveedores;
	}
		
	public SriFacturasProveedoresSessionBean getsrifacturasproveedoresSessionBean() {
		return this.srifacturasproveedoresSessionBean;
	}
	
	public void setsrifacturasproveedoresSessionBean(SriFacturasProveedoresSessionBean srifacturasproveedoresSessionBean) {
		this.srifacturasproveedoresSessionBean=srifacturasproveedoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaSriFacturasProveedores() {
		return this.isVisibilidadBusquedaSriFacturasProveedores;
	}

	public void setisVisibilidadBusquedaSriFacturasProveedores(Boolean isVisibilidadBusquedaSriFacturasProveedores) {
		this.isVisibilidadBusquedaSriFacturasProveedores=isVisibilidadBusquedaSriFacturasProveedores;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(srifacturasproveedores,null);
				this.setActualParaGuardarTransaccionForeignKey(srifacturasproveedores,null);
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
	
	public void bugActualizarReferenciaActual(SriFacturasProveedores srifacturasproveedores,SriFacturasProveedores srifacturasproveedoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSriFacturasProveedores(srifacturasproveedores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		srifacturasproveedoresAux.setId(srifacturasproveedores.getId());
		srifacturasproveedoresAux.setVersionRow(srifacturasproveedores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(SriFacturasProveedores srifacturasproveedoresLocal) throws Exception {
		
		if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SriFacturasProveedores srifacturasproveedoresLocal) throws Exception {	
		if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				srifacturasproveedoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				srifacturasproveedoresLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSriFacturasProveedoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = srifacturasproveedoresValidator.getInvalidValues(this.srifacturasproveedores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SriFacturasProveedores srifacturasproveedores,List<SriFacturasProveedores> srifacturasproveedoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(SriFacturasProveedores srifacturasproveedores,List<SriFacturasProveedores> srifacturasproveedoress) throws Exception {
		try	{			
			SriFacturasProveedoresConstantesFunciones.actualizarSelectedLista(srifacturasproveedores,srifacturasproveedoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SriFacturasProveedores> srifacturasproveedoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				srifacturasproveedoressLocal=this.srifacturasproveedoresLogic.getSriFacturasProveedoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				srifacturasproveedoressLocal=this.srifacturasproveedoress;
			}
			//ARCHITECTURE
		
			for(SriFacturasProveedores srifacturasproveedoresLocal:srifacturasproveedoressLocal) {
				if(this.permiteMantenimiento(srifacturasproveedoresLocal) && srifacturasproveedoresLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SriFacturasProveedoresConstantesFunciones.getSriFacturasProveedoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidentificacionSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombreSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelrucSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.NOMBREMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_moduloSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_completo_clienteSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_transaccionSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.CODIGOASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelcodigo_asiento_contableSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelfecha_emisionSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnumero_facturaSriFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SriFacturasProveedoresConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelcredito_mone_localSriFacturasProveedores,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidentificacionSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombreSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelrucSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_moduloSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_completo_clienteSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_transaccionSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelcodigo_asiento_contableSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelfecha_emisionSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnumero_facturaSriFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelcredito_mone_localSriFacturasProveedores,"");
		
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
		this.iIdNuevoSriFacturasProveedores--;	
		
		
		this.srifacturasproveedoresAux=new SriFacturasProveedores();
		
		this.srifacturasproveedoresAux.setId(this.iIdNuevoSriFacturasProveedores);
		this.srifacturasproveedoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.srifacturasproveedoresLogic.getSriFacturasProveedoress().add(this.srifacturasproveedoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.srifacturasproveedoress.add(this.srifacturasproveedoresAux);
		}
		//ARCHITECTURE
		
		this.srifacturasproveedores=this.srifacturasproveedoresAux;
		
		if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedores);
			this.setVariablesObjetoActualToFormularioForeignKeySriFacturasProveedores(this.srifacturasproveedores);
		}
				
		//this.setDefaultControlesSriFacturasProveedores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySriFacturasProveedores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySriFacturasProveedores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySriFacturasProveedores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriFacturasProveedores(this.srifacturasproveedoresBean,this.srifacturasproveedores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSriFacturasProveedores(this.srifacturasproveedoresReturnGeneral,this.srifacturasproveedoresBean,false);
		
		if(this.srifacturasproveedoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySriFacturasProveedores(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores());
		}
		
		if(this.srifacturasproveedoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores(),classes);//this.srifacturasproveedoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySriFacturasProveedores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySriFacturasProveedores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.RecargarFormSriFacturasProveedores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSriFacturasProveedores(false);
						
			if(srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriFacturasProveedores();
			}
			
			this.actualizarVisualTableDatosSriFacturasProveedores();
			
			this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoSriFacturasProveedores(), this.getIndiceNuevoSriFacturasProveedores());
			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
						
			this.actualizarEstadoCeldasBotonesSriFacturasProveedores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSriFacturasProveedores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_desdeSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarfecha_emision_desdeSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_hastaSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarfecha_emision_hastaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activaridentificacionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarnombreSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarrucSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarnombre_moduloSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarnombre_completo_clienteSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarnombre_transaccionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarcodigo_asiento_contableSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarfecha_emisionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarnumero_facturaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarcredito_mone_localSriFacturasProveedores);	
		//
		this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarid_empresaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setEnabled(isHabilitar && this.srifacturasproveedoresConstantesFunciones.activarid_transaccionSriFacturasProveedores);
	};
	
	public void setDefaultControlesSriFacturasProveedores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSriFacturasProveedores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.srifacturasproveedoresSessionBean.setConGuardarRelaciones(true);			
			this.srifacturasproveedoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.setVisible(true);
			
					
		} else {
			//this.srifacturasproveedoresSessionBean.setConGuardarRelaciones(false);			
			this.srifacturasproveedoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSriFacturasProveedores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
				if(srifacturasproveedoresAux.getId().equals(this.iIdNuevoSriFacturasProveedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoress) {
				if(srifacturasproveedoresAux.getId().equals(this.iIdNuevoSriFacturasProveedores)) {
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
	
	public int getIndiceActualSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
				if(srifacturasproveedoresAux.getId().equals(srifacturasproveedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoress) {
				if(srifacturasproveedoresAux.getId().equals(srifacturasproveedores.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSriFacturasProveedores(SriFacturasProveedores srifacturasproveedoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
				if(srifacturasproveedoresAux.getSriFacturasProveedoresOriginal().getId().equals(srifacturasproveedoresOriginal.getId())) {
					existe=true;
					srifacturasproveedoresOriginal.setId(srifacturasproveedoresAux.getId());
					srifacturasproveedoresOriginal.setVersionRow(srifacturasproveedoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoress) {
				if(srifacturasproveedoresAux.getSriFacturasProveedoresOriginal().getId().equals(srifacturasproveedoresOriginal.getId())) {
					existe=true;
					srifacturasproveedoresOriginal.setId(srifacturasproveedoresAux.getId());
					srifacturasproveedoresOriginal.setVersionRow(srifacturasproveedoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSriFacturasProveedores(Boolean esParaCancelar) throws Exception {
		srifacturasproveedoressAux=new ArrayList<SriFacturasProveedores>();
		srifacturasproveedoresAux=new SriFacturasProveedores();
		
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
					if(srifacturasproveedoresAux.getId()<0) {
						srifacturasproveedoressAux.add(srifacturasproveedoresAux);
					}		
				}
				this.iIdNuevoSriFacturasProveedores=0L;
				this.srifacturasproveedoresLogic.getSriFacturasProveedoress().removeAll(srifacturasproveedoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoress) {
					if(srifacturasproveedoresAux.getId()<0) {
						srifacturasproveedoressAux.add(srifacturasproveedoresAux);
					}		
				}
				this.iIdNuevoSriFacturasProveedores=0L;
				this.srifacturasproveedoress.removeAll(srifacturasproveedoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSriFacturasProveedores 
					&& this.srifacturasproveedoresLogic.getSriFacturasProveedoress().size()>0
					) {
					srifacturasproveedoresAux=this.srifacturasproveedoresLogic.getSriFacturasProveedoress().get(this.srifacturasproveedoresLogic.getSriFacturasProveedoress().size() - 1);
				
					if(srifacturasproveedoresAux.getId()<0) {
						this.srifacturasproveedoresLogic.getSriFacturasProveedoress().remove(srifacturasproveedoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSriFacturasProveedores && this.srifacturasproveedoress.size()>0) {
					srifacturasproveedoresAux=this.srifacturasproveedoress.get(this.srifacturasproveedoress.size() - 1);
				
					if(srifacturasproveedoresAux.getId()<0) {
						this.srifacturasproveedoress.remove(srifacturasproveedoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSriFacturasProveedores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(srifacturasproveedores.getId()<0) {
				this.srifacturasproveedoresLogic.getSriFacturasProveedoress().remove(this.srifacturasproveedores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(srifacturasproveedores.getId()<0) {
				this.srifacturasproveedoress.remove(this.srifacturasproveedores);
			}
		}			
	}
	
	public void setEstadosInicialesSriFacturasProveedores(List<SriFacturasProveedores> srifacturasproveedoressAux) throws Exception {
		SriFacturasProveedoresConstantesFunciones.setEstadosInicialesSriFacturasProveedores(srifacturasproveedoressAux);
	}
	
	public void setEstadosInicialesSriFacturasProveedores(SriFacturasProveedores srifacturasproveedoresAux) throws Exception {
		SriFacturasProveedoresConstantesFunciones.setEstadosInicialesSriFacturasProveedores(srifacturasproveedoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSriFacturasProveedoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSriFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSriFacturasProveedoresActual()) {
				if(!this.isEsNuevoSriFacturasProveedores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSriFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSriFacturasProveedores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSriFacturasProveedoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sri Facturas Proveedores ?", "MANTENIMIENTO DE Sri Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSriFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SriFacturasProveedores srifacturasproveedores) throws Exception {
		SriFacturasProveedoresConstantesFunciones.seleccionarAsignar(this.srifacturasproveedores,srifacturasproveedores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSriFacturasProveedores=this.isPermisoActualizarOriginalSriFacturasProveedores;
			
			
			this.seleccionarAsignar(srifacturasproveedores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesSriFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.srifacturasproveedoresSessionBean.setsFuncionBusquedaRapida(this.srifacturasproveedoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSriFacturasProveedores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSriFacturasProveedores(esParaCancelar);				
				this.cancelarNuevoSriFacturasProveedores(esParaCancelar);								
			}
			
			this.srifacturasproveedores=new SriFacturasProveedores();
			
			this.inicializarSriFacturasProveedores();
			
			this.actualizarEstadoCeldasBotonesSriFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSriFacturasProveedores() throws Exception {
		try {
			SriFacturasProveedoresConstantesFunciones.inicializarSriFacturasProveedores(this.srifacturasproveedores);
			
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
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.srifacturasproveedoresLogic.getSriFacturasProveedoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSriFacturasProveedoress(String sAccionBusqueda,List<SriFacturasProveedores> srifacturasproveedoressParaReportes) throws Exception {
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
					sPathReporteFinal="SriFacturasProveedores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SriFacturasProveedoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SriFacturasProveedoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SriFacturasProveedores"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sri Facturas Proveedoreses");		
		parameters.put("busquedapor", SriFacturasProveedoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSriFacturasProveedores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SriFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SriFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSriFacturasProveedores=new JRBeanArrayDataSource(SriFacturasProveedoresJInternalFrame.TraerSriFacturasProveedoresBeans(srifacturasproveedoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSriFacturasProveedores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SriFacturasProveedoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SriFacturasProveedoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SriFacturasProveedoresBean.TraerSriFacturasProveedoresBeans(srifacturasproveedoressParaReportes).toArray()));
							
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
				this.generarExcelReporteSriFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,srifacturasproveedoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSriFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,srifacturasproveedoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresActionPerformed(null);
					//this.generarExcelReporteSriFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,srifacturasproveedoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSriFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,srifacturasproveedoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSriFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,srifacturasproveedoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSriFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,srifacturasproveedoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSriFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<SriFacturasProveedores> srifacturasproveedoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriFacturasProveedoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriFacturasProveedores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SriFacturasProveedores srifacturasproveedores : srifacturasproveedoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SriFacturasProveedoresConstantesFunciones.generarExcelReporteDataSriFacturasProveedores("NORMAL",row,workbook,srifacturasproveedores,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSriFacturasProveedores(String sTipo,Row row,Workbook workbook) {
		
		SriFacturasProveedoresConstantesFunciones.generarExcelReporteHeaderSriFacturasProveedores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSriFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<SriFacturasProveedores> srifacturasproveedoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriFacturasProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SriFacturasProveedores srifacturasproveedores : srifacturasproveedoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SriFacturasProveedoresConstantesFunciones.getSriFacturasProveedoresDescripcion(srifacturasproveedores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getnombre_modulo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getcodigo_asiento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(srifacturasproveedores.getcredito_mone_local());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSriFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<SriFacturasProveedores> srifacturasproveedoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SriFacturasProveedores> srifacturasproveedoressRespaldo=null;
		
		classes=SriFacturasProveedoresConstantesFunciones.getClassesRelationshipsOfSriFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.srifacturasproveedoresLogic.setDatosCliente(this.datosCliente);
		this.srifacturasproveedoresLogic.setDatosDeep(this.datosDeep);
		this.srifacturasproveedoresLogic.setIsConDeep(true);
		
		srifacturasproveedoressRespaldo=this.srifacturasproveedoresLogic.getSriFacturasProveedoress();
		
		this.srifacturasproveedoresLogic.setSriFacturasProveedoress(srifacturasproveedoressParaReportes);	
		this.srifacturasproveedoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		srifacturasproveedoressParaReportes=this.srifacturasproveedoresLogic.getSriFacturasProveedoress();
		this.srifacturasproveedoresLogic.setSriFacturasProveedoress(srifacturasproveedoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SriFacturasProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSriFacturasProveedores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SriFacturasProveedores srifacturasproveedores : srifacturasproveedoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSriFacturasProveedores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SriFacturasProveedoresConstantesFunciones.generarExcelReporteDataSriFacturasProveedores("NORMAL",row,workbook,srifacturasproveedores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SriFacturasProveedoresConstantesFunciones.getSriFacturasProveedoresDescripcion(srifacturasproveedores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSriFacturasProveedores() throws Exception {		
		this.startProcessSriFacturasProveedores(true);
	}
	
	public void startProcessSriFacturasProveedores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSriFacturasProveedores ,this.jPanelParametrosReportesSriFacturasProveedores, this.jScrollPanelDatosSriFacturasProveedores,this.jPanelPaginacionSriFacturasProveedores, this.jScrollPanelDatosEdicionSriFacturasProveedores, this.jPanelAccionesSriFacturasProveedores,this.jPanelAccionesFormularioSriFacturasProveedores,this.jmenuBarSriFacturasProveedores,this.jmenuBarDetalleSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,this.jTtoolBarDetalleSriFacturasProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasSriFacturasProveedores=this.jTabbedPaneBusquedasSriFacturasProveedores; 
		
		final JPanel jPanelParametrosReportesSriFacturasProveedores=this.jPanelParametrosReportesSriFacturasProveedores;
		//final JScrollPane jScrollPanelDatosSriFacturasProveedores=this.jScrollPanelDatosSriFacturasProveedores;
		final JTable jTableDatosSriFacturasProveedores=this.jTableDatosSriFacturasProveedores;		
		final JPanel jPanelPaginacionSriFacturasProveedores=this.jPanelPaginacionSriFacturasProveedores;
		//final JScrollPane jScrollPanelDatosEdicionSriFacturasProveedores=this.jScrollPanelDatosEdicionSriFacturasProveedores;
		final JPanel jPanelAccionesSriFacturasProveedores=this.jPanelAccionesSriFacturasProveedores;
		
		JPanel jPanelCamposAuxiliarSriFacturasProveedores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSriFacturasProveedores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			jPanelCamposAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelCamposSriFacturasProveedores;
			jPanelAccionesFormularioAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelAccionesFormularioSriFacturasProveedores;
		}
		
		final JPanel jPanelCamposSriFacturasProveedores=jPanelCamposAuxiliarSriFacturasProveedores;
		final JPanel jPanelAccionesFormularioSriFacturasProveedores=jPanelAccionesFormularioAuxiliarSriFacturasProveedores;
		
		
		final JMenuBar jmenuBarSriFacturasProveedores=this.jmenuBarSriFacturasProveedores;
		final JToolBar jTtoolBarSriFacturasProveedores=this.jTtoolBarSriFacturasProveedores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSriFacturasProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriFacturasProveedores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			jmenuBarDetalleAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jmenuBarDetalleSriFacturasProveedores;
			jTtoolBarDetalleAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jTtoolBarDetalleSriFacturasProveedores;
		}
		
		final JMenuBar jmenuBarDetalleSriFacturasProveedores=jmenuBarDetalleAuxiliarSriFacturasProveedores;
		final JToolBar jTtoolBarDetalleSriFacturasProveedores=jTtoolBarDetalleAuxiliarSriFacturasProveedores;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriFacturasProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriFacturasProveedores;
			processRunnable.jTableDatos=jTableDatosSriFacturasProveedores;
			processRunnable.jPanelCampos=jPanelCamposSriFacturasProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriFacturasProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesSriFacturasProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriFacturasProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarSriFacturasProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriFacturasProveedores;
			processRunnable.jTtoolBar=jTtoolBarSriFacturasProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriFacturasProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriFacturasProveedores ,jPanelParametrosReportesSriFacturasProveedores,jTableDatosSriFacturasProveedores, /*jScrollPanelDatosSriFacturasProveedores,*/jPanelCamposSriFacturasProveedores,jPanelPaginacionSriFacturasProveedores, /*jScrollPanelDatosEdicionSriFacturasProveedores,*/ jPanelAccionesSriFacturasProveedores,jPanelAccionesFormularioSriFacturasProveedores,jmenuBarSriFacturasProveedores,jmenuBarDetalleSriFacturasProveedores,jTtoolBarSriFacturasProveedores,jTtoolBarDetalleSriFacturasProveedores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSriFacturasProveedores ,jPanelParametrosReportesSriFacturasProveedores, jScrollPanelDatosSriFacturasProveedores,jPanelPaginacionSriFacturasProveedores, jScrollPanelDatosEdicionSriFacturasProveedores, jPanelAccionesSriFacturasProveedores,jPanelAccionesFormularioSriFacturasProveedores,jmenuBarSriFacturasProveedores,jmenuBarDetalleSriFacturasProveedores,jTtoolBarSriFacturasProveedores,jTtoolBarDetalleSriFacturasProveedores);
						
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
	
	public void finishProcessSriFacturasProveedores() {// throws Exception 
		this.finishProcessSriFacturasProveedores(true);
	}
	
	public void finishProcessSriFacturasProveedores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSriFacturasProveedores ,this.jPanelParametrosReportesSriFacturasProveedores, this.jScrollPanelDatosSriFacturasProveedores,this.jPanelPaginacionSriFacturasProveedores, this.jScrollPanelDatosEdicionSriFacturasProveedores, this.jPanelAccionesSriFacturasProveedores,this.jPanelAccionesFormularioSriFacturasProveedores,this.jmenuBarSriFacturasProveedores,this.jmenuBarDetalleSriFacturasProveedores,this.jTtoolBarSriFacturasProveedores,this.jTtoolBarDetalleSriFacturasProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasSriFacturasProveedores=this.jTabbedPaneBusquedasSriFacturasProveedores; 
		
		final JPanel jPanelParametrosReportesSriFacturasProveedores=this.jPanelParametrosReportesSriFacturasProveedores;
		//final JScrollPane jScrollPanelDatosSriFacturasProveedores=this.jScrollPanelDatosSriFacturasProveedores;
		final JTable jTableDatosSriFacturasProveedores=this.jTableDatosSriFacturasProveedores;		
		final JPanel jPanelPaginacionSriFacturasProveedores=this.jPanelPaginacionSriFacturasProveedores;
		//final JScrollPane jScrollPanelDatosEdicionSriFacturasProveedores=this.jScrollPanelDatosEdicionSriFacturasProveedores;
		final JPanel jPanelAccionesSriFacturasProveedores=this.jPanelAccionesSriFacturasProveedores;
		
		JPanel jPanelCamposAuxiliarSriFacturasProveedores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSriFacturasProveedores=new JPanel();
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			jPanelCamposAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelCamposSriFacturasProveedores;
			jPanelAccionesFormularioAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelAccionesFormularioSriFacturasProveedores;
		}
		
		final JPanel jPanelCamposSriFacturasProveedores=jPanelCamposAuxiliarSriFacturasProveedores;
		final JPanel jPanelAccionesFormularioSriFacturasProveedores=jPanelAccionesFormularioAuxiliarSriFacturasProveedores;
		
		
		final JMenuBar jmenuBarSriFacturasProveedores=this.jmenuBarSriFacturasProveedores;		
		final JToolBar jTtoolBarSriFacturasProveedores=this.jTtoolBarSriFacturasProveedores;
				
		JMenuBar jmenuBarDetalleAuxiliarSriFacturasProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSriFacturasProveedores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			jmenuBarDetalleAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jmenuBarDetalleSriFacturasProveedores;
			jTtoolBarDetalleAuxiliarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jTtoolBarDetalleSriFacturasProveedores;		
		}
		
		final JMenuBar jmenuBarDetalleSriFacturasProveedores=jmenuBarDetalleAuxiliarSriFacturasProveedores;
		final JToolBar jTtoolBarDetalleSriFacturasProveedores=jTtoolBarDetalleAuxiliarSriFacturasProveedores;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSriFacturasProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSriFacturasProveedores;
			processRunnable.jTableDatos=jTableDatosSriFacturasProveedores;
			processRunnable.jPanelCampos=jPanelCamposSriFacturasProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionSriFacturasProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesSriFacturasProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSriFacturasProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarSriFacturasProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSriFacturasProveedores;
			processRunnable.jTtoolBar=jTtoolBarSriFacturasProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSriFacturasProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSriFacturasProveedores ,jPanelParametrosReportesSriFacturasProveedores, jTableDatosSriFacturasProveedores,/*jScrollPanelDatosSriFacturasProveedores,*/jPanelCamposSriFacturasProveedores,jPanelPaginacionSriFacturasProveedores, /*jScrollPanelDatosEdicionSriFacturasProveedores,*/ jPanelAccionesSriFacturasProveedores,jPanelAccionesFormularioSriFacturasProveedores,jmenuBarSriFacturasProveedores,jmenuBarDetalleSriFacturasProveedores,jTtoolBarSriFacturasProveedores,jTtoolBarDetalleSriFacturasProveedores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSriFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSriFacturasProveedores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSriFacturasProveedores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSriFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSriFacturasProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSriFacturasProveedores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSriFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSriFacturasProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSriFacturasProveedores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.srifacturasproveedoresConstantesFunciones.getsFinalQuerySriFacturasProveedores();
		String  finalQueryPaginacionTodos=this.srifacturasproveedoresConstantesFunciones.getsFinalQuerySriFacturasProveedores();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SriFacturasProveedoresConstantesFunciones.getArrayColumnasGlobalesNoSriFacturasProveedores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SriFacturasProveedoresConstantesFunciones.getArrayColumnasGlobalesSriFacturasProveedores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SriFacturasProveedoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.srifacturasproveedoressEliminados= new ArrayList<SriFacturasProveedores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSriFacturasProveedores();
		
				///*SriFacturasProveedoresSessionBean*/this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
			
			if(this.srifacturasproveedoresSessionBean==null) {
				this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
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
					this.iNumeroPaginacion=SriFacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SriFacturasProveedoresConstantesFunciones.getClassesForeignKeysOfSriFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/srifacturasproveedores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			srifacturasproveedoressAux= new ArrayList<SriFacturasProveedores>();
			
				
			srifacturasproveedoresLogic.setDatosCliente(this.datosCliente);
			srifacturasproveedoresLogic.setDatosDeep(this.datosDeep);
			srifacturasproveedoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaSriFacturasProveedores")) {
				this.sDetalleReporte=SriFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaSriFacturasProveedores(id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					srifacturasproveedoresLogic.getSriFacturasProveedoressBusquedaSriFacturasProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaSriFacturasProveedores(id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaSriFacturasProveedores(id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=srifacturasproveedoresLogic.getSriFacturasProveedoress()==null||srifacturasproveedoresLogic.getSriFacturasProveedoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=srifacturasproveedoress==null|| srifacturasproveedoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						srifacturasproveedoressAux=new ArrayList<SriFacturasProveedores>();
						srifacturasproveedoressAux.addAll(srifacturasproveedoresLogic.getSriFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							srifacturasproveedoressAux=new ArrayList<SriFacturasProveedores>();
							srifacturasproveedoressAux.addAll(srifacturasproveedoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							srifacturasproveedoresLogic.getSriFacturasProveedoressBusquedaSriFacturasProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SriFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaSriFacturasProveedores(id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SriFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaSriFacturasProveedores(id_transaccionBusquedaSriFacturasProveedores,fecha_emision_desdeBusquedaSriFacturasProveedores,fecha_emision_hastaBusquedaSriFacturasProveedores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSriFacturasProveedoress("BusquedaSriFacturasProveedores",srifacturasproveedoresLogic.getSriFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSriFacturasProveedoress("BusquedaSriFacturasProveedores",srifacturasproveedoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						srifacturasproveedoresLogic.setSriFacturasProveedoress(new ArrayList<SriFacturasProveedores>());
						srifacturasproveedoresLogic.getSriFacturasProveedoress().addAll(srifacturasproveedoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							srifacturasproveedoress=new ArrayList<SriFacturasProveedores>();
							srifacturasproveedoress.addAll(srifacturasproveedoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSriFacturasProveedores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSriFacturasProveedores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=srifacturasproveedoresLogic.getSriFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=srifacturasproveedoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=srifacturasproveedoresLogic.getSriFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=srifacturasproveedoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SriFacturasProveedores srifacturasproveedores) {
		Boolean permite=true;
		
		if(this.srifacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SriFacturasProveedoresConstantesFunciones.getOrderByListaSriFacturasProveedores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SriFacturasProveedoresConstantesFunciones.getOrderByListaSriFacturasProveedores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
				if(srifacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					srifacturasproveedoresTotales=srifacturasproveedores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriFacturasProveedores srifacturasproveedores:this.srifacturasproveedoress) {
				if(srifacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					srifacturasproveedoresTotales=srifacturasproveedores;
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
			this.srifacturasproveedoresAux=new SriFacturasProveedores();
			this.srifacturasproveedoresAux.setsType(Constantes2.S_TOTALES);
			this.srifacturasproveedoresAux.setIsNew(false);
			this.srifacturasproveedoresAux.setIsChanged(false);
			this.srifacturasproveedoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//SriFacturasProveedoresConstantesFunciones.TotalizarValoresFilaSriFacturasProveedores(this.srifacturasproveedoresLogic.getSriFacturasProveedoress(),this.srifacturasproveedoresAux);
				
				//this.srifacturasproveedoresLogic.getSriFacturasProveedoress().add(this.srifacturasproveedoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SriFacturasProveedoresConstantesFunciones.TotalizarValoresFilaSriFacturasProveedores(this.srifacturasproveedoress,this.srifacturasproveedoresAux);
				
				this.srifacturasproveedoress.add(this.srifacturasproveedoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		srifacturasproveedoresTotales=new SriFacturasProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.srifacturasproveedoresLogic.getSriFacturasProveedoress().remove(srifacturasproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.srifacturasproveedoress.remove(srifacturasproveedoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		srifacturasproveedoresTotales=new SriFacturasProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
				if(srifacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					srifacturasproveedoresTotales=srifacturasproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriFacturasProveedoresConstantesFunciones.TotalizarValoresFilaSriFacturasProveedores(this.srifacturasproveedoresLogic.getSriFacturasProveedoress(),srifacturasproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SriFacturasProveedores srifacturasproveedores:this.srifacturasproveedoress) {
				if(srifacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					srifacturasproveedoresTotales=srifacturasproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SriFacturasProveedoresConstantesFunciones.TotalizarValoresFilaSriFacturasProveedores(this.srifacturasproveedoress,srifacturasproveedoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSriFacturasProveedoressBusquedaSriFacturasProveedores()throws Exception {
		try {
			sAccionBusqueda="BusquedaSriFacturasProveedores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriFacturasProveedoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSriFacturasProveedoressFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSriFacturasProveedoressBusquedaSriFacturasProveedores(String sFinalQuery,Long id_transaccion,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//srifacturasproveedoresLogic.getSriFacturasProveedoressBusquedaSriFacturasProveedores(sFinalQuery,this.pagination,id_transaccion,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriFacturasProveedoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//srifacturasproveedoresLogic.getSriFacturasProveedoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSriFacturasProveedoressFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//srifacturasproveedoresLogic.getSriFacturasProveedoressFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosSriFacturasProveedores() {
		this.isPermisoTodoSriFacturasProveedores=false;
		this.isPermisoNuevoSriFacturasProveedores=false;
		this.isPermisoActualizarSriFacturasProveedores=false;
		this.isPermisoActualizarOriginalSriFacturasProveedores=false;
		this.isPermisoEliminarSriFacturasProveedores=false;
		this.isPermisoGuardarCambiosSriFacturasProveedores=false;
		this.isPermisoConsultaSriFacturasProveedores=true;
		this.isPermisoBusquedaSriFacturasProveedores=true;
		this.isPermisoReporteSriFacturasProveedores=true;
		this.isPermisoOrdenSriFacturasProveedores=false;		
		this.isPermisoPaginacionMedioSriFacturasProveedores=false;		
		this.isPermisoPaginacionAltoSriFacturasProveedores=false;		
		this.isPermisoPaginacionTodoSriFacturasProveedores=false;		
		this.isPermisoCopiarSriFacturasProveedores=false;		
		this.isPermisoVerFormSriFacturasProveedores=false;		
		this.isPermisoDuplicarSriFacturasProveedores=false;
		this.isPermisoOrdenSriFacturasProveedores=false;
	}
	
	public void setPermisosUsuarioSriFacturasProveedores(Boolean isPermiso) {
		this.isPermisoTodoSriFacturasProveedores=isPermiso;
		this.isPermisoNuevoSriFacturasProveedores=isPermiso;
		this.isPermisoActualizarSriFacturasProveedores=isPermiso;
		this.isPermisoActualizarOriginalSriFacturasProveedores=isPermiso;
		this.isPermisoEliminarSriFacturasProveedores=isPermiso;
		this.isPermisoGuardarCambiosSriFacturasProveedores=isPermiso;
		this.isPermisoConsultaSriFacturasProveedores=isPermiso;
		this.isPermisoBusquedaSriFacturasProveedores=isPermiso;
		this.isPermisoReporteSriFacturasProveedores=isPermiso;
		this.isPermisoOrdenSriFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionMedioSriFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionAltoSriFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionTodoSriFacturasProveedores=isPermiso;		
		this.isPermisoCopiarSriFacturasProveedores=isPermiso;		
		this.isPermisoVerFormSriFacturasProveedores=isPermiso;		
		this.isPermisoDuplicarSriFacturasProveedores=isPermiso;
		this.isPermisoOrdenSriFacturasProveedores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSriFacturasProveedores(Boolean isPermiso) {
		//this.isPermisoTodoSriFacturasProveedores=isPermiso;
		this.isPermisoNuevoSriFacturasProveedores=isPermiso;
		this.isPermisoActualizarSriFacturasProveedores=isPermiso;
		this.isPermisoActualizarOriginalSriFacturasProveedores=isPermiso;
		this.isPermisoEliminarSriFacturasProveedores=isPermiso;
		this.isPermisoGuardarCambiosSriFacturasProveedores=isPermiso;
		//this.isPermisoConsultaSriFacturasProveedores=isPermiso;
		//this.isPermisoBusquedaSriFacturasProveedores=isPermiso;
		//this.isPermisoReporteSriFacturasProveedores=isPermiso;
		//this.isPermisoOrdenSriFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionMedioSriFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionAltoSriFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionTodoSriFacturasProveedores=isPermiso;		
		//this.isPermisoCopiarSriFacturasProveedores=isPermiso;		
		//this.isPermisoDuplicarSriFacturasProveedores=isPermiso;
		//this.isPermisoOrdenSriFacturasProveedores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSriFacturasProveedoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SriFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSriFacturasProveedores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSriFacturasProveedoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSriFacturasProveedoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSriFacturasProveedoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSriFacturasProveedoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSriFacturasProveedores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SriFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SriFacturasProveedoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSriFacturasProveedores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSriFacturasProveedores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSriFacturasProveedores=this.isPermisoActualizarSriFacturasProveedores;
			this.isPermisoEliminarSriFacturasProveedores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSriFacturasProveedores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSriFacturasProveedores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSriFacturasProveedores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSriFacturasProveedores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSriFacturasProveedores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriFacturasProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSriFacturasProveedores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSriFacturasProveedores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSriFacturasProveedores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSriFacturasProveedores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSriFacturasProveedores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSriFacturasProveedores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSriFacturasProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSriFacturasProveedores.setToolTipText(this.jTableDatosSriFacturasProveedores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSriFacturasProveedores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSriFacturasProveedores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SriFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SriFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSriFacturasProveedores() throws Exception {
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
	public void inicializarCombosForeignKeySriFacturasProveedoresListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySriFacturasProveedoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SriFacturasProveedoresJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeySriFacturasProveedores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTransaccion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.srifacturasproveedoresSessionBean==null) {
				this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean();
			}

			if(!this.srifacturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.srifacturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySriFacturasProveedores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySriFacturasProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySriFacturasProveedores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySriFacturasProveedores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySriFacturasProveedores(SriFacturasProveedores srifacturasproveedores)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySriFacturasProveedores()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySriFacturasProveedores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySriFacturasProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySriFacturasProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSriFacturasProveedores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySriFacturasProveedores()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySriFacturasProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySriFacturasProveedores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public SriFacturasProveedoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SriFacturasProveedoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SriFacturasProveedoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.srifacturasproveedoresSessionBean=new SriFacturasProveedoresSessionBean(); 
		this.srifacturasproveedoresConstantesFunciones=new SriFacturasProveedoresConstantesFunciones(); 
		this.srifacturasproveedoresBean=new SriFacturasProveedores();//(this.srifacturasproveedoresConstantesFunciones); 		
		this.srifacturasproveedoresReturnGeneral=new SriFacturasProveedoresParameterReturnGeneral(); 
		
		this.srifacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srifacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SriFacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SriFacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SriFacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSriFacturasProveedores(true);
			
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
			
			this.srifacturasproveedoresConstantesFunciones=new SriFacturasProveedoresConstantesFunciones(); 
			this.srifacturasproveedoresBean=new SriFacturasProveedores();//this.srifacturasproveedoresConstantesFunciones); 			
			this.srifacturasproveedoresReturnGeneral=new SriFacturasProveedoresParameterReturnGeneral(); 
		
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Facturas Proveedores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.srifacturasproveedores=new SriFacturasProveedores();
			this.srifacturasproveedoress = new ArrayList<SriFacturasProveedores>();
			this.srifacturasproveedoressAux = new ArrayList<SriFacturasProveedores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic=new SriFacturasProveedoresLogic();
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.srifacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.srifacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSriFacturasProveedores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriFacturasProveedores);	
					}
					
					if(this.jInternalFrameImportacionSriFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriFacturasProveedores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySriFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySriFacturasProveedores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSriFacturasProveedores);
				this.jInternalFrameDetalleFormSriFacturasProveedores.setVisible(false);
				this.jInternalFrameDetalleFormSriFacturasProveedores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriFacturasProveedores);
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.setVisible(false);
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSriFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSriFacturasProveedores);
					this.jInternalFrameImportacionSriFacturasProveedores.setVisible(false);
					this.jInternalFrameImportacionSriFacturasProveedores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySriFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySriFacturasProveedores);
					this.jInternalFrameOrderBySriFacturasProveedores.setVisible(false);
					this.jInternalFrameOrderBySriFacturasProveedores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSriFacturasProveedoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SriFacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
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
			
			this.srifacturasproveedoresReturnGeneral=new SriFacturasProveedoresParameterReturnGeneral();
			
			this.srifacturasproveedoresParameterGeneral=new SriFacturasProveedoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.srifacturasproveedoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SriFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriFacturasProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),this.srifacturasproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SriFacturasProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),this.srifacturasproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaDuplicarSriFacturasProveedores=true;
			this.isVisibilidadCeldaCopiarSriFacturasProveedores=true;
			this.isVisibilidadCeldaVerFormSriFacturasProveedores=true;
			this.isVisibilidadCeldaOrdenSriFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
			this.isVisibilidadCeldaModificarSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
			
			
			this.isVisibilidadBusquedaSriFacturasProveedores=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSriFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSriFacturasProveedores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSriFacturasProveedores(false);
			
			this.setPermisosUsuarioSriFacturasProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() 
				|| (this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado() && this.srifacturasproveedoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSriFacturasProveedoresClasesRelacionadas();
			}
			
			if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSriFacturasProveedoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSriFacturasProveedores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSriFacturasProveedores();
			}
			
			if(!this.isPermisoBusquedaSriFacturasProveedores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SriFacturasProveedoresConstantesFunciones.getTiposSeleccionarSriFacturasProveedores());
				
				this.tiposColumnasSelect=SriFacturasProveedoresConstantesFunciones.getTiposSeleccionarSriFacturasProveedores(true);
				
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
			//if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSriFacturasProveedores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioSriFacturasProveedores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioSriFacturasProveedores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSriFacturasProveedores() ;
			
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
			this.transaccionLogic=new TransaccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				srifacturasproveedoresImplementable= (SriFacturasProveedoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriFacturasProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				srifacturasproveedoresImplementableHome= (SriFacturasProveedoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SriFacturasProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.srifacturasproveedoress= new ArrayList<SriFacturasProveedores>();
			this.srifacturasproveedoressEliminados= new ArrayList<SriFacturasProveedores>();
						
			this.isEsNuevoSriFacturasProveedores=false;
			this.esParaAccionDesdeFormularioSriFacturasProveedores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySriFacturasProveedores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSriFacturasProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SriFacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSriFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSriFacturasProveedores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSriFacturasProveedores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSriFacturasProveedores();
			}
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSriFacturasProveedores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSriFacturasProveedores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSriFacturasProveedores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSriFacturasProveedores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SriFacturasProveedores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSriFacturasProveedores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSriFacturasProveedores")) {
				iIndex=this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSriFacturasProveedores();	
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
	
	public void cargarCombosForeignKeySriFacturasProveedores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySriFacturasProveedores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySriFacturasProveedores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySriFacturasProveedoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySriFacturasProveedores();
		
		this.cargarCombosFrameForeignKeySriFacturasProveedores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySriFacturasProveedores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySriFacturasProveedores();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSriFacturasProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			
			if(jTableDatosSriFacturasProveedores.getRowCount()>=1) {
				jTableDatosSriFacturasProveedores.removeRowSelectionInterval(0, jTableDatosSriFacturasProveedores.getRowCount()-1);						
			}
			
			this.isEsNuevoSriFacturasProveedores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSriFacturasProveedores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSriFacturasProveedores(true);			
			//this.srifacturasproveedores=new SriFacturasProveedores();
			//this.srifacturasproveedores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriFacturasProveedores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores() ;
			
			if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriFacturasProveedores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.srifacturasproveedores);	
			this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);				
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SriFacturasProveedores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSriFacturasProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSriFacturasProveedores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSriFacturasProveedores.getSelectedRows().length;			
			}
			
			srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSriFacturasProveedores--;			
				//SriFacturasProveedores srifacturasproveedoresAux= new SriFacturasProveedores();			
				//srifacturasproveedoresAux.setId(this.iIdNuevoSriFacturasProveedores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SriFacturasProveedores srifacturasproveedoresOrigen=new SriFacturasProveedores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SriFacturasProveedores srifacturasproveedoresOrigen : srifacturasproveedoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							srifacturasproveedoresOrigen =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							srifacturasproveedoresOrigen =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSriFacturasProveedores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.srifacturasproveedores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSriFacturasProveedores(srifacturasproveedoresOrigen,this.srifacturasproveedores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.srifacturasproveedoresLogic.getSriFacturasProveedoress().add(this.srifacturasproveedoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedoress.add(this.srifacturasproveedoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
				
				this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoSriFacturasProveedores(), this.getIndiceNuevoSriFacturasProveedores());
				
				int iLastRow =  this.jTableDatosSriFacturasProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriFacturasProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriFacturasProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();									
		
			SriFacturasProveedores srifacturasproveedoresOrigen=new SriFacturasProveedores();
			SriFacturasProveedores srifacturasproveedoresDestino=new SriFacturasProveedores();
				
			srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSriFacturasProveedores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || srifacturasproveedoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSriFacturasProveedores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srifacturasproveedoresOrigen =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						srifacturasproveedoresOrigen =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srifacturasproveedoresDestino =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						srifacturasproveedoresDestino =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				srifacturasproveedoresOrigen =srifacturasproveedoressSeleccionados.get(0);
				srifacturasproveedoresDestino =srifacturasproveedoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSriFacturasProveedores(srifacturasproveedoresOrigen,srifacturasproveedoresDestino,true,false);
				
				srifacturasproveedoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(srifacturasproveedoresDestino,srifacturasproveedoresLogic.getSriFacturasProveedoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(srifacturasproveedoresDestino,srifacturasproveedoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
				
				//this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoSriFacturasProveedores(), this.getIndiceNuevoSriFacturasProveedores());
				
				int iLastRow =  this.jTableDatosSriFacturasProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSriFacturasProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSriFacturasProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSriFacturasProveedores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSriFacturasProveedores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSriFacturasProveedores.setVisible(!isVisible);
			this.jPanelPaginacionSriFacturasProveedores.setVisible(!isVisible);
			this.jPanelAccionesSriFacturasProveedores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSriFacturasProveedores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSriFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSriFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySriFacturasProveedores();
			
			this.abrirFrameOrderBySriFacturasProveedores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySriFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSriFacturasProveedores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriFacturasProveedores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSriFacturasProveedores.isMaximum()) {
					this.jInternalFrameDetalleFormSriFacturasProveedores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSriFacturasProveedores.setSize(this.jInternalFrameDetalleFormSriFacturasProveedores.iWidthFormulario,this.jInternalFrameDetalleFormSriFacturasProveedores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSriFacturasProveedores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSriFacturasProveedores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSriFacturasProveedores.isMaximum()) {
						this.jInternalFrameDetalleFormSriFacturasProveedores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSriFacturasProveedores.jContentPaneDetalleSriFacturasProveedores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSriFacturasProveedores.jContentPaneDetalleSriFacturasProveedores.getWidth(),SriFacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSriFacturasProveedores.jContentPaneDetalleSriFacturasProveedores.getWidth(),SriFacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSriFacturasProveedores.jContentPaneDetalleSriFacturasProveedores.getWidth(),SriFacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSriFacturasProveedores.setVisible(true);
	        this.jInternalFrameDetalleFormSriFacturasProveedores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySriFacturasProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySriFacturasProveedores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySriFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriFacturasProveedores,false,this);
				} else {
					this.jInternalFrameOrderBySriFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySriFacturasProveedores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySriFacturasProveedores);
				this.jInternalFrameOrderBySriFacturasProveedores.setVisible(false);
				this.jInternalFrameOrderBySriFacturasProveedores.setSelected(false);
				
				this.jInternalFrameOrderBySriFacturasProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriFacturasProveedores"));
				
				this.inicializarActualizarBindingTablaOrderBySriFacturasProveedores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSriFacturasProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSriFacturasProveedores==null) {
				
				this.jInternalFrameImportacionSriFacturasProveedores=new ImportacionJInternalFrame(SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSriFacturasProveedores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSriFacturasProveedores);
				this.jInternalFrameImportacionSriFacturasProveedores.setVisible(false);
				this.jInternalFrameImportacionSriFacturasProveedores.setSelected(false);


				this.jInternalFrameImportacionSriFacturasProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriFacturasProveedores"));
				this.jInternalFrameImportacionSriFacturasProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriFacturasProveedores"));
				this.jInternalFrameImportacionSriFacturasProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriFacturasProveedores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSriFacturasProveedores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSriFacturasProveedores==null) {
				this.jInternalFrameReporteDinamicoSriFacturasProveedores=new ReporteDinamicoJInternalFrame(SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSriFacturasProveedores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSriFacturasProveedores);
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.setVisible(false);
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriFacturasProveedores"));
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriFacturasProveedores"));
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriFacturasProveedores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriFacturasProveedores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSriFacturasProveedores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSriFacturasProveedores);
			
	       	this.jInternalFrameDetalleFormSriFacturasProveedores.setVisible(false);
	        this.jInternalFrameDetalleFormSriFacturasProveedores.setSelected(false);
			
			//this.jInternalFrameDetalleFormSriFacturasProveedores.dispose();
			//this.jInternalFrameDetalleFormSriFacturasProveedores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSriFacturasProveedores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSriFacturasProveedores.setVisible(true);
	        this.jInternalFrameReporteDinamicoSriFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSriFacturasProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSriFacturasProveedores.setVisible(true);
	        this.jInternalFrameImportacionSriFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySriFacturasProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySriFacturasProveedores.setVisible(true);
	        this.jInternalFrameOrderBySriFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySriFacturasProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySriFacturasProveedores.setVisible(false);
	        this.jInternalFrameOrderBySriFacturasProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSriFacturasProveedores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSriFacturasProveedores.setVisible(false);
	        this.jInternalFrameReporteDinamicoSriFacturasProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSriFacturasProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSriFacturasProveedores.setVisible(false);
	        this.jInternalFrameImportacionSriFacturasProveedores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSriFacturasProveedores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSriFacturasProveedores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSriFacturasProveedores(true);
			//this.isEsNuevoSriFacturasProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSriFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriFacturasProveedores(false) ;
			
			if(srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriFacturasProveedores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSriFacturasProveedoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSriFacturasProveedores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSriFacturasProveedores(true);
			//this.isEsNuevoSriFacturasProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.srifacturasproveedores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSriFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSriFacturasProveedores(false) ;
			
			if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSriFacturasProveedores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSriFacturasProveedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSriFacturasProveedores(false);
			
			//if(!this.isEsNuevoSriFacturasProveedores) {								
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				
			}
			
			if(this.permiteMantenimiento(this.srifacturasproveedores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSriFacturasProveedores=true;
					this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
					this.isEsNuevoSriFacturasProveedores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSriFacturasProveedores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSriFacturasProveedores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriFacturasProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(false);
				
				this.habilitarDeshabilitarControlesSriFacturasProveedores(false);
			
												
				
				if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSriFacturasProveedores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSriFacturasProveedoresActionPerformed(evt,srifacturasproveedoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSriFacturasProveedores(this.srifacturasproveedores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,srifacturasproveedoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.srifacturasproveedores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				this.srifacturasproveedores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				this.srifacturasproveedores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.srifacturasproveedores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SriFacturasProveedoresModel) this.jTableDatosSriFacturasProveedores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSriFacturasProveedores=true;
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
				this.isEsNuevoSriFacturasProveedores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSriFacturasProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(false);
				
				this.habilitarDeshabilitarControlesSriFacturasProveedores(false);
				
				
				
				if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSriFacturasProveedores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSriFacturasProveedores.getRowCount()>=1) {
				jTableDatosSriFacturasProveedores.removeRowSelectionInterval(0, jTableDatosSriFacturasProveedores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSriFacturasProveedores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSriFacturasProveedores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(false) ;
			
			this.isEsNuevoSriFacturasProveedores=false;
			
			if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSriFacturasProveedores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSriFacturasProveedores(false);
				
				//SI ES MANUAL
				if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSriFacturasProveedores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSriFacturasProveedores--;			
			//SriFacturasProveedores srifacturasproveedoresAux= new SriFacturasProveedores();			
			//srifacturasproveedoresAux.setId(this.iIdNuevoSriFacturasProveedores);
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSriFacturasProveedores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
			
			this.srifacturasproveedores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.srifacturasproveedoresLogic.getSriFacturasProveedoress().add(this.srifacturasproveedoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.srifacturasproveedoress.add(this.srifacturasproveedoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			
			this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoSriFacturasProveedores(), this.getIndiceNuevoSriFacturasProveedores());
			
			int iLastRow =  this.jTableDatosSriFacturasProveedores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSriFacturasProveedores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSriFacturasProveedores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriFacturasProveedores(false);
			
			//SI ES MANUAL
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriFacturasProveedores();
			}
			
			//this.abrirFrameTreeSriFacturasProveedores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSriFacturasProveedores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSriFacturasProveedores.setFileImportacion(this.jInternalFrameImportacionSriFacturasProveedores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSriFacturasProveedores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSriFacturasProveedores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSriFacturasProveedores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSriFacturasProveedores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		

		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SriFacturasProveedoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SriFacturasProveedoresBaseDesign.jrxml";
			
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
			
			this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoAsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoria="nombre_modulo";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoria="codigo_asiento_contable";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoriaValor="nombre_modulo";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					sNombreCampoCategoriaValor="codigo_asiento_contable";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_modulo");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_asiento_contable");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
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
	
	public void jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SriFacturasProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_RUC);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getnombre_modulo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getcodigo_asiento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(SriFacturasProveedores srifacturasproveedores:srifacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(srifacturasproveedores.getcredito_mone_local());
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
			//	this.getFilaCabeceraExportarExcelSriFacturasProveedores(row);				
			//	iRow++;
			//}				
			
			//for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSriFacturasProveedores(srifacturasproveedoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
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
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriFacturasProveedores(false);
			
			//SI ES MANUAL
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSriFacturasProveedores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriFacturasProveedores(false);
			
			//SI ES MANUAL
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriFacturasProveedores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSriFacturasProveedores(false);
			
			//SI ES MANUAL
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSriFacturasProveedores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSriFacturasProveedores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSriFacturasProveedores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSriFacturasProveedores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSriFacturasProveedores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSriFacturasProveedores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSriFacturasProveedores.setMinimumSize(dimensionMinimum);
		this.jTableDatosSriFacturasProveedores.setMaximumSize(dimensionMaximum);
		this.jTableDatosSriFacturasProveedores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSriFacturasProveedores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSriFacturasProveedores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSriFacturasProveedores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSriFacturasProveedores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSriFacturasProveedores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSriFacturasProveedores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriFacturasProveedores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSriFacturasProveedores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSriFacturasProveedores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSriFacturasProveedores();
		
		this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSriFacturasProveedores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSriFacturasProveedores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSriFacturasProveedores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSriFacturasProveedores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSriFacturasProveedores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSriFacturasProveedores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSriFacturasProveedores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSriFacturasProveedores.jCheckBoxPostAccionNuevoSriFacturasProveedores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSriFacturasProveedores.jCheckBoxPostAccionSinCerrarSriFacturasProveedores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSriFacturasProveedores.jCheckBoxPostAccionSinMensajeSriFacturasProveedores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSriFacturasProveedores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSriFacturasProveedores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSriFacturasProveedores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
				this.jInternalFrameDetalleFormSriFacturasProveedores.jCheckBoxPostAccionNuevoSriFacturasProveedores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSriFacturasProveedores.jCheckBoxPostAccionSinCerrarSriFacturasProveedores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSriFacturasProveedores.jCheckBoxPostAccionSinMensajeSriFacturasProveedores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSriFacturasProveedores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSriFacturasProveedores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSriFacturasProveedores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSriFacturasProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSriFacturasProveedores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSriFacturasProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSriFacturasProveedores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSriFacturasProveedores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSriFacturasProveedores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSriFacturasProveedores(Boolean esInicializar) throws Exception {
		try	{	
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSriFacturasProveedores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSriFacturasProveedores() throws Exception {
		try	{
			if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSriFacturasProveedores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriFacturasProveedores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSriFacturasProveedores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSriFacturasProveedores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSriFacturasProveedores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSriFacturasProveedores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSriFacturasProveedores.addItem(reporte);
			}
			
			
			if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSriFacturasProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSriFacturasProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSriFacturasProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSriFacturasProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSriFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSriFacturasProveedores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSriFacturasProveedores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriFacturasProveedores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSriFacturasProveedores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
				
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SriFacturasProveedoresConstantesFunciones.getTiposSeleccionarSriFacturasProveedores(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SriFacturasProveedoresConstantesFunciones.getTiposSeleccionarSriFacturasProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SriFacturasProveedoresConstantesFunciones.getTiposSeleccionarSriFacturasProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSriFacturasProveedores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.getSelectedItem()!=null){this.id_transaccionBusquedaSriFacturasProveedores=((Transaccion)this.jComboBoxid_transaccionBusquedaSriFacturasProveedoresSriFacturasProveedores.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaSriFacturasProveedores=new Date(this.jDateChooserfecha_emision_desdeBusquedaSriFacturasProveedoresSriFacturasProveedores.getDate().getTime());
		this.fecha_emision_hastaBusquedaSriFacturasProveedores=new Date(this.jDateChooserfecha_emision_hastaBusquedaSriFacturasProveedoresSriFacturasProveedores.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSriFacturasProveedores(Boolean esInicializar) throws Exception {				
		if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSriFacturasProveedores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSriFacturasProveedores() throws Exception {
		this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySriFacturasProveedores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSriFacturasProveedoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSriFacturasProveedores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=srifacturasproveedoresLogic.getSriFacturasProveedoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=srifacturasproveedoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSriFacturasProveedores.setModel(new SriFacturasProveedoresModel(this.srifacturasproveedoresLogic.getSriFacturasProveedoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSriFacturasProveedores.setModel(new SriFacturasProveedoresModel(this.srifacturasproveedoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySriFacturasProveedores!=null && this.jInternalFrameOrderBySriFacturasProveedores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySriFacturasProveedores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,srifacturasproveedoresConstantesFunciones.resaltarSeleccionarSriFacturasProveedores,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SriFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,srifacturasproveedoresConstantesFunciones.resaltarSeleccionarSriFacturasProveedores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_ID));

		if(this.srifacturasproveedoresConstantesFunciones.mostraridSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.srifacturasproveedoresConstantesFunciones.resaltaridSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activaridSriFacturasProveedores,iSizeTabla,this,true,"idSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltaridSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activaridSriFacturasProveedores,this,true,"idSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.srifacturasproveedoresConstantesFunciones.mostraridentificacionSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltaridentificacionSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activaridentificacionSriFacturasProveedores,iSizeTabla,this,true,"identificacionSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltaridentificacionSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activaridentificacionSriFacturasProveedores,this,true,"identificacionSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarnombreSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombreSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombreSriFacturasProveedores,iSizeTabla,this,true,"nombreSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombreSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombreSriFacturasProveedores,this,true,"nombreSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_RUC));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarrucSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarrucSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarrucSriFacturasProveedores,iSizeTabla,this,true,"rucSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarrucSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarrucSriFacturasProveedores,this,true,"rucSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_moduloSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_moduloSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombre_moduloSriFacturasProveedores,iSizeTabla,this,true,"nombre_moduloSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_moduloSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombre_moduloSriFacturasProveedores,this,true,"nombre_moduloSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_completo_clienteSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_completo_clienteSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombre_completo_clienteSriFacturasProveedores,iSizeTabla,this,true,"nombre_completo_clienteSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_completo_clienteSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombre_completo_clienteSriFacturasProveedores,this,true,"nombre_completo_clienteSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_transaccionSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_transaccionSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombre_transaccionSriFacturasProveedores,iSizeTabla,this,true,"nombre_transaccionSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_transaccionSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnombre_transaccionSriFacturasProveedores,this,true,"nombre_transaccionSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarcodigo_asiento_contableSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarcodigo_asiento_contableSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarcodigo_asiento_contableSriFacturasProveedores,iSizeTabla,this,true,"codigo_asiento_contableSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarcodigo_asiento_contableSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarcodigo_asiento_contableSriFacturasProveedores,this,true,"codigo_asiento_contableSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emisionSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emisionSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarfecha_emisionSriFacturasProveedores,iSizeTabla,this,true,"fecha_emisionSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emisionSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarfecha_emisionSriFacturasProveedores,this,true,"fecha_emisionSriFacturasProveedores","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarnumero_facturaSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnumero_facturaSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnumero_facturaSriFacturasProveedores,iSizeTabla,this,true,"numero_facturaSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarnumero_facturaSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarnumero_facturaSriFacturasProveedores,this,true,"numero_facturaSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.srifacturasproveedoresConstantesFunciones.mostrarcredito_mone_localSriFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarcredito_mone_localSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarcredito_mone_localSriFacturasProveedores,iSizeTabla,this,true,"credito_mone_localSriFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srifacturasproveedoresConstantesFunciones.resaltarcredito_mone_localSriFacturasProveedores,this.srifacturasproveedoresConstantesFunciones.activarcredito_mone_localSriFacturasProveedores,this,true,"credito_mone_localSriFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SriFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriFacturasProveedores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSriFacturasProveedores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSriFacturasProveedores.addColumn(tableColumn);
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
			
			this.jTableDatosSriFacturasProveedores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSriFacturasProveedores.moveColumn(this.jTableDatosSriFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSriFacturasProveedores.moveColumn(this.jTableDatosSriFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSriFacturasProveedores.moveColumn(this.jTableDatosSriFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSriFacturasProveedores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSriFacturasProveedores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSriFacturasProveedores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSriFacturasProveedores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSriFacturasProveedores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSriFacturasProveedores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSriFacturasProveedores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=srifacturasproveedoresLogic.getSriFacturasProveedoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=srifacturasproveedoress.size()-1;
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
		//this.jTableDatosSriFacturasProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSriFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSriFacturasProveedores();
			
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
				
				//this.isEsNuevoSriFacturasProveedores=false;
					
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
				if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriFacturasProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriFacturasProveedores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.srifacturasproveedores.getsType().equals("DUPLICADO")
				   || this.srifacturasproveedores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSriFacturasProveedores=true;
				
				} else {
					this.isEsNuevoSriFacturasProveedores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					if(this.srifacturasproveedores.getId()>=0 && !this.srifacturasproveedores.getIsNew()) {						
						this.isEsNuevoSriFacturasProveedores=false;
						
					} else {
						this.isEsNuevoSriFacturasProveedores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSriFacturasProveedores(esRelaciones);						
				
				this.seleccionarSriFacturasProveedores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.srifacturasproveedores.getId()<0) {
					this.isEsNuevoSriFacturasProveedores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSriFacturasProveedores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSriFacturasProveedores(evt,rowIndex);
				}	
				
				if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SriFacturasProveedores: " + this.dDif); 
					}
				}								
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSriFacturasProveedores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.srifacturasproveedores)) {
					if(this.srifacturasproveedores.getId()>0) {
						this.srifacturasproveedores.setIsDeleted(true);
						
						this.srifacturasproveedoressEliminados.add(this.srifacturasproveedores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.srifacturasproveedoresLogic.getSriFacturasProveedoress().remove(this.srifacturasproveedores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedoress.remove(this.srifacturasproveedores);				
					}
					
					
					((SriFacturasProveedoresModel) this.jTableDatosSriFacturasProveedores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSriFacturasProveedores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSriFacturasProveedores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSriFacturasProveedores) {
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSriFacturasProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSriFacturasProveedores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedores);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSriFacturasProveedores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSriFacturasProveedores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSriFacturasProveedores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSriFacturasProveedores(srifacturasproveedores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSriFacturasProveedores(srifacturasproveedores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySriFacturasProveedores(srifacturasproveedores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySriFacturasProveedores(srifacturasproveedores);
	}
	
	public void setVariablesObjetoActualToFormularioSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setText(srifacturasproveedores.getId().toString());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setText(srifacturasproveedores.getidentificacion());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setText(srifacturasproveedores.getnombre());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setText(srifacturasproveedores.getruc());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setText(srifacturasproveedores.getnombre_modulo());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setText(srifacturasproveedores.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setText(srifacturasproveedores.getnombre_transaccion());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setText(srifacturasproveedores.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setDate(srifacturasproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setText(srifacturasproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setText(srifacturasproveedores.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SriFacturasProveedores srifacturasproveedoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,srifacturasproveedoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SriFacturasProveedores srifacturasproveedoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				srifacturasproveedoresLocal=this.srifacturasproveedores;
			} else {
				srifacturasproveedoresLocal=this.srifacturasproveedoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(srifacturasproveedoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSriFacturasProveedores(srifacturasproveedoresLocal,true);
					
					if(srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(srifacturasproveedoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(srifacturasproveedoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriFacturasProveedores(srifacturasproveedores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(srifacturasproveedores);
	}
	
	public void setVariablesFormularioToObjetoActualSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSriFacturasProveedores(srifacturasproveedores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.getText()==null || this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.getText()=="" || this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.getText()=="Id") {
				this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setText("0");
			}

			if(conColumnasBase) {srifacturasproveedores.setId(Long.parseLong(this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelIdSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setidentificacion(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidentificacionSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setnombre(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombreSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setruc(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelrucSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setnombre_modulo(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_moduloSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setnombre_completo_cliente(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_completo_clienteSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setnombre_transaccion(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnombre_transaccionSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setcodigo_asiento_contable(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelcodigo_asiento_contableSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setfecha_emision(this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelfecha_emisionSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setnumero_factura(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelnumero_facturaSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			srifacturasproveedores.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelcredito_mone_localSriFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSriFacturasProveedores(SriFacturasProveedores srifacturasproveedoresBean,SriFacturasProveedores srifacturasproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSriFacturasProveedores(SriFacturasProveedores srifacturasproveedoresOrigen,SriFacturasProveedores srifacturasproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getId()!=null && !srifacturasproveedoresOrigen.getId().equals(0L))) {srifacturasproveedores.setId(srifacturasproveedoresOrigen.getId());}}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getfecha_emision_desde()!=null && !srifacturasproveedoresOrigen.getfecha_emision_desde().equals(new Date()))) {srifacturasproveedores.setfecha_emision_desde(srifacturasproveedoresOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getfecha_emision_hasta()!=null && !srifacturasproveedoresOrigen.getfecha_emision_hasta().equals(new Date()))) {srifacturasproveedores.setfecha_emision_hasta(srifacturasproveedoresOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getidentificacion()!=null && !srifacturasproveedoresOrigen.getidentificacion().equals(""))) {srifacturasproveedores.setidentificacion(srifacturasproveedoresOrigen.getidentificacion());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getnombre()!=null && !srifacturasproveedoresOrigen.getnombre().equals(""))) {srifacturasproveedores.setnombre(srifacturasproveedoresOrigen.getnombre());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getruc()!=null && !srifacturasproveedoresOrigen.getruc().equals(""))) {srifacturasproveedores.setruc(srifacturasproveedoresOrigen.getruc());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getnombre_modulo()!=null && !srifacturasproveedoresOrigen.getnombre_modulo().equals(""))) {srifacturasproveedores.setnombre_modulo(srifacturasproveedoresOrigen.getnombre_modulo());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getnombre_completo_cliente()!=null && !srifacturasproveedoresOrigen.getnombre_completo_cliente().equals(""))) {srifacturasproveedores.setnombre_completo_cliente(srifacturasproveedoresOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getnombre_transaccion()!=null && !srifacturasproveedoresOrigen.getnombre_transaccion().equals(""))) {srifacturasproveedores.setnombre_transaccion(srifacturasproveedoresOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getcodigo_asiento_contable()!=null && !srifacturasproveedoresOrigen.getcodigo_asiento_contable().equals(""))) {srifacturasproveedores.setcodigo_asiento_contable(srifacturasproveedoresOrigen.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getfecha_emision()!=null && !srifacturasproveedoresOrigen.getfecha_emision().equals(new Date()))) {srifacturasproveedores.setfecha_emision(srifacturasproveedoresOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getnumero_factura()!=null && !srifacturasproveedoresOrigen.getnumero_factura().equals(""))) {srifacturasproveedores.setnumero_factura(srifacturasproveedoresOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && srifacturasproveedoresOrigen.getcredito_mone_local()!=null && !srifacturasproveedoresOrigen.getcredito_mone_local().equals(0.0))) {srifacturasproveedores.setcredito_mone_local(srifacturasproveedoresOrigen.getcredito_mone_local());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setText(srifacturasproveedores.getId().toString());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setText(srifacturasproveedores.getidentificacion());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setText(srifacturasproveedores.getnombre());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setText(srifacturasproveedores.getruc());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setText(srifacturasproveedores.getnombre_modulo());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setText(srifacturasproveedores.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setText(srifacturasproveedores.getnombre_transaccion());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setText(srifacturasproveedores.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setDate(srifacturasproveedores.getfecha_emision());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setText(srifacturasproveedores.getnumero_factura());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setText(srifacturasproveedores.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSriFacturasProveedores(SriFacturasProveedoresBean srifacturasproveedoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setText(srifacturasproveedoresBean.getId().toString());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setText(srifacturasproveedoresBean.getidentificacion());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setText(srifacturasproveedoresBean.getnombre());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setText(srifacturasproveedoresBean.getruc());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setText(srifacturasproveedoresBean.getnombre_modulo());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setText(srifacturasproveedoresBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setText(srifacturasproveedoresBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setText(srifacturasproveedoresBean.getcodigo_asiento_contable());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setDate(srifacturasproveedoresBean.getfecha_emision());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setText(srifacturasproveedoresBean.getnumero_factura());
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setText(srifacturasproveedoresBean.getcredito_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSriFacturasProveedores(SriFacturasProveedoresParameterReturnGeneral srifacturasproveedoresReturnGeneral,SriFacturasProveedoresBean srifacturasproveedoresBean,Boolean conDefault) throws Exception { 
		try {
			SriFacturasProveedores srifacturasproveedoresLocal=new SriFacturasProveedores();
			
			srifacturasproveedoresLocal=srifacturasproveedoresReturnGeneral.getSriFacturasProveedores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && srifacturasproveedoresLocal.getId()!=null && !srifacturasproveedoresLocal.getId().equals(0L))) {srifacturasproveedoresBean.setId(srifacturasproveedoresLocal.getId());}}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getidentificacion()!=null && !srifacturasproveedoresLocal.getidentificacion().equals(""))) {srifacturasproveedoresBean.setidentificacion(srifacturasproveedoresLocal.getidentificacion());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getnombre()!=null && !srifacturasproveedoresLocal.getnombre().equals(""))) {srifacturasproveedoresBean.setnombre(srifacturasproveedoresLocal.getnombre());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getruc()!=null && !srifacturasproveedoresLocal.getruc().equals(""))) {srifacturasproveedoresBean.setruc(srifacturasproveedoresLocal.getruc());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getnombre_modulo()!=null && !srifacturasproveedoresLocal.getnombre_modulo().equals(""))) {srifacturasproveedoresBean.setnombre_modulo(srifacturasproveedoresLocal.getnombre_modulo());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getnombre_completo_cliente()!=null && !srifacturasproveedoresLocal.getnombre_completo_cliente().equals(""))) {srifacturasproveedoresBean.setnombre_completo_cliente(srifacturasproveedoresLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getnombre_transaccion()!=null && !srifacturasproveedoresLocal.getnombre_transaccion().equals(""))) {srifacturasproveedoresBean.setnombre_transaccion(srifacturasproveedoresLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getcodigo_asiento_contable()!=null && !srifacturasproveedoresLocal.getcodigo_asiento_contable().equals(""))) {srifacturasproveedoresBean.setcodigo_asiento_contable(srifacturasproveedoresLocal.getcodigo_asiento_contable());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getfecha_emision()!=null && !srifacturasproveedoresLocal.getfecha_emision().equals(new Date()))) {srifacturasproveedoresBean.setfecha_emision(srifacturasproveedoresLocal.getfecha_emision());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getnumero_factura()!=null && !srifacturasproveedoresLocal.getnumero_factura().equals(""))) {srifacturasproveedoresBean.setnumero_factura(srifacturasproveedoresLocal.getnumero_factura());}
			if(conDefault || (!conDefault && srifacturasproveedoresLocal.getcredito_mone_local()!=null && !srifacturasproveedoresLocal.getcredito_mone_local().equals(0.0))) {srifacturasproveedoresBean.setcredito_mone_local(srifacturasproveedoresLocal.getcredito_mone_local());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSriFacturasProveedoresGenerico(Long idSriFacturasProveedoresSeleccionado,JComboBox jComboBoxSriFacturasProveedores,List<SriFacturasProveedores> srifacturasproveedoressLocal)throws Exception {
		try {
			SriFacturasProveedores  srifacturasproveedoresTemp=null;

			for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressLocal) {
				if(srifacturasproveedoresAux.getId()!=null && srifacturasproveedoresAux.getId().equals(idSriFacturasProveedoresSeleccionado)) {
					srifacturasproveedoresTemp=srifacturasproveedoresAux;
					break;
				}
			}

			jComboBoxSriFacturasProveedores.setSelectedItem(srifacturasproveedoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSriFacturasProveedoresGenerico(JComboBox jComboBoxSriFacturasProveedores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriFacturasProveedores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSriFacturasProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSriFacturasProveedores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSriFacturasProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSriFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSriFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			srifacturasproveedores=(SriFacturasProveedores) srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			srifacturasproveedores =(SriFacturasProveedores) srifacturasproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!srifacturasproveedores.getIsNew() && !srifacturasproveedores.getIsChanged() && !srifacturasproveedores.getIsDeleted()) {
				sDescripcion=srifacturasproveedores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=srifacturasproveedores.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!srifacturasproveedores.getIsNew() && !srifacturasproveedores.getIsChanged() && !srifacturasproveedores.getIsDeleted()) {
				sDescripcion=srifacturasproveedores.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=srifacturasproveedores.gettransaccion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SriFacturasProveedores srifacturasproveedoresRow=new SriFacturasProveedores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			srifacturasproveedoresRow=(SriFacturasProveedores) srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			srifacturasproveedoresRow=(SriFacturasProveedores) srifacturasproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSriFacturasProveedores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores));			
			this.jButtonDuplicarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarSriFacturasProveedores && this.isPermisoDuplicarSriFacturasProveedores));			
			this.jButtonCopiarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarSriFacturasProveedores && this.isPermisoCopiarSriFacturasProveedores));
			this.jButtonVerFormSriFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormSriFacturasProveedores && this.isPermisoVerFormSriFacturasProveedores));
			
			this.jButtonAbrirOrderBySriFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenSriFacturasProveedores && this.isPermisoOrdenSriFacturasProveedores));			
			
			this.jButtonNuevoRelacionesSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores));			
			this.jButtonNuevoGuardarCambiosSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarSriFacturasProveedores && this.isPermisoActualizarSriFacturasProveedores));	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarSriFacturasProveedores && this.isPermisoActualizarSriFacturasProveedores));	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarSriFacturasProveedores && this.isPermisoEliminarSriFacturasProveedores));
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarSriFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarSriFacturasProveedores);							
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));			
			
			}
						
			this.jButtonGuardarCambiosTablaSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores));						
			this.jButtonDuplicarToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarSriFacturasProveedores && this.isPermisoDuplicarSriFacturasProveedores));						
			this.jButtonCopiarToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarSriFacturasProveedores && this.isPermisoCopiarSriFacturasProveedores));			
			this.jButtonVerFormToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormSriFacturasProveedores && this.isPermisoVerFormSriFacturasProveedores));			
			this.jButtonAbrirOrderByToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenSriFacturasProveedores && this.isPermisoOrdenSriFacturasProveedores));
			this.jButtonNuevoRelacionesToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores));			
			this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));			
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarSriFacturasProveedores && this.isPermisoActualizarSriFacturasProveedores));	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarSriFacturasProveedores  && this.isPermisoActualizarSriFacturasProveedores));	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarSriFacturasProveedores && this.isPermisoEliminarSriFacturasProveedores));
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarToolBarSriFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarSriFacturasProveedores);				
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores));			
			this.jMenuItemDuplicarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarSriFacturasProveedores && this.isPermisoDuplicarSriFacturasProveedores));			
			this.jMenuItemCopiarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarSriFacturasProveedores && this.isPermisoCopiarSriFacturasProveedores));			
			this.jMenuItemVerFormSriFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormSriFacturasProveedores && this.isPermisoVerFormSriFacturasProveedores));			
			this.jMenuItemAbrirOrderBySriFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenSriFacturasProveedores && this.isPermisoOrdenSriFacturasProveedores));			
			//this.jMenuItemMostrarOcultarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenSriFacturasProveedores && this.isPermisoOrdenSriFacturasProveedores));
			this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenSriFacturasProveedores && this.isPermisoOrdenSriFacturasProveedores));			
			//this.jMenuItemDetalleMostrarOcultarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenSriFacturasProveedores && this.isPermisoOrdenSriFacturasProveedores));			
			this.jMenuItemNuevoRelacionesSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores));			
			this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoSriFacturasProveedores && this.isPermisoNuevoSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));									
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemModificarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarSriFacturasProveedores && this.isPermisoActualizarSriFacturasProveedores));	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemActualizarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarSriFacturasProveedores && this.isPermisoActualizarSriFacturasProveedores));	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemEliminarSriFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarSriFacturasProveedores && this.isPermisoEliminarSriFacturasProveedores));
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemCancelarSriFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarSriFacturasProveedores);				
			}
			
			this.jMenuItemGuardarCambiosSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));						
			this.jMenuItemGuardarCambiosTablaSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=this.jButtonNuevoSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaDuplicarSriFacturasProveedores=this.jButtonDuplicarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCopiarSriFacturasProveedores=this.jButtonCopiarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaVerFormSriFacturasProveedores=this.jButtonVerFormSriFacturasProveedores.isVisible();
			
			this.isVisibilidadCeldaOrdenSriFacturasProveedores=this.jButtonAbrirOrderBySriFacturasProveedores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=this.jButtonNuevoRelacionesSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaModificarSriFacturasProveedores=this.jButtonModificarSriFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=this.jButtonGuardarCambiosTablaSriFacturasProveedores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=this.jButtonNuevoToolBarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=this.jButtonNuevoRelacionesToolBarSriFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.isVisibilidadCeldaModificarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarToolBarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarToolBarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarToolBarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarToolBarSriFacturasProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriFacturasProveedores=this.jButtonGuardarCambiosToolBarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=this.jMenuItemNuevoSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=this.jMenuItemNuevoRelacionesSriFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.isVisibilidadCeldaModificarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemModificarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemActualizarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemEliminarSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemCancelarSriFacturasProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSriFacturasProveedores=this.jMenuItemGuardarCambiosSriFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=this.jMenuItemGuardarCambiosTablaSriFacturasProveedores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSriFacturasProveedores(Boolean esInicializar) {
		if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				//if(this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSriFacturasProveedores();
			}
			
			this.inicializarActualizarBindingBotonesManualSriFacturasProveedores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSriFacturasProveedores() {
		this.jButtonNuevoSriFacturasProveedores.setVisible(this.isPermisoNuevoSriFacturasProveedores);			
		this.jButtonDuplicarSriFacturasProveedores.setVisible(this.isPermisoDuplicarSriFacturasProveedores);			
		this.jButtonCopiarSriFacturasProveedores.setVisible(this.isPermisoCopiarSriFacturasProveedores);			
		this.jButtonVerFormSriFacturasProveedores.setVisible(this.isPermisoVerFormSriFacturasProveedores);			
		
		this.jButtonAbrirOrderBySriFacturasProveedores.setVisible(this.isPermisoOrdenSriFacturasProveedores);					
		
		this.jButtonNuevoRelacionesSriFacturasProveedores.setVisible(this.isPermisoNuevoSriFacturasProveedores);			
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarSriFacturasProveedores.setVisible(this.isPermisoActualizarSriFacturasProveedores);	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarSriFacturasProveedores.setVisible(this.isPermisoActualizarSriFacturasProveedores);	
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarSriFacturasProveedores.setVisible(this.isPermisoEliminarSriFacturasProveedores);
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarSriFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarSriFacturasProveedores);						
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.setVisible(this.isPermisoGuardarCambiosSriFacturasProveedores);							
		}
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.setVisible(this.isPermisoActualizarSriFacturasProveedores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSriFacturasProveedores() {
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarSriFacturasProveedores.setVisible(this.isPermisoActualizarSriFacturasProveedores);	
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarSriFacturasProveedores.setVisible(this.isPermisoActualizarSriFacturasProveedores);	
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarSriFacturasProveedores.setVisible(this.isPermisoEliminarSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarSriFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarSriFacturasProveedores);							
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarSriFacturasProveedores && this.isPermisoGuardarCambiosSriFacturasProveedores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSriFacturasProveedores() {
		if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSriFacturasProveedores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSriFacturasProveedores() {
	}
	
	public void jTableDatosSriFacturasProveedoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSriFacturasProveedores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.srifacturasproveedores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSriFacturasProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSriFacturasProveedores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriFacturasProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.srifacturasproveedoresLogic.getConnexion());

				if(this.srifacturasproveedores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.srifacturasproveedores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriFacturasProveedores=(TitledBorder)this.jScrollPanelDatosSriFacturasProveedores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSriFacturasProveedores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.srifacturasproveedores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionSriFacturasProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebSriFacturasProveedores(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSriFacturasProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSriFacturasProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.srifacturasproveedoresLogic.getConnexion());

				if(this.srifacturasproveedores.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.srifacturasproveedores.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSriFacturasProveedores=(TitledBorder)this.jScrollPanelDatosSriFacturasProveedores.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderSriFacturasProveedores.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.srifacturasproveedores.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.srifacturasproveedores.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.srifacturasproveedores.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.srifacturasproveedores.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.srifacturasproveedores.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.srifacturasproveedores.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_moduloSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getnombre_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_modulo like '%"+this.srifacturasproveedores.getnombre_modulo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.srifacturasproveedores.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.srifacturasproveedores.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_asiento_contableSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getcodigo_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_asiento_contable like '%"+this.srifacturasproveedores.getcodigo_asiento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.srifacturasproveedores.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.srifacturasproveedores.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localSriFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.getsrifacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.srifacturasproveedores==null) {
						this.srifacturasproveedores = new SriFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);
				}

				if(this.srifacturasproveedores.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.srifacturasproveedores.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSriFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaSriFacturasProveedoresSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);

			this.getSriFacturasProveedoressBusquedaSriFacturasProveedores();

			this.inicializarActualizarBindingSriFacturasProveedores(false);

			//if(SriFacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);

			this.getSriFacturasProveedoressFK_IdEmpresa();

			this.inicializarActualizarBindingSriFacturasProveedores(false);

			//if(SriFacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionSriFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);

			this.getSriFacturasProveedoressFK_IdTransaccion();

			this.inicializarActualizarBindingSriFacturasProveedores(false);

			//if(SriFacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srifacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSriFacturasProveedores() {
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameDetalleFormSriFacturasProveedores.dispose();
			this.jInternalFrameDetalleFormSriFacturasProveedores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
			this.jInternalFrameReporteDinamicoSriFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSriFacturasProveedores.dispose();
			this.jInternalFrameReporteDinamicoSriFacturasProveedores=null;
		}
		
		if(this.jInternalFrameImportacionSriFacturasProveedores!=null) {
			this.jInternalFrameImportacionSriFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameImportacionSriFacturasProveedores.dispose();
			this.jInternalFrameImportacionSriFacturasProveedores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSriFacturasProveedores();
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSriFacturasProveedores")) {
				jButtonDuplicarSriFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSriFacturasProveedores")) {
				jButtonCopiarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormSriFacturasProveedores")) {
				jButtonVerFormSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSriFacturasProveedores")) {
				jButtonDuplicarSriFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSriFacturasProveedores")) {
				jButtonDuplicarSriFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSriFacturasProveedores")) {
				jButtonModificarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSriFacturasProveedores")) {
				jButtonModificarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSriFacturasProveedores")) {
				jButtonModificarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSriFacturasProveedores")) {
				jButtonActualizarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSriFacturasProveedores")) {
				jButtonActualizarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSriFacturasProveedores")) {
				jButtonActualizarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarSriFacturasProveedores")) {
				jButtonEliminarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSriFacturasProveedores")) {
				jButtonEliminarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSriFacturasProveedores")) {
				jButtonEliminarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarSriFacturasProveedores")) {
				jButtonCancelarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSriFacturasProveedores")) {
				jButtonCancelarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSriFacturasProveedores")) {
				jButtonCancelarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarSriFacturasProveedores")) {
				jButtonCerrarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSriFacturasProveedores")) {
				jButtonCerrarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSriFacturasProveedores")) {
				jButtonCerrarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSriFacturasProveedores")) {
				jButtonMostrarOcultarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSriFacturasProveedores")) {
				jButtonCancelarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSriFacturasProveedores")) {
				jButtonCopiarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSriFacturasProveedores")) {
				jButtonVerFormSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSriFacturasProveedores")) {
				jButtonCopiarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSriFacturasProveedores")) {
				jButtonVerFormSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSriFacturasProveedores")) {
				jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSriFacturasProveedores")) {
				jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSriFacturasProveedores")) {
				jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSriFacturasProveedores")) {
				jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSriFacturasProveedores")) {
				jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSriFacturasProveedores")) {
				jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSriFacturasProveedores")) {
				jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSriFacturasProveedores")) {
				jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSriFacturasProveedores")) {
				jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySriFacturasProveedores") || sTipo.equals("MenuItemDetalleAbrirOrderBySriFacturasProveedores")) {
				jButtonAbrirOrderBySriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSriFacturasProveedores") || sTipo.equals("MenuItemDetalleMostrarOcultarSriFacturasProveedores")) {
				jButtonMostrarOcultarSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSriFacturasProveedores")) {
				jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSriFacturasProveedores")) {
				jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSriFacturasProveedores")) {
				jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSriFacturasProveedores")) {
				jButtonCerrarReporteDinamicoSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSriFacturasProveedores")) {
				jButtonGenerarReporteDinamicoSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSriFacturasProveedores")) {
				
				jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSriFacturasProveedores")) {
				jButtonCerrarImportacionSriFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSriFacturasProveedores")) {
				
				jButtonGenerarImportacionSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSriFacturasProveedores")) {
				
				jButtonAbrirImportacionSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSriFacturasProveedores")) {
				jComboBoxTiposAccionesSriFacturasProveedoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSriFacturasProveedores")) {
				jComboBoxTiposRelacionesSriFacturasProveedoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSriFacturasProveedores")) {
				jComboBoxTiposAccionesSriFacturasProveedoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSriFacturasProveedores")) {
				
				jComboBoxTiposSeleccionarSriFacturasProveedoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSriFacturasProveedores")) {
				jTextFieldValorCampoGeneralSriFacturasProveedoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySriFacturasProveedores")) {
				jButtonAbrirOrderBySriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSriFacturasProveedores")) {
				jButtonAbrirOrderBySriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySriFacturasProveedores")) {
				jButtonCerrarOrderBySriFacturasProveedoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriFacturasProveedoresBusqueda")) {
				this.jButtonidSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSriFacturasProveedoresUpdate")) {
				this.jButtonid_empresaSriFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSriFacturasProveedoresBusqueda")) {
				this.jButtonid_empresaSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionSriFacturasProveedoresUpdate")) {
				this.jButtonid_transaccionSriFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionSriFacturasProveedoresBusqueda")) {
				this.jButtonid_transaccionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeSriFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_desdeSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaSriFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_hastaSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionSriFacturasProveedoresBusqueda")) {
				this.jButtonidentificacionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSriFacturasProveedoresBusqueda")) {
				this.jButtonnombreSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriFacturasProveedoresBusqueda")) {
				this.jButtonrucSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloSriFacturasProveedoresBusqueda")) {
				this.jButtonnombre_moduloSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteSriFacturasProveedoresBusqueda")) {
				this.jButtonnombre_completo_clienteSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionSriFacturasProveedoresBusqueda")) {
				this.jButtonnombre_transaccionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contableSriFacturasProveedoresBusqueda")) {
				this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emisionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaSriFacturasProveedoresBusqueda")) {
				this.jButtonnumero_facturaSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localSriFacturasProveedoresBusqueda")) {
				this.jButtoncredito_mone_localSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaSriFacturasProveedoresSriFacturasProveedores")) {
				this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedoresActionPerformed(evt);
			}
			
			;
			
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSriFacturasProveedores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SriFacturasProveedores srifacturasproveedoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				srifacturasproveedoresLocal=this.srifacturasproveedores;
			} else {
				srifacturasproveedoresLocal=this.srifacturasproveedoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
							
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
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
			
			


			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
								
						
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
								
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
							
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
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
			
			


			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
								
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSriFacturasProveedores")) {
					jCheckBoxSeleccionarTodosSriFacturasProveedoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSriFacturasProveedores")) {
					jCheckBoxSeleccionadosSriFacturasProveedoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSriFacturasProveedores")) {
					
				}
				
				


				
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
												
				
				


				
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
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
			
			


			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.srifacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.srifacturasproveedores);
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
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
				
				


				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SriFacturasProveedores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SriFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSriFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srifacturasproveedoresAnterior =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSriFacturasProveedores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSriFacturasProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSriFacturasProveedores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.srifacturasproveedores =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.srifacturasproveedores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSriFacturasProveedores")) {
				
				}
				
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSriFacturasProveedores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSriFacturasProveedores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSriFacturasProveedores")) {
			
			}
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSriFacturasProveedores();
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			if(sTipo.equals("NuevoSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSriFacturasProveedores")) {
				jButtonDuplicarSriFacturasProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSriFacturasProveedores")) {
				jButtonCopiarSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSriFacturasProveedores")) {
				jButtonVerFormSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSriFacturasProveedores")) {
				jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSriFacturasProveedores")) {
				jButtonModificarSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSriFacturasProveedores")) {
				jButtonActualizarSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSriFacturasProveedores")) {
				jButtonEliminarSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSriFacturasProveedores")) {
				jButtonCancelarSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSriFacturasProveedores")) {
				jButtonCerrarSriFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSriFacturasProveedores")) {
				jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSriFacturasProveedores")) {
				jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySriFacturasProveedores")) {
				jButtonAbrirOrderBySriFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSriFacturasProveedores")) {
				jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSriFacturasProveedores")) {
				jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSriFacturasProveedores")) {
				jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSriFacturasProveedoresBusqueda")) {
				this.jButtonidSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSriFacturasProveedoresUpdate")) {
				this.jButtonid_empresaSriFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSriFacturasProveedoresBusqueda")) {
				this.jButtonid_empresaSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionSriFacturasProveedoresUpdate")) {
				this.jButtonid_transaccionSriFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionSriFacturasProveedoresBusqueda")) {
				this.jButtonid_transaccionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeSriFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_desdeSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaSriFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emision_hastaSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionSriFacturasProveedoresBusqueda")) {
				this.jButtonidentificacionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSriFacturasProveedoresBusqueda")) {
				this.jButtonnombreSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSriFacturasProveedoresBusqueda")) {
				this.jButtonrucSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloSriFacturasProveedoresBusqueda")) {
				this.jButtonnombre_moduloSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteSriFacturasProveedoresBusqueda")) {
				this.jButtonnombre_completo_clienteSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionSriFacturasProveedoresBusqueda")) {
				this.jButtonnombre_transaccionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asiento_contableSriFacturasProveedoresBusqueda")) {
				this.jButtoncodigo_asiento_contableSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionSriFacturasProveedoresBusqueda")) {
				this.jButtonfecha_emisionSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaSriFacturasProveedoresBusqueda")) {
				this.jButtonnumero_facturaSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localSriFacturasProveedoresBusqueda")) {
				this.jButtoncredito_mone_localSriFacturasProveedoresBusquedaActionPerformed(evt);
			}
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSriFacturasProveedores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSriFacturasProveedores")) {
				closingInternalFrameSriFacturasProveedores();
				
			} else if(sTipo.equals("jButtonCancelarSriFacturasProveedores")) {
				JInternalFrameBase jInternalFrameDetalleFormSriFacturasProveedores = (JInternalFrameBase)evt.getSource();
	            	
	            SriFacturasProveedoresBeanSwingJInternalFrame jInternalFrameParent=(SriFacturasProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormSriFacturasProveedores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSriFacturasProveedoresActionPerformed(null);
			}
			
			SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.srifacturasproveedores,new Object(),this.srifacturasproveedoresParameterGeneral,this.srifacturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSriFacturasProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSriFacturasProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSriFacturasProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.srifacturasproveedores)) {
			if(!esControlTabla) {
				if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);			
				}
				
				if(this.srifacturasproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSriFacturasProveedores(this.srifacturasproveedoresReturnGeneral,this.srifacturasproveedoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.srifacturasproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSriFacturasProveedores(classes,this.srifacturasproveedoresReturnGeneral,this.srifacturasproveedoresBean,false);
					}
						
					if(this.srifacturasproveedoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySriFacturasProveedores(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores());	
					}
						
					if(this.srifacturasproveedoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores(),classes);//this.srifacturasproveedoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSriFacturasProveedores(this.srifacturasproveedores,classes);//this.srifacturasproveedoresBean);									
				}
			
				if(SriFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSriFacturasProveedores(this.srifacturasproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSriFacturasProveedores(this.srifacturasproveedores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.srifacturasproveedoresAnterior!=null) {
						this.srifacturasproveedores=this.srifacturasproveedoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.srifacturasproveedoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores(),srifacturasproveedoresLogic.getSriFacturasProveedoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedores(),this.srifacturasproveedoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSriFacturasProveedores.repaint();
				
				//((AbstractTableModel) this.jTableDatosSriFacturasProveedores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSriFacturasProveedores();
			}
		}
	}
	
	public void actualizarVisualTableDatosSriFacturasProveedores() throws Exception {
		
		SriFacturasProveedoresModel srifacturasproveedoresModel=(SriFacturasProveedoresModel)this.jTableDatosSriFacturasProveedores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			srifacturasproveedoresModel.srifacturasproveedoress=this.srifacturasproveedoresLogic.getSriFacturasProveedoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			srifacturasproveedoresModel.srifacturasproveedoress=this.srifacturasproveedoress;
		}
		
		
		((SriFacturasProveedoresModel) this.jTableDatosSriFacturasProveedores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSriFacturasProveedores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsrifacturasproveedoresAnterior(),this.srifacturasproveedoresLogic.getSriFacturasProveedoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsrifacturasproveedoresAnterior(),this.srifacturasproveedoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSriFacturasProveedores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
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
										
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.srifacturasproveedores,new Object(),generalEntityParameterGeneral,this.srifacturasproveedoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SriFacturasProveedoresConstantesFunciones.getClassesRelationshipsOfSriFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SriFacturasProveedoresConstantesFunciones.getClassesRelationshipsFromStringsOfSriFacturasProveedores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSriFacturasProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SriFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.srifacturasproveedores,new Object(),generalEntityParameterGeneral,this.srifacturasproveedoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSriFacturasProveedores(SriFacturasProveedoresBean srifacturasproveedoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSriFacturasProveedores(ArrayList<Classe> classes,SriFacturasProveedoresReturnGeneral srifacturasproveedoresReturnGeneral,SriFacturasProveedoresBean srifacturasproveedoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.srifacturasproveedores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSriFacturasProveedores = new SriFacturasProveedoresDetalleFormJInternalFrame(jDesktopPane,this.srifacturasproveedoresSessionBean.getConGuardarRelaciones(),this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.setVisible(false);
		this.jInternalFrameDetalleFormSriFacturasProveedores.setSelected(false);						
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.srifacturasproveedoresLogic=this.srifacturasproveedoresLogic;
		
		this.cargarCombosFrameForeignKeySriFacturasProveedores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSriFacturasProveedores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSriFacturasProveedores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySriFacturasProveedores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySriFacturasProveedores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriFacturasProveedores"));
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarSriFacturasProveedores"));

		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriFacturasProveedores"));
					
		this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemModificarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"ActualizarSriFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriFacturasProveedores"));
						
		this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemActualizarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarSriFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriFacturasProveedores"));
								
		this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemEliminarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarSriFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriFacturasProveedores"));
					
		this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemCancelarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriFacturasProveedores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemDetalleCerrarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriFacturasProveedores"));
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriFacturasProveedores"));
		
		
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriFacturasProveedores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonidSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idSriFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_empresaSriFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_empresaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_transaccionSriFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionSriFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_transaccionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonidentificacionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"identificacionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombreSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombreSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonrucSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_moduloSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emisionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnumero_facturaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSriFacturasProveedoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriFacturasProveedores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSriFacturasProveedores"));
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSriFacturasProveedores"));
		}
		
		this.jTableDatosSriFacturasProveedores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSriFacturasProveedores"));
		
		this.jTableDatosSriFacturasProveedores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSriFacturasProveedores"));
		
		this.jButtonNuevoSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoSriFacturasProveedores"));
		
		this.jButtonDuplicarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"DuplicarSriFacturasProveedores"));
		
		this.jButtonCopiarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"CopiarSriFacturasProveedores"));
		
		this.jButtonVerFormSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"VerFormSriFacturasProveedores"));
		
		
		this.jButtonNuevoToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoToolBarSriFacturasProveedores"));
			
		this.jButtonDuplicarToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSriFacturasProveedores"));
			
		this.jMenuItemNuevoSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSriFacturasProveedores"));
			
		this.jMenuItemDuplicarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSriFacturasProveedores"));		
		
		
		this.jButtonNuevoRelacionesSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSriFacturasProveedores"));
		
		
		this.jButtonNuevoRelacionesToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSriFacturasProveedores"));
			
		this.jMenuItemNuevoRelacionesSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSriFacturasProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarSriFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonModificarToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarSriFacturasProveedores"));
			
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemModificarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarSriFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"ActualizarSriFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonActualizarToolBarSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSriFacturasProveedores"));
				
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemActualizarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSriFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarSriFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonEliminarToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarSriFacturasProveedores"));
						
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemEliminarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSriFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarSriFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonCancelarToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarSriFacturasProveedores"));
			
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemCancelarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSriFacturasProveedores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSriFacturasProveedores"));		
		
		
		this.jButtonCerrarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarSriFacturasProveedores"));
		
		
		this.jButtonCerrarToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarToolBarSriFacturasProveedores"));
			
		this.jMenuItemCerrarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSriFacturasProveedores"));
			
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jMenuItemDetalleCerrarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSriFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosSriFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSriFacturasProveedores"));
		}
		
		this.jButtonCopiarToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CopiarToolBarSriFacturasProveedores"));
			
		this.jButtonVerFormToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"VerFormToolBarSriFacturasProveedores"));
		
		this.jMenuItemGuardarCambiosSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSriFacturasProveedores"));
			
		this.jMenuItemCopiarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSriFacturasProveedores"));		
		
		this.jMenuItemVerFormSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSriFacturasProveedores"));		
		
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriFacturasProveedores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSriFacturasProveedores"));
			
		this.jMenuItemGuardarCambiosTablaSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSriFacturasProveedores"));		
		
		
		
		this.jButtonRecargarInformacionSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionSriFacturasProveedores"));
					
		this.jButtonRecargarInformacionToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSriFacturasProveedores"));
		
		this.jMenuItemRecargarInformacionSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSriFacturasProveedores"));		
		
		
		
		this.jButtonAnterioresSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"AnterioresSriFacturasProveedores"));
		
		
		this.jButtonAnterioresToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSriFacturasProveedores"));
		
		this.jMenuItemAnterioresSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSriFacturasProveedores"));		
		
		
		this.jButtonSiguientesSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"SiguientesSriFacturasProveedores"));
		
		
		this.jButtonSiguientesToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSriFacturasProveedores"));
			
		this.jMenuItemSiguientesSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSriFacturasProveedores"));
			
		this.jMenuItemAbrirOrderBySriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySriFacturasProveedores"));
			
		this.jMenuItemMostrarOcultarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSriFacturasProveedores"));
			
		this.jMenuItemDetalleAbrirOrderBySriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySriFacturasProveedores"));
			
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSriFacturasProveedores"));		
		
		
		this.jButtonNuevoGuardarCambiosSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSriFacturasProveedores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSriFacturasProveedores"));
			
		this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSriFacturasProveedores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSriFacturasProveedores"));

		this.jCheckBoxSeleccionadosSriFacturasProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSriFacturasProveedores"));
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSriFacturasProveedores"));
		}
		
		
		this.jComboBoxTiposRelacionesSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposRelacionesSriFacturasProveedores"));
			
		this.jComboBoxTiposAccionesSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesSriFacturasProveedores"));
					
		this.jComboBoxTiposSeleccionarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSriFacturasProveedores"));
			
		this.jTextFieldValorCampoGeneralSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSriFacturasProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonidSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idSriFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_empresaSriFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_empresaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_transaccionSriFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionSriFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_transaccionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonidentificacionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"identificacionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombreSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombreSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonrucSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_moduloSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emisionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnumero_facturaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSriFacturasProveedoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"BusquedaSriFacturasProveedoresSriFacturasProveedores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSriFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriFacturasProveedores"));
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriFacturasProveedores"));
				this.jInternalFrameReporteDinamicoSriFacturasProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriFacturasProveedores"));
			}
			
			//this.jButtonCerrarReporteDinamicoSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSriFacturasProveedores"));				
			//this.jButtonGenerarReporteDinamicoSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSriFacturasProveedores"));
			//this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSriFacturasProveedores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSriFacturasProveedores!=null) {
				this.jInternalFrameImportacionSriFacturasProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSriFacturasProveedores"));
				this.jInternalFrameImportacionSriFacturasProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSriFacturasProveedores"));
				this.jInternalFrameImportacionSriFacturasProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSriFacturasProveedores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySriFacturasProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderBySriFacturasProveedores"));
			
			this.jButtonAbrirOrderByToolBarSriFacturasProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSriFacturasProveedores"));			
			
			if(this.jInternalFrameOrderBySriFacturasProveedores!=null) {
				this.jInternalFrameOrderBySriFacturasProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySriFacturasProveedores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSriFacturasProveedores.jTabbedPaneRelacionesSriFacturasProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSriFacturasProveedores"));
		
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
            		closingInternalFrameSriFacturasProveedores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSriFacturasProveedores = (JInternalFrameBase)event.getSource();
	            	
	            SriFacturasProveedoresBeanSwingJInternalFrame jInternalFrameParent=(SriFacturasProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormSriFacturasProveedores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSriFacturasProveedoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSriFacturasProveedores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSriFacturasProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSriFacturasProveedores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSriFacturasProveedores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSriFacturasProveedores";
		inputMap = this.jButtonNuevoSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSriFacturasProveedores";
		inputMap = this.jButtonNuevoRelacionesSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSriFacturasProveedoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSriFacturasProveedores";
		inputMap = this.jButtonModificarSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSriFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSriFacturasProveedores";
		inputMap = this.jButtonActualizarSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSriFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSriFacturasProveedores";
		inputMap = this.jButtonEliminarSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSriFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSriFacturasProveedores";
		inputMap = this.jButtonCancelarSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSriFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSriFacturasProveedores";
		inputMap = this.jButtonCerrarSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSriFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSriFacturasProveedores";
		inputMap = this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonGuardarCambiosSriFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSriFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSriFacturasProveedores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSriFacturasProveedoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSriFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSriFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSriFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSriFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSriFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSriFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonidSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idSriFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_empresaSriFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSriFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_empresaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSriFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_transaccionSriFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionSriFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonid_transaccionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emision_desdeSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emision_hastaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonidentificacionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"identificacionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombreSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombreSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonrucSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_moduloSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_completo_clienteSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnombre_transaccionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtoncodigo_asiento_contableSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asiento_contableSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonfecha_emisionSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtonnumero_facturaSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaSriFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSriFacturasProveedores.jButtoncredito_mone_localSriFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSriFacturasProveedoresBusqueda"));
		
		
		this.jButtonBusquedaSriFacturasProveedoresSriFacturasProveedores.addActionListener(new ButtonActionListener(this,"BusquedaSriFacturasProveedoresSriFacturasProveedores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSriFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSriFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSriFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSriFacturasProveedores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSriFacturasProveedores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
					srifacturasproveedoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoress) {
					srifacturasproveedoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSriFacturasProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
						srifacturasproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoress) {
						srifacturasproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoress) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriFacturasProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriFacturasProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSriFacturasProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSriFacturasProveedores.getSelectedRows();
			
			SriFacturasProveedores srifacturasproveedoresLocal=new SriFacturasProveedores();
			
			//this.seleccionarTodosSriFacturasProveedores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					srifacturasproveedoresLocal =(SriFacturasProveedores) this.srifacturasproveedoresLogic.getSriFacturasProveedoress().toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					srifacturasproveedoresLocal =(SriFacturasProveedores) this.srifacturasproveedoress.toArray()[this.jTableDatosSriFacturasProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				srifacturasproveedoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
						srifacturasproveedoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoress) {
						srifacturasproveedoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSriFacturasProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSriFacturasProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSriFacturasProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSriFacturasProveedoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSriFacturasProveedoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSriFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSriFacturasProveedores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
				
						if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							srifacturasproveedoresAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							srifacturasproveedoresAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							srifacturasproveedoresAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							srifacturasproveedoresAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_RUC)) {
							existe=true;
							srifacturasproveedoresAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							srifacturasproveedoresAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							srifacturasproveedoresAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							srifacturasproveedoresAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							srifacturasproveedoresAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							srifacturasproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							srifacturasproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							srifacturasproveedoresAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoress) {
					
						if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							srifacturasproveedoresAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							srifacturasproveedoresAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							srifacturasproveedoresAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							srifacturasproveedoresAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_RUC)) {
							existe=true;
							srifacturasproveedoresAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							srifacturasproveedoresAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							srifacturasproveedoresAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							srifacturasproveedoresAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
							existe=true;
							srifacturasproveedoresAux.setcodigo_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							srifacturasproveedoresAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							srifacturasproveedoresAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							srifacturasproveedoresAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSriFacturasProveedoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSriFacturasProveedores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSriFacturasProveedores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSriFacturasProveedores) {				
					conSplash=true;//false;										
					
					//this.startProcessSriFacturasProveedores(conSplash);
				
					this.generarReporteSriFacturasProveedoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSriFacturasProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriFacturasProveedoressSeleccionados(false);
				//this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSriFacturasProveedoressSeleccionados(true);
				//this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriFacturasProveedores();
				
				this.exportarSriFacturasProveedoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSriFacturasProveedoress();
				//this.importarSriFacturasProveedoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSriFacturasProveedores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSriFacturasProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sri Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSriFacturasProveedores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSriFacturasProveedores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySriFacturasProveedores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
				}	
			} 			
			else if(SriFacturasProveedoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSriFacturasProveedores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSriFacturasProveedores(conSplash);
					
						//this.actualizarParametrosGeneralSriFacturasProveedores();
						
						this.generarReporteProcesoAccionSriFacturasProveedoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SriFacturasProveedoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sri Facturas ProveedoresES SELECCIONADOS?", "MANTENIMIENTO DE Sri Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSriFacturasProveedores();
				
						this.actualizarParametrosGeneralSriFacturasProveedores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.srifacturasproveedoresReturnGeneral=srifacturasproveedoresLogic.procesarAccionSriFacturasProveedoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.srifacturasproveedoresLogic.getSriFacturasProveedoress(),this.srifacturasproveedoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSriFacturasProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSriFacturasProveedores();
					
					SriFacturasProveedoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSriFacturasProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSriFacturasProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxTiposAccionesFormularioSriFacturasProveedores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSriFacturasProveedores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSriFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSriFacturasProveedores();
			
			if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
			SriFacturasProveedores srifacturasproveedores=new SriFacturasProveedores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSriFacturasProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSriFacturasProveedores.getSelectedItem();
			
			
			
			
			srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(srifacturasproveedoressSeleccionados.size()==1) {
				for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressSeleccionados) {
					srifacturasproveedores=srifacturasproveedoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSriFacturasProveedores();
			
      		//this.finishProcessSriFacturasProveedores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSriFacturasProveedoresReturnGeneral() throws Exception {
		if(this.srifacturasproveedoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.srifacturasproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.srifacturasproveedoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.srifacturasproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.srifacturasproveedoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.srifacturasproveedoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSriFacturasProveedores(false);
		}
		
		if(this.srifacturasproveedoresReturnGeneral.getConRetornoLista() || this.srifacturasproveedoresReturnGeneral.getConRetornoObjeto()) {
			if(this.srifacturasproveedoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.srifacturasproveedoresLogic.setSriFacturasProveedoress(this.srifacturasproveedoresReturnGeneral.getSriFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingSriFacturasProveedores(false);
		}
	}
	
	public void actualizarParametrosGeneralSriFacturasProveedores() throws Exception {
		
		
	}
	
	public ArrayList<SriFacturasProveedores> getSriFacturasProveedoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSriFacturasProveedores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoresLogic.getSriFacturasProveedoress()) {
					if(srifacturasproveedoresAux.getIsSelected()) {
						srifacturasproveedoressSeleccionados.add(srifacturasproveedoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SriFacturasProveedores srifacturasproveedoresAux:this.srifacturasproveedoress) {
					if(srifacturasproveedoresAux.getIsSelected()) {
						srifacturasproveedoressSeleccionados.add(srifacturasproveedoresAux);				
					}
				}
			}
			
			if(srifacturasproveedoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						srifacturasproveedoressSeleccionados.addAll(this.srifacturasproveedoresLogic.getSriFacturasProveedoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						srifacturasproveedoressSeleccionados.addAll(this.srifacturasproveedoress);				
					}
				}
			}
		} else {
			srifacturasproveedoressSeleccionados.add(this.srifacturasproveedores);
		}
		
		return srifacturasproveedoressSeleccionados;
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
	
	public void generarReporteSriFacturasProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSriFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSriFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriFacturasProveedoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSriFacturasProveedoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sri Facturas Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSriFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados);
		
	}	
	
	public void generarReporteNormalSriFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSriFacturasProveedoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSriFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSriFacturasProveedores();
		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSriFacturasProveedores();
		
		
		//this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados ,srifacturasproveedoresImplementable,srifacturasproveedoresImplementableHome);
	}
	
	public void mostrarImportacionSriFacturasProveedoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSriFacturasProveedores();
		
		this.abrirFrameImportacionSriFacturasProveedores();		
		
			
		//this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados ,srifacturasproveedoresImplementable,srifacturasproveedoresImplementableHome);
	}
	
	public void importarSriFacturasProveedoress() throws Exception {		
	
	}
	
	public void exportarSriFacturasProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSriFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSriFacturasProveedoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSriFacturasProveedoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sri Facturas Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSriFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSriFacturasProveedores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSriFacturasProveedores(srifacturasproveedoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//srifacturasproveedoresAux.setsDetalleGeneralEntityReporte(srifacturasproveedoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSriFacturasProveedores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=srifacturasproveedores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getnombre_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getcodigo_asiento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=srifacturasproveedores.getcredito_mone_local().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSriFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SriFacturasProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSriFacturasProveedores(row);				
				iRow++;
			}				
			
			for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSriFacturasProveedores(srifacturasproveedoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSriFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();		
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"srifacturasproveedores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("srifacturasproveedoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("srifacturasproveedores");
			//elementRoot.appendChild(element);
		
			for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressSeleccionados) {
				element = document.createElement("srifacturasproveedores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSriFacturasProveedores(srifacturasproveedoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sri Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSriFacturasProveedores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SriFacturasProveedoresConstantesFunciones.LABEL_CREDITOMONELOCAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getnombre_modulo());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getcodigo_asiento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(srifacturasproveedores.getcredito_mone_local());				
	}
	
	public void setFilaDatosExportarXmlSriFacturasProveedores(SriFacturasProveedores srifacturasproveedores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SriFacturasProveedoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(srifacturasproveedores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SriFacturasProveedoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(srifacturasproveedores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SriFacturasProveedoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(srifacturasproveedores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtransaccion_descripcion = document.createElement(SriFacturasProveedoresConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(srifacturasproveedores.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementfecha_emision_desde = document.createElement(SriFacturasProveedoresConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(srifacturasproveedores.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(SriFacturasProveedoresConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(srifacturasproveedores.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementidentificacion = document.createElement(SriFacturasProveedoresConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(srifacturasproveedores.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementnombre = document.createElement(SriFacturasProveedoresConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(srifacturasproveedores.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementruc = document.createElement(SriFacturasProveedoresConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(srifacturasproveedores.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre_modulo = document.createElement(SriFacturasProveedoresConstantesFunciones.NOMBREMODULO);
		elementnombre_modulo.appendChild(document.createTextNode(srifacturasproveedores.getnombre_modulo().trim()));
		element.appendChild(elementnombre_modulo);

		Element elementnombre_completo_cliente = document.createElement(SriFacturasProveedoresConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(srifacturasproveedores.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_transaccion = document.createElement(SriFacturasProveedoresConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(srifacturasproveedores.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementcodigo_asiento_contable = document.createElement(SriFacturasProveedoresConstantesFunciones.CODIGOASIENTOCONTABLE);
		elementcodigo_asiento_contable.appendChild(document.createTextNode(srifacturasproveedores.getcodigo_asiento_contable().trim()));
		element.appendChild(elementcodigo_asiento_contable);

		Element elementfecha_emision = document.createElement(SriFacturasProveedoresConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(srifacturasproveedores.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_factura = document.createElement(SriFacturasProveedoresConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(srifacturasproveedores.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementcredito_mone_local = document.createElement(SriFacturasProveedoresConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(srifacturasproveedores.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);
	}
	
	public void generarReporteGroupGenericoSriFacturasProveedoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados=new ArrayList<SriFacturasProveedores>();
		
		srifacturasproveedoressSeleccionados=this.getSriFacturasProveedoressSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSriFacturasProveedores(srifacturasproveedoressSeleccionados);
		
		this.generarReporteSriFacturasProveedoress("Todos",srifacturasproveedoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSriFacturasProveedores(ArrayList<SriFacturasProveedores> srifacturasproveedoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SriFacturasProveedores srifacturasproveedoresAux:srifacturasproveedoressSeleccionados) {
				srifacturasproveedoresAux.setsDetalleGeneralEntityReporte(srifacturasproveedoresAux.toString());
			
				if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(srifacturasproveedoresAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(srifacturasproveedoresAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_RUC)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBREMODULO)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getnombre_modulo());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getcodigo_asiento_contable());
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(srifacturasproveedoresAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(SriFacturasProveedoresConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					srifacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(srifacturasproveedoresAux.getnumero_factura());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SriFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSriFacturasProveedores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSriFacturasProveedores=true;
				this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=true;
				this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=true;
			}
			
			this.isVisibilidadCeldaModificarSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
			this.isVisibilidadCeldaModificarSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
			this.isVisibilidadCeldaModificarSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=true;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
			this.isVisibilidadCeldaModificarSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=true;
			this.isVisibilidadCeldaModificarSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
			this.isVisibilidadCeldaModificarSriFacturasProveedores=true;
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarSriFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SriFacturasProveedoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=true;
		} else {
			this.actualizarEstadoPanelsSriFacturasProveedores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSriFacturasProveedores=false;
			//this.isVisibilidadCeldaVerFormSriFacturasProveedores=false;
			this.isVisibilidadCeldaDuplicarSriFacturasProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
		} else {
			this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!srifacturasproveedoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;												
			}
			
			this.jButtonCerrarSriFacturasProveedores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
		}
		
		if(!this.permiteMantenimiento(this.srifacturasproveedores)) {
			this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoSriFacturasProveedores=false;
		this.isVisibilidadCeldaNuevoRelacionesSriFacturasProveedores=false;
		this.isVisibilidadCeldaGuardarCambiosSriFacturasProveedores=false;
		//this.isVisibilidadCeldaModificarSriFacturasProveedores=true;
		this.isVisibilidadCeldaActualizarSriFacturasProveedores=false;
		this.isVisibilidadCeldaEliminarSriFacturasProveedores=false;
		//this.isVisibilidadCeldaCancelarSriFacturasProveedores=true;			
		this.isVisibilidadCeldaGuardarSriFacturasProveedores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSriFacturasProveedores() {
	}
	
	public void actualizarEstadoPanelsSriFacturasProveedores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSriFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionSriFacturasProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSriFacturasProveedores!=null) {
				this.jScrollPanelDatosSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionSriFacturasProveedores!=null) {
				this.jPanelPaginacionSriFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
					this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.srifacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSriFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSriFacturasProveedores!=null) {
				this.jPanelParametrosReportesSriFacturasProveedores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaSriFacturasProveedores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaSriFacturasProveedores) {this.jTabbedPaneBusquedasSriFacturasProveedores.remove(jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaSriFacturasProveedores=isParaTransaccion;
			if(!this.isVisibilidadBusquedaSriFacturasProveedores) {this.jTabbedPaneBusquedasSriFacturasProveedores.remove(jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);}
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
			
			this.inicializarActualizarBindingTablaSriFacturasProveedores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSriFacturasProveedores() {
		this.updateBorderResaltarBusquedasFormularioSriFacturasProveedores();
		this.updateVisibilidadBusquedasFormularioSriFacturasProveedores();
		this.updateHabilitarBusquedasFormularioSriFacturasProveedores();
	}
	
	public void updateBorderResaltarBusquedasFormularioSriFacturasProveedores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSriFacturasProveedores.getComponents().length>0) {
	

		if(this.srifacturasproveedoresConstantesFunciones.resaltarBusquedaSriFacturasProveedoresSriFacturasProveedores!=null) {
			index= this.jTabbedPaneBusquedasSriFacturasProveedores.indexOfComponent(this.jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriFacturasProveedores.getComponent(index);
				jPanel.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarBusquedaSriFacturasProveedoresSriFacturasProveedores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSriFacturasProveedores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSriFacturasProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriFacturasProveedores.indexOfComponent(this.jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSriFacturasProveedores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarBusquedaSriFacturasProveedoresSriFacturasProveedores);
			if(!this.srifacturasproveedoresConstantesFunciones.mostrarBusquedaSriFacturasProveedoresSriFacturasProveedores && index>-1) {
				this.jTabbedPaneBusquedasSriFacturasProveedores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSriFacturasProveedores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSriFacturasProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSriFacturasProveedores.indexOfComponent(this.jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSriFacturasProveedores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarBusquedaSriFacturasProveedoresSriFacturasProveedores);
				this.jTabbedPaneBusquedasSriFacturasProveedores.setEnabledAt(index,this.srifacturasproveedoresConstantesFunciones.activarBusquedaSriFacturasProveedoresSriFacturasProveedores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSriFacturasProveedores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaSriFacturasProveedores")) {
			index= this.jTabbedPaneBusquedasSriFacturasProveedores.indexOfComponent(this.jPanelBusquedaSriFacturasProveedoresSriFacturasProveedores);

			this.jTabbedPaneBusquedasSriFacturasProveedores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSriFacturasProveedores.getComponent(index);

			this.srifacturasproveedoresConstantesFunciones.setResaltarBusquedaSriFacturasProveedoresSriFacturasProveedores(resaltar);

			jPanel.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarBusquedaSriFacturasProveedoresSriFacturasProveedores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSriFacturasProveedores.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSriFacturasProveedores() throws Exception {

		if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSriFacturasProveedores();
		this.updateVisibilidadResaltarControlesFormularioSriFacturasProveedores();
		this.updateHabilitarResaltarControlesFormularioSriFacturasProveedores();
		
	}
	
	public void updateBorderResaltarControlesFormularioSriFacturasProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.srifacturasproveedoresConstantesFunciones.resaltaridSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltaridSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarid_empresaSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarid_empresaSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarid_transaccionSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarid_transaccionSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emision_desdeSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_desdeSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emision_desdeSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emision_hastaSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_hastaSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emision_hastaSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltaridentificacionSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltaridentificacionSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarnombreSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarnombreSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarrucSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarrucSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_moduloSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_moduloSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_completo_clienteSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_completo_clienteSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_transaccionSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarnombre_transaccionSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarcodigo_asiento_contableSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarcodigo_asiento_contableSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emisionSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarfecha_emisionSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarnumero_facturaSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarnumero_facturaSriFacturasProveedores);}
		if(this.srifacturasproveedoresConstantesFunciones.resaltarcredito_mone_localSriFacturasProveedores!=null && this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setBorder(this.srifacturasproveedoresConstantesFunciones.resaltarcredito_mone_localSriFacturasProveedores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSriFacturasProveedores() throws Exception {		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
	
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostraridSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelidSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostraridSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarid_empresaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelid_empresaSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarid_empresaSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarid_transaccionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelid_transaccionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarid_transaccionSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_desdeSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emision_desdeSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelfecha_emision_desdeSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emision_desdeSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_hastaSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emision_hastaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelfecha_emision_hastaSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emision_hastaSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostraridentificacionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelidentificacionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostraridentificacionSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombreSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelnombreSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombreSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarrucSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelrucSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarrucSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_moduloSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelnombre_moduloSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_moduloSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_completo_clienteSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelnombre_completo_clienteSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_completo_clienteSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_transaccionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelnombre_transaccionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnombre_transaccionSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarcodigo_asiento_contableSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelcodigo_asiento_contableSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarcodigo_asiento_contableSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emisionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelfecha_emisionSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarfecha_emisionSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnumero_facturaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelnumero_facturaSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarnumero_facturaSriFacturasProveedores);
		//this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarcredito_mone_localSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jPanelcredito_mone_localSriFacturasProveedores.setVisible(this.srifacturasproveedoresConstantesFunciones.mostrarcredito_mone_localSriFacturasProveedores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSriFacturasProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormSriFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSriFacturasProveedores!=null) {
	
		this.jInternalFrameDetalleFormSriFacturasProveedores.jLabelidSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activaridSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_empresaSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarid_empresaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jComboBoxid_transaccionSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarid_transaccionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_desdeSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarfecha_emision_desdeSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emision_hastaSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarfecha_emision_hastaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldidentificacionSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activaridentificacionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombreSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarnombreSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldrucSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarrucSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_moduloSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarnombre_moduloSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_completo_clienteSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarnombre_completo_clienteSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextAreanombre_transaccionSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarnombre_transaccionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcodigo_asiento_contableSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarcodigo_asiento_contableSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jDateChooserfecha_emisionSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarfecha_emisionSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldnumero_facturaSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarnumero_facturaSriFacturasProveedores);
		this.jInternalFrameDetalleFormSriFacturasProveedores.jTextFieldcredito_mone_localSriFacturasProveedores.setEnabled(this.srifacturasproveedoresConstantesFunciones.activarcredito_mone_localSriFacturasProveedores);
		}
	}
	
		
}