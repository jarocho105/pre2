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

//import com.bydan.erp.cartera.util.DetalleFacturasProveedoresConstantesFunciones;
import com.bydan.erp.cartera.util.report.DetalleFacturasProveedoresParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.DetalleFacturasProveedoresParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.DetalleFacturasProveedoresBean;
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
public class DetalleFacturasProveedoresBeanSwingJInternalFrame extends DetalleFacturasProveedoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleFacturasProveedoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleFacturasProveedores> detallefacturasproveedoresValidator = new ClassValidator<DetalleFacturasProveedores>(DetalleFacturasProveedores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleFacturasProveedores detallefacturasproveedores;	
	public DetalleFacturasProveedores detallefacturasproveedoresAux;
	public DetalleFacturasProveedores detallefacturasproveedoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleFacturasProveedores detallefacturasproveedoresTotales;
	public Long idDetalleFacturasProveedoresActual;
	public Long iIdNuevoDetalleFacturasProveedores=0L;
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
	
	public Boolean isPermisoTodoDetalleFacturasProveedores;
	public Boolean isPermisoNuevoDetalleFacturasProveedores;
	public Boolean isPermisoActualizarDetalleFacturasProveedores;
	public Boolean isPermisoActualizarOriginalDetalleFacturasProveedores;
	public Boolean isPermisoEliminarDetalleFacturasProveedores;
	public Boolean isPermisoGuardarCambiosDetalleFacturasProveedores;
	public Boolean isPermisoConsultaDetalleFacturasProveedores;
	public Boolean isPermisoBusquedaDetalleFacturasProveedores;
	public Boolean isPermisoReporteDetalleFacturasProveedores;
	public Boolean isPermisoPaginacionMedioDetalleFacturasProveedores;
	public Boolean isPermisoPaginacionAltoDetalleFacturasProveedores;
	public Boolean isPermisoPaginacionTodoDetalleFacturasProveedores;
	public Boolean isPermisoCopiarDetalleFacturasProveedores;
	public Boolean isPermisoVerFormDetalleFacturasProveedores;
	public Boolean isPermisoDuplicarDetalleFacturasProveedores;
	public Boolean isPermisoOrdenDetalleFacturasProveedores;
	
	
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
	
	public DetalleFacturasProveedoresParameterReturnGeneral detallefacturasproveedoresReturnGeneral;
	public DetalleFacturasProveedoresParameterReturnGeneral detallefacturasproveedoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleFacturasProveedores=false;
	public Boolean esParaAccionDesdeFormularioDetalleFacturasProveedores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleFacturasProveedoresSessionBeanAdditional detallefacturasproveedoresSessionBeanAdditional=null;
	
	public DetalleFacturasProveedoresSessionBeanAdditional getDetalleFacturasProveedoresSessionBeanAdditional() {
		return this.detallefacturasproveedoresSessionBeanAdditional;
	}
	
	public void setDetalleFacturasProveedoresSessionBeanAdditional(DetalleFacturasProveedoresSessionBeanAdditional detallefacturasproveedoresSessionBeanAdditional) {
		try {
			this.detallefacturasproveedoresSessionBeanAdditional=detallefacturasproveedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional detallefacturasproveedoresBeanSwingJInternalFrameAdditional=null;
	//public class DetalleFacturasProveedoresBeanSwingJInternalFrame
	
	public DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional getDetalleFacturasProveedoresBeanSwingJInternalFrameAdditional() {
		return this.detallefacturasproveedoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleFacturasProveedoresBeanSwingJInternalFrameAdditional(DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional detallefacturasproveedoresBeanSwingJInternalFrameAdditional) {
		try {
			this.detallefacturasproveedoresBeanSwingJInternalFrameAdditional=detallefacturasproveedoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleFacturasProveedoresLogic detallefacturasproveedoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleFacturasProveedores detallefacturasproveedoresBean;
	public DetalleFacturasProveedoresConstantesFunciones detallefacturasproveedoresConstantesFunciones;
	//public DetalleFacturasProveedoresParameterReturnGeneral detallefacturasproveedoresReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleFacturasProveedores> detallefacturasproveedoress;	
	//public List<DetalleFacturasProveedores> detallefacturasproveedoressEliminados;
	//public List<DetalleFacturasProveedores> detallefacturasproveedoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleFacturasProveedores=true;
	public Boolean isVisibilidadCeldaCopiarDetalleFacturasProveedores=true;
	public Boolean isVisibilidadCeldaVerFormDetalleFacturasProveedores=true;
	public Boolean isVisibilidadCeldaOrdenDetalleFacturasProveedores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
	public Boolean isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
	public Boolean isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
	public Boolean isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
	public Boolean isVisibilidadCeldaCancelarDetalleFacturasProveedores=false;
	public Boolean isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;	
	
	
	public Boolean isVisibilidadBusquedaDetalleFacturasProveedores=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoDetalleFacturasProveedores() {
		return this.iIdNuevoDetalleFacturasProveedores;
	}

	public void setiIdNuevoDetalleFacturasProveedores(Long iIdNuevoDetalleFacturasProveedores) {
		this.iIdNuevoDetalleFacturasProveedores = iIdNuevoDetalleFacturasProveedores;
	}
	
	public Long getidDetalleFacturasProveedoresActual() {
		return this.idDetalleFacturasProveedoresActual;
	}

	public void setidDetalleFacturasProveedoresActual(Long idDetalleFacturasProveedoresActual) {
		this.idDetalleFacturasProveedoresActual = idDetalleFacturasProveedoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleFacturasProveedores getdetallefacturasproveedores() {
		return this.detallefacturasproveedores;
	}

	public void setdetallefacturasproveedores(DetalleFacturasProveedores detallefacturasproveedores) {
		this.detallefacturasproveedores = detallefacturasproveedores;
	}
	
	public DetalleFacturasProveedores getdetallefacturasproveedoresAux() {
		return this.detallefacturasproveedoresAux;
	}

	public void setdetallefacturasproveedoresAux(DetalleFacturasProveedores detallefacturasproveedoresAux) {
		this.detallefacturasproveedoresAux = detallefacturasproveedoresAux;
	}				
	
	public DetalleFacturasProveedores getdetallefacturasproveedoresAnterior() {
		return this.detallefacturasproveedoresAnterior;
	}

	public void setdetallefacturasproveedoresAnterior(DetalleFacturasProveedores detallefacturasproveedoresAnterior) {
		this.detallefacturasproveedoresAnterior = detallefacturasproveedoresAnterior;
	}	
	
	public DetalleFacturasProveedores getdetallefacturasproveedoresTotales() {
		return this.detallefacturasproveedoresTotales;
	}

	public void setdetallefacturasproveedoresTotales(DetalleFacturasProveedores detallefacturasproveedoresTotales) {
		this.detallefacturasproveedoresTotales = detallefacturasproveedoresTotales;
	}	
	
	public DetalleFacturasProveedores getdetallefacturasproveedoresBean() {
		return this.detallefacturasproveedoresBean;
	}

	public void setdetallefacturasproveedoresBean(DetalleFacturasProveedores detallefacturasproveedoresBean) {
		this.detallefacturasproveedoresBean = detallefacturasproveedoresBean;
	}	
	
	public DetalleFacturasProveedoresParameterReturnGeneral getdetallefacturasproveedoresReturnGeneral() {
		return this.detallefacturasproveedoresReturnGeneral;
	}

	public void setdetallefacturasproveedoresReturnGeneral(DetalleFacturasProveedoresParameterReturnGeneral detallefacturasproveedoresReturnGeneral) {
		this.detallefacturasproveedoresReturnGeneral = detallefacturasproveedoresReturnGeneral;
	}	
	
	
	public Long idBusquedaDetalleFacturasProveedores=0L;

	public Long getidBusquedaDetalleFacturasProveedores() {
		return this.idBusquedaDetalleFacturasProveedores;
	}

	public void setidBusquedaDetalleFacturasProveedores(Long idBusquedaDetalleFacturasProveedores) {
		this.idBusquedaDetalleFacturasProveedores = idBusquedaDetalleFacturasProveedores;
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
	
	
	public DetalleFacturasProveedoresLogic getDetalleFacturasProveedoresLogic()	{		
		return detallefacturasproveedoresLogic;
	}

	public void setDetalleFacturasProveedoresLogic(DetalleFacturasProveedoresLogic detallefacturasproveedoresLogic) {
		this.detallefacturasproveedoresLogic = detallefacturasproveedoresLogic;
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
	
	public Boolean getIsEsNuevoDetalleFacturasProveedores() {
		return isEsNuevoDetalleFacturasProveedores;
	}

	public void setIsEsNuevoDetalleFacturasProveedores(Boolean isEsNuevoDetalleFacturasProveedores) {
		this.isEsNuevoDetalleFacturasProveedores = isEsNuevoDetalleFacturasProveedores;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleFacturasProveedores() {
		return esParaAccionDesdeFormularioDetalleFacturasProveedores;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleFacturasProveedores(Boolean esParaAccionDesdeFormularioDetalleFacturasProveedores) {
		this.esParaAccionDesdeFormularioDetalleFacturasProveedores = esParaAccionDesdeFormularioDetalleFacturasProveedores;
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

			if(this.detallefacturasproveedoresSessionBean==null) {
				this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean();
			}

			if(!this.detallefacturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallefacturasproveedoresSessionBean.getlidEmpresaActual());
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

					if(this.detallefacturasproveedores!=null) {
						this.detallefacturasproveedores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
						this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleFacturasProveedores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
						if(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleFacturasProveedoresGenerico)throws Exception
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
				jComboBoxid_empresaDetalleFacturasProveedoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleFacturasProveedoresGenerico!=null && jComboBoxid_empresaDetalleFacturasProveedoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleFacturasProveedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleFacturasProveedores detallefacturasproveedores,JComboBox jComboBoxid_empresaDetalleFacturasProveedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleFacturasProveedoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleFacturasProveedoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallefacturasproveedores.setid_empresa(empresaAux.getId());
				detallefacturasproveedores.setempresa_descripcion(DetalleFacturasProveedoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallefacturasproveedores.setEmpresa(empresaAux);			}
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

					if(!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { 
							this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { 
					}

					if(!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
							this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDetalleFacturasProveedores() throws Exception {
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
		
	public DetalleFacturasProveedoresParameterReturnGeneral getDetalleFacturasProveedoresParameterGeneral() {
		return this.detallefacturasproveedoresParameterGeneral;
	}
	
	public void setDetalleFacturasProveedoresParameterGeneral(DetalleFacturasProveedoresParameterReturnGeneral detallefacturasproveedoresParameterGeneral) {
		this.detallefacturasproveedoresParameterGeneral = detallefacturasproveedoresParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleFacturasProveedores() {
		return isPermisoTodoDetalleFacturasProveedores;
	}

	public void setIsPermisoTodoDetalleFacturasProveedores(Boolean isPermisoTodoDetalleFacturasProveedores) {
		this.isPermisoTodoDetalleFacturasProveedores = isPermisoTodoDetalleFacturasProveedores;
	}

	public Boolean getIsPermisoNuevoDetalleFacturasProveedores() {
		return isPermisoNuevoDetalleFacturasProveedores;
	}

	public void setIsPermisoNuevoDetalleFacturasProveedores(Boolean isPermisoNuevoDetalleFacturasProveedores) {
		this.isPermisoNuevoDetalleFacturasProveedores = isPermisoNuevoDetalleFacturasProveedores;
	}

	public Boolean getIsPermisoActualizarDetalleFacturasProveedores() {
		return isPermisoActualizarDetalleFacturasProveedores;
	}

	public void setIsPermisoActualizarDetalleFacturasProveedores(Boolean isPermisoActualizarDetalleFacturasProveedores) {
		this.isPermisoActualizarDetalleFacturasProveedores = isPermisoActualizarDetalleFacturasProveedores;
	}

	public Boolean getIsPermisoEliminarDetalleFacturasProveedores() {
		return isPermisoEliminarDetalleFacturasProveedores;
	}

	public void setIsPermisoEliminarDetalleFacturasProveedores(Boolean isPermisoEliminarDetalleFacturasProveedores) {
		this.isPermisoEliminarDetalleFacturasProveedores = isPermisoEliminarDetalleFacturasProveedores;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleFacturasProveedores() {
		return isPermisoGuardarCambiosDetalleFacturasProveedores;
	}

	public void setIsPermisoGuardarCambiosDetalleFacturasProveedores(Boolean isPermisoGuardarCambiosDetalleFacturasProveedores) {
		this.isPermisoGuardarCambiosDetalleFacturasProveedores = isPermisoGuardarCambiosDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoConsultaDetalleFacturasProveedores() {
		return isPermisoConsultaDetalleFacturasProveedores;
	}

	public void setIsPermisoConsultaDetalleFacturasProveedores(Boolean isPermisoConsultaDetalleFacturasProveedores) {
		this.isPermisoConsultaDetalleFacturasProveedores = isPermisoConsultaDetalleFacturasProveedores;
	}

	public Boolean getIsPermisoBusquedaDetalleFacturasProveedores() {
		return isPermisoBusquedaDetalleFacturasProveedores;
	}

	public void setIsPermisoBusquedaDetalleFacturasProveedores(Boolean isPermisoBusquedaDetalleFacturasProveedores) {
		this.isPermisoBusquedaDetalleFacturasProveedores = isPermisoBusquedaDetalleFacturasProveedores;
	}

	public Boolean getIsPermisoReporteDetalleFacturasProveedores() {
		return isPermisoReporteDetalleFacturasProveedores;
	}

	public void setIsPermisoReporteDetalleFacturasProveedores(Boolean isPermisoReporteDetalleFacturasProveedores) {
		this.isPermisoReporteDetalleFacturasProveedores = isPermisoReporteDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleFacturasProveedores() {
		return isPermisoPaginacionMedioDetalleFacturasProveedores;
	}

	public void setIsPermisoPaginacionMedioDetalleFacturasProveedores(Boolean isPermisoPaginacionMedioDetalleFacturasProveedores) {
		this.isPermisoPaginacionMedioDetalleFacturasProveedores = isPermisoPaginacionMedioDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleFacturasProveedores() {
		return isPermisoPaginacionTodoDetalleFacturasProveedores;
	}

	public void setIsPermisoPaginacionTodoDetalleFacturasProveedores(Boolean isPermisoPaginacionTodoDetalleFacturasProveedores) {
		this.isPermisoPaginacionTodoDetalleFacturasProveedores = isPermisoPaginacionTodoDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleFacturasProveedores() {
		return isPermisoPaginacionAltoDetalleFacturasProveedores;
	}

	public void setIsPermisoPaginacionAltoDetalleFacturasProveedores(Boolean isPermisoPaginacionAltoDetalleFacturasProveedores) {
		this.isPermisoPaginacionAltoDetalleFacturasProveedores = isPermisoPaginacionAltoDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoCopiarDetalleFacturasProveedores() {
		return isPermisoCopiarDetalleFacturasProveedores;
	}

	public void setIsPermisoCopiarDetalleFacturasProveedores(Boolean isPermisoCopiarDetalleFacturasProveedores) {
		this.isPermisoCopiarDetalleFacturasProveedores = isPermisoCopiarDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoVerFormDetalleFacturasProveedores() {
		return isPermisoVerFormDetalleFacturasProveedores;
	}

	public void setIsPermisoVerFormDetalleFacturasProveedores(Boolean isPermisoVerFormDetalleFacturasProveedores) {
		this.isPermisoVerFormDetalleFacturasProveedores = isPermisoVerFormDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoDuplicarDetalleFacturasProveedores() {
		return isPermisoDuplicarDetalleFacturasProveedores;
	}

	public void setIsPermisoDuplicarDetalleFacturasProveedores(Boolean isPermisoDuplicarDetalleFacturasProveedores) {
		this.isPermisoDuplicarDetalleFacturasProveedores = isPermisoDuplicarDetalleFacturasProveedores;
	}
	
	public Boolean getIsPermisoOrdenDetalleFacturasProveedores() {
		return isPermisoOrdenDetalleFacturasProveedores;
	}

	public void setIsPermisoOrdenDetalleFacturasProveedores(Boolean isPermisoOrdenDetalleFacturasProveedores) {
		this.isPermisoOrdenDetalleFacturasProveedores = isPermisoOrdenDetalleFacturasProveedores;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleFacturasProveedores() {
		return isVisibilidadCeldaNuevoDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaNuevoDetalleFacturasProveedores(Boolean isVisibilidadCeldaNuevoDetalleFacturasProveedores) {
		this.isVisibilidadCeldaNuevoDetalleFacturasProveedores = isVisibilidadCeldaNuevoDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleFacturasProveedores() {
		return isVisibilidadCeldaDuplicarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleFacturasProveedores(Boolean isVisibilidadCeldaDuplicarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores = isVisibilidadCeldaDuplicarDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleFacturasProveedores() {
		return isVisibilidadCeldaCopiarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaCopiarDetalleFacturasProveedores(Boolean isVisibilidadCeldaCopiarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaCopiarDetalleFacturasProveedores = isVisibilidadCeldaCopiarDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleFacturasProveedores() {
		return isVisibilidadCeldaVerFormDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaVerFormDetalleFacturasProveedores(Boolean isVisibilidadCeldaVerFormDetalleFacturasProveedores) {
		this.isVisibilidadCeldaVerFormDetalleFacturasProveedores = isVisibilidadCeldaVerFormDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleFacturasProveedores() {
		return isVisibilidadCeldaOrdenDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaOrdenDetalleFacturasProveedores(Boolean isVisibilidadCeldaOrdenDetalleFacturasProveedores) {
		this.isVisibilidadCeldaOrdenDetalleFacturasProveedores = isVisibilidadCeldaOrdenDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores() {
		return isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores(Boolean isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores = isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleFacturasProveedores() {
		return isVisibilidadCeldaModificarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaModificarDetalleFacturasProveedores(Boolean isVisibilidadCeldaModificarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaModificarDetalleFacturasProveedores = isVisibilidadCeldaModificarDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleFacturasProveedores() {
		return isVisibilidadCeldaActualizarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaActualizarDetalleFacturasProveedores(Boolean isVisibilidadCeldaActualizarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaActualizarDetalleFacturasProveedores = isVisibilidadCeldaActualizarDetalleFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleFacturasProveedores() {
		return isVisibilidadCeldaEliminarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaEliminarDetalleFacturasProveedores(Boolean isVisibilidadCeldaEliminarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaEliminarDetalleFacturasProveedores = isVisibilidadCeldaEliminarDetalleFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleFacturasProveedores() {
		return isVisibilidadCeldaCancelarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaCancelarDetalleFacturasProveedores(Boolean isVisibilidadCeldaCancelarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaCancelarDetalleFacturasProveedores = isVisibilidadCeldaCancelarDetalleFacturasProveedores;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleFacturasProveedores() {
		return isVisibilidadCeldaGuardarDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaGuardarDetalleFacturasProveedores(Boolean isVisibilidadCeldaGuardarDetalleFacturasProveedores) {
		this.isVisibilidadCeldaGuardarDetalleFacturasProveedores = isVisibilidadCeldaGuardarDetalleFacturasProveedores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores() {
		return isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores(Boolean isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores) {
		this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores = isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores;
	}
		
	public DetalleFacturasProveedoresSessionBean getdetallefacturasproveedoresSessionBean() {
		return this.detallefacturasproveedoresSessionBean;
	}
	
	public void setdetallefacturasproveedoresSessionBean(DetalleFacturasProveedoresSessionBean detallefacturasproveedoresSessionBean) {
		this.detallefacturasproveedoresSessionBean=detallefacturasproveedoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDetalleFacturasProveedores() {
		return this.isVisibilidadBusquedaDetalleFacturasProveedores;
	}

	public void setisVisibilidadBusquedaDetalleFacturasProveedores(Boolean isVisibilidadBusquedaDetalleFacturasProveedores) {
		this.isVisibilidadBusquedaDetalleFacturasProveedores=isVisibilidadBusquedaDetalleFacturasProveedores;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallefacturasproveedores,null);
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
	
	public void bugActualizarReferenciaActual(DetalleFacturasProveedores detallefacturasproveedores,DetalleFacturasProveedores detallefacturasproveedoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleFacturasProveedores(detallefacturasproveedores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallefacturasproveedoresAux.setId(detallefacturasproveedores.getId());
		detallefacturasproveedoresAux.setVersionRow(detallefacturasproveedores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DetalleFacturasProveedores detallefacturasproveedoresLocal) throws Exception {
		
		if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleFacturasProveedores detallefacturasproveedoresLocal) throws Exception {	
		if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallefacturasproveedoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleFacturasProveedoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallefacturasproveedoresValidator.getInvalidValues(this.detallefacturasproveedores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleFacturasProveedores detallefacturasproveedores,List<DetalleFacturasProveedores> detallefacturasproveedoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(DetalleFacturasProveedores detallefacturasproveedores,List<DetalleFacturasProveedores> detallefacturasproveedoress) throws Exception {
		try	{			
			DetalleFacturasProveedoresConstantesFunciones.actualizarSelectedLista(detallefacturasproveedores,detallefacturasproveedoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleFacturasProveedores> detallefacturasproveedoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallefacturasproveedoressLocal=this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallefacturasproveedoressLocal=this.detallefacturasproveedoress;
			}
			//ARCHITECTURE
		
			for(DetalleFacturasProveedores detallefacturasproveedoresLocal:detallefacturasproveedoressLocal) {
				if(this.permiteMantenimiento(detallefacturasproveedoresLocal) && detallefacturasproveedoresLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleFacturasProveedoresConstantesFunciones.getDetalleFacturasProveedoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleFacturasProveedoresConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelnombre_clienteDetalleFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturasProveedoresConstantesFunciones.CANTIDADFACTURAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelcantidad_facturasDetalleFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturasProveedoresConstantesFunciones.TOTALVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabeltotal_valorDetalleFacturasProveedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleFacturasProveedoresConstantesFunciones.MES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelmesDetalleFacturasProveedores,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelnombre_clienteDetalleFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelcantidad_facturasDetalleFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabeltotal_valorDetalleFacturasProveedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelmesDetalleFacturasProveedores,"");
		
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
		this.iIdNuevoDetalleFacturasProveedores--;	
		
		
		this.detallefacturasproveedoresAux=new DetalleFacturasProveedores();
		
		this.detallefacturasproveedoresAux.setId(this.iIdNuevoDetalleFacturasProveedores);
		this.detallefacturasproveedoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().add(this.detallefacturasproveedoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallefacturasproveedoress.add(this.detallefacturasproveedoresAux);
		}
		//ARCHITECTURE
		
		this.detallefacturasproveedores=this.detallefacturasproveedoresAux;
		
		if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedores);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturasProveedores(this.detallefacturasproveedores);
		}
				
		//this.setDefaultControlesDetalleFacturasProveedores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleFacturasProveedores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleFacturasProveedores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleFacturasProveedores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedoresBean,this.detallefacturasproveedores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral,this.detallefacturasproveedoresBean,false);
		
		if(this.detallefacturasproveedoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores());
		}
		
		if(this.detallefacturasproveedoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores(),classes);//this.detallefacturasproveedoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleFacturasProveedores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleFacturasProveedores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.RecargarFormDetalleFacturasProveedores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
						
			if(detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleFacturasProveedores();
			}
			
			this.actualizarVisualTableDatosDetalleFacturasProveedores();
			
			this.jTableDatosDetalleFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturasProveedores(), this.getIndiceNuevoDetalleFacturasProveedores());
			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
						
			this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleFacturasProveedores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setEnabled(isHabilitar && this.detallefacturasproveedoresConstantesFunciones.activarnombre_clienteDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setEnabled(isHabilitar && this.detallefacturasproveedoresConstantesFunciones.activarcantidad_facturasDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setEnabled(isHabilitar && this.detallefacturasproveedoresConstantesFunciones.activartotal_valorDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setEnabled(isHabilitar && this.detallefacturasproveedoresConstantesFunciones.activarmesDetalleFacturasProveedores);	
		//
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setEnabled(isHabilitar && this.detallefacturasproveedoresConstantesFunciones.activarid_empresaDetalleFacturasProveedores);
	};
	
	public void setDefaultControlesDetalleFacturasProveedores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleFacturasProveedores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallefacturasproveedoresSessionBean.setConGuardarRelaciones(true);			
			this.detallefacturasproveedoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.setVisible(true);
			
					
		} else {
			//this.detallefacturasproveedoresSessionBean.setConGuardarRelaciones(false);			
			this.detallefacturasproveedoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleFacturasProveedores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
				if(detallefacturasproveedoresAux.getId().equals(this.iIdNuevoDetalleFacturasProveedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoress) {
				if(detallefacturasproveedoresAux.getId().equals(this.iIdNuevoDetalleFacturasProveedores)) {
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
	
	public int getIndiceActualDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
				if(detallefacturasproveedoresAux.getId().equals(detallefacturasproveedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoress) {
				if(detallefacturasproveedoresAux.getId().equals(detallefacturasproveedores.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
				if(detallefacturasproveedoresAux.getDetalleFacturasProveedoresOriginal().getId().equals(detallefacturasproveedoresOriginal.getId())) {
					existe=true;
					detallefacturasproveedoresOriginal.setId(detallefacturasproveedoresAux.getId());
					detallefacturasproveedoresOriginal.setVersionRow(detallefacturasproveedoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoress) {
				if(detallefacturasproveedoresAux.getDetalleFacturasProveedoresOriginal().getId().equals(detallefacturasproveedoresOriginal.getId())) {
					existe=true;
					detallefacturasproveedoresOriginal.setId(detallefacturasproveedoresAux.getId());
					detallefacturasproveedoresOriginal.setVersionRow(detallefacturasproveedoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleFacturasProveedores(Boolean esParaCancelar) throws Exception {
		detallefacturasproveedoressAux=new ArrayList<DetalleFacturasProveedores>();
		detallefacturasproveedoresAux=new DetalleFacturasProveedores();
		
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
					if(detallefacturasproveedoresAux.getId()<0) {
						detallefacturasproveedoressAux.add(detallefacturasproveedoresAux);
					}		
				}
				this.iIdNuevoDetalleFacturasProveedores=0L;
				this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().removeAll(detallefacturasproveedoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoress) {
					if(detallefacturasproveedoresAux.getId()<0) {
						detallefacturasproveedoressAux.add(detallefacturasproveedoresAux);
					}		
				}
				this.iIdNuevoDetalleFacturasProveedores=0L;
				this.detallefacturasproveedoress.removeAll(detallefacturasproveedoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleFacturasProveedores 
					&& this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size()>0
					) {
					detallefacturasproveedoresAux=this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().get(this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size() - 1);
				
					if(detallefacturasproveedoresAux.getId()<0) {
						this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().remove(detallefacturasproveedoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleFacturasProveedores && this.detallefacturasproveedoress.size()>0) {
					detallefacturasproveedoresAux=this.detallefacturasproveedoress.get(this.detallefacturasproveedoress.size() - 1);
				
					if(detallefacturasproveedoresAux.getId()<0) {
						this.detallefacturasproveedoress.remove(detallefacturasproveedoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleFacturasProveedores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallefacturasproveedores.getId()<0) {
				this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().remove(this.detallefacturasproveedores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallefacturasproveedores.getId()<0) {
				this.detallefacturasproveedoress.remove(this.detallefacturasproveedores);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleFacturasProveedores(List<DetalleFacturasProveedores> detallefacturasproveedoressAux) throws Exception {
		DetalleFacturasProveedoresConstantesFunciones.setEstadosInicialesDetalleFacturasProveedores(detallefacturasproveedoressAux);
	}
	
	public void setEstadosInicialesDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedoresAux) throws Exception {
		DetalleFacturasProveedoresConstantesFunciones.setEstadosInicialesDetalleFacturasProveedores(detallefacturasproveedoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleFacturasProveedoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleFacturasProveedoresActual()) {
				if(!this.isEsNuevoDetalleFacturasProveedores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleFacturasProveedores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleFacturasProveedoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Facturas Proveedores ?", "MANTENIMIENTO DE Detalle Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleFacturasProveedores detallefacturasproveedores) throws Exception {
		DetalleFacturasProveedoresConstantesFunciones.seleccionarAsignar(this.detallefacturasproveedores,detallefacturasproveedores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleFacturasProveedores=this.isPermisoActualizarOriginalDetalleFacturasProveedores;
			
			
			this.seleccionarAsignar(detallefacturasproveedores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallefacturasproveedoresSessionBean.setsFuncionBusquedaRapida(this.detallefacturasproveedoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleFacturasProveedores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleFacturasProveedores(esParaCancelar);				
				this.cancelarNuevoDetalleFacturasProveedores(esParaCancelar);								
			}
			
			this.detallefacturasproveedores=new DetalleFacturasProveedores();
			
			this.inicializarDetalleFacturasProveedores();
			
			this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleFacturasProveedores() throws Exception {
		try {
			DetalleFacturasProveedoresConstantesFunciones.inicializarDetalleFacturasProveedores(this.detallefacturasproveedores);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleFacturasProveedoress(String sAccionBusqueda,List<DetalleFacturasProveedores> detallefacturasproveedoressParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleFacturasProveedores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleFacturasProveedoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleFacturasProveedoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleFacturasProveedores"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Facturas Proveedoreses");		
		parameters.put("busquedapor", DetalleFacturasProveedoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleFacturasProveedores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleFacturasProveedoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleFacturasProveedores=new JRBeanArrayDataSource(DetalleFacturasProveedoresJInternalFrame.TraerDetalleFacturasProveedoresBeans(detallefacturasproveedoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleFacturasProveedores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleFacturasProveedoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleFacturasProveedoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleFacturasProveedoresBean.TraerDetalleFacturasProveedoresBeans(detallefacturasproveedoressParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,detallefacturasproveedoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,detallefacturasproveedoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedoresActionPerformed(null);
					//this.generarExcelReporteDetalleFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,detallefacturasproveedoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,detallefacturasproveedoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,detallefacturasproveedoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleFacturasProveedoress(sAccionBusqueda,sTipoArchivoReporte,detallefacturasproveedoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleFacturasProveedores> detallefacturasproveedoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleFacturasProveedoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleFacturasProveedores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleFacturasProveedores detallefacturasproveedores : detallefacturasproveedoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleFacturasProveedoresConstantesFunciones.generarExcelReporteDataDetalleFacturasProveedores("NORMAL",row,workbook,detallefacturasproveedores,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleFacturasProveedores(String sTipo,Row row,Workbook workbook) {
		
		DetalleFacturasProveedoresConstantesFunciones.generarExcelReporteHeaderDetalleFacturasProveedores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleFacturasProveedores> detallefacturasproveedoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleFacturasProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleFacturasProveedores detallefacturasproveedores : detallefacturasproveedoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.getDetalleFacturasProveedoresDescripcion(detallefacturasproveedores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturasproveedores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturasproveedores.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturasproveedores.getcantidad_facturas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturasproveedores.gettotal_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallefacturasproveedores.getmes());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleFacturasProveedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleFacturasProveedores> detallefacturasproveedoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleFacturasProveedores> detallefacturasproveedoressRespaldo=null;
		
		classes=DetalleFacturasProveedoresConstantesFunciones.getClassesRelationshipsOfDetalleFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallefacturasproveedoresLogic.setDatosCliente(this.datosCliente);
		this.detallefacturasproveedoresLogic.setDatosDeep(this.datosDeep);
		this.detallefacturasproveedoresLogic.setIsConDeep(true);
		
		detallefacturasproveedoressRespaldo=this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress();
		
		this.detallefacturasproveedoresLogic.setDetalleFacturasProveedoress(detallefacturasproveedoressParaReportes);	
		this.detallefacturasproveedoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallefacturasproveedoressParaReportes=this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress();
		this.detallefacturasproveedoresLogic.setDetalleFacturasProveedoress(detallefacturasproveedoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleFacturasProveedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleFacturasProveedores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleFacturasProveedores detallefacturasproveedores : detallefacturasproveedoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleFacturasProveedores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleFacturasProveedoresConstantesFunciones.generarExcelReporteDataDetalleFacturasProveedores("NORMAL",row,workbook,detallefacturasproveedores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.getDetalleFacturasProveedoresDescripcion(detallefacturasproveedores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleFacturasProveedores() throws Exception {		
		this.startProcessDetalleFacturasProveedores(true);
	}
	
	public void startProcessDetalleFacturasProveedores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleFacturasProveedores ,this.jPanelParametrosReportesDetalleFacturasProveedores, this.jScrollPanelDatosDetalleFacturasProveedores,this.jPanelPaginacionDetalleFacturasProveedores, this.jScrollPanelDatosEdicionDetalleFacturasProveedores, this.jPanelAccionesDetalleFacturasProveedores,this.jPanelAccionesFormularioDetalleFacturasProveedores,this.jmenuBarDetalleFacturasProveedores,this.jmenuBarDetalleDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,this.jTtoolBarDetalleDetalleFacturasProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleFacturasProveedores=this.jTabbedPaneBusquedasDetalleFacturasProveedores; 
		
		final JPanel jPanelParametrosReportesDetalleFacturasProveedores=this.jPanelParametrosReportesDetalleFacturasProveedores;
		//final JScrollPane jScrollPanelDatosDetalleFacturasProveedores=this.jScrollPanelDatosDetalleFacturasProveedores;
		final JTable jTableDatosDetalleFacturasProveedores=this.jTableDatosDetalleFacturasProveedores;		
		final JPanel jPanelPaginacionDetalleFacturasProveedores=this.jPanelPaginacionDetalleFacturasProveedores;
		//final JScrollPane jScrollPanelDatosEdicionDetalleFacturasProveedores=this.jScrollPanelDatosEdicionDetalleFacturasProveedores;
		final JPanel jPanelAccionesDetalleFacturasProveedores=this.jPanelAccionesDetalleFacturasProveedores;
		
		JPanel jPanelCamposAuxiliarDetalleFacturasProveedores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleFacturasProveedores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			jPanelCamposAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelCamposDetalleFacturasProveedores;
			jPanelAccionesFormularioAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelAccionesFormularioDetalleFacturasProveedores;
		}
		
		final JPanel jPanelCamposDetalleFacturasProveedores=jPanelCamposAuxiliarDetalleFacturasProveedores;
		final JPanel jPanelAccionesFormularioDetalleFacturasProveedores=jPanelAccionesFormularioAuxiliarDetalleFacturasProveedores;
		
		
		final JMenuBar jmenuBarDetalleFacturasProveedores=this.jmenuBarDetalleFacturasProveedores;
		final JToolBar jTtoolBarDetalleFacturasProveedores=this.jTtoolBarDetalleFacturasProveedores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleFacturasProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleFacturasProveedores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			jmenuBarDetalleAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jmenuBarDetalleDetalleFacturasProveedores;
			jTtoolBarDetalleAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTtoolBarDetalleDetalleFacturasProveedores;
		}
		
		final JMenuBar jmenuBarDetalleDetalleFacturasProveedores=jmenuBarDetalleAuxiliarDetalleFacturasProveedores;
		final JToolBar jTtoolBarDetalleDetalleFacturasProveedores=jTtoolBarDetalleAuxiliarDetalleFacturasProveedores;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleFacturasProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleFacturasProveedores;
			processRunnable.jTableDatos=jTableDatosDetalleFacturasProveedores;
			processRunnable.jPanelCampos=jPanelCamposDetalleFacturasProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleFacturasProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleFacturasProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleFacturasProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleFacturasProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleFacturasProveedores;
			processRunnable.jTtoolBar=jTtoolBarDetalleFacturasProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleFacturasProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleFacturasProveedores ,jPanelParametrosReportesDetalleFacturasProveedores,jTableDatosDetalleFacturasProveedores, /*jScrollPanelDatosDetalleFacturasProveedores,*/jPanelCamposDetalleFacturasProveedores,jPanelPaginacionDetalleFacturasProveedores, /*jScrollPanelDatosEdicionDetalleFacturasProveedores,*/ jPanelAccionesDetalleFacturasProveedores,jPanelAccionesFormularioDetalleFacturasProveedores,jmenuBarDetalleFacturasProveedores,jmenuBarDetalleDetalleFacturasProveedores,jTtoolBarDetalleFacturasProveedores,jTtoolBarDetalleDetalleFacturasProveedores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleFacturasProveedores ,jPanelParametrosReportesDetalleFacturasProveedores, jScrollPanelDatosDetalleFacturasProveedores,jPanelPaginacionDetalleFacturasProveedores, jScrollPanelDatosEdicionDetalleFacturasProveedores, jPanelAccionesDetalleFacturasProveedores,jPanelAccionesFormularioDetalleFacturasProveedores,jmenuBarDetalleFacturasProveedores,jmenuBarDetalleDetalleFacturasProveedores,jTtoolBarDetalleFacturasProveedores,jTtoolBarDetalleDetalleFacturasProveedores);
						
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
	
	public void finishProcessDetalleFacturasProveedores() {// throws Exception 
		this.finishProcessDetalleFacturasProveedores(true);
	}
	
	public void finishProcessDetalleFacturasProveedores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleFacturasProveedores ,this.jPanelParametrosReportesDetalleFacturasProveedores, this.jScrollPanelDatosDetalleFacturasProveedores,this.jPanelPaginacionDetalleFacturasProveedores, this.jScrollPanelDatosEdicionDetalleFacturasProveedores, this.jPanelAccionesDetalleFacturasProveedores,this.jPanelAccionesFormularioDetalleFacturasProveedores,this.jmenuBarDetalleFacturasProveedores,this.jmenuBarDetalleDetalleFacturasProveedores,this.jTtoolBarDetalleFacturasProveedores,this.jTtoolBarDetalleDetalleFacturasProveedores);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleFacturasProveedores=this.jTabbedPaneBusquedasDetalleFacturasProveedores; 
		
		final JPanel jPanelParametrosReportesDetalleFacturasProveedores=this.jPanelParametrosReportesDetalleFacturasProveedores;
		//final JScrollPane jScrollPanelDatosDetalleFacturasProveedores=this.jScrollPanelDatosDetalleFacturasProveedores;
		final JTable jTableDatosDetalleFacturasProveedores=this.jTableDatosDetalleFacturasProveedores;		
		final JPanel jPanelPaginacionDetalleFacturasProveedores=this.jPanelPaginacionDetalleFacturasProveedores;
		//final JScrollPane jScrollPanelDatosEdicionDetalleFacturasProveedores=this.jScrollPanelDatosEdicionDetalleFacturasProveedores;
		final JPanel jPanelAccionesDetalleFacturasProveedores=this.jPanelAccionesDetalleFacturasProveedores;
		
		JPanel jPanelCamposAuxiliarDetalleFacturasProveedores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleFacturasProveedores=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			jPanelCamposAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelCamposDetalleFacturasProveedores;
			jPanelAccionesFormularioAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelAccionesFormularioDetalleFacturasProveedores;
		}
		
		final JPanel jPanelCamposDetalleFacturasProveedores=jPanelCamposAuxiliarDetalleFacturasProveedores;
		final JPanel jPanelAccionesFormularioDetalleFacturasProveedores=jPanelAccionesFormularioAuxiliarDetalleFacturasProveedores;
		
		
		final JMenuBar jmenuBarDetalleFacturasProveedores=this.jmenuBarDetalleFacturasProveedores;		
		final JToolBar jTtoolBarDetalleFacturasProveedores=this.jTtoolBarDetalleFacturasProveedores;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleFacturasProveedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleFacturasProveedores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			jmenuBarDetalleAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jmenuBarDetalleDetalleFacturasProveedores;
			jTtoolBarDetalleAuxiliarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTtoolBarDetalleDetalleFacturasProveedores;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleFacturasProveedores=jmenuBarDetalleAuxiliarDetalleFacturasProveedores;
		final JToolBar jTtoolBarDetalleDetalleFacturasProveedores=jTtoolBarDetalleAuxiliarDetalleFacturasProveedores;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleFacturasProveedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleFacturasProveedores;
			processRunnable.jTableDatos=jTableDatosDetalleFacturasProveedores;
			processRunnable.jPanelCampos=jPanelCamposDetalleFacturasProveedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleFacturasProveedores;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleFacturasProveedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleFacturasProveedores;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleFacturasProveedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleFacturasProveedores;
			processRunnable.jTtoolBar=jTtoolBarDetalleFacturasProveedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleFacturasProveedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleFacturasProveedores ,jPanelParametrosReportesDetalleFacturasProveedores, jTableDatosDetalleFacturasProveedores,/*jScrollPanelDatosDetalleFacturasProveedores,*/jPanelCamposDetalleFacturasProveedores,jPanelPaginacionDetalleFacturasProveedores, /*jScrollPanelDatosEdicionDetalleFacturasProveedores,*/ jPanelAccionesDetalleFacturasProveedores,jPanelAccionesFormularioDetalleFacturasProveedores,jmenuBarDetalleFacturasProveedores,jmenuBarDetalleDetalleFacturasProveedores,jTtoolBarDetalleFacturasProveedores,jTtoolBarDetalleDetalleFacturasProveedores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleFacturasProveedores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleFacturasProveedores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFacturasProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleFacturasProveedores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleFacturasProveedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFacturasProveedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleFacturasProveedores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallefacturasproveedoresConstantesFunciones.getsFinalQueryDetalleFacturasProveedores();
		String  finalQueryPaginacionTodos=this.detallefacturasproveedoresConstantesFunciones.getsFinalQueryDetalleFacturasProveedores();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleFacturasProveedoresConstantesFunciones.getArrayColumnasGlobalesNoDetalleFacturasProveedores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleFacturasProveedoresConstantesFunciones.getArrayColumnasGlobalesDetalleFacturasProveedores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleFacturasProveedoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallefacturasproveedoressEliminados= new ArrayList<DetalleFacturasProveedores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleFacturasProveedores();
		
				///*DetalleFacturasProveedoresSessionBean*/this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean();
			
			if(this.detallefacturasproveedoresSessionBean==null) {
				this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean();
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
					this.iNumeroPaginacion=DetalleFacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleFacturasProveedoresConstantesFunciones.getClassesForeignKeysOfDetalleFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallefacturasproveedores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallefacturasproveedoressAux= new ArrayList<DetalleFacturasProveedores>();
			
				
			detallefacturasproveedoresLogic.setDatosCliente(this.datosCliente);
			detallefacturasproveedoresLogic.setDatosDeep(this.datosDeep);
			detallefacturasproveedoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDetalleFacturasProveedores")) {
				this.sDetalleReporte=DetalleFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaDetalleFacturasProveedores(idBusquedaDetalleFacturasProveedores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallefacturasproveedoresLogic.getDetalleFacturasProveedoressBusquedaDetalleFacturasProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaDetalleFacturasProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaDetalleFacturasProveedores(idBusquedaDetalleFacturasProveedores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaDetalleFacturasProveedores(idBusquedaDetalleFacturasProveedores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()==null||detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallefacturasproveedoress==null|| detallefacturasproveedoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturasproveedoressAux=new ArrayList<DetalleFacturasProveedores>();
						detallefacturasproveedoressAux.addAll(detallefacturasproveedoresLogic.getDetalleFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturasproveedoressAux=new ArrayList<DetalleFacturasProveedores>();
							detallefacturasproveedoressAux.addAll(detallefacturasproveedoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallefacturasproveedoresLogic.getDetalleFacturasProveedoressBusquedaDetalleFacturasProveedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaDetalleFacturasProveedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaDetalleFacturasProveedores(idBusquedaDetalleFacturasProveedores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleFacturasProveedoresConstantesFunciones.getDetalleIndiceBusquedaDetalleFacturasProveedores(idBusquedaDetalleFacturasProveedores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleFacturasProveedoress("BusquedaDetalleFacturasProveedores",detallefacturasproveedoresLogic.getDetalleFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleFacturasProveedoress("BusquedaDetalleFacturasProveedores",detallefacturasproveedoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturasproveedoresLogic.setDetalleFacturasProveedoress(new ArrayList<DetalleFacturasProveedores>());
						detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().addAll(detallefacturasproveedoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturasproveedoress=new ArrayList<DetalleFacturasProveedores>();
							detallefacturasproveedoress.addAll(detallefacturasproveedoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleFacturasProveedores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleFacturasProveedores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturasproveedoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallefacturasproveedoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleFacturasProveedores detallefacturasproveedores) {
		Boolean permite=true;
		
		if(this.detallefacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleFacturasProveedoresConstantesFunciones.getOrderByListaDetalleFacturasProveedores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleFacturasProveedoresConstantesFunciones.getOrderByListaDetalleFacturasProveedores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
				if(detallefacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturasproveedoresTotales=detallefacturasproveedores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturasProveedores detallefacturasproveedores:this.detallefacturasproveedoress) {
				if(detallefacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturasproveedoresTotales=detallefacturasproveedores;
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
			this.detallefacturasproveedoresAux=new DetalleFacturasProveedores();
			this.detallefacturasproveedoresAux.setsType(Constantes2.S_TOTALES);
			this.detallefacturasproveedoresAux.setIsNew(false);
			this.detallefacturasproveedoresAux.setIsChanged(false);
			this.detallefacturasproveedoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DetalleFacturasProveedoresConstantesFunciones.TotalizarValoresFilaDetalleFacturasProveedores(this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress(),this.detallefacturasproveedoresAux);
				
				//this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().add(this.detallefacturasproveedoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleFacturasProveedoresConstantesFunciones.TotalizarValoresFilaDetalleFacturasProveedores(this.detallefacturasproveedoress,this.detallefacturasproveedoresAux);
				
				this.detallefacturasproveedoress.add(this.detallefacturasproveedoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallefacturasproveedoresTotales=new DetalleFacturasProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().remove(detallefacturasproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallefacturasproveedoress.remove(detallefacturasproveedoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallefacturasproveedoresTotales=new DetalleFacturasProveedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
				if(detallefacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturasproveedoresTotales=detallefacturasproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleFacturasProveedoresConstantesFunciones.TotalizarValoresFilaDetalleFacturasProveedores(this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress(),detallefacturasproveedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleFacturasProveedores detallefacturasproveedores:this.detallefacturasproveedoress) {
				if(detallefacturasproveedores.getsType().equals(Constantes2.S_TOTALES)) {
					detallefacturasproveedoresTotales=detallefacturasproveedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleFacturasProveedoresConstantesFunciones.TotalizarValoresFilaDetalleFacturasProveedores(this.detallefacturasproveedoress,detallefacturasproveedoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleFacturasProveedoressBusquedaDetalleFacturasProveedores()throws Exception {
		try {
			sAccionBusqueda="BusquedaDetalleFacturasProveedores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleFacturasProveedoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleFacturasProveedoressBusquedaDetalleFacturasProveedores(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallefacturasproveedoresLogic.getDetalleFacturasProveedoressBusquedaDetalleFacturasProveedores(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleFacturasProveedoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallefacturasproveedoresLogic.getDetalleFacturasProveedoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosDetalleFacturasProveedores() {
		this.isPermisoTodoDetalleFacturasProveedores=false;
		this.isPermisoNuevoDetalleFacturasProveedores=false;
		this.isPermisoActualizarDetalleFacturasProveedores=false;
		this.isPermisoActualizarOriginalDetalleFacturasProveedores=false;
		this.isPermisoEliminarDetalleFacturasProveedores=false;
		this.isPermisoGuardarCambiosDetalleFacturasProveedores=false;
		this.isPermisoConsultaDetalleFacturasProveedores=true;
		this.isPermisoBusquedaDetalleFacturasProveedores=true;
		this.isPermisoReporteDetalleFacturasProveedores=true;
		this.isPermisoOrdenDetalleFacturasProveedores=false;		
		this.isPermisoPaginacionMedioDetalleFacturasProveedores=false;		
		this.isPermisoPaginacionAltoDetalleFacturasProveedores=false;		
		this.isPermisoPaginacionTodoDetalleFacturasProveedores=false;		
		this.isPermisoCopiarDetalleFacturasProveedores=false;		
		this.isPermisoVerFormDetalleFacturasProveedores=false;		
		this.isPermisoDuplicarDetalleFacturasProveedores=false;
		this.isPermisoOrdenDetalleFacturasProveedores=false;
	}
	
	public void setPermisosUsuarioDetalleFacturasProveedores(Boolean isPermiso) {
		this.isPermisoTodoDetalleFacturasProveedores=isPermiso;
		this.isPermisoNuevoDetalleFacturasProveedores=isPermiso;
		this.isPermisoActualizarDetalleFacturasProveedores=isPermiso;
		this.isPermisoActualizarOriginalDetalleFacturasProveedores=isPermiso;
		this.isPermisoEliminarDetalleFacturasProveedores=isPermiso;
		this.isPermisoGuardarCambiosDetalleFacturasProveedores=isPermiso;
		this.isPermisoConsultaDetalleFacturasProveedores=isPermiso;
		this.isPermisoBusquedaDetalleFacturasProveedores=isPermiso;
		this.isPermisoReporteDetalleFacturasProveedores=isPermiso;
		this.isPermisoOrdenDetalleFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionMedioDetalleFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionAltoDetalleFacturasProveedores=isPermiso;		
		this.isPermisoPaginacionTodoDetalleFacturasProveedores=isPermiso;		
		this.isPermisoCopiarDetalleFacturasProveedores=isPermiso;		
		this.isPermisoVerFormDetalleFacturasProveedores=isPermiso;		
		this.isPermisoDuplicarDetalleFacturasProveedores=isPermiso;
		this.isPermisoOrdenDetalleFacturasProveedores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleFacturasProveedores(Boolean isPermiso) {
		//this.isPermisoTodoDetalleFacturasProveedores=isPermiso;
		this.isPermisoNuevoDetalleFacturasProveedores=isPermiso;
		this.isPermisoActualizarDetalleFacturasProveedores=isPermiso;
		this.isPermisoActualizarOriginalDetalleFacturasProveedores=isPermiso;
		this.isPermisoEliminarDetalleFacturasProveedores=isPermiso;
		this.isPermisoGuardarCambiosDetalleFacturasProveedores=isPermiso;
		//this.isPermisoConsultaDetalleFacturasProveedores=isPermiso;
		//this.isPermisoBusquedaDetalleFacturasProveedores=isPermiso;
		//this.isPermisoReporteDetalleFacturasProveedores=isPermiso;
		//this.isPermisoOrdenDetalleFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleFacturasProveedores=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleFacturasProveedores=isPermiso;		
		//this.isPermisoCopiarDetalleFacturasProveedores=isPermiso;		
		//this.isPermisoDuplicarDetalleFacturasProveedores=isPermiso;
		//this.isPermisoOrdenDetalleFacturasProveedores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleFacturasProveedoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleFacturasProveedores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleFacturasProveedoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleFacturasProveedoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleFacturasProveedoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleFacturasProveedoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleFacturasProveedores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleFacturasProveedoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleFacturasProveedores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleFacturasProveedores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleFacturasProveedores=this.isPermisoActualizarDetalleFacturasProveedores;
			this.isPermisoEliminarDetalleFacturasProveedores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleFacturasProveedores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleFacturasProveedores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleFacturasProveedores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleFacturasProveedores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleFacturasProveedores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleFacturasProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleFacturasProveedores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleFacturasProveedores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleFacturasProveedores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleFacturasProveedores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleFacturasProveedores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleFacturasProveedores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleFacturasProveedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleFacturasProveedores.setToolTipText(this.jTableDatosDetalleFacturasProveedores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleFacturasProveedores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleFacturasProveedores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleFacturasProveedores() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleFacturasProveedoresListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleFacturasProveedoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleFacturasProveedoresJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyDetalleFacturasProveedores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallefacturasproveedoresSessionBean==null) {
				this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean();
			}

			if(!this.detallefacturasproveedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleFacturasProveedores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleFacturasProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleFacturasProveedores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleFacturasProveedores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleFacturasProveedores()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleFacturasProveedores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleFacturasProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleFacturasProveedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleFacturasProveedores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleFacturasProveedores()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleFacturasProveedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleFacturasProveedores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public DetalleFacturasProveedoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleFacturasProveedoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleFacturasProveedoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallefacturasproveedoresSessionBean=new DetalleFacturasProveedoresSessionBean(); 
		this.detallefacturasproveedoresConstantesFunciones=new DetalleFacturasProveedoresConstantesFunciones(); 
		this.detallefacturasproveedoresBean=new DetalleFacturasProveedores();//(this.detallefacturasproveedoresConstantesFunciones); 		
		this.detallefacturasproveedoresReturnGeneral=new DetalleFacturasProveedoresParameterReturnGeneral(); 
		
		this.detallefacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallefacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleFacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleFacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleFacturasProveedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleFacturasProveedores(true);
			
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
			
			this.detallefacturasproveedoresConstantesFunciones=new DetalleFacturasProveedoresConstantesFunciones(); 
			this.detallefacturasproveedoresBean=new DetalleFacturasProveedores();//this.detallefacturasproveedoresConstantesFunciones); 			
			this.detallefacturasproveedoresReturnGeneral=new DetalleFacturasProveedoresParameterReturnGeneral(); 
		
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Facturas Proveedores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallefacturasproveedores=new DetalleFacturasProveedores();
			this.detallefacturasproveedoress = new ArrayList<DetalleFacturasProveedores>();
			this.detallefacturasproveedoressAux = new ArrayList<DetalleFacturasProveedores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic=new DetalleFacturasProveedoresLogic();
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.detallefacturasproveedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallefacturasproveedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleFacturasProveedores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleFacturasProveedores);	
					}
					
					if(this.jInternalFrameImportacionDetalleFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleFacturasProveedores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleFacturasProveedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleFacturasProveedores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleFacturasProveedores);
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.setVisible(false);
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores);
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleFacturasProveedores);
					this.jInternalFrameImportacionDetalleFacturasProveedores.setVisible(false);
					this.jInternalFrameImportacionDetalleFacturasProveedores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleFacturasProveedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleFacturasProveedores);
					this.jInternalFrameOrderByDetalleFacturasProveedores.setVisible(false);
					this.jInternalFrameOrderByDetalleFacturasProveedores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleFacturasProveedoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleFacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallefacturasproveedoresReturnGeneral=new DetalleFacturasProveedoresParameterReturnGeneral();
			
			this.detallefacturasproveedoresParameterGeneral=new DetalleFacturasProveedoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallefacturasproveedoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleFacturasProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleFacturasProveedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaCopiarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaVerFormDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaOrdenDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
			
			
			this.isVisibilidadBusquedaDetalleFacturasProveedores=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleFacturasProveedores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleFacturasProveedores(false);
			
			this.setPermisosUsuarioDetalleFacturasProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() 
				|| (this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado() && this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleFacturasProveedoresClasesRelacionadas();
			}
			
			if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleFacturasProveedoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleFacturasProveedores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleFacturasProveedores();
			}
			
			if(!this.isPermisoBusquedaDetalleFacturasProveedores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleFacturasProveedoresConstantesFunciones.getTiposSeleccionarDetalleFacturasProveedores());
				
				this.tiposColumnasSelect=DetalleFacturasProveedoresConstantesFunciones.getTiposSeleccionarDetalleFacturasProveedores(true);
				
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
			//if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleFacturasProveedores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDetalleFacturasProveedores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDetalleFacturasProveedores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturasProveedores() ;
			
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
				detallefacturasproveedoresImplementable= (DetalleFacturasProveedoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleFacturasProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallefacturasproveedoresImplementableHome= (DetalleFacturasProveedoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleFacturasProveedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallefacturasproveedoress= new ArrayList<DetalleFacturasProveedores>();
			this.detallefacturasproveedoressEliminados= new ArrayList<DetalleFacturasProveedores>();
						
			this.isEsNuevoDetalleFacturasProveedores=false;
			this.esParaAccionDesdeFormularioDetalleFacturasProveedores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleFacturasProveedores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleFacturasProveedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleFacturasProveedoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleFacturasProveedores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleFacturasProveedores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleFacturasProveedores();
			}
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleFacturasProveedores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleFacturasProveedores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleFacturasProveedores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleFacturasProveedores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleFacturasProveedores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleFacturasProveedores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleFacturasProveedores")) {
				iIndex=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleFacturasProveedores();	
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
	
	public void cargarCombosForeignKeyDetalleFacturasProveedores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleFacturasProveedores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleFacturasProveedores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleFacturasProveedoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleFacturasProveedores();
		
		this.cargarCombosFrameForeignKeyDetalleFacturasProveedores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleFacturasProveedores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleFacturasProveedores();
		}
	}
	
	
	
	public void jButtonNuevoDetalleFacturasProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			
			if(jTableDatosDetalleFacturasProveedores.getRowCount()>=1) {
				jTableDatosDetalleFacturasProveedores.removeRowSelectionInterval(0, jTableDatosDetalleFacturasProveedores.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleFacturasProveedores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleFacturasProveedores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleFacturasProveedores(true);			
			//this.detallefacturasproveedores=new DetalleFacturasProveedores();
			//this.detallefacturasproveedores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores() ;
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleFacturasProveedores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallefacturasproveedores);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);				
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleFacturasProveedores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleFacturasProveedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleFacturasProveedores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleFacturasProveedores.getSelectedRows().length;			
			}
			
			detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleFacturasProveedores--;			
				//DetalleFacturasProveedores detallefacturasproveedoresAux= new DetalleFacturasProveedores();			
				//detallefacturasproveedoresAux.setId(this.iIdNuevoDetalleFacturasProveedores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleFacturasProveedores detallefacturasproveedoresOrigen=new DetalleFacturasProveedores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleFacturasProveedores detallefacturasproveedoresOrigen : detallefacturasproveedoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallefacturasproveedoresOrigen =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallefacturasproveedoresOrigen =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleFacturasProveedores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallefacturasproveedores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleFacturasProveedores(detallefacturasproveedoresOrigen,this.detallefacturasproveedores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().add(this.detallefacturasproveedoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedoress.add(this.detallefacturasproveedoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
				
				this.jTableDatosDetalleFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturasProveedores(), this.getIndiceNuevoDetalleFacturasProveedores());
				
				int iLastRow =  this.jTableDatosDetalleFacturasProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleFacturasProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleFacturasProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();									
		
			DetalleFacturasProveedores detallefacturasproveedoresOrigen=new DetalleFacturasProveedores();
			DetalleFacturasProveedores detallefacturasproveedoresDestino=new DetalleFacturasProveedores();
				
			detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleFacturasProveedores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallefacturasproveedoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleFacturasProveedores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturasproveedoresOrigen =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallefacturasproveedoresOrigen =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallefacturasproveedoresDestino =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallefacturasproveedoresDestino =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallefacturasproveedoresOrigen =detallefacturasproveedoressSeleccionados.get(0);
				detallefacturasproveedoresDestino =detallefacturasproveedoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleFacturasProveedores(detallefacturasproveedoresOrigen,detallefacturasproveedoresDestino,true,false);
				
				detallefacturasproveedoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallefacturasproveedoresDestino,detallefacturasproveedoresLogic.getDetalleFacturasProveedoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallefacturasproveedoresDestino,detallefacturasproveedoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
				
				//this.jTableDatosDetalleFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturasProveedores(), this.getIndiceNuevoDetalleFacturasProveedores());
				
				int iLastRow =  this.jTableDatosDetalleFacturasProveedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleFacturasProveedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleFacturasProveedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleFacturasProveedores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(!isVisible);
			this.jPanelPaginacionDetalleFacturasProveedores.setVisible(!isVisible);
			this.jPanelAccionesDetalleFacturasProveedores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleFacturasProveedores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleFacturasProveedores();
			
			this.abrirFrameOrderByDetalleFacturasProveedores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleFacturasProveedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleFacturasProveedores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleFacturasProveedores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleFacturasProveedores.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSize(this.jInternalFrameDetalleFormDetalleFacturasProveedores.iWidthFormulario,this.jInternalFrameDetalleFormDetalleFacturasProveedores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleFacturasProveedores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleFacturasProveedores.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleFacturasProveedores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jContentPaneDetalleDetalleFacturasProveedores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jContentPaneDetalleDetalleFacturasProveedores.getWidth(),DetalleFacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jContentPaneDetalleDetalleFacturasProveedores.getWidth(),DetalleFacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jContentPaneDetalleDetalleFacturasProveedores.getWidth(),DetalleFacturasProveedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleFacturasProveedores.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleFacturasProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleFacturasProveedores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturasProveedores,false,this);
				} else {
					this.jInternalFrameOrderByDetalleFacturasProveedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleFacturasProveedores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleFacturasProveedores);
				this.jInternalFrameOrderByDetalleFacturasProveedores.setVisible(false);
				this.jInternalFrameOrderByDetalleFacturasProveedores.setSelected(false);
				
				this.jInternalFrameOrderByDetalleFacturasProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleFacturasProveedores"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleFacturasProveedores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleFacturasProveedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleFacturasProveedores==null) {
				
				this.jInternalFrameImportacionDetalleFacturasProveedores=new ImportacionJInternalFrame(DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleFacturasProveedores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleFacturasProveedores);
				this.jInternalFrameImportacionDetalleFacturasProveedores.setVisible(false);
				this.jInternalFrameImportacionDetalleFacturasProveedores.setSelected(false);


				this.jInternalFrameImportacionDetalleFacturasProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleFacturasProveedores"));
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleFacturasProveedores"));
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleFacturasProveedores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleFacturasProveedores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores==null) {
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores=new ReporteDinamicoJInternalFrame(DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleFacturasProveedores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores);
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleFacturasProveedores"));
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleFacturasProveedores"));
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleFacturasProveedores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleFacturasProveedores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleFacturasProveedores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleFacturasProveedores);
			
	       	this.jInternalFrameDetalleFormDetalleFacturasProveedores.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleFacturasProveedores.dispose();
			//this.jInternalFrameDetalleFormDetalleFacturasProveedores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleFacturasProveedores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleFacturasProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleFacturasProveedores.setVisible(true);
	        this.jInternalFrameImportacionDetalleFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleFacturasProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleFacturasProveedores.setVisible(true);
	        this.jInternalFrameOrderByDetalleFacturasProveedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleFacturasProveedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleFacturasProveedores.setVisible(false);
	        this.jInternalFrameOrderByDetalleFacturasProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleFacturasProveedores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleFacturasProveedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleFacturasProveedores.setVisible(false);
	        this.jInternalFrameImportacionDetalleFacturasProveedores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleFacturasProveedores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleFacturasProveedores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleFacturasProveedores(true);
			//this.isEsNuevoDetalleFacturasProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false) ;
			
			if(detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleFacturasProveedores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleFacturasProveedoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleFacturasProveedores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleFacturasProveedores(true);
			//this.isEsNuevoDetalleFacturasProveedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallefacturasproveedores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false) ;
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleFacturasProveedores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleFacturasProveedores(false);
			
			//if(!this.isEsNuevoDetalleFacturasProveedores) {								
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				
			}
			
			if(this.permiteMantenimiento(this.detallefacturasproveedores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleFacturasProveedores=true;
					this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
					this.isEsNuevoDetalleFacturasProveedores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleFacturasProveedores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleFacturasProveedores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(false);
				
				this.habilitarDeshabilitarControlesDetalleFacturasProveedores(false);
			
												
				
				if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleFacturasProveedores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,detallefacturasproveedoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleFacturasProveedores(this.detallefacturasproveedores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleFacturasProveedores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallefacturasproveedoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallefacturasproveedores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				this.detallefacturasproveedores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				this.detallefacturasproveedores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallefacturasproveedores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleFacturasProveedoresModel) this.jTableDatosDetalleFacturasProveedores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleFacturasProveedores=true;
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
				this.isEsNuevoDetalleFacturasProveedores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(false);
				
				this.habilitarDeshabilitarControlesDetalleFacturasProveedores(false);
				
				
				
				if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleFacturasProveedores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleFacturasProveedores.getRowCount()>=1) {
				jTableDatosDetalleFacturasProveedores.removeRowSelectionInterval(0, jTableDatosDetalleFacturasProveedores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleFacturasProveedores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(false) ;
			
			this.isEsNuevoDetalleFacturasProveedores=false;
			
			if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleFacturasProveedores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				
				//SI ES MANUAL
				if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleFacturasProveedores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleFacturasProveedores--;			
			//DetalleFacturasProveedores detallefacturasproveedoresAux= new DetalleFacturasProveedores();			
			//detallefacturasproveedoresAux.setId(this.iIdNuevoDetalleFacturasProveedores);
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleFacturasProveedores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
			
			this.detallefacturasproveedores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().add(this.detallefacturasproveedoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallefacturasproveedoress.add(this.detallefacturasproveedoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			
			this.jTableDatosDetalleFacturasProveedores.setRowSelectionInterval(this.getIndiceNuevoDetalleFacturasProveedores(), this.getIndiceNuevoDetalleFacturasProveedores());
			
			int iLastRow =  this.jTableDatosDetalleFacturasProveedores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleFacturasProveedores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleFacturasProveedores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
			
			//SI ES MANUAL
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleFacturasProveedores();
			}
			
			//this.abrirFrameTreeDetalleFacturasProveedores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleFacturasProveedores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleFacturasProveedores.setFileImportacion(this.jInternalFrameImportacionDetalleFacturasProveedores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleFacturasProveedores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleFacturasProveedores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		

		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleFacturasProveedoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleFacturasProveedoresBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadFacturas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadFacturas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadFacturas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadFacturas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_MES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_s_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_s_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_s_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_s_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS:
					sNombreCampoCategoria="cantidad_facturas";
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR:
					sNombreCampoCategoria="total_valor";
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_MES:
					sNombreCampoCategoria="mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS:
					sNombreCampoCategoriaValor="cantidad_facturas";
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR:
					sNombreCampoCategoriaValor="total_valor";
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_MES:
					sNombreCampoCategoriaValor="mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Facturas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_facturas");
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_valor");
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_MES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleFacturasProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturasproveedores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturasproveedores.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS);
					iRow++;

					for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturasproveedores.getcantidad_facturas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR);
					iRow++;

					for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturasproveedores.gettotal_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleFacturasProveedoresConstantesFunciones.LABEL_MES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES);
					iRow++;

					for(DetalleFacturasProveedores detallefacturasproveedores:detallefacturasproveedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallefacturasproveedores.getmes());
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
			//	this.getFilaCabeceraExportarExcelDetalleFacturasProveedores(row);				
			//	iRow++;
			//}				
			
			//for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleFacturasProveedores(detallefacturasproveedoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
			
			//SI ES MANUAL
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleFacturasProveedores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
			
			//SI ES MANUAL
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleFacturasProveedores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
			
			//SI ES MANUAL
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleFacturasProveedores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleFacturasProveedores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleFacturasProveedores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleFacturasProveedores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleFacturasProveedores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleFacturasProveedores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleFacturasProveedores.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleFacturasProveedores.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleFacturasProveedores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleFacturasProveedores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleFacturasProveedores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleFacturasProveedores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleFacturasProveedores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleFacturasProveedores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturasProveedores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleFacturasProveedores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleFacturasProveedores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleFacturasProveedores();
		
		this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleFacturasProveedores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturasProveedores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleFacturasProveedores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleFacturasProveedores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleFacturasProveedores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jCheckBoxPostAccionNuevoDetalleFacturasProveedores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleFacturasProveedores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleFacturasProveedores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.jCheckBoxPostAccionNuevoDetalleFacturasProveedores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.jCheckBoxPostAccionSinCerrarDetalleFacturasProveedores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.jCheckBoxPostAccionSinMensajeDetalleFacturasProveedores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleFacturasProveedores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleFacturasProveedores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleFacturasProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleFacturasProveedores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleFacturasProveedores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleFacturasProveedores(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleFacturasProveedores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleFacturasProveedores() throws Exception {
		try	{
			if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleFacturasProveedores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleFacturasProveedores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleFacturasProveedores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleFacturasProveedores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleFacturasProveedores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleFacturasProveedores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleFacturasProveedores.addItem(reporte);
			}
			
			
			if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleFacturasProveedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleFacturasProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleFacturasProveedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleFacturasProveedores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleFacturasProveedores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleFacturasProveedoresConstantesFunciones.getTiposSeleccionarDetalleFacturasProveedores(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleFacturasProveedoresConstantesFunciones.getTiposSeleccionarDetalleFacturasProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleFacturasProveedoresConstantesFunciones.getTiposSeleccionarDetalleFacturasProveedores(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleFacturasProveedores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaDetalleFacturasProveedores=Long.parseLong(this.jLabelidDetalleFacturasProveedoresBusquedaDetalleFacturasProveedores.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleFacturasProveedores(Boolean esInicializar) throws Exception {				
		if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleFacturasProveedores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleFacturasProveedores() throws Exception {
		this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleFacturasProveedores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleFacturasProveedoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleFacturasProveedores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallefacturasproveedoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleFacturasProveedores.setModel(new DetalleFacturasProveedoresModel(this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleFacturasProveedores.setModel(new DetalleFacturasProveedoresModel(this.detallefacturasproveedoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleFacturasProveedores!=null && this.jInternalFrameOrderByDetalleFacturasProveedores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleFacturasProveedores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,detallefacturasproveedoresConstantesFunciones.resaltarSeleccionarDetalleFacturasProveedores,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleFacturasProveedoresConstantesFunciones.SCLASSWEBTITULO,detallefacturasproveedoresConstantesFunciones.resaltarSeleccionarDetalleFacturasProveedores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,DetalleFacturasProveedoresConstantesFunciones.LABEL_ID));

		if(this.detallefacturasproveedoresConstantesFunciones.mostraridDetalleFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturasProveedoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltaridDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activaridDetalleFacturasProveedores,iSizeTabla,this,true,"idDetalleFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltaridDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activaridDetalleFacturasProveedores,this,true,"idDetalleFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.detallefacturasproveedoresConstantesFunciones.mostrarnombre_clienteDetalleFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltarnombre_clienteDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activarnombre_clienteDetalleFacturasProveedores,iSizeTabla,this,true,"nombre_clienteDetalleFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltarnombre_clienteDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activarnombre_clienteDetalleFacturasProveedores,this,true,"nombre_clienteDetalleFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS));

		if(this.detallefacturasproveedoresConstantesFunciones.mostrarcantidad_facturasDetalleFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltarcantidad_facturasDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activarcantidad_facturasDetalleFacturasProveedores,iSizeTabla,this,true,"cantidad_facturasDetalleFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltarcantidad_facturasDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activarcantidad_facturasDetalleFacturasProveedores,this,true,"cantidad_facturasDetalleFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR));

		if(this.detallefacturasproveedoresConstantesFunciones.mostrartotal_valorDetalleFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltartotal_valorDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activartotal_valorDetalleFacturasProveedores,iSizeTabla,this,true,"total_valorDetalleFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltartotal_valorDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activartotal_valorDetalleFacturasProveedores,this,true,"total_valorDetalleFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,DetalleFacturasProveedoresConstantesFunciones.LABEL_MES));

		if(this.detallefacturasproveedoresConstantesFunciones.mostrarmesDetalleFacturasProveedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleFacturasProveedoresConstantesFunciones.LABEL_MES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltarmesDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activarmesDetalleFacturasProveedores,iSizeTabla,this,true,"mesDetalleFacturasProveedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallefacturasproveedoresConstantesFunciones.resaltarmesDetalleFacturasProveedores,this.detallefacturasproveedoresConstantesFunciones.activarmesDetalleFacturasProveedores,this,true,"mesDetalleFacturasProveedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleFacturasProveedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleFacturasProveedores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleFacturasProveedores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleFacturasProveedores.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleFacturasProveedores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleFacturasProveedores.moveColumn(this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleFacturasProveedores.moveColumn(this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleFacturasProveedores.moveColumn(this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleFacturasProveedores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleFacturasProveedores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleFacturasProveedores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleFacturasProveedores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleFacturasProveedores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleFacturasProveedores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallefacturasproveedoress.size()-1;
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
		//this.jTableDatosDetalleFacturasProveedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleFacturasProveedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleFacturasProveedores();
			
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
				
				//this.isEsNuevoDetalleFacturasProveedores=false;
					
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
				if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleFacturasProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleFacturasProveedores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallefacturasproveedores.getsType().equals("DUPLICADO")
				   || this.detallefacturasproveedores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleFacturasProveedores=true;
				
				} else {
					this.isEsNuevoDetalleFacturasProveedores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					if(this.detallefacturasproveedores.getId()>=0 && !this.detallefacturasproveedores.getIsNew()) {						
						this.isEsNuevoDetalleFacturasProveedores=false;
						
					} else {
						this.isEsNuevoDetalleFacturasProveedores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleFacturasProveedores(esRelaciones);						
				
				this.seleccionarDetalleFacturasProveedores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallefacturasproveedores.getId()<0) {
					this.isEsNuevoDetalleFacturasProveedores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleFacturasProveedores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleFacturasProveedores(evt,rowIndex);
				}	
				
				if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleFacturasProveedores: " + this.dDif); 
					}
				}								
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleFacturasProveedores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallefacturasproveedores)) {
					if(this.detallefacturasproveedores.getId()>0) {
						this.detallefacturasproveedores.setIsDeleted(true);
						
						this.detallefacturasproveedoressEliminados.add(this.detallefacturasproveedores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().remove(this.detallefacturasproveedores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedoress.remove(this.detallefacturasproveedores);				
					}
					
					
					((DetalleFacturasProveedoresModel) this.jTableDatosDetalleFacturasProveedores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleFacturasProveedores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleFacturasProveedores) {
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleFacturasProveedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleFacturasProveedores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedores);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleFacturasProveedores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleFacturasProveedores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleFacturasProveedores(detallefacturasproveedores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleFacturasProveedores(detallefacturasproveedores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleFacturasProveedores(detallefacturasproveedores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturasProveedores(detallefacturasproveedores);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setText(detallefacturasproveedores.getId().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setText(detallefacturasproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setText(detallefacturasproveedores.getcantidad_facturas().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setText(detallefacturasproveedores.gettotal_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setText(detallefacturasproveedores.getmes().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleFacturasProveedores detallefacturasproveedoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallefacturasproveedoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleFacturasProveedores detallefacturasproveedoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallefacturasproveedoresLocal=this.detallefacturasproveedores;
			} else {
				detallefacturasproveedoresLocal=this.detallefacturasproveedoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallefacturasproveedoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleFacturasProveedores(detallefacturasproveedoresLocal,true);
					
					if(detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallefacturasproveedoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallefacturasproveedoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(detallefacturasproveedores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(detallefacturasproveedores);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(detallefacturasproveedores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.getText()==null || this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.getText()=="" || this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setText("0");
			}

			if(conColumnasBase) {detallefacturasproveedores.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturasProveedoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelIdDetalleFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturasproveedores.setnombre_cliente(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelnombre_clienteDetalleFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturasproveedores.setcantidad_facturas(Integer.parseInt(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelcantidad_facturasDetalleFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturasproveedores.settotal_valor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabeltotal_valorDetalleFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallefacturasproveedores.setmes(Integer.parseInt(this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleFacturasProveedoresConstantesFunciones.LABEL_MES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelmesDetalleFacturasProveedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedoresBean,DetalleFacturasProveedores detallefacturasproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedoresOrigen,DetalleFacturasProveedores detallefacturasproveedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallefacturasproveedoresOrigen.getId()!=null && !detallefacturasproveedoresOrigen.getId().equals(0L))) {detallefacturasproveedores.setId(detallefacturasproveedoresOrigen.getId());}}
			if(conDefault || (!conDefault && detallefacturasproveedoresOrigen.getnombre_cliente()!=null && !detallefacturasproveedoresOrigen.getnombre_cliente().equals(""))) {detallefacturasproveedores.setnombre_cliente(detallefacturasproveedoresOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && detallefacturasproveedoresOrigen.getcantidad_facturas()!=null && !detallefacturasproveedoresOrigen.getcantidad_facturas().equals(0))) {detallefacturasproveedores.setcantidad_facturas(detallefacturasproveedoresOrigen.getcantidad_facturas());}
			if(conDefault || (!conDefault && detallefacturasproveedoresOrigen.gettotal_valor()!=null && !detallefacturasproveedoresOrigen.gettotal_valor().equals(0.0))) {detallefacturasproveedores.settotal_valor(detallefacturasproveedoresOrigen.gettotal_valor());}
			if(conDefault || (!conDefault && detallefacturasproveedoresOrigen.getmes()!=null && !detallefacturasproveedoresOrigen.getmes().equals(0))) {detallefacturasproveedores.setmes(detallefacturasproveedoresOrigen.getmes());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setText(detallefacturasproveedores.getId().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setText(detallefacturasproveedores.getnombre_cliente());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setText(detallefacturasproveedores.getcantidad_facturas().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setText(detallefacturasproveedores.gettotal_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setText(detallefacturasproveedores.getmes().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleFacturasProveedores(DetalleFacturasProveedoresBean detallefacturasproveedoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setText(detallefacturasproveedoresBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setText(detallefacturasproveedoresBean.getnombre_cliente());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setText(detallefacturasproveedoresBean.getcantidad_facturas().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setText(detallefacturasproveedoresBean.gettotal_valor().toString());
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setText(detallefacturasproveedoresBean.getmes().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleFacturasProveedores(DetalleFacturasProveedoresParameterReturnGeneral detallefacturasproveedoresReturnGeneral,DetalleFacturasProveedoresBean detallefacturasproveedoresBean,Boolean conDefault) throws Exception { 
		try {
			DetalleFacturasProveedores detallefacturasproveedoresLocal=new DetalleFacturasProveedores();
			
			detallefacturasproveedoresLocal=detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallefacturasproveedoresLocal.getId()!=null && !detallefacturasproveedoresLocal.getId().equals(0L))) {detallefacturasproveedoresBean.setId(detallefacturasproveedoresLocal.getId());}}
			if(conDefault || (!conDefault && detallefacturasproveedoresLocal.getnombre_cliente()!=null && !detallefacturasproveedoresLocal.getnombre_cliente().equals(""))) {detallefacturasproveedoresBean.setnombre_cliente(detallefacturasproveedoresLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && detallefacturasproveedoresLocal.getcantidad_facturas()!=null && !detallefacturasproveedoresLocal.getcantidad_facturas().equals(0))) {detallefacturasproveedoresBean.setcantidad_facturas(detallefacturasproveedoresLocal.getcantidad_facturas());}
			if(conDefault || (!conDefault && detallefacturasproveedoresLocal.gettotal_valor()!=null && !detallefacturasproveedoresLocal.gettotal_valor().equals(0.0))) {detallefacturasproveedoresBean.settotal_valor(detallefacturasproveedoresLocal.gettotal_valor());}
			if(conDefault || (!conDefault && detallefacturasproveedoresLocal.getmes()!=null && !detallefacturasproveedoresLocal.getmes().equals(0))) {detallefacturasproveedoresBean.setmes(detallefacturasproveedoresLocal.getmes());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleFacturasProveedoresGenerico(Long idDetalleFacturasProveedoresSeleccionado,JComboBox jComboBoxDetalleFacturasProveedores,List<DetalleFacturasProveedores> detallefacturasproveedoressLocal)throws Exception {
		try {
			DetalleFacturasProveedores  detallefacturasproveedoresTemp=null;

			for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressLocal) {
				if(detallefacturasproveedoresAux.getId()!=null && detallefacturasproveedoresAux.getId().equals(idDetalleFacturasProveedoresSeleccionado)) {
					detallefacturasproveedoresTemp=detallefacturasproveedoresAux;
					break;
				}
			}

			jComboBoxDetalleFacturasProveedores.setSelectedItem(detallefacturasproveedoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleFacturasProveedoresGenerico(JComboBox jComboBoxDetalleFacturasProveedores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleFacturasProveedores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleFacturasProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleFacturasProveedores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleFacturasProveedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleFacturasProveedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleFacturasProveedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallefacturasproveedores=(DetalleFacturasProveedores) detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallefacturasproveedores =(DetalleFacturasProveedores) detallefacturasproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallefacturasproveedores.getIsNew() && !detallefacturasproveedores.getIsChanged() && !detallefacturasproveedores.getIsDeleted()) {
				sDescripcion=detallefacturasproveedores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallefacturasproveedores.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleFacturasProveedores detallefacturasproveedoresRow=new DetalleFacturasProveedores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallefacturasproveedoresRow=(DetalleFacturasProveedores) detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallefacturasproveedoresRow=(DetalleFacturasProveedores) detallefacturasproveedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores));			
			this.jButtonDuplicarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores && this.isPermisoDuplicarDetalleFacturasProveedores));			
			this.jButtonCopiarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarDetalleFacturasProveedores && this.isPermisoCopiarDetalleFacturasProveedores));
			this.jButtonVerFormDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormDetalleFacturasProveedores && this.isPermisoVerFormDetalleFacturasProveedores));
			
			this.jButtonAbrirOrderByDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturasProveedores && this.isPermisoOrdenDetalleFacturasProveedores));			
			
			this.jButtonNuevoRelacionesDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores));			
			this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarDetalleFacturasProveedores && this.isPermisoActualizarDetalleFacturasProveedores));	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarDetalleFacturasProveedores && this.isPermisoActualizarDetalleFacturasProveedores));	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarDetalleFacturasProveedores && this.isPermisoEliminarDetalleFacturasProveedores));
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarDetalleFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturasProveedores);							
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores));						
			this.jButtonDuplicarToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores && this.isPermisoDuplicarDetalleFacturasProveedores));						
			this.jButtonCopiarToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarDetalleFacturasProveedores && this.isPermisoCopiarDetalleFacturasProveedores));			
			this.jButtonVerFormToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormDetalleFacturasProveedores && this.isPermisoVerFormDetalleFacturasProveedores));			
			this.jButtonAbrirOrderByToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturasProveedores && this.isPermisoOrdenDetalleFacturasProveedores));
			this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));			
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarDetalleFacturasProveedores && this.isPermisoActualizarDetalleFacturasProveedores));	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarDetalleFacturasProveedores  && this.isPermisoActualizarDetalleFacturasProveedores));	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarDetalleFacturasProveedores && this.isPermisoEliminarDetalleFacturasProveedores));
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarToolBarDetalleFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturasProveedores);				
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores));			
			this.jMenuItemDuplicarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores && this.isPermisoDuplicarDetalleFacturasProveedores));			
			this.jMenuItemCopiarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaCopiarDetalleFacturasProveedores && this.isPermisoCopiarDetalleFacturasProveedores));			
			this.jMenuItemVerFormDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaVerFormDetalleFacturasProveedores && this.isPermisoVerFormDetalleFacturasProveedores));			
			this.jMenuItemAbrirOrderByDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturasProveedores && this.isPermisoOrdenDetalleFacturasProveedores));			
			//this.jMenuItemMostrarOcultarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturasProveedores && this.isPermisoOrdenDetalleFacturasProveedores));
			this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturasProveedores && this.isPermisoOrdenDetalleFacturasProveedores));			
			//this.jMenuItemDetalleMostrarOcultarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaOrdenDetalleFacturasProveedores && this.isPermisoOrdenDetalleFacturasProveedores));			
			this.jMenuItemNuevoRelacionesDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores));			
			this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaNuevoDetalleFacturasProveedores && this.isPermisoNuevoDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));									
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemModificarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaModificarDetalleFacturasProveedores && this.isPermisoActualizarDetalleFacturasProveedores));	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemActualizarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaActualizarDetalleFacturasProveedores && this.isPermisoActualizarDetalleFacturasProveedores));	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemEliminarDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaEliminarDetalleFacturasProveedores && this.isPermisoEliminarDetalleFacturasProveedores));
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemCancelarDetalleFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturasProveedores);				
			}
			
			this.jMenuItemGuardarCambiosDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));						
			this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=this.jButtonNuevoDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores=this.jButtonDuplicarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCopiarDetalleFacturasProveedores=this.jButtonCopiarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaVerFormDetalleFacturasProveedores=this.jButtonVerFormDetalleFacturasProveedores.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleFacturasProveedores=this.jButtonAbrirOrderByDetalleFacturasProveedores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=this.jButtonNuevoRelacionesDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=this.jButtonModificarDetalleFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=this.jButtonNuevoToolBarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarToolBarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarToolBarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarToolBarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarToolBarDetalleFacturasProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=this.jButtonGuardarCambiosToolBarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=this.jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=this.jMenuItemNuevoDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=this.jMenuItemNuevoRelacionesDetalleFacturasProveedores.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemModificarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemActualizarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemEliminarDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemCancelarDetalleFacturasProveedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=this.jMenuItemGuardarCambiosDetalleFacturasProveedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleFacturasProveedores(Boolean esInicializar) {
		if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
				//if(this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleFacturasProveedores();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleFacturasProveedores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleFacturasProveedores() {
		this.jButtonNuevoDetalleFacturasProveedores.setVisible(this.isPermisoNuevoDetalleFacturasProveedores);			
		this.jButtonDuplicarDetalleFacturasProveedores.setVisible(this.isPermisoDuplicarDetalleFacturasProveedores);			
		this.jButtonCopiarDetalleFacturasProveedores.setVisible(this.isPermisoCopiarDetalleFacturasProveedores);			
		this.jButtonVerFormDetalleFacturasProveedores.setVisible(this.isPermisoVerFormDetalleFacturasProveedores);			
		
		this.jButtonAbrirOrderByDetalleFacturasProveedores.setVisible(this.isPermisoOrdenDetalleFacturasProveedores);					
		
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.setVisible(this.isPermisoNuevoDetalleFacturasProveedores);			
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarDetalleFacturasProveedores.setVisible(this.isPermisoActualizarDetalleFacturasProveedores);	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarDetalleFacturasProveedores.setVisible(this.isPermisoActualizarDetalleFacturasProveedores);	
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarDetalleFacturasProveedores.setVisible(this.isPermisoEliminarDetalleFacturasProveedores);
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarDetalleFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturasProveedores);						
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.setVisible(this.isPermisoGuardarCambiosDetalleFacturasProveedores);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.setVisible(this.isPermisoActualizarDetalleFacturasProveedores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleFacturasProveedores() {
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarDetalleFacturasProveedores.setVisible(this.isPermisoActualizarDetalleFacturasProveedores);	
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarDetalleFacturasProveedores.setVisible(this.isPermisoActualizarDetalleFacturasProveedores);	
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarDetalleFacturasProveedores.setVisible(this.isPermisoEliminarDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarDetalleFacturasProveedores.setVisible(this.isVisibilidadCeldaCancelarDetalleFacturasProveedores);							
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.setVisible((this.isVisibilidadCeldaGuardarDetalleFacturasProveedores && this.isPermisoGuardarCambiosDetalleFacturasProveedores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleFacturasProveedores() {
		if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleFacturasProveedores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleFacturasProveedores() {
	}
	
	public void jTableDatosDetalleFacturasProveedoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleFacturasProveedores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturasproveedores==null) {
						this.detallefacturasproveedores = new DetalleFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				}

				if(this.detallefacturasproveedores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallefacturasproveedores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleFacturasProveedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleFacturasProveedores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleFacturasProveedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleFacturasProveedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallefacturasproveedoresLogic.getConnexion());

				if(this.detallefacturasproveedores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallefacturasproveedores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleFacturasProveedores=(TitledBorder)this.jScrollPanelDatosDetalleFacturasProveedores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleFacturasProveedores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturasproveedores==null) {
						this.detallefacturasproveedores = new DetalleFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				}

				if(this.detallefacturasproveedores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallefacturasproveedores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteDetalleFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturasproveedores==null) {
						this.detallefacturasproveedores = new DetalleFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				}

				if(this.detallefacturasproveedores.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.detallefacturasproveedores.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_facturasDetalleFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturasproveedores==null) {
						this.detallefacturasproveedores = new DetalleFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				}

				if(this.detallefacturasproveedores.getcantidad_facturas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_facturas = "+this.detallefacturasproveedores.getcantidad_facturas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_valorDetalleFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturasproveedores==null) {
						this.detallefacturasproveedores = new DetalleFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				}

				if(this.detallefacturasproveedores.gettotal_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_valor = "+this.detallefacturasproveedores.gettotal_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmesDetalleFacturasProveedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.getdetallefacturasproveedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallefacturasproveedores==null) {
						this.detallefacturasproveedores = new DetalleFacturasProveedores();
					}

					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);
				}

				if(this.detallefacturasproveedores.getmes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mes = "+this.detallefacturasproveedores.getmes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleFacturasProveedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);

			this.getDetalleFacturasProveedoressBusquedaDetalleFacturasProveedores();

			this.inicializarActualizarBindingDetalleFacturasProveedores(false);

			//if(DetalleFacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleFacturasProveedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);

			this.getDetalleFacturasProveedoressFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleFacturasProveedores(false);

			//if(DetalleFacturasProveedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallefacturasproveedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleFacturasProveedores() {
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.dispose();
			this.jInternalFrameDetalleFormDetalleFacturasProveedores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
			this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.dispose();
			this.jInternalFrameReporteDinamicoDetalleFacturasProveedores=null;
		}
		
		if(this.jInternalFrameImportacionDetalleFacturasProveedores!=null) {
			this.jInternalFrameImportacionDetalleFacturasProveedores.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleFacturasProveedores.dispose();
			this.jInternalFrameImportacionDetalleFacturasProveedores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleFacturasProveedores();
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleFacturasProveedores")) {
				jButtonDuplicarDetalleFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleFacturasProveedores")) {
				jButtonCopiarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleFacturasProveedores")) {
				jButtonVerFormDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleFacturasProveedores")) {
				jButtonDuplicarDetalleFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleFacturasProveedores")) {
				jButtonDuplicarDetalleFacturasProveedoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleFacturasProveedores")) {
				jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleFacturasProveedores")) {
				jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleFacturasProveedores")) {
				jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleFacturasProveedores")) {
				jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleFacturasProveedores")) {
				jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleFacturasProveedores")) {
				jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleFacturasProveedores")) {
				jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleFacturasProveedores")) {
				jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleFacturasProveedores")) {
				jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleFacturasProveedores")) {
				jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleFacturasProveedores")) {
				jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleFacturasProveedores")) {
				jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleFacturasProveedores")) {
				jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleFacturasProveedores")) {
				jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleFacturasProveedores")) {
				jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleFacturasProveedores")) {
				jButtonMostrarOcultarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleFacturasProveedores")) {
				jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleFacturasProveedores")) {
				jButtonCopiarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleFacturasProveedores")) {
				jButtonVerFormDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleFacturasProveedores")) {
				jButtonCopiarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleFacturasProveedores")) {
				jButtonVerFormDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleFacturasProveedores")) {
				jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleFacturasProveedores")) {
				jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleFacturasProveedores")) {
				jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleFacturasProveedores")) {
				jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleFacturasProveedores")) {
				jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleFacturasProveedores")) {
				jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleFacturasProveedores")) {
				jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleFacturasProveedores")) {
				jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleFacturasProveedores")) {
				jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleFacturasProveedores") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleFacturasProveedores")) {
				jButtonAbrirOrderByDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleFacturasProveedores") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleFacturasProveedores")) {
				jButtonMostrarOcultarDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleFacturasProveedores")) {
				jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleFacturasProveedores")) {
				jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleFacturasProveedores")) {
				jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleFacturasProveedores")) {
				jButtonCerrarReporteDinamicoDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleFacturasProveedores")) {
				jButtonGenerarReporteDinamicoDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleFacturasProveedores")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleFacturasProveedores")) {
				jButtonCerrarImportacionDetalleFacturasProveedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleFacturasProveedores")) {
				
				jButtonGenerarImportacionDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleFacturasProveedores")) {
				
				jButtonAbrirImportacionDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleFacturasProveedores")) {
				jComboBoxTiposAccionesDetalleFacturasProveedoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleFacturasProveedores")) {
				jComboBoxTiposRelacionesDetalleFacturasProveedoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleFacturasProveedores")) {
				jComboBoxTiposAccionesDetalleFacturasProveedoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleFacturasProveedores")) {
				
				jComboBoxTiposSeleccionarDetalleFacturasProveedoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleFacturasProveedores")) {
				jTextFieldValorCampoGeneralDetalleFacturasProveedoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleFacturasProveedores")) {
				jButtonAbrirOrderByDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleFacturasProveedores")) {
				jButtonAbrirOrderByDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleFacturasProveedores")) {
				jButtonCerrarOrderByDetalleFacturasProveedoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleFacturasProveedoresBusqueda")) {
				this.jButtonidDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturasProveedoresUpdate")) {
				this.jButtonid_empresaDetalleFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturasProveedoresBusqueda")) {
				this.jButtonid_empresaDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteDetalleFacturasProveedoresBusqueda")) {
				this.jButtonnombre_clienteDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_facturasDetalleFacturasProveedoresBusqueda")) {
				this.jButtoncantidad_facturasDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_valorDetalleFacturasProveedoresBusqueda")) {
				this.jButtontotal_valorDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mesDetalleFacturasProveedoresBusqueda")) {
				this.jButtonmesDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDetalleFacturasProveedoresDetalleFacturasProveedores")) {
				this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedoresActionPerformed(evt);
			}
			
			;
			
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleFacturasProveedores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleFacturasProveedores detallefacturasproveedoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallefacturasproveedoresLocal=this.detallefacturasproveedores;
			} else {
				detallefacturasproveedoresLocal=this.detallefacturasproveedoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
							
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
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
			
			


			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
								
						
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
								
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
							
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
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
			
			


			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
								
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleFacturasProveedores")) {
					jCheckBoxSeleccionarTodosDetalleFacturasProveedoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleFacturasProveedores")) {
					jCheckBoxSeleccionadosDetalleFacturasProveedoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleFacturasProveedores")) {
					
				}
				
				


				
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
												
				
				


				
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
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
			
			


			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallefacturasproveedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallefacturasproveedores);
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
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
				
				


				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleFacturasProveedores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleFacturasProveedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleFacturasProveedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallefacturasproveedoresAnterior =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleFacturasProveedores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleFacturasProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleFacturasProveedores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallefacturasproveedores =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallefacturasproveedores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleFacturasProveedores")) {
				
				}
				
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleFacturasProveedores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleFacturasProveedores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleFacturasProveedores")) {
			
			}
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleFacturasProveedores();
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleFacturasProveedores")) {
				jButtonDuplicarDetalleFacturasProveedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleFacturasProveedores")) {
				jButtonCopiarDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleFacturasProveedores")) {
				jButtonVerFormDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleFacturasProveedores")) {
				jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleFacturasProveedores")) {
				jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleFacturasProveedores")) {
				jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleFacturasProveedores")) {
				jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleFacturasProveedores")) {
				jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleFacturasProveedores")) {
				jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleFacturasProveedores")) {
				jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleFacturasProveedores")) {
				jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleFacturasProveedores")) {
				jButtonAbrirOrderByDetalleFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleFacturasProveedores")) {
				jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleFacturasProveedores")) {
				jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleFacturasProveedores")) {
				jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleFacturasProveedoresBusqueda")) {
				this.jButtonidDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturasProveedoresUpdate")) {
				this.jButtonid_empresaDetalleFacturasProveedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleFacturasProveedoresBusqueda")) {
				this.jButtonid_empresaDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteDetalleFacturasProveedoresBusqueda")) {
				this.jButtonnombre_clienteDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_facturasDetalleFacturasProveedoresBusqueda")) {
				this.jButtoncantidad_facturasDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_valorDetalleFacturasProveedoresBusqueda")) {
				this.jButtontotal_valorDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mesDetalleFacturasProveedoresBusqueda")) {
				this.jButtonmesDetalleFacturasProveedoresBusquedaActionPerformed(evt);
			}
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleFacturasProveedores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleFacturasProveedores")) {
				closingInternalFrameDetalleFacturasProveedores();
				
			} else if(sTipo.equals("jButtonCancelarDetalleFacturasProveedores")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleFacturasProveedores = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleFacturasProveedoresBeanSwingJInternalFrame jInternalFrameParent=(DetalleFacturasProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleFacturasProveedores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleFacturasProveedoresActionPerformed(null);
			}
			
			DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallefacturasproveedores,new Object(),this.detallefacturasproveedoresParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleFacturasProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleFacturasProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleFacturasProveedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallefacturasproveedores)) {
			if(!esControlTabla) {
				if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);			
				}
				
				if(this.detallefacturasproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral,this.detallefacturasproveedoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallefacturasproveedoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleFacturasProveedores(classes,this.detallefacturasproveedoresReturnGeneral,this.detallefacturasproveedoresBean,false);
					}
						
					if(this.detallefacturasproveedoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores());	
					}
						
					if(this.detallefacturasproveedoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores(),classes);//this.detallefacturasproveedoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleFacturasProveedores(this.detallefacturasproveedores,classes);//this.detallefacturasproveedoresBean);									
				}
			
				if(DetalleFacturasProveedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleFacturasProveedores(this.detallefacturasproveedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleFacturasProveedores(this.detallefacturasproveedores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallefacturasproveedoresAnterior!=null) {
						this.detallefacturasproveedores=this.detallefacturasproveedoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallefacturasproveedoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores(),detallefacturasproveedoresLogic.getDetalleFacturasProveedoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedores(),this.detallefacturasproveedoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleFacturasProveedores.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleFacturasProveedores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleFacturasProveedores();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleFacturasProveedores() throws Exception {
		
		DetalleFacturasProveedoresModel detallefacturasproveedoresModel=(DetalleFacturasProveedoresModel)this.jTableDatosDetalleFacturasProveedores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallefacturasproveedoresModel.detallefacturasproveedoress=this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallefacturasproveedoresModel.detallefacturasproveedoress=this.detallefacturasproveedoress;
		}
		
		
		((DetalleFacturasProveedoresModel) this.jTableDatosDetalleFacturasProveedores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleFacturasProveedores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallefacturasproveedoresAnterior(),this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallefacturasproveedoresAnterior(),this.detallefacturasproveedoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleFacturasProveedores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
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
										
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallefacturasproveedores,new Object(),generalEntityParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleFacturasProveedoresConstantesFunciones.getClassesRelationshipsOfDetalleFacturasProveedores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleFacturasProveedoresConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleFacturasProveedores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleFacturasProveedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallefacturasproveedores,new Object(),generalEntityParameterGeneral,this.detallefacturasproveedoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleFacturasProveedores(DetalleFacturasProveedoresBean detallefacturasproveedoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleFacturasProveedores(ArrayList<Classe> classes,DetalleFacturasProveedoresReturnGeneral detallefacturasproveedoresReturnGeneral,DetalleFacturasProveedoresBean detallefacturasproveedoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallefacturasproveedores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores = new DetalleFacturasProveedoresDetalleFormJInternalFrame(jDesktopPane,this.detallefacturasproveedoresSessionBean.getConGuardarRelaciones(),this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.setVisible(false);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.detallefacturasproveedoresLogic=this.detallefacturasproveedoresLogic;
		
		this.cargarCombosFrameForeignKeyDetalleFacturasProveedores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleFacturasProveedores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleFacturasProveedores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleFacturasProveedores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleFacturasProveedores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleFacturasProveedores"));
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarDetalleFacturasProveedores"));

		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleFacturasProveedores"));
					
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemModificarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"ActualizarDetalleFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleFacturasProveedores"));
						
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemActualizarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarDetalleFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleFacturasProveedores"));
								
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemEliminarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarDetalleFacturasProveedores"));
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleFacturasProveedores"));
					
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemCancelarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleFacturasProveedores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemDetalleCerrarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleFacturasProveedores"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleFacturasProveedores"));
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleFacturasProveedores"));
		
		
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleFacturasProveedores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonidDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonid_empresaDetalleFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonid_empresaDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_facturasDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtontotal_valorDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"total_valorDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonmesDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"mesDetalleFacturasProveedoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleFacturasProveedores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleFacturasProveedores"));
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleFacturasProveedores"));
		}
		
		this.jTableDatosDetalleFacturasProveedores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleFacturasProveedores"));
		
		this.jTableDatosDetalleFacturasProveedores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleFacturasProveedores"));
		
		this.jButtonNuevoDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoDetalleFacturasProveedores"));
		
		this.jButtonDuplicarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"DuplicarDetalleFacturasProveedores"));
		
		this.jButtonCopiarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"CopiarDetalleFacturasProveedores"));
		
		this.jButtonVerFormDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"VerFormDetalleFacturasProveedores"));
		
		
		this.jButtonNuevoToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleFacturasProveedores"));
			
		this.jButtonDuplicarToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleFacturasProveedores"));
			
		this.jMenuItemNuevoDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleFacturasProveedores"));
			
		this.jMenuItemDuplicarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleFacturasProveedores"));		
		
		
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleFacturasProveedores"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleFacturasProveedores"));
			
		this.jMenuItemNuevoRelacionesDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleFacturasProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarDetalleFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonModificarToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleFacturasProveedores"));
			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemModificarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"ActualizarDetalleFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonActualizarToolBarDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleFacturasProveedores"));
				
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemActualizarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarDetalleFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonEliminarToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleFacturasProveedores"));
						
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemEliminarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarDetalleFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonCancelarToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleFacturasProveedores"));
			
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemCancelarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleFacturasProveedores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleFacturasProveedores"));		
		
		
		this.jButtonCerrarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarDetalleFacturasProveedores"));
		
		
		this.jButtonCerrarToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleFacturasProveedores"));
			
		this.jMenuItemCerrarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleFacturasProveedores"));
			
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jMenuItemDetalleCerrarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleFacturasProveedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleFacturasProveedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleFacturasProveedores"));
		}
		
		this.jButtonCopiarToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleFacturasProveedores"));
			
		this.jButtonVerFormToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleFacturasProveedores"));
		
		this.jMenuItemGuardarCambiosDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleFacturasProveedores"));
			
		this.jMenuItemCopiarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleFacturasProveedores"));		
		
		this.jMenuItemVerFormDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleFacturasProveedores"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleFacturasProveedores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleFacturasProveedores"));
			
		this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleFacturasProveedores"));		
		
		
		
		this.jButtonRecargarInformacionDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleFacturasProveedores"));
					
		this.jButtonRecargarInformacionToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleFacturasProveedores"));
		
		this.jMenuItemRecargarInformacionDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleFacturasProveedores"));		
		
		
		
		this.jButtonAnterioresDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"AnterioresDetalleFacturasProveedores"));
		
		
		this.jButtonAnterioresToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleFacturasProveedores"));
		
		this.jMenuItemAnterioresDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleFacturasProveedores"));		
		
		
		this.jButtonSiguientesDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"SiguientesDetalleFacturasProveedores"));
		
		
		this.jButtonSiguientesToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleFacturasProveedores"));
			
		this.jMenuItemSiguientesDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleFacturasProveedores"));
			
		this.jMenuItemAbrirOrderByDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleFacturasProveedores"));
			
		this.jMenuItemMostrarOcultarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleFacturasProveedores"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleFacturasProveedores"));
			
		this.jMenuItemDetalleMostarOcultarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleFacturasProveedores"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleFacturasProveedores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleFacturasProveedores"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleFacturasProveedores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleFacturasProveedores"));

		this.jCheckBoxSeleccionadosDetalleFacturasProveedores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleFacturasProveedores"));
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleFacturasProveedores"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleFacturasProveedores"));
			
		this.jComboBoxTiposAccionesDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleFacturasProveedores"));
					
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleFacturasProveedores"));
			
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleFacturasProveedores"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonidDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonid_empresaDetalleFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonid_empresaDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_facturasDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtontotal_valorDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"total_valorDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonmesDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"mesDetalleFacturasProveedoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"BusquedaDetalleFacturasProveedoresDetalleFacturasProveedores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleFacturasProveedores!=null) {
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleFacturasProveedores"));
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleFacturasProveedores"));
				this.jInternalFrameReporteDinamicoDetalleFacturasProveedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleFacturasProveedores"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleFacturasProveedores"));				
			//this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleFacturasProveedores"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleFacturasProveedores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleFacturasProveedores!=null) {
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleFacturasProveedores"));
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleFacturasProveedores"));
				this.jInternalFrameImportacionDetalleFacturasProveedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleFacturasProveedores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleFacturasProveedores"));
			
			this.jButtonAbrirOrderByToolBarDetalleFacturasProveedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleFacturasProveedores"));			
			
			if(this.jInternalFrameOrderByDetalleFacturasProveedores!=null) {
				this.jInternalFrameOrderByDetalleFacturasProveedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleFacturasProveedores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTabbedPaneRelacionesDetalleFacturasProveedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleFacturasProveedores"));
		
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
            		closingInternalFrameDetalleFacturasProveedores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleFacturasProveedores = (JInternalFrameBase)event.getSource();
	            	
	            DetalleFacturasProveedoresBeanSwingJInternalFrame jInternalFrameParent=(DetalleFacturasProveedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleFacturasProveedores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleFacturasProveedoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleFacturasProveedores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleFacturasProveedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleFacturasProveedores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleFacturasProveedores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleFacturasProveedores";
		inputMap = this.jButtonNuevoDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleFacturasProveedores";
		inputMap = this.jButtonNuevoRelacionesDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleFacturasProveedoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleFacturasProveedores";
		inputMap = this.jButtonModificarDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleFacturasProveedores";
		inputMap = this.jButtonActualizarDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleFacturasProveedores";
		inputMap = this.jButtonEliminarDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleFacturasProveedores";
		inputMap = this.jButtonCancelarDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleFacturasProveedores";
		inputMap = this.jButtonCerrarDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleFacturasProveedores";
		inputMap = this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonGuardarCambiosDetalleFacturasProveedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleFacturasProveedores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleFacturasProveedoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleFacturasProveedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonidDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleFacturasProveedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonid_empresaDetalleFacturasProveedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturasProveedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonid_empresaDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonnombre_clienteDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtoncantidad_facturasDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_facturasDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtontotal_valorDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"total_valorDetalleFacturasProveedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jButtonmesDetalleFacturasProveedoresBusqueda.addActionListener(new ButtonActionListener(this,"mesDetalleFacturasProveedoresBusqueda"));
		
		
		this.jButtonBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores.addActionListener(new ButtonActionListener(this,"BusquedaDetalleFacturasProveedoresDetalleFacturasProveedores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleFacturasProveedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleFacturasProveedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleFacturasProveedores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleFacturasProveedores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
					detallefacturasproveedoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoress) {
					detallefacturasproveedoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleFacturasProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
						detallefacturasproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoress) {
						detallefacturasproveedoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoress) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleFacturasProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleFacturasProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleFacturasProveedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleFacturasProveedores.getSelectedRows();
			
			DetalleFacturasProveedores detallefacturasproveedoresLocal=new DetalleFacturasProveedores();
			
			//this.seleccionarTodosDetalleFacturasProveedores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallefacturasproveedoresLocal =(DetalleFacturasProveedores) this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress().toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallefacturasproveedoresLocal =(DetalleFacturasProveedores) this.detallefacturasproveedoress.toArray()[this.jTableDatosDetalleFacturasProveedores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallefacturasproveedoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
						detallefacturasproveedoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoress) {
						detallefacturasproveedoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleFacturasProveedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleFacturasProveedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleFacturasProveedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleFacturasProveedoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleFacturasProveedoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleFacturasProveedores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
				
						if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							detallefacturasproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS)) {
							existe=true;
							detallefacturasproveedoresAux.setcantidad_facturas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR)) {
							existe=true;
							detallefacturasproveedoresAux.settotal_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES)) {
							existe=true;
							detallefacturasproveedoresAux.setmes(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoress) {
					
						if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							detallefacturasproveedoresAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS)) {
							existe=true;
							detallefacturasproveedoresAux.setcantidad_facturas(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR)) {
							existe=true;
							detallefacturasproveedoresAux.settotal_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES)) {
							existe=true;
							detallefacturasproveedoresAux.setmes(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleFacturasProveedoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleFacturasProveedores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleFacturasProveedores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleFacturasProveedores) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleFacturasProveedores(conSplash);
				
					this.generarReporteDetalleFacturasProveedoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleFacturasProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleFacturasProveedoressSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleFacturasProveedoressSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleFacturasProveedores();
				
				this.exportarDetalleFacturasProveedoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleFacturasProveedoress();
				//this.importarDetalleFacturasProveedoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleFacturasProveedores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleFacturasProveedoressSeleccionados();
				//this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleFacturasProveedores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleFacturasProveedores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleFacturasProveedores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleFacturasProveedoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleFacturasProveedores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleFacturasProveedores(conSplash);
					
						//this.actualizarParametrosGeneralDetalleFacturasProveedores();
						
						this.generarReporteProcesoAccionDetalleFacturasProveedoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Facturas ProveedoresES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Facturas Proveedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleFacturasProveedores();
				
						this.actualizarParametrosGeneralDetalleFacturasProveedores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallefacturasproveedoresReturnGeneral=detallefacturasproveedoresLogic.procesarAccionDetalleFacturasProveedoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress(),this.detallefacturasproveedoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleFacturasProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleFacturasProveedores();
					
					DetalleFacturasProveedoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleFacturasProveedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleFacturasProveedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxTiposAccionesFormularioDetalleFacturasProveedores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleFacturasProveedores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleFacturasProveedoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleFacturasProveedores();
			
			if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
			DetalleFacturasProveedores detallefacturasproveedores=new DetalleFacturasProveedores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleFacturasProveedores.getSelectedItem();
			
			
			
			
			detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallefacturasproveedoressSeleccionados.size()==1) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressSeleccionados) {
					detallefacturasproveedores=detallefacturasproveedoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleFacturasProveedores();
			
      		//this.finishProcessDetalleFacturasProveedores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleFacturasProveedoresReturnGeneral() throws Exception {
		if(this.detallefacturasproveedoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallefacturasproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallefacturasproveedoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallefacturasproveedoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallefacturasproveedoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallefacturasproveedoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
		}
		
		if(this.detallefacturasproveedoresReturnGeneral.getConRetornoLista() || this.detallefacturasproveedoresReturnGeneral.getConRetornoObjeto()) {
			if(this.detallefacturasproveedoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallefacturasproveedoresLogic.setDetalleFacturasProveedoress(this.detallefacturasproveedoresReturnGeneral.getDetalleFacturasProveedoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDetalleFacturasProveedores(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleFacturasProveedores() throws Exception {
		
		
	}
	
	public ArrayList<DetalleFacturasProveedores> getDetalleFacturasProveedoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleFacturasProveedores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoresLogic.getDetalleFacturasProveedoress()) {
					if(detallefacturasproveedoresAux.getIsSelected()) {
						detallefacturasproveedoressSeleccionados.add(detallefacturasproveedoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleFacturasProveedores detallefacturasproveedoresAux:this.detallefacturasproveedoress) {
					if(detallefacturasproveedoresAux.getIsSelected()) {
						detallefacturasproveedoressSeleccionados.add(detallefacturasproveedoresAux);				
					}
				}
			}
			
			if(detallefacturasproveedoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallefacturasproveedoressSeleccionados.addAll(this.detallefacturasproveedoresLogic.getDetalleFacturasProveedoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallefacturasproveedoressSeleccionados.addAll(this.detallefacturasproveedoress);				
					}
				}
			}
		} else {
			detallefacturasproveedoressSeleccionados.add(this.detallefacturasproveedores);
		}
		
		return detallefacturasproveedoressSeleccionados;
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
	
	public void generarReporteDetalleFacturasProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleFacturasProveedoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleFacturasProveedoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Facturas Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleFacturasProveedoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleFacturasProveedores();
		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleFacturasProveedores();
		
		
		//this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados ,detallefacturasproveedoresImplementable,detallefacturasproveedoresImplementableHome);
	}
	
	public void mostrarImportacionDetalleFacturasProveedoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleFacturasProveedores();
		
		this.abrirFrameImportacionDetalleFacturasProveedores();		
		
			
		//this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados ,detallefacturasproveedoresImplementable,detallefacturasproveedoresImplementableHome);
	}
	
	public void importarDetalleFacturasProveedoress() throws Exception {		
	
	}
	
	public void exportarDetalleFacturasProveedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleFacturasProveedoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleFacturasProveedoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleFacturasProveedoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Facturas Proveedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleFacturasProveedores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleFacturasProveedores(detallefacturasproveedoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallefacturasproveedoresAux.setsDetalleGeneralEntityReporte(detallefacturasproveedoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleFacturasProveedores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleFacturasProveedoresConstantesFunciones.LABEL_MES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallefacturasproveedores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturasproveedores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturasproveedores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturasproveedores.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturasproveedores.getcantidad_facturas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturasproveedores.gettotal_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallefacturasproveedores.getmes().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleFacturasProveedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleFacturasProveedores(row);				
				iRow++;
			}				
			
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleFacturasProveedores(detallefacturasproveedoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleFacturasProveedoressSeleccionados() throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();		
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallefacturasproveedores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallefacturasproveedoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallefacturasproveedores");
			//elementRoot.appendChild(element);
		
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressSeleccionados) {
				element = document.createElement("detallefacturasproveedores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleFacturasProveedores(detallefacturasproveedoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Facturas Proveedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleFacturasProveedores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_TOTALVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturasproveedores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturasproveedores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturasproveedores.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturasproveedores.getcantidad_facturas());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturasproveedores.gettotal_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallefacturasproveedores.getmes());				
	}
	
	public void setFilaDatosExportarXmlDetalleFacturasProveedores(DetalleFacturasProveedores detallefacturasproveedores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleFacturasProveedoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallefacturasproveedores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleFacturasProveedoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallefacturasproveedores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleFacturasProveedoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallefacturasproveedores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_cliente = document.createElement(DetalleFacturasProveedoresConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(detallefacturasproveedores.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementcantidad_facturas = document.createElement(DetalleFacturasProveedoresConstantesFunciones.CANTIDADFACTURAS);
		elementcantidad_facturas.appendChild(document.createTextNode(detallefacturasproveedores.getcantidad_facturas().toString().trim()));
		element.appendChild(elementcantidad_facturas);

		Element elementtotal_valor = document.createElement(DetalleFacturasProveedoresConstantesFunciones.TOTALVALOR);
		elementtotal_valor.appendChild(document.createTextNode(detallefacturasproveedores.gettotal_valor().toString().trim()));
		element.appendChild(elementtotal_valor);

		Element elementmes = document.createElement(DetalleFacturasProveedoresConstantesFunciones.MES);
		elementmes.appendChild(document.createTextNode(detallefacturasproveedores.getmes().toString().trim()));
		element.appendChild(elementmes);
	}
	
	public void generarReporteGroupGenericoDetalleFacturasProveedoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados=new ArrayList<DetalleFacturasProveedores>();
		
		detallefacturasproveedoressSeleccionados=this.getDetalleFacturasProveedoressSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleFacturasProveedores(detallefacturasproveedoressSeleccionados);
		
		this.generarReporteDetalleFacturasProveedoress("Todos",detallefacturasproveedoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleFacturasProveedores(ArrayList<DetalleFacturasProveedores> detallefacturasproveedoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleFacturasProveedores detallefacturasproveedoresAux:detallefacturasproveedoressSeleccionados) {
				detallefacturasproveedoresAux.setsDetalleGeneralEntityReporte(detallefacturasproveedoresAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallefacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(detallefacturasproveedoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					detallefacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(detallefacturasproveedoresAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_CANTIDADFACTURAS)) {
					existe=true;
					detallefacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(detallefacturasproveedoresAux.getcantidad_facturas().toString());
				}
				 else if(sTipoSeleccionar.equals(DetalleFacturasProveedoresConstantesFunciones.LABEL_MES)) {
					existe=true;
					detallefacturasproveedoresAux.setsDescripcionGeneralEntityReporte1(detallefacturasproveedoresAux.getmes().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleFacturasProveedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleFacturasProveedores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaModificarDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleFacturasProveedoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=true;
		} else {
			this.actualizarEstadoPanelsDetalleFacturasProveedores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleFacturasProveedores=false;
			//this.isVisibilidadCeldaVerFormDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaDuplicarDetalleFacturasProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!detallefacturasproveedoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;												
			}
			
			this.jButtonCerrarDetalleFacturasProveedores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
		}
		
		if(!this.permiteMantenimiento(this.detallefacturasproveedores)) {
			this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
			this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDetalleFacturasProveedores=false;
		this.isVisibilidadCeldaNuevoRelacionesDetalleFacturasProveedores=false;
		this.isVisibilidadCeldaGuardarCambiosDetalleFacturasProveedores=false;
		//this.isVisibilidadCeldaModificarDetalleFacturasProveedores=true;
		this.isVisibilidadCeldaActualizarDetalleFacturasProveedores=false;
		this.isVisibilidadCeldaEliminarDetalleFacturasProveedores=false;
		//this.isVisibilidadCeldaCancelarDetalleFacturasProveedores=true;			
		this.isVisibilidadCeldaGuardarDetalleFacturasProveedores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleFacturasProveedores() {
	}
	
	public void actualizarEstadoPanelsDetalleFacturasProveedores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosEdicionDetalleFacturasProveedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleFacturasProveedores!=null) {
				this.jScrollPanelDatosDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleFacturasProveedores!=null) {
				this.jPanelPaginacionDetalleFacturasProveedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
					this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallefacturasproveedoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleFacturasProveedores!=null) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleFacturasProveedores!=null) {
				this.jPanelParametrosReportesDetalleFacturasProveedores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDetalleFacturasProveedores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDetalleFacturasProveedores) {this.jTabbedPaneBusquedasDetalleFacturasProveedores.remove(jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);}
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
			
			this.inicializarActualizarBindingTablaDetalleFacturasProveedores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleFacturasProveedores() {
		this.updateBorderResaltarBusquedasFormularioDetalleFacturasProveedores();
		this.updateVisibilidadBusquedasFormularioDetalleFacturasProveedores();
		this.updateHabilitarBusquedasFormularioDetalleFacturasProveedores();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleFacturasProveedores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponents().length>0) {
	

		if(this.detallefacturasproveedoresConstantesFunciones.resaltarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores!=null) {
			index= this.jTabbedPaneBusquedasDetalleFacturasProveedores.indexOfComponent(this.jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponent(index);
				jPanel.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleFacturasProveedores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleFacturasProveedores.indexOfComponent(this.jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			if(!this.detallefacturasproveedoresConstantesFunciones.mostrarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores && index>-1) {
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleFacturasProveedores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleFacturasProveedores.indexOfComponent(this.jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
				this.jTabbedPaneBusquedasDetalleFacturasProveedores.setEnabledAt(index,this.detallefacturasproveedoresConstantesFunciones.activarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleFacturasProveedores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDetalleFacturasProveedores")) {
			index= this.jTabbedPaneBusquedasDetalleFacturasProveedores.indexOfComponent(this.jPanelBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);

			this.jTabbedPaneBusquedasDetalleFacturasProveedores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleFacturasProveedores.getComponent(index);

			this.detallefacturasproveedoresConstantesFunciones.setResaltarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores(resaltar);

			jPanel.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltarBusquedaDetalleFacturasProveedoresDetalleFacturasProveedores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleFacturasProveedores.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleFacturasProveedores() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleFacturasProveedores();
		this.updateVisibilidadResaltarControlesFormularioDetalleFacturasProveedores();
		this.updateHabilitarResaltarControlesFormularioDetalleFacturasProveedores();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleFacturasProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallefacturasproveedoresConstantesFunciones.resaltaridDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltaridDetalleFacturasProveedores);}
		if(this.detallefacturasproveedoresConstantesFunciones.resaltarid_empresaDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltarid_empresaDetalleFacturasProveedores);}
		if(this.detallefacturasproveedoresConstantesFunciones.resaltarnombre_clienteDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltarnombre_clienteDetalleFacturasProveedores);}
		if(this.detallefacturasproveedoresConstantesFunciones.resaltarcantidad_facturasDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltarcantidad_facturasDetalleFacturasProveedores);}
		if(this.detallefacturasproveedoresConstantesFunciones.resaltartotal_valorDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltartotal_valorDetalleFacturasProveedores);}
		if(this.detallefacturasproveedoresConstantesFunciones.resaltarmesDetalleFacturasProveedores!=null && this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setBorder(this.detallefacturasproveedoresConstantesFunciones.resaltarmesDetalleFacturasProveedores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleFacturasProveedores() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
	
		//this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostraridDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelidDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostraridDetalleFacturasProveedores);
		//this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarid_empresaDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelid_empresaDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarid_empresaDetalleFacturasProveedores);
		//this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarnombre_clienteDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelnombre_clienteDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarnombre_clienteDetalleFacturasProveedores);
		//this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarcantidad_facturasDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelcantidad_facturasDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarcantidad_facturasDetalleFacturasProveedores);
		//this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrartotal_valorDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPaneltotal_valorDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrartotal_valorDetalleFacturasProveedores);
		//this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarmesDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jPanelmesDetalleFacturasProveedores.setVisible(this.detallefacturasproveedoresConstantesFunciones.mostrarmesDetalleFacturasProveedores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleFacturasProveedores() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleFacturasProveedores!=null) {
	
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jLabelidDetalleFacturasProveedores.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activaridDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jComboBoxid_empresaDetalleFacturasProveedores.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activarid_empresaDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextAreanombre_clienteDetalleFacturasProveedores.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activarnombre_clienteDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldcantidad_facturasDetalleFacturasProveedores.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activarcantidad_facturasDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldtotal_valorDetalleFacturasProveedores.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activartotal_valorDetalleFacturasProveedores);
		this.jInternalFrameDetalleFormDetalleFacturasProveedores.jTextFieldmesDetalleFacturasProveedores.setEnabled(this.detallefacturasproveedoresConstantesFunciones.activarmesDetalleFacturasProveedores);
		}
	}
	
		
}