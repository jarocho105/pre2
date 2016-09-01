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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.TarjetaCreditoConexionConstantesFunciones;
import com.bydan.erp.puntoventa.util.TarjetaCreditoConexionParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TarjetaCreditoConexionParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TarjetaCreditoConexionBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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
public class TarjetaCreditoConexionBeanSwingJInternalFrame extends TarjetaCreditoConexionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TarjetaCreditoConexionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TarjetaCreditoConexion> tarjetacreditoconexionValidator = new ClassValidator<TarjetaCreditoConexion>(TarjetaCreditoConexion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TarjetaCreditoConexion tarjetacreditoconexion;	
	public TarjetaCreditoConexion tarjetacreditoconexionAux;
	public TarjetaCreditoConexion tarjetacreditoconexionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TarjetaCreditoConexion tarjetacreditoconexionTotales;
	public Long idTarjetaCreditoConexionActual;
	public Long iIdNuevoTarjetaCreditoConexion=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboTarjetaCredito="";

	public List<TarjetaCredito> tarjetacreditosForeignKey;

	public List<TarjetaCredito> gettarjetacreditosForeignKey() {
		return tarjetacreditosForeignKey;
	}

	public void settarjetacreditosForeignKey(List<TarjetaCredito> tarjetacreditosForeignKey) {
		this.tarjetacreditosForeignKey = tarjetacreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TarjetaCredito tarjetacreditoForeignKey;

	public TarjetaCredito gettarjetacreditoForeignKey() {
		return tarjetacreditoForeignKey;
	}

	public void settarjetacreditoForeignKey(TarjetaCredito tarjetacreditoForeignKey) {
		this.tarjetacreditoForeignKey = tarjetacreditoForeignKey;
	}

	public String sFinalQueryComboConexion="";

	public List<Conexion> conexionsForeignKey;

	public List<Conexion> getconexionsForeignKey() {
		return conexionsForeignKey;
	}

	public void setconexionsForeignKey(List<Conexion> conexionsForeignKey) {
		this.conexionsForeignKey = conexionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Conexion conexionForeignKey;

	public Conexion getconexionForeignKey() {
		return conexionForeignKey;
	}

	public void setconexionForeignKey(Conexion conexionForeignKey) {
		this.conexionForeignKey = conexionForeignKey;
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
	
	public Boolean isPermisoTodoTarjetaCreditoConexion;
	public Boolean isPermisoNuevoTarjetaCreditoConexion;
	public Boolean isPermisoActualizarTarjetaCreditoConexion;
	public Boolean isPermisoActualizarOriginalTarjetaCreditoConexion;
	public Boolean isPermisoEliminarTarjetaCreditoConexion;
	public Boolean isPermisoGuardarCambiosTarjetaCreditoConexion;
	public Boolean isPermisoConsultaTarjetaCreditoConexion;
	public Boolean isPermisoBusquedaTarjetaCreditoConexion;
	public Boolean isPermisoReporteTarjetaCreditoConexion;
	public Boolean isPermisoPaginacionMedioTarjetaCreditoConexion;
	public Boolean isPermisoPaginacionAltoTarjetaCreditoConexion;
	public Boolean isPermisoPaginacionTodoTarjetaCreditoConexion;
	public Boolean isPermisoCopiarTarjetaCreditoConexion;
	public Boolean isPermisoVerFormTarjetaCreditoConexion;
	public Boolean isPermisoDuplicarTarjetaCreditoConexion;
	public Boolean isPermisoOrdenTarjetaCreditoConexion;
	
	
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
	
	public TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionReturnGeneral;
	public TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTarjetaCreditoConexion=false;
	public Boolean esParaAccionDesdeFormularioTarjetaCreditoConexion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TarjetaCreditoConexionSessionBeanAdditional tarjetacreditoconexionSessionBeanAdditional=null;
	
	public TarjetaCreditoConexionSessionBeanAdditional getTarjetaCreditoConexionSessionBeanAdditional() {
		return this.tarjetacreditoconexionSessionBeanAdditional;
	}
	
	public void setTarjetaCreditoConexionSessionBeanAdditional(TarjetaCreditoConexionSessionBeanAdditional tarjetacreditoconexionSessionBeanAdditional) {
		try {
			this.tarjetacreditoconexionSessionBeanAdditional=tarjetacreditoconexionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TarjetaCreditoConexionBeanSwingJInternalFrameAdditional tarjetacreditoconexionBeanSwingJInternalFrameAdditional=null;
	//public class TarjetaCreditoConexionBeanSwingJInternalFrame
	
	public TarjetaCreditoConexionBeanSwingJInternalFrameAdditional getTarjetaCreditoConexionBeanSwingJInternalFrameAdditional() {
		return this.tarjetacreditoconexionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTarjetaCreditoConexionBeanSwingJInternalFrameAdditional(TarjetaCreditoConexionBeanSwingJInternalFrameAdditional tarjetacreditoconexionBeanSwingJInternalFrameAdditional) {
		try {
			this.tarjetacreditoconexionBeanSwingJInternalFrameAdditional=tarjetacreditoconexionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TarjetaCreditoConexionLogic tarjetacreditoconexionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TarjetaCreditoConexion tarjetacreditoconexionBean;
	public TarjetaCreditoConexionConstantesFunciones tarjetacreditoconexionConstantesFunciones;
	//public TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TarjetaCreditoLogic tarjetacreditoLogic;
	public ConexionLogic conexionLogic;
	
	//PARAMETROS
	
	
	//public List<TarjetaCreditoConexion> tarjetacreditoconexions;	
	//public List<TarjetaCreditoConexion> tarjetacreditoconexionsEliminados;
	//public List<TarjetaCreditoConexion> tarjetacreditoconexionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
	public Boolean isVisibilidadCeldaDuplicarTarjetaCreditoConexion=true;
	public Boolean isVisibilidadCeldaCopiarTarjetaCreditoConexion=true;
	public Boolean isVisibilidadCeldaVerFormTarjetaCreditoConexion=true;
	public Boolean isVisibilidadCeldaOrdenTarjetaCreditoConexion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
	public Boolean isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
	public Boolean isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
	public Boolean isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
	public Boolean isVisibilidadCeldaCancelarTarjetaCreditoConexion=false;
	public Boolean isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;	
	
	
	public Boolean isVisibilidadFK_IdConexion=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTarjetaCredito=false;
	
	public Long getiIdNuevoTarjetaCreditoConexion() {
		return this.iIdNuevoTarjetaCreditoConexion;
	}

	public void setiIdNuevoTarjetaCreditoConexion(Long iIdNuevoTarjetaCreditoConexion) {
		this.iIdNuevoTarjetaCreditoConexion = iIdNuevoTarjetaCreditoConexion;
	}
	
	public Long getidTarjetaCreditoConexionActual() {
		return this.idTarjetaCreditoConexionActual;
	}

	public void setidTarjetaCreditoConexionActual(Long idTarjetaCreditoConexionActual) {
		this.idTarjetaCreditoConexionActual = idTarjetaCreditoConexionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TarjetaCreditoConexion gettarjetacreditoconexion() {
		return this.tarjetacreditoconexion;
	}

	public void settarjetacreditoconexion(TarjetaCreditoConexion tarjetacreditoconexion) {
		this.tarjetacreditoconexion = tarjetacreditoconexion;
	}
	
	public TarjetaCreditoConexion gettarjetacreditoconexionAux() {
		return this.tarjetacreditoconexionAux;
	}

	public void settarjetacreditoconexionAux(TarjetaCreditoConexion tarjetacreditoconexionAux) {
		this.tarjetacreditoconexionAux = tarjetacreditoconexionAux;
	}				
	
	public TarjetaCreditoConexion gettarjetacreditoconexionAnterior() {
		return this.tarjetacreditoconexionAnterior;
	}

	public void settarjetacreditoconexionAnterior(TarjetaCreditoConexion tarjetacreditoconexionAnterior) {
		this.tarjetacreditoconexionAnterior = tarjetacreditoconexionAnterior;
	}	
	
	public TarjetaCreditoConexion gettarjetacreditoconexionTotales() {
		return this.tarjetacreditoconexionTotales;
	}

	public void settarjetacreditoconexionTotales(TarjetaCreditoConexion tarjetacreditoconexionTotales) {
		this.tarjetacreditoconexionTotales = tarjetacreditoconexionTotales;
	}	
	
	public TarjetaCreditoConexion gettarjetacreditoconexionBean() {
		return this.tarjetacreditoconexionBean;
	}

	public void settarjetacreditoconexionBean(TarjetaCreditoConexion tarjetacreditoconexionBean) {
		this.tarjetacreditoconexionBean = tarjetacreditoconexionBean;
	}	
	
	public TarjetaCreditoConexionParameterReturnGeneral gettarjetacreditoconexionReturnGeneral() {
		return this.tarjetacreditoconexionReturnGeneral;
	}

	public void settarjetacreditoconexionReturnGeneral(TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionReturnGeneral) {
		this.tarjetacreditoconexionReturnGeneral = tarjetacreditoconexionReturnGeneral;
	}	
	
	
	public Long id_conexionFK_IdConexion=-1L;

	public Long getid_conexionFK_IdConexion() {
		return this.id_conexionFK_IdConexion;
	}

	public void setid_conexionFK_IdConexion(Long id_conexionFK_IdConexion) {
		this.id_conexionFK_IdConexion = id_conexionFK_IdConexion;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tarjeta_creditoFK_IdTarjetaCredito=-1L;

	public Long getid_tarjeta_creditoFK_IdTarjetaCredito() {
		return this.id_tarjeta_creditoFK_IdTarjetaCredito;
	}

	public void setid_tarjeta_creditoFK_IdTarjetaCredito(Long id_tarjeta_creditoFK_IdTarjetaCredito) {
		this.id_tarjeta_creditoFK_IdTarjetaCredito = id_tarjeta_creditoFK_IdTarjetaCredito;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TarjetaCreditoConexionLogic getTarjetaCreditoConexionLogic()	{		
		return tarjetacreditoconexionLogic;
	}

	public void setTarjetaCreditoConexionLogic(TarjetaCreditoConexionLogic tarjetacreditoconexionLogic) {
		this.tarjetacreditoconexionLogic = tarjetacreditoconexionLogic;
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
	
	public Boolean getIsEsNuevoTarjetaCreditoConexion() {
		return isEsNuevoTarjetaCreditoConexion;
	}

	public void setIsEsNuevoTarjetaCreditoConexion(Boolean isEsNuevoTarjetaCreditoConexion) {
		this.isEsNuevoTarjetaCreditoConexion = isEsNuevoTarjetaCreditoConexion;
	}

	public Boolean getEsParaAccionDesdeFormularioTarjetaCreditoConexion() {
		return esParaAccionDesdeFormularioTarjetaCreditoConexion;
	}
	
	public void setEsParaAccionDesdeFormularioTarjetaCreditoConexion(Boolean esParaAccionDesdeFormularioTarjetaCreditoConexion) {
		this.esParaAccionDesdeFormularioTarjetaCreditoConexion = esParaAccionDesdeFormularioTarjetaCreditoConexion;
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

			if(this.tarjetacreditoconexionSessionBean==null) {
				this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			}

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tarjetacreditoconexionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.tarjetacreditoconexionSessionBean==null) {
				this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			}

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(tarjetacreditoconexionSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosTarjetaCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TarjetaCreditoLogic tarjetacreditoLogic=new TarjetaCreditoLogic();

			//tarjetacreditoLogic.getTarjetaCreditoDataAccess().setIsForForeingKeyData(true);

			if(this.tarjetacreditoconexionSessionBean==null) {
				this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			}

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetacreditoLogic.getTarjetaCreditoDataAccess().setIsForForeingKeyData(true);

					tarjetacreditoLogic.getTodosTarjetaCreditosWithConnection(sFinalQuery,new Pagination());

					this.tarjetacreditosForeignKey=tarjetacreditoLogic.getTarjetaCreditos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTarjetaCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoLogic.getEntityWithConnection(tarjetacreditoconexionSessionBean.getlidTarjetaCreditoActual());
					this.tarjetacreditosForeignKey.add(tarjetacreditoLogic.getTarjetaCredito());
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

	public void cargarCombosConexionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.conexionsForeignKey=new ArrayList<Conexion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ConexionLogic conexionLogic=new ConexionLogic();

			//conexionLogic.getConexionDataAccess().setIsForForeingKeyData(true);

			if(this.tarjetacreditoconexionSessionBean==null) {
				this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			}

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionConexion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conexionLogic.getConexionDataAccess().setIsForForeingKeyData(true);

					conexionLogic.getTodosConexionsWithConnection(sFinalQuery,new Pagination());

					this.conexionsForeignKey=conexionLogic.getConexions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaConexion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					conexionLogic.getEntityWithConnection(tarjetacreditoconexionSessionBean.getlidConexionActual());
					this.conexionsForeignKey.add(conexionLogic.getConexion());
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

					if(this.tarjetacreditoconexion!=null) {
						this.tarjetacreditoconexion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTarjetaCreditoConexion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTarjetaCreditoConexionGenerico)throws Exception
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
				jComboBoxid_empresaTarjetaCreditoConexionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTarjetaCreditoConexionGenerico!=null && jComboBoxid_empresaTarjetaCreditoConexionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTarjetaCreditoConexionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.tarjetacreditoconexion!=null) {
						this.tarjetacreditoconexion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTarjetaCreditoConexion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalTarjetaCreditoConexionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTarjetaCreditoConexionGenerico!=null && jComboBoxid_sucursalTarjetaCreditoConexionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTarjetaCreditoConexionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTarjetaCreditoForeignKey(Long idTarjetaCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tarjetacreditoTemp!=null) {

					if(this.tarjetacreditoconexion!=null) {
						this.tarjetacreditoconexion.setTarjetaCredito(tarjetacreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setSelectedItem(tarjetacreditoTemp);
					}
				} else {
					//jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setSelectedItem(tarjetacreditoTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTarjetaCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(tarjetacreditoTemp!=null && jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion!=null) {
						jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setSelectedItem(tarjetacreditoTemp);
					} else {
						if(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion!=null) {
							//jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setSelectedItem(tarjetacreditoTemp);
							if(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.getItemCount()>0) {
								jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setSelectedIndex(0);
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

	public String getActualTarjetaCreditoForeignKeyDescripcion(Long idTarjetaCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}


			sDescripcion=TarjetaCreditoConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTarjetaCreditoForeignKeyGenerico(Long idTarjetaCreditoSeleccionado,JComboBox jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}

			if(tarjetacreditoTemp!=null) {
				jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico.setSelectedItem(tarjetacreditoTemp);
			} else {
				if(jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico!=null && jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico.getItemCount()>0) {
					jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualConexionForeignKey(Long idConexionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsForeignKey) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(conexionTemp!=null) {

					if(this.tarjetacreditoconexion!=null) {
						this.tarjetacreditoconexion.setConexion(conexionTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setSelectedItem(conexionTemp);
					}
				} else {
					//jComboBoxid_conexionTarjetaCreditoConexion.setSelectedItem(conexionTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdConexion") || sFormularioTipoBusqueda.equals("Todos")){
					if(conexionTemp!=null && jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion!=null) {
						jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setSelectedItem(conexionTemp);
					} else {
						if(jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion!=null) {
							//jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setSelectedItem(conexionTemp);
							if(jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.getItemCount()>0) {
								jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setSelectedIndex(0);
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

	public String getActualConexionForeignKeyDescripcion(Long idConexionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsForeignKey) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}


			sDescripcion=ConexionConstantesFunciones.getConexionDescripcion(conexionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualConexionForeignKeyGenerico(Long idConexionSeleccionado,JComboBox jComboBoxid_conexionTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			Conexion  conexionTemp=null;

			for(Conexion conexionAux:conexionsForeignKey) {
				if(conexionAux.getId()!=null && conexionAux.getId().equals(idConexionSeleccionado)) {
					conexionTemp=conexionAux;
					break;
				}
			}

			if(conexionTemp!=null) {
				jComboBoxid_conexionTarjetaCreditoConexionGenerico.setSelectedItem(conexionTemp);
			} else {
				if(jComboBoxid_conexionTarjetaCreditoConexionGenerico!=null && jComboBoxid_conexionTarjetaCreditoConexionGenerico.getItemCount()>0) {
					jComboBoxid_conexionTarjetaCreditoConexionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TarjetaCreditoConexion tarjetacreditoconexion,JComboBox jComboBoxid_empresaTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTarjetaCreditoConexionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTarjetaCreditoConexionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tarjetacreditoconexion.setid_empresa(empresaAux.getId());
				tarjetacreditoconexion.setempresa_descripcion(TarjetaCreditoConexionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tarjetacreditoconexion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TarjetaCreditoConexion tarjetacreditoconexion,JComboBox jComboBoxid_sucursalTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTarjetaCreditoConexionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTarjetaCreditoConexionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				tarjetacreditoconexion.setid_sucursal(sucursalAux.getId());
				tarjetacreditoconexion.setsucursal_descripcion(TarjetaCreditoConexionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				tarjetacreditoconexion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTarjetaCreditoForeignKey(TarjetaCreditoConexion tarjetacreditoconexion,JComboBox jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoAux=new TarjetaCredito();

			if(jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico==null) {
				tarjetacreditoAux=(TarjetaCredito)this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getSelectedItem();
			} else {
				tarjetacreditoAux=(TarjetaCredito)jComboBoxid_tarjeta_creditoTarjetaCreditoConexionGenerico.getSelectedItem();
			}

			if(tarjetacreditoAux!=null && tarjetacreditoAux.getId()!=null) {
				tarjetacreditoconexion.setid_tarjeta_credito(tarjetacreditoAux.getId());
				tarjetacreditoconexion.settarjetacredito_descripcion(TarjetaCreditoConexionConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacreditoAux));
				tarjetacreditoconexion.setTarjetaCredito(tarjetacreditoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarConexionForeignKey(TarjetaCreditoConexion tarjetacreditoconexion,JComboBox jComboBoxid_conexionTarjetaCreditoConexionGenerico)throws Exception
	{
		try
		{
			Conexion  conexionAux=new Conexion();

			if(jComboBoxid_conexionTarjetaCreditoConexionGenerico==null) {
				conexionAux=(Conexion)this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.getSelectedItem();
			} else {
				conexionAux=(Conexion)jComboBoxid_conexionTarjetaCreditoConexionGenerico.getSelectedItem();
			}

			if(conexionAux!=null && conexionAux.getId()!=null) {
				tarjetacreditoconexion.setid_conexion(conexionAux.getId());
				tarjetacreditoconexion.setconexion_descripcion(TarjetaCreditoConexionConstantesFunciones.getConexionDescripcion(conexionAux));
				tarjetacreditoconexion.setConexion(conexionAux);			}
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

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
					}

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
					}

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTarjetaCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTarjetaCredito=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.removeAllItems();

							for(TarjetaCredito tarjetacredito:this.tarjetacreditosForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.addItem(tarjetacredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
					}

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTarjetaCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.removeAllItems();

							for(TarjetaCredito tarjetacredito:this.tarjetacreditosForeignKey) {
								this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.addItem(tarjetacredito);
							}
						}

						if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameConexionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingConexion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.removeAllItems();

							for(Conexion conexion:this.conexionsForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.addItem(conexion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { 
					}

					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdConexion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.removeAllItems();

							for(Conexion conexion:this.conexionsForeignKey) {
								this.jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.addItem(conexion);
							}
						}

						if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTarjetaCreditoForeignKey(TarjetaCredito tarjetacredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setSelectedItem(tarjetacredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setSelectedItem(tarjetacredito);
						} else {
							this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameConexionForeignKey(Conexion conexion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setSelectedItem(conexion);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setSelectedItem(conexion);
						} else {
							this.jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTarjetaCreditoConexion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TarjetaCreditoConexionConstantesFunciones.refrescarForeignKeysDescripcionesTarjetaCreditoConexion(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TarjetaCreditoConexionConstantesFunciones.refrescarForeignKeysDescripcionesTarjetaCreditoConexion(this.tarjetacreditoconexions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TarjetaCredito.class));
		classes.add(new Classe(Conexion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tarjetacreditoconexionLogic.setTarjetaCreditoConexions(this.tarjetacreditoconexions);
			tarjetacreditoconexionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TarjetaCreditoConexionParameterReturnGeneral getTarjetaCreditoConexionParameterGeneral() {
		return this.tarjetacreditoconexionParameterGeneral;
	}
	
	public void setTarjetaCreditoConexionParameterGeneral(TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionParameterGeneral) {
		this.tarjetacreditoconexionParameterGeneral = tarjetacreditoconexionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTarjetaCreditoConexion() {
		return isPermisoTodoTarjetaCreditoConexion;
	}

	public void setIsPermisoTodoTarjetaCreditoConexion(Boolean isPermisoTodoTarjetaCreditoConexion) {
		this.isPermisoTodoTarjetaCreditoConexion = isPermisoTodoTarjetaCreditoConexion;
	}

	public Boolean getIsPermisoNuevoTarjetaCreditoConexion() {
		return isPermisoNuevoTarjetaCreditoConexion;
	}

	public void setIsPermisoNuevoTarjetaCreditoConexion(Boolean isPermisoNuevoTarjetaCreditoConexion) {
		this.isPermisoNuevoTarjetaCreditoConexion = isPermisoNuevoTarjetaCreditoConexion;
	}

	public Boolean getIsPermisoActualizarTarjetaCreditoConexion() {
		return isPermisoActualizarTarjetaCreditoConexion;
	}

	public void setIsPermisoActualizarTarjetaCreditoConexion(Boolean isPermisoActualizarTarjetaCreditoConexion) {
		this.isPermisoActualizarTarjetaCreditoConexion = isPermisoActualizarTarjetaCreditoConexion;
	}

	public Boolean getIsPermisoEliminarTarjetaCreditoConexion() {
		return isPermisoEliminarTarjetaCreditoConexion;
	}

	public void setIsPermisoEliminarTarjetaCreditoConexion(Boolean isPermisoEliminarTarjetaCreditoConexion) {
		this.isPermisoEliminarTarjetaCreditoConexion = isPermisoEliminarTarjetaCreditoConexion;
	}

	public Boolean getIsPermisoGuardarCambiosTarjetaCreditoConexion() {
		return isPermisoGuardarCambiosTarjetaCreditoConexion;
	}

	public void setIsPermisoGuardarCambiosTarjetaCreditoConexion(Boolean isPermisoGuardarCambiosTarjetaCreditoConexion) {
		this.isPermisoGuardarCambiosTarjetaCreditoConexion = isPermisoGuardarCambiosTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoConsultaTarjetaCreditoConexion() {
		return isPermisoConsultaTarjetaCreditoConexion;
	}

	public void setIsPermisoConsultaTarjetaCreditoConexion(Boolean isPermisoConsultaTarjetaCreditoConexion) {
		this.isPermisoConsultaTarjetaCreditoConexion = isPermisoConsultaTarjetaCreditoConexion;
	}

	public Boolean getIsPermisoBusquedaTarjetaCreditoConexion() {
		return isPermisoBusquedaTarjetaCreditoConexion;
	}

	public void setIsPermisoBusquedaTarjetaCreditoConexion(Boolean isPermisoBusquedaTarjetaCreditoConexion) {
		this.isPermisoBusquedaTarjetaCreditoConexion = isPermisoBusquedaTarjetaCreditoConexion;
	}

	public Boolean getIsPermisoReporteTarjetaCreditoConexion() {
		return isPermisoReporteTarjetaCreditoConexion;
	}

	public void setIsPermisoReporteTarjetaCreditoConexion(Boolean isPermisoReporteTarjetaCreditoConexion) {
		this.isPermisoReporteTarjetaCreditoConexion = isPermisoReporteTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTarjetaCreditoConexion() {
		return isPermisoPaginacionMedioTarjetaCreditoConexion;
	}

	public void setIsPermisoPaginacionMedioTarjetaCreditoConexion(Boolean isPermisoPaginacionMedioTarjetaCreditoConexion) {
		this.isPermisoPaginacionMedioTarjetaCreditoConexion = isPermisoPaginacionMedioTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTarjetaCreditoConexion() {
		return isPermisoPaginacionTodoTarjetaCreditoConexion;
	}

	public void setIsPermisoPaginacionTodoTarjetaCreditoConexion(Boolean isPermisoPaginacionTodoTarjetaCreditoConexion) {
		this.isPermisoPaginacionTodoTarjetaCreditoConexion = isPermisoPaginacionTodoTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTarjetaCreditoConexion() {
		return isPermisoPaginacionAltoTarjetaCreditoConexion;
	}

	public void setIsPermisoPaginacionAltoTarjetaCreditoConexion(Boolean isPermisoPaginacionAltoTarjetaCreditoConexion) {
		this.isPermisoPaginacionAltoTarjetaCreditoConexion = isPermisoPaginacionAltoTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoCopiarTarjetaCreditoConexion() {
		return isPermisoCopiarTarjetaCreditoConexion;
	}

	public void setIsPermisoCopiarTarjetaCreditoConexion(Boolean isPermisoCopiarTarjetaCreditoConexion) {
		this.isPermisoCopiarTarjetaCreditoConexion = isPermisoCopiarTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoVerFormTarjetaCreditoConexion() {
		return isPermisoVerFormTarjetaCreditoConexion;
	}

	public void setIsPermisoVerFormTarjetaCreditoConexion(Boolean isPermisoVerFormTarjetaCreditoConexion) {
		this.isPermisoVerFormTarjetaCreditoConexion = isPermisoVerFormTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoDuplicarTarjetaCreditoConexion() {
		return isPermisoDuplicarTarjetaCreditoConexion;
	}

	public void setIsPermisoDuplicarTarjetaCreditoConexion(Boolean isPermisoDuplicarTarjetaCreditoConexion) {
		this.isPermisoDuplicarTarjetaCreditoConexion = isPermisoDuplicarTarjetaCreditoConexion;
	}
	
	public Boolean getIsPermisoOrdenTarjetaCreditoConexion() {
		return isPermisoOrdenTarjetaCreditoConexion;
	}

	public void setIsPermisoOrdenTarjetaCreditoConexion(Boolean isPermisoOrdenTarjetaCreditoConexion) {
		this.isPermisoOrdenTarjetaCreditoConexion = isPermisoOrdenTarjetaCreditoConexion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTarjetaCreditoConexion() {
		return isVisibilidadCeldaNuevoTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaNuevoTarjetaCreditoConexion(Boolean isVisibilidadCeldaNuevoTarjetaCreditoConexion) {
		this.isVisibilidadCeldaNuevoTarjetaCreditoConexion = isVisibilidadCeldaNuevoTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTarjetaCreditoConexion() {
		return isVisibilidadCeldaDuplicarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaDuplicarTarjetaCreditoConexion(Boolean isVisibilidadCeldaDuplicarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion = isVisibilidadCeldaDuplicarTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTarjetaCreditoConexion() {
		return isVisibilidadCeldaCopiarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaCopiarTarjetaCreditoConexion(Boolean isVisibilidadCeldaCopiarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaCopiarTarjetaCreditoConexion = isVisibilidadCeldaCopiarTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTarjetaCreditoConexion() {
		return isVisibilidadCeldaVerFormTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaVerFormTarjetaCreditoConexion(Boolean isVisibilidadCeldaVerFormTarjetaCreditoConexion) {
		this.isVisibilidadCeldaVerFormTarjetaCreditoConexion = isVisibilidadCeldaVerFormTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTarjetaCreditoConexion() {
		return isVisibilidadCeldaOrdenTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaOrdenTarjetaCreditoConexion(Boolean isVisibilidadCeldaOrdenTarjetaCreditoConexion) {
		this.isVisibilidadCeldaOrdenTarjetaCreditoConexion = isVisibilidadCeldaOrdenTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion() {
		return isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion(Boolean isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion) {
		this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion = isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTarjetaCreditoConexion() {
		return isVisibilidadCeldaModificarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaModificarTarjetaCreditoConexion(Boolean isVisibilidadCeldaModificarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaModificarTarjetaCreditoConexion = isVisibilidadCeldaModificarTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTarjetaCreditoConexion() {
		return isVisibilidadCeldaActualizarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaActualizarTarjetaCreditoConexion(Boolean isVisibilidadCeldaActualizarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaActualizarTarjetaCreditoConexion = isVisibilidadCeldaActualizarTarjetaCreditoConexion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTarjetaCreditoConexion() {
		return isVisibilidadCeldaEliminarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaEliminarTarjetaCreditoConexion(Boolean isVisibilidadCeldaEliminarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaEliminarTarjetaCreditoConexion = isVisibilidadCeldaEliminarTarjetaCreditoConexion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTarjetaCreditoConexion() {
		return isVisibilidadCeldaCancelarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaCancelarTarjetaCreditoConexion(Boolean isVisibilidadCeldaCancelarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaCancelarTarjetaCreditoConexion = isVisibilidadCeldaCancelarTarjetaCreditoConexion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTarjetaCreditoConexion() {
		return isVisibilidadCeldaGuardarTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaGuardarTarjetaCreditoConexion(Boolean isVisibilidadCeldaGuardarTarjetaCreditoConexion) {
		this.isVisibilidadCeldaGuardarTarjetaCreditoConexion = isVisibilidadCeldaGuardarTarjetaCreditoConexion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion() {
		return isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion(Boolean isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion) {
		this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion = isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion;
	}
		
	public TarjetaCreditoConexionSessionBean gettarjetacreditoconexionSessionBean() {
		return this.tarjetacreditoconexionSessionBean;
	}
	
	public void settarjetacreditoconexionSessionBean(TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean) {
		this.tarjetacreditoconexionSessionBean=tarjetacreditoconexionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdConexion() {
		return this.isVisibilidadFK_IdConexion;
	}

	public void setisVisibilidadFK_IdConexion(Boolean isVisibilidadFK_IdConexion) {
		this.isVisibilidadFK_IdConexion=isVisibilidadFK_IdConexion;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTarjetaCredito() {
		return this.isVisibilidadFK_IdTarjetaCredito;
	}

	public void setisVisibilidadFK_IdTarjetaCredito(Boolean isVisibilidadFK_IdTarjetaCredito) {
		this.isVisibilidadFK_IdTarjetaCredito=isVisibilidadFK_IdTarjetaCredito;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tarjetacreditoconexion,null);
				this.setActualParaGuardarSucursalForeignKey(tarjetacreditoconexion,null);
				this.setActualParaGuardarTarjetaCreditoForeignKey(tarjetacreditoconexion,null);
				this.setActualParaGuardarConexionForeignKey(tarjetacreditoconexion,null);
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
	
	public void bugActualizarReferenciaActual(TarjetaCreditoConexion tarjetacreditoconexion,TarjetaCreditoConexion tarjetacreditoconexionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTarjetaCreditoConexion(tarjetacreditoconexion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tarjetacreditoconexionAux.setId(tarjetacreditoconexion.getId());
		tarjetacreditoconexionAux.setVersionRow(tarjetacreditoconexion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTarjetaCreditoConexion();
		
			int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tarjetacreditoconexionValidator.getInvalidValues(this.tarjetacreditoconexion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tarjetacreditoconexionLogic.setDatosCliente(datosCliente);
			tarjetacreditoconexionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tarjetacreditoconexionAux=new  TarjetaCreditoConexion();
				
				tarjetacreditoconexionAux.setIsNew(true);
				tarjetacreditoconexionAux.setIsChanged(true);
				
				tarjetacreditoconexionAux.setTarjetaCreditoConexionOriginal(this.tarjetacreditoconexion);
				
				tarjetacreditoconexionAux.setId(this.tarjetacreditoconexion.getId());	
				tarjetacreditoconexionAux.setVersionRow(this.tarjetacreditoconexion.getVersionRow());	
				tarjetacreditoconexionAux.setid_empresa(this.tarjetacreditoconexion.getid_empresa());	
				tarjetacreditoconexionAux.setid_sucursal(this.tarjetacreditoconexion.getid_sucursal());	
				tarjetacreditoconexionAux.setid_tarjeta_credito(this.tarjetacreditoconexion.getid_tarjeta_credito());	
				tarjetacreditoconexionAux.setid_conexion(this.tarjetacreditoconexion.getid_conexion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.saveTarjetaCreditoConexions();//WithConnection
						//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tarjetacreditoconexion,tarjetacreditoconexionAux);
					
					this.refrescarForeignKeysDescripcionesTarjetaCreditoConexion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tarjetacreditoconexionLogic.saveTarjetaCreditoConexionRelaciones(tarjetacreditoconexionAux);//WithConnection
								//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tarjetacreditoconexion,tarjetacreditoconexionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tarjetacreditoconexion,tarjetacreditoconexionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tarjetacreditoconexionAux=new  TarjetaCreditoConexion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() 
					|| (this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() && this.tarjetacreditoconexion.getId()>=0)) {
						
					tarjetacreditoconexionAux.setIsNew(false);
				}
				
				tarjetacreditoconexionAux.setIsDeleted(false);
			
				tarjetacreditoconexionAux.setId(this.tarjetacreditoconexion.getId());	
				tarjetacreditoconexionAux.setVersionRow(this.tarjetacreditoconexion.getVersionRow());	
				tarjetacreditoconexionAux.setid_empresa(this.tarjetacreditoconexion.getid_empresa());	
				tarjetacreditoconexionAux.setid_sucursal(this.tarjetacreditoconexion.getid_sucursal());	
				tarjetacreditoconexionAux.setid_tarjeta_credito(this.tarjetacreditoconexion.getid_tarjeta_credito());	
				tarjetacreditoconexionAux.setid_conexion(this.tarjetacreditoconexion.getid_conexion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.saveTarjetaCreditoConexions();//WithConnection
						//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tarjetacreditoconexion,tarjetacreditoconexionAux);
					
					this.refrescarForeignKeysDescripcionesTarjetaCreditoConexion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tarjetacreditoconexionLogic.saveTarjetaCreditoConexionRelaciones(tarjetacreditoconexionAux);//WithConnection
								//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tarjetacreditoconexion,tarjetacreditoconexionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tarjetacreditoconexion,tarjetacreditoconexionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tarjetacreditoconexionAux=new  TarjetaCreditoConexion();
				
				tarjetacreditoconexionAux.setIsNew(false);
				tarjetacreditoconexionAux.setIsChanged(false);
				
				tarjetacreditoconexionAux.setIsDeleted(true);
				
				tarjetacreditoconexionAux.setId(this.tarjetacreditoconexion.getId());	
				tarjetacreditoconexionAux.setVersionRow(this.tarjetacreditoconexion.getVersionRow());	
				tarjetacreditoconexionAux.setid_empresa(this.tarjetacreditoconexion.getid_empresa());	
				tarjetacreditoconexionAux.setid_sucursal(this.tarjetacreditoconexion.getid_sucursal());	
				tarjetacreditoconexionAux.setid_tarjeta_credito(this.tarjetacreditoconexion.getid_tarjeta_credito());	
				tarjetacreditoconexionAux.setid_conexion(this.tarjetacreditoconexion.getid_conexion());	
				
				if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tarjetacreditoconexionAux.getId()>=0) {	
						this.tarjetacreditoconexionsEliminados.add(tarjetacreditoconexionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.saveTarjetaCreditoConexions();//WithConnection
						//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tarjetacreditoconexionLogic.saveTarjetaCreditoConexionRelaciones(tarjetacreditoconexionAux);//WithConnection
								//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tarjetacreditoconexionAux,tarjetacreditoconexions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(this.tarjetacreditoconexionsEliminados);
					
					tarjetacreditoconexionLogic.saveTarjetaCreditoConexions();//WithConnection
					//tarjetacreditoconexionLogic.getSetVersionRowTarjetaCreditoConexions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTarjetaCreditoConexion();
				
				this.tarjetacreditoconexionsEliminados= new ArrayList<TarjetaCreditoConexion>();		
			}
			
			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tarjeta Credito Conexion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tarjetacreditoconexion=tarjetacreditoconexionAux;
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
      		//this.finishProcessTarjetaCreditoConexion();
      	}
		
	}	
	
	public void actualizarRelaciones(TarjetaCreditoConexion tarjetacreditoconexionLocal) throws Exception {
		
		if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TarjetaCreditoConexion tarjetacreditoconexionLocal) throws Exception {	
		if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tarjetacreditoconexionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				tarjetacreditoconexionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TarjetaCreditoDetalleFormJInternalFrame.class)) {
				TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrameLocal=(TarjetaCreditoBeanSwingJInternalFrame) ((TarjetaCreditoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tarjetacreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTarjetaCredito(tarjetacreditoBeanSwingJInternalFrameLocal.gettarjetacredito(),true);
				tarjetacreditoBeanSwingJInternalFrameLocal.actualizarLista(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito,this.tarjetacreditosForeignKey);

				tarjetacreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito);

				tarjetacreditoconexionLocal.setTarjetaCredito(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito);

				this.addItemDefectoCombosForeignKeyTarjetaCredito();
				this.cargarCombosFrameTarjetaCreditosForeignKey("Formulario");
				this.setActualTarjetaCreditoForeignKey(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ConexionDetalleFormJInternalFrame.class)) {
				ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrameLocal=(ConexionBeanSwingJInternalFrame) ((ConexionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				conexionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoConexion(conexionBeanSwingJInternalFrameLocal.getconexion(),true);
				conexionBeanSwingJInternalFrameLocal.actualizarLista(conexionBeanSwingJInternalFrameLocal.conexion,this.conexionsForeignKey);

				conexionBeanSwingJInternalFrameLocal.actualizarRelaciones(conexionBeanSwingJInternalFrameLocal.conexion);

				tarjetacreditoconexionLocal.setConexion(conexionBeanSwingJInternalFrameLocal.conexion);

				this.addItemDefectoCombosForeignKeyConexion();
				this.cargarCombosFrameConexionsForeignKey("Formulario");
				this.setActualConexionForeignKey(conexionBeanSwingJInternalFrameLocal.conexion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTarjetaCreditoConexionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tarjetacreditoconexionValidator.getInvalidValues(this.tarjetacreditoconexion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TarjetaCreditoConexion tarjetacreditoconexion,List<TarjetaCreditoConexion> tarjetacreditoconexions) throws Exception {
		try	{		
			TarjetaCreditoConexionConstantesFunciones.actualizarLista(tarjetacreditoconexion,tarjetacreditoconexions,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TarjetaCreditoConexion tarjetacreditoconexion,List<TarjetaCreditoConexion> tarjetacreditoconexions) throws Exception {
		try	{			
			TarjetaCreditoConexionConstantesFunciones.actualizarSelectedLista(tarjetacreditoconexion,tarjetacreditoconexions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TarjetaCreditoConexion> tarjetacreditoconexionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tarjetacreditoconexionsLocal=this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tarjetacreditoconexionsLocal=this.tarjetacreditoconexions;
			}
			//ARCHITECTURE
		
			for(TarjetaCreditoConexion tarjetacreditoconexionLocal:tarjetacreditoconexionsLocal) {
				if(this.permiteMantenimiento(tarjetacreditoconexionLocal) && tarjetacreditoconexionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TarjetaCreditoConexionConstantesFunciones.getTarjetaCreditoConexionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TarjetaCreditoConexionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_empresaTarjetaCreditoConexion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoConexionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_sucursalTarjetaCreditoConexion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoConexionConstantesFunciones.IDTARJETACREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_tarjeta_creditoTarjetaCreditoConexion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoConexionConstantesFunciones.IDCONEXION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_conexionTarjetaCreditoConexion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_empresaTarjetaCreditoConexion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_sucursalTarjetaCreditoConexion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_tarjeta_creditoTarjetaCreditoConexion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelid_conexionTarjetaCreditoConexion,"");
		
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
		this.iIdNuevoTarjetaCreditoConexion--;	
		
		
		this.tarjetacreditoconexionAux=new TarjetaCreditoConexion();
		
		this.tarjetacreditoconexionAux.setId(this.iIdNuevoTarjetaCreditoConexion);
		this.tarjetacreditoconexionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().add(this.tarjetacreditoconexionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tarjetacreditoconexions.add(this.tarjetacreditoconexionAux);
		}
		//ARCHITECTURE
		
		this.tarjetacreditoconexion=this.tarjetacreditoconexionAux;
		
		if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexion);
			this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoConexion(this.tarjetacreditoconexion);
		}
				
		//this.setDefaultControlesTarjetaCreditoConexion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTarjetaCreditoConexion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTarjetaCreditoConexion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetaCreditoConexion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexionBean,this.tarjetacreditoconexion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
			classes=TarjetaCreditoConexionConstantesFunciones.getClassesRelationshipsOfTarjetaCreditoConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tarjetacreditoconexionReturnGeneral=tarjetacreditoconexionLogic.procesarEventosTarjetaCreditoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.tarjetacreditoconexion,this.tarjetacreditoconexionParameterGeneral,this.isEsNuevoTarjetaCreditoConexion,classes);//this.tarjetacreditoconexionLogic.getTarjetaCreditoConexion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral,this.tarjetacreditoconexionBean,false);
		
		if(this.tarjetacreditoconexionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion());
		}
		
		if(this.tarjetacreditoconexionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion(),classes);//this.tarjetacreditoconexionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTarjetaCreditoConexion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTarjetaCreditoConexion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.RecargarFormTarjetaCreditoConexion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
						
			if(tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetaCreditoConexion();
			}
			
			this.actualizarVisualTableDatosTarjetaCreditoConexion();
			
			this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoConexion(), this.getIndiceNuevoTarjetaCreditoConexion());
			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
						
			this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTarjetaCreditoConexion(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setEnabled(isHabilitar && this.tarjetacreditoconexionConstantesFunciones.activarid_empresaTarjetaCreditoConexion);//
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setEnabled(isHabilitar && this.tarjetacreditoconexionConstantesFunciones.activarid_sucursalTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setEnabled(isHabilitar && this.tarjetacreditoconexionConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setEnabled(isHabilitar && this.tarjetacreditoconexionConstantesFunciones.activarid_conexionTarjetaCreditoConexion);
	};
	
	public void setDefaultControlesTarjetaCreditoConexion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTarjetaCreditoConexion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(true);			
			this.tarjetacreditoconexionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.setVisible(true);
			
					
		} else {
			//this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(false);			
			this.tarjetacreditoconexionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTarjetaCreditoConexion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
				if(tarjetacreditoconexionAux.getId().equals(this.iIdNuevoTarjetaCreditoConexion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexions) {
				if(tarjetacreditoconexionAux.getId().equals(this.iIdNuevoTarjetaCreditoConexion)) {
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
	
	public int getIndiceActualTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
				if(tarjetacreditoconexionAux.getId().equals(tarjetacreditoconexion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexions) {
				if(tarjetacreditoconexionAux.getId().equals(tarjetacreditoconexion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
				if(tarjetacreditoconexionAux.getTarjetaCreditoConexionOriginal().getId().equals(tarjetacreditoconexionOriginal.getId())) {
					existe=true;
					tarjetacreditoconexionOriginal.setId(tarjetacreditoconexionAux.getId());
					tarjetacreditoconexionOriginal.setVersionRow(tarjetacreditoconexionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexions) {
				if(tarjetacreditoconexionAux.getTarjetaCreditoConexionOriginal().getId().equals(tarjetacreditoconexionOriginal.getId())) {
					existe=true;
					tarjetacreditoconexionOriginal.setId(tarjetacreditoconexionAux.getId());
					tarjetacreditoconexionOriginal.setVersionRow(tarjetacreditoconexionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTarjetaCreditoConexion(Boolean esParaCancelar) throws Exception {
		tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
		tarjetacreditoconexionAux=new TarjetaCreditoConexion();
		
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
					if(tarjetacreditoconexionAux.getId()<0) {
						tarjetacreditoconexionsAux.add(tarjetacreditoconexionAux);
					}		
				}
				this.iIdNuevoTarjetaCreditoConexion=0L;
				this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().removeAll(tarjetacreditoconexionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexions) {
					if(tarjetacreditoconexionAux.getId()<0) {
						tarjetacreditoconexionsAux.add(tarjetacreditoconexionAux);
					}		
				}
				this.iIdNuevoTarjetaCreditoConexion=0L;
				this.tarjetacreditoconexions.removeAll(tarjetacreditoconexionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTarjetaCreditoConexion 
					&& this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()>0
					) {
					tarjetacreditoconexionAux=this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().get(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size() - 1);
				
					if(tarjetacreditoconexionAux.getId()<0) {
						this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().remove(tarjetacreditoconexionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTarjetaCreditoConexion && this.tarjetacreditoconexions.size()>0) {
					tarjetacreditoconexionAux=this.tarjetacreditoconexions.get(this.tarjetacreditoconexions.size() - 1);
				
					if(tarjetacreditoconexionAux.getId()<0) {
						this.tarjetacreditoconexions.remove(tarjetacreditoconexionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTarjetaCreditoConexion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tarjetacreditoconexion.getId()<0) {
				this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().remove(this.tarjetacreditoconexion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tarjetacreditoconexion.getId()<0) {
				this.tarjetacreditoconexions.remove(this.tarjetacreditoconexion);
			}
		}			
	}
	
	public void setEstadosInicialesTarjetaCreditoConexion(List<TarjetaCreditoConexion> tarjetacreditoconexionsAux) throws Exception {
		TarjetaCreditoConexionConstantesFunciones.setEstadosInicialesTarjetaCreditoConexion(tarjetacreditoconexionsAux);
	}
	
	public void setEstadosInicialesTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexionAux) throws Exception {
		TarjetaCreditoConexionConstantesFunciones.setEstadosInicialesTarjetaCreditoConexion(tarjetacreditoconexionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTarjetaCreditoConexionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTarjetaCreditoConexionActual()) {
				if(!this.isEsNuevoTarjetaCreditoConexion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTarjetaCreditoConexion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTarjetaCreditoConexionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tarjeta Credito Conexion ?", "MANTENIMIENTO DE Tarjeta Credito Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TarjetaCreditoConexion tarjetacreditoconexion) throws Exception {
		TarjetaCreditoConexionConstantesFunciones.seleccionarAsignar(this.tarjetacreditoconexion,tarjetacreditoconexion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTarjetaCreditoConexion=this.isPermisoActualizarOriginalTarjetaCreditoConexion;
			
			
			this.seleccionarAsignar(tarjetacreditoconexion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TarjetaCreditoConexionConstantesFunciones.quitarEspaciosTarjetaCreditoConexion(this.tarjetacreditoconexion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tarjetacreditoconexionSessionBean.setsFuncionBusquedaRapida(this.tarjetacreditoconexionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTarjetaCreditoConexion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTarjetaCreditoConexion(esParaCancelar);				
				this.cancelarNuevoTarjetaCreditoConexion(esParaCancelar);								
			}
			
			this.tarjetacreditoconexion=new TarjetaCreditoConexion();
			
			this.inicializarTarjetaCreditoConexion();
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTarjetaCreditoConexion() throws Exception {
		try {
			TarjetaCreditoConexionConstantesFunciones.inicializarTarjetaCreditoConexion(this.tarjetacreditoconexion);
			
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
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTarjetaCreditoConexions(String sAccionBusqueda,List<TarjetaCreditoConexion> tarjetacreditoconexionsParaReportes) throws Exception {
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
					sPathReporteFinal="TarjetaCreditoConexion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TarjetaCreditoConexionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TarjetaCreditoConexionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TarjetaCreditoConexion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tarjeta Credito Conexiones");		
		parameters.put("busquedapor", TarjetaCreditoConexionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTarjetaCreditoConexion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TarjetaCreditoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TarjetaCreditoConexionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTarjetaCreditoConexion=new JRBeanArrayDataSource(TarjetaCreditoConexionJInternalFrame.TraerTarjetaCreditoConexionBeans(tarjetacreditoconexionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTarjetaCreditoConexion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TarjetaCreditoConexionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TarjetaCreditoConexionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TarjetaCreditoConexionBean.TraerTarjetaCreditoConexionBeans(tarjetacreditoconexionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTarjetaCreditoConexions(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditoconexionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTarjetaCreditoConexions(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditoconexionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexionActionPerformed(null);
					//this.generarExcelReporteTarjetaCreditoConexions(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditoconexionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTarjetaCreditoConexions(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditoconexionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTarjetaCreditoConexions(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditoconexionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTarjetaCreditoConexions(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditoconexionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTarjetaCreditoConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetaCreditoConexion> tarjetacreditoconexionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetaCreditoConexions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTarjetaCreditoConexion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TarjetaCreditoConexion tarjetacreditoconexion : tarjetacreditoconexionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TarjetaCreditoConexionConstantesFunciones.generarExcelReporteDataTarjetaCreditoConexion("NORMAL",row,workbook,tarjetacreditoconexion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTarjetaCreditoConexion(String sTipo,Row row,Workbook workbook) {
		
		TarjetaCreditoConexionConstantesFunciones.generarExcelReporteHeaderTarjetaCreditoConexion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTarjetaCreditoConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetaCreditoConexion> tarjetacreditoconexionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetaCreditoConexions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TarjetaCreditoConexion tarjetacreditoconexion : tarjetacreditoconexionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.getTarjetaCreditoConexionDescripcion(tarjetacreditoconexion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditoconexion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditoconexion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditoconexion.gettarjetacredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditoconexion.getconexion_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTarjetaCreditoConexions(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetaCreditoConexion> tarjetacreditoconexionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TarjetaCreditoConexion> tarjetacreditoconexionsRespaldo=null;
		
		classes=TarjetaCreditoConexionConstantesFunciones.getClassesRelationshipsOfTarjetaCreditoConexion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tarjetacreditoconexionLogic.setDatosCliente(this.datosCliente);
		this.tarjetacreditoconexionLogic.setDatosDeep(this.datosDeep);
		this.tarjetacreditoconexionLogic.setIsConDeep(true);
		
		tarjetacreditoconexionsRespaldo=this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions();
		
		this.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(tarjetacreditoconexionsParaReportes);	
		this.tarjetacreditoconexionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tarjetacreditoconexionsParaReportes=this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions();
		this.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(tarjetacreditoconexionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetaCreditoConexions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTarjetaCreditoConexion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TarjetaCreditoConexion tarjetacreditoconexion : tarjetacreditoconexionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTarjetaCreditoConexion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TarjetaCreditoConexionConstantesFunciones.generarExcelReporteDataTarjetaCreditoConexion("NORMAL",row,workbook,tarjetacreditoconexion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.getTarjetaCreditoConexionDescripcion(tarjetacreditoconexion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTarjetaCreditoConexion() throws Exception {		
		this.startProcessTarjetaCreditoConexion(true);
	}
	
	public void startProcessTarjetaCreditoConexion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTarjetaCreditoConexion ,this.jPanelParametrosReportesTarjetaCreditoConexion, this.jScrollPanelDatosTarjetaCreditoConexion,this.jPanelPaginacionTarjetaCreditoConexion, this.jScrollPanelDatosEdicionTarjetaCreditoConexion, this.jPanelAccionesTarjetaCreditoConexion,this.jPanelAccionesFormularioTarjetaCreditoConexion,this.jmenuBarTarjetaCreditoConexion,this.jmenuBarDetalleTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,this.jTtoolBarDetalleTarjetaCreditoConexion);		
		
		final JTabbedPane jTabbedPaneBusquedasTarjetaCreditoConexion=this.jTabbedPaneBusquedasTarjetaCreditoConexion; 
		
		final JPanel jPanelParametrosReportesTarjetaCreditoConexion=this.jPanelParametrosReportesTarjetaCreditoConexion;
		//final JScrollPane jScrollPanelDatosTarjetaCreditoConexion=this.jScrollPanelDatosTarjetaCreditoConexion;
		final JTable jTableDatosTarjetaCreditoConexion=this.jTableDatosTarjetaCreditoConexion;		
		final JPanel jPanelPaginacionTarjetaCreditoConexion=this.jPanelPaginacionTarjetaCreditoConexion;
		//final JScrollPane jScrollPanelDatosEdicionTarjetaCreditoConexion=this.jScrollPanelDatosEdicionTarjetaCreditoConexion;
		final JPanel jPanelAccionesTarjetaCreditoConexion=this.jPanelAccionesTarjetaCreditoConexion;
		
		JPanel jPanelCamposAuxiliarTarjetaCreditoConexion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTarjetaCreditoConexion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			jPanelCamposAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelCamposTarjetaCreditoConexion;
			jPanelAccionesFormularioAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelAccionesFormularioTarjetaCreditoConexion;
		}
		
		final JPanel jPanelCamposTarjetaCreditoConexion=jPanelCamposAuxiliarTarjetaCreditoConexion;
		final JPanel jPanelAccionesFormularioTarjetaCreditoConexion=jPanelAccionesFormularioAuxiliarTarjetaCreditoConexion;
		
		
		final JMenuBar jmenuBarTarjetaCreditoConexion=this.jmenuBarTarjetaCreditoConexion;
		final JToolBar jTtoolBarTarjetaCreditoConexion=this.jTtoolBarTarjetaCreditoConexion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTarjetaCreditoConexion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTarjetaCreditoConexion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			jmenuBarDetalleAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jmenuBarDetalleTarjetaCreditoConexion;
			jTtoolBarDetalleAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTtoolBarDetalleTarjetaCreditoConexion;
		}
		
		final JMenuBar jmenuBarDetalleTarjetaCreditoConexion=jmenuBarDetalleAuxiliarTarjetaCreditoConexion;
		final JToolBar jTtoolBarDetalleTarjetaCreditoConexion=jTtoolBarDetalleAuxiliarTarjetaCreditoConexion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTarjetaCreditoConexion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTarjetaCreditoConexion;
			processRunnable.jTableDatos=jTableDatosTarjetaCreditoConexion;
			processRunnable.jPanelCampos=jPanelCamposTarjetaCreditoConexion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTarjetaCreditoConexion;
			processRunnable.jPanelAcciones=jPanelAccionesTarjetaCreditoConexion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTarjetaCreditoConexion;
			
			
			processRunnable.jmenuBar=jmenuBarTarjetaCreditoConexion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTarjetaCreditoConexion;
			processRunnable.jTtoolBar=jTtoolBarTarjetaCreditoConexion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTarjetaCreditoConexion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTarjetaCreditoConexion ,jPanelParametrosReportesTarjetaCreditoConexion,jTableDatosTarjetaCreditoConexion, /*jScrollPanelDatosTarjetaCreditoConexion,*/jPanelCamposTarjetaCreditoConexion,jPanelPaginacionTarjetaCreditoConexion, /*jScrollPanelDatosEdicionTarjetaCreditoConexion,*/ jPanelAccionesTarjetaCreditoConexion,jPanelAccionesFormularioTarjetaCreditoConexion,jmenuBarTarjetaCreditoConexion,jmenuBarDetalleTarjetaCreditoConexion,jTtoolBarTarjetaCreditoConexion,jTtoolBarDetalleTarjetaCreditoConexion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTarjetaCreditoConexion ,jPanelParametrosReportesTarjetaCreditoConexion, jScrollPanelDatosTarjetaCreditoConexion,jPanelPaginacionTarjetaCreditoConexion, jScrollPanelDatosEdicionTarjetaCreditoConexion, jPanelAccionesTarjetaCreditoConexion,jPanelAccionesFormularioTarjetaCreditoConexion,jmenuBarTarjetaCreditoConexion,jmenuBarDetalleTarjetaCreditoConexion,jTtoolBarTarjetaCreditoConexion,jTtoolBarDetalleTarjetaCreditoConexion);
						
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
	
	public void finishProcessTarjetaCreditoConexion() {// throws Exception 
		this.finishProcessTarjetaCreditoConexion(true);
	}
	
	public void finishProcessTarjetaCreditoConexion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTarjetaCreditoConexion ,this.jPanelParametrosReportesTarjetaCreditoConexion, this.jScrollPanelDatosTarjetaCreditoConexion,this.jPanelPaginacionTarjetaCreditoConexion, this.jScrollPanelDatosEdicionTarjetaCreditoConexion, this.jPanelAccionesTarjetaCreditoConexion,this.jPanelAccionesFormularioTarjetaCreditoConexion,this.jmenuBarTarjetaCreditoConexion,this.jmenuBarDetalleTarjetaCreditoConexion,this.jTtoolBarTarjetaCreditoConexion,this.jTtoolBarDetalleTarjetaCreditoConexion);		
		
		final JTabbedPane jTabbedPaneBusquedasTarjetaCreditoConexion=this.jTabbedPaneBusquedasTarjetaCreditoConexion; 
		
		final JPanel jPanelParametrosReportesTarjetaCreditoConexion=this.jPanelParametrosReportesTarjetaCreditoConexion;
		//final JScrollPane jScrollPanelDatosTarjetaCreditoConexion=this.jScrollPanelDatosTarjetaCreditoConexion;
		final JTable jTableDatosTarjetaCreditoConexion=this.jTableDatosTarjetaCreditoConexion;		
		final JPanel jPanelPaginacionTarjetaCreditoConexion=this.jPanelPaginacionTarjetaCreditoConexion;
		//final JScrollPane jScrollPanelDatosEdicionTarjetaCreditoConexion=this.jScrollPanelDatosEdicionTarjetaCreditoConexion;
		final JPanel jPanelAccionesTarjetaCreditoConexion=this.jPanelAccionesTarjetaCreditoConexion;
		
		JPanel jPanelCamposAuxiliarTarjetaCreditoConexion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTarjetaCreditoConexion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			jPanelCamposAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelCamposTarjetaCreditoConexion;
			jPanelAccionesFormularioAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelAccionesFormularioTarjetaCreditoConexion;
		}
		
		final JPanel jPanelCamposTarjetaCreditoConexion=jPanelCamposAuxiliarTarjetaCreditoConexion;
		final JPanel jPanelAccionesFormularioTarjetaCreditoConexion=jPanelAccionesFormularioAuxiliarTarjetaCreditoConexion;
		
		
		final JMenuBar jmenuBarTarjetaCreditoConexion=this.jmenuBarTarjetaCreditoConexion;		
		final JToolBar jTtoolBarTarjetaCreditoConexion=this.jTtoolBarTarjetaCreditoConexion;
				
		JMenuBar jmenuBarDetalleAuxiliarTarjetaCreditoConexion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTarjetaCreditoConexion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			jmenuBarDetalleAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jmenuBarDetalleTarjetaCreditoConexion;
			jTtoolBarDetalleAuxiliarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTtoolBarDetalleTarjetaCreditoConexion;		
		}
		
		final JMenuBar jmenuBarDetalleTarjetaCreditoConexion=jmenuBarDetalleAuxiliarTarjetaCreditoConexion;
		final JToolBar jTtoolBarDetalleTarjetaCreditoConexion=jTtoolBarDetalleAuxiliarTarjetaCreditoConexion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTarjetaCreditoConexion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTarjetaCreditoConexion;
			processRunnable.jTableDatos=jTableDatosTarjetaCreditoConexion;
			processRunnable.jPanelCampos=jPanelCamposTarjetaCreditoConexion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTarjetaCreditoConexion;
			processRunnable.jPanelAcciones=jPanelAccionesTarjetaCreditoConexion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTarjetaCreditoConexion;
			
			
			processRunnable.jmenuBar=jmenuBarTarjetaCreditoConexion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTarjetaCreditoConexion;
			processRunnable.jTtoolBar=jTtoolBarTarjetaCreditoConexion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTarjetaCreditoConexion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTarjetaCreditoConexion ,jPanelParametrosReportesTarjetaCreditoConexion, jTableDatosTarjetaCreditoConexion,/*jScrollPanelDatosTarjetaCreditoConexion,*/jPanelCamposTarjetaCreditoConexion,jPanelPaginacionTarjetaCreditoConexion, /*jScrollPanelDatosEdicionTarjetaCreditoConexion,*/ jPanelAccionesTarjetaCreditoConexion,jPanelAccionesFormularioTarjetaCreditoConexion,jmenuBarTarjetaCreditoConexion,jmenuBarDetalleTarjetaCreditoConexion,jTtoolBarTarjetaCreditoConexion,jTtoolBarDetalleTarjetaCreditoConexion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTarjetaCreditoConexion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTarjetaCreditoConexion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTarjetaCreditoConexion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTarjetaCreditoConexion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTarjetaCreditoConexion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTarjetaCreditoConexion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTarjetaCreditoConexion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTarjetaCreditoConexion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTarjetaCreditoConexion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tarjetacreditoconexionConstantesFunciones.getsFinalQueryTarjetaCreditoConexion();
		String  finalQueryPaginacionTodos=this.tarjetacreditoconexionConstantesFunciones.getsFinalQueryTarjetaCreditoConexion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TarjetaCreditoConexionConstantesFunciones.getArrayColumnasGlobalesNoTarjetaCreditoConexion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TarjetaCreditoConexionConstantesFunciones.getArrayColumnasGlobalesTarjetaCreditoConexion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TarjetaCreditoConexionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tarjetacreditoconexionsEliminados= new ArrayList<TarjetaCreditoConexion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTarjetaCreditoConexion();
		
				///*TarjetaCreditoConexionSessionBean*/this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			
			if(this.tarjetacreditoconexionSessionBean==null) {
				this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
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
					this.iNumeroPaginacion=TarjetaCreditoConexionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TarjetaCreditoConexionConstantesFunciones.getClassesForeignKeysOfTarjetaCreditoConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tarjetacreditoconexion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tarjetacreditoconexionsAux= new ArrayList<TarjetaCreditoConexion>();
			
				
			tarjetacreditoconexionLogic.setDatosCliente(this.datosCliente);
			tarjetacreditoconexionLogic.setDatosDeep(this.datosDeep);
			tarjetacreditoconexionLogic.setIsConDeep(true);
			
			
			tarjetacreditoconexionLogic.getTarjetaCreditoConexionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tarjetacreditoconexionLogic.getTodosTarjetaCreditoConexions(finalQueryGlobal,pagination);
					
					//tarjetacreditoconexionLogic.getTodosTarjetaCreditoConexionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tarjetacreditoconexionLogic.getTarjetaCreditoConexions()==null|| tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tarjetacreditoconexionsAux= new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexionsAux.addAll(tarjetacreditoconexionLogic.getTarjetaCreditoConexions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexionsAux= new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexionsAux.addAll(tarjetacreditoconexions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tarjetacreditoconexionLogic.getTodosTarjetaCreditoConexions(finalQueryGlobal+"",this.pagination);												
							
							//tarjetacreditoconexionLogic.getTodosTarjetaCreditoConexionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionLogic.getTarjetaCreditoConexions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());					
							tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(tarjetacreditoconexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexions.addAll(tarjetacreditoconexionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTarjetaCreditoConexion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTarjetaCreditoConexion=this.idActual;
				
				} else if(this.idTarjetaCreditoConexionActual!=null && this.idTarjetaCreditoConexionActual!=0L) {
					idTarjetaCreditoConexion=idTarjetaCreditoConexionActual;
				}
				
					
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndicePorId(idTarjetaCreditoConexion);
				
				this.tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tarjetacreditoconexionLogic.getEntity(idTarjetaCreditoConexion);
					
					//tarjetacreditoconexionLogic.getEntityWithConnection(idTarjetaCreditoConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
					tarjetacreditoconexionLogic.getTarjetaCreditoConexions().add(tarjetacreditoconexionLogic.getTarjetaCreditoConexion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
					this.tarjetacreditoconexions.add(tarjetacreditoconexion);
				}
				
				if(tarjetacreditoconexionLogic.getTarjetaCreditoConexion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdConexion")) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdConexion(finalQueryGlobal,pagination,id_conexionFK_IdConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditoconexionLogic.getTarjetaCreditoConexions()==null||tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditoconexions==null|| tarjetacreditoconexions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
						tarjetacreditoconexionsAux.addAll(tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexionsAux.addAll(tarjetacreditoconexions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdConexion(finalQueryGlobal,pagination,id_conexionFK_IdConexion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdConexion(id_conexionFK_IdConexion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoConexions("FK_IdConexion",tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoConexions("FK_IdConexion",tarjetacreditoconexions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
						tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(tarjetacreditoconexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexions.addAll(tarjetacreditoconexionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditoconexionLogic.getTarjetaCreditoConexions()==null||tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditoconexions==null|| tarjetacreditoconexions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
						tarjetacreditoconexionsAux.addAll(tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexionsAux.addAll(tarjetacreditoconexions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoConexions("FK_IdEmpresa",tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoConexions("FK_IdEmpresa",tarjetacreditoconexions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
						tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(tarjetacreditoconexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexions.addAll(tarjetacreditoconexionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditoconexionLogic.getTarjetaCreditoConexions()==null||tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditoconexions==null|| tarjetacreditoconexions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
						tarjetacreditoconexionsAux.addAll(tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexionsAux.addAll(tarjetacreditoconexions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoConexions("FK_IdSucursal",tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoConexions("FK_IdSucursal",tarjetacreditoconexions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
						tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(tarjetacreditoconexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexions.addAll(tarjetacreditoconexionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTarjetaCredito")) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdTarjetaCredito(finalQueryGlobal,pagination,id_tarjeta_creditoFK_IdTarjetaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditoconexionLogic.getTarjetaCreditoConexions()==null||tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditoconexions==null|| tarjetacreditoconexions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
						tarjetacreditoconexionsAux.addAll(tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexionsAux=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexionsAux.addAll(tarjetacreditoconexions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdTarjetaCredito(finalQueryGlobal,pagination,id_tarjeta_creditoFK_IdTarjetaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoConexionConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoConexions("FK_IdTarjetaCredito",tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoConexions("FK_IdTarjetaCredito",tarjetacreditoconexions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionLogic.setTarjetaCreditoConexions(new ArrayList<TarjetaCreditoConexion>());
						tarjetacreditoconexionLogic.getTarjetaCreditoConexions().addAll(tarjetacreditoconexionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexions=new ArrayList<TarjetaCreditoConexion>();
							tarjetacreditoconexions.addAll(tarjetacreditoconexionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTarjetaCreditoConexion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTarjetaCreditoConexion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditoconexions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditoconexions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TarjetaCreditoConexion tarjetacreditoconexion) {
		Boolean permite=true;
		
		if(this.tarjetacreditoconexion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TarjetaCreditoConexionConstantesFunciones.getOrderByListaTarjetaCreditoConexion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TarjetaCreditoConexionConstantesFunciones.getOrderByListaTarjetaCreditoConexion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
				if(tarjetacreditoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditoconexionTotales=tarjetacreditoconexion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoConexion tarjetacreditoconexion:this.tarjetacreditoconexions) {
				if(tarjetacreditoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditoconexionTotales=tarjetacreditoconexion;
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
			this.tarjetacreditoconexionAux=new TarjetaCreditoConexion();
			this.tarjetacreditoconexionAux.setsType(Constantes2.S_TOTALES);
			this.tarjetacreditoconexionAux.setIsNew(false);
			this.tarjetacreditoconexionAux.setIsChanged(false);
			this.tarjetacreditoconexionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TarjetaCreditoConexionConstantesFunciones.TotalizarValoresFilaTarjetaCreditoConexion(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.tarjetacreditoconexionAux);
				
				this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().add(this.tarjetacreditoconexionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TarjetaCreditoConexionConstantesFunciones.TotalizarValoresFilaTarjetaCreditoConexion(this.tarjetacreditoconexions,this.tarjetacreditoconexionAux);
				
				this.tarjetacreditoconexions.add(this.tarjetacreditoconexionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tarjetacreditoconexionTotales=new TarjetaCreditoConexion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().remove(tarjetacreditoconexionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tarjetacreditoconexions.remove(tarjetacreditoconexionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tarjetacreditoconexionTotales=new TarjetaCreditoConexion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
				if(tarjetacreditoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditoconexionTotales=tarjetacreditoconexion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TarjetaCreditoConexionConstantesFunciones.TotalizarValoresFilaTarjetaCreditoConexion(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),tarjetacreditoconexionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoConexion tarjetacreditoconexion:this.tarjetacreditoconexions) {
				if(tarjetacreditoconexion.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditoconexionTotales=tarjetacreditoconexion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TarjetaCreditoConexionConstantesFunciones.TotalizarValoresFilaTarjetaCreditoConexion(this.tarjetacreditoconexions,tarjetacreditoconexionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTarjetaCreditoConexionsFK_IdConexion()throws Exception {
		try {
			sAccionBusqueda="FK_IdConexion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetaCreditoConexionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetaCreditoConexionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetaCreditoConexionsFK_IdTarjetaCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTarjetaCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTarjetaCreditoConexionsFK_IdConexion(String sFinalQuery,Long id_conexion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdConexion(sFinalQuery,this.pagination,id_conexion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetaCreditoConexionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetaCreditoConexionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetaCreditoConexionsFK_IdTarjetaCredito(String sFinalQuery,Long id_tarjeta_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoconexionLogic.getTarjetaCreditoConexionsFK_IdTarjetaCredito(sFinalQuery,this.pagination,id_tarjeta_credito);
				
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
	
	public void inicializarPermisosTarjetaCreditoConexion() {
		this.isPermisoTodoTarjetaCreditoConexion=false;
		this.isPermisoNuevoTarjetaCreditoConexion=false;
		this.isPermisoActualizarTarjetaCreditoConexion=false;
		this.isPermisoActualizarOriginalTarjetaCreditoConexion=false;
		this.isPermisoEliminarTarjetaCreditoConexion=false;
		this.isPermisoGuardarCambiosTarjetaCreditoConexion=false;
		this.isPermisoConsultaTarjetaCreditoConexion=false;
		this.isPermisoBusquedaTarjetaCreditoConexion=false;
		this.isPermisoReporteTarjetaCreditoConexion=false;		
		this.isPermisoOrdenTarjetaCreditoConexion=false;		
		this.isPermisoPaginacionMedioTarjetaCreditoConexion=false;		
		this.isPermisoPaginacionAltoTarjetaCreditoConexion=false;
		this.isPermisoPaginacionTodoTarjetaCreditoConexion=false;
		this.isPermisoCopiarTarjetaCreditoConexion=false;		
		this.isPermisoVerFormTarjetaCreditoConexion=false;		
		this.isPermisoDuplicarTarjetaCreditoConexion=false;		
		this.isPermisoOrdenTarjetaCreditoConexion=false;		
	}
	
	public void setPermisosUsuarioTarjetaCreditoConexion(Boolean isPermiso) {
		this.isPermisoTodoTarjetaCreditoConexion=isPermiso;
		this.isPermisoNuevoTarjetaCreditoConexion=isPermiso;
		this.isPermisoActualizarTarjetaCreditoConexion=isPermiso;
		this.isPermisoActualizarOriginalTarjetaCreditoConexion=isPermiso;
		this.isPermisoEliminarTarjetaCreditoConexion=isPermiso;
		this.isPermisoGuardarCambiosTarjetaCreditoConexion=isPermiso;
		this.isPermisoConsultaTarjetaCreditoConexion=isPermiso;
		this.isPermisoBusquedaTarjetaCreditoConexion=isPermiso;
		this.isPermisoReporteTarjetaCreditoConexion=isPermiso;
		this.isPermisoOrdenTarjetaCreditoConexion=isPermiso;		
		this.isPermisoPaginacionMedioTarjetaCreditoConexion=isPermiso;		
		this.isPermisoPaginacionAltoTarjetaCreditoConexion=isPermiso;		
		this.isPermisoPaginacionTodoTarjetaCreditoConexion=isPermiso;		
		this.isPermisoCopiarTarjetaCreditoConexion=isPermiso;		
		this.isPermisoVerFormTarjetaCreditoConexion=isPermiso;		
		this.isPermisoDuplicarTarjetaCreditoConexion=isPermiso;
		this.isPermisoOrdenTarjetaCreditoConexion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTarjetaCreditoConexion(Boolean isPermiso) {
		//this.isPermisoTodoTarjetaCreditoConexion=isPermiso;
		this.isPermisoNuevoTarjetaCreditoConexion=isPermiso;
		this.isPermisoActualizarTarjetaCreditoConexion=isPermiso;
		this.isPermisoActualizarOriginalTarjetaCreditoConexion=isPermiso;
		this.isPermisoEliminarTarjetaCreditoConexion=isPermiso;
		this.isPermisoGuardarCambiosTarjetaCreditoConexion=isPermiso;
		//this.isPermisoConsultaTarjetaCreditoConexion=isPermiso;
		//this.isPermisoBusquedaTarjetaCreditoConexion=isPermiso;
		//this.isPermisoReporteTarjetaCreditoConexion=isPermiso;
		//this.isPermisoOrdenTarjetaCreditoConexion=isPermiso;		
		//this.isPermisoPaginacionMedioTarjetaCreditoConexion=isPermiso;		
		//this.isPermisoPaginacionAltoTarjetaCreditoConexion=isPermiso;		
		//this.isPermisoPaginacionTodoTarjetaCreditoConexion=isPermiso;		
		//this.isPermisoCopiarTarjetaCreditoConexion=isPermiso;		
		//this.isPermisoDuplicarTarjetaCreditoConexion=isPermiso;
		//this.isPermisoOrdenTarjetaCreditoConexion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTarjetaCreditoConexionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TarjetaCreditoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTarjetaCreditoConexion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTarjetaCreditoConexionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTarjetaCreditoConexionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTarjetaCreditoConexionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTarjetaCreditoConexionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTarjetaCreditoConexion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TarjetaCreditoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TarjetaCreditoConexionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTarjetaCreditoConexion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTarjetaCreditoConexion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTarjetaCreditoConexion=this.isPermisoActualizarTarjetaCreditoConexion;
			this.isPermisoEliminarTarjetaCreditoConexion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTarjetaCreditoConexion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTarjetaCreditoConexion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTarjetaCreditoConexion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTarjetaCreditoConexion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTarjetaCreditoConexion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTarjetaCreditoConexion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTarjetaCreditoConexion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTarjetaCreditoConexion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTarjetaCreditoConexion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTarjetaCreditoConexion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTarjetaCreditoConexion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTarjetaCreditoConexion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTarjetaCreditoConexion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTarjetaCreditoConexion.setToolTipText(this.jTableDatosTarjetaCreditoConexion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTarjetaCreditoConexion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTarjetaCreditoConexion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TarjetaCreditoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TarjetaCreditoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTarjetaCreditoConexion() throws Exception {
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
	public void inicializarCombosForeignKeyTarjetaCreditoConexionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tarjetacreditosForeignKey=new ArrayList();
				this.conexionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTarjetaCreditoConexionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TarjetaCreditoConexionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTarjetaCreditoConexionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTarjetaCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyConexionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTarjetaCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tarjetacreditosForeignKey==null||this.tarjetacreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TarjetaCreditoConstantesFunciones.getArrayColumnasGlobalesTarjetaCredito(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TarjetaCreditoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TarjetaCreditoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTarjetaCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyConexionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.conexionsForeignKey==null||this.conexionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ConexionConstantesFunciones.getArrayColumnasGlobalesConexion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ConexionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ConexionConstantesFunciones.SFINALQUERY;

				this.cargarCombosConexionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTarjetaCreditoConexionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionReturnGeneral=new TarjetaCreditoConexionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tarjetacreditoconexionConstantesFunciones.cargarid_empresaTarjetaCreditoConexion)
					 || (this.esRecargarFks && this.tarjetacreditoconexionConstantesFunciones.cargarid_empresaTarjetaCreditoConexion)) {

					if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tarjetacreditoconexionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.tarjetacreditoconexionConstantesFunciones.cargarid_sucursalTarjetaCreditoConexion)
					 || (this.esRecargarFks && this.tarjetacreditoconexionConstantesFunciones.cargarid_sucursalTarjetaCreditoConexion)) {

					if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+tarjetacreditoconexionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTarjetaCredito="";

				if(((this.tarjetacreditosForeignKey==null||this.tarjetacreditosForeignKey.size()<=0) && this.tarjetacreditoconexionConstantesFunciones.cargarid_tarjeta_creditoTarjetaCreditoConexion)
					 || (this.esRecargarFks && this.tarjetacreditoconexionConstantesFunciones.cargarid_tarjeta_creditoTarjetaCreditoConexion)) {

					if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TarjetaCreditoConstantesFunciones.getArrayColumnasGlobalesTarjetaCredito(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTarjetaCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TarjetaCreditoConstantesFunciones.TABLENAME);

						finalQueryGlobalTarjetaCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalTarjetaCredito, "");
						finalQueryGlobalTarjetaCredito+=TarjetaCreditoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTarjetaCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTarjetaCredito=" WHERE " + ConstantesSql.ID + "="+tarjetacreditoconexionSessionBean.getlidTarjetaCreditoActual();
					}
				} else {
					finalQueryGlobalTarjetaCredito="NONE";
				}


				String finalQueryGlobalConexion="";

				if(((this.conexionsForeignKey==null||this.conexionsForeignKey.size()<=0) && this.tarjetacreditoconexionConstantesFunciones.cargarid_conexionTarjetaCreditoConexion)
					 || (this.esRecargarFks && this.tarjetacreditoconexionConstantesFunciones.cargarid_conexionTarjetaCreditoConexion)) {

					if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionConexion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ConexionConstantesFunciones.getArrayColumnasGlobalesConexion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalConexion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ConexionConstantesFunciones.TABLENAME);

						finalQueryGlobalConexion=Funciones.GetFinalQueryAppend(finalQueryGlobalConexion, "");
						finalQueryGlobalConexion+=ConexionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosConexionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalConexion=" WHERE " + ConstantesSql.ID + "="+tarjetacreditoconexionSessionBean.getlidConexionActual();
					}
				} else {
					finalQueryGlobalConexion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tarjetacreditoconexionReturnGeneral=tarjetacreditoconexionLogic.cargarCombosLoteForeignKeyTarjetaCreditoConexion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTarjetaCredito,finalQueryGlobalConexion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tarjetacreditoconexionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=tarjetacreditoconexionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTarjetaCredito.equals("NONE")) {
				this.tarjetacreditosForeignKey=tarjetacreditoconexionReturnGeneral.gettarjetacreditosForeignKey();
			}

			if(!finalQueryGlobalConexion.equals("NONE")) {
				this.conexionsForeignKey=tarjetacreditoconexionReturnGeneral.getconexionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTarjetaCreditoConexion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTarjetaCredito();
			this.addItemDefectoCombosForeignKeyConexion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tarjetacreditoconexionSessionBean==null) {
				this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
			}

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTarjetaCredito()throws Exception {
		try {

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {
				TarjetaCredito tarjetacredito=new TarjetaCredito();
				TarjetaCreditoConstantesFunciones.setTarjetaCreditoDescripcion(tarjetacredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				tarjetacredito.setId(null);

				if(!TarjetaCreditoConstantesFunciones.ExisteEnLista(this.tarjetacreditosForeignKey,tarjetacredito,true)) {

					this.tarjetacreditosForeignKey.add(0,tarjetacredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyConexion()throws Exception {
		try {

			if(!this.tarjetacreditoconexionSessionBean.getisBusquedaDesdeForeignKeySesionConexion()) {
				Conexion conexion=new Conexion();
				ConexionConstantesFunciones.setConexionDescripcion(conexion,Constantes.SMENSAJE_ESCOJA_OPCION);
				conexion.setId(null);

				if(!ConexionConstantesFunciones.ExisteEnLista(this.conexionsForeignKey,conexion,true)) {

					this.conexionsForeignKey.add(0,conexion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTarjetaCreditoConexion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTarjetaCreditoConexion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTarjetaCreditoConexion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetaCreditoConexion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion)throws Exception {	
		try {
			
			this.setActualTarjetaCreditoForeignKey(tarjetacreditoconexion.getid_tarjeta_credito(),false,"Formulario");
			this.setActualConexionForeignKey(tarjetacreditoconexion.getid_conexion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTarjetaCreditoConexion()throws Exception {	
		try {
			
			this.setActualTarjetaCreditoForeignKey(this.tarjetacreditoconexionConstantesFunciones.getid_tarjeta_credito(),false,"Formulario");
			this.setActualConexionForeignKey(this.tarjetacreditoconexionConstantesFunciones.getid_conexion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetaCreditoConexion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTarjetaCreditoConexion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTarjetaCreditoConexion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTarjetaCreditoConexion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTarjetaCreditoConexion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTarjetaCreditosForeignKey("Todos");
			this.cargarCombosFrameConexionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTarjetaCreditoConexion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTarjetaCreditosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameConexionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTarjetaCreditoConexion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public TarjetaCreditoConexionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TarjetaCreditoConexionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TarjetaCreditoConexionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean(); 
		this.tarjetacreditoconexionConstantesFunciones=new TarjetaCreditoConexionConstantesFunciones(); 
		this.tarjetacreditoconexionBean=new TarjetaCreditoConexion();//(this.tarjetacreditoconexionConstantesFunciones); 		
		this.tarjetacreditoconexionReturnGeneral=new TarjetaCreditoConexionParameterReturnGeneral(); 
		
		this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TarjetaCreditoConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TarjetaCreditoConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TarjetaCreditoConexionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTarjetaCreditoConexion(true);
			
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
			
			this.tarjetacreditoconexionConstantesFunciones=new TarjetaCreditoConexionConstantesFunciones(); 
			this.tarjetacreditoconexionBean=new TarjetaCreditoConexion();//this.tarjetacreditoconexionConstantesFunciones); 			
			this.tarjetacreditoconexionReturnGeneral=new TarjetaCreditoConexionParameterReturnGeneral(); 
		
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Conexion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tarjetacreditoconexion=new TarjetaCreditoConexion();
			this.tarjetacreditoconexions = new ArrayList<TarjetaCreditoConexion>();
			this.tarjetacreditoconexionsAux = new ArrayList<TarjetaCreditoConexion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic=new TarjetaCreditoConexionLogic();
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			//this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTarjetaCreditoConexion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTarjetaCreditoConexion);	
					}
					
					if(this.jInternalFrameImportacionTarjetaCreditoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTarjetaCreditoConexion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTarjetaCreditoConexion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTarjetaCreditoConexion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTarjetaCreditoConexion);
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.setVisible(false);
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion);
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setVisible(false);
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTarjetaCreditoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTarjetaCreditoConexion);
					this.jInternalFrameImportacionTarjetaCreditoConexion.setVisible(false);
					this.jInternalFrameImportacionTarjetaCreditoConexion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTarjetaCreditoConexion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTarjetaCreditoConexion);
					this.jInternalFrameOrderByTarjetaCreditoConexion.setVisible(false);
					this.jInternalFrameOrderByTarjetaCreditoConexion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTarjetaCreditoConexionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TarjetaCreditoConexionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tarjetacreditoconexionReturnGeneral=new TarjetaCreditoConexionParameterReturnGeneral();
			
			this.tarjetacreditoconexionParameterGeneral=new TarjetaCreditoConexionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tarjetacreditoconexionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TarjetaCreditoConexionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TarjetaCreditoConexionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado(),this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TarjetaCreditoConexionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado(),this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaCopiarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaVerFormTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaOrdenTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
			
			
			this.isVisibilidadFK_IdConexion=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTarjetaCredito=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTarjetaCreditoConexion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTarjetaCreditoConexion(false);
			
			this.setPermisosUsuarioTarjetaCreditoConexion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() 
				|| (this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado() && this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTarjetaCreditoConexionClasesRelacionadas();
			}
			
			if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTarjetaCreditoConexionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTarjetaCreditoConexion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTarjetaCreditoConexion();
			}
			
			if(!this.isPermisoBusquedaTarjetaCreditoConexion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTarjetaCreditoConexion,this.isPermisoPaginacionMedioTarjetaCreditoConexion,this.isPermisoPaginacionTodoTarjetaCreditoConexion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TarjetaCreditoConexionConstantesFunciones.getTiposSeleccionarTarjetaCreditoConexion());
				
				this.tiposColumnasSelect=TarjetaCreditoConexionConstantesFunciones.getTiposSeleccionarTarjetaCreditoConexion(true);
				
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
			//if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTarjetaCreditoConexion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTarjetaCreditoConexion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTarjetaCreditoConexion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoConexion() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.tarjetacreditoLogic=new TarjetaCreditoLogic();
			this.conexionLogic=new ConexionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tarjetacreditoconexionImplementable= (TarjetaCreditoConexionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TarjetaCreditoConexionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tarjetacreditoconexionImplementableHome= (TarjetaCreditoConexionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TarjetaCreditoConexionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tarjetacreditoconexions= new ArrayList<TarjetaCreditoConexion>();
			this.tarjetacreditoconexionsEliminados= new ArrayList<TarjetaCreditoConexion>();
						
			this.isEsNuevoTarjetaCreditoConexion=false;
			this.esParaAccionDesdeFormularioTarjetaCreditoConexion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>() ;
			this.conexionsForeignKey=new ArrayList<Conexion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTarjetaCreditoConexion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTarjetaCreditoConexion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TarjetaCreditoConexionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTarjetaCreditoConexion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTarjetaCreditoConexion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTarjetaCreditoConexion();
			}
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTarjetaCreditoConexion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTarjetaCreditoConexion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTarjetaCreditoConexion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTarjetaCreditoConexion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TarjetaCreditoConexion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTarjetaCreditoConexion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTarjetaCreditoConexion")) {
				iIndex=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTarjetaCreditoConexion();	
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
	
	public void cargarCombosForeignKeyTarjetaCreditoConexion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTarjetaCreditoConexion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTarjetaCreditoConexion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTarjetaCreditoConexionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTarjetaCreditoConexion();
		
		this.cargarCombosFrameForeignKeyTarjetaCreditoConexion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTarjetaCreditoConexion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTarjetaCreditoConexion();
		}
	}
	
	

	public void cargarCombosForeignKeyTarjetaCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTarjetaCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTarjetaCredito();
				this.cargarCombosFrameTarjetaCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTarjetaCredito(this.tarjetacreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyConexion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyConexionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyConexion();
				this.cargarCombosFrameConexionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaConexion(this.conexionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTarjetaCreditoConexionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			
			if(jTableDatosTarjetaCreditoConexion.getRowCount()>=1) {
				jTableDatosTarjetaCreditoConexion.removeRowSelectionInterval(0, jTableDatosTarjetaCreditoConexion.getRowCount()-1);						
			}
			
			this.isEsNuevoTarjetaCreditoConexion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTarjetaCreditoConexion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTarjetaCreditoConexion(true);			
			//this.tarjetacreditoconexion=new TarjetaCreditoConexion();
			//this.tarjetacreditoconexion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion() ;
			
			if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetaCreditoConexion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tarjetacreditoconexion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);				
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TarjetaCreditoConexion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTarjetaCreditoConexionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTarjetaCreditoConexion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTarjetaCreditoConexion.getSelectedRows().length;			
			}
			
			tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTarjetaCreditoConexion--;			
				//TarjetaCreditoConexion tarjetacreditoconexionAux= new TarjetaCreditoConexion();			
				//tarjetacreditoconexionAux.setId(this.iIdNuevoTarjetaCreditoConexion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TarjetaCreditoConexion tarjetacreditoconexionOrigen=new TarjetaCreditoConexion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TarjetaCreditoConexion tarjetacreditoconexionOrigen : tarjetacreditoconexionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tarjetacreditoconexionOrigen =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditoconexionOrigen =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTarjetaCreditoConexion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tarjetacreditoconexion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTarjetaCreditoConexion(tarjetacreditoconexionOrigen,this.tarjetacreditoconexion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().add(this.tarjetacreditoconexionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexions.add(this.tarjetacreditoconexionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
				
				this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoConexion(), this.getIndiceNuevoTarjetaCreditoConexion());
				
				int iLastRow =  this.jTableDatosTarjetaCreditoConexion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTarjetaCreditoConexion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTarjetaCreditoConexion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();									
		
			TarjetaCreditoConexion tarjetacreditoconexionOrigen=new TarjetaCreditoConexion();
			TarjetaCreditoConexion tarjetacreditoconexionDestino=new TarjetaCreditoConexion();
				
			tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTarjetaCreditoConexion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tarjetacreditoconexionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTarjetaCreditoConexion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionOrigen =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tarjetacreditoconexionOrigen =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditoconexionDestino =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tarjetacreditoconexionDestino =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tarjetacreditoconexionOrigen =tarjetacreditoconexionsSeleccionados.get(0);
				tarjetacreditoconexionDestino =tarjetacreditoconexionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTarjetaCreditoConexion(tarjetacreditoconexionOrigen,tarjetacreditoconexionDestino,true,false);
				
				tarjetacreditoconexionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tarjetacreditoconexionDestino,tarjetacreditoconexionLogic.getTarjetaCreditoConexions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditoconexionDestino,tarjetacreditoconexions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
				
				//this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoConexion(), this.getIndiceNuevoTarjetaCreditoConexion());
				
				int iLastRow =  this.jTableDatosTarjetaCreditoConexion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTarjetaCreditoConexion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTarjetaCreditoConexion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTarjetaCreditoConexion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(!isVisible);
			this.jPanelPaginacionTarjetaCreditoConexion.setVisible(!isVisible);
			this.jPanelAccionesTarjetaCreditoConexion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTarjetaCreditoConexion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTarjetaCreditoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTarjetaCreditoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTarjetaCreditoConexion();
			
			this.abrirFrameOrderByTarjetaCreditoConexion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTarjetaCreditoConexion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTarjetaCreditoConexion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTarjetaCreditoConexion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.isMaximum()) {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSize(this.jInternalFrameDetalleFormTarjetaCreditoConexion.iWidthFormulario,this.jInternalFrameDetalleFormTarjetaCreditoConexion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTarjetaCreditoConexion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTarjetaCreditoConexion.isMaximum()) {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jContentPaneDetalleTarjetaCreditoConexion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jContentPaneDetalleTarjetaCreditoConexion.getWidth(),TarjetaCreditoConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jContentPaneDetalleTarjetaCreditoConexion.getWidth(),TarjetaCreditoConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jContentPaneDetalleTarjetaCreditoConexion.getWidth(),TarjetaCreditoConexionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTarjetaCreditoConexion.setVisible(true);
	        this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTarjetaCreditoConexion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTarjetaCreditoConexion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTarjetaCreditoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoConexion,false,this);
				} else {
					this.jInternalFrameOrderByTarjetaCreditoConexion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoConexion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTarjetaCreditoConexion);
				this.jInternalFrameOrderByTarjetaCreditoConexion.setVisible(false);
				this.jInternalFrameOrderByTarjetaCreditoConexion.setSelected(false);
				
				this.jInternalFrameOrderByTarjetaCreditoConexion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTarjetaCreditoConexion"));
				
				this.inicializarActualizarBindingTablaOrderByTarjetaCreditoConexion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTarjetaCreditoConexion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTarjetaCreditoConexion==null) {
				
				this.jInternalFrameImportacionTarjetaCreditoConexion=new ImportacionJInternalFrame(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTarjetaCreditoConexion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTarjetaCreditoConexion);
				this.jInternalFrameImportacionTarjetaCreditoConexion.setVisible(false);
				this.jInternalFrameImportacionTarjetaCreditoConexion.setSelected(false);


				this.jInternalFrameImportacionTarjetaCreditoConexion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTarjetaCreditoConexion"));
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTarjetaCreditoConexion"));
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTarjetaCreditoConexion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTarjetaCreditoConexion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion==null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion=new ReporteDinamicoJInternalFrame(TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTarjetaCreditoConexion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion);
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setVisible(false);
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetaCreditoConexion"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetaCreditoConexion"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetaCreditoConexion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetaCreditoConexion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTarjetaCreditoConexion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTarjetaCreditoConexion);
			
	       	this.jInternalFrameDetalleFormTarjetaCreditoConexion.setVisible(false);
	        this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTarjetaCreditoConexion.dispose();
			//this.jInternalFrameDetalleFormTarjetaCreditoConexion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTarjetaCreditoConexion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTarjetaCreditoConexion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTarjetaCreditoConexion.setVisible(true);
	        this.jInternalFrameImportacionTarjetaCreditoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTarjetaCreditoConexion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTarjetaCreditoConexion.setVisible(true);
	        this.jInternalFrameOrderByTarjetaCreditoConexion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTarjetaCreditoConexion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTarjetaCreditoConexion.setVisible(false);
	        this.jInternalFrameOrderByTarjetaCreditoConexion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTarjetaCreditoConexion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTarjetaCreditoConexion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTarjetaCreditoConexion.setVisible(false);
	        this.jInternalFrameImportacionTarjetaCreditoConexion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTarjetaCreditoConexion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTarjetaCreditoConexion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTarjetaCreditoConexion(true);
			//this.isEsNuevoTarjetaCreditoConexion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false) ;
			
			if(tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetaCreditoConexion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTarjetaCreditoConexionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTarjetaCreditoConexion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTarjetaCreditoConexion(true);
			//this.isEsNuevoTarjetaCreditoConexion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tarjetacreditoconexion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false) ;
			
			if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetaCreditoConexion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTarjetaCredito(List<TarjetaCredito> tarjetacreditosForeignKey)throws Exception{
		TableColumn tableColumnTarjetaCredito=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO));
		TableCellEditor tableCellEditorTarjetaCredito =tableColumnTarjetaCredito.getCellEditor();

		TarjetaCreditoTableCell tarjetacreditoTableCellFk=(TarjetaCreditoTableCell)tableCellEditorTarjetaCredito;

		if(tarjetacreditoTableCellFk!=null) {
			tarjetacreditoTableCellFk.settarjetacreditosForeignKey(tarjetacreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tarjetacreditoTableCellFk.setRowActual(intSelectedRow);
			//tarjetacreditoTableCellFk.settarjetacreditosForeignKeyActual(tarjetacreditosForeignKey);
		//}


		if(tarjetacreditoTableCellFk!=null) {
			tarjetacreditoTableCellFk.RecargarTarjetaCreditosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaConexion(List<Conexion> conexionsForeignKey)throws Exception{
		TableColumn tableColumnConexion=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION));
		TableCellEditor tableCellEditorConexion =tableColumnConexion.getCellEditor();

		ConexionTableCell conexionTableCellFk=(ConexionTableCell)tableCellEditorConexion;

		if(conexionTableCellFk!=null) {
			conexionTableCellFk.setconexionsForeignKey(conexionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//conexionTableCellFk.setRowActual(intSelectedRow);
			//conexionTableCellFk.setconexionsForeignKeyActual(conexionsForeignKey);
		//}


		if(conexionTableCellFk!=null) {
			conexionTableCellFk.RecargarConexionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTarjetaCreditoConexion(false);
			
			//if(!this.isEsNuevoTarjetaCreditoConexion) {								
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				
			}
			
			if(this.permiteMantenimiento(this.tarjetacreditoconexion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTarjetaCreditoConexion=true;
					this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
					this.isEsNuevoTarjetaCreditoConexion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTarjetaCreditoConexion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTarjetaCreditoConexion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(false);
				
				this.habilitarDeshabilitarControlesTarjetaCreditoConexion(false);
			
												
				
				if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTarjetaCreditoConexion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,tarjetacreditoconexionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTarjetaCreditoConexion(this.tarjetacreditoconexion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tarjetacreditoconexionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tarjetacreditoconexion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				this.tarjetacreditoconexion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				this.tarjetacreditoconexion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tarjetacreditoconexion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TarjetaCreditoConexionModel) this.jTableDatosTarjetaCreditoConexion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTarjetaCreditoConexion=true;
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
				this.isEsNuevoTarjetaCreditoConexion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(false);
				
				this.habilitarDeshabilitarControlesTarjetaCreditoConexion(false);
				
				
				
				if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTarjetaCreditoConexion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTarjetaCreditoConexion.getRowCount()>=1) {
				jTableDatosTarjetaCreditoConexion.removeRowSelectionInterval(0, jTableDatosTarjetaCreditoConexion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTarjetaCreditoConexion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(false) ;
			
			this.isEsNuevoTarjetaCreditoConexion=false;
			
			if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTarjetaCreditoConexion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTarjetaCreditoConexion(false);
				
				//SI ES MANUAL
				if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTarjetaCreditoConexion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTarjetaCreditoConexion--;			
			//TarjetaCreditoConexion tarjetacreditoconexionAux= new TarjetaCreditoConexion();			
			//tarjetacreditoconexionAux.setId(this.iIdNuevoTarjetaCreditoConexion);
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTarjetaCreditoConexion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
			
			this.tarjetacreditoconexion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().add(this.tarjetacreditoconexionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tarjetacreditoconexions.add(this.tarjetacreditoconexionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			
			this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoConexion(), this.getIndiceNuevoTarjetaCreditoConexion());
			
			int iLastRow =  this.jTableDatosTarjetaCreditoConexion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTarjetaCreditoConexion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTarjetaCreditoConexion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetaCreditoConexion();
			}
			
			//this.abrirFrameTreeTarjetaCreditoConexion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tarjeta Credito ConexionES ?", "MANTENIMIENTO DE Tarjeta Credito Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTarjetaCreditoConexion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTarjetaCreditoConexion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tarjetacreditoconexionReturnGeneral=tarjetacreditoconexionLogic.procesarImportacionTarjetaCreditoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tarjetacreditoconexionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTarjetaCreditoConexionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTarjetaCreditoConexion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTarjetaCreditoConexion.setFileImportacion(this.jInternalFrameImportacionTarjetaCreditoConexion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTarjetaCreditoConexion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTarjetaCreditoConexion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		

		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TarjetaCreditoConexionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TarjetaCreditoConexionBaseDesign.jrxml";
			
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
			
			this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TarjetaCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TarjetaCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TarjetaCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TarjetaCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Conexion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Conexion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Conexion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Conexion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO:
					sNombreCampoCategoria="id_tarjeta_credito";
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION:
					sNombreCampoCategoria="id_conexion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO:
					sNombreCampoCategoriaValor="id_tarjeta_credito";
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION:
					sNombreCampoCategoriaValor="id_conexion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarjeta Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tarjeta_credito");
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Conexion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_conexion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TarjetaCreditoConexions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditoconexion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditoconexion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO);
					iRow++;

					for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditoconexion.gettarjetacredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION);
					iRow++;

					for(TarjetaCreditoConexion tarjetacreditoconexion:tarjetacreditoconexionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditoconexion.getconexion_descripcion());
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
			//	this.getFilaCabeceraExportarExcelTarjetaCreditoConexion(row);				
			//	iRow++;
			//}				
			
			//for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTarjetaCreditoConexion(tarjetacreditoconexionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetaCreditoConexion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTarjetaCreditoConexion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTarjetaCreditoConexion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTarjetaCreditoConexion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTarjetaCreditoConexion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTarjetaCreditoConexion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTarjetaCreditoConexion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTarjetaCreditoConexion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTarjetaCreditoConexion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTarjetaCreditoConexion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTarjetaCreditoConexion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTarjetaCreditoConexion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTarjetaCreditoConexion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTarjetaCreditoConexion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTarjetaCreditoConexion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTarjetaCreditoConexion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoConexion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTarjetaCreditoConexion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTarjetaCreditoConexion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTarjetaCreditoConexion();
		
		this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTarjetaCreditoConexion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoConexion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetaCreditoConexion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetaCreditoConexion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTarjetaCreditoConexion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jCheckBoxPostAccionNuevoTarjetaCreditoConexion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTarjetaCreditoConexion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTarjetaCreditoConexion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jCheckBoxPostAccionNuevoTarjetaCreditoConexion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jCheckBoxPostAccionSinCerrarTarjetaCreditoConexion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jCheckBoxPostAccionSinMensajeTarjetaCreditoConexion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTarjetaCreditoConexion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTarjetaCreditoConexion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTarjetaCreditoConexion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTarjetaCreditoConexion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTarjetaCreditoConexion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTarjetaCreditoConexion(Boolean esInicializar) throws Exception {
		try	{	
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetaCreditoConexion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoConexion() throws Exception {
		try	{
			if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTarjetaCreditoConexion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTarjetaCreditoConexion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTarjetaCreditoConexion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTarjetaCreditoConexion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTarjetaCreditoConexion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTarjetaCreditoConexion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTarjetaCreditoConexion.addItem(reporte);
			}
			
			
			if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTarjetaCreditoConexion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTarjetaCreditoConexion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTarjetaCreditoConexion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetaCreditoConexion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetaCreditoConexion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTarjetaCreditoConexion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.getSelectedItem()!=null){this.id_conexionFK_IdConexion=((Conexion)this.jComboBoxid_conexionFK_IdConexionTarjetaCreditoConexion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.getSelectedItem()!=null){this.id_tarjeta_creditoFK_IdTarjetaCredito=((TarjetaCredito)this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoConexion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTarjetaCreditoConexion(Boolean esInicializar) throws Exception {				
		if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTarjetaCreditoConexion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTarjetaCreditoConexion() throws Exception {
		this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTarjetaCreditoConexion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTarjetaCreditoConexionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTarjetaCreditoConexion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tarjetacreditoconexions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTarjetaCreditoConexion.setModel(new TarjetaCreditoConexionModel(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTarjetaCreditoConexion.setModel(new TarjetaCreditoConexionModel(this.tarjetacreditoconexions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTarjetaCreditoConexion!=null && this.jInternalFrameOrderByTarjetaCreditoConexion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTarjetaCreditoConexion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO,tarjetacreditoconexionConstantesFunciones.resaltarSeleccionarTarjetaCreditoConexion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TarjetaCreditoConexionConstantesFunciones.SCLASSWEBTITULO,tarjetacreditoconexionConstantesFunciones.resaltarSeleccionarTarjetaCreditoConexion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_ID));

		if(this.tarjetacreditoconexionConstantesFunciones.mostraridTarjetaCreditoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoConexionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tarjetacreditoconexionConstantesFunciones.resaltaridTarjetaCreditoConexion,this.tarjetacreditoconexionConstantesFunciones.activaridTarjetaCreditoConexion,this,true,"idTarjetaCreditoConexion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetacreditoconexionConstantesFunciones.resaltaridTarjetaCreditoConexion,this.tarjetacreditoconexionConstantesFunciones.activaridTarjetaCreditoConexion,this,true,"idTarjetaCreditoConexion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tarjetacreditoconexionConstantesFunciones.mostrarid_empresaTarjetaCreditoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_empresaTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_empresaTarjetaCreditoConexion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_empresaTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_empresaTarjetaCreditoConexion,false,"id_empresaTarjetaCreditoConexion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.tarjetacreditoconexionConstantesFunciones.mostrarid_sucursalTarjetaCreditoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_sucursalTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_sucursalTarjetaCreditoConexion));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_sucursalTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_sucursalTarjetaCreditoConexion,false,"id_sucursalTarjetaCreditoConexion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO));

		if(this.tarjetacreditoconexionConstantesFunciones.mostrarid_tarjeta_creditoTarjetaCreditoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TarjetaCreditoTableCell(this.tarjetacreditosForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoConexion));
			tableColumn.setCellEditor(new TarjetaCreditoTableCell(this.tarjetacreditosForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoConexion,true,"id_tarjeta_creditoTarjetaCreditoConexion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION));

		if(this.tarjetacreditoconexionConstantesFunciones.mostrarid_conexionTarjetaCreditoConexion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ConexionTableCell(this.conexionsForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_conexionTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_conexionTarjetaCreditoConexion));
			tableColumn.setCellEditor(new ConexionTableCell(this.conexionsForeignKey,this.tarjetacreditoconexionConstantesFunciones.resaltarid_conexionTarjetaCreditoConexion,this,this.tarjetacreditoconexionConstantesFunciones.activarid_conexionTarjetaCreditoConexion,true,"id_conexionTarjetaCreditoConexion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoConexionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTarjetaCreditoConexion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTarjetaCreditoConexion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTarjetaCreditoConexion.addColumn(tableColumn);
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
			
			this.jTableDatosTarjetaCreditoConexion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTarjetaCreditoConexion.moveColumn(this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTarjetaCreditoConexion.moveColumn(this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTarjetaCreditoConexion.moveColumn(this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTarjetaCreditoConexion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTarjetaCreditoConexion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTarjetaCreditoConexion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTarjetaCreditoConexion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTarjetaCreditoConexion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTarjetaCreditoConexion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tarjetacreditoconexionLogic.getTarjetaCreditoConexions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tarjetacreditoconexions.size()-1;
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
		//this.jTableDatosTarjetaCreditoConexion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTarjetaCreditoConexion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTarjetaCreditoConexion();
			
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
				
				//this.isEsNuevoTarjetaCreditoConexion=false;
					
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
				if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTarjetaCreditoConexion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTarjetaCreditoConexion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tarjetacreditoconexion.getsType().equals("DUPLICADO")
				   || this.tarjetacreditoconexion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTarjetaCreditoConexion=true;
				
				} else {
					this.isEsNuevoTarjetaCreditoConexion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
					if(this.tarjetacreditoconexion.getId()>=0 && !this.tarjetacreditoconexion.getIsNew()) {						
						this.isEsNuevoTarjetaCreditoConexion=false;
						
					} else {
						this.isEsNuevoTarjetaCreditoConexion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTarjetaCreditoConexion(esRelaciones);						
				
				this.seleccionarTarjetaCreditoConexion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tarjetacreditoconexion.getId()<0) {
					this.isEsNuevoTarjetaCreditoConexion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTarjetaCreditoConexion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTarjetaCreditoConexion(evt,rowIndex);
				}	
				
				if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TarjetaCreditoConexion: " + this.dDif); 
					}
				}								
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTarjetaCreditoConexion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tarjetacreditoconexion)) {
					if(this.tarjetacreditoconexion.getId()>0) {
						this.tarjetacreditoconexion.setIsDeleted(true);
						
						this.tarjetacreditoconexionsEliminados.add(this.tarjetacreditoconexion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().remove(this.tarjetacreditoconexion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexions.remove(this.tarjetacreditoconexion);				
					}
					
					
					((TarjetaCreditoConexionModel) this.jTableDatosTarjetaCreditoConexion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTarjetaCreditoConexion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTarjetaCreditoConexion) {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTarjetaCreditoConexion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTarjetaCreditoConexion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tarjetacreditoconexionConstantesFunciones.cargarid_empresaTarjetaCreditoConexion || this.tarjetacreditoconexionConstantesFunciones.event_dependid_empresaTarjetaCreditoConexion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tarjetacreditoconexion.getid_empresa());
									//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tarjetacreditoconexion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tarjetacreditoconexion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tarjetacreditoconexion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.tarjetacreditoconexionConstantesFunciones.cargarid_sucursalTarjetaCreditoConexion || this.tarjetacreditoconexionConstantesFunciones.event_dependid_sucursalTarjetaCreditoConexion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.tarjetacreditoconexion.getid_sucursal());
									//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(tarjetacreditoconexion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(tarjetacreditoconexion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.tarjetacreditoconexion.getid_sucursal(),false,"Formulario");

					//TarjetaCredito
					if(!this.tarjetacreditoconexionConstantesFunciones.cargarid_tarjeta_creditoTarjetaCreditoConexion || this.tarjetacreditoconexionConstantesFunciones.event_dependid_tarjeta_creditoTarjetaCreditoConexion) {
						//this.cargarCombosTarjetaCreditosForeignKeyLista(" where id="+this.tarjetacreditoconexion.getid_tarjeta_credito());
									//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
						this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>();

						if(tarjetacreditoconexion.getTarjetaCredito()!=null) {
							this.tarjetacreditosForeignKey.add(tarjetacreditoconexion.getTarjetaCredito());
						}

						this.addItemDefectoCombosForeignKeyTarjetaCredito();
						this.cargarCombosFrameTarjetaCreditosForeignKey("Todos");
					}
					this.setActualTarjetaCreditoForeignKey(this.tarjetacreditoconexion.getid_tarjeta_credito(),false,"Formulario");

					//Conexion
					if(!this.tarjetacreditoconexionConstantesFunciones.cargarid_conexionTarjetaCreditoConexion || this.tarjetacreditoconexionConstantesFunciones.event_dependid_conexionTarjetaCreditoConexion) {
						//this.cargarCombosConexionsForeignKeyLista(" where id="+this.tarjetacreditoconexion.getid_conexion());
									//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
						this.conexionsForeignKey=new ArrayList<Conexion>();

						if(tarjetacreditoconexion.getConexion()!=null) {
							this.conexionsForeignKey.add(tarjetacreditoconexion.getConexion());
						}

						this.addItemDefectoCombosForeignKeyConexion();
						this.cargarCombosFrameConexionsForeignKey("Todos");
					}
					this.setActualConexionForeignKey(this.tarjetacreditoconexion.getid_conexion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTarjetaCreditoConexion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTarjetaCreditoConexion(tarjetacreditoconexion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTarjetaCreditoConexion(tarjetacreditoconexion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTarjetaCreditoConexion(tarjetacreditoconexion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoConexion(tarjetacreditoconexion);
	}
	
	public void setVariablesObjetoActualToFormularioTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setText(tarjetacreditoconexion.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TarjetaCreditoConexion tarjetacreditoconexionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tarjetacreditoconexionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TarjetaCreditoConexion tarjetacreditoconexionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tarjetacreditoconexionLocal=this.tarjetacreditoconexion;
			} else {
				tarjetacreditoconexionLocal=this.tarjetacreditoconexionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tarjetacreditoconexionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTarjetaCreditoConexion(tarjetacreditoconexionLocal,true);
					
					if(tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tarjetacreditoconexionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tarjetacreditoconexionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(tarjetacreditoconexion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(tarjetacreditoconexion);
	}
	
	public void setVariablesFormularioToObjetoActualTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(tarjetacreditoconexion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.getText()==null || this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.getText()=="" || this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.getText()=="Id") {
				this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setText("0");
			}

			if(conColumnasBase) {tarjetacreditoconexion.setId(Long.parseLong(this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetaCreditoConexionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelIdTarjetaCreditoConexion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexionBean,TarjetaCreditoConexion tarjetacreditoconexion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tarjetacreditoconexionBean.getid_tarjeta_credito()!=null && !tarjetacreditoconexionBean.getid_tarjeta_credito().equals(-1L))) {tarjetacreditoconexion.setid_tarjeta_credito(tarjetacreditoconexionBean.getid_tarjeta_credito());}
			if(conDefault || (!conDefault && tarjetacreditoconexionBean.getid_conexion()!=null && !tarjetacreditoconexionBean.getid_conexion().equals(-1L))) {tarjetacreditoconexion.setid_conexion(tarjetacreditoconexionBean.getid_conexion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexionOrigen,TarjetaCreditoConexion tarjetacreditoconexion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tarjetacreditoconexionOrigen.getId()!=null && !tarjetacreditoconexionOrigen.getId().equals(0L))) {tarjetacreditoconexion.setId(tarjetacreditoconexionOrigen.getId());}}
			if(conDefault || (!conDefault && tarjetacreditoconexionOrigen.getid_tarjeta_credito()!=null && !tarjetacreditoconexionOrigen.getid_tarjeta_credito().equals(-1L))) {tarjetacreditoconexion.setid_tarjeta_credito(tarjetacreditoconexionOrigen.getid_tarjeta_credito());}
			if(conDefault || (!conDefault && tarjetacreditoconexionOrigen.getid_conexion()!=null && !tarjetacreditoconexionOrigen.getid_conexion().equals(-1L))) {tarjetacreditoconexion.setid_conexion(tarjetacreditoconexionOrigen.getid_conexion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setText(tarjetacreditoconexion.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTarjetaCreditoConexion(TarjetaCreditoConexionBean tarjetacreditoconexionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setText(tarjetacreditoconexionBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTarjetaCreditoConexion(TarjetaCreditoConexionParameterReturnGeneral tarjetacreditoconexionReturnGeneral,TarjetaCreditoConexionBean tarjetacreditoconexionBean,Boolean conDefault) throws Exception { 
		try {
			TarjetaCreditoConexion tarjetacreditoconexionLocal=new TarjetaCreditoConexion();
			
			tarjetacreditoconexionLocal=tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tarjetacreditoconexionLocal.getId()!=null && !tarjetacreditoconexionLocal.getId().equals(0L))) {tarjetacreditoconexionBean.setId(tarjetacreditoconexionLocal.getId());}}
			if(conDefault || (!conDefault && tarjetacreditoconexionLocal.getid_tarjeta_credito()!=null && !tarjetacreditoconexionLocal.getid_tarjeta_credito().equals(-1L))) {tarjetacreditoconexionBean.setid_tarjeta_credito(tarjetacreditoconexionLocal.getid_tarjeta_credito());}
			if(conDefault || (!conDefault && tarjetacreditoconexionLocal.getid_conexion()!=null && !tarjetacreditoconexionLocal.getid_conexion().equals(-1L))) {tarjetacreditoconexionBean.setid_conexion(tarjetacreditoconexionLocal.getid_conexion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTarjetaCreditoConexionGenerico(Long idTarjetaCreditoConexionSeleccionado,JComboBox jComboBoxTarjetaCreditoConexion,List<TarjetaCreditoConexion> tarjetacreditoconexionsLocal)throws Exception {
		try {
			TarjetaCreditoConexion  tarjetacreditoconexionTemp=null;

			for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsLocal) {
				if(tarjetacreditoconexionAux.getId()!=null && tarjetacreditoconexionAux.getId().equals(idTarjetaCreditoConexionSeleccionado)) {
					tarjetacreditoconexionTemp=tarjetacreditoconexionAux;
					break;
				}
			}

			jComboBoxTarjetaCreditoConexion.setSelectedItem(tarjetacreditoconexionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTarjetaCreditoConexionGenerico(JComboBox jComboBoxTarjetaCreditoConexion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTarjetaCreditoConexion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTarjetaCreditoConexion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTarjetaCreditoConexion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTarjetaCreditoConexion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTarjetaCreditoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTarjetaCreditoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetacreditoconexion=(TarjetaCreditoConexion) tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tarjetacreditoconexion =(TarjetaCreditoConexion) tarjetacreditoconexions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tarjetacreditoconexion.getIsNew() && !tarjetacreditoconexion.getIsChanged() && !tarjetacreditoconexion.getIsDeleted()) {
				sDescripcion=tarjetacreditoconexion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditoconexion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!tarjetacreditoconexion.getIsNew() && !tarjetacreditoconexion.getIsChanged() && !tarjetacreditoconexion.getIsDeleted()) {
				sDescripcion=tarjetacreditoconexion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditoconexion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TarjetaCredito")) {
			//sDescripcion=this.getActualTarjetaCreditoForeignKeyDescripcion((Long)value);
			if(!tarjetacreditoconexion.getIsNew() && !tarjetacreditoconexion.getIsChanged() && !tarjetacreditoconexion.getIsDeleted()) {
				sDescripcion=tarjetacreditoconexion.gettarjetacredito_descripcion();
			} else {
				//sDescripcion=this.getActualTarjetaCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditoconexion.gettarjetacredito_descripcion();
			}
		}

		if(sTipo.equals("Conexion")) {
			//sDescripcion=this.getActualConexionForeignKeyDescripcion((Long)value);
			if(!tarjetacreditoconexion.getIsNew() && !tarjetacreditoconexion.getIsChanged() && !tarjetacreditoconexion.getIsDeleted()) {
				sDescripcion=tarjetacreditoconexion.getconexion_descripcion();
			} else {
				//sDescripcion=this.getActualConexionForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditoconexion.getconexion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TarjetaCreditoConexion tarjetacreditoconexionRow=new TarjetaCreditoConexion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetacreditoconexionRow=(TarjetaCreditoConexion) tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tarjetacreditoconexionRow=(TarjetaCreditoConexion) tarjetacreditoconexions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion));			
			this.jButtonDuplicarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion && this.isPermisoDuplicarTarjetaCreditoConexion));			
			this.jButtonCopiarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaCopiarTarjetaCreditoConexion && this.isPermisoCopiarTarjetaCreditoConexion));
			this.jButtonVerFormTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaVerFormTarjetaCreditoConexion && this.isPermisoVerFormTarjetaCreditoConexion));
			
			this.jButtonAbrirOrderByTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoConexion && this.isPermisoOrdenTarjetaCreditoConexion));			
			
			this.jButtonNuevoRelacionesTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion));			
			this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaModificarTarjetaCreditoConexion && this.isPermisoActualizarTarjetaCreditoConexion));	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaActualizarTarjetaCreditoConexion && this.isPermisoActualizarTarjetaCreditoConexion));	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaEliminarTarjetaCreditoConexion && this.isPermisoEliminarTarjetaCreditoConexion));
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarTarjetaCreditoConexion.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoConexion);							
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion));						
			this.jButtonDuplicarToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion && this.isPermisoDuplicarTarjetaCreditoConexion));						
			this.jButtonCopiarToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaCopiarTarjetaCreditoConexion && this.isPermisoCopiarTarjetaCreditoConexion));			
			this.jButtonVerFormToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaVerFormTarjetaCreditoConexion && this.isPermisoVerFormTarjetaCreditoConexion));			
			this.jButtonAbrirOrderByToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoConexion && this.isPermisoOrdenTarjetaCreditoConexion));
			this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion));			
			this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));			
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaModificarTarjetaCreditoConexion && this.isPermisoActualizarTarjetaCreditoConexion));	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaActualizarTarjetaCreditoConexion  && this.isPermisoActualizarTarjetaCreditoConexion));	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaEliminarTarjetaCreditoConexion && this.isPermisoEliminarTarjetaCreditoConexion));
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarToolBarTarjetaCreditoConexion.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoConexion);				
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion));			
			this.jMenuItemDuplicarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion && this.isPermisoDuplicarTarjetaCreditoConexion));			
			this.jMenuItemCopiarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaCopiarTarjetaCreditoConexion && this.isPermisoCopiarTarjetaCreditoConexion));			
			this.jMenuItemVerFormTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaVerFormTarjetaCreditoConexion && this.isPermisoVerFormTarjetaCreditoConexion));			
			this.jMenuItemAbrirOrderByTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoConexion && this.isPermisoOrdenTarjetaCreditoConexion));			
			//this.jMenuItemMostrarOcultarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoConexion && this.isPermisoOrdenTarjetaCreditoConexion));
			this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoConexion && this.isPermisoOrdenTarjetaCreditoConexion));			
			//this.jMenuItemDetalleMostrarOcultarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoConexion && this.isPermisoOrdenTarjetaCreditoConexion));			
			this.jMenuItemNuevoRelacionesTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion));			
			this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoConexion && this.isPermisoNuevoTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));									
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemModificarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaModificarTarjetaCreditoConexion && this.isPermisoActualizarTarjetaCreditoConexion));	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemActualizarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaActualizarTarjetaCreditoConexion && this.isPermisoActualizarTarjetaCreditoConexion));	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemEliminarTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaEliminarTarjetaCreditoConexion && this.isPermisoEliminarTarjetaCreditoConexion));
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemCancelarTarjetaCreditoConexion.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoConexion);				
			}
			
			this.jMenuItemGuardarCambiosTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));						
			this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=this.jButtonNuevoTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion=this.jButtonDuplicarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaCopiarTarjetaCreditoConexion=this.jButtonCopiarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaVerFormTarjetaCreditoConexion=this.jButtonVerFormTarjetaCreditoConexion.isVisible();
			
			this.isVisibilidadCeldaOrdenTarjetaCreditoConexion=this.jButtonAbrirOrderByTarjetaCreditoConexion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=this.jButtonNuevoRelacionesTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=this.jButtonModificarTarjetaCreditoConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=this.jButtonNuevoToolBarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarToolBarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarToolBarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarToolBarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarToolBarTarjetaCreditoConexion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=this.jButtonGuardarCambiosToolBarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=this.jMenuItemNuevoTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=this.jMenuItemNuevoRelacionesTarjetaCreditoConexion.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemModificarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemActualizarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemEliminarTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemCancelarTarjetaCreditoConexion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=this.jMenuItemGuardarCambiosTarjetaCreditoConexion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTarjetaCreditoConexion(Boolean esInicializar) {
		if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
				//if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTarjetaCreditoConexion();
			}
			
			this.inicializarActualizarBindingBotonesManualTarjetaCreditoConexion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTarjetaCreditoConexion() {
		this.jButtonNuevoTarjetaCreditoConexion.setVisible(this.isPermisoNuevoTarjetaCreditoConexion);			
		this.jButtonDuplicarTarjetaCreditoConexion.setVisible(this.isPermisoDuplicarTarjetaCreditoConexion);			
		this.jButtonCopiarTarjetaCreditoConexion.setVisible(this.isPermisoCopiarTarjetaCreditoConexion);			
		this.jButtonVerFormTarjetaCreditoConexion.setVisible(this.isPermisoVerFormTarjetaCreditoConexion);			
		
		this.jButtonAbrirOrderByTarjetaCreditoConexion.setVisible(this.isPermisoOrdenTarjetaCreditoConexion);					
		
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.setVisible(this.isPermisoNuevoTarjetaCreditoConexion);			
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarTarjetaCreditoConexion.setVisible(this.isPermisoActualizarTarjetaCreditoConexion);	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarTarjetaCreditoConexion.setVisible(this.isPermisoActualizarTarjetaCreditoConexion);	
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarTarjetaCreditoConexion.setVisible(this.isPermisoEliminarTarjetaCreditoConexion);
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarTarjetaCreditoConexion.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoConexion);						
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.setVisible(this.isPermisoGuardarCambiosTarjetaCreditoConexion);							
		}
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.setVisible(this.isPermisoActualizarTarjetaCreditoConexion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTarjetaCreditoConexion() {
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarTarjetaCreditoConexion.setVisible(this.isPermisoActualizarTarjetaCreditoConexion);	
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarTarjetaCreditoConexion.setVisible(this.isPermisoActualizarTarjetaCreditoConexion);	
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarTarjetaCreditoConexion.setVisible(this.isPermisoEliminarTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarTarjetaCreditoConexion.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoConexion);							
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoConexion && this.isPermisoGuardarCambiosTarjetaCreditoConexion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTarjetaCreditoConexion() {
		if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTarjetaCreditoConexion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTarjetaCreditoConexion() {
	}
	
	public void jTableDatosTarjetaCreditoConexionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTarjetaCreditoConexion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTarjetaCreditoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditoconexion==null) {
						this.tarjetacreditoconexion = new TarjetaCreditoConexion();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				}

				if(this.tarjetacreditoconexion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tarjetacreditoconexion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTarjetaCreditoConexionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoConexion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoConexion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tarjetacreditoconexionLogic.getConnexion());

				if(this.tarjetacreditoconexion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tarjetacreditoconexion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoConexion=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoConexion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTarjetaCreditoConexion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTarjetaCreditoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditoconexion==null) {
						this.tarjetacreditoconexion = new TarjetaCreditoConexion();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				}

				if(this.tarjetacreditoconexion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tarjetacreditoconexion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTarjetaCreditoConexionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoConexion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoConexion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.tarjetacreditoconexionLogic.getConnexion());

				if(this.tarjetacreditoconexion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.tarjetacreditoconexion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoConexion=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoConexion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTarjetaCreditoConexion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTarjetaCreditoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditoconexion==null) {
						this.tarjetacreditoconexion = new TarjetaCreditoConexion();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				}

				if(this.tarjetacreditoconexion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.tarjetacreditoconexion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotarjetacredito=true;

			idTienePermisotarjetacredito=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoConexion(TarjetaCreditoConstantesFunciones.CLASSNAME);

			if(idTienePermisotarjetacredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoConexion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);

				this.tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tarjetacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tarjetacreditoBeanSwingJInternalFrame.getTarjetaCreditoLogic().setConnexion(this.tarjetacreditoconexionLogic.getConnexion());

				if(this.tarjetacreditoconexion.getid_tarjeta_credito()!=null) {
					this.tarjetacreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tarjetacreditoBeanSwingJInternalFrame.setIdActual(this.tarjetacreditoconexion.getid_tarjeta_credito());
					this.tarjetacreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tarjetacreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito();
				}

				JInternalFrameBase jinternalFrame =this.tarjetacreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoConexion=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoConexion.getBorder();
				TitledBorder titledBordertarjetacredito=(TitledBorder)this.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getBorder();

				titledBordertarjetacredito.setTitle(titledBorderTarjetaCreditoConexion.getTitle() + " -> Tarjeta Credito");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tarjeta_creditoTarjetaCreditoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditoconexion==null) {
						this.tarjetacreditoconexion = new TarjetaCreditoConexion();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				}

				if(this.tarjetacreditoconexion.getid_tarjeta_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tarjeta_credito = "+this.tarjetacreditoconexion.getid_tarjeta_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_conexionTarjetaCreditoConexionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoconexion=true;

			idTienePermisoconexion=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoConexion(ConexionConstantesFunciones.CLASSNAME);

			if(idTienePermisoconexion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoConexion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoConexion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);

				this.conexionBeanSwingJInternalFrame=new ConexionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.conexionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.conexionBeanSwingJInternalFrame.getConexionLogic().setConnexion(this.tarjetacreditoconexionLogic.getConnexion());

				if(this.tarjetacreditoconexion.getid_conexion()!=null) {
					this.conexionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.conexionBeanSwingJInternalFrame.setIdActual(this.tarjetacreditoconexion.getid_conexion());
					this.conexionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.conexionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.conexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConexion();
				}

				JInternalFrameBase jinternalFrame =this.conexionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoConexion=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoConexion.getBorder();
				TitledBorder titledBorderconexion=(TitledBorder)this.conexionBeanSwingJInternalFrame.jScrollPanelDatosConexion.getBorder();

				titledBorderconexion.setTitle(titledBorderTarjetaCreditoConexion.getTitle() + " -> Conexion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_conexionTarjetaCreditoConexionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.gettarjetacreditoconexion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditoconexion==null) {
						this.tarjetacreditoconexion = new TarjetaCreditoConexion();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);
				}

				if(this.tarjetacreditoconexion.getid_conexion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_conexion = "+this.tarjetacreditoconexion.getid_conexion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoConexion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdConexionTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);

			this.getTarjetaCreditoConexionsFK_IdConexion();

			this.inicializarActualizarBindingTarjetaCreditoConexion(false);

			//if(TarjetaCreditoConexionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);

			this.getTarjetaCreditoConexionsFK_IdEmpresa();

			this.inicializarActualizarBindingTarjetaCreditoConexion(false);

			//if(TarjetaCreditoConexionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);

			this.getTarjetaCreditoConexionsFK_IdSucursal();

			this.inicializarActualizarBindingTarjetaCreditoConexion(false);

			//if(TarjetaCreditoConexionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTarjetaCreditoTarjetaCreditoConexionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);

			this.getTarjetaCreditoConexionsFK_IdTarjetaCredito();

			this.inicializarActualizarBindingTarjetaCreditoConexion(false);

			//if(TarjetaCreditoConexionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditoconexionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTarjetaCreditoConexion() {
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.dispose();
			this.jInternalFrameDetalleFormTarjetaCreditoConexion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
			this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.dispose();
			this.jInternalFrameReporteDinamicoTarjetaCreditoConexion=null;
		}
		
		if(this.jInternalFrameImportacionTarjetaCreditoConexion!=null) {
			this.jInternalFrameImportacionTarjetaCreditoConexion.setVisible(false);	    			
			this.jInternalFrameImportacionTarjetaCreditoConexion.dispose();
			this.jInternalFrameImportacionTarjetaCreditoConexion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTarjetaCreditoConexion();
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTarjetaCreditoConexion")) {
				jButtonDuplicarTarjetaCreditoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTarjetaCreditoConexion")) {
				jButtonCopiarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTarjetaCreditoConexion")) {
				jButtonVerFormTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTarjetaCreditoConexion")) {
				jButtonDuplicarTarjetaCreditoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTarjetaCreditoConexion")) {
				jButtonDuplicarTarjetaCreditoConexionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTarjetaCreditoConexion")) {
				jButtonModificarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTarjetaCreditoConexion")) {
				jButtonModificarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTarjetaCreditoConexion")) {
				jButtonModificarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTarjetaCreditoConexion")) {
				jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTarjetaCreditoConexion")) {
				jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTarjetaCreditoConexion")) {
				jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTarjetaCreditoConexion")) {
				jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTarjetaCreditoConexion")) {
				jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTarjetaCreditoConexion")) {
				jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTarjetaCreditoConexion")) {
				jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTarjetaCreditoConexion")) {
				jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTarjetaCreditoConexion")) {
				jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTarjetaCreditoConexion")) {
				jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTarjetaCreditoConexion")) {
				jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTarjetaCreditoConexion")) {
				jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTarjetaCreditoConexion")) {
				jButtonMostrarOcultarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTarjetaCreditoConexion")) {
				jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTarjetaCreditoConexion")) {
				jButtonCopiarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTarjetaCreditoConexion")) {
				jButtonVerFormTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTarjetaCreditoConexion")) {
				jButtonCopiarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTarjetaCreditoConexion")) {
				jButtonVerFormTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTarjetaCreditoConexion")) {
				jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTarjetaCreditoConexion")) {
				jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTarjetaCreditoConexion")) {
				jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTarjetaCreditoConexion")) {
				jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTarjetaCreditoConexion")) {
				jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTarjetaCreditoConexion")) {
				jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTarjetaCreditoConexion")) {
				jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTarjetaCreditoConexion")) {
				jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTarjetaCreditoConexion")) {
				jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTarjetaCreditoConexion") || sTipo.equals("MenuItemDetalleAbrirOrderByTarjetaCreditoConexion")) {
				jButtonAbrirOrderByTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTarjetaCreditoConexion") || sTipo.equals("MenuItemDetalleMostrarOcultarTarjetaCreditoConexion")) {
				jButtonMostrarOcultarTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTarjetaCreditoConexion")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTarjetaCreditoConexion")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTarjetaCreditoConexion")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTarjetaCreditoConexion")) {
				jButtonCerrarReporteDinamicoTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTarjetaCreditoConexion")) {
				jButtonGenerarReporteDinamicoTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTarjetaCreditoConexion")) {
				
				jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTarjetaCreditoConexion")) {
				jButtonCerrarImportacionTarjetaCreditoConexionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTarjetaCreditoConexion")) {
				
				jButtonGenerarImportacionTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTarjetaCreditoConexion")) {
				
				jButtonAbrirImportacionTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTarjetaCreditoConexion")) {
				jComboBoxTiposAccionesTarjetaCreditoConexionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTarjetaCreditoConexion")) {
				jComboBoxTiposRelacionesTarjetaCreditoConexionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTarjetaCreditoConexion")) {
				jComboBoxTiposAccionesTarjetaCreditoConexionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTarjetaCreditoConexion")) {
				
				jComboBoxTiposSeleccionarTarjetaCreditoConexionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTarjetaCreditoConexion")) {
				jTextFieldValorCampoGeneralTarjetaCreditoConexionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTarjetaCreditoConexion")) {
				jButtonAbrirOrderByTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTarjetaCreditoConexion")) {
				jButtonAbrirOrderByTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTarjetaCreditoConexion")) {
				jButtonCerrarOrderByTarjetaCreditoConexionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTarjetaCreditoConexionBusqueda")) {
				this.jButtonidTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoConexionUpdate")) {
				this.jButtonid_empresaTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_empresaTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoConexionUpdate")) {
				this.jButtonid_sucursalTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_sucursalTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoConexionUpdate")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_conexionTarjetaCreditoConexionUpdate")) {
				this.jButtonid_conexionTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_conexionTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_conexionTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdConexionTarjetaCreditoConexion")) {
				this.jButtonFK_IdConexionTarjetaCreditoConexionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTarjetaCreditoTarjetaCreditoConexion")) {
				this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexionActionPerformed(evt);
			}
			
			;
			
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTarjetaCreditoConexion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TarjetaCreditoConexion tarjetacreditoconexionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tarjetacreditoconexionLocal=this.tarjetacreditoconexion;
			} else {
				tarjetacreditoconexionLocal=this.tarjetacreditoconexionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
							
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
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
			
			


			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
								
						
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
								
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
							
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
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
			
			


			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
								
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTarjetaCreditoConexion")) {
					jCheckBoxSeleccionarTodosTarjetaCreditoConexionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTarjetaCreditoConexion")) {
					jCheckBoxSeleccionadosTarjetaCreditoConexionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTarjetaCreditoConexion")) {
					
				}
				
				


				
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
												
				
				


				
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
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
			
			


			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditoconexion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditoconexion);
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
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
				
				


				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoConexion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoConexion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoConexionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditoconexionAnterior =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTarjetaCreditoConexion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTarjetaCreditoConexionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTarjetaCreditoConexion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tarjetacreditoconexion =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tarjetacreditoconexion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTarjetaCreditoConexion")) {
				
				}
				
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTarjetaCreditoConexion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTarjetaCreditoConexion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTarjetaCreditoConexion")) {
			
			}
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTarjetaCreditoConexion();
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			if(sTipo.equals("NuevoTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTarjetaCreditoConexion")) {
				jButtonDuplicarTarjetaCreditoConexionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTarjetaCreditoConexion")) {
				jButtonCopiarTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTarjetaCreditoConexion")) {
				jButtonVerFormTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTarjetaCreditoConexion")) {
				jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTarjetaCreditoConexion")) {
				jButtonModificarTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTarjetaCreditoConexion")) {
				jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTarjetaCreditoConexion")) {
				jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTarjetaCreditoConexion")) {
				jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTarjetaCreditoConexion")) {
				jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTarjetaCreditoConexion")) {
				jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTarjetaCreditoConexion")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTarjetaCreditoConexion")) {
				jButtonAbrirOrderByTarjetaCreditoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTarjetaCreditoConexion")) {
				jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTarjetaCreditoConexion")) {
				jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTarjetaCreditoConexion")) {
				jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTarjetaCreditoConexionBusqueda")) {
				this.jButtonidTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoConexionUpdate")) {
				this.jButtonid_empresaTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_empresaTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoConexionUpdate")) {
				this.jButtonid_sucursalTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_sucursalTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoConexionUpdate")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_conexionTarjetaCreditoConexionUpdate")) {
				this.jButtonid_conexionTarjetaCreditoConexionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_conexionTarjetaCreditoConexionBusqueda")) {
				this.jButtonid_conexionTarjetaCreditoConexionBusquedaActionPerformed(evt);
			}
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTarjetaCreditoConexion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTarjetaCreditoConexion")) {
				closingInternalFrameTarjetaCreditoConexion();
				
			} else if(sTipo.equals("jButtonCancelarTarjetaCreditoConexion")) {
				JInternalFrameBase jInternalFrameDetalleFormTarjetaCreditoConexion = (JInternalFrameBase)evt.getSource();
	            	
	            TarjetaCreditoConexionBeanSwingJInternalFrame jInternalFrameParent=(TarjetaCreditoConexionBeanSwingJInternalFrame)jInternalFrameDetalleFormTarjetaCreditoConexion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTarjetaCreditoConexionActionPerformed(null);
			}
			
			TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tarjetacreditoconexion,new Object(),this.tarjetacreditoconexionParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTarjetaCreditoConexion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTarjetaCreditoConexion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTarjetaCreditoConexion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tarjetacreditoconexion)) {
			if(!esControlTabla) {
				if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);			
				}
				
				if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tarjetacreditoconexionReturnGeneral=tarjetacreditoconexionLogic.procesarEventosTarjetaCreditoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.tarjetacreditoconexion,this.tarjetacreditoconexionParameterGeneral,this.isEsNuevoTarjetaCreditoConexion,classes);//this.tarjetacreditoconexionLogic.getTarjetaCreditoConexion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral,this.tarjetacreditoconexionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTarjetaCreditoConexion(classes,this.tarjetacreditoconexionReturnGeneral,this.tarjetacreditoconexionBean,false);
					}
						
					if(this.tarjetacreditoconexionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion());	
					}
						
					if(this.tarjetacreditoconexionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion(),classes);//this.tarjetacreditoconexionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoConexion(this.tarjetacreditoconexion,classes);//this.tarjetacreditoconexionBean);									
				}
			
				if(TarjetaCreditoConexionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoConexion(this.tarjetacreditoconexion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoConexion(this.tarjetacreditoconexion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tarjetacreditoconexionAnterior!=null) {
						this.tarjetacreditoconexion=this.tarjetacreditoconexionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tarjetacreditoconexionReturnGeneral=tarjetacreditoconexionLogic.procesarEventosTarjetaCreditoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.tarjetacreditoconexion,this.tarjetacreditoconexionParameterGeneral,this.isEsNuevoTarjetaCreditoConexion,classes);//this.tarjetacreditoconexionLogic.getTarjetaCreditoConexion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tarjetacreditoconexionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion(),tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion(),this.tarjetacreditoconexions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTarjetaCreditoConexion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTarjetaCreditoConexion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTarjetaCreditoConexion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTarjetaCreditoConexion() throws Exception {
		
		TarjetaCreditoConexionModel tarjetacreditoconexionModel=(TarjetaCreditoConexionModel)this.jTableDatosTarjetaCreditoConexion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetacreditoconexionModel.tarjetacreditoconexions=this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tarjetacreditoconexionModel.tarjetacreditoconexions=this.tarjetacreditoconexions;
		}
		
		
		((TarjetaCreditoConexionModel) this.jTableDatosTarjetaCreditoConexion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTarjetaCreditoConexion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettarjetacreditoconexionAnterior(),this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettarjetacreditoconexionAnterior(),this.tarjetacreditoconexions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTarjetaCreditoConexion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
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
										
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditoconexion,new Object(),generalEntityParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TarjetaCreditoConexionConstantesFunciones.getClassesRelationshipsOfTarjetaCreditoConexion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TarjetaCreditoConexionConstantesFunciones.getClassesRelationshipsFromStringsOfTarjetaCreditoConexion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTarjetaCreditoConexion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditoconexion,new Object(),generalEntityParameterGeneral,this.tarjetacreditoconexionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTarjetaCreditoConexion(TarjetaCreditoConexionBean tarjetacreditoconexionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTarjetaCreditoConexion(ArrayList<Classe> classes,TarjetaCreditoConexionReturnGeneral tarjetacreditoconexionReturnGeneral,TarjetaCreditoConexionBean tarjetacreditoconexionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tarjetacreditoconexion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion = new TarjetaCreditoConexionDetalleFormJInternalFrame(jDesktopPane,this.tarjetacreditoconexionSessionBean.getConGuardarRelaciones(),this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.setVisible(false);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.tarjetacreditoconexionLogic=this.tarjetacreditoconexionLogic;
		
		this.cargarCombosFrameForeignKeyTarjetaCreditoConexion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTarjetaCreditoConexion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTarjetaCreditoConexion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTarjetaCreditoConexion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTarjetaCreditoConexion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTarjetaCreditoConexion"));
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"ModificarTarjetaCreditoConexion"));

		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTarjetaCreditoConexion"));
					
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemModificarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTarjetaCreditoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"ActualizarTarjetaCreditoConexion"));
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTarjetaCreditoConexion"));
						
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemActualizarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTarjetaCreditoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"EliminarTarjetaCreditoConexion"));
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTarjetaCreditoConexion"));
								
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemEliminarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTarjetaCreditoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CancelarTarjetaCreditoConexion"));
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTarjetaCreditoConexion"));
					
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemCancelarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTarjetaCreditoConexion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemDetalleCerrarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTarjetaCreditoConexion"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetaCreditoConexion"));
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetaCreditoConexion"));
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTarjetaCreditoConexion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonidTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_empresaTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_empresaTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_sucursalTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_sucursalTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_conexionTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_conexionTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_conexionTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_conexionTarjetaCreditoConexionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTarjetaCreditoConexion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTarjetaCreditoConexion"));
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTarjetaCreditoConexion"));
		}
		
		this.jTableDatosTarjetaCreditoConexion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTarjetaCreditoConexion"));
		
		this.jTableDatosTarjetaCreditoConexion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTarjetaCreditoConexion"));
		
		this.jButtonNuevoTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"NuevoTarjetaCreditoConexion"));
		
		this.jButtonDuplicarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"DuplicarTarjetaCreditoConexion"));
		
		this.jButtonCopiarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"CopiarTarjetaCreditoConexion"));
		
		this.jButtonVerFormTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"VerFormTarjetaCreditoConexion"));
		
		
		this.jButtonNuevoToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTarjetaCreditoConexion"));
			
		this.jButtonDuplicarToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTarjetaCreditoConexion"));
			
		this.jMenuItemNuevoTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTarjetaCreditoConexion"));
			
		this.jMenuItemDuplicarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTarjetaCreditoConexion"));		
		
		
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTarjetaCreditoConexion"));
		
		
		this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTarjetaCreditoConexion"));
			
		this.jMenuItemNuevoRelacionesTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTarjetaCreditoConexion"));		
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"ModificarTarjetaCreditoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonModificarToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTarjetaCreditoConexion"));
			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemModificarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTarjetaCreditoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"ActualizarTarjetaCreditoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonActualizarToolBarTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTarjetaCreditoConexion"));
				
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemActualizarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTarjetaCreditoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"EliminarTarjetaCreditoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonEliminarToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTarjetaCreditoConexion"));
						
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemEliminarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTarjetaCreditoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CancelarTarjetaCreditoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonCancelarToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTarjetaCreditoConexion"));
			
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemCancelarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTarjetaCreditoConexion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTarjetaCreditoConexion"));		
		
		
		this.jButtonCerrarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CerrarTarjetaCreditoConexion"));
		
		
		this.jButtonCerrarToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTarjetaCreditoConexion"));
			
		this.jMenuItemCerrarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTarjetaCreditoConexion"));
			
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jMenuItemDetalleCerrarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTarjetaCreditoConexion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTarjetaCreditoConexion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetaCreditoConexion"));
		}
		
		this.jButtonCopiarToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTarjetaCreditoConexion"));
			
		this.jButtonVerFormToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTarjetaCreditoConexion"));
		
		this.jMenuItemGuardarCambiosTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTarjetaCreditoConexion"));
			
		this.jMenuItemCopiarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTarjetaCreditoConexion"));		
		
		this.jMenuItemVerFormTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTarjetaCreditoConexion"));		
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTarjetaCreditoConexion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTarjetaCreditoConexion"));
			
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTarjetaCreditoConexion"));		
		
		
		
		this.jButtonRecargarInformacionTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTarjetaCreditoConexion"));
					
		this.jButtonRecargarInformacionToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTarjetaCreditoConexion"));
		
		this.jMenuItemRecargarInformacionTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTarjetaCreditoConexion"));		
		
		
		
		this.jButtonAnterioresTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"AnterioresTarjetaCreditoConexion"));
		
		
		this.jButtonAnterioresToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTarjetaCreditoConexion"));
		
		this.jMenuItemAnterioresTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTarjetaCreditoConexion"));		
		
		
		this.jButtonSiguientesTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"SiguientesTarjetaCreditoConexion"));
		
		
		this.jButtonSiguientesToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTarjetaCreditoConexion"));
			
		this.jMenuItemSiguientesTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTarjetaCreditoConexion"));
			
		this.jMenuItemAbrirOrderByTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTarjetaCreditoConexion"));
			
		this.jMenuItemMostrarOcultarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTarjetaCreditoConexion"));
			
		this.jMenuItemDetalleAbrirOrderByTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTarjetaCreditoConexion"));
			
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTarjetaCreditoConexion"));		
		
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTarjetaCreditoConexion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTarjetaCreditoConexion"));
			
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTarjetaCreditoConexion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTarjetaCreditoConexion"));

		this.jCheckBoxSeleccionadosTarjetaCreditoConexion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTarjetaCreditoConexion"));
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTarjetaCreditoConexion"));
		}
		
		
		this.jComboBoxTiposRelacionesTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTarjetaCreditoConexion"));
			
		this.jComboBoxTiposAccionesTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"TiposAccionesTarjetaCreditoConexion"));
					
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTarjetaCreditoConexion"));
			
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTarjetaCreditoConexion"));		
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonidTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_empresaTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_empresaTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_sucursalTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_sucursalTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_conexionTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_conexionTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_conexionTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_conexionTarjetaCreditoConexionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdConexionTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"FK_IdConexionTarjetaCreditoConexion"));

			this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"FK_IdTarjetaCreditoTarjetaCreditoConexion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoConexion!=null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetaCreditoConexion"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetaCreditoConexion"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoConexion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetaCreditoConexion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetaCreditoConexion"));				
			//this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetaCreditoConexion"));
			//this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetaCreditoConexion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTarjetaCreditoConexion!=null) {
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTarjetaCreditoConexion"));
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTarjetaCreditoConexion"));
				this.jInternalFrameImportacionTarjetaCreditoConexion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTarjetaCreditoConexion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTarjetaCreditoConexion"));
			
			this.jButtonAbrirOrderByToolBarTarjetaCreditoConexion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTarjetaCreditoConexion"));			
			
			if(this.jInternalFrameOrderByTarjetaCreditoConexion!=null) {
				this.jInternalFrameOrderByTarjetaCreditoConexion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTarjetaCreditoConexion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoConexion.jTabbedPaneRelacionesTarjetaCreditoConexion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTarjetaCreditoConexion"));
		
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
            		closingInternalFrameTarjetaCreditoConexion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTarjetaCreditoConexion = (JInternalFrameBase)event.getSource();
	            	
	            TarjetaCreditoConexionBeanSwingJInternalFrame jInternalFrameParent=(TarjetaCreditoConexionBeanSwingJInternalFrame)jInternalFrameDetalleFormTarjetaCreditoConexion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTarjetaCreditoConexionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTarjetaCreditoConexion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTarjetaCreditoConexionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTarjetaCreditoConexion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTarjetaCreditoConexion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTarjetaCreditoConexion";
		inputMap = this.jButtonNuevoTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTarjetaCreditoConexion";
		inputMap = this.jButtonNuevoRelacionesTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTarjetaCreditoConexionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTarjetaCreditoConexion";
		inputMap = this.jButtonModificarTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTarjetaCreditoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTarjetaCreditoConexion";
		inputMap = this.jButtonActualizarTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTarjetaCreditoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTarjetaCreditoConexion";
		inputMap = this.jButtonEliminarTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTarjetaCreditoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTarjetaCreditoConexion";
		inputMap = this.jButtonCancelarTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTarjetaCreditoConexion";
		inputMap = this.jButtonCerrarTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTarjetaCreditoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTarjetaCreditoConexion";
		inputMap = this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonGuardarCambiosTarjetaCreditoConexion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTarjetaCreditoConexion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTarjetaCreditoConexionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTarjetaCreditoConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTarjetaCreditoConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTarjetaCreditoConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTarjetaCreditoConexionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonidTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_empresaTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_empresaTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_sucursalTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_sucursalTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_tarjeta_creditoTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_tarjeta_creditoTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoConexionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_conexionTarjetaCreditoConexionUpdate.addActionListener(new ButtonActionListener(this,"id_conexionTarjetaCreditoConexionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jButtonid_conexionTarjetaCreditoConexionBusqueda.addActionListener(new ButtonActionListener(this,"id_conexionTarjetaCreditoConexionBusqueda"));
		
		
		this.jButtonFK_IdConexionTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"FK_IdConexionTarjetaCreditoConexion"));

		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoConexion.addActionListener(new ButtonActionListener(this,"FK_IdTarjetaCreditoTarjetaCreditoConexion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTarjetaCreditoConexion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTarjetaCreditoConexionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTarjetaCreditoConexionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTarjetaCreditoConexion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTarjetaCreditoConexion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
					tarjetacreditoconexionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexions) {
					tarjetacreditoconexionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTarjetaCreditoConexionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
						tarjetacreditoconexionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexions) {
						tarjetacreditoconexionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTarjetaCreditoConexion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTarjetaCreditoConexion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTarjetaCreditoConexionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTarjetaCreditoConexion.getSelectedRows();
			
			TarjetaCreditoConexion tarjetacreditoconexionLocal=new TarjetaCreditoConexion();
			
			//this.seleccionarTodosTarjetaCreditoConexion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoconexionLocal =(TarjetaCreditoConexion) this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions().toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tarjetacreditoconexionLocal =(TarjetaCreditoConexion) this.tarjetacreditoconexions.toArray()[this.jTableDatosTarjetaCreditoConexion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tarjetacreditoconexionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
						tarjetacreditoconexionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexions) {
						tarjetacreditoconexionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTarjetaCreditoConexion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTarjetaCreditoConexion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoConexion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTarjetaCreditoConexionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTarjetaCreditoConexionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTarjetaCreditoConexionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTarjetaCreditoConexion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexions) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTarjetaCreditoConexionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTarjetaCreditoConexion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTarjetaCreditoConexion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTarjetaCreditoConexion) {				
					conSplash=true;//false;										
					
					//this.startProcessTarjetaCreditoConexion(conSplash);
				
					this.generarReporteTarjetaCreditoConexionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTarjetaCreditoConexionsSeleccionados();
				//this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTarjetaCreditoConexionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTarjetaCreditoConexionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTarjetaCreditoConexion();
				
				this.exportarTarjetaCreditoConexionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTarjetaCreditoConexions();
				//this.importarTarjetaCreditoConexions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTarjetaCreditoConexion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTarjetaCreditoConexionsSeleccionados();
				//this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tarjeta Credito Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTarjetaCreditoConexion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTarjetaCreditoConexion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTarjetaCreditoConexion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
				}	
			} 			
			else if(TarjetaCreditoConexionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTarjetaCreditoConexion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTarjetaCreditoConexion(conSplash);
					
						//this.actualizarParametrosGeneralTarjetaCreditoConexion();
						
						this.generarReporteProcesoAccionTarjetaCreditoConexionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tarjeta Credito ConexionES SELECCIONADOS?", "MANTENIMIENTO DE Tarjeta Credito Conexion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTarjetaCreditoConexion();
				
						this.actualizarParametrosGeneralTarjetaCreditoConexion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tarjetacreditoconexionReturnGeneral=tarjetacreditoconexionLogic.procesarAccionTarjetaCreditoConexionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions(),this.tarjetacreditoconexionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTarjetaCreditoConexionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTarjetaCreditoConexion();
					
					TarjetaCreditoConexionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTarjetaCreditoConexionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTarjetaCreditoConexion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxTiposAccionesFormularioTarjetaCreditoConexion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTarjetaCreditoConexion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTarjetaCreditoConexionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTarjetaCreditoConexion();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
			TarjetaCreditoConexion tarjetacreditoconexion=new TarjetaCreditoConexion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTarjetaCreditoConexion.getSelectedItem();
			
			
			
			
			tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tarjetacreditoconexionsSeleccionados.size()==1) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsSeleccionados) {
					tarjetacreditoconexion=tarjetacreditoconexionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTarjetaCreditoConexion();
			
      		//this.finishProcessTarjetaCreditoConexion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTarjetaCreditoConexionReturnGeneral() throws Exception {
		if(this.tarjetacreditoconexionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tarjetacreditoconexionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tarjetacreditoconexionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tarjetacreditoconexionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tarjetacreditoconexionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tarjetacreditoconexionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
		}
		
		if(this.tarjetacreditoconexionReturnGeneral.getConRetornoLista() || this.tarjetacreditoconexionReturnGeneral.getConRetornoObjeto()) {
			if(this.tarjetacreditoconexionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tarjetacreditoconexionLogic.setTarjetaCreditoConexions(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tarjetacreditoconexionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tarjetacreditoconexionLogic.setTarjetaCreditoConexion(this.tarjetacreditoconexionReturnGeneral.getTarjetaCreditoConexion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTarjetaCreditoConexion(false);
		}
	}
	
	public void actualizarParametrosGeneralTarjetaCreditoConexion() throws Exception {
		
		
	}
	
	public ArrayList<TarjetaCreditoConexion> getTarjetaCreditoConexionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTarjetaCreditoConexion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionLogic.getTarjetaCreditoConexions()) {
					if(tarjetacreditoconexionAux.getIsSelected()) {
						tarjetacreditoconexionsSeleccionados.add(tarjetacreditoconexionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoConexion tarjetacreditoconexionAux:this.tarjetacreditoconexions) {
					if(tarjetacreditoconexionAux.getIsSelected()) {
						tarjetacreditoconexionsSeleccionados.add(tarjetacreditoconexionAux);				
					}
				}
			}
			
			if(tarjetacreditoconexionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tarjetacreditoconexionsSeleccionados.addAll(this.tarjetacreditoconexionLogic.getTarjetaCreditoConexions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tarjetacreditoconexionsSeleccionados.addAll(this.tarjetacreditoconexions);				
					}
				}
			}
		} else {
			tarjetacreditoconexionsSeleccionados.add(this.tarjetacreditoconexion);
		}
		
		return tarjetacreditoconexionsSeleccionados;
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
	
	public void generarReporteTarjetaCreditoConexionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTarjetaCreditoConexionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTarjetaCreditoConexionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTarjetaCreditoConexionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTarjetaCreditoConexionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tarjeta Credito Conexion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTarjetaCreditoConexionsSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTarjetaCreditoConexionsSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTarjetaCreditoConexionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTarjetaCreditoConexionsSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTarjetaCreditoConexion();
		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTarjetaCreditoConexion();
		
		
		//this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados ,tarjetacreditoconexionImplementable,tarjetacreditoconexionImplementableHome);
	}
	
	public void mostrarImportacionTarjetaCreditoConexions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTarjetaCreditoConexion();
		
		this.abrirFrameImportacionTarjetaCreditoConexion();		
		
			
		//this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados ,tarjetacreditoconexionImplementable,tarjetacreditoconexionImplementableHome);
	}
	
	public void importarTarjetaCreditoConexions() throws Exception {		
	
	}
	
	public void exportarTarjetaCreditoConexionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTarjetaCreditoConexionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTarjetaCreditoConexionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTarjetaCreditoConexionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tarjeta Credito Conexion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTarjetaCreditoConexionsSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTarjetaCreditoConexion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTarjetaCreditoConexion(tarjetacreditoconexionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tarjetacreditoconexionAux.setsDetalleGeneralEntityReporte(tarjetacreditoconexionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTarjetaCreditoConexion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TarjetaCreditoConexionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoConexionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tarjetacreditoconexion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditoconexion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditoconexion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditoconexion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditoconexion.gettarjetacredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditoconexion.getconexion_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTarjetaCreditoConexionsSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TarjetaCreditoConexions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTarjetaCreditoConexion(row);				
				iRow++;
			}				
			
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTarjetaCreditoConexion(tarjetacreditoconexionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTarjetaCreditoConexionsSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();		
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditoconexion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tarjetacreditoconexions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tarjetacreditoconexion");
			//elementRoot.appendChild(element);
		
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsSeleccionados) {
				element = document.createElement("tarjetacreditoconexion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTarjetaCreditoConexion(tarjetacreditoconexionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Conexion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTarjetaCreditoConexion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditoconexion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditoconexion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditoconexion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditoconexion.gettarjetacredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditoconexion.getconexion_descripcion());				
	}
	
	public void setFilaDatosExportarXmlTarjetaCreditoConexion(TarjetaCreditoConexion tarjetacreditoconexion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TarjetaCreditoConexionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tarjetacreditoconexion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TarjetaCreditoConexionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tarjetacreditoconexion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TarjetaCreditoConexionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tarjetacreditoconexion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TarjetaCreditoConexionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(tarjetacreditoconexion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtarjetacredito_descripcion = document.createElement(TarjetaCreditoConexionConstantesFunciones.IDTARJETACREDITO);
		elementtarjetacredito_descripcion.appendChild(document.createTextNode(tarjetacreditoconexion.gettarjetacredito_descripcion()));
		element.appendChild(elementtarjetacredito_descripcion);

		Element elementconexion_descripcion = document.createElement(TarjetaCreditoConexionConstantesFunciones.IDCONEXION);
		elementconexion_descripcion.appendChild(document.createTextNode(tarjetacreditoconexion.getconexion_descripcion()));
		element.appendChild(elementconexion_descripcion);
	}
	
	public void generarReporteGroupGenericoTarjetaCreditoConexionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados=new ArrayList<TarjetaCreditoConexion>();
		
		tarjetacreditoconexionsSeleccionados=this.getTarjetaCreditoConexionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTarjetaCreditoConexion(tarjetacreditoconexionsSeleccionados);
		
		this.generarReporteTarjetaCreditoConexions("Todos",tarjetacreditoconexionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTarjetaCreditoConexion(ArrayList<TarjetaCreditoConexion> tarjetacreditoconexionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TarjetaCreditoConexion tarjetacreditoconexionAux:tarjetacreditoconexionsSeleccionados) {
				tarjetacreditoconexionAux.setsDetalleGeneralEntityReporte(tarjetacreditoconexionAux.toString());
			
				if(sTipoSeleccionar.equals(TarjetaCreditoConexionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tarjetacreditoconexionAux.setsDescripcionGeneralEntityReporte1(tarjetacreditoconexionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoConexionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					tarjetacreditoconexionAux.setsDescripcionGeneralEntityReporte1(tarjetacreditoconexionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoConexionConstantesFunciones.LABEL_IDTARJETACREDITO)) {
					existe=true;
					tarjetacreditoconexionAux.setsDescripcionGeneralEntityReporte1(tarjetacreditoconexionAux.gettarjetacredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoConexionConstantesFunciones.LABEL_IDCONEXION)) {
					existe=true;
					tarjetacreditoconexionAux.setsDescripcionGeneralEntityReporte1(tarjetacreditoconexionAux.getconexion_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoConexionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTarjetaCreditoConexion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=true;
				this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=true;
				this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=true;
			}
			
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoConexion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoConexion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TarjetaCreditoConexionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=true;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=true;
		} else {
			this.actualizarEstadoPanelsTarjetaCreditoConexion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTarjetaCreditoConexion=false;
			//this.isVisibilidadCeldaVerFormTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaDuplicarTarjetaCreditoConexion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
		} else {
			this.isVisibilidadCeldaNuevoTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoConexion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			if(!tarjetacreditoconexionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;												
			}
			
			this.jButtonCerrarTarjetaCreditoConexion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoConexion=false;
		}
		
		if(!this.permiteMantenimiento(this.tarjetacreditoconexion)) {
			this.isVisibilidadCeldaActualizarTarjetaCreditoConexion=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoConexion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTarjetaCreditoConexion() {
	}
	
	public void actualizarEstadoPanelsTarjetaCreditoConexion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoConexion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoConexion!=null) {
				this.jScrollPanelDatosTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoConexion!=null) {
				this.jPanelPaginacionTarjetaCreditoConexion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
					this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoConexion!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoConexion!=null) {
				this.jPanelParametrosReportesTarjetaCreditoConexion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdConexion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdConexionTarjetaCreditoConexion);}

			this.isVisibilidadFK_IdTarjetaCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdConexion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdConexionTarjetaCreditoConexion);}

			this.isVisibilidadFK_IdTarjetaCredito=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTarjetaCredito(Boolean isParaTarjetaCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTarjetaCreditoNegation=!isParaTarjetaCredito;

			this.isVisibilidadFK_IdConexion=isParaTarjetaCreditoNegation;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdConexionTarjetaCreditoConexion);}

			this.isVisibilidadFK_IdTarjetaCredito=isParaTarjetaCredito;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);}
		}
		
	}

	public void setVisibilidadBusquedasParaConexion(Boolean isParaConexion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaConexionNegation=!isParaConexion;

			this.isVisibilidadFK_IdConexion=isParaConexion;
			if(!this.isVisibilidadFK_IdConexion) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdConexionTarjetaCreditoConexion);}

			this.isVisibilidadFK_IdTarjetaCredito=isParaConexionNegation;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		
		if(this.tarjetacreditoconexionSessionBean==null) {
			this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		}
		
		this.tarjetacreditoconexionSessionBean.setsUltimaBusquedaTarjetaCreditoConexion(this.getsAccionBusqueda());
		this.tarjetacreditoconexionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tarjetacreditoconexionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdConexion")) {
			tarjetacreditoconexionSessionBean.setid_conexion(this.getid_conexionFK_IdConexion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tarjetacreditoconexionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			tarjetacreditoconexionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTarjetaCredito")) {
			tarjetacreditoconexionSessionBean.setid_tarjeta_credito(this.getid_tarjeta_creditoFK_IdTarjetaCredito());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		
		if(this.tarjetacreditoconexionSessionBean==null) {
			this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		}
		
		if(this.tarjetacreditoconexionSessionBean.getsUltimaBusquedaTarjetaCreditoConexion()!=null&&!this.tarjetacreditoconexionSessionBean.getsUltimaBusquedaTarjetaCreditoConexion().equals("")) {
			this.setsAccionBusqueda(tarjetacreditoconexionSessionBean.getsUltimaBusquedaTarjetaCreditoConexion());
			this.setiNumeroPaginacion(tarjetacreditoconexionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tarjetacreditoconexionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdConexion")) {
				this.setid_conexionFK_IdConexion(tarjetacreditoconexionSessionBean.getid_conexion());
				tarjetacreditoconexionSessionBean.setid_conexion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tarjetacreditoconexionSessionBean.getid_empresa());
				tarjetacreditoconexionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(tarjetacreditoconexionSessionBean.getid_sucursal());
				tarjetacreditoconexionSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTarjetaCredito")) {
				this.setid_tarjeta_creditoFK_IdTarjetaCredito(tarjetacreditoconexionSessionBean.getid_tarjeta_credito());
				tarjetacreditoconexionSessionBean.setid_tarjeta_credito(-1L);
			}
		}
		
		this.tarjetacreditoconexionSessionBean.setsUltimaBusquedaTarjetaCreditoConexion("");
		this.tarjetacreditoconexionSessionBean.setiNumeroPaginacion(TarjetaCreditoConexionConstantesFunciones.INUMEROPAGINACION);
		this.tarjetacreditoconexionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTarjetaCreditoConexion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTarjetaCreditoConexion() {
		this.updateBorderResaltarBusquedasFormularioTarjetaCreditoConexion();
		this.updateVisibilidadBusquedasFormularioTarjetaCreditoConexion();
		this.updateHabilitarBusquedasFormularioTarjetaCreditoConexion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTarjetaCreditoConexion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponents().length>0) {
	

		if(this.tarjetacreditoconexionConstantesFunciones.resaltarFK_IdConexionTarjetaCreditoConexion!=null) {
			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdConexionTarjetaCreditoConexion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);
				jPanel.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarFK_IdConexionTarjetaCreditoConexion);
			}
		}

		if(this.tarjetacreditoconexionConstantesFunciones.resaltarFK_IdTarjetaCreditoTarjetaCreditoConexion!=null) {
			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);
				jPanel.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarFK_IdTarjetaCreditoTarjetaCreditoConexion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTarjetaCreditoConexion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdConexionTarjetaCreditoConexion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarFK_IdConexionTarjetaCreditoConexion);
			if(!this.tarjetacreditoconexionConstantesFunciones.mostrarFK_IdConexionTarjetaCreditoConexion && index>-1) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarFK_IdTarjetaCreditoTarjetaCreditoConexion);
			if(!this.tarjetacreditoconexionConstantesFunciones.mostrarFK_IdTarjetaCreditoTarjetaCreditoConexion && index>-1) {
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTarjetaCreditoConexion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdConexionTarjetaCreditoConexion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activarFK_IdConexionTarjetaCreditoConexion);
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setEnabledAt(index,this.tarjetacreditoconexionConstantesFunciones.activarFK_IdConexionTarjetaCreditoConexion);
			}

			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activarFK_IdTarjetaCreditoTarjetaCreditoConexion);
				this.jTabbedPaneBusquedasTarjetaCreditoConexion.setEnabledAt(index,this.tarjetacreditoconexionConstantesFunciones.activarFK_IdTarjetaCreditoTarjetaCreditoConexion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTarjetaCreditoConexion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdConexion")) {
			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdConexionTarjetaCreditoConexion);

			this.jTabbedPaneBusquedasTarjetaCreditoConexion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);

			this.tarjetacreditoconexionConstantesFunciones.setResaltarFK_IdConexionTarjetaCreditoConexion(resaltar);

			jPanel.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarFK_IdConexionTarjetaCreditoConexion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTarjetaCredito")) {
			index= this.jTabbedPaneBusquedasTarjetaCreditoConexion.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoConexion);

			this.jTabbedPaneBusquedasTarjetaCreditoConexion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoConexion.getComponent(index);

			this.tarjetacreditoconexionConstantesFunciones.setResaltarFK_IdTarjetaCreditoTarjetaCreditoConexion(resaltar);

			jPanel.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarFK_IdTarjetaCreditoTarjetaCreditoConexion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTarjetaCreditoConexion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTarjetaCreditoConexion() throws Exception {

		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTarjetaCreditoConexion();
		this.updateVisibilidadResaltarControlesFormularioTarjetaCreditoConexion();
		this.updateHabilitarResaltarControlesFormularioTarjetaCreditoConexion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTarjetaCreditoConexion() throws Exception {
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tarjetacreditoconexionConstantesFunciones.resaltaridTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltaridTarjetaCreditoConexion);}
		if(this.tarjetacreditoconexionConstantesFunciones.resaltarid_empresaTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarid_empresaTarjetaCreditoConexion);}
		if(this.tarjetacreditoconexionConstantesFunciones.resaltarid_sucursalTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarid_sucursalTarjetaCreditoConexion);}
		if(this.tarjetacreditoconexionConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoConexion);}
		if(this.tarjetacreditoconexionConstantesFunciones.resaltarid_conexionTarjetaCreditoConexion!=null && this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setBorder(this.tarjetacreditoconexionConstantesFunciones.resaltarid_conexionTarjetaCreditoConexion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTarjetaCreditoConexion() throws Exception {		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
	
		//this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostraridTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelidTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostraridTarjetaCreditoConexion);
		//this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_empresaTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelid_empresaTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_empresaTarjetaCreditoConexion);
		//this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_sucursalTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelid_sucursalTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_sucursalTarjetaCreditoConexion);
		//this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_tarjeta_creditoTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelid_tarjeta_creditoTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_tarjeta_creditoTarjetaCreditoConexion);
		//this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_conexionTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jPanelid_conexionTarjetaCreditoConexion.setVisible(this.tarjetacreditoconexionConstantesFunciones.mostrarid_conexionTarjetaCreditoConexion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTarjetaCreditoConexion() throws Exception {
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoConexion!=null) {
	
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jLabelidTarjetaCreditoConexion.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activaridTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_empresaTarjetaCreditoConexion.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activarid_empresaTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_sucursalTarjetaCreditoConexion.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activarid_sucursalTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_tarjeta_creditoTarjetaCreditoConexion.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoConexion);
		this.jInternalFrameDetalleFormTarjetaCreditoConexion.jComboBoxid_conexionTarjetaCreditoConexion.setEnabled(this.tarjetacreditoconexionConstantesFunciones.activarid_conexionTarjetaCreditoConexion);
		}
	}
	
		
}