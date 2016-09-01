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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.AutoriRetencionConstantesFunciones;
import com.bydan.erp.sris.util.AutoriRetencionParameterReturnGeneral;
//import com.bydan.erp.sris.util.AutoriRetencionParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.AutoriRetencionBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
public class AutoriRetencionBeanSwingJInternalFrame extends AutoriRetencionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AutoriRetencionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AutoriRetencion> autoriretencionValidator = new ClassValidator<AutoriRetencion>(AutoriRetencion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AutoriRetencion autoriretencion;	
	public AutoriRetencion autoriretencionAux;
	public AutoriRetencion autoriretencionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AutoriRetencion autoriretencionTotales;
	public Long idAutoriRetencionActual;
	public Long iIdNuevoAutoriRetencion=0L;
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

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
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
	
	public Boolean isPermisoTodoAutoriRetencion;
	public Boolean isPermisoNuevoAutoriRetencion;
	public Boolean isPermisoActualizarAutoriRetencion;
	public Boolean isPermisoActualizarOriginalAutoriRetencion;
	public Boolean isPermisoEliminarAutoriRetencion;
	public Boolean isPermisoGuardarCambiosAutoriRetencion;
	public Boolean isPermisoConsultaAutoriRetencion;
	public Boolean isPermisoBusquedaAutoriRetencion;
	public Boolean isPermisoReporteAutoriRetencion;
	public Boolean isPermisoPaginacionMedioAutoriRetencion;
	public Boolean isPermisoPaginacionAltoAutoriRetencion;
	public Boolean isPermisoPaginacionTodoAutoriRetencion;
	public Boolean isPermisoCopiarAutoriRetencion;
	public Boolean isPermisoVerFormAutoriRetencion;
	public Boolean isPermisoDuplicarAutoriRetencion;
	public Boolean isPermisoOrdenAutoriRetencion;
	
	
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
	
	public AutoriRetencionParameterReturnGeneral autoriretencionReturnGeneral;
	public AutoriRetencionParameterReturnGeneral autoriretencionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAutoriRetencion=false;
	public Boolean esParaAccionDesdeFormularioAutoriRetencion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AutoriRetencionSessionBeanAdditional autoriretencionSessionBeanAdditional=null;
	
	public AutoriRetencionSessionBeanAdditional getAutoriRetencionSessionBeanAdditional() {
		return this.autoriretencionSessionBeanAdditional;
	}
	
	public void setAutoriRetencionSessionBeanAdditional(AutoriRetencionSessionBeanAdditional autoriretencionSessionBeanAdditional) {
		try {
			this.autoriretencionSessionBeanAdditional=autoriretencionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AutoriRetencionBeanSwingJInternalFrameAdditional autoriretencionBeanSwingJInternalFrameAdditional=null;
	//public class AutoriRetencionBeanSwingJInternalFrame
	
	public AutoriRetencionBeanSwingJInternalFrameAdditional getAutoriRetencionBeanSwingJInternalFrameAdditional() {
		return this.autoriretencionBeanSwingJInternalFrameAdditional;
	}
	
	public void setAutoriRetencionBeanSwingJInternalFrameAdditional(AutoriRetencionBeanSwingJInternalFrameAdditional autoriretencionBeanSwingJInternalFrameAdditional) {
		try {
			this.autoriretencionBeanSwingJInternalFrameAdditional=autoriretencionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AutoriRetencionLogic autoriretencionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AutoriRetencion autoriretencionBean;
	public AutoriRetencionConstantesFunciones autoriretencionConstantesFunciones;
	//public AutoriRetencionParameterReturnGeneral autoriretencionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<AutoriRetencion> autoriretencions;	
	//public List<AutoriRetencion> autoriretencionsEliminados;
	//public List<AutoriRetencion> autoriretencionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAutoriRetencion=false;
	public Boolean isVisibilidadCeldaDuplicarAutoriRetencion=true;
	public Boolean isVisibilidadCeldaCopiarAutoriRetencion=true;
	public Boolean isVisibilidadCeldaVerFormAutoriRetencion=true;
	public Boolean isVisibilidadCeldaOrdenAutoriRetencion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
	public Boolean isVisibilidadCeldaModificarAutoriRetencion=false;
	public Boolean isVisibilidadCeldaActualizarAutoriRetencion=false;
	public Boolean isVisibilidadCeldaEliminarAutoriRetencion=false;
	public Boolean isVisibilidadCeldaCancelarAutoriRetencion=false;
	public Boolean isVisibilidadCeldaGuardarAutoriRetencion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoAutoriRetencion() {
		return this.iIdNuevoAutoriRetencion;
	}

	public void setiIdNuevoAutoriRetencion(Long iIdNuevoAutoriRetencion) {
		this.iIdNuevoAutoriRetencion = iIdNuevoAutoriRetencion;
	}
	
	public Long getidAutoriRetencionActual() {
		return this.idAutoriRetencionActual;
	}

	public void setidAutoriRetencionActual(Long idAutoriRetencionActual) {
		this.idAutoriRetencionActual = idAutoriRetencionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AutoriRetencion getautoriretencion() {
		return this.autoriretencion;
	}

	public void setautoriretencion(AutoriRetencion autoriretencion) {
		this.autoriretencion = autoriretencion;
	}
	
	public AutoriRetencion getautoriretencionAux() {
		return this.autoriretencionAux;
	}

	public void setautoriretencionAux(AutoriRetencion autoriretencionAux) {
		this.autoriretencionAux = autoriretencionAux;
	}				
	
	public AutoriRetencion getautoriretencionAnterior() {
		return this.autoriretencionAnterior;
	}

	public void setautoriretencionAnterior(AutoriRetencion autoriretencionAnterior) {
		this.autoriretencionAnterior = autoriretencionAnterior;
	}	
	
	public AutoriRetencion getautoriretencionTotales() {
		return this.autoriretencionTotales;
	}

	public void setautoriretencionTotales(AutoriRetencion autoriretencionTotales) {
		this.autoriretencionTotales = autoriretencionTotales;
	}	
	
	public AutoriRetencion getautoriretencionBean() {
		return this.autoriretencionBean;
	}

	public void setautoriretencionBean(AutoriRetencion autoriretencionBean) {
		this.autoriretencionBean = autoriretencionBean;
	}	
	
	public AutoriRetencionParameterReturnGeneral getautoriretencionReturnGeneral() {
		return this.autoriretencionReturnGeneral;
	}

	public void setautoriretencionReturnGeneral(AutoriRetencionParameterReturnGeneral autoriretencionReturnGeneral) {
		this.autoriretencionReturnGeneral = autoriretencionReturnGeneral;
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

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AutoriRetencionLogic getAutoriRetencionLogic()	{		
		return autoriretencionLogic;
	}

	public void setAutoriRetencionLogic(AutoriRetencionLogic autoriretencionLogic) {
		this.autoriretencionLogic = autoriretencionLogic;
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
	
	public Boolean getIsEsNuevoAutoriRetencion() {
		return isEsNuevoAutoriRetencion;
	}

	public void setIsEsNuevoAutoriRetencion(Boolean isEsNuevoAutoriRetencion) {
		this.isEsNuevoAutoriRetencion = isEsNuevoAutoriRetencion;
	}

	public Boolean getEsParaAccionDesdeFormularioAutoriRetencion() {
		return esParaAccionDesdeFormularioAutoriRetencion;
	}
	
	public void setEsParaAccionDesdeFormularioAutoriRetencion(Boolean esParaAccionDesdeFormularioAutoriRetencion) {
		this.esParaAccionDesdeFormularioAutoriRetencion = esParaAccionDesdeFormularioAutoriRetencion;
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

			if(this.autoriretencionSessionBean==null) {
				this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
			}

			if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(autoriretencionSessionBean.getlidEmpresaActual());
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

			if(this.autoriretencionSessionBean==null) {
				this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
			}

			if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(autoriretencionSessionBean.getlidSucursalActual());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.autoriretencionSessionBean==null) {
				this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
			}

			if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(autoriretencionSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

					if(this.autoriretencion!=null) {
						this.autoriretencion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
						this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAutoriRetencion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
						if(this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAutoriRetencionGenerico)throws Exception
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
				jComboBoxid_empresaAutoriRetencionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAutoriRetencionGenerico!=null && jComboBoxid_empresaAutoriRetencionGenerico.getItemCount()>0) {
					jComboBoxid_empresaAutoriRetencionGenerico.setSelectedIndex(0);
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

					if(this.autoriretencion!=null) {
						this.autoriretencion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
						this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalAutoriRetencion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
						if(this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalAutoriRetencionGenerico)throws Exception
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
				jComboBoxid_sucursalAutoriRetencionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalAutoriRetencionGenerico!=null && jComboBoxid_sucursalAutoriRetencionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalAutoriRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.autoriretencion!=null) {
						this.autoriretencion.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
						this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioAutoriRetencion.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
						if(this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioAutoriRetencionGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioAutoriRetencionGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioAutoriRetencionGenerico!=null && jComboBoxid_usuarioAutoriRetencionGenerico.getItemCount()>0) {
					jComboBoxid_usuarioAutoriRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AutoriRetencion autoriretencion,JComboBox jComboBoxid_empresaAutoriRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAutoriRetencionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAutoriRetencionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				autoriretencion.setid_empresa(empresaAux.getId());
				autoriretencion.setempresa_descripcion(AutoriRetencionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				autoriretencion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(AutoriRetencion autoriretencion,JComboBox jComboBoxid_sucursalAutoriRetencionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalAutoriRetencionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalAutoriRetencionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				autoriretencion.setid_sucursal(sucursalAux.getId());
				autoriretencion.setsucursal_descripcion(AutoriRetencionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				autoriretencion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(AutoriRetencion autoriretencion,JComboBox jComboBoxid_usuarioAutoriRetencionGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioAutoriRetencionGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioAutoriRetencionGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				autoriretencion.setid_usuario(usuarioAux.getId());
				autoriretencion.setusuario_descripcion(AutoriRetencionConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				autoriretencion.setUsuario(usuarioAux);			}
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

					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { 
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { 
					}

					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { 
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { 
					}

					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { 
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { 
					}

					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesAutoriRetencion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AutoriRetencionConstantesFunciones.refrescarForeignKeysDescripcionesAutoriRetencion(this.autoriretencionLogic.getAutoriRetencions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AutoriRetencionConstantesFunciones.refrescarForeignKeysDescripcionesAutoriRetencion(this.autoriretencions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//autoriretencionLogic.setAutoriRetencions(this.autoriretencions);
			autoriretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AutoriRetencionParameterReturnGeneral getAutoriRetencionParameterGeneral() {
		return this.autoriretencionParameterGeneral;
	}
	
	public void setAutoriRetencionParameterGeneral(AutoriRetencionParameterReturnGeneral autoriretencionParameterGeneral) {
		this.autoriretencionParameterGeneral = autoriretencionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAutoriRetencion() {
		return isPermisoTodoAutoriRetencion;
	}

	public void setIsPermisoTodoAutoriRetencion(Boolean isPermisoTodoAutoriRetencion) {
		this.isPermisoTodoAutoriRetencion = isPermisoTodoAutoriRetencion;
	}

	public Boolean getIsPermisoNuevoAutoriRetencion() {
		return isPermisoNuevoAutoriRetencion;
	}

	public void setIsPermisoNuevoAutoriRetencion(Boolean isPermisoNuevoAutoriRetencion) {
		this.isPermisoNuevoAutoriRetencion = isPermisoNuevoAutoriRetencion;
	}

	public Boolean getIsPermisoActualizarAutoriRetencion() {
		return isPermisoActualizarAutoriRetencion;
	}

	public void setIsPermisoActualizarAutoriRetencion(Boolean isPermisoActualizarAutoriRetencion) {
		this.isPermisoActualizarAutoriRetencion = isPermisoActualizarAutoriRetencion;
	}

	public Boolean getIsPermisoEliminarAutoriRetencion() {
		return isPermisoEliminarAutoriRetencion;
	}

	public void setIsPermisoEliminarAutoriRetencion(Boolean isPermisoEliminarAutoriRetencion) {
		this.isPermisoEliminarAutoriRetencion = isPermisoEliminarAutoriRetencion;
	}

	public Boolean getIsPermisoGuardarCambiosAutoriRetencion() {
		return isPermisoGuardarCambiosAutoriRetencion;
	}

	public void setIsPermisoGuardarCambiosAutoriRetencion(Boolean isPermisoGuardarCambiosAutoriRetencion) {
		this.isPermisoGuardarCambiosAutoriRetencion = isPermisoGuardarCambiosAutoriRetencion;
	}
	
	public Boolean getIsPermisoConsultaAutoriRetencion() {
		return isPermisoConsultaAutoriRetencion;
	}

	public void setIsPermisoConsultaAutoriRetencion(Boolean isPermisoConsultaAutoriRetencion) {
		this.isPermisoConsultaAutoriRetencion = isPermisoConsultaAutoriRetencion;
	}

	public Boolean getIsPermisoBusquedaAutoriRetencion() {
		return isPermisoBusquedaAutoriRetencion;
	}

	public void setIsPermisoBusquedaAutoriRetencion(Boolean isPermisoBusquedaAutoriRetencion) {
		this.isPermisoBusquedaAutoriRetencion = isPermisoBusquedaAutoriRetencion;
	}

	public Boolean getIsPermisoReporteAutoriRetencion() {
		return isPermisoReporteAutoriRetencion;
	}

	public void setIsPermisoReporteAutoriRetencion(Boolean isPermisoReporteAutoriRetencion) {
		this.isPermisoReporteAutoriRetencion = isPermisoReporteAutoriRetencion;
	}
	
	public Boolean getIsPermisoPaginacionMedioAutoriRetencion() {
		return isPermisoPaginacionMedioAutoriRetencion;
	}

	public void setIsPermisoPaginacionMedioAutoriRetencion(Boolean isPermisoPaginacionMedioAutoriRetencion) {
		this.isPermisoPaginacionMedioAutoriRetencion = isPermisoPaginacionMedioAutoriRetencion;
	}
	
	public Boolean getIsPermisoPaginacionTodoAutoriRetencion() {
		return isPermisoPaginacionTodoAutoriRetencion;
	}

	public void setIsPermisoPaginacionTodoAutoriRetencion(Boolean isPermisoPaginacionTodoAutoriRetencion) {
		this.isPermisoPaginacionTodoAutoriRetencion = isPermisoPaginacionTodoAutoriRetencion;
	}
	
	public Boolean getIsPermisoPaginacionAltoAutoriRetencion() {
		return isPermisoPaginacionAltoAutoriRetencion;
	}

	public void setIsPermisoPaginacionAltoAutoriRetencion(Boolean isPermisoPaginacionAltoAutoriRetencion) {
		this.isPermisoPaginacionAltoAutoriRetencion = isPermisoPaginacionAltoAutoriRetencion;
	}
	
	public Boolean getIsPermisoCopiarAutoriRetencion() {
		return isPermisoCopiarAutoriRetencion;
	}

	public void setIsPermisoCopiarAutoriRetencion(Boolean isPermisoCopiarAutoriRetencion) {
		this.isPermisoCopiarAutoriRetencion = isPermisoCopiarAutoriRetencion;
	}
	
	public Boolean getIsPermisoVerFormAutoriRetencion() {
		return isPermisoVerFormAutoriRetencion;
	}

	public void setIsPermisoVerFormAutoriRetencion(Boolean isPermisoVerFormAutoriRetencion) {
		this.isPermisoVerFormAutoriRetencion = isPermisoVerFormAutoriRetencion;
	}
	
	public Boolean getIsPermisoDuplicarAutoriRetencion() {
		return isPermisoDuplicarAutoriRetencion;
	}

	public void setIsPermisoDuplicarAutoriRetencion(Boolean isPermisoDuplicarAutoriRetencion) {
		this.isPermisoDuplicarAutoriRetencion = isPermisoDuplicarAutoriRetencion;
	}
	
	public Boolean getIsPermisoOrdenAutoriRetencion() {
		return isPermisoOrdenAutoriRetencion;
	}

	public void setIsPermisoOrdenAutoriRetencion(Boolean isPermisoOrdenAutoriRetencion) {
		this.isPermisoOrdenAutoriRetencion = isPermisoOrdenAutoriRetencion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAutoriRetencion() {
		return isVisibilidadCeldaNuevoAutoriRetencion;
	}

	public void setIsVisibilidadCeldaNuevoAutoriRetencion(Boolean isVisibilidadCeldaNuevoAutoriRetencion) {
		this.isVisibilidadCeldaNuevoAutoriRetencion = isVisibilidadCeldaNuevoAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAutoriRetencion() {
		return isVisibilidadCeldaDuplicarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaDuplicarAutoriRetencion(Boolean isVisibilidadCeldaDuplicarAutoriRetencion) {
		this.isVisibilidadCeldaDuplicarAutoriRetencion = isVisibilidadCeldaDuplicarAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAutoriRetencion() {
		return isVisibilidadCeldaCopiarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaCopiarAutoriRetencion(Boolean isVisibilidadCeldaCopiarAutoriRetencion) {
		this.isVisibilidadCeldaCopiarAutoriRetencion = isVisibilidadCeldaCopiarAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAutoriRetencion() {
		return isVisibilidadCeldaVerFormAutoriRetencion;
	}

	public void setIsVisibilidadCeldaVerFormAutoriRetencion(Boolean isVisibilidadCeldaVerFormAutoriRetencion) {
		this.isVisibilidadCeldaVerFormAutoriRetencion = isVisibilidadCeldaVerFormAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAutoriRetencion() {
		return isVisibilidadCeldaOrdenAutoriRetencion;
	}

	public void setIsVisibilidadCeldaOrdenAutoriRetencion(Boolean isVisibilidadCeldaOrdenAutoriRetencion) {
		this.isVisibilidadCeldaOrdenAutoriRetencion = isVisibilidadCeldaOrdenAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAutoriRetencion() {
		return isVisibilidadCeldaNuevoRelacionesAutoriRetencion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAutoriRetencion(Boolean isVisibilidadCeldaNuevoRelacionesAutoriRetencion) {
		this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion = isVisibilidadCeldaNuevoRelacionesAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAutoriRetencion() {
		return isVisibilidadCeldaModificarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaModificarAutoriRetencion(Boolean isVisibilidadCeldaModificarAutoriRetencion) {
		this.isVisibilidadCeldaModificarAutoriRetencion = isVisibilidadCeldaModificarAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAutoriRetencion() {
		return isVisibilidadCeldaActualizarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaActualizarAutoriRetencion(Boolean isVisibilidadCeldaActualizarAutoriRetencion) {
		this.isVisibilidadCeldaActualizarAutoriRetencion = isVisibilidadCeldaActualizarAutoriRetencion;
	}

	public Boolean getIsVisibilidadCeldaEliminarAutoriRetencion() {
		return isVisibilidadCeldaEliminarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaEliminarAutoriRetencion(Boolean isVisibilidadCeldaEliminarAutoriRetencion) {
		this.isVisibilidadCeldaEliminarAutoriRetencion = isVisibilidadCeldaEliminarAutoriRetencion;
	}

	public Boolean getIsVisibilidadCeldaCancelarAutoriRetencion() {
		return isVisibilidadCeldaCancelarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaCancelarAutoriRetencion(Boolean isVisibilidadCeldaCancelarAutoriRetencion) {
		this.isVisibilidadCeldaCancelarAutoriRetencion = isVisibilidadCeldaCancelarAutoriRetencion;
	}

	public Boolean getIsVisibilidadCeldaGuardarAutoriRetencion() {
		return isVisibilidadCeldaGuardarAutoriRetencion;
	}

	public void setIsVisibilidadCeldaGuardarAutoriRetencion(Boolean isVisibilidadCeldaGuardarAutoriRetencion) {
		this.isVisibilidadCeldaGuardarAutoriRetencion = isVisibilidadCeldaGuardarAutoriRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAutoriRetencion() {
		return isVisibilidadCeldaGuardarCambiosAutoriRetencion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAutoriRetencion(Boolean isVisibilidadCeldaGuardarCambiosAutoriRetencion) {
		this.isVisibilidadCeldaGuardarCambiosAutoriRetencion = isVisibilidadCeldaGuardarCambiosAutoriRetencion;
	}
		
	public AutoriRetencionSessionBean getautoriretencionSessionBean() {
		return this.autoriretencionSessionBean;
	}
	
	public void setautoriretencionSessionBean(AutoriRetencionSessionBean autoriretencionSessionBean) {
		this.autoriretencionSessionBean=autoriretencionSessionBean;
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

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(AutoriRetencion autoriretencion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(autoriretencion,null);
				this.setActualParaGuardarSucursalForeignKey(autoriretencion,null);
				this.setActualParaGuardarUsuarioForeignKey(autoriretencion,null);
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
	
	public void bugActualizarReferenciaActual(AutoriRetencion autoriretencion,AutoriRetencion autoriretencionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAutoriRetencion(autoriretencion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		autoriretencionAux.setId(autoriretencion.getId());
		autoriretencionAux.setVersionRow(autoriretencion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAutoriRetencion();
		
			int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = autoriretencionValidator.getInvalidValues(this.autoriretencion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			autoriretencionLogic.setDatosCliente(datosCliente);
			autoriretencionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				autoriretencionAux=new  AutoriRetencion();
				
				autoriretencionAux.setIsNew(true);
				autoriretencionAux.setIsChanged(true);
				
				autoriretencionAux.setAutoriRetencionOriginal(this.autoriretencion);
				
				autoriretencionAux.setId(this.autoriretencion.getId());	
				autoriretencionAux.setVersionRow(this.autoriretencion.getVersionRow());	
				autoriretencionAux.setid_empresa(this.autoriretencion.getid_empresa());	
				autoriretencionAux.setid_sucursal(this.autoriretencion.getid_sucursal());	
				autoriretencionAux.setid_usuario(this.autoriretencion.getid_usuario());	
				autoriretencionAux.setnumero_serie(this.autoriretencion.getnumero_serie());	
				autoriretencionAux.setnumero_autorizacion(this.autoriretencion.getnumero_autorizacion());	
				autoriretencionAux.setnumero_inicial(this.autoriretencion.getnumero_inicial());	
				autoriretencionAux.setnumero_final(this.autoriretencion.getnumero_final());	
				autoriretencionAux.setfecha_caducidad(this.autoriretencion.getfecha_caducidad());	
				autoriretencionAux.setesta_activo(this.autoriretencion.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(autoriretencionAux,autoriretencionLogic.getAutoriRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriretencionAux,autoriretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionLogic.saveAutoriRetencions();//WithConnection
						//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.autoriretencion,autoriretencionAux);
					
					this.refrescarForeignKeysDescripcionesAutoriRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autoriretencionLogic.saveAutoriRetencionRelaciones(autoriretencionAux);//WithConnection
								//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.autoriretencion,autoriretencionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(autoriretencionAux,autoriretencionLogic.getAutoriRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(autoriretencionAux,autoriretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.autoriretencion,autoriretencionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				autoriretencionAux=new  AutoriRetencion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.autoriretencionSessionBean.getEsGuardarRelacionado() 
					|| (this.autoriretencionSessionBean.getEsGuardarRelacionado() && this.autoriretencion.getId()>=0)) {
						
					autoriretencionAux.setIsNew(false);
				}
				
				autoriretencionAux.setIsDeleted(false);
			
				autoriretencionAux.setId(this.autoriretencion.getId());	
				autoriretencionAux.setVersionRow(this.autoriretencion.getVersionRow());	
				autoriretencionAux.setid_empresa(this.autoriretencion.getid_empresa());	
				autoriretencionAux.setid_sucursal(this.autoriretencion.getid_sucursal());	
				autoriretencionAux.setid_usuario(this.autoriretencion.getid_usuario());	
				autoriretencionAux.setnumero_serie(this.autoriretencion.getnumero_serie());	
				autoriretencionAux.setnumero_autorizacion(this.autoriretencion.getnumero_autorizacion());	
				autoriretencionAux.setnumero_inicial(this.autoriretencion.getnumero_inicial());	
				autoriretencionAux.setnumero_final(this.autoriretencion.getnumero_final());	
				autoriretencionAux.setfecha_caducidad(this.autoriretencion.getfecha_caducidad());	
				autoriretencionAux.setesta_activo(this.autoriretencion.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autoriretencionAux,autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriretencionAux,autoriretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionLogic.saveAutoriRetencions();//WithConnection
						//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.autoriretencion,autoriretencionAux);
					
					this.refrescarForeignKeysDescripcionesAutoriRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autoriretencionLogic.saveAutoriRetencionRelaciones(autoriretencionAux);//WithConnection
								//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.autoriretencion,autoriretencionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(autoriretencionAux,autoriretencionLogic.getAutoriRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(autoriretencionAux,autoriretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.autoriretencion,autoriretencionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				autoriretencionAux=new  AutoriRetencion();
				
				autoriretencionAux.setIsNew(false);
				autoriretencionAux.setIsChanged(false);
				
				autoriretencionAux.setIsDeleted(true);
				
				autoriretencionAux.setId(this.autoriretencion.getId());	
				autoriretencionAux.setVersionRow(this.autoriretencion.getVersionRow());	
				autoriretencionAux.setid_empresa(this.autoriretencion.getid_empresa());	
				autoriretencionAux.setid_sucursal(this.autoriretencion.getid_sucursal());	
				autoriretencionAux.setid_usuario(this.autoriretencion.getid_usuario());	
				autoriretencionAux.setnumero_serie(this.autoriretencion.getnumero_serie());	
				autoriretencionAux.setnumero_autorizacion(this.autoriretencion.getnumero_autorizacion());	
				autoriretencionAux.setnumero_inicial(this.autoriretencion.getnumero_inicial());	
				autoriretencionAux.setnumero_final(this.autoriretencion.getnumero_final());	
				autoriretencionAux.setfecha_caducidad(this.autoriretencion.getfecha_caducidad());	
				autoriretencionAux.setesta_activo(this.autoriretencion.getesta_activo());	
				
				if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.autoriretencionAux.getId()>=0) {	
						this.autoriretencionsEliminados.add(autoriretencionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(autoriretencionAux,autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriretencionAux,autoriretencions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionLogic.saveAutoriRetencions();//WithConnection
						//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								autoriretencionLogic.saveAutoriRetencionRelaciones(autoriretencionAux);//WithConnection
								//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
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
							if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(autoriretencionAux,autoriretencionLogic.getAutoriRetencions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(autoriretencionAux,autoriretencions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getAutoriRetencions().addAll(this.autoriretencionsEliminados);
					
					autoriretencionLogic.saveAutoriRetencions();//WithConnection
					//autoriretencionLogic.getSetVersionRowAutoriRetencions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAutoriRetencion();
				
				this.autoriretencionsEliminados= new ArrayList<AutoriRetencion>();		
			}
			
			if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Autori Retencion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.autoriretencion=autoriretencionAux;
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
      		//this.finishProcessAutoriRetencion();
      	}
		
	}	
	
	public void actualizarRelaciones(AutoriRetencion autoriretencionLocal) throws Exception {
		
		if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AutoriRetencion autoriretencionLocal) throws Exception {	
		if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				autoriretencionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				autoriretencionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				autoriretencionLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAutoriRetencionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = autoriretencionValidator.getInvalidValues(this.autoriretencion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AutoriRetencion autoriretencion,List<AutoriRetencion> autoriretencions) throws Exception {
		try	{		
			AutoriRetencionConstantesFunciones.actualizarLista(autoriretencion,autoriretencions,this.autoriretencionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AutoriRetencion autoriretencion,List<AutoriRetencion> autoriretencions) throws Exception {
		try	{			
			AutoriRetencionConstantesFunciones.actualizarSelectedLista(autoriretencion,autoriretencions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AutoriRetencion> autoriretencionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				autoriretencionsLocal=this.autoriretencionLogic.getAutoriRetencions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				autoriretencionsLocal=this.autoriretencions;
			}
			//ARCHITECTURE
		
			for(AutoriRetencion autoriretencionLocal:autoriretencionsLocal) {
				if(this.permiteMantenimiento(autoriretencionLocal) && autoriretencionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AutoriRetencionConstantesFunciones.getAutoriRetencionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelid_empresaAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelid_sucursalAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelid_usuarioAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.NUMEROSERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_serieAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.NUMEROAUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_autorizacionAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.NUMEROINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_inicialAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.NUMEROFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_finalAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.FECHACADUCIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelfecha_caducidadAutoriRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutoriRetencionConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelesta_activoAutoriRetencion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelid_empresaAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelid_sucursalAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelid_usuarioAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_serieAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_autorizacionAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_inicialAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_finalAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelfecha_caducidadAutoriRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutoriRetencion.jLabelesta_activoAutoriRetencion,"");
		
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
		this.iIdNuevoAutoriRetencion--;	
		
		
		this.autoriretencionAux=new AutoriRetencion();
		
		this.autoriretencionAux.setId(this.iIdNuevoAutoriRetencion);
		this.autoriretencionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autoriretencionLogic.getAutoriRetencions().add(this.autoriretencionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.autoriretencions.add(this.autoriretencionAux);
		}
		//ARCHITECTURE
		
		this.autoriretencion=this.autoriretencionAux;
		
		if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAutoriRetencion(this.autoriretencion);
			this.setVariablesObjetoActualToFormularioForeignKeyAutoriRetencion(this.autoriretencion);
		}
				
		//this.setDefaultControlesAutoriRetencion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAutoriRetencion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAutoriRetencion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriRetencion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutoriRetencion(this.autoriretencionBean,this.autoriretencion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AutoriRetencionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
			classes=AutoriRetencionConstantesFunciones.getClassesRelationshipsOfAutoriRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.autoriretencionReturnGeneral=autoriretencionLogic.procesarEventosAutoriRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autoriretencionLogic.getAutoriRetencions(),this.autoriretencion,this.autoriretencionParameterGeneral,this.isEsNuevoAutoriRetencion,classes);//this.autoriretencionLogic.getAutoriRetencion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAutoriRetencion(this.autoriretencionReturnGeneral,this.autoriretencionBean,false);
		
		if(this.autoriretencionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion());
		}
		
		if(this.autoriretencionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion(),classes);//this.autoriretencionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAutoriRetencion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAutoriRetencion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.RecargarFormAutoriRetencion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAutoriRetencion(false);
						
			if(autoriretencionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriRetencion();
			}
			
			this.actualizarVisualTableDatosAutoriRetencion();
			
			this.jTableDatosAutoriRetencion.setRowSelectionInterval(this.getIndiceNuevoAutoriRetencion(), this.getIndiceNuevoAutoriRetencion());
			
			this.seleccionarFilaTablaAutoriRetencionActual();
						
			this.actualizarEstadoCeldasBotonesAutoriRetencion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAutoriRetencion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarnumero_serieAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarnumero_autorizacionAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarnumero_inicialAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarnumero_finalAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarfecha_caducidadAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activaresta_activoAutoriRetencion);	
		//
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarid_empresaAutoriRetencion);//
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarid_sucursalAutoriRetencion);//
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setEnabled(isHabilitar && this.autoriretencionConstantesFunciones.activarid_usuarioAutoriRetencion);
	};
	
	public void setDefaultControlesAutoriRetencion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAutoriRetencion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.autoriretencionSessionBean.setConGuardarRelaciones(true);			
			this.autoriretencionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.setVisible(true);
			
					
		} else {
			//this.autoriretencionSessionBean.setConGuardarRelaciones(false);			
			this.autoriretencionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAutoriRetencion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
				if(autoriretencionAux.getId().equals(this.iIdNuevoAutoriRetencion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriRetencion autoriretencionAux:this.autoriretencions) {
				if(autoriretencionAux.getId().equals(this.iIdNuevoAutoriRetencion)) {
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
	
	public int getIndiceActualAutoriRetencion(AutoriRetencion autoriretencion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
				if(autoriretencionAux.getId().equals(autoriretencion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriRetencion autoriretencionAux:this.autoriretencions) {
				if(autoriretencionAux.getId().equals(autoriretencion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAutoriRetencion(AutoriRetencion autoriretencionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
				if(autoriretencionAux.getAutoriRetencionOriginal().getId().equals(autoriretencionOriginal.getId())) {
					existe=true;
					autoriretencionOriginal.setId(autoriretencionAux.getId());
					autoriretencionOriginal.setVersionRow(autoriretencionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriRetencion autoriretencionAux:this.autoriretencions) {
				if(autoriretencionAux.getAutoriRetencionOriginal().getId().equals(autoriretencionOriginal.getId())) {
					existe=true;
					autoriretencionOriginal.setId(autoriretencionAux.getId());
					autoriretencionOriginal.setVersionRow(autoriretencionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAutoriRetencion(Boolean esParaCancelar) throws Exception {
		autoriretencionsAux=new ArrayList<AutoriRetencion>();
		autoriretencionAux=new AutoriRetencion();
		
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
					if(autoriretencionAux.getId()<0) {
						autoriretencionsAux.add(autoriretencionAux);
					}		
				}
				this.iIdNuevoAutoriRetencion=0L;
				this.autoriretencionLogic.getAutoriRetencions().removeAll(autoriretencionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriRetencion autoriretencionAux:this.autoriretencions) {
					if(autoriretencionAux.getId()<0) {
						autoriretencionsAux.add(autoriretencionAux);
					}		
				}
				this.iIdNuevoAutoriRetencion=0L;
				this.autoriretencions.removeAll(autoriretencionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAutoriRetencion 
					&& this.autoriretencionLogic.getAutoriRetencions().size()>0
					) {
					autoriretencionAux=this.autoriretencionLogic.getAutoriRetencions().get(this.autoriretencionLogic.getAutoriRetencions().size() - 1);
				
					if(autoriretencionAux.getId()<0) {
						this.autoriretencionLogic.getAutoriRetencions().remove(autoriretencionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAutoriRetencion && this.autoriretencions.size()>0) {
					autoriretencionAux=this.autoriretencions.get(this.autoriretencions.size() - 1);
				
					if(autoriretencionAux.getId()<0) {
						this.autoriretencions.remove(autoriretencionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAutoriRetencion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(autoriretencion.getId()<0) {
				this.autoriretencionLogic.getAutoriRetencions().remove(this.autoriretencion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(autoriretencion.getId()<0) {
				this.autoriretencions.remove(this.autoriretencion);
			}
		}			
	}
	
	public void setEstadosInicialesAutoriRetencion(List<AutoriRetencion> autoriretencionsAux) throws Exception {
		AutoriRetencionConstantesFunciones.setEstadosInicialesAutoriRetencion(autoriretencionsAux);
	}
	
	public void setEstadosInicialesAutoriRetencion(AutoriRetencion autoriretencionAux) throws Exception {
		AutoriRetencionConstantesFunciones.setEstadosInicialesAutoriRetencion(autoriretencionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAutoriRetencionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAutoriRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAutoriRetencionActual()) {
				if(!this.isEsNuevoAutoriRetencion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAutoriRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAutoriRetencion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAutoriRetencionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Autori Retencion ?", "MANTENIMIENTO DE Autori Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAutoriRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AutoriRetencion autoriretencion) throws Exception {
		AutoriRetencionConstantesFunciones.seleccionarAsignar(this.autoriretencion,autoriretencion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAutoriRetencion=this.isPermisoActualizarOriginalAutoriRetencion;
			
			
			this.seleccionarAsignar(autoriretencion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutoriRetencionConstantesFunciones.quitarEspaciosAutoriRetencion(this.autoriretencion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAutoriRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.autoriretencionSessionBean.setsFuncionBusquedaRapida(this.autoriretencionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAutoriRetencion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAutoriRetencion(esParaCancelar);				
				this.cancelarNuevoAutoriRetencion(esParaCancelar);								
			}
			
			this.autoriretencion=new AutoriRetencion();
			
			this.inicializarAutoriRetencion();
			
			this.actualizarEstadoCeldasBotonesAutoriRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAutoriRetencion() throws Exception {
		try {
			AutoriRetencionConstantesFunciones.inicializarAutoriRetencion(this.autoriretencion);
			
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
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.autoriretencionLogic.getAutoriRetencions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAutoriRetencions(String sAccionBusqueda,List<AutoriRetencion> autoriretencionsParaReportes) throws Exception {
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
					sPathReporteFinal="AutoriRetencion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AutoriRetencionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AutoriRetencionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AutoriRetencion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Autori Retenciones");		
		parameters.put("busquedapor", AutoriRetencionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAutoriRetencion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AutoriRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AutoriRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAutoriRetencion=new JRBeanArrayDataSource(AutoriRetencionJInternalFrame.TraerAutoriRetencionBeans(autoriretencionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAutoriRetencion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AutoriRetencionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AutoriRetencionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AutoriRetencionBean.TraerAutoriRetencionBeans(autoriretencionsParaReportes).toArray()));
							
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
				this.generarExcelReporteAutoriRetencions(sAccionBusqueda,sTipoArchivoReporte,autoriretencionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAutoriRetencions(sAccionBusqueda,sTipoArchivoReporte,autoriretencionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAutoriRetencionActionPerformed(null);
					//this.generarExcelReporteAutoriRetencions(sAccionBusqueda,sTipoArchivoReporte,autoriretencionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAutoriRetencions(sAccionBusqueda,sTipoArchivoReporte,autoriretencionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAutoriRetencions(sAccionBusqueda,sTipoArchivoReporte,autoriretencionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAutoriRetencions(sAccionBusqueda,sTipoArchivoReporte,autoriretencionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAutoriRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriRetencion> autoriretencionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriRetencions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutoriRetencion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AutoriRetencion autoriretencion : autoriretencionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AutoriRetencionConstantesFunciones.generarExcelReporteDataAutoriRetencion("NORMAL",row,workbook,autoriretencion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAutoriRetencion(String sTipo,Row row,Workbook workbook) {
		
		AutoriRetencionConstantesFunciones.generarExcelReporteHeaderAutoriRetencion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAutoriRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriRetencion> autoriretencionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AutoriRetencion autoriretencion : autoriretencionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AutoriRetencionConstantesFunciones.getAutoriRetencionDescripcion(autoriretencion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getnumero_serie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getnumero_autorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getnumero_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getnumero_final());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autoriretencion.getfecha_caducidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(autoriretencion.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAutoriRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<AutoriRetencion> autoriretencionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AutoriRetencion> autoriretencionsRespaldo=null;
		
		classes=AutoriRetencionConstantesFunciones.getClassesRelationshipsOfAutoriRetencion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.autoriretencionLogic.setDatosCliente(this.datosCliente);
		this.autoriretencionLogic.setDatosDeep(this.datosDeep);
		this.autoriretencionLogic.setIsConDeep(true);
		
		autoriretencionsRespaldo=this.autoriretencionLogic.getAutoriRetencions();
		
		this.autoriretencionLogic.setAutoriRetencions(autoriretencionsParaReportes);	
		this.autoriretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		autoriretencionsParaReportes=this.autoriretencionLogic.getAutoriRetencions();
		this.autoriretencionLogic.setAutoriRetencions(autoriretencionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutoriRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutoriRetencion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AutoriRetencion autoriretencion : autoriretencionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAutoriRetencion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AutoriRetencionConstantesFunciones.generarExcelReporteDataAutoriRetencion("NORMAL",row,workbook,autoriretencion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AutoriRetencionConstantesFunciones.getAutoriRetencionDescripcion(autoriretencion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriRetencion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAutoriRetencion() throws Exception {		
		this.startProcessAutoriRetencion(true);
	}
	
	public void startProcessAutoriRetencion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAutoriRetencion ,this.jPanelParametrosReportesAutoriRetencion, this.jScrollPanelDatosAutoriRetencion,this.jPanelPaginacionAutoriRetencion, this.jScrollPanelDatosEdicionAutoriRetencion, this.jPanelAccionesAutoriRetencion,this.jPanelAccionesFormularioAutoriRetencion,this.jmenuBarAutoriRetencion,this.jmenuBarDetalleAutoriRetencion,this.jTtoolBarAutoriRetencion,this.jTtoolBarDetalleAutoriRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasAutoriRetencion=this.jTabbedPaneBusquedasAutoriRetencion; 
		
		final JPanel jPanelParametrosReportesAutoriRetencion=this.jPanelParametrosReportesAutoriRetencion;
		//final JScrollPane jScrollPanelDatosAutoriRetencion=this.jScrollPanelDatosAutoriRetencion;
		final JTable jTableDatosAutoriRetencion=this.jTableDatosAutoriRetencion;		
		final JPanel jPanelPaginacionAutoriRetencion=this.jPanelPaginacionAutoriRetencion;
		//final JScrollPane jScrollPanelDatosEdicionAutoriRetencion=this.jScrollPanelDatosEdicionAutoriRetencion;
		final JPanel jPanelAccionesAutoriRetencion=this.jPanelAccionesAutoriRetencion;
		
		JPanel jPanelCamposAuxiliarAutoriRetencion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAutoriRetencion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			jPanelCamposAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jPanelCamposAutoriRetencion;
			jPanelAccionesFormularioAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jPanelAccionesFormularioAutoriRetencion;
		}
		
		final JPanel jPanelCamposAutoriRetencion=jPanelCamposAuxiliarAutoriRetencion;
		final JPanel jPanelAccionesFormularioAutoriRetencion=jPanelAccionesFormularioAuxiliarAutoriRetencion;
		
		
		final JMenuBar jmenuBarAutoriRetencion=this.jmenuBarAutoriRetencion;
		final JToolBar jTtoolBarAutoriRetencion=this.jTtoolBarAutoriRetencion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAutoriRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutoriRetencion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			jmenuBarDetalleAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jmenuBarDetalleAutoriRetencion;
			jTtoolBarDetalleAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jTtoolBarDetalleAutoriRetencion;
		}
		
		final JMenuBar jmenuBarDetalleAutoriRetencion=jmenuBarDetalleAuxiliarAutoriRetencion;
		final JToolBar jTtoolBarDetalleAutoriRetencion=jTtoolBarDetalleAuxiliarAutoriRetencion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutoriRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutoriRetencion;
			processRunnable.jTableDatos=jTableDatosAutoriRetencion;
			processRunnable.jPanelCampos=jPanelCamposAutoriRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutoriRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesAutoriRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutoriRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarAutoriRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutoriRetencion;
			processRunnable.jTtoolBar=jTtoolBarAutoriRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutoriRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutoriRetencion ,jPanelParametrosReportesAutoriRetencion,jTableDatosAutoriRetencion, /*jScrollPanelDatosAutoriRetencion,*/jPanelCamposAutoriRetencion,jPanelPaginacionAutoriRetencion, /*jScrollPanelDatosEdicionAutoriRetencion,*/ jPanelAccionesAutoriRetencion,jPanelAccionesFormularioAutoriRetencion,jmenuBarAutoriRetencion,jmenuBarDetalleAutoriRetencion,jTtoolBarAutoriRetencion,jTtoolBarDetalleAutoriRetencion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutoriRetencion ,jPanelParametrosReportesAutoriRetencion, jScrollPanelDatosAutoriRetencion,jPanelPaginacionAutoriRetencion, jScrollPanelDatosEdicionAutoriRetencion, jPanelAccionesAutoriRetencion,jPanelAccionesFormularioAutoriRetencion,jmenuBarAutoriRetencion,jmenuBarDetalleAutoriRetencion,jTtoolBarAutoriRetencion,jTtoolBarDetalleAutoriRetencion);
						
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
	
	public void finishProcessAutoriRetencion() {// throws Exception 
		this.finishProcessAutoriRetencion(true);
	}
	
	public void finishProcessAutoriRetencion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAutoriRetencion ,this.jPanelParametrosReportesAutoriRetencion, this.jScrollPanelDatosAutoriRetencion,this.jPanelPaginacionAutoriRetencion, this.jScrollPanelDatosEdicionAutoriRetencion, this.jPanelAccionesAutoriRetencion,this.jPanelAccionesFormularioAutoriRetencion,this.jmenuBarAutoriRetencion,this.jmenuBarDetalleAutoriRetencion,this.jTtoolBarAutoriRetencion,this.jTtoolBarDetalleAutoriRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasAutoriRetencion=this.jTabbedPaneBusquedasAutoriRetencion; 
		
		final JPanel jPanelParametrosReportesAutoriRetencion=this.jPanelParametrosReportesAutoriRetencion;
		//final JScrollPane jScrollPanelDatosAutoriRetencion=this.jScrollPanelDatosAutoriRetencion;
		final JTable jTableDatosAutoriRetencion=this.jTableDatosAutoriRetencion;		
		final JPanel jPanelPaginacionAutoriRetencion=this.jPanelPaginacionAutoriRetencion;
		//final JScrollPane jScrollPanelDatosEdicionAutoriRetencion=this.jScrollPanelDatosEdicionAutoriRetencion;
		final JPanel jPanelAccionesAutoriRetencion=this.jPanelAccionesAutoriRetencion;
		
		JPanel jPanelCamposAuxiliarAutoriRetencion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAutoriRetencion=new JPanel();
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			jPanelCamposAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jPanelCamposAutoriRetencion;
			jPanelAccionesFormularioAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jPanelAccionesFormularioAutoriRetencion;
		}
		
		final JPanel jPanelCamposAutoriRetencion=jPanelCamposAuxiliarAutoriRetencion;
		final JPanel jPanelAccionesFormularioAutoriRetencion=jPanelAccionesFormularioAuxiliarAutoriRetencion;
		
		
		final JMenuBar jmenuBarAutoriRetencion=this.jmenuBarAutoriRetencion;		
		final JToolBar jTtoolBarAutoriRetencion=this.jTtoolBarAutoriRetencion;
				
		JMenuBar jmenuBarDetalleAuxiliarAutoriRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutoriRetencion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			jmenuBarDetalleAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jmenuBarDetalleAutoriRetencion;
			jTtoolBarDetalleAuxiliarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jTtoolBarDetalleAutoriRetencion;		
		}
		
		final JMenuBar jmenuBarDetalleAutoriRetencion=jmenuBarDetalleAuxiliarAutoriRetencion;
		final JToolBar jTtoolBarDetalleAutoriRetencion=jTtoolBarDetalleAuxiliarAutoriRetencion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutoriRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutoriRetencion;
			processRunnable.jTableDatos=jTableDatosAutoriRetencion;
			processRunnable.jPanelCampos=jPanelCamposAutoriRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutoriRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesAutoriRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutoriRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarAutoriRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutoriRetencion;
			processRunnable.jTtoolBar=jTtoolBarAutoriRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutoriRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAutoriRetencion ,jPanelParametrosReportesAutoriRetencion, jTableDatosAutoriRetencion,/*jScrollPanelDatosAutoriRetencion,*/jPanelCamposAutoriRetencion,jPanelPaginacionAutoriRetencion, /*jScrollPanelDatosEdicionAutoriRetencion,*/ jPanelAccionesAutoriRetencion,jPanelAccionesFormularioAutoriRetencion,jmenuBarAutoriRetencion,jmenuBarDetalleAutoriRetencion,jTtoolBarAutoriRetencion,jTtoolBarDetalleAutoriRetencion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAutoriRetencion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAutoriRetencion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAutoriRetencion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAutoriRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAutoriRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAutoriRetencion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAutoriRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAutoriRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAutoriRetencion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.autoriretencionConstantesFunciones.getsFinalQueryAutoriRetencion();
		String  finalQueryPaginacionTodos=this.autoriretencionConstantesFunciones.getsFinalQueryAutoriRetencion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AutoriRetencionConstantesFunciones.getArrayColumnasGlobalesNoAutoriRetencion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AutoriRetencionConstantesFunciones.getArrayColumnasGlobalesAutoriRetencion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AutoriRetencionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.autoriretencionsEliminados= new ArrayList<AutoriRetencion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAutoriRetencion();
		
				///*AutoriRetencionSessionBean*/this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
			
			if(this.autoriretencionSessionBean==null) {
				this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
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
					this.iNumeroPaginacion=AutoriRetencionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AutoriRetencionConstantesFunciones.getClassesForeignKeysOfAutoriRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/autoriretencion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			autoriretencionsAux= new ArrayList<AutoriRetencion>();
			
				
			autoriretencionLogic.setDatosCliente(this.datosCliente);
			autoriretencionLogic.setDatosDeep(this.datosDeep);
			autoriretencionLogic.setIsConDeep(true);
			
			
			autoriretencionLogic.getAutoriRetencionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					autoriretencionLogic.getTodosAutoriRetencions(finalQueryGlobal,pagination);
					
					//autoriretencionLogic.getTodosAutoriRetencionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(autoriretencionLogic.getAutoriRetencions()==null|| autoriretencionLogic.getAutoriRetencions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autoriretencionsAux= new ArrayList<AutoriRetencion>();
							autoriretencionsAux.addAll(autoriretencionLogic.getAutoriRetencions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencionsAux= new ArrayList<AutoriRetencion>();
							autoriretencionsAux.addAll(autoriretencions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autoriretencionLogic.getTodosAutoriRetencions(finalQueryGlobal+"",this.pagination);												
							
							//autoriretencionLogic.getTodosAutoriRetencionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAutoriRetencions("Todos",autoriretencionLogic.getAutoriRetencions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							autoriretencionLogic.setAutoriRetencions(new ArrayList<AutoriRetencion>());					
							autoriretencionLogic.getAutoriRetencions().addAll(autoriretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencions=new ArrayList<AutoriRetencion>();
							autoriretencions.addAll(autoriretencionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAutoriRetencion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAutoriRetencion=this.idActual;
				
				} else if(this.idAutoriRetencionActual!=null && this.idAutoriRetencionActual!=0L) {
					idAutoriRetencion=idAutoriRetencionActual;
				}
				
					
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndicePorId(idAutoriRetencion);
				
				this.autoriretencions=new ArrayList<AutoriRetencion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					autoriretencionLogic.getEntity(idAutoriRetencion);
					
					//autoriretencionLogic.getEntityWithConnection(idAutoriRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriretencionLogic.setAutoriRetencions(new ArrayList<AutoriRetencion>());
					autoriretencionLogic.getAutoriRetencions().add(autoriretencionLogic.getAutoriRetencion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriretencions=new ArrayList<AutoriRetencion>();
					this.autoriretencions.add(autoriretencion);
				}
				
				if(autoriretencionLogic.getAutoriRetencion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriretencionLogic.getAutoriRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriretencionLogic.getAutoriRetencions()==null||autoriretencionLogic.getAutoriRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriretencions==null|| autoriretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionsAux=new ArrayList<AutoriRetencion>();
						autoriretencionsAux.addAll(autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencionsAux=new ArrayList<AutoriRetencion>();
							autoriretencionsAux.addAll(autoriretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriretencionLogic.getAutoriRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriRetencions("FK_IdEmpresa",autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriRetencions("FK_IdEmpresa",autoriretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionLogic.setAutoriRetencions(new ArrayList<AutoriRetencion>());
						autoriretencionLogic.getAutoriRetencions().addAll(autoriretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencions=new ArrayList<AutoriRetencion>();
							autoriretencions.addAll(autoriretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriretencionLogic.getAutoriRetencionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriretencionLogic.getAutoriRetencions()==null||autoriretencionLogic.getAutoriRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriretencions==null|| autoriretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionsAux=new ArrayList<AutoriRetencion>();
						autoriretencionsAux.addAll(autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencionsAux=new ArrayList<AutoriRetencion>();
							autoriretencionsAux.addAll(autoriretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriretencionLogic.getAutoriRetencionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriRetencions("FK_IdSucursal",autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriRetencions("FK_IdSucursal",autoriretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionLogic.setAutoriRetencions(new ArrayList<AutoriRetencion>());
						autoriretencionLogic.getAutoriRetencions().addAll(autoriretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencions=new ArrayList<AutoriRetencion>();
							autoriretencions.addAll(autoriretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autoriretencionLogic.getAutoriRetencionsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autoriretencionLogic.getAutoriRetencions()==null||autoriretencionLogic.getAutoriRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autoriretencions==null|| autoriretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionsAux=new ArrayList<AutoriRetencion>();
						autoriretencionsAux.addAll(autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencionsAux=new ArrayList<AutoriRetencion>();
							autoriretencionsAux.addAll(autoriretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autoriretencionLogic.getAutoriRetencionsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutoriRetencionConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutoriRetencions("FK_IdUsuario",autoriretencionLogic.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutoriRetencions("FK_IdUsuario",autoriretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionLogic.setAutoriRetencions(new ArrayList<AutoriRetencion>());
						autoriretencionLogic.getAutoriRetencions().addAll(autoriretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencions=new ArrayList<AutoriRetencion>();
							autoriretencions.addAll(autoriretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAutoriRetencion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAutoriRetencion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autoriretencionLogic.getAutoriRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoriretencions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autoriretencionLogic.getAutoriRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autoriretencions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AutoriRetencion autoriretencion) {
		Boolean permite=true;
		
		if(this.autoriretencion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AutoriRetencionConstantesFunciones.getOrderByListaAutoriRetencion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AutoriRetencionConstantesFunciones.getOrderByListaAutoriRetencion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriRetencion autoriretencion:autoriretencionLogic.getAutoriRetencions()) {
				if(autoriretencion.getsType().equals(Constantes2.S_TOTALES)) {
					autoriretencionTotales=autoriretencion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriRetencion autoriretencion:this.autoriretencions) {
				if(autoriretencion.getsType().equals(Constantes2.S_TOTALES)) {
					autoriretencionTotales=autoriretencion;
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
			this.autoriretencionAux=new AutoriRetencion();
			this.autoriretencionAux.setsType(Constantes2.S_TOTALES);
			this.autoriretencionAux.setIsNew(false);
			this.autoriretencionAux.setIsChanged(false);
			this.autoriretencionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AutoriRetencionConstantesFunciones.TotalizarValoresFilaAutoriRetencion(this.autoriretencionLogic.getAutoriRetencions(),this.autoriretencionAux);
				
				this.autoriretencionLogic.getAutoriRetencions().add(this.autoriretencionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AutoriRetencionConstantesFunciones.TotalizarValoresFilaAutoriRetencion(this.autoriretencions,this.autoriretencionAux);
				
				this.autoriretencions.add(this.autoriretencionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		autoriretencionTotales=new AutoriRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autoriretencionLogic.getAutoriRetencions().remove(autoriretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autoriretencions.remove(autoriretencionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		autoriretencionTotales=new AutoriRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutoriRetencion autoriretencion:autoriretencionLogic.getAutoriRetencions()) {
				if(autoriretencion.getsType().equals(Constantes2.S_TOTALES)) {
					autoriretencionTotales=autoriretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutoriRetencionConstantesFunciones.TotalizarValoresFilaAutoriRetencion(this.autoriretencionLogic.getAutoriRetencions(),autoriretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutoriRetencion autoriretencion:this.autoriretencions) {
				if(autoriretencion.getsType().equals(Constantes2.S_TOTALES)) {
					autoriretencionTotales=autoriretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutoriRetencionConstantesFunciones.TotalizarValoresFilaAutoriRetencion(this.autoriretencions,autoriretencionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAutoriRetencionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriRetencionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutoriRetencionsFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAutoriRetencionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriretencionLogic.getAutoriRetencionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriRetencionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriretencionLogic.getAutoriRetencionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutoriRetencionsFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriretencionLogic.getAutoriRetencionsFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosAutoriRetencion() {
		this.isPermisoTodoAutoriRetencion=false;
		this.isPermisoNuevoAutoriRetencion=false;
		this.isPermisoActualizarAutoriRetencion=false;
		this.isPermisoActualizarOriginalAutoriRetencion=false;
		this.isPermisoEliminarAutoriRetencion=false;
		this.isPermisoGuardarCambiosAutoriRetencion=false;
		this.isPermisoConsultaAutoriRetencion=false;
		this.isPermisoBusquedaAutoriRetencion=false;
		this.isPermisoReporteAutoriRetencion=false;		
		this.isPermisoOrdenAutoriRetencion=false;		
		this.isPermisoPaginacionMedioAutoriRetencion=false;		
		this.isPermisoPaginacionAltoAutoriRetencion=false;
		this.isPermisoPaginacionTodoAutoriRetencion=false;
		this.isPermisoCopiarAutoriRetencion=false;		
		this.isPermisoVerFormAutoriRetencion=false;		
		this.isPermisoDuplicarAutoriRetencion=false;		
		this.isPermisoOrdenAutoriRetencion=false;		
	}
	
	public void setPermisosUsuarioAutoriRetencion(Boolean isPermiso) {
		this.isPermisoTodoAutoriRetencion=isPermiso;
		this.isPermisoNuevoAutoriRetencion=isPermiso;
		this.isPermisoActualizarAutoriRetencion=isPermiso;
		this.isPermisoActualizarOriginalAutoriRetencion=isPermiso;
		this.isPermisoEliminarAutoriRetencion=isPermiso;
		this.isPermisoGuardarCambiosAutoriRetencion=isPermiso;
		this.isPermisoConsultaAutoriRetencion=isPermiso;
		this.isPermisoBusquedaAutoriRetencion=isPermiso;
		this.isPermisoReporteAutoriRetencion=isPermiso;
		this.isPermisoOrdenAutoriRetencion=isPermiso;		
		this.isPermisoPaginacionMedioAutoriRetencion=isPermiso;		
		this.isPermisoPaginacionAltoAutoriRetencion=isPermiso;		
		this.isPermisoPaginacionTodoAutoriRetencion=isPermiso;		
		this.isPermisoCopiarAutoriRetencion=isPermiso;		
		this.isPermisoVerFormAutoriRetencion=isPermiso;		
		this.isPermisoDuplicarAutoriRetencion=isPermiso;
		this.isPermisoOrdenAutoriRetencion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAutoriRetencion(Boolean isPermiso) {
		//this.isPermisoTodoAutoriRetencion=isPermiso;
		this.isPermisoNuevoAutoriRetencion=isPermiso;
		this.isPermisoActualizarAutoriRetencion=isPermiso;
		this.isPermisoActualizarOriginalAutoriRetencion=isPermiso;
		this.isPermisoEliminarAutoriRetencion=isPermiso;
		this.isPermisoGuardarCambiosAutoriRetencion=isPermiso;
		//this.isPermisoConsultaAutoriRetencion=isPermiso;
		//this.isPermisoBusquedaAutoriRetencion=isPermiso;
		//this.isPermisoReporteAutoriRetencion=isPermiso;
		//this.isPermisoOrdenAutoriRetencion=isPermiso;		
		//this.isPermisoPaginacionMedioAutoriRetencion=isPermiso;		
		//this.isPermisoPaginacionAltoAutoriRetencion=isPermiso;		
		//this.isPermisoPaginacionTodoAutoriRetencion=isPermiso;		
		//this.isPermisoCopiarAutoriRetencion=isPermiso;		
		//this.isPermisoDuplicarAutoriRetencion=isPermiso;
		//this.isPermisoOrdenAutoriRetencion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAutoriRetencionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AutoriRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAutoriRetencion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAutoriRetencionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAutoriRetencionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAutoriRetencionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAutoriRetencionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAutoriRetencion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AutoriRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AutoriRetencionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAutoriRetencion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAutoriRetencion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAutoriRetencion=this.isPermisoActualizarAutoriRetencion;
			this.isPermisoEliminarAutoriRetencion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAutoriRetencion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAutoriRetencion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAutoriRetencion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAutoriRetencion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAutoriRetencion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutoriRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAutoriRetencion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAutoriRetencion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAutoriRetencion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAutoriRetencion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAutoriRetencion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAutoriRetencion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutoriRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAutoriRetencion.setToolTipText(this.jTableDatosAutoriRetencion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAutoriRetencion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAutoriRetencion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AutoriRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AutoriRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAutoriRetencion() throws Exception {
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
	public void inicializarCombosForeignKeyAutoriRetencionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAutoriRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AutoriRetencionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAutoriRetencionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAutoriRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AutoriRetencionParameterReturnGeneral autoriretencionReturnGeneral=new AutoriRetencionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.autoriretencionConstantesFunciones.cargarid_empresaAutoriRetencion)
					 || (this.esRecargarFks && this.autoriretencionConstantesFunciones.cargarid_empresaAutoriRetencion)) {

					if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+autoriretencionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.autoriretencionConstantesFunciones.cargarid_sucursalAutoriRetencion)
					 || (this.esRecargarFks && this.autoriretencionConstantesFunciones.cargarid_sucursalAutoriRetencion)) {

					if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+autoriretencionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.autoriretencionConstantesFunciones.cargarid_usuarioAutoriRetencion)
					 || (this.esRecargarFks && this.autoriretencionConstantesFunciones.cargarid_usuarioAutoriRetencion)) {

					if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+autoriretencionSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				autoriretencionReturnGeneral=autoriretencionLogic.cargarCombosLoteForeignKeyAutoriRetencion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=autoriretencionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=autoriretencionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=autoriretencionReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAutoriRetencion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.autoriretencionSessionBean==null) {
				this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
			}

			if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.autoriretencionSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAutoriRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAutoriRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAutoriRetencion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.autoriretencion.setfecha_caducidad(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriRetencion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAutoriRetencion(AutoriRetencion autoriretencion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAutoriRetencion(AutoriRetencion autoriretencion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAutoriRetencion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAutoriRetencion()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAutoriRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAutoriRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAutoriRetencion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAutoriRetencion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAutoriRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAutoriRetencion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public AutoriRetencionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AutoriRetencionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AutoriRetencionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.autoriretencionSessionBean=new AutoriRetencionSessionBean(); 
		this.autoriretencionConstantesFunciones=new AutoriRetencionConstantesFunciones(); 
		this.autoriretencionBean=new AutoriRetencion();//(this.autoriretencionConstantesFunciones); 		
		this.autoriretencionReturnGeneral=new AutoriRetencionParameterReturnGeneral(); 
		
		this.autoriretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autoriretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AutoriRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AutoriRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AutoriRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAutoriRetencion(true);
			
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
			
			this.autoriretencionConstantesFunciones=new AutoriRetencionConstantesFunciones(); 
			this.autoriretencionBean=new AutoriRetencion();//this.autoriretencionConstantesFunciones); 			
			this.autoriretencionReturnGeneral=new AutoriRetencionParameterReturnGeneral(); 
		
			AutoriRetencionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autori Retencion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.autoriretencion=new AutoriRetencion();
			this.autoriretencions = new ArrayList<AutoriRetencion>();
			this.autoriretencionsAux = new ArrayList<AutoriRetencion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic=new AutoriRetencionLogic();
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.autoriretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.autoriretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAutoriRetencion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutoriRetencion);	
					}
					
					if(this.jInternalFrameImportacionAutoriRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutoriRetencion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAutoriRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAutoriRetencion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAutoriRetencion);
				this.jInternalFrameDetalleFormAutoriRetencion.setVisible(false);
				this.jInternalFrameDetalleFormAutoriRetencion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutoriRetencion);
					this.jInternalFrameReporteDinamicoAutoriRetencion.setVisible(false);
					this.jInternalFrameReporteDinamicoAutoriRetencion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAutoriRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAutoriRetencion);
					this.jInternalFrameImportacionAutoriRetencion.setVisible(false);
					this.jInternalFrameImportacionAutoriRetencion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAutoriRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAutoriRetencion);
					this.jInternalFrameOrderByAutoriRetencion.setVisible(false);
					this.jInternalFrameOrderByAutoriRetencion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAutoriRetencionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AutoriRetencionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.autoriretencionReturnGeneral=new AutoriRetencionParameterReturnGeneral();
			
			this.autoriretencionParameterGeneral=new AutoriRetencionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.autoriretencionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AutoriRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutoriRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autoriretencionSessionBean.getEsGuardarRelacionado(),this.autoriretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutoriRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autoriretencionSessionBean.getEsGuardarRelacionado(),this.autoriretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaDuplicarAutoriRetencion=true;
			this.isVisibilidadCeldaCopiarAutoriRetencion=true;
			this.isVisibilidadCeldaVerFormAutoriRetencion=true;
			this.isVisibilidadCeldaOrdenAutoriRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
			this.isVisibilidadCeldaModificarAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=false;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAutoriRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAutoriRetencion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAutoriRetencion(false);
			
			this.setPermisosUsuarioAutoriRetencion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autoriretencionSessionBean.getEsGuardarRelacionado() 
				|| (this.autoriretencionSessionBean.getEsGuardarRelacionado() && this.autoriretencionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAutoriRetencionClasesRelacionadas();
			}
			
			if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAutoriRetencionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAutoriRetencion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAutoriRetencion();
			}
			
			if(!this.isPermisoBusquedaAutoriRetencion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAutoriRetencion,this.isPermisoPaginacionMedioAutoriRetencion,this.isPermisoPaginacionTodoAutoriRetencion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AutoriRetencionConstantesFunciones.getTiposSeleccionarAutoriRetencion());
				
				this.tiposColumnasSelect=AutoriRetencionConstantesFunciones.getTiposSeleccionarAutoriRetencion(true);
				
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
			//if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAutoriRetencion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAutoriRetencion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAutoriRetencion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriRetencion() ;
			
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
			this.usuarioLogic=new UsuarioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				autoriretencionImplementable= (AutoriRetencionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutoriRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				autoriretencionImplementableHome= (AutoriRetencionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutoriRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.autoriretencions= new ArrayList<AutoriRetencion>();
			this.autoriretencionsEliminados= new ArrayList<AutoriRetencion>();
						
			this.isEsNuevoAutoriRetencion=false;
			this.esParaAccionDesdeFormularioAutoriRetencion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAutoriRetencion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAutoriRetencion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AutoriRetencionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AutoriRetencionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAutoriRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAutoriRetencion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAutoriRetencion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAutoriRetencion();
			}
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAutoriRetencion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAutoriRetencion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAutoriRetencion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAutoriRetencion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AutoriRetencion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAutoriRetencion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAutoriRetencion")) {
				iIndex=this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAutoriRetencion();	
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
	
	public void cargarCombosForeignKeyAutoriRetencion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAutoriRetencion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAutoriRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAutoriRetencionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAutoriRetencion();
		
		this.cargarCombosFrameForeignKeyAutoriRetencion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAutoriRetencion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAutoriRetencion();
		}
	}
	
	
	
	public void jButtonNuevoAutoriRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			
			if(jTableDatosAutoriRetencion.getRowCount()>=1) {
				jTableDatosAutoriRetencion.removeRowSelectionInterval(0, jTableDatosAutoriRetencion.getRowCount()-1);						
			}
			
			this.isEsNuevoAutoriRetencion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAutoriRetencion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAutoriRetencion(true);			
			//this.autoriretencion=new AutoriRetencion();
			//this.autoriretencion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriRetencion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriRetencion() ;
			
			if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriRetencion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.autoriretencion);	
			this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);				
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AutoriRetencion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAutoriRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAutoriRetencion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAutoriRetencion.getSelectedRows().length;			
			}
			
			autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAutoriRetencion--;			
				//AutoriRetencion autoriretencionAux= new AutoriRetencion();			
				//autoriretencionAux.setId(this.iIdNuevoAutoriRetencion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AutoriRetencion autoriretencionOrigen=new AutoriRetencion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AutoriRetencion autoriretencionOrigen : autoriretencionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							autoriretencionOrigen =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autoriretencionOrigen =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAutoriRetencion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.autoriretencion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAutoriRetencion(autoriretencionOrigen,this.autoriretencion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autoriretencionLogic.getAutoriRetencions().add(this.autoriretencionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autoriretencions.add(this.autoriretencionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
				
				this.jTableDatosAutoriRetencion.setRowSelectionInterval(this.getIndiceNuevoAutoriRetencion(), this.getIndiceNuevoAutoriRetencion());
				
				int iLastRow =  this.jTableDatosAutoriRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutoriRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutoriRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriRetencion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();									
		
			AutoriRetencion autoriretencionOrigen=new AutoriRetencion();
			AutoriRetencion autoriretencionDestino=new AutoriRetencion();
				
			autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAutoriRetencion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || autoriretencionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAutoriRetencion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionOrigen =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autoriretencionOrigen =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autoriretencionDestino =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autoriretencionDestino =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				autoriretencionOrigen =autoriretencionsSeleccionados.get(0);
				autoriretencionDestino =autoriretencionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAutoriRetencion(autoriretencionOrigen,autoriretencionDestino,true,false);
				
				autoriretencionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autoriretencionDestino,autoriretencionLogic.getAutoriRetencions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autoriretencionDestino,autoriretencions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
				
				//this.jTableDatosAutoriRetencion.setRowSelectionInterval(this.getIndiceNuevoAutoriRetencion(), this.getIndiceNuevoAutoriRetencion());
				
				int iLastRow =  this.jTableDatosAutoriRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutoriRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutoriRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriRetencion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAutoriRetencion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAutoriRetencion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAutoriRetencion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAutoriRetencion.setVisible(!isVisible);
			this.jPanelPaginacionAutoriRetencion.setVisible(!isVisible);
			this.jPanelAccionesAutoriRetencion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAutoriRetencion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAutoriRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAutoriRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAutoriRetencion();
			
			this.abrirFrameOrderByAutoriRetencion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAutoriRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAutoriRetencion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutoriRetencion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAutoriRetencion.isMaximum()) {
					this.jInternalFrameDetalleFormAutoriRetencion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAutoriRetencion.setSize(this.jInternalFrameDetalleFormAutoriRetencion.iWidthFormulario,this.jInternalFrameDetalleFormAutoriRetencion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAutoriRetencion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAutoriRetencion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAutoriRetencion.isMaximum()) {
						this.jInternalFrameDetalleFormAutoriRetencion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAutoriRetencion.jContentPaneDetalleAutoriRetencion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAutoriRetencion.jContentPaneDetalleAutoriRetencion.getWidth(),AutoriRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAutoriRetencion.jContentPaneDetalleAutoriRetencion.getWidth(),AutoriRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAutoriRetencion.jContentPaneDetalleAutoriRetencion.getWidth(),AutoriRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAutoriRetencion.setVisible(true);
	        this.jInternalFrameDetalleFormAutoriRetencion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAutoriRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAutoriRetencion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAutoriRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriRetencion,false,this);
				} else {
					this.jInternalFrameOrderByAutoriRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutoriRetencion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAutoriRetencion);
				this.jInternalFrameOrderByAutoriRetencion.setVisible(false);
				this.jInternalFrameOrderByAutoriRetencion.setSelected(false);
				
				this.jInternalFrameOrderByAutoriRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutoriRetencion"));
				
				this.inicializarActualizarBindingTablaOrderByAutoriRetencion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAutoriRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAutoriRetencion==null) {
				
				this.jInternalFrameImportacionAutoriRetencion=new ImportacionJInternalFrame(AutoriRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutoriRetencion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAutoriRetencion);
				this.jInternalFrameImportacionAutoriRetencion.setVisible(false);
				this.jInternalFrameImportacionAutoriRetencion.setSelected(false);


				this.jInternalFrameImportacionAutoriRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutoriRetencion"));
				this.jInternalFrameImportacionAutoriRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutoriRetencion"));
				this.jInternalFrameImportacionAutoriRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutoriRetencion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAutoriRetencion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAutoriRetencion==null) {
				this.jInternalFrameReporteDinamicoAutoriRetencion=new ReporteDinamicoJInternalFrame(AutoriRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutoriRetencion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutoriRetencion);
				this.jInternalFrameReporteDinamicoAutoriRetencion.setVisible(false);
				this.jInternalFrameReporteDinamicoAutoriRetencion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriRetencion"));
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriRetencion"));
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriRetencion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriRetencion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAutoriRetencion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutoriRetencion);
			
	       	this.jInternalFrameDetalleFormAutoriRetencion.setVisible(false);
	        this.jInternalFrameDetalleFormAutoriRetencion.setSelected(false);
			
			//this.jInternalFrameDetalleFormAutoriRetencion.dispose();
			//this.jInternalFrameDetalleFormAutoriRetencion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAutoriRetencion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAutoriRetencion.setVisible(true);
	        this.jInternalFrameReporteDinamicoAutoriRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAutoriRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAutoriRetencion.setVisible(true);
	        this.jInternalFrameImportacionAutoriRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAutoriRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAutoriRetencion.setVisible(true);
	        this.jInternalFrameOrderByAutoriRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAutoriRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAutoriRetencion.setVisible(false);
	        this.jInternalFrameOrderByAutoriRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAutoriRetencion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAutoriRetencion.setVisible(false);
	        this.jInternalFrameReporteDinamicoAutoriRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAutoriRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAutoriRetencion.setVisible(false);
	        this.jInternalFrameImportacionAutoriRetencion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAutoriRetencion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAutoriRetencion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAutoriRetencion(true);
			//this.isEsNuevoAutoriRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAutoriRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriRetencion(false) ;
			
			if(autoriretencionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriRetencion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAutoriRetencionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAutoriRetencion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAutoriRetencion(true);
			//this.isEsNuevoAutoriRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.autoriretencion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAutoriRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAutoriRetencion(false) ;
			
			if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutoriRetencion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAutoriRetencion(false);
			
			//if(!this.isEsNuevoAutoriRetencion) {								
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				
			}
			
			if(this.permiteMantenimiento(this.autoriretencion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAutoriRetencion=true;
					this.inicializarActualizarBindingTablaAutoriRetencion(false);
					this.isEsNuevoAutoriRetencion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAutoriRetencion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAutoriRetencion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutoriRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriRetencion(false);
				
				this.habilitarDeshabilitarControlesAutoriRetencion(false);
			
												
				
				if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAutoriRetencion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAutoriRetencionActionPerformed(evt,autoriretencionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAutoriRetencion(this.autoriretencion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAutoriRetencion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,autoriretencionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.autoriretencion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				this.autoriretencion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				this.autoriretencion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.autoriretencion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AutoriRetencionModel) this.jTableDatosAutoriRetencion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAutoriRetencion=true;
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
				this.isEsNuevoAutoriRetencion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutoriRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriRetencion(false);
				
				this.habilitarDeshabilitarControlesAutoriRetencion(false);
				
				
				
				if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAutoriRetencion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAutoriRetencion.getRowCount()>=1) {
				jTableDatosAutoriRetencion.removeRowSelectionInterval(0, jTableDatosAutoriRetencion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAutoriRetencion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAutoriRetencion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutoriRetencion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutoriRetencion(false) ;
			
			this.isEsNuevoAutoriRetencion=false;
			
			if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAutoriRetencion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAutoriRetencion(false);
				
				//SI ES MANUAL
				if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAutoriRetencion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAutoriRetencion--;			
			//AutoriRetencion autoriretencionAux= new AutoriRetencion();			
			//autoriretencionAux.setId(this.iIdNuevoAutoriRetencion);
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAutoriRetencion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
			
			this.autoriretencion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.autoriretencionLogic.getAutoriRetencions().add(this.autoriretencionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.autoriretencions.add(this.autoriretencionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAutoriRetencion(false);
			
			this.jTableDatosAutoriRetencion.setRowSelectionInterval(this.getIndiceNuevoAutoriRetencion(), this.getIndiceNuevoAutoriRetencion());
			
			int iLastRow =  this.jTableDatosAutoriRetencion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAutoriRetencion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAutoriRetencion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAutoriRetencion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriRetencion(false);
			
			//SI ES MANUAL
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriRetencion();
			}
			
			//this.abrirFrameTreeAutoriRetencion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Autori RetencionES ?", "MANTENIMIENTO DE Autori Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAutoriRetencion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAutoriRetencion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.autoriretencionReturnGeneral=autoriretencionLogic.procesarImportacionAutoriRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.autoriretencionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAutoriRetencionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAutoriRetencion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAutoriRetencion.setFileImportacion(this.jInternalFrameImportacionAutoriRetencion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAutoriRetencion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAutoriRetencion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAutoriRetencion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAutoriRetencion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		

		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AutoriRetencionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AutoriRetencionBaseDesign.jrxml";
			
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
			
			this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSerie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSerie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSerie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSerie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFinal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCaducidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCaducidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCaducidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCaducidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAutoriRetencion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoria="numero_serie";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoria="numero_autorizacion";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL:
					sNombreCampoCategoria="numero_inicial";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL:
					sNombreCampoCategoria="numero_final";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD:
					sNombreCampoCategoria="fecha_caducidad";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE:
					sNombreCampoCategoriaValor="numero_serie";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoriaValor="numero_autorizacion";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL:
					sNombreCampoCategoriaValor="numero_inicial";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL:
					sNombreCampoCategoriaValor="numero_final";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD:
					sNombreCampoCategoriaValor="fecha_caducidad";
					break;

				case AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_serie");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autorizacion");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_inicial");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_final");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Caducad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_caducidad");
					break;

				case AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AutoriRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getnumero_serie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getnumero_autorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getnumero_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getnumero_final());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getfecha_caducidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(AutoriRetencion autoriretencion:autoriretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autoriretencion.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelAutoriRetencion(row);				
			//	iRow++;
			//}				
			
			//for(AutoriRetencion autoriretencionAux:autoriretencionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAutoriRetencion(autoriretencionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
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
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriRetencion(false);
			
			//SI ES MANUAL
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutoriRetencion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriRetencion(false);
			
			//SI ES MANUAL
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutoriRetencion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutoriRetencion(false);
			
			//SI ES MANUAL
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutoriRetencion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAutoriRetencion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAutoriRetencion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAutoriRetencion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAutoriRetencion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAutoriRetencion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAutoriRetencion.setMinimumSize(dimensionMinimum);
		this.jTableDatosAutoriRetencion.setMaximumSize(dimensionMaximum);
		this.jTableDatosAutoriRetencion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAutoriRetencion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAutoriRetencion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAutoriRetencion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAutoriRetencion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAutoriRetencion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAutoriRetencion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriRetencion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAutoriRetencion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAutoriRetencion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAutoriRetencion();
		
		this.inicializarActualizarBindingBotonesManualAutoriRetencion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAutoriRetencion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutoriRetencion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriRetencion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriRetencion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAutoriRetencion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAutoriRetencion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAutoriRetencion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxPostAccionNuevoAutoriRetencion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxPostAccionSinCerrarAutoriRetencion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxPostAccionSinMensajeAutoriRetencion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAutoriRetencion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAutoriRetencion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAutoriRetencion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
				this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxPostAccionNuevoAutoriRetencion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxPostAccionSinCerrarAutoriRetencion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxPostAccionSinMensajeAutoriRetencion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAutoriRetencion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAutoriRetencion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAutoriRetencion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAutoriRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAutoriRetencion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAutoriRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAutoriRetencion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAutoriRetencion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAutoriRetencion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAutoriRetencion(Boolean esInicializar) throws Exception {
		try	{	
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAutoriRetencion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAutoriRetencion() throws Exception {
		try	{
			if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAutoriRetencion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutoriRetencion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAutoriRetencion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAutoriRetencion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAutoriRetencion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAutoriRetencion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAutoriRetencion.addItem(reporte);
			}
			
			
			if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAutoriRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAutoriRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAutoriRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAutoriRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAutoriRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAutoriRetencion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAutoriRetencion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriRetencion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutoriRetencion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutoriRetencion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
				
				if(this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutoriRetencion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAutoriRetencion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutoriRetencion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutoriRetencion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAutoriRetencion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAutoriRetencion(Boolean esInicializar) throws Exception {				
		if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAutoriRetencion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAutoriRetencion() throws Exception {
		this.inicializarActualizarBindingTablaAutoriRetencion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAutoriRetencion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAutoriRetencionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAutoriRetencion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=autoriretencionLogic.getAutoriRetencions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=autoriretencions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAutoriRetencion.setModel(new AutoriRetencionModel(this.autoriretencionLogic.getAutoriRetencions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAutoriRetencion.setModel(new AutoriRetencionModel(this.autoriretencions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAutoriRetencion!=null && this.jInternalFrameOrderByAutoriRetencion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAutoriRetencion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO,autoriretencionConstantesFunciones.resaltarSeleccionarAutoriRetencion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AutoriRetencionConstantesFunciones.SCLASSWEBTITULO,autoriretencionConstantesFunciones.resaltarSeleccionarAutoriRetencion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_ID));

		if(this.autoriretencionConstantesFunciones.mostraridAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.autoriretencionConstantesFunciones.resaltaridAutoriRetencion,this.autoriretencionConstantesFunciones.activaridAutoriRetencion,this,true,"idAutoriRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriretencionConstantesFunciones.resaltaridAutoriRetencion,this.autoriretencionConstantesFunciones.activaridAutoriRetencion,this,true,"idAutoriRetencion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.autoriretencionConstantesFunciones.mostrarid_empresaAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.autoriretencionConstantesFunciones.resaltarid_empresaAutoriRetencion,this,this.autoriretencionConstantesFunciones.activarid_empresaAutoriRetencion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.autoriretencionConstantesFunciones.resaltarid_empresaAutoriRetencion,this,this.autoriretencionConstantesFunciones.activarid_empresaAutoriRetencion,false,"id_empresaAutoriRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.autoriretencionConstantesFunciones.mostrarid_sucursalAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.autoriretencionConstantesFunciones.resaltarid_sucursalAutoriRetencion,this,this.autoriretencionConstantesFunciones.activarid_sucursalAutoriRetencion));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.autoriretencionConstantesFunciones.resaltarid_sucursalAutoriRetencion,this,this.autoriretencionConstantesFunciones.activarid_sucursalAutoriRetencion,false,"id_sucursalAutoriRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO));

		if(this.autoriretencionConstantesFunciones.mostrarid_usuarioAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.autoriretencionConstantesFunciones.resaltarid_usuarioAutoriRetencion,this,this.autoriretencionConstantesFunciones.activarid_usuarioAutoriRetencion));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.autoriretencionConstantesFunciones.resaltarid_usuarioAutoriRetencion,this,this.autoriretencionConstantesFunciones.activarid_usuarioAutoriRetencion,false,"id_usuarioAutoriRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE));

		if(this.autoriretencionConstantesFunciones.mostrarnumero_serieAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_serieAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_serieAutoriRetencion,this,true,"numero_serieAutoriRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_serieAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_serieAutoriRetencion,this,true,"numero_serieAutoriRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION));

		if(this.autoriretencionConstantesFunciones.mostrarnumero_autorizacionAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_autorizacionAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_autorizacionAutoriRetencion,this,true,"numero_autorizacionAutoriRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_autorizacionAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_autorizacionAutoriRetencion,this,true,"numero_autorizacionAutoriRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL));

		if(this.autoriretencionConstantesFunciones.mostrarnumero_inicialAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_inicialAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_inicialAutoriRetencion,this,true,"numero_inicialAutoriRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_inicialAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_inicialAutoriRetencion,this,true,"numero_inicialAutoriRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL));

		if(this.autoriretencionConstantesFunciones.mostrarnumero_finalAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_finalAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_finalAutoriRetencion,this,true,"numero_finalAutoriRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autoriretencionConstantesFunciones.resaltarnumero_finalAutoriRetencion,this.autoriretencionConstantesFunciones.activarnumero_finalAutoriRetencion,this,true,"numero_finalAutoriRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD));

		if(this.autoriretencionConstantesFunciones.mostrarfecha_caducidadAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autoriretencionConstantesFunciones.resaltarfecha_caducidadAutoriRetencion,this.autoriretencionConstantesFunciones.activarfecha_caducidadAutoriRetencion,this,true,"fecha_caducidadAutoriRetencion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autoriretencionConstantesFunciones.resaltarfecha_caducidadAutoriRetencion,this.autoriretencionConstantesFunciones.activarfecha_caducidadAutoriRetencion,this,true,"fecha_caducidadAutoriRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.autoriretencionConstantesFunciones.mostraresta_activoAutoriRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.autoriretencionConstantesFunciones.resaltaresta_activoAutoriRetencion,this.autoriretencionConstantesFunciones.activaresta_activoAutoriRetencion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.autoriretencionConstantesFunciones.resaltaresta_activoAutoriRetencion,this.autoriretencionConstantesFunciones.activaresta_activoAutoriRetencion,this,true,"esta_activoAutoriRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AutoriRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autoriretencionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autoriretencionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutoriRetencion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autoriretencionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autoriretencionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutoriRetencion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.autoriretencionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.autoriretencionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAutoriRetencion.addColumn(tableColumn);
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
			
			this.jTableDatosAutoriRetencion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAutoriRetencion.moveColumn(this.jTableDatosAutoriRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAutoriRetencion.moveColumn(this.jTableDatosAutoriRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAutoriRetencion.moveColumn(this.jTableDatosAutoriRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAutoriRetencion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAutoriRetencion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAutoriRetencion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAutoriRetencion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAutoriRetencion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAutoriRetencion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAutoriRetencion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAutoriRetencion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=autoriretencionLogic.getAutoriRetencions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=autoriretencions.size()-1;
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
		//this.jTableDatosAutoriRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAutoriRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAutoriRetencion();
			
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
				
				//this.isEsNuevoAutoriRetencion=false;
					
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
				if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAutoriRetencion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutoriRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutoriRetencion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.autoriretencion.getsType().equals("DUPLICADO")
				   || this.autoriretencion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAutoriRetencion=true;
				
				} else {
					this.isEsNuevoAutoriRetencion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
					if(this.autoriretencion.getId()>=0 && !this.autoriretencion.getIsNew()) {						
						this.isEsNuevoAutoriRetencion=false;
						
					} else {
						this.isEsNuevoAutoriRetencion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAutoriRetencion(esRelaciones);						
				
				this.seleccionarAutoriRetencion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.autoriretencion.getId()<0) {
					this.isEsNuevoAutoriRetencion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAutoriRetencion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAutoriRetencion(evt,rowIndex);
				}	
				
				if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AutoriRetencion: " + this.dDif); 
					}
				}								
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAutoriRetencion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.autoriretencion)) {
					if(this.autoriretencion.getId()>0) {
						this.autoriretencion.setIsDeleted(true);
						
						this.autoriretencionsEliminados.add(this.autoriretencion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autoriretencionLogic.getAutoriRetencions().remove(this.autoriretencion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autoriretencions.remove(this.autoriretencion);				
					}
					
					
					((AutoriRetencionModel) this.jTableDatosAutoriRetencion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAutoriRetencion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAutoriRetencion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAutoriRetencion) {
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutoriRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutoriRetencion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAutoriRetencion(this.autoriretencion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.autoriretencionConstantesFunciones.cargarid_empresaAutoriRetencion || this.autoriretencionConstantesFunciones.event_dependid_empresaAutoriRetencion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.autoriretencion.getid_empresa());
									//this.inicializarActualizarBindingAutoriRetencion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(autoriretencion.getEmpresa()!=null) {
							this.empresasForeignKey.add(autoriretencion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.autoriretencion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.autoriretencionConstantesFunciones.cargarid_sucursalAutoriRetencion || this.autoriretencionConstantesFunciones.event_dependid_sucursalAutoriRetencion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.autoriretencion.getid_sucursal());
									//this.inicializarActualizarBindingAutoriRetencion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(autoriretencion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(autoriretencion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.autoriretencion.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.autoriretencionConstantesFunciones.cargarid_usuarioAutoriRetencion || this.autoriretencionConstantesFunciones.event_dependid_usuarioAutoriRetencion) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.autoriretencion.getid_usuario());
									//this.inicializarActualizarBindingAutoriRetencion(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(autoriretencion.getUsuario()!=null) {
							this.usuariosForeignKey.add(autoriretencion.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.autoriretencion.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAutoriRetencion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAutoriRetencion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutoriRetencion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutoriRetencion(AutoriRetencion autoriretencion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAutoriRetencion(autoriretencion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutoriRetencion(AutoriRetencion autoriretencion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAutoriRetencion(autoriretencion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAutoriRetencion(autoriretencion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAutoriRetencion(autoriretencion);
	}
	
	public void setVariablesObjetoActualToFormularioAutoriRetencion(AutoriRetencion autoriretencion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setText(autoriretencion.getId().toString());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setText(autoriretencion.getnumero_serie());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setText(autoriretencion.getnumero_autorizacion());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setText(autoriretencion.getnumero_inicial());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setText(autoriretencion.getnumero_final());
			this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setDate(autoriretencion.getfecha_caducidad());
			this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setSelected(autoriretencion.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AutoriRetencion autoriretencionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,autoriretencionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AutoriRetencion autoriretencionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				autoriretencionLocal=this.autoriretencion;
			} else {
				autoriretencionLocal=this.autoriretencionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(autoriretencionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAutoriRetencion(autoriretencionLocal,true);
					
					if(autoriretencionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(autoriretencionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(autoriretencionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAutoriRetencion(AutoriRetencion autoriretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutoriRetencion(autoriretencion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(autoriretencion);
	}
	
	public void setVariablesFormularioToObjetoActualAutoriRetencion(AutoriRetencion autoriretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutoriRetencion(autoriretencion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAutoriRetencion(AutoriRetencion autoriretencion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.getText()==null || this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.getText()=="" || this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.getText()=="Id") {
				this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setText("0");
			}

			if(conColumnasBase) {autoriretencion.setId(Long.parseLong(this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelIdAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriretencion.setnumero_serie(this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_serieAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriretencion.setnumero_autorizacion(this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_autorizacionAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriretencion.setnumero_inicial(this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_inicialAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriretencion.setnumero_final(this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelnumero_finalAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriretencion.setfecha_caducidad(this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelfecha_caducidadAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autoriretencion.setesta_activo(this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutoriRetencion.jLabelesta_activoAutoriRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutoriRetencion(AutoriRetencion autoriretencionBean,AutoriRetencion autoriretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAutoriRetencion(AutoriRetencion autoriretencionOrigen,AutoriRetencion autoriretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autoriretencionOrigen.getId()!=null && !autoriretencionOrigen.getId().equals(0L))) {autoriretencion.setId(autoriretencionOrigen.getId());}}
			if(conDefault || (!conDefault && autoriretencionOrigen.getnumero_serie()!=null && !autoriretencionOrigen.getnumero_serie().equals(""))) {autoriretencion.setnumero_serie(autoriretencionOrigen.getnumero_serie());}
			if(conDefault || (!conDefault && autoriretencionOrigen.getnumero_autorizacion()!=null && !autoriretencionOrigen.getnumero_autorizacion().equals(""))) {autoriretencion.setnumero_autorizacion(autoriretencionOrigen.getnumero_autorizacion());}
			if(conDefault || (!conDefault && autoriretencionOrigen.getnumero_inicial()!=null && !autoriretencionOrigen.getnumero_inicial().equals(""))) {autoriretencion.setnumero_inicial(autoriretencionOrigen.getnumero_inicial());}
			if(conDefault || (!conDefault && autoriretencionOrigen.getnumero_final()!=null && !autoriretencionOrigen.getnumero_final().equals(""))) {autoriretencion.setnumero_final(autoriretencionOrigen.getnumero_final());}
			if(conDefault || (!conDefault && autoriretencionOrigen.getfecha_caducidad()!=null && !autoriretencionOrigen.getfecha_caducidad().equals(new Date()))) {autoriretencion.setfecha_caducidad(autoriretencionOrigen.getfecha_caducidad());}
			if(conDefault || (!conDefault && autoriretencionOrigen.getesta_activo()!=null && !autoriretencionOrigen.getesta_activo().equals(false))) {autoriretencion.setesta_activo(autoriretencionOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutoriRetencion(AutoriRetencion autoriretencion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setText(autoriretencion.getId().toString());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setText(autoriretencion.getnumero_serie());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setText(autoriretencion.getnumero_autorizacion());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setText(autoriretencion.getnumero_inicial());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setText(autoriretencion.getnumero_final());
			this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setDate(autoriretencion.getfecha_caducidad());
			this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setSelected(autoriretencion.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutoriRetencion(AutoriRetencionBean autoriretencionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setText(autoriretencionBean.getId().toString());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setText(autoriretencionBean.getnumero_serie());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setText(autoriretencionBean.getnumero_autorizacion());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setText(autoriretencionBean.getnumero_inicial());
			this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setText(autoriretencionBean.getnumero_final());
			this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setDate(autoriretencionBean.getfecha_caducidad());
			this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setSelected(autoriretencionBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAutoriRetencion(AutoriRetencionParameterReturnGeneral autoriretencionReturnGeneral,AutoriRetencionBean autoriretencionBean,Boolean conDefault) throws Exception { 
		try {
			AutoriRetencion autoriretencionLocal=new AutoriRetencion();
			
			autoriretencionLocal=autoriretencionReturnGeneral.getAutoriRetencion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autoriretencionLocal.getId()!=null && !autoriretencionLocal.getId().equals(0L))) {autoriretencionBean.setId(autoriretencionLocal.getId());}}
			if(conDefault || (!conDefault && autoriretencionLocal.getnumero_serie()!=null && !autoriretencionLocal.getnumero_serie().equals(""))) {autoriretencionBean.setnumero_serie(autoriretencionLocal.getnumero_serie());}
			if(conDefault || (!conDefault && autoriretencionLocal.getnumero_autorizacion()!=null && !autoriretencionLocal.getnumero_autorizacion().equals(""))) {autoriretencionBean.setnumero_autorizacion(autoriretencionLocal.getnumero_autorizacion());}
			if(conDefault || (!conDefault && autoriretencionLocal.getnumero_inicial()!=null && !autoriretencionLocal.getnumero_inicial().equals(""))) {autoriretencionBean.setnumero_inicial(autoriretencionLocal.getnumero_inicial());}
			if(conDefault || (!conDefault && autoriretencionLocal.getnumero_final()!=null && !autoriretencionLocal.getnumero_final().equals(""))) {autoriretencionBean.setnumero_final(autoriretencionLocal.getnumero_final());}
			if(conDefault || (!conDefault && autoriretencionLocal.getfecha_caducidad()!=null && !autoriretencionLocal.getfecha_caducidad().equals(new Date()))) {autoriretencionBean.setfecha_caducidad(autoriretencionLocal.getfecha_caducidad());}
			if(conDefault || (!conDefault && autoriretencionLocal.getesta_activo()!=null && !autoriretencionLocal.getesta_activo().equals(false))) {autoriretencionBean.setesta_activo(autoriretencionLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAutoriRetencionGenerico(Long idAutoriRetencionSeleccionado,JComboBox jComboBoxAutoriRetencion,List<AutoriRetencion> autoriretencionsLocal)throws Exception {
		try {
			AutoriRetencion  autoriretencionTemp=null;

			for(AutoriRetencion autoriretencionAux:autoriretencionsLocal) {
				if(autoriretencionAux.getId()!=null && autoriretencionAux.getId().equals(idAutoriRetencionSeleccionado)) {
					autoriretencionTemp=autoriretencionAux;
					break;
				}
			}

			jComboBoxAutoriRetencion.setSelectedItem(autoriretencionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAutoriRetencionGenerico(JComboBox jComboBoxAutoriRetencion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutoriRetencion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAutoriRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutoriRetencion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAutoriRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAutoriRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAutoriRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autoriretencion=(AutoriRetencion) autoriretencionLogic.getAutoriRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autoriretencion =(AutoriRetencion) autoriretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!autoriretencion.getIsNew() && !autoriretencion.getIsChanged() && !autoriretencion.getIsDeleted()) {
				sDescripcion=autoriretencion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=autoriretencion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!autoriretencion.getIsNew() && !autoriretencion.getIsChanged() && !autoriretencion.getIsDeleted()) {
				sDescripcion=autoriretencion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=autoriretencion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!autoriretencion.getIsNew() && !autoriretencion.getIsChanged() && !autoriretencion.getIsDeleted()) {
				sDescripcion=autoriretencion.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=autoriretencion.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AutoriRetencion autoriretencionRow=new AutoriRetencion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autoriretencionRow=(AutoriRetencion) autoriretencionLogic.getAutoriRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autoriretencionRow=(AutoriRetencion) autoriretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAutoriRetencion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoAutoriRetencion && this.isPermisoNuevoAutoriRetencion));			
			this.jButtonDuplicarAutoriRetencion.setVisible((this.isVisibilidadCeldaDuplicarAutoriRetencion && this.isPermisoDuplicarAutoriRetencion));			
			this.jButtonCopiarAutoriRetencion.setVisible((this.isVisibilidadCeldaCopiarAutoriRetencion && this.isPermisoCopiarAutoriRetencion));
			this.jButtonVerFormAutoriRetencion.setVisible((this.isVisibilidadCeldaVerFormAutoriRetencion && this.isPermisoVerFormAutoriRetencion));
			
			this.jButtonAbrirOrderByAutoriRetencion.setVisible((this.isVisibilidadCeldaOrdenAutoriRetencion && this.isPermisoOrdenAutoriRetencion));			
			
			this.jButtonNuevoRelacionesAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion && this.isPermisoNuevoAutoriRetencion));			
			this.jButtonNuevoGuardarCambiosAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoAutoriRetencion && this.isPermisoNuevoAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarAutoriRetencion.setVisible((this.isVisibilidadCeldaModificarAutoriRetencion && this.isPermisoActualizarAutoriRetencion));	
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarAutoriRetencion.setVisible((this.isVisibilidadCeldaActualizarAutoriRetencion && this.isPermisoActualizarAutoriRetencion));	
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarAutoriRetencion.setVisible((this.isVisibilidadCeldaEliminarAutoriRetencion && this.isPermisoEliminarAutoriRetencion));
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarAutoriRetencion.setVisible(this.isVisibilidadCeldaCancelarAutoriRetencion);							
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));			
			
			}
						
			this.jButtonGuardarCambiosTablaAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoAutoriRetencion && this.isPermisoNuevoAutoriRetencion));						
			this.jButtonDuplicarToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaDuplicarAutoriRetencion && this.isPermisoDuplicarAutoriRetencion));						
			this.jButtonCopiarToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaCopiarAutoriRetencion && this.isPermisoCopiarAutoriRetencion));			
			this.jButtonVerFormToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaVerFormAutoriRetencion && this.isPermisoVerFormAutoriRetencion));			
			this.jButtonAbrirOrderByToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaOrdenAutoriRetencion && this.isPermisoOrdenAutoriRetencion));
			this.jButtonNuevoRelacionesToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion && this.isPermisoNuevoAutoriRetencion));			
			this.jButtonNuevoGuardarCambiosToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoAutoriRetencion && this.isPermisoNuevoAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));			
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaModificarAutoriRetencion && this.isPermisoActualizarAutoriRetencion));	
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaActualizarAutoriRetencion  && this.isPermisoActualizarAutoriRetencion));	
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaEliminarAutoriRetencion && this.isPermisoEliminarAutoriRetencion));
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarToolBarAutoriRetencion.setVisible(this.isVisibilidadCeldaCancelarAutoriRetencion);				
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoAutoriRetencion && this.isPermisoNuevoAutoriRetencion));			
			this.jMenuItemDuplicarAutoriRetencion.setVisible((this.isVisibilidadCeldaDuplicarAutoriRetencion && this.isPermisoDuplicarAutoriRetencion));			
			this.jMenuItemCopiarAutoriRetencion.setVisible((this.isVisibilidadCeldaCopiarAutoriRetencion && this.isPermisoCopiarAutoriRetencion));			
			this.jMenuItemVerFormAutoriRetencion.setVisible((this.isVisibilidadCeldaVerFormAutoriRetencion && this.isPermisoVerFormAutoriRetencion));			
			this.jMenuItemAbrirOrderByAutoriRetencion.setVisible((this.isVisibilidadCeldaOrdenAutoriRetencion && this.isPermisoOrdenAutoriRetencion));			
			//this.jMenuItemMostrarOcultarAutoriRetencion.setVisible((this.isVisibilidadCeldaOrdenAutoriRetencion && this.isPermisoOrdenAutoriRetencion));
			this.jMenuItemDetalleAbrirOrderByAutoriRetencion.setVisible((this.isVisibilidadCeldaOrdenAutoriRetencion && this.isPermisoOrdenAutoriRetencion));			
			//this.jMenuItemDetalleMostrarOcultarAutoriRetencion.setVisible((this.isVisibilidadCeldaOrdenAutoriRetencion && this.isPermisoOrdenAutoriRetencion));			
			this.jMenuItemNuevoRelacionesAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion && this.isPermisoNuevoAutoriRetencion));			
			this.jMenuItemNuevoGuardarCambiosAutoriRetencion.setVisible((this.isVisibilidadCeldaNuevoAutoriRetencion && this.isPermisoNuevoAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));									
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemModificarAutoriRetencion.setVisible((this.isVisibilidadCeldaModificarAutoriRetencion && this.isPermisoActualizarAutoriRetencion));	
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemActualizarAutoriRetencion.setVisible((this.isVisibilidadCeldaActualizarAutoriRetencion && this.isPermisoActualizarAutoriRetencion));	
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemEliminarAutoriRetencion.setVisible((this.isVisibilidadCeldaEliminarAutoriRetencion && this.isPermisoEliminarAutoriRetencion));
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemCancelarAutoriRetencion.setVisible(this.isVisibilidadCeldaCancelarAutoriRetencion);				
			}
			
			this.jMenuItemGuardarCambiosAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));						
			this.jMenuItemGuardarCambiosTablaAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAutoriRetencion=this.jButtonNuevoAutoriRetencion.isVisible();
			this.isVisibilidadCeldaDuplicarAutoriRetencion=this.jButtonDuplicarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaCopiarAutoriRetencion=this.jButtonCopiarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaVerFormAutoriRetencion=this.jButtonVerFormAutoriRetencion.isVisible();
			
			this.isVisibilidadCeldaOrdenAutoriRetencion=this.jButtonAbrirOrderByAutoriRetencion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=this.jButtonNuevoRelacionesAutoriRetencion.isVisible();
			this.isVisibilidadCeldaModificarAutoriRetencion=this.jButtonModificarAutoriRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.isVisibilidadCeldaActualizarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaEliminarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaCancelarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaGuardarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=this.jButtonGuardarCambiosTablaAutoriRetencion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAutoriRetencion=this.jButtonNuevoToolBarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=this.jButtonNuevoRelacionesToolBarAutoriRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.isVisibilidadCeldaModificarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarToolBarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaActualizarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarToolBarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaEliminarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarToolBarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaCancelarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarToolBarAutoriRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutoriRetencion=this.jButtonGuardarCambiosToolBarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=this.jButtonGuardarCambiosTablaToolBarAutoriRetencion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAutoriRetencion=this.jMenuItemNuevoAutoriRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=this.jMenuItemNuevoRelacionesAutoriRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.isVisibilidadCeldaModificarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemModificarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaActualizarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemActualizarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaEliminarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemEliminarAutoriRetencion.isVisible();
			this.isVisibilidadCeldaCancelarAutoriRetencion=this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemCancelarAutoriRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutoriRetencion=this.jMenuItemGuardarCambiosAutoriRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=this.jMenuItemGuardarCambiosTablaAutoriRetencion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAutoriRetencion(Boolean esInicializar) {
		if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
				//if(this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAutoriRetencion();
			}
			
			this.inicializarActualizarBindingBotonesManualAutoriRetencion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAutoriRetencion() {
		this.jButtonNuevoAutoriRetencion.setVisible(this.isPermisoNuevoAutoriRetencion);			
		this.jButtonDuplicarAutoriRetencion.setVisible(this.isPermisoDuplicarAutoriRetencion);			
		this.jButtonCopiarAutoriRetencion.setVisible(this.isPermisoCopiarAutoriRetencion);			
		this.jButtonVerFormAutoriRetencion.setVisible(this.isPermisoVerFormAutoriRetencion);			
		
		this.jButtonAbrirOrderByAutoriRetencion.setVisible(this.isPermisoOrdenAutoriRetencion);					
		
		this.jButtonNuevoRelacionesAutoriRetencion.setVisible(this.isPermisoNuevoAutoriRetencion);			
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarAutoriRetencion.setVisible(this.isPermisoActualizarAutoriRetencion);	
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarAutoriRetencion.setVisible(this.isPermisoActualizarAutoriRetencion);	
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarAutoriRetencion.setVisible(this.isPermisoEliminarAutoriRetencion);
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarAutoriRetencion.setVisible(this.isVisibilidadCeldaCancelarAutoriRetencion);						
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.setVisible(this.isPermisoGuardarCambiosAutoriRetencion);							
		}
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.setVisible(this.isPermisoActualizarAutoriRetencion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAutoriRetencion() {
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarAutoriRetencion.setVisible(this.isPermisoActualizarAutoriRetencion);	
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarAutoriRetencion.setVisible(this.isPermisoActualizarAutoriRetencion);	
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarAutoriRetencion.setVisible(this.isPermisoEliminarAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarAutoriRetencion.setVisible(this.isVisibilidadCeldaCancelarAutoriRetencion);							
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.setVisible((this.isVisibilidadCeldaGuardarAutoriRetencion && this.isPermisoGuardarCambiosAutoriRetencion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAutoriRetencion() {
		if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAutoriRetencion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAutoriRetencion() {
	}
	
	public void jTableDatosAutoriRetencionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAutoriRetencion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.autoriretencion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAutoriRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAutoriRetencion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.autoriretencionLogic.getConnexion());

				if(this.autoriretencion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.autoriretencion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriRetencion=(TitledBorder)this.jScrollPanelDatosAutoriRetencion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAutoriRetencion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.autoriretencion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalAutoriRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebAutoriRetencion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.autoriretencionLogic.getConnexion());

				if(this.autoriretencion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.autoriretencion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriRetencion=(TitledBorder)this.jScrollPanelDatosAutoriRetencion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderAutoriRetencion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.autoriretencion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioAutoriRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebAutoriRetencion(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutoriRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutoriRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.autoriretencionLogic.getConnexion());

				if(this.autoriretencion.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.autoriretencion.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutoriRetencion=(TitledBorder)this.jScrollPanelDatosAutoriRetencion.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderAutoriRetencion.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.autoriretencion.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_serieAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getnumero_serie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_serie like '%"+this.autoriretencion.getnumero_serie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizacionAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getnumero_autorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autorizacion like '%"+this.autoriretencion.getnumero_autorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_inicialAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getnumero_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_inicial like '%"+this.autoriretencion.getnumero_inicial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_finalAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getnumero_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_final like '%"+this.autoriretencion.getnumero_final()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_caducidadAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getfecha_caducidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_caducidad = '"+Funciones2.getStringPostgresDate(this.autoriretencion.getfecha_caducidad())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoAutoriRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.getautoriretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autoriretencion==null) {
						this.autoriretencion = new AutoriRetencion();
					}

					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);
				}

				if(this.autoriretencion.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.autoriretencion.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutoriRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriRetencion(false,false);

			this.getAutoriRetencionsFK_IdEmpresa();

			this.inicializarActualizarBindingAutoriRetencion(false);

			//if(AutoriRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriRetencion(false,false);

			this.getAutoriRetencionsFK_IdSucursal();

			this.inicializarActualizarBindingAutoriRetencion(false);

			//if(AutoriRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioAutoriRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutoriRetencion(false,false);

			this.getAutoriRetencionsFK_IdUsuario();

			this.inicializarActualizarBindingAutoriRetencion(false);

			//if(AutoriRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutoriRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autoriretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAutoriRetencion() {
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
			this.jInternalFrameDetalleFormAutoriRetencion.setVisible(false);	    			
			this.jInternalFrameDetalleFormAutoriRetencion.dispose();
			this.jInternalFrameDetalleFormAutoriRetencion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
			this.jInternalFrameReporteDinamicoAutoriRetencion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAutoriRetencion.dispose();
			this.jInternalFrameReporteDinamicoAutoriRetencion=null;
		}
		
		if(this.jInternalFrameImportacionAutoriRetencion!=null) {
			this.jInternalFrameImportacionAutoriRetencion.setVisible(false);	    			
			this.jInternalFrameImportacionAutoriRetencion.dispose();
			this.jInternalFrameImportacionAutoriRetencion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAutoriRetencion();
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			
			if(sTipo.equals("NuevoAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAutoriRetencion")) {
				jButtonDuplicarAutoriRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAutoriRetencion")) {
				jButtonCopiarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormAutoriRetencion")) {
				jButtonVerFormAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAutoriRetencion")) {
				jButtonDuplicarAutoriRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAutoriRetencion")) {
				jButtonDuplicarAutoriRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAutoriRetencion")) {
				jButtonModificarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAutoriRetencion")) {
				jButtonModificarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAutoriRetencion")) {
				jButtonModificarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAutoriRetencion")) {
				jButtonActualizarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAutoriRetencion")) {
				jButtonActualizarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAutoriRetencion")) {
				jButtonActualizarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarAutoriRetencion")) {
				jButtonEliminarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAutoriRetencion")) {
				jButtonEliminarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAutoriRetencion")) {
				jButtonEliminarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarAutoriRetencion")) {
				jButtonCancelarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAutoriRetencion")) {
				jButtonCancelarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAutoriRetencion")) {
				jButtonCancelarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarAutoriRetencion")) {
				jButtonCerrarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAutoriRetencion")) {
				jButtonCerrarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAutoriRetencion")) {
				jButtonCerrarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAutoriRetencion")) {
				jButtonMostrarOcultarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAutoriRetencion")) {
				jButtonCancelarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAutoriRetencion")) {
				jButtonCopiarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAutoriRetencion")) {
				jButtonVerFormAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAutoriRetencion")) {
				jButtonCopiarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAutoriRetencion")) {
				jButtonVerFormAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAutoriRetencion")) {
				jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAutoriRetencion")) {
				jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAutoriRetencion")) {
				jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAutoriRetencion")) {
				jButtonAnterioresAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAutoriRetencion")) {
				jButtonAnterioresAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAutoriRetencion")) {
				jButtonAnterioresAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAutoriRetencion")) {
				jButtonSiguientesAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAutoriRetencion")) {
				jButtonSiguientesAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAutoriRetencion")) {
				jButtonSiguientesAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAutoriRetencion") || sTipo.equals("MenuItemDetalleAbrirOrderByAutoriRetencion")) {
				jButtonAbrirOrderByAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAutoriRetencion") || sTipo.equals("MenuItemDetalleMostrarOcultarAutoriRetencion")) {
				jButtonMostrarOcultarAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAutoriRetencion")) {
				jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAutoriRetencion")) {
				jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAutoriRetencion")) {
				jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAutoriRetencion")) {
				jButtonCerrarReporteDinamicoAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAutoriRetencion")) {
				jButtonGenerarReporteDinamicoAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAutoriRetencion")) {
				
				jButtonGenerarExcelReporteDinamicoAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAutoriRetencion")) {
				jButtonCerrarImportacionAutoriRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAutoriRetencion")) {
				
				jButtonGenerarImportacionAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAutoriRetencion")) {
				
				jButtonAbrirImportacionAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAutoriRetencion")) {
				jComboBoxTiposAccionesAutoriRetencionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAutoriRetencion")) {
				jComboBoxTiposRelacionesAutoriRetencionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAutoriRetencion")) {
				jComboBoxTiposAccionesAutoriRetencionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAutoriRetencion")) {
				
				jComboBoxTiposSeleccionarAutoriRetencionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAutoriRetencion")) {
				jTextFieldValorCampoGeneralAutoriRetencionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAutoriRetencion")) {
				jButtonAbrirOrderByAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAutoriRetencion")) {
				jButtonAbrirOrderByAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAutoriRetencion")) {
				jButtonCerrarOrderByAutoriRetencionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutoriRetencionBusqueda")) {
				this.jButtonidAutoriRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutoriRetencionUpdate")) {
				this.jButtonid_empresaAutoriRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutoriRetencionBusqueda")) {
				this.jButtonid_empresaAutoriRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAutoriRetencionUpdate")) {
				this.jButtonid_sucursalAutoriRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAutoriRetencionBusqueda")) {
				this.jButtonid_sucursalAutoriRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioAutoriRetencionUpdate")) {
				this.jButtonid_usuarioAutoriRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioAutoriRetencionBusqueda")) {
				this.jButtonid_usuarioAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieAutoriRetencionBusqueda")) {
				this.jButtonnumero_serieAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionAutoriRetencionBusqueda")) {
				this.jButtonnumero_autorizacionAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_inicialAutoriRetencionBusqueda")) {
				this.jButtonnumero_inicialAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_finalAutoriRetencionBusqueda")) {
				this.jButtonnumero_finalAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_caducidadAutoriRetencionBusqueda")) {
				this.jButtonfecha_caducidadAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoAutoriRetencionBusqueda")) {
				this.jButtonesta_activoAutoriRetencionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAutoriRetencion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AutoriRetencion autoriretencionLocal=null;
			
			if(!this.getEsControlTabla()) {
				autoriretencionLocal=this.autoriretencion;
			} else {
				autoriretencionLocal=this.autoriretencionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
							
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
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
			
			


			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
								
						
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
								
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
							
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
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
			
			


			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
								
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAutoriRetencion")) {
					jCheckBoxSeleccionarTodosAutoriRetencionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAutoriRetencion")) {
					jCheckBoxSeleccionadosAutoriRetencionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAutoriRetencion")) {
					
				}
				
				


				
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
												
				
				


				
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
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
			
			


			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutoriRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autoriretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autoriretencion);
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
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
				
				


				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutoriRetencion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutoriRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutoriRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autoriretencionAnterior =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAutoriRetencion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAutoriRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAutoriRetencion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.autoriretencion =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.autoriretencion =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.autoriretencion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAutoriRetencion")) {
				
				}
				
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAutoriRetencion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAutoriRetencion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAutoriRetencion")) {
			
			}
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAutoriRetencion();
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			if(sTipo.equals("NuevoAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAutoriRetencion")) {
				jButtonDuplicarAutoriRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAutoriRetencion")) {
				jButtonCopiarAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAutoriRetencion")) {
				jButtonVerFormAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAutoriRetencion")) {
				jButtonNuevoAutoriRetencionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAutoriRetencion")) {
				jButtonModificarAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAutoriRetencion")) {
				jButtonActualizarAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAutoriRetencion")) {
				jButtonEliminarAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAutoriRetencion")) {
				jButtonCancelarAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAutoriRetencion")) {
				jButtonCerrarAutoriRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAutoriRetencion")) {
				jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAutoriRetencion")) {
				jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAutoriRetencion")) {
				jButtonAbrirOrderByAutoriRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAutoriRetencion")) {
				jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAutoriRetencion")) {
				jButtonAnterioresAutoriRetencionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAutoriRetencion")) {
				jButtonSiguientesAutoriRetencionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutoriRetencionBusqueda")) {
				this.jButtonidAutoriRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutoriRetencionUpdate")) {
				this.jButtonid_empresaAutoriRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutoriRetencionBusqueda")) {
				this.jButtonid_empresaAutoriRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAutoriRetencionUpdate")) {
				this.jButtonid_sucursalAutoriRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAutoriRetencionBusqueda")) {
				this.jButtonid_sucursalAutoriRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioAutoriRetencionUpdate")) {
				this.jButtonid_usuarioAutoriRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioAutoriRetencionBusqueda")) {
				this.jButtonid_usuarioAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_serieAutoriRetencionBusqueda")) {
				this.jButtonnumero_serieAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionAutoriRetencionBusqueda")) {
				this.jButtonnumero_autorizacionAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_inicialAutoriRetencionBusqueda")) {
				this.jButtonnumero_inicialAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_finalAutoriRetencionBusqueda")) {
				this.jButtonnumero_finalAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_caducidadAutoriRetencionBusqueda")) {
				this.jButtonfecha_caducidadAutoriRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoAutoriRetencionBusqueda")) {
				this.jButtonesta_activoAutoriRetencionBusquedaActionPerformed(evt);
			}
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAutoriRetencion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAutoriRetencion")) {
				closingInternalFrameAutoriRetencion();
				
			} else if(sTipo.equals("jButtonCancelarAutoriRetencion")) {
				JInternalFrameBase jInternalFrameDetalleFormAutoriRetencion = (JInternalFrameBase)evt.getSource();
	            	
	            AutoriRetencionBeanSwingJInternalFrame jInternalFrameParent=(AutoriRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormAutoriRetencion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAutoriRetencionActionPerformed(null);
			}
			
			AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autoriretencion,new Object(),this.autoriretencionParameterGeneral,this.autoriretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAutoriRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAutoriRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAutoriRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.autoriretencion)) {
			if(!esControlTabla) {
				if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);			
				}
				
				if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAutoriRetencion(this.autoriretencion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.autoriretencionReturnGeneral=autoriretencionLogic.procesarEventosAutoriRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriretencionLogic.getAutoriRetencions(),this.autoriretencion,this.autoriretencionParameterGeneral,this.isEsNuevoAutoriRetencion,classes);//this.autoriretencionLogic.getAutoriRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAutoriRetencion(this.autoriretencionReturnGeneral,this.autoriretencionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAutoriRetencion(classes,this.autoriretencionReturnGeneral,this.autoriretencionBean,false);
					}
						
					if(this.autoriretencionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion());	
					}
						
					if(this.autoriretencionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion(),classes);//this.autoriretencionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAutoriRetencion(this.autoriretencion,classes);//this.autoriretencionBean);									
				}
			
				if(AutoriRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAutoriRetencion(this.autoriretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutoriRetencion(this.autoriretencion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.autoriretencionAnterior!=null) {
						this.autoriretencion=this.autoriretencionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.autoriretencionReturnGeneral=autoriretencionLogic.procesarEventosAutoriRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriretencionLogic.getAutoriRetencions(),this.autoriretencion,this.autoriretencionParameterGeneral,this.isEsNuevoAutoriRetencion,classes);//this.autoriretencionLogic.getAutoriRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autoriretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autoriretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.autoriretencionReturnGeneral.getAutoriRetencion(),autoriretencionLogic.getAutoriRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.autoriretencionReturnGeneral.getAutoriRetencion(),this.autoriretencions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAutoriRetencion.repaint();
				
				//((AbstractTableModel) this.jTableDatosAutoriRetencion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAutoriRetencion();
			}
		}
	}
	
	public void actualizarVisualTableDatosAutoriRetencion() throws Exception {
		
		AutoriRetencionModel autoriretencionModel=(AutoriRetencionModel)this.jTableDatosAutoriRetencion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autoriretencionModel.autoriretencions=this.autoriretencionLogic.getAutoriRetencions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			autoriretencionModel.autoriretencions=this.autoriretencions;
		}
		
		
		((AutoriRetencionModel) this.jTableDatosAutoriRetencion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAutoriRetencion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getautoriretencionAnterior(),this.autoriretencionLogic.getAutoriRetencions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getautoriretencionAnterior(),this.autoriretencions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAutoriRetencion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAutoriRetencion(AutoriRetencion autoriretencion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
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
										
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriretencion,new Object(),generalEntityParameterGeneral,this.autoriretencionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.autoriretencionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AutoriRetencionConstantesFunciones.getClassesRelationshipsOfAutoriRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AutoriRetencionConstantesFunciones.getClassesRelationshipsFromStringsOfAutoriRetencion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAutoriRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AutoriRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autoriretencion,new Object(),generalEntityParameterGeneral,this.autoriretencionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAutoriRetencion(AutoriRetencionBean autoriretencionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAutoriRetencion(ArrayList<Classe> classes,AutoriRetencionReturnGeneral autoriretencionReturnGeneral,AutoriRetencionBean autoriretencionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAutoriRetencion(AutoriRetencion autoriretencion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.autoriretencion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAutoriRetencion = new AutoriRetencionDetalleFormJInternalFrame(jDesktopPane,this.autoriretencionSessionBean.getConGuardarRelaciones(),this.autoriretencionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.setVisible(false);
		this.jInternalFrameDetalleFormAutoriRetencion.setSelected(false);						
		
		this.jInternalFrameDetalleFormAutoriRetencion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAutoriRetencion.autoriretencionLogic=this.autoriretencionLogic;
		
		this.cargarCombosFrameForeignKeyAutoriRetencion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAutoriRetencion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutoriRetencion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAutoriRetencion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAutoriRetencion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAutoriRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutoriRetencion"));
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarAutoriRetencion.addActionListener(new ButtonActionListener(this,"ModificarAutoriRetencion"));

		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutoriRetencion"));
					
		this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemModificarAutoriRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutoriRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarAutoriRetencion.addActionListener (new ButtonActionListener(this,"ActualizarAutoriRetencion"));
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutoriRetencion"));
						
		this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemActualizarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutoriRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarAutoriRetencion.addActionListener (new ButtonActionListener(this,"EliminarAutoriRetencion"));
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutoriRetencion"));
								
		this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemEliminarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutoriRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CancelarAutoriRetencion"));
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutoriRetencion"));
					
		this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemCancelarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutoriRetencion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemDetalleCerrarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutoriRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriRetencion"));
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriRetencion"));
		
		
		
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutoriRetencion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonidAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_empresaAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_empresaAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_sucursalAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_sucursalAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_usuarioAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_usuarioAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_serieAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_autorizacionAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_inicialAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_inicialAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_finalAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_finalAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonfecha_caducidadAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonesta_activoAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoAutoriRetencionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutoriRetencion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAutoriRetencion"));
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutoriRetencion"));
		}
		
		this.jTableDatosAutoriRetencion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAutoriRetencion"));
		
		this.jTableDatosAutoriRetencion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAutoriRetencion"));
		
		this.jButtonNuevoAutoriRetencion.addActionListener(new ButtonActionListener(this,"NuevoAutoriRetencion"));
		
		this.jButtonDuplicarAutoriRetencion.addActionListener(new ButtonActionListener(this,"DuplicarAutoriRetencion"));
		
		this.jButtonCopiarAutoriRetencion.addActionListener(new ButtonActionListener(this,"CopiarAutoriRetencion"));
		
		this.jButtonVerFormAutoriRetencion.addActionListener(new ButtonActionListener(this,"VerFormAutoriRetencion"));
		
		
		this.jButtonNuevoToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"NuevoToolBarAutoriRetencion"));
			
		this.jButtonDuplicarToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAutoriRetencion"));
			
		this.jMenuItemNuevoAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAutoriRetencion"));
			
		this.jMenuItemDuplicarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAutoriRetencion"));		
		
		
		this.jButtonNuevoRelacionesAutoriRetencion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAutoriRetencion"));
		
		
		this.jButtonNuevoRelacionesToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAutoriRetencion"));
			
		this.jMenuItemNuevoRelacionesAutoriRetencion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAutoriRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarAutoriRetencion.addActionListener(new ButtonActionListener(this,"ModificarAutoriRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonModificarToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutoriRetencion"));
			
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemModificarAutoriRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutoriRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarAutoriRetencion.addActionListener (new ButtonActionListener(this,"ActualizarAutoriRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonActualizarToolBarAutoriRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutoriRetencion"));
				
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemActualizarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutoriRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarAutoriRetencion.addActionListener (new ButtonActionListener(this,"EliminarAutoriRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonEliminarToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutoriRetencion"));
						
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemEliminarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutoriRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CancelarAutoriRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonCancelarToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutoriRetencion"));
			
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemCancelarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutoriRetencion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAutoriRetencion"));		
		
		
		this.jButtonCerrarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CerrarAutoriRetencion"));
		
		
		this.jButtonCerrarToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CerrarToolBarAutoriRetencion"));
			
		this.jMenuItemCerrarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAutoriRetencion"));
			
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jMenuItemDetalleCerrarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutoriRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosAutoriRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutoriRetencion"));
		}
		
		this.jButtonCopiarToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"CopiarToolBarAutoriRetencion"));
			
		this.jButtonVerFormToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"VerFormToolBarAutoriRetencion"));
		
		this.jMenuItemGuardarCambiosAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAutoriRetencion"));
			
		this.jMenuItemCopiarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAutoriRetencion"));		
		
		this.jMenuItemVerFormAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAutoriRetencion"));		
		
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutoriRetencion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAutoriRetencion"));
			
		this.jMenuItemGuardarCambiosTablaAutoriRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutoriRetencion"));		
		
		
		
		this.jButtonRecargarInformacionAutoriRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionAutoriRetencion"));
					
		this.jButtonRecargarInformacionToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAutoriRetencion"));
		
		this.jMenuItemRecargarInformacionAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAutoriRetencion"));		
		
		
		
		this.jButtonAnterioresAutoriRetencion.addActionListener (new ButtonActionListener(this,"AnterioresAutoriRetencion"));
		
		
		this.jButtonAnterioresToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAutoriRetencion"));
		
		this.jMenuItemAnterioresAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAutoriRetencion"));		
		
		
		this.jButtonSiguientesAutoriRetencion.addActionListener (new ButtonActionListener(this,"SiguientesAutoriRetencion"));
		
		
		this.jButtonSiguientesToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAutoriRetencion"));
			
		this.jMenuItemSiguientesAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAutoriRetencion"));
			
		this.jMenuItemAbrirOrderByAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAutoriRetencion"));
			
		this.jMenuItemMostrarOcultarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAutoriRetencion"));
			
		this.jMenuItemDetalleAbrirOrderByAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAutoriRetencion"));
			
		this.jMenuItemDetalleMostarOcultarAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAutoriRetencion"));		
		
		
		this.jButtonNuevoGuardarCambiosAutoriRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAutoriRetencion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAutoriRetencion"));
			
		this.jMenuItemNuevoGuardarCambiosAutoriRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAutoriRetencion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAutoriRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAutoriRetencion"));

		this.jCheckBoxSeleccionadosAutoriRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAutoriRetencion"));
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutoriRetencion"));
		}
		
		
		this.jComboBoxTiposRelacionesAutoriRetencion.addActionListener (new ButtonActionListener(this,"TiposRelacionesAutoriRetencion"));
			
		this.jComboBoxTiposAccionesAutoriRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesAutoriRetencion"));
					
		this.jComboBoxTiposSeleccionarAutoriRetencion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAutoriRetencion"));
			
		this.jTextFieldValorCampoGeneralAutoriRetencion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAutoriRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonidAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_empresaAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_empresaAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_sucursalAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_sucursalAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_usuarioAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_usuarioAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_serieAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_autorizacionAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_inicialAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_inicialAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_finalAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_finalAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonfecha_caducidadAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonesta_activoAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoAutoriRetencionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAutoriRetencion!=null) {
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriRetencion"));
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriRetencion"));
				this.jInternalFrameReporteDinamicoAutoriRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriRetencion"));
			}
			
			//this.jButtonCerrarReporteDinamicoAutoriRetencion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutoriRetencion"));				
			//this.jButtonGenerarReporteDinamicoAutoriRetencion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutoriRetencion"));
			//this.jButtonGenerarExcelReporteDinamicoAutoriRetencion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutoriRetencion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAutoriRetencion!=null) {
				this.jInternalFrameImportacionAutoriRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutoriRetencion"));
				this.jInternalFrameImportacionAutoriRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutoriRetencion"));
				this.jInternalFrameImportacionAutoriRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutoriRetencion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAutoriRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByAutoriRetencion"));
			
			this.jButtonAbrirOrderByToolBarAutoriRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAutoriRetencion"));			
			
			if(this.jInternalFrameOrderByAutoriRetencion!=null) {
				this.jInternalFrameOrderByAutoriRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutoriRetencion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutoriRetencion.jTabbedPaneRelacionesAutoriRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutoriRetencion"));
		
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
            		closingInternalFrameAutoriRetencion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAutoriRetencion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAutoriRetencion = (JInternalFrameBase)event.getSource();
	            	
	            AutoriRetencionBeanSwingJInternalFrame jInternalFrameParent=(AutoriRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormAutoriRetencion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAutoriRetencionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAutoriRetencion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAutoriRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAutoriRetencion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAutoriRetencion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAutoriRetencion";
		inputMap = this.jButtonNuevoAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutoriRetencionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutoriRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAutoriRetencion";
		inputMap = this.jButtonNuevoRelacionesAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutoriRetencionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAutoriRetencion";
		inputMap = this.jButtonModificarAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAutoriRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAutoriRetencion";
		inputMap = this.jButtonActualizarAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAutoriRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAutoriRetencion";
		inputMap = this.jButtonEliminarAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAutoriRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAutoriRetencion";
		inputMap = this.jButtonCancelarAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAutoriRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAutoriRetencion";
		inputMap = this.jButtonCerrarAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAutoriRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAutoriRetencion";
		inputMap = this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonGuardarCambiosAutoriRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAutoriRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAutoriRetencion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAutoriRetencionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAutoriRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAutoriRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAutoriRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAutoriRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAutoriRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAutoriRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonidAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_empresaAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_empresaAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_sucursalAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_sucursalAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutoriRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_usuarioAutoriRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonid_usuarioAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_serieAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_serieAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_autorizacionAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_inicialAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_inicialAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonnumero_finalAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"numero_finalAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonfecha_caducidadAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadAutoriRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutoriRetencion.jButtonesta_activoAutoriRetencionBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoAutoriRetencionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAutoriRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAutoriRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAutoriRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAutoriRetencion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAutoriRetencion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
					autoriretencionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriRetencion autoriretencionAux:autoriretencions) {
					autoriretencionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAutoriRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutoriRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
						autoriretencionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriRetencion autoriretencionAux:autoriretencions) {
						autoriretencionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
					
						if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							autoriretencionAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriRetencion autoriretencionAux:autoriretencions) {
						
						if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							autoriretencionAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutoriRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutoriRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAutoriRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutoriRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAutoriRetencion.getSelectedRows();
			
			AutoriRetencion autoriretencionLocal=new AutoriRetencion();
			
			//this.seleccionarTodosAutoriRetencion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriretencionLocal =(AutoriRetencion) this.autoriretencionLogic.getAutoriRetencions().toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					autoriretencionLocal =(AutoriRetencion) this.autoriretencions.toArray()[this.jTableDatosAutoriRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				autoriretencionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
						autoriretencionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutoriRetencion autoriretencionAux:autoriretencions) {
						autoriretencionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutoriRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutoriRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutoriRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAutoriRetencionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAutoriRetencionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAutoriRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAutoriRetencion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAutoriRetencion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutoriRetencion autoriretencionAux:this.autoriretencionLogic.getAutoriRetencions()) {
				
						if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							autoriretencionAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							autoriretencionAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL)) {
							existe=true;
							autoriretencionAux.setnumero_inicial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL)) {
							existe=true;
							autoriretencionAux.setnumero_final(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD)) {
							existe=true;
							autoriretencionAux.setfecha_caducidad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriRetencion autoriretencionAux:autoriretencions) {
					
						if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE)) {
							existe=true;
							autoriretencionAux.setnumero_serie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							autoriretencionAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL)) {
							existe=true;
							autoriretencionAux.setnumero_inicial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL)) {
							existe=true;
							autoriretencionAux.setnumero_final(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD)) {
							existe=true;
							autoriretencionAux.setfecha_caducidad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAutoriRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAutoriRetencionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAutoriRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAutoriRetencion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAutoriRetencion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAutoriRetencion) {				
					conSplash=true;//false;										
					
					//this.startProcessAutoriRetencion(conSplash);
				
					this.generarReporteAutoriRetencionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAutoriRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutoriRetencionsSeleccionados(false);
				//this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutoriRetencionsSeleccionados(true);
				//this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutoriRetencion();
				
				this.exportarAutoriRetencionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAutoriRetencions();
				//this.importarAutoriRetencions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutoriRetencion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAutoriRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Autori Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAutoriRetencion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAutoriRetencion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAutoriRetencion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
				}	
			} 			
			else if(AutoriRetencionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAutoriRetencion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAutoriRetencion(conSplash);
					
						//this.actualizarParametrosGeneralAutoriRetencion();
						
						this.generarReporteProcesoAccionAutoriRetencionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AutoriRetencionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Autori RetencionES SELECCIONADOS?", "MANTENIMIENTO DE Autori Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAutoriRetencion();
				
						this.actualizarParametrosGeneralAutoriRetencion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.autoriretencionReturnGeneral=autoriretencionLogic.procesarAccionAutoriRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.autoriretencionLogic.getAutoriRetencions(),this.autoriretencionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAutoriRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAutoriRetencion();
					
					AutoriRetencionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAutoriRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutoriRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxTiposAccionesFormularioAutoriRetencion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAutoriRetencion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAutoriRetencionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAutoriRetencion();
			
			if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
			AutoriRetencion autoriretencion=new AutoriRetencion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAutoriRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAutoriRetencion.getSelectedItem();
			
			
			
			
			autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(autoriretencionsSeleccionados.size()==1) {
				for(AutoriRetencion autoriretencionAux:autoriretencionsSeleccionados) {
					autoriretencion=autoriretencionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAutoriRetencion();
			
      		//this.finishProcessAutoriRetencion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAutoriRetencionReturnGeneral() throws Exception {
		if(this.autoriretencionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.autoriretencionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.autoriretencionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.autoriretencionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.autoriretencionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.autoriretencionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAutoriRetencion(false);
		}
		
		if(this.autoriretencionReturnGeneral.getConRetornoLista() || this.autoriretencionReturnGeneral.getConRetornoObjeto()) {
			if(this.autoriretencionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autoriretencionLogic.setAutoriRetencions(this.autoriretencionReturnGeneral.getAutoriRetencions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.autoriretencionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autoriretencionLogic.setAutoriRetencion(this.autoriretencionReturnGeneral.getAutoriRetencion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAutoriRetencion(false);
		}
	}
	
	public void actualizarParametrosGeneralAutoriRetencion() throws Exception {
		
		
	}
	
	public ArrayList<AutoriRetencion> getAutoriRetencionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAutoriRetencion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AutoriRetencion autoriretencionAux:autoriretencionLogic.getAutoriRetencions()) {
					if(autoriretencionAux.getIsSelected()) {
						autoriretencionsSeleccionados.add(autoriretencionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutoriRetencion autoriretencionAux:this.autoriretencions) {
					if(autoriretencionAux.getIsSelected()) {
						autoriretencionsSeleccionados.add(autoriretencionAux);				
					}
				}
			}
			
			if(autoriretencionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						autoriretencionsSeleccionados.addAll(this.autoriretencionLogic.getAutoriRetencions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						autoriretencionsSeleccionados.addAll(this.autoriretencions);				
					}
				}
			}
		} else {
			autoriretencionsSeleccionados.add(this.autoriretencion);
		}
		
		return autoriretencionsSeleccionados;
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
	
	public void generarReporteAutoriRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAutoriRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAutoriRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutoriRetencionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutoriRetencionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Autori Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAutoriRetencionsSeleccionados() throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados);
		
	}	
	
	public void generarReporteNormalAutoriRetencionsSeleccionados() throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAutoriRetencionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAutoriRetencionsSeleccionados() throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAutoriRetencion();
		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAutoriRetencion();
		
		
		//this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados ,autoriretencionImplementable,autoriretencionImplementableHome);
	}
	
	public void mostrarImportacionAutoriRetencions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAutoriRetencion();
		
		this.abrirFrameImportacionAutoriRetencion();		
		
			
		//this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados ,autoriretencionImplementable,autoriretencionImplementableHome);
	}
	
	public void importarAutoriRetencions() throws Exception {		
	
	}
	
	public void exportarAutoriRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAutoriRetencionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAutoriRetencionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAutoriRetencionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Autori Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAutoriRetencionsSeleccionados() throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAutoriRetencion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AutoriRetencion autoriretencionAux:autoriretencionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAutoriRetencion(autoriretencionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//autoriretencionAux.setsDetalleGeneralEntityReporte(autoriretencionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAutoriRetencion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAutoriRetencion(AutoriRetencion autoriretencion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=autoriretencion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getnumero_serie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getnumero_autorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getnumero_inicial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getnumero_final();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getfecha_caducidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autoriretencion.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAutoriRetencionsSeleccionados() throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AutoriRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAutoriRetencion(row);				
				iRow++;
			}				
			
			for(AutoriRetencion autoriretencionAux:autoriretencionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAutoriRetencion(autoriretencionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAutoriRetencionsSeleccionados() throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();		
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autoriretencion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("autoriretencions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("autoriretencion");
			//elementRoot.appendChild(element);
		
			for(AutoriRetencion autoriretencionAux:autoriretencionsSeleccionados) {
				element = document.createElement("autoriretencion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAutoriRetencion(autoriretencionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autori Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAutoriRetencion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAutoriRetencion(AutoriRetencion autoriretencion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getnumero_serie());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getnumero_autorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getnumero_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getnumero_final());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getfecha_caducidad());
		cell = row.createCell(iColumn++);cell.setCellValue(autoriretencion.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlAutoriRetencion(AutoriRetencion autoriretencion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AutoriRetencionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(autoriretencion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AutoriRetencionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(autoriretencion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AutoriRetencionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(autoriretencion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(AutoriRetencionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(autoriretencion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(AutoriRetencionConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(autoriretencion.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnumero_serie = document.createElement(AutoriRetencionConstantesFunciones.NUMEROSERIE);
		elementnumero_serie.appendChild(document.createTextNode(autoriretencion.getnumero_serie().trim()));
		element.appendChild(elementnumero_serie);

		Element elementnumero_autorizacion = document.createElement(AutoriRetencionConstantesFunciones.NUMEROAUTORIZACION);
		elementnumero_autorizacion.appendChild(document.createTextNode(autoriretencion.getnumero_autorizacion().trim()));
		element.appendChild(elementnumero_autorizacion);

		Element elementnumero_inicial = document.createElement(AutoriRetencionConstantesFunciones.NUMEROINICIAL);
		elementnumero_inicial.appendChild(document.createTextNode(autoriretencion.getnumero_inicial().trim()));
		element.appendChild(elementnumero_inicial);

		Element elementnumero_final = document.createElement(AutoriRetencionConstantesFunciones.NUMEROFINAL);
		elementnumero_final.appendChild(document.createTextNode(autoriretencion.getnumero_final().trim()));
		element.appendChild(elementnumero_final);

		Element elementfecha_caducidad = document.createElement(AutoriRetencionConstantesFunciones.FECHACADUCIDAD);
		elementfecha_caducidad.appendChild(document.createTextNode(autoriretencion.getfecha_caducidad().toString().trim()));
		element.appendChild(elementfecha_caducidad);

		Element elementesta_activo = document.createElement(AutoriRetencionConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(autoriretencion.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoAutoriRetencionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AutoriRetencion> autoriretencionsSeleccionados=new ArrayList<AutoriRetencion>();
		
		autoriretencionsSeleccionados=this.getAutoriRetencionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAutoriRetencion(autoriretencionsSeleccionados);
		
		this.generarReporteAutoriRetencions("Todos",autoriretencionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAutoriRetencion(ArrayList<AutoriRetencion> autoriretencionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AutoriRetencion autoriretencionAux:autoriretencionsSeleccionados) {
				autoriretencionAux.setsDetalleGeneralEntityReporte(autoriretencionAux.toString());
			
				if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROSERIE)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getnumero_serie());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getnumero_autorizacion());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROINICIAL)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getnumero_inicial());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_NUMEROFINAL)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(autoriretencionAux.getnumero_final());
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_FECHACADUCIDAD)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autoriretencionAux.getfecha_caducidad()));
				}
				 else if(sTipoSeleccionar.equals(AutoriRetencionConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					autoriretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(autoriretencionAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutoriRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAutoriRetencion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAutoriRetencion=true;
				this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=true;
				this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=true;
			}
			
			this.isVisibilidadCeldaModificarAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=false;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
			this.isVisibilidadCeldaModificarAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=true;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
			this.isVisibilidadCeldaModificarAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=true;
			this.isVisibilidadCeldaEliminarAutoriRetencion=true;
			this.isVisibilidadCeldaCancelarAutoriRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
			this.isVisibilidadCeldaModificarAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=true;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAutoriRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=true;
			this.isVisibilidadCeldaModificarAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=false;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
			this.isVisibilidadCeldaActualizarAutoriRetencion=false;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
			this.isVisibilidadCeldaModificarAutoriRetencion=true;
			this.isVisibilidadCeldaActualizarAutoriRetencion=false;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
			this.isVisibilidadCeldaCancelarAutoriRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarAutoriRetencion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AutoriRetencionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAutoriRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=true;
		} else {
			this.actualizarEstadoPanelsAutoriRetencion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAutoriRetencion=false;
			//this.isVisibilidadCeldaVerFormAutoriRetencion=false;
			this.isVisibilidadCeldaDuplicarAutoriRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!autoriretencionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
		} else {
			this.isVisibilidadCeldaNuevoAutoriRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosAutoriRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(autoriretencionSessionBean.getEsGuardarRelacionado()) {
			if(!autoriretencionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;												
			}
			
			this.jButtonCerrarAutoriRetencion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAutoriRetencion=false;
		}
		
		if(!this.permiteMantenimiento(this.autoriretencion)) {
			this.isVisibilidadCeldaActualizarAutoriRetencion=false;
			this.isVisibilidadCeldaEliminarAutoriRetencion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAutoriRetencion() {
	}
	
	public void actualizarEstadoPanelsAutoriRetencion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAutoriRetencion!=null) {
				this.jScrollPanelDatosEdicionAutoriRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutoriRetencion!=null) {
				this.jScrollPanelDatosAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutoriRetencion!=null) {
				this.jPanelPaginacionAutoriRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
					this.jTabbedPaneBusquedasAutoriRetencion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.autoriretencionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutoriRetencion!=null) {
				this.jTabbedPaneBusquedasAutoriRetencion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAutoriRetencion!=null) {
				this.jPanelParametrosReportesAutoriRetencion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AutoriRetencionSessionBean autoriretencionSessionBean=new AutoriRetencionSessionBean();
		
		if(this.autoriretencionSessionBean==null) {
			this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
		}
		
		this.autoriretencionSessionBean.setsUltimaBusquedaAutoriRetencion(this.getsAccionBusqueda());
		this.autoriretencionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.autoriretencionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			autoriretencionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			autoriretencionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			autoriretencionSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AutoriRetencionSessionBean autoriretencionSessionBean=new AutoriRetencionSessionBean();
		
		if(this.autoriretencionSessionBean==null) {
			this.autoriretencionSessionBean=new AutoriRetencionSessionBean();
		}
		
		if(this.autoriretencionSessionBean.getsUltimaBusquedaAutoriRetencion()!=null&&!this.autoriretencionSessionBean.getsUltimaBusquedaAutoriRetencion().equals("")) {
			this.setsAccionBusqueda(autoriretencionSessionBean.getsUltimaBusquedaAutoriRetencion());
			this.setiNumeroPaginacion(autoriretencionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(autoriretencionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(autoriretencionSessionBean.getid_empresa());
				autoriretencionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(autoriretencionSessionBean.getid_sucursal());
				autoriretencionSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(autoriretencionSessionBean.getid_usuario());
				autoriretencionSessionBean.setid_usuario(-1L);
			}
		}
		
		this.autoriretencionSessionBean.setsUltimaBusquedaAutoriRetencion("");
		this.autoriretencionSessionBean.setiNumeroPaginacion(AutoriRetencionConstantesFunciones.INUMEROPAGINACION);
		this.autoriretencionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAutoriRetencion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAutoriRetencion() {
		this.updateBorderResaltarBusquedasFormularioAutoriRetencion();
		this.updateVisibilidadBusquedasFormularioAutoriRetencion();
		this.updateHabilitarBusquedasFormularioAutoriRetencion();
	}
	
	public void updateBorderResaltarBusquedasFormularioAutoriRetencion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAutoriRetencion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAutoriRetencion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAutoriRetencion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAutoriRetencion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAutoriRetencion.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAutoriRetencion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarAutoriRetencion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAutoriRetencion() throws Exception {

		if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAutoriRetencion();
		this.updateVisibilidadResaltarControlesFormularioAutoriRetencion();
		this.updateHabilitarResaltarControlesFormularioAutoriRetencion();
		
	}
	
	public void updateBorderResaltarControlesFormularioAutoriRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.autoriretencionConstantesFunciones.resaltaridAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltaridAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarid_empresaAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarid_empresaAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarid_sucursalAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarid_sucursalAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarid_usuarioAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarid_usuarioAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarnumero_serieAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarnumero_serieAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarnumero_autorizacionAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarnumero_autorizacionAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarnumero_inicialAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarnumero_inicialAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarnumero_finalAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarnumero_finalAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltarfecha_caducidadAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltarfecha_caducidadAutoriRetencion);}
		if(this.autoriretencionConstantesFunciones.resaltaresta_activoAutoriRetencion!=null && this.jInternalFrameDetalleFormAutoriRetencion!=null) {this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setBorder(this.autoriretencionConstantesFunciones.resaltaresta_activoAutoriRetencion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAutoriRetencion() throws Exception {		
		if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
	
		//this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostraridAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelidAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostraridAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarid_empresaAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelid_empresaAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarid_empresaAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarid_sucursalAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelid_sucursalAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarid_sucursalAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarid_usuarioAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelid_usuarioAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarid_usuarioAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_serieAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelnumero_serieAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_serieAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_autorizacionAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelnumero_autorizacionAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_autorizacionAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_inicialAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelnumero_inicialAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_inicialAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_finalAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelnumero_finalAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarnumero_finalAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarfecha_caducidadAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelfecha_caducidadAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostrarfecha_caducidadAutoriRetencion);
		//this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostraresta_activoAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jPanelesta_activoAutoriRetencion.setVisible(this.autoriretencionConstantesFunciones.mostraresta_activoAutoriRetencion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAutoriRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormAutoriRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutoriRetencion!=null) {
	
		this.jInternalFrameDetalleFormAutoriRetencion.jLabelidAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activaridAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_empresaAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarid_empresaAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_sucursalAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarid_sucursalAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jComboBoxid_usuarioAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarid_usuarioAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_serieAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarnumero_serieAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_autorizacionAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarnumero_autorizacionAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_inicialAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarnumero_inicialAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jTextFieldnumero_finalAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarnumero_finalAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jDateChooserfecha_caducidadAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activarfecha_caducidadAutoriRetencion);
		this.jInternalFrameDetalleFormAutoriRetencion.jCheckBoxesta_activoAutoriRetencion.setEnabled(this.autoriretencionConstantesFunciones.activaresta_activoAutoriRetencion);
		}
	}
	
		
}