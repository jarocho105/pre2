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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.SecuencialUsuarioConstantesFunciones;
import com.bydan.erp.facturacion.util.SecuencialUsuarioParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.SecuencialUsuarioParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.SecuencialUsuarioBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class SecuencialUsuarioBeanSwingJInternalFrame extends SecuencialUsuarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SecuencialUsuarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SecuencialUsuario> secuencialusuarioValidator = new ClassValidator<SecuencialUsuario>(SecuencialUsuario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SecuencialUsuario secuencialusuario;	
	public SecuencialUsuario secuencialusuarioAux;
	public SecuencialUsuario secuencialusuarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SecuencialUsuario secuencialusuarioTotales;
	public Long idSecuencialUsuarioActual;
	public Long iIdNuevoSecuencialUsuario=0L;
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

	public String sFinalQueryComboTipoDocumentoGeneral="";

	public List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey;

	public List<TipoDocumentoGeneral> gettipodocumentogeneralsForeignKey() {
		return tipodocumentogeneralsForeignKey;
	}

	public void settipodocumentogeneralsForeignKey(List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey) {
		this.tipodocumentogeneralsForeignKey = tipodocumentogeneralsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumentoGeneral tipodocumentogeneralForeignKey;

	public TipoDocumentoGeneral gettipodocumentogeneralForeignKey() {
		return tipodocumentogeneralForeignKey;
	}

	public void settipodocumentogeneralForeignKey(TipoDocumentoGeneral tipodocumentogeneralForeignKey) {
		this.tipodocumentogeneralForeignKey = tipodocumentogeneralForeignKey;
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
	
	public Boolean isPermisoTodoSecuencialUsuario;
	public Boolean isPermisoNuevoSecuencialUsuario;
	public Boolean isPermisoActualizarSecuencialUsuario;
	public Boolean isPermisoActualizarOriginalSecuencialUsuario;
	public Boolean isPermisoEliminarSecuencialUsuario;
	public Boolean isPermisoGuardarCambiosSecuencialUsuario;
	public Boolean isPermisoConsultaSecuencialUsuario;
	public Boolean isPermisoBusquedaSecuencialUsuario;
	public Boolean isPermisoReporteSecuencialUsuario;
	public Boolean isPermisoPaginacionMedioSecuencialUsuario;
	public Boolean isPermisoPaginacionAltoSecuencialUsuario;
	public Boolean isPermisoPaginacionTodoSecuencialUsuario;
	public Boolean isPermisoCopiarSecuencialUsuario;
	public Boolean isPermisoVerFormSecuencialUsuario;
	public Boolean isPermisoDuplicarSecuencialUsuario;
	public Boolean isPermisoOrdenSecuencialUsuario;
	
	
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
	
	public SecuencialUsuarioParameterReturnGeneral secuencialusuarioReturnGeneral;
	public SecuencialUsuarioParameterReturnGeneral secuencialusuarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSecuencialUsuario=false;
	public Boolean esParaAccionDesdeFormularioSecuencialUsuario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SecuencialUsuarioSessionBeanAdditional secuencialusuarioSessionBeanAdditional=null;
	
	public SecuencialUsuarioSessionBeanAdditional getSecuencialUsuarioSessionBeanAdditional() {
		return this.secuencialusuarioSessionBeanAdditional;
	}
	
	public void setSecuencialUsuarioSessionBeanAdditional(SecuencialUsuarioSessionBeanAdditional secuencialusuarioSessionBeanAdditional) {
		try {
			this.secuencialusuarioSessionBeanAdditional=secuencialusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SecuencialUsuarioBeanSwingJInternalFrameAdditional secuencialusuarioBeanSwingJInternalFrameAdditional=null;
	//public class SecuencialUsuarioBeanSwingJInternalFrame
	
	public SecuencialUsuarioBeanSwingJInternalFrameAdditional getSecuencialUsuarioBeanSwingJInternalFrameAdditional() {
		return this.secuencialusuarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setSecuencialUsuarioBeanSwingJInternalFrameAdditional(SecuencialUsuarioBeanSwingJInternalFrameAdditional secuencialusuarioBeanSwingJInternalFrameAdditional) {
		try {
			this.secuencialusuarioBeanSwingJInternalFrameAdditional=secuencialusuarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SecuencialUsuarioLogic secuencialusuarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SecuencialUsuario secuencialusuarioBean;
	public SecuencialUsuarioConstantesFunciones secuencialusuarioConstantesFunciones;
	//public SecuencialUsuarioParameterReturnGeneral secuencialusuarioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public TipoDocumentoGeneralLogic tipodocumentogeneralLogic;
	
	//PARAMETROS
	
	
	//public List<SecuencialUsuario> secuencialusuarios;	
	//public List<SecuencialUsuario> secuencialusuariosEliminados;
	//public List<SecuencialUsuario> secuencialusuariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSecuencialUsuario=false;
	public Boolean isVisibilidadCeldaDuplicarSecuencialUsuario=true;
	public Boolean isVisibilidadCeldaCopiarSecuencialUsuario=true;
	public Boolean isVisibilidadCeldaVerFormSecuencialUsuario=true;
	public Boolean isVisibilidadCeldaOrdenSecuencialUsuario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
	public Boolean isVisibilidadCeldaModificarSecuencialUsuario=false;
	public Boolean isVisibilidadCeldaActualizarSecuencialUsuario=false;
	public Boolean isVisibilidadCeldaEliminarSecuencialUsuario=false;
	public Boolean isVisibilidadCeldaCancelarSecuencialUsuario=false;
	public Boolean isVisibilidadCeldaGuardarSecuencialUsuario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;	
	
	
	public Boolean isVisibilidadBusquedaPorAutorizacion=false;
	public Boolean isVisibilidadBusquedaPorFechaFin=false;
	public Boolean isVisibilidadBusquedaPorFechaInicio=false;
	public Boolean isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=false;
	public Boolean isVisibilidadBusquedaPorSerie=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDocumentoGeneral=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoSecuencialUsuario() {
		return this.iIdNuevoSecuencialUsuario;
	}

	public void setiIdNuevoSecuencialUsuario(Long iIdNuevoSecuencialUsuario) {
		this.iIdNuevoSecuencialUsuario = iIdNuevoSecuencialUsuario;
	}
	
	public Long getidSecuencialUsuarioActual() {
		return this.idSecuencialUsuarioActual;
	}

	public void setidSecuencialUsuarioActual(Long idSecuencialUsuarioActual) {
		this.idSecuencialUsuarioActual = idSecuencialUsuarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SecuencialUsuario getsecuencialusuario() {
		return this.secuencialusuario;
	}

	public void setsecuencialusuario(SecuencialUsuario secuencialusuario) {
		this.secuencialusuario = secuencialusuario;
	}
	
	public SecuencialUsuario getsecuencialusuarioAux() {
		return this.secuencialusuarioAux;
	}

	public void setsecuencialusuarioAux(SecuencialUsuario secuencialusuarioAux) {
		this.secuencialusuarioAux = secuencialusuarioAux;
	}				
	
	public SecuencialUsuario getsecuencialusuarioAnterior() {
		return this.secuencialusuarioAnterior;
	}

	public void setsecuencialusuarioAnterior(SecuencialUsuario secuencialusuarioAnterior) {
		this.secuencialusuarioAnterior = secuencialusuarioAnterior;
	}	
	
	public SecuencialUsuario getsecuencialusuarioTotales() {
		return this.secuencialusuarioTotales;
	}

	public void setsecuencialusuarioTotales(SecuencialUsuario secuencialusuarioTotales) {
		this.secuencialusuarioTotales = secuencialusuarioTotales;
	}	
	
	public SecuencialUsuario getsecuencialusuarioBean() {
		return this.secuencialusuarioBean;
	}

	public void setsecuencialusuarioBean(SecuencialUsuario secuencialusuarioBean) {
		this.secuencialusuarioBean = secuencialusuarioBean;
	}	
	
	public SecuencialUsuarioParameterReturnGeneral getsecuencialusuarioReturnGeneral() {
		return this.secuencialusuarioReturnGeneral;
	}

	public void setsecuencialusuarioReturnGeneral(SecuencialUsuarioParameterReturnGeneral secuencialusuarioReturnGeneral) {
		this.secuencialusuarioReturnGeneral = secuencialusuarioReturnGeneral;
	}	
	
	
	public String autorizacionBusquedaPorAutorizacion="";

	public String getautorizacionBusquedaPorAutorizacion() {
		return this.autorizacionBusquedaPorAutorizacion;
	}

	public void setautorizacionBusquedaPorAutorizacion(String autorizacionBusquedaPorAutorizacion) {
		this.autorizacionBusquedaPorAutorizacion = autorizacionBusquedaPorAutorizacion;
	}

	public Date fecha_finBusquedaPorFechaFin=new Date();

	public Date getfecha_finBusquedaPorFechaFin() {
		return this.fecha_finBusquedaPorFechaFin;
	}

	public void setfecha_finBusquedaPorFechaFin(Date fecha_finBusquedaPorFechaFin) {
		this.fecha_finBusquedaPorFechaFin = fecha_finBusquedaPorFechaFin;
	}

	public Date fecha_inicioBusquedaPorFechaInicio=new Date();

	public Date getfecha_inicioBusquedaPorFechaInicio() {
		return this.fecha_inicioBusquedaPorFechaInicio;
	}

	public void setfecha_inicioBusquedaPorFechaInicio(Date fecha_inicioBusquedaPorFechaInicio) {
		this.fecha_inicioBusquedaPorFechaInicio = fecha_inicioBusquedaPorFechaInicio;
	}

	public Long id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=-1L;

	public Long getid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral() {
		return this.id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral;
	}

	public void setid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(Long id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {
		this.id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral = id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral;
	}

;
	public Long id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=-1L;

	public Long getid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral() {
		return this.id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral;
	}

	public void setid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(Long id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {
		this.id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral = id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral;
	}

	public String serieBusquedaPorSerie="";

	public String getserieBusquedaPorSerie() {
		return this.serieBusquedaPorSerie;
	}

	public void setserieBusquedaPorSerie(String serieBusquedaPorSerie) {
		this.serieBusquedaPorSerie = serieBusquedaPorSerie;
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

	public Long id_tipo_documento_generalFK_IdTipoDocumentoGeneral=-1L;

	public Long getid_tipo_documento_generalFK_IdTipoDocumentoGeneral() {
		return this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral;
	}

	public void setid_tipo_documento_generalFK_IdTipoDocumentoGeneral(Long id_tipo_documento_generalFK_IdTipoDocumentoGeneral) {
		this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral = id_tipo_documento_generalFK_IdTipoDocumentoGeneral;
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
	
	
	public SecuencialUsuarioLogic getSecuencialUsuarioLogic()	{		
		return secuencialusuarioLogic;
	}

	public void setSecuencialUsuarioLogic(SecuencialUsuarioLogic secuencialusuarioLogic) {
		this.secuencialusuarioLogic = secuencialusuarioLogic;
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
	
	public Boolean getIsEsNuevoSecuencialUsuario() {
		return isEsNuevoSecuencialUsuario;
	}

	public void setIsEsNuevoSecuencialUsuario(Boolean isEsNuevoSecuencialUsuario) {
		this.isEsNuevoSecuencialUsuario = isEsNuevoSecuencialUsuario;
	}

	public Boolean getEsParaAccionDesdeFormularioSecuencialUsuario() {
		return esParaAccionDesdeFormularioSecuencialUsuario;
	}
	
	public void setEsParaAccionDesdeFormularioSecuencialUsuario(Boolean esParaAccionDesdeFormularioSecuencialUsuario) {
		this.esParaAccionDesdeFormularioSecuencialUsuario = esParaAccionDesdeFormularioSecuencialUsuario;
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

			if(this.secuencialusuarioSessionBean==null) {
				this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
			}

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(secuencialusuarioSessionBean.getlidEmpresaActual());
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

			if(this.secuencialusuarioSessionBean==null) {
				this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
			}

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(secuencialusuarioSessionBean.getlidSucursalActual());
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

			if(this.secuencialusuarioSessionBean==null) {
				this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
			}

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(secuencialusuarioSessionBean.getlidUsuarioActual());
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

	public void cargarCombosTipoDocumentoGeneralsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoGeneralLogic tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();

			//tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingKeyData(true);

			if(this.secuencialusuarioSessionBean==null) {
				this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
			}

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingKeyData(true);

					tipodocumentogeneralLogic.getTodosTipoDocumentoGeneralsWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentogeneralsForeignKey=tipodocumentogeneralLogic.getTipoDocumentoGenerals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumentoGeneral(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.getEntityWithConnection(secuencialusuarioSessionBean.getlidTipoDocumentoGeneralActual());
					this.tipodocumentogeneralsForeignKey.add(tipodocumentogeneralLogic.getTipoDocumentoGeneral());
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

					if(this.secuencialusuario!=null) {
						this.secuencialusuario.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSecuencialUsuario.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSecuencialUsuarioGenerico)throws Exception
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
				jComboBoxid_empresaSecuencialUsuarioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSecuencialUsuarioGenerico!=null && jComboBoxid_empresaSecuencialUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_empresaSecuencialUsuarioGenerico.setSelectedIndex(0);
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

					if(this.secuencialusuario!=null) {
						this.secuencialusuario.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSecuencialUsuario.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSecuencialUsuarioGenerico)throws Exception
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
				jComboBoxid_sucursalSecuencialUsuarioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSecuencialUsuarioGenerico!=null && jComboBoxid_sucursalSecuencialUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSecuencialUsuarioGenerico.setSelectedIndex(0);
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

					if(this.secuencialusuario!=null) {
						this.secuencialusuario.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioSecuencialUsuario.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario!=null) {
						jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario!=null) {
							//jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.getItemCount()>0) {
								jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario!=null) {
						jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario!=null) {
							//jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.getItemCount()>0) {
								jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioSecuencialUsuarioGenerico)throws Exception
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
				jComboBoxid_usuarioSecuencialUsuarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioSecuencialUsuarioGenerico!=null && jComboBoxid_usuarioSecuencialUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioSecuencialUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDocumentoGeneralForeignKey(Long idTipoDocumentoGeneralSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentogeneralTemp!=null) {

					if(this.secuencialusuario!=null) {
						this.secuencialusuario.setTipoDocumentoGeneral(tipodocumentogeneralTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setSelectedItem(tipodocumentogeneralTemp);
					}
				} else {
					//jComboBoxid_tipo_documento_generalSecuencialUsuario.setSelectedItem(tipodocumentogeneralTemp);
					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
						if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentogeneralTemp!=null && jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario!=null) {
						jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(tipodocumentogeneralTemp);
					} else {
						if(jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario!=null) {
							//jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(tipodocumentogeneralTemp);
							if(jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.getItemCount()>0) {
								jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentogeneralTemp!=null && jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario!=null) {
						jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(tipodocumentogeneralTemp);
					} else {
						if(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario!=null) {
							//jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(tipodocumentogeneralTemp);
							if(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.getItemCount()>0) {
								jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setSelectedIndex(0);
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

	public String getActualTipoDocumentoGeneralForeignKeyDescripcion(Long idTipoDocumentoGeneralSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneralTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoGeneralForeignKeyGenerico(Long idTipoDocumentoGeneralSeleccionado,JComboBox jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			if(tipodocumentogeneralTemp!=null) {
				jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico.setSelectedItem(tipodocumentogeneralTemp);
			} else {
				if(jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico!=null && jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SecuencialUsuario secuencialusuario,JComboBox jComboBoxid_empresaSecuencialUsuarioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSecuencialUsuarioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSecuencialUsuarioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				secuencialusuario.setid_empresa(empresaAux.getId());
				secuencialusuario.setempresa_descripcion(SecuencialUsuarioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				secuencialusuario.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SecuencialUsuario secuencialusuario,JComboBox jComboBoxid_sucursalSecuencialUsuarioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSecuencialUsuarioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSecuencialUsuarioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				secuencialusuario.setid_sucursal(sucursalAux.getId());
				secuencialusuario.setsucursal_descripcion(SecuencialUsuarioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				secuencialusuario.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(SecuencialUsuario secuencialusuario,JComboBox jComboBoxid_usuarioSecuencialUsuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioSecuencialUsuarioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioSecuencialUsuarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				secuencialusuario.setid_usuario(usuarioAux.getId());
				secuencialusuario.setusuario_descripcion(SecuencialUsuarioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				secuencialusuario.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoGeneralForeignKey(SecuencialUsuario secuencialusuario,JComboBox jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralAux=new TipoDocumentoGeneral();

			if(jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico==null) {
				tipodocumentogeneralAux=(TipoDocumentoGeneral)this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.getSelectedItem();
			} else {
				tipodocumentogeneralAux=(TipoDocumentoGeneral)jComboBoxid_tipo_documento_generalSecuencialUsuarioGenerico.getSelectedItem();
			}

			if(tipodocumentogeneralAux!=null && tipodocumentogeneralAux.getId()!=null) {
				secuencialusuario.setid_tipo_documento_general(tipodocumentogeneralAux.getId());
				secuencialusuario.settipodocumentogeneral_descripcion(SecuencialUsuarioConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneralAux));
				secuencialusuario.setTipoDocumentoGeneral(tipodocumentogeneralAux);			}
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

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
					}

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
					}

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
					}

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.addItem(usuario);
							}
						}

						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.addItem(usuario);
							}
						}

						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentoGeneralsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumentoGeneral=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.addItem(tipodocumentogeneral);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { 
					}

					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.addItem(tipodocumentogeneral);
							}
						}

						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.addItem(tipodocumentogeneral);
							}
						}

						if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDocumentoGeneralForeignKey(TipoDocumentoGeneral tipodocumentogeneral,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setSelectedItem(tipodocumentogeneral);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(tipodocumentogeneral);
						} else {
							this.jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setSelectedItem(tipodocumentogeneral);
						} else {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSecuencialUsuario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SecuencialUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesSecuencialUsuario(this.secuencialusuarioLogic.getSecuencialUsuarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SecuencialUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesSecuencialUsuario(this.secuencialusuarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(TipoDocumentoGeneral.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//secuencialusuarioLogic.setSecuencialUsuarios(this.secuencialusuarios);
			secuencialusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SecuencialUsuarioParameterReturnGeneral getSecuencialUsuarioParameterGeneral() {
		return this.secuencialusuarioParameterGeneral;
	}
	
	public void setSecuencialUsuarioParameterGeneral(SecuencialUsuarioParameterReturnGeneral secuencialusuarioParameterGeneral) {
		this.secuencialusuarioParameterGeneral = secuencialusuarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSecuencialUsuario() {
		return isPermisoTodoSecuencialUsuario;
	}

	public void setIsPermisoTodoSecuencialUsuario(Boolean isPermisoTodoSecuencialUsuario) {
		this.isPermisoTodoSecuencialUsuario = isPermisoTodoSecuencialUsuario;
	}

	public Boolean getIsPermisoNuevoSecuencialUsuario() {
		return isPermisoNuevoSecuencialUsuario;
	}

	public void setIsPermisoNuevoSecuencialUsuario(Boolean isPermisoNuevoSecuencialUsuario) {
		this.isPermisoNuevoSecuencialUsuario = isPermisoNuevoSecuencialUsuario;
	}

	public Boolean getIsPermisoActualizarSecuencialUsuario() {
		return isPermisoActualizarSecuencialUsuario;
	}

	public void setIsPermisoActualizarSecuencialUsuario(Boolean isPermisoActualizarSecuencialUsuario) {
		this.isPermisoActualizarSecuencialUsuario = isPermisoActualizarSecuencialUsuario;
	}

	public Boolean getIsPermisoEliminarSecuencialUsuario() {
		return isPermisoEliminarSecuencialUsuario;
	}

	public void setIsPermisoEliminarSecuencialUsuario(Boolean isPermisoEliminarSecuencialUsuario) {
		this.isPermisoEliminarSecuencialUsuario = isPermisoEliminarSecuencialUsuario;
	}

	public Boolean getIsPermisoGuardarCambiosSecuencialUsuario() {
		return isPermisoGuardarCambiosSecuencialUsuario;
	}

	public void setIsPermisoGuardarCambiosSecuencialUsuario(Boolean isPermisoGuardarCambiosSecuencialUsuario) {
		this.isPermisoGuardarCambiosSecuencialUsuario = isPermisoGuardarCambiosSecuencialUsuario;
	}
	
	public Boolean getIsPermisoConsultaSecuencialUsuario() {
		return isPermisoConsultaSecuencialUsuario;
	}

	public void setIsPermisoConsultaSecuencialUsuario(Boolean isPermisoConsultaSecuencialUsuario) {
		this.isPermisoConsultaSecuencialUsuario = isPermisoConsultaSecuencialUsuario;
	}

	public Boolean getIsPermisoBusquedaSecuencialUsuario() {
		return isPermisoBusquedaSecuencialUsuario;
	}

	public void setIsPermisoBusquedaSecuencialUsuario(Boolean isPermisoBusquedaSecuencialUsuario) {
		this.isPermisoBusquedaSecuencialUsuario = isPermisoBusquedaSecuencialUsuario;
	}

	public Boolean getIsPermisoReporteSecuencialUsuario() {
		return isPermisoReporteSecuencialUsuario;
	}

	public void setIsPermisoReporteSecuencialUsuario(Boolean isPermisoReporteSecuencialUsuario) {
		this.isPermisoReporteSecuencialUsuario = isPermisoReporteSecuencialUsuario;
	}
	
	public Boolean getIsPermisoPaginacionMedioSecuencialUsuario() {
		return isPermisoPaginacionMedioSecuencialUsuario;
	}

	public void setIsPermisoPaginacionMedioSecuencialUsuario(Boolean isPermisoPaginacionMedioSecuencialUsuario) {
		this.isPermisoPaginacionMedioSecuencialUsuario = isPermisoPaginacionMedioSecuencialUsuario;
	}
	
	public Boolean getIsPermisoPaginacionTodoSecuencialUsuario() {
		return isPermisoPaginacionTodoSecuencialUsuario;
	}

	public void setIsPermisoPaginacionTodoSecuencialUsuario(Boolean isPermisoPaginacionTodoSecuencialUsuario) {
		this.isPermisoPaginacionTodoSecuencialUsuario = isPermisoPaginacionTodoSecuencialUsuario;
	}
	
	public Boolean getIsPermisoPaginacionAltoSecuencialUsuario() {
		return isPermisoPaginacionAltoSecuencialUsuario;
	}

	public void setIsPermisoPaginacionAltoSecuencialUsuario(Boolean isPermisoPaginacionAltoSecuencialUsuario) {
		this.isPermisoPaginacionAltoSecuencialUsuario = isPermisoPaginacionAltoSecuencialUsuario;
	}
	
	public Boolean getIsPermisoCopiarSecuencialUsuario() {
		return isPermisoCopiarSecuencialUsuario;
	}

	public void setIsPermisoCopiarSecuencialUsuario(Boolean isPermisoCopiarSecuencialUsuario) {
		this.isPermisoCopiarSecuencialUsuario = isPermisoCopiarSecuencialUsuario;
	}
	
	public Boolean getIsPermisoVerFormSecuencialUsuario() {
		return isPermisoVerFormSecuencialUsuario;
	}

	public void setIsPermisoVerFormSecuencialUsuario(Boolean isPermisoVerFormSecuencialUsuario) {
		this.isPermisoVerFormSecuencialUsuario = isPermisoVerFormSecuencialUsuario;
	}
	
	public Boolean getIsPermisoDuplicarSecuencialUsuario() {
		return isPermisoDuplicarSecuencialUsuario;
	}

	public void setIsPermisoDuplicarSecuencialUsuario(Boolean isPermisoDuplicarSecuencialUsuario) {
		this.isPermisoDuplicarSecuencialUsuario = isPermisoDuplicarSecuencialUsuario;
	}
	
	public Boolean getIsPermisoOrdenSecuencialUsuario() {
		return isPermisoOrdenSecuencialUsuario;
	}

	public void setIsPermisoOrdenSecuencialUsuario(Boolean isPermisoOrdenSecuencialUsuario) {
		this.isPermisoOrdenSecuencialUsuario = isPermisoOrdenSecuencialUsuario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSecuencialUsuario() {
		return isVisibilidadCeldaNuevoSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaNuevoSecuencialUsuario(Boolean isVisibilidadCeldaNuevoSecuencialUsuario) {
		this.isVisibilidadCeldaNuevoSecuencialUsuario = isVisibilidadCeldaNuevoSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSecuencialUsuario() {
		return isVisibilidadCeldaDuplicarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaDuplicarSecuencialUsuario(Boolean isVisibilidadCeldaDuplicarSecuencialUsuario) {
		this.isVisibilidadCeldaDuplicarSecuencialUsuario = isVisibilidadCeldaDuplicarSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSecuencialUsuario() {
		return isVisibilidadCeldaCopiarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaCopiarSecuencialUsuario(Boolean isVisibilidadCeldaCopiarSecuencialUsuario) {
		this.isVisibilidadCeldaCopiarSecuencialUsuario = isVisibilidadCeldaCopiarSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSecuencialUsuario() {
		return isVisibilidadCeldaVerFormSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaVerFormSecuencialUsuario(Boolean isVisibilidadCeldaVerFormSecuencialUsuario) {
		this.isVisibilidadCeldaVerFormSecuencialUsuario = isVisibilidadCeldaVerFormSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSecuencialUsuario() {
		return isVisibilidadCeldaOrdenSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaOrdenSecuencialUsuario(Boolean isVisibilidadCeldaOrdenSecuencialUsuario) {
		this.isVisibilidadCeldaOrdenSecuencialUsuario = isVisibilidadCeldaOrdenSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSecuencialUsuario() {
		return isVisibilidadCeldaNuevoRelacionesSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSecuencialUsuario(Boolean isVisibilidadCeldaNuevoRelacionesSecuencialUsuario) {
		this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario = isVisibilidadCeldaNuevoRelacionesSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSecuencialUsuario() {
		return isVisibilidadCeldaModificarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaModificarSecuencialUsuario(Boolean isVisibilidadCeldaModificarSecuencialUsuario) {
		this.isVisibilidadCeldaModificarSecuencialUsuario = isVisibilidadCeldaModificarSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSecuencialUsuario() {
		return isVisibilidadCeldaActualizarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaActualizarSecuencialUsuario(Boolean isVisibilidadCeldaActualizarSecuencialUsuario) {
		this.isVisibilidadCeldaActualizarSecuencialUsuario = isVisibilidadCeldaActualizarSecuencialUsuario;
	}

	public Boolean getIsVisibilidadCeldaEliminarSecuencialUsuario() {
		return isVisibilidadCeldaEliminarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaEliminarSecuencialUsuario(Boolean isVisibilidadCeldaEliminarSecuencialUsuario) {
		this.isVisibilidadCeldaEliminarSecuencialUsuario = isVisibilidadCeldaEliminarSecuencialUsuario;
	}

	public Boolean getIsVisibilidadCeldaCancelarSecuencialUsuario() {
		return isVisibilidadCeldaCancelarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaCancelarSecuencialUsuario(Boolean isVisibilidadCeldaCancelarSecuencialUsuario) {
		this.isVisibilidadCeldaCancelarSecuencialUsuario = isVisibilidadCeldaCancelarSecuencialUsuario;
	}

	public Boolean getIsVisibilidadCeldaGuardarSecuencialUsuario() {
		return isVisibilidadCeldaGuardarSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaGuardarSecuencialUsuario(Boolean isVisibilidadCeldaGuardarSecuencialUsuario) {
		this.isVisibilidadCeldaGuardarSecuencialUsuario = isVisibilidadCeldaGuardarSecuencialUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSecuencialUsuario() {
		return isVisibilidadCeldaGuardarCambiosSecuencialUsuario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSecuencialUsuario(Boolean isVisibilidadCeldaGuardarCambiosSecuencialUsuario) {
		this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario = isVisibilidadCeldaGuardarCambiosSecuencialUsuario;
	}
		
	public SecuencialUsuarioSessionBean getsecuencialusuarioSessionBean() {
		return this.secuencialusuarioSessionBean;
	}
	
	public void setsecuencialusuarioSessionBean(SecuencialUsuarioSessionBean secuencialusuarioSessionBean) {
		this.secuencialusuarioSessionBean=secuencialusuarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorAutorizacion() {
		return this.isVisibilidadBusquedaPorAutorizacion;
	}

	public void setisVisibilidadBusquedaPorAutorizacion(Boolean isVisibilidadBusquedaPorAutorizacion) {
		this.isVisibilidadBusquedaPorAutorizacion=isVisibilidadBusquedaPorAutorizacion;
	}

	public Boolean getisVisibilidadBusquedaPorFechaFin() {
		return this.isVisibilidadBusquedaPorFechaFin;
	}

	public void setisVisibilidadBusquedaPorFechaFin(Boolean isVisibilidadBusquedaPorFechaFin) {
		this.isVisibilidadBusquedaPorFechaFin=isVisibilidadBusquedaPorFechaFin;
	}

	public Boolean getisVisibilidadBusquedaPorFechaInicio() {
		return this.isVisibilidadBusquedaPorFechaInicio;
	}

	public void setisVisibilidadBusquedaPorFechaInicio(Boolean isVisibilidadBusquedaPorFechaInicio) {
		this.isVisibilidadBusquedaPorFechaInicio=isVisibilidadBusquedaPorFechaInicio;
	}

	public Boolean getisVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral() {
		return this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral;
	}

	public void setisVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(Boolean isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {
		this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral;
	}

	public Boolean getisVisibilidadBusquedaPorSerie() {
		return this.isVisibilidadBusquedaPorSerie;
	}

	public void setisVisibilidadBusquedaPorSerie(Boolean isVisibilidadBusquedaPorSerie) {
		this.isVisibilidadBusquedaPorSerie=isVisibilidadBusquedaPorSerie;
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

	public Boolean getisVisibilidadFK_IdTipoDocumentoGeneral() {
		return this.isVisibilidadFK_IdTipoDocumentoGeneral;
	}

	public void setisVisibilidadFK_IdTipoDocumentoGeneral(Boolean isVisibilidadFK_IdTipoDocumentoGeneral) {
		this.isVisibilidadFK_IdTipoDocumentoGeneral=isVisibilidadFK_IdTipoDocumentoGeneral;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(SecuencialUsuario secuencialusuario)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(secuencialusuario,null);
				this.setActualParaGuardarSucursalForeignKey(secuencialusuario,null);
				this.setActualParaGuardarUsuarioForeignKey(secuencialusuario,null);
				this.setActualParaGuardarTipoDocumentoGeneralForeignKey(secuencialusuario,null);
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
	
	public void bugActualizarReferenciaActual(SecuencialUsuario secuencialusuario,SecuencialUsuario secuencialusuarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSecuencialUsuario(secuencialusuario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		secuencialusuarioAux.setId(secuencialusuario.getId());
		secuencialusuarioAux.setVersionRow(secuencialusuario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSecuencialUsuario();
		
			int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = secuencialusuarioValidator.getInvalidValues(this.secuencialusuario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			secuencialusuarioLogic.setDatosCliente(datosCliente);
			secuencialusuarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				secuencialusuarioAux=new  SecuencialUsuario();
				
				secuencialusuarioAux.setIsNew(true);
				secuencialusuarioAux.setIsChanged(true);
				
				secuencialusuarioAux.setSecuencialUsuarioOriginal(this.secuencialusuario);
				
				secuencialusuarioAux.setId(this.secuencialusuario.getId());	
				secuencialusuarioAux.setVersionRow(this.secuencialusuario.getVersionRow());	
				secuencialusuarioAux.setid_empresa(this.secuencialusuario.getid_empresa());	
				secuencialusuarioAux.setid_sucursal(this.secuencialusuario.getid_sucursal());	
				secuencialusuarioAux.setid_usuario(this.secuencialusuario.getid_usuario());	
				secuencialusuarioAux.setid_tipo_documento_general(this.secuencialusuario.getid_tipo_documento_general());	
				secuencialusuarioAux.setserie(this.secuencialusuario.getserie());	
				secuencialusuarioAux.setautorizacion(this.secuencialusuario.getautorizacion());	
				secuencialusuarioAux.setsecuencial(this.secuencialusuario.getsecuencial());	
				secuencialusuarioAux.setdigitos(this.secuencialusuario.getdigitos());	
				secuencialusuarioAux.setfecha_inicio(this.secuencialusuario.getfecha_inicio());	
				secuencialusuarioAux.setfecha_fin(this.secuencialusuario.getfecha_fin());	
				secuencialusuarioAux.setesta_activo(this.secuencialusuario.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(secuencialusuarioAux,secuencialusuarioLogic.getSecuencialUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialusuarioAux,secuencialusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.saveSecuencialUsuarios();//WithConnection
						//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.secuencialusuario,secuencialusuarioAux);
					
					this.refrescarForeignKeysDescripcionesSecuencialUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								secuencialusuarioLogic.saveSecuencialUsuarioRelaciones(secuencialusuarioAux);//WithConnection
								//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.secuencialusuario,secuencialusuarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(secuencialusuarioAux,secuencialusuarioLogic.getSecuencialUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(secuencialusuarioAux,secuencialusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.secuencialusuario,secuencialusuarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				secuencialusuarioAux=new  SecuencialUsuario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado() 
					|| (this.secuencialusuarioSessionBean.getEsGuardarRelacionado() && this.secuencialusuario.getId()>=0)) {
						
					secuencialusuarioAux.setIsNew(false);
				}
				
				secuencialusuarioAux.setIsDeleted(false);
			
				secuencialusuarioAux.setId(this.secuencialusuario.getId());	
				secuencialusuarioAux.setVersionRow(this.secuencialusuario.getVersionRow());	
				secuencialusuarioAux.setid_empresa(this.secuencialusuario.getid_empresa());	
				secuencialusuarioAux.setid_sucursal(this.secuencialusuario.getid_sucursal());	
				secuencialusuarioAux.setid_usuario(this.secuencialusuario.getid_usuario());	
				secuencialusuarioAux.setid_tipo_documento_general(this.secuencialusuario.getid_tipo_documento_general());	
				secuencialusuarioAux.setserie(this.secuencialusuario.getserie());	
				secuencialusuarioAux.setautorizacion(this.secuencialusuario.getautorizacion());	
				secuencialusuarioAux.setsecuencial(this.secuencialusuario.getsecuencial());	
				secuencialusuarioAux.setdigitos(this.secuencialusuario.getdigitos());	
				secuencialusuarioAux.setfecha_inicio(this.secuencialusuario.getfecha_inicio());	
				secuencialusuarioAux.setfecha_fin(this.secuencialusuario.getfecha_fin());	
				secuencialusuarioAux.setesta_activo(this.secuencialusuario.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(secuencialusuarioAux,secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialusuarioAux,secuencialusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.saveSecuencialUsuarios();//WithConnection
						//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.secuencialusuario,secuencialusuarioAux);
					
					this.refrescarForeignKeysDescripcionesSecuencialUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								secuencialusuarioLogic.saveSecuencialUsuarioRelaciones(secuencialusuarioAux);//WithConnection
								//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.secuencialusuario,secuencialusuarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(secuencialusuarioAux,secuencialusuarioLogic.getSecuencialUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(secuencialusuarioAux,secuencialusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.secuencialusuario,secuencialusuarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				secuencialusuarioAux=new  SecuencialUsuario();
				
				secuencialusuarioAux.setIsNew(false);
				secuencialusuarioAux.setIsChanged(false);
				
				secuencialusuarioAux.setIsDeleted(true);
				
				secuencialusuarioAux.setId(this.secuencialusuario.getId());	
				secuencialusuarioAux.setVersionRow(this.secuencialusuario.getVersionRow());	
				secuencialusuarioAux.setid_empresa(this.secuencialusuario.getid_empresa());	
				secuencialusuarioAux.setid_sucursal(this.secuencialusuario.getid_sucursal());	
				secuencialusuarioAux.setid_usuario(this.secuencialusuario.getid_usuario());	
				secuencialusuarioAux.setid_tipo_documento_general(this.secuencialusuario.getid_tipo_documento_general());	
				secuencialusuarioAux.setserie(this.secuencialusuario.getserie());	
				secuencialusuarioAux.setautorizacion(this.secuencialusuario.getautorizacion());	
				secuencialusuarioAux.setsecuencial(this.secuencialusuario.getsecuencial());	
				secuencialusuarioAux.setdigitos(this.secuencialusuario.getdigitos());	
				secuencialusuarioAux.setfecha_inicio(this.secuencialusuario.getfecha_inicio());	
				secuencialusuarioAux.setfecha_fin(this.secuencialusuario.getfecha_fin());	
				secuencialusuarioAux.setesta_activo(this.secuencialusuario.getesta_activo());	
				
				if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.secuencialusuarioAux.getId()>=0) {	
						this.secuencialusuariosEliminados.add(secuencialusuarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(secuencialusuarioAux,secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialusuarioAux,secuencialusuarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.saveSecuencialUsuarios();//WithConnection
						//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								secuencialusuarioLogic.saveSecuencialUsuarioRelaciones(secuencialusuarioAux);//WithConnection
								//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
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
							if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(secuencialusuarioAux,secuencialusuarioLogic.getSecuencialUsuarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(secuencialusuarioAux,secuencialusuarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getSecuencialUsuarios().addAll(this.secuencialusuariosEliminados);
					
					secuencialusuarioLogic.saveSecuencialUsuarios();//WithConnection
					//secuencialusuarioLogic.getSetVersionRowSecuencialUsuarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSecuencialUsuario();
				
				this.secuencialusuariosEliminados= new ArrayList<SecuencialUsuario>();		
			}
			
			if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Secuencial Usuario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.secuencialusuario=secuencialusuarioAux;
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
      		//this.finishProcessSecuencialUsuario();
      	}
		
	}	
	
	public void actualizarRelaciones(SecuencialUsuario secuencialusuarioLocal) throws Exception {
		
		if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SecuencialUsuario secuencialusuarioLocal) throws Exception {	
		if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				secuencialusuarioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				secuencialusuarioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				secuencialusuarioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoGeneralDetalleFormJInternalFrame.class)) {
				TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrameLocal=(TipoDocumentoGeneralBeanSwingJInternalFrame) ((TipoDocumentoGeneralDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentogeneralBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumentoGeneral(tipodocumentogeneralBeanSwingJInternalFrameLocal.gettipodocumentogeneral(),true);
				tipodocumentogeneralBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral,this.tipodocumentogeneralsForeignKey);

				tipodocumentogeneralBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral);

				secuencialusuarioLocal.setTipoDocumentoGeneral(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral);

				this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
				this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Formulario");
				this.setActualTipoDocumentoGeneralForeignKey(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSecuencialUsuarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = secuencialusuarioValidator.getInvalidValues(this.secuencialusuario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SecuencialUsuario secuencialusuario,List<SecuencialUsuario> secuencialusuarios) throws Exception {
		try	{		
			SecuencialUsuarioConstantesFunciones.actualizarLista(secuencialusuario,secuencialusuarios,this.secuencialusuarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SecuencialUsuario secuencialusuario,List<SecuencialUsuario> secuencialusuarios) throws Exception {
		try	{			
			SecuencialUsuarioConstantesFunciones.actualizarSelectedLista(secuencialusuario,secuencialusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SecuencialUsuario> secuencialusuariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				secuencialusuariosLocal=this.secuencialusuarioLogic.getSecuencialUsuarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				secuencialusuariosLocal=this.secuencialusuarios;
			}
			//ARCHITECTURE
		
			for(SecuencialUsuario secuencialusuarioLocal:secuencialusuariosLocal) {
				if(this.permiteMantenimiento(secuencialusuarioLocal) && secuencialusuarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SecuencialUsuarioConstantesFunciones.getSecuencialUsuarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_empresaSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_sucursalSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_usuarioSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.IDTIPODOCUMENTOGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_tipo_documento_generalSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelserieSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.AUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelautorizacionSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelsecuencialSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.DIGITOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabeldigitosSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelfecha_inicioSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelfecha_finSecuencialUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialUsuarioConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelesta_activoSecuencialUsuario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_empresaSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_sucursalSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_usuarioSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelid_tipo_documento_generalSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelserieSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelautorizacionSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelsecuencialSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabeldigitosSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelfecha_inicioSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelfecha_finSecuencialUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelesta_activoSecuencialUsuario,"");
		
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
		this.iIdNuevoSecuencialUsuario--;	
		
		
		this.secuencialusuarioAux=new SecuencialUsuario();
		
		this.secuencialusuarioAux.setId(this.iIdNuevoSecuencialUsuario);
		this.secuencialusuarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.secuencialusuarioLogic.getSecuencialUsuarios().add(this.secuencialusuarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.secuencialusuarios.add(this.secuencialusuarioAux);
		}
		//ARCHITECTURE
		
		this.secuencialusuario=this.secuencialusuarioAux;
		
		if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuario);
			this.setVariablesObjetoActualToFormularioForeignKeySecuencialUsuario(this.secuencialusuario);
		}
				
		//this.setDefaultControlesSecuencialUsuario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySecuencialUsuario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySecuencialUsuario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySecuencialUsuario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSecuencialUsuario(this.secuencialusuarioBean,this.secuencialusuario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
			classes=SecuencialUsuarioConstantesFunciones.getClassesRelationshipsOfSecuencialUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.secuencialusuarioReturnGeneral=secuencialusuarioLogic.procesarEventosSecuencialUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.secuencialusuarioLogic.getSecuencialUsuarios(),this.secuencialusuario,this.secuencialusuarioParameterGeneral,this.isEsNuevoSecuencialUsuario,classes);//this.secuencialusuarioLogic.getSecuencialUsuario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSecuencialUsuario(this.secuencialusuarioReturnGeneral,this.secuencialusuarioBean,false);
		
		if(this.secuencialusuarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario());
		}
		
		if(this.secuencialusuarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario(),classes);//this.secuencialusuarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySecuencialUsuario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySecuencialUsuario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.RecargarFormSecuencialUsuario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSecuencialUsuario(false);
						
			if(secuencialusuarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSecuencialUsuario();
			}
			
			this.actualizarVisualTableDatosSecuencialUsuario();
			
			this.jTableDatosSecuencialUsuario.setRowSelectionInterval(this.getIndiceNuevoSecuencialUsuario(), this.getIndiceNuevoSecuencialUsuario());
			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
						
			this.actualizarEstadoCeldasBotonesSecuencialUsuario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSecuencialUsuario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarserieSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarautorizacionSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarsecuencialSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activardigitosSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarfecha_inicioSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarfecha_finSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activaresta_activoSecuencialUsuario);	
		//
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarid_empresaSecuencialUsuario);//
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarid_sucursalSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarid_usuarioSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setEnabled(isHabilitar && this.secuencialusuarioConstantesFunciones.activarid_tipo_documento_generalSecuencialUsuario);
	};
	
	public void setDefaultControlesSecuencialUsuario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSecuencialUsuario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.secuencialusuarioSessionBean.setConGuardarRelaciones(true);			
			this.secuencialusuarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.setVisible(true);
			
					
		} else {
			//this.secuencialusuarioSessionBean.setConGuardarRelaciones(false);			
			this.secuencialusuarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSecuencialUsuario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
				if(secuencialusuarioAux.getId().equals(this.iIdNuevoSecuencialUsuario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarios) {
				if(secuencialusuarioAux.getId().equals(this.iIdNuevoSecuencialUsuario)) {
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
	
	public int getIndiceActualSecuencialUsuario(SecuencialUsuario secuencialusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
				if(secuencialusuarioAux.getId().equals(secuencialusuario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarios) {
				if(secuencialusuarioAux.getId().equals(secuencialusuario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSecuencialUsuario(SecuencialUsuario secuencialusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
				if(secuencialusuarioAux.getSecuencialUsuarioOriginal().getId().equals(secuencialusuarioOriginal.getId())) {
					existe=true;
					secuencialusuarioOriginal.setId(secuencialusuarioAux.getId());
					secuencialusuarioOriginal.setVersionRow(secuencialusuarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarios) {
				if(secuencialusuarioAux.getSecuencialUsuarioOriginal().getId().equals(secuencialusuarioOriginal.getId())) {
					existe=true;
					secuencialusuarioOriginal.setId(secuencialusuarioAux.getId());
					secuencialusuarioOriginal.setVersionRow(secuencialusuarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSecuencialUsuario(Boolean esParaCancelar) throws Exception {
		secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
		secuencialusuarioAux=new SecuencialUsuario();
		
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
					if(secuencialusuarioAux.getId()<0) {
						secuencialusuariosAux.add(secuencialusuarioAux);
					}		
				}
				this.iIdNuevoSecuencialUsuario=0L;
				this.secuencialusuarioLogic.getSecuencialUsuarios().removeAll(secuencialusuariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarios) {
					if(secuencialusuarioAux.getId()<0) {
						secuencialusuariosAux.add(secuencialusuarioAux);
					}		
				}
				this.iIdNuevoSecuencialUsuario=0L;
				this.secuencialusuarios.removeAll(secuencialusuariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSecuencialUsuario 
					&& this.secuencialusuarioLogic.getSecuencialUsuarios().size()>0
					) {
					secuencialusuarioAux=this.secuencialusuarioLogic.getSecuencialUsuarios().get(this.secuencialusuarioLogic.getSecuencialUsuarios().size() - 1);
				
					if(secuencialusuarioAux.getId()<0) {
						this.secuencialusuarioLogic.getSecuencialUsuarios().remove(secuencialusuarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSecuencialUsuario && this.secuencialusuarios.size()>0) {
					secuencialusuarioAux=this.secuencialusuarios.get(this.secuencialusuarios.size() - 1);
				
					if(secuencialusuarioAux.getId()<0) {
						this.secuencialusuarios.remove(secuencialusuarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSecuencialUsuario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(secuencialusuario.getId()<0) {
				this.secuencialusuarioLogic.getSecuencialUsuarios().remove(this.secuencialusuario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(secuencialusuario.getId()<0) {
				this.secuencialusuarios.remove(this.secuencialusuario);
			}
		}			
	}
	
	public void setEstadosInicialesSecuencialUsuario(List<SecuencialUsuario> secuencialusuariosAux) throws Exception {
		SecuencialUsuarioConstantesFunciones.setEstadosInicialesSecuencialUsuario(secuencialusuariosAux);
	}
	
	public void setEstadosInicialesSecuencialUsuario(SecuencialUsuario secuencialusuarioAux) throws Exception {
		SecuencialUsuarioConstantesFunciones.setEstadosInicialesSecuencialUsuario(secuencialusuarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSecuencialUsuarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSecuencialUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSecuencialUsuarioActual()) {
				if(!this.isEsNuevoSecuencialUsuario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSecuencialUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSecuencialUsuario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSecuencialUsuarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Secuencial Usuario ?", "MANTENIMIENTO DE Secuencial Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSecuencialUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SecuencialUsuario secuencialusuario) throws Exception {
		SecuencialUsuarioConstantesFunciones.seleccionarAsignar(this.secuencialusuario,secuencialusuario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSecuencialUsuario=this.isPermisoActualizarOriginalSecuencialUsuario;
			
			
			this.seleccionarAsignar(secuencialusuario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SecuencialUsuarioConstantesFunciones.quitarEspaciosSecuencialUsuario(this.secuencialusuario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSecuencialUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.secuencialusuarioSessionBean.setsFuncionBusquedaRapida(this.secuencialusuarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSecuencialUsuario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSecuencialUsuario(esParaCancelar);				
				this.cancelarNuevoSecuencialUsuario(esParaCancelar);								
			}
			
			this.secuencialusuario=new SecuencialUsuario();
			
			this.inicializarSecuencialUsuario();
			
			this.actualizarEstadoCeldasBotonesSecuencialUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSecuencialUsuario() throws Exception {
		try {
			SecuencialUsuarioConstantesFunciones.inicializarSecuencialUsuario(this.secuencialusuario);
			
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
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.secuencialusuarioLogic.getSecuencialUsuarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSecuencialUsuarios(String sAccionBusqueda,List<SecuencialUsuario> secuencialusuariosParaReportes) throws Exception {
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
					sPathReporteFinal="SecuencialUsuario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SecuencialUsuarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SecuencialUsuarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SecuencialUsuario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Secuencial Usuarios");		
		parameters.put("busquedapor", SecuencialUsuarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSecuencialUsuario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SecuencialUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SecuencialUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSecuencialUsuario=new JRBeanArrayDataSource(SecuencialUsuarioJInternalFrame.TraerSecuencialUsuarioBeans(secuencialusuariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSecuencialUsuario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SecuencialUsuarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SecuencialUsuarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SecuencialUsuarioBean.TraerSecuencialUsuarioBeans(secuencialusuariosParaReportes).toArray()));
							
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
				this.generarExcelReporteSecuencialUsuarios(sAccionBusqueda,sTipoArchivoReporte,secuencialusuariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSecuencialUsuarios(sAccionBusqueda,sTipoArchivoReporte,secuencialusuariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSecuencialUsuarioActionPerformed(null);
					//this.generarExcelReporteSecuencialUsuarios(sAccionBusqueda,sTipoArchivoReporte,secuencialusuariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSecuencialUsuarios(sAccionBusqueda,sTipoArchivoReporte,secuencialusuariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSecuencialUsuarios(sAccionBusqueda,sTipoArchivoReporte,secuencialusuariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSecuencialUsuarios(sAccionBusqueda,sTipoArchivoReporte,secuencialusuariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSecuencialUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<SecuencialUsuario> secuencialusuariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SecuencialUsuarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSecuencialUsuario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SecuencialUsuario secuencialusuario : secuencialusuariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SecuencialUsuarioConstantesFunciones.generarExcelReporteDataSecuencialUsuario("NORMAL",row,workbook,secuencialusuario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSecuencialUsuario(String sTipo,Row row,Workbook workbook) {
		
		SecuencialUsuarioConstantesFunciones.generarExcelReporteHeaderSecuencialUsuario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSecuencialUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<SecuencialUsuario> secuencialusuariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SecuencialUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SecuencialUsuario secuencialusuario : secuencialusuariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SecuencialUsuarioConstantesFunciones.getSecuencialUsuarioDescripcion(secuencialusuario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.gettipodocumentogeneral_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getserie());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getautorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getdigitos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencialusuario.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(secuencialusuario.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSecuencialUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<SecuencialUsuario> secuencialusuariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SecuencialUsuario> secuencialusuariosRespaldo=null;
		
		classes=SecuencialUsuarioConstantesFunciones.getClassesRelationshipsOfSecuencialUsuario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.secuencialusuarioLogic.setDatosCliente(this.datosCliente);
		this.secuencialusuarioLogic.setDatosDeep(this.datosDeep);
		this.secuencialusuarioLogic.setIsConDeep(true);
		
		secuencialusuariosRespaldo=this.secuencialusuarioLogic.getSecuencialUsuarios();
		
		this.secuencialusuarioLogic.setSecuencialUsuarios(secuencialusuariosParaReportes);	
		this.secuencialusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		secuencialusuariosParaReportes=this.secuencialusuarioLogic.getSecuencialUsuarios();
		this.secuencialusuarioLogic.setSecuencialUsuarios(secuencialusuariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SecuencialUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSecuencialUsuario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SecuencialUsuario secuencialusuario : secuencialusuariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSecuencialUsuario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SecuencialUsuarioConstantesFunciones.generarExcelReporteDataSecuencialUsuario("NORMAL",row,workbook,secuencialusuario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SecuencialUsuarioConstantesFunciones.getSecuencialUsuarioDescripcion(secuencialusuario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSecuencialUsuario() throws Exception {		
		this.startProcessSecuencialUsuario(true);
	}
	
	public void startProcessSecuencialUsuario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSecuencialUsuario ,this.jPanelParametrosReportesSecuencialUsuario, this.jScrollPanelDatosSecuencialUsuario,this.jPanelPaginacionSecuencialUsuario, this.jScrollPanelDatosEdicionSecuencialUsuario, this.jPanelAccionesSecuencialUsuario,this.jPanelAccionesFormularioSecuencialUsuario,this.jmenuBarSecuencialUsuario,this.jmenuBarDetalleSecuencialUsuario,this.jTtoolBarSecuencialUsuario,this.jTtoolBarDetalleSecuencialUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasSecuencialUsuario=this.jTabbedPaneBusquedasSecuencialUsuario; 
		
		final JPanel jPanelParametrosReportesSecuencialUsuario=this.jPanelParametrosReportesSecuencialUsuario;
		//final JScrollPane jScrollPanelDatosSecuencialUsuario=this.jScrollPanelDatosSecuencialUsuario;
		final JTable jTableDatosSecuencialUsuario=this.jTableDatosSecuencialUsuario;		
		final JPanel jPanelPaginacionSecuencialUsuario=this.jPanelPaginacionSecuencialUsuario;
		//final JScrollPane jScrollPanelDatosEdicionSecuencialUsuario=this.jScrollPanelDatosEdicionSecuencialUsuario;
		final JPanel jPanelAccionesSecuencialUsuario=this.jPanelAccionesSecuencialUsuario;
		
		JPanel jPanelCamposAuxiliarSecuencialUsuario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSecuencialUsuario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			jPanelCamposAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jPanelCamposSecuencialUsuario;
			jPanelAccionesFormularioAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jPanelAccionesFormularioSecuencialUsuario;
		}
		
		final JPanel jPanelCamposSecuencialUsuario=jPanelCamposAuxiliarSecuencialUsuario;
		final JPanel jPanelAccionesFormularioSecuencialUsuario=jPanelAccionesFormularioAuxiliarSecuencialUsuario;
		
		
		final JMenuBar jmenuBarSecuencialUsuario=this.jmenuBarSecuencialUsuario;
		final JToolBar jTtoolBarSecuencialUsuario=this.jTtoolBarSecuencialUsuario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSecuencialUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSecuencialUsuario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			jmenuBarDetalleAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jmenuBarDetalleSecuencialUsuario;
			jTtoolBarDetalleAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jTtoolBarDetalleSecuencialUsuario;
		}
		
		final JMenuBar jmenuBarDetalleSecuencialUsuario=jmenuBarDetalleAuxiliarSecuencialUsuario;
		final JToolBar jTtoolBarDetalleSecuencialUsuario=jTtoolBarDetalleAuxiliarSecuencialUsuario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSecuencialUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSecuencialUsuario;
			processRunnable.jTableDatos=jTableDatosSecuencialUsuario;
			processRunnable.jPanelCampos=jPanelCamposSecuencialUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionSecuencialUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesSecuencialUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSecuencialUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarSecuencialUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSecuencialUsuario;
			processRunnable.jTtoolBar=jTtoolBarSecuencialUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSecuencialUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSecuencialUsuario ,jPanelParametrosReportesSecuencialUsuario,jTableDatosSecuencialUsuario, /*jScrollPanelDatosSecuencialUsuario,*/jPanelCamposSecuencialUsuario,jPanelPaginacionSecuencialUsuario, /*jScrollPanelDatosEdicionSecuencialUsuario,*/ jPanelAccionesSecuencialUsuario,jPanelAccionesFormularioSecuencialUsuario,jmenuBarSecuencialUsuario,jmenuBarDetalleSecuencialUsuario,jTtoolBarSecuencialUsuario,jTtoolBarDetalleSecuencialUsuario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSecuencialUsuario ,jPanelParametrosReportesSecuencialUsuario, jScrollPanelDatosSecuencialUsuario,jPanelPaginacionSecuencialUsuario, jScrollPanelDatosEdicionSecuencialUsuario, jPanelAccionesSecuencialUsuario,jPanelAccionesFormularioSecuencialUsuario,jmenuBarSecuencialUsuario,jmenuBarDetalleSecuencialUsuario,jTtoolBarSecuencialUsuario,jTtoolBarDetalleSecuencialUsuario);
						
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
	
	public void finishProcessSecuencialUsuario() {// throws Exception 
		this.finishProcessSecuencialUsuario(true);
	}
	
	public void finishProcessSecuencialUsuario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSecuencialUsuario ,this.jPanelParametrosReportesSecuencialUsuario, this.jScrollPanelDatosSecuencialUsuario,this.jPanelPaginacionSecuencialUsuario, this.jScrollPanelDatosEdicionSecuencialUsuario, this.jPanelAccionesSecuencialUsuario,this.jPanelAccionesFormularioSecuencialUsuario,this.jmenuBarSecuencialUsuario,this.jmenuBarDetalleSecuencialUsuario,this.jTtoolBarSecuencialUsuario,this.jTtoolBarDetalleSecuencialUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasSecuencialUsuario=this.jTabbedPaneBusquedasSecuencialUsuario; 
		
		final JPanel jPanelParametrosReportesSecuencialUsuario=this.jPanelParametrosReportesSecuencialUsuario;
		//final JScrollPane jScrollPanelDatosSecuencialUsuario=this.jScrollPanelDatosSecuencialUsuario;
		final JTable jTableDatosSecuencialUsuario=this.jTableDatosSecuencialUsuario;		
		final JPanel jPanelPaginacionSecuencialUsuario=this.jPanelPaginacionSecuencialUsuario;
		//final JScrollPane jScrollPanelDatosEdicionSecuencialUsuario=this.jScrollPanelDatosEdicionSecuencialUsuario;
		final JPanel jPanelAccionesSecuencialUsuario=this.jPanelAccionesSecuencialUsuario;
		
		JPanel jPanelCamposAuxiliarSecuencialUsuario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSecuencialUsuario=new JPanel();
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			jPanelCamposAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jPanelCamposSecuencialUsuario;
			jPanelAccionesFormularioAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jPanelAccionesFormularioSecuencialUsuario;
		}
		
		final JPanel jPanelCamposSecuencialUsuario=jPanelCamposAuxiliarSecuencialUsuario;
		final JPanel jPanelAccionesFormularioSecuencialUsuario=jPanelAccionesFormularioAuxiliarSecuencialUsuario;
		
		
		final JMenuBar jmenuBarSecuencialUsuario=this.jmenuBarSecuencialUsuario;		
		final JToolBar jTtoolBarSecuencialUsuario=this.jTtoolBarSecuencialUsuario;
				
		JMenuBar jmenuBarDetalleAuxiliarSecuencialUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSecuencialUsuario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			jmenuBarDetalleAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jmenuBarDetalleSecuencialUsuario;
			jTtoolBarDetalleAuxiliarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jTtoolBarDetalleSecuencialUsuario;		
		}
		
		final JMenuBar jmenuBarDetalleSecuencialUsuario=jmenuBarDetalleAuxiliarSecuencialUsuario;
		final JToolBar jTtoolBarDetalleSecuencialUsuario=jTtoolBarDetalleAuxiliarSecuencialUsuario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSecuencialUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSecuencialUsuario;
			processRunnable.jTableDatos=jTableDatosSecuencialUsuario;
			processRunnable.jPanelCampos=jPanelCamposSecuencialUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionSecuencialUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesSecuencialUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSecuencialUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarSecuencialUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSecuencialUsuario;
			processRunnable.jTtoolBar=jTtoolBarSecuencialUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSecuencialUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSecuencialUsuario ,jPanelParametrosReportesSecuencialUsuario, jTableDatosSecuencialUsuario,/*jScrollPanelDatosSecuencialUsuario,*/jPanelCamposSecuencialUsuario,jPanelPaginacionSecuencialUsuario, /*jScrollPanelDatosEdicionSecuencialUsuario,*/ jPanelAccionesSecuencialUsuario,jPanelAccionesFormularioSecuencialUsuario,jmenuBarSecuencialUsuario,jmenuBarDetalleSecuencialUsuario,jTtoolBarSecuencialUsuario,jTtoolBarDetalleSecuencialUsuario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSecuencialUsuario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSecuencialUsuario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSecuencialUsuario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSecuencialUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSecuencialUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSecuencialUsuario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSecuencialUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSecuencialUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSecuencialUsuario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.secuencialusuarioConstantesFunciones.getsFinalQuerySecuencialUsuario();
		String  finalQueryPaginacionTodos=this.secuencialusuarioConstantesFunciones.getsFinalQuerySecuencialUsuario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SecuencialUsuarioConstantesFunciones.getArrayColumnasGlobalesNoSecuencialUsuario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SecuencialUsuarioConstantesFunciones.getArrayColumnasGlobalesSecuencialUsuario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SecuencialUsuarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.secuencialusuariosEliminados= new ArrayList<SecuencialUsuario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSecuencialUsuario();
		
				///*SecuencialUsuarioSessionBean*/this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
			
			if(this.secuencialusuarioSessionBean==null) {
				this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
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
					this.iNumeroPaginacion=SecuencialUsuarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SecuencialUsuarioConstantesFunciones.getClassesForeignKeysOfSecuencialUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/secuencialusuario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			secuencialusuariosAux= new ArrayList<SecuencialUsuario>();
			
				
			secuencialusuarioLogic.setDatosCliente(this.datosCliente);
			secuencialusuarioLogic.setDatosDeep(this.datosDeep);
			secuencialusuarioLogic.setIsConDeep(true);
			
			
			secuencialusuarioLogic.getSecuencialUsuarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					secuencialusuarioLogic.getTodosSecuencialUsuarios(finalQueryGlobal,pagination);
					
					//secuencialusuarioLogic.getTodosSecuencialUsuariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(secuencialusuarioLogic.getSecuencialUsuarios()==null|| secuencialusuarioLogic.getSecuencialUsuarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							secuencialusuariosAux= new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux= new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							secuencialusuarioLogic.getTodosSecuencialUsuarios(finalQueryGlobal+"",this.pagination);												
							
							//secuencialusuarioLogic.getTodosSecuencialUsuariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSecuencialUsuarios("Todos",secuencialusuarioLogic.getSecuencialUsuarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());					
							secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSecuencialUsuario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSecuencialUsuario=this.idActual;
				
				} else if(this.idSecuencialUsuarioActual!=null && this.idSecuencialUsuarioActual!=0L) {
					idSecuencialUsuario=idSecuencialUsuarioActual;
				}
				
					
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndicePorId(idSecuencialUsuario);
				
				this.secuencialusuarios=new ArrayList<SecuencialUsuario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					secuencialusuarioLogic.getEntity(idSecuencialUsuario);
					
					//secuencialusuarioLogic.getEntityWithConnection(idSecuencialUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
					secuencialusuarioLogic.getSecuencialUsuarios().add(secuencialusuarioLogic.getSecuencialUsuario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencialusuarios=new ArrayList<SecuencialUsuario>();
					this.secuencialusuarios.add(secuencialusuario);
				}
				
				if(secuencialusuarioLogic.getSecuencialUsuario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorAutorizacion")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorAutorizacion(autorizacionBusquedaPorAutorizacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorAutorizacion(finalQueryGlobal,pagination,autorizacionBusquedaPorAutorizacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorAutorizacion(autorizacionBusquedaPorAutorizacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorAutorizacion(autorizacionBusquedaPorAutorizacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorAutorizacion(finalQueryGlobal,pagination,autorizacionBusquedaPorAutorizacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorAutorizacion(autorizacionBusquedaPorAutorizacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorAutorizacion(autorizacionBusquedaPorAutorizacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("BusquedaPorAutorizacion",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("BusquedaPorAutorizacion",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaFin")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorFechaFin(finalQueryGlobal,pagination,fecha_finBusquedaPorFechaFin);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorFechaFin(finalQueryGlobal,pagination,fecha_finBusquedaPorFechaFin);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaFin(fecha_finBusquedaPorFechaFin);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("BusquedaPorFechaFin",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("BusquedaPorFechaFin",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaInicio")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorFechaInicio(finalQueryGlobal,pagination,fecha_inicioBusquedaPorFechaInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorFechaInicio(finalQueryGlobal,pagination,fecha_inicioBusquedaPorFechaInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorFechaInicio(fecha_inicioBusquedaPorFechaInicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("BusquedaPorFechaInicio",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("BusquedaPorFechaInicio",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral,id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSerie")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorSerie(serieBusquedaPorSerie);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorSerie(finalQueryGlobal,pagination,serieBusquedaPorSerie);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorSerie(serieBusquedaPorSerie);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorSerie(serieBusquedaPorSerie);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorSerie(finalQueryGlobal,pagination,serieBusquedaPorSerie);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorSerie(serieBusquedaPorSerie);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceBusquedaPorSerie(serieBusquedaPorSerie);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("BusquedaPorSerie",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("BusquedaPorSerie",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("FK_IdEmpresa",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("FK_IdEmpresa",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("FK_IdSucursal",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("FK_IdSucursal",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoDocumentoGeneral")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosFK_IdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosFK_IdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("FK_IdTipoDocumentoGeneral",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("FK_IdTipoDocumentoGeneral",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialusuarioLogic.getSecuencialUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios()==null||secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencialusuarios==null|| secuencialusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
						secuencialusuariosAux.addAll(secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuariosAux=new ArrayList<SecuencialUsuario>();
							secuencialusuariosAux.addAll(secuencialusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialusuarioLogic.getSecuencialUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencialUsuarios("FK_IdUsuario",secuencialusuarioLogic.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencialUsuarios("FK_IdUsuario",secuencialusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioLogic.setSecuencialUsuarios(new ArrayList<SecuencialUsuario>());
						secuencialusuarioLogic.getSecuencialUsuarios().addAll(secuencialusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarios=new ArrayList<SecuencialUsuario>();
							secuencialusuarios.addAll(secuencialusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSecuencialUsuario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSecuencialUsuario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=secuencialusuarioLogic.getSecuencialUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=secuencialusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=secuencialusuarioLogic.getSecuencialUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=secuencialusuarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SecuencialUsuario secuencialusuario) {
		Boolean permite=true;
		
		if(this.secuencialusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SecuencialUsuarioConstantesFunciones.getOrderByListaSecuencialUsuario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SecuencialUsuarioConstantesFunciones.getOrderByListaSecuencialUsuario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SecuencialUsuario secuencialusuario:secuencialusuarioLogic.getSecuencialUsuarios()) {
				if(secuencialusuario.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialusuarioTotales=secuencialusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SecuencialUsuario secuencialusuario:this.secuencialusuarios) {
				if(secuencialusuario.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialusuarioTotales=secuencialusuario;
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
			this.secuencialusuarioAux=new SecuencialUsuario();
			this.secuencialusuarioAux.setsType(Constantes2.S_TOTALES);
			this.secuencialusuarioAux.setIsNew(false);
			this.secuencialusuarioAux.setIsChanged(false);
			this.secuencialusuarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SecuencialUsuarioConstantesFunciones.TotalizarValoresFilaSecuencialUsuario(this.secuencialusuarioLogic.getSecuencialUsuarios(),this.secuencialusuarioAux);
				
				this.secuencialusuarioLogic.getSecuencialUsuarios().add(this.secuencialusuarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SecuencialUsuarioConstantesFunciones.TotalizarValoresFilaSecuencialUsuario(this.secuencialusuarios,this.secuencialusuarioAux);
				
				this.secuencialusuarios.add(this.secuencialusuarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		secuencialusuarioTotales=new SecuencialUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.secuencialusuarioLogic.getSecuencialUsuarios().remove(secuencialusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.secuencialusuarios.remove(secuencialusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		secuencialusuarioTotales=new SecuencialUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SecuencialUsuario secuencialusuario:secuencialusuarioLogic.getSecuencialUsuarios()) {
				if(secuencialusuario.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialusuarioTotales=secuencialusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SecuencialUsuarioConstantesFunciones.TotalizarValoresFilaSecuencialUsuario(this.secuencialusuarioLogic.getSecuencialUsuarios(),secuencialusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SecuencialUsuario secuencialusuario:this.secuencialusuarios) {
				if(secuencialusuario.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialusuarioTotales=secuencialusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SecuencialUsuarioConstantesFunciones.TotalizarValoresFilaSecuencialUsuario(this.secuencialusuarios,secuencialusuarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSecuencialUsuariosBusquedaPorAutorizacion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorAutorizacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosBusquedaPorFechaFin()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaFin";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosBusquedaPorFechaInicio()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaInicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosBusquedaPorSerie()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSerie";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosFK_IdTipoDocumentoGeneral()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumentoGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuariosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialUsuarioPorEmpresaPorSucursalPorUsuarioPorDocu()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorSucursalPorUsuarioPorDocu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getSecuencialUsuariosBusquedaPorAutorizacion(String sFinalQuery,String autorizacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorAutorizacion(sFinalQuery,this.pagination,autorizacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosBusquedaPorFechaFin(String sFinalQuery,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorFechaFin(sFinalQuery,this.pagination,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosBusquedaPorFechaInicio(String sFinalQuery,Date fecha_inicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorFechaInicio(sFinalQuery,this.pagination,fecha_inicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(String sFinalQuery,Long id_usuario,Long id_tipo_documento_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(sFinalQuery,this.pagination,id_usuario,id_tipo_documento_general);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosBusquedaPorSerie(String sFinalQuery,String serie)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosBusquedaPorSerie(sFinalQuery,this.pagination,serie);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosFK_IdTipoDocumentoGeneral(String sFinalQuery,Long id_tipo_documento_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosFK_IdTipoDocumentoGeneral(sFinalQuery,this.pagination,id_tipo_documento_general);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuariosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuariosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialUsuarioPorEmpresaPorSucursalPorUsuarioPorDocu(Long id_empresa,Long id_sucursal,Long id_usuario,Long id_tipo_documento_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLogic.getSecuencialUsuarioPorEmpresaPorSucursalPorUsuarioPorDocu(id_empresa,id_sucursal,id_usuario,id_tipo_documento_general);
				
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
	
	public void inicializarPermisosSecuencialUsuario() {
		this.isPermisoTodoSecuencialUsuario=false;
		this.isPermisoNuevoSecuencialUsuario=false;
		this.isPermisoActualizarSecuencialUsuario=false;
		this.isPermisoActualizarOriginalSecuencialUsuario=false;
		this.isPermisoEliminarSecuencialUsuario=false;
		this.isPermisoGuardarCambiosSecuencialUsuario=false;
		this.isPermisoConsultaSecuencialUsuario=false;
		this.isPermisoBusquedaSecuencialUsuario=false;
		this.isPermisoReporteSecuencialUsuario=false;		
		this.isPermisoOrdenSecuencialUsuario=false;		
		this.isPermisoPaginacionMedioSecuencialUsuario=false;		
		this.isPermisoPaginacionAltoSecuencialUsuario=false;
		this.isPermisoPaginacionTodoSecuencialUsuario=false;
		this.isPermisoCopiarSecuencialUsuario=false;		
		this.isPermisoVerFormSecuencialUsuario=false;		
		this.isPermisoDuplicarSecuencialUsuario=false;		
		this.isPermisoOrdenSecuencialUsuario=false;		
	}
	
	public void setPermisosUsuarioSecuencialUsuario(Boolean isPermiso) {
		this.isPermisoTodoSecuencialUsuario=isPermiso;
		this.isPermisoNuevoSecuencialUsuario=isPermiso;
		this.isPermisoActualizarSecuencialUsuario=isPermiso;
		this.isPermisoActualizarOriginalSecuencialUsuario=isPermiso;
		this.isPermisoEliminarSecuencialUsuario=isPermiso;
		this.isPermisoGuardarCambiosSecuencialUsuario=isPermiso;
		this.isPermisoConsultaSecuencialUsuario=isPermiso;
		this.isPermisoBusquedaSecuencialUsuario=isPermiso;
		this.isPermisoReporteSecuencialUsuario=isPermiso;
		this.isPermisoOrdenSecuencialUsuario=isPermiso;		
		this.isPermisoPaginacionMedioSecuencialUsuario=isPermiso;		
		this.isPermisoPaginacionAltoSecuencialUsuario=isPermiso;		
		this.isPermisoPaginacionTodoSecuencialUsuario=isPermiso;		
		this.isPermisoCopiarSecuencialUsuario=isPermiso;		
		this.isPermisoVerFormSecuencialUsuario=isPermiso;		
		this.isPermisoDuplicarSecuencialUsuario=isPermiso;
		this.isPermisoOrdenSecuencialUsuario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSecuencialUsuario(Boolean isPermiso) {
		//this.isPermisoTodoSecuencialUsuario=isPermiso;
		this.isPermisoNuevoSecuencialUsuario=isPermiso;
		this.isPermisoActualizarSecuencialUsuario=isPermiso;
		this.isPermisoActualizarOriginalSecuencialUsuario=isPermiso;
		this.isPermisoEliminarSecuencialUsuario=isPermiso;
		this.isPermisoGuardarCambiosSecuencialUsuario=isPermiso;
		//this.isPermisoConsultaSecuencialUsuario=isPermiso;
		//this.isPermisoBusquedaSecuencialUsuario=isPermiso;
		//this.isPermisoReporteSecuencialUsuario=isPermiso;
		//this.isPermisoOrdenSecuencialUsuario=isPermiso;		
		//this.isPermisoPaginacionMedioSecuencialUsuario=isPermiso;		
		//this.isPermisoPaginacionAltoSecuencialUsuario=isPermiso;		
		//this.isPermisoPaginacionTodoSecuencialUsuario=isPermiso;		
		//this.isPermisoCopiarSecuencialUsuario=isPermiso;		
		//this.isPermisoDuplicarSecuencialUsuario=isPermiso;
		//this.isPermisoOrdenSecuencialUsuario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSecuencialUsuarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SecuencialUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSecuencialUsuario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSecuencialUsuarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSecuencialUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSecuencialUsuarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSecuencialUsuarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSecuencialUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SecuencialUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SecuencialUsuarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSecuencialUsuario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSecuencialUsuario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSecuencialUsuario=this.isPermisoActualizarSecuencialUsuario;
			this.isPermisoEliminarSecuencialUsuario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSecuencialUsuario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSecuencialUsuario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSecuencialUsuario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSecuencialUsuario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSecuencialUsuario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSecuencialUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSecuencialUsuario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSecuencialUsuario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSecuencialUsuario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSecuencialUsuario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSecuencialUsuario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSecuencialUsuario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSecuencialUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSecuencialUsuario.setToolTipText(this.jTableDatosSecuencialUsuario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSecuencialUsuario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSecuencialUsuario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SecuencialUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SecuencialUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSecuencialUsuario() throws Exception {
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
	public void inicializarCombosForeignKeySecuencialUsuarioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.tipodocumentogeneralsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySecuencialUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SecuencialUsuarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySecuencialUsuarioListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoDocumentoGeneralListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentogeneralsForeignKey==null||this.tipodocumentogeneralsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoGeneralConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySecuencialUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SecuencialUsuarioParameterReturnGeneral secuencialusuarioReturnGeneral=new SecuencialUsuarioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.secuencialusuarioConstantesFunciones.cargarid_empresaSecuencialUsuario)
					 || (this.esRecargarFks && this.secuencialusuarioConstantesFunciones.cargarid_empresaSecuencialUsuario)) {

					if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+secuencialusuarioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.secuencialusuarioConstantesFunciones.cargarid_sucursalSecuencialUsuario)
					 || (this.esRecargarFks && this.secuencialusuarioConstantesFunciones.cargarid_sucursalSecuencialUsuario)) {

					if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+secuencialusuarioSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.secuencialusuarioConstantesFunciones.cargarid_usuarioSecuencialUsuario)
					 || (this.esRecargarFks && this.secuencialusuarioConstantesFunciones.cargarid_usuarioSecuencialUsuario)) {

					if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+secuencialusuarioSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalTipoDocumentoGeneral="";

				if(((this.tipodocumentogeneralsForeignKey==null||this.tipodocumentogeneralsForeignKey.size()<=0) && this.secuencialusuarioConstantesFunciones.cargarid_tipo_documento_generalSecuencialUsuario)
					 || (this.esRecargarFks && this.secuencialusuarioConstantesFunciones.cargarid_tipo_documento_generalSecuencialUsuario)) {

					if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDocumentoGeneral=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDocumentoGeneral=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDocumentoGeneral, "");
						finalQueryGlobalTipoDocumentoGeneral+=TipoDocumentoGeneralConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDocumentoGeneral=" WHERE " + ConstantesSql.ID + "="+secuencialusuarioSessionBean.getlidTipoDocumentoGeneralActual();
					}
				} else {
					finalQueryGlobalTipoDocumentoGeneral="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				secuencialusuarioReturnGeneral=secuencialusuarioLogic.cargarCombosLoteForeignKeySecuencialUsuario(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalTipoDocumentoGeneral);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=secuencialusuarioReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=secuencialusuarioReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=secuencialusuarioReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalTipoDocumentoGeneral.equals("NONE")) {
				this.tipodocumentogeneralsForeignKey=secuencialusuarioReturnGeneral.gettipodocumentogeneralsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySecuencialUsuario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.secuencialusuarioSessionBean==null) {
				this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
			}

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyTipoDocumentoGeneral()throws Exception {
		try {

			if(!this.secuencialusuarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {
				TipoDocumentoGeneral tipodocumentogeneral=new TipoDocumentoGeneral();
				TipoDocumentoGeneralConstantesFunciones.setTipoDocumentoGeneralDescripcion(tipodocumentogeneral,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumentogeneral.setId(null);

				if(!TipoDocumentoGeneralConstantesFunciones.ExisteEnLista(this.tipodocumentogeneralsForeignKey,tipodocumentogeneral,true)) {

					this.tipodocumentogeneralsForeignKey.add(0,tipodocumentogeneral);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySecuencialUsuario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySecuencialUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySecuencialUsuario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.secuencialusuario.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.secuencialusuario.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySecuencialUsuario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySecuencialUsuario(SecuencialUsuario secuencialusuario)throws Exception {	
		try {
			
			this.setActualTipoDocumentoGeneralForeignKey(secuencialusuario.getid_tipo_documento_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySecuencialUsuario(SecuencialUsuario secuencialusuario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySecuencialUsuario()throws Exception {	
		try {
			
			this.setActualTipoDocumentoGeneralForeignKey(this.secuencialusuarioConstantesFunciones.getid_tipo_documento_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySecuencialUsuario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySecuencialUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySecuencialUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSecuencialUsuario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySecuencialUsuario()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySecuencialUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentoGeneralsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySecuencialUsuario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public SecuencialUsuarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SecuencialUsuarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SecuencialUsuarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean(); 
		this.secuencialusuarioConstantesFunciones=new SecuencialUsuarioConstantesFunciones(); 
		this.secuencialusuarioBean=new SecuencialUsuario();//(this.secuencialusuarioConstantesFunciones); 		
		this.secuencialusuarioReturnGeneral=new SecuencialUsuarioParameterReturnGeneral(); 
		
		this.secuencialusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.secuencialusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SecuencialUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SecuencialUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SecuencialUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSecuencialUsuario(true);
			
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
			
			this.secuencialusuarioConstantesFunciones=new SecuencialUsuarioConstantesFunciones(); 
			this.secuencialusuarioBean=new SecuencialUsuario();//this.secuencialusuarioConstantesFunciones); 			
			this.secuencialusuarioReturnGeneral=new SecuencialUsuarioParameterReturnGeneral(); 
		
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Secuencial Usuario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.secuencialusuario=new SecuencialUsuario();
			this.secuencialusuarios = new ArrayList<SecuencialUsuario>();
			this.secuencialusuariosAux = new ArrayList<SecuencialUsuario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic=new SecuencialUsuarioLogic();
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.secuencialusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.secuencialusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSecuencialUsuario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSecuencialUsuario);	
					}
					
					if(this.jInternalFrameImportacionSecuencialUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSecuencialUsuario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySecuencialUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySecuencialUsuario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSecuencialUsuario);
				this.jInternalFrameDetalleFormSecuencialUsuario.setVisible(false);
				this.jInternalFrameDetalleFormSecuencialUsuario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSecuencialUsuario);
					this.jInternalFrameReporteDinamicoSecuencialUsuario.setVisible(false);
					this.jInternalFrameReporteDinamicoSecuencialUsuario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSecuencialUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSecuencialUsuario);
					this.jInternalFrameImportacionSecuencialUsuario.setVisible(false);
					this.jInternalFrameImportacionSecuencialUsuario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySecuencialUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySecuencialUsuario);
					this.jInternalFrameOrderBySecuencialUsuario.setVisible(false);
					this.jInternalFrameOrderBySecuencialUsuario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSecuencialUsuarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SecuencialUsuarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.secuencialusuarioReturnGeneral=new SecuencialUsuarioParameterReturnGeneral();
			
			this.secuencialusuarioParameterGeneral=new SecuencialUsuarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.secuencialusuarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SecuencialUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SecuencialUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.secuencialusuarioSessionBean.getEsGuardarRelacionado(),this.secuencialusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SecuencialUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.secuencialusuarioSessionBean.getEsGuardarRelacionado(),this.secuencialusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaDuplicarSecuencialUsuario=true;
			this.isVisibilidadCeldaCopiarSecuencialUsuario=true;
			this.isVisibilidadCeldaVerFormSecuencialUsuario=true;
			this.isVisibilidadCeldaOrdenSecuencialUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
			this.isVisibilidadCeldaModificarSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=false;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
			
			
			this.isVisibilidadBusquedaPorAutorizacion=true;
			this.isVisibilidadBusquedaPorFechaFin=true;
			this.isVisibilidadBusquedaPorFechaInicio=true;
			this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=true;
			this.isVisibilidadBusquedaPorSerie=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDocumentoGeneral=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSecuencialUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSecuencialUsuario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSecuencialUsuario(false);
			
			this.setPermisosUsuarioSecuencialUsuario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado() 
				|| (this.secuencialusuarioSessionBean.getEsGuardarRelacionado() && this.secuencialusuarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSecuencialUsuarioClasesRelacionadas();
			}
			
			if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSecuencialUsuarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSecuencialUsuario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSecuencialUsuario();
			}
			
			if(!this.isPermisoBusquedaSecuencialUsuario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSecuencialUsuario,this.isPermisoPaginacionMedioSecuencialUsuario,this.isPermisoPaginacionTodoSecuencialUsuario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SecuencialUsuarioConstantesFunciones.getTiposSeleccionarSecuencialUsuario());
				
				this.tiposColumnasSelect=SecuencialUsuarioConstantesFunciones.getTiposSeleccionarSecuencialUsuario(true);
				
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
			//if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSecuencialUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSecuencialUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSecuencialUsuario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSecuencialUsuario() ;
			
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
			this.tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				secuencialusuarioImplementable= (SecuencialUsuarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SecuencialUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				secuencialusuarioImplementableHome= (SecuencialUsuarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SecuencialUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.secuencialusuarios= new ArrayList<SecuencialUsuario>();
			this.secuencialusuariosEliminados= new ArrayList<SecuencialUsuario>();
						
			this.isEsNuevoSecuencialUsuario=false;
			this.esParaAccionDesdeFormularioSecuencialUsuario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySecuencialUsuario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSecuencialUsuario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SecuencialUsuarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSecuencialUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSecuencialUsuario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSecuencialUsuario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSecuencialUsuario();
			}
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSecuencialUsuario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSecuencialUsuario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SecuencialUsuario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSecuencialUsuario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSecuencialUsuario")) {
				iIndex=this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSecuencialUsuario();	
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
	
	public void cargarCombosForeignKeySecuencialUsuario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySecuencialUsuario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySecuencialUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySecuencialUsuarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySecuencialUsuario();
		
		this.cargarCombosFrameForeignKeySecuencialUsuario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySecuencialUsuario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySecuencialUsuario();
		}
	}
	
	

	public void cargarCombosForeignKeyUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUsuario(this.usuariosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDocumentoGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
				this.cargarCombosFrameTipoDocumentoGeneralsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumentoGeneral(this.tipodocumentogeneralsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSecuencialUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			
			if(jTableDatosSecuencialUsuario.getRowCount()>=1) {
				jTableDatosSecuencialUsuario.removeRowSelectionInterval(0, jTableDatosSecuencialUsuario.getRowCount()-1);						
			}
			
			this.isEsNuevoSecuencialUsuario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSecuencialUsuario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSecuencialUsuario(true);			
			//this.secuencialusuario=new SecuencialUsuario();
			//this.secuencialusuario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSecuencialUsuario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencialUsuario() ;
			
			if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSecuencialUsuario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.secuencialusuario);	
			this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);				
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SecuencialUsuario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSecuencialUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSecuencialUsuario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSecuencialUsuario.getSelectedRows().length;			
			}
			
			secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSecuencialUsuario--;			
				//SecuencialUsuario secuencialusuarioAux= new SecuencialUsuario();			
				//secuencialusuarioAux.setId(this.iIdNuevoSecuencialUsuario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SecuencialUsuario secuencialusuarioOrigen=new SecuencialUsuario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SecuencialUsuario secuencialusuarioOrigen : secuencialusuariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							secuencialusuarioOrigen =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialusuarioOrigen =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSecuencialUsuario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.secuencialusuario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSecuencialUsuario(secuencialusuarioOrigen,this.secuencialusuario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.secuencialusuarioLogic.getSecuencialUsuarios().add(this.secuencialusuarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.secuencialusuarios.add(this.secuencialusuarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
				
				this.jTableDatosSecuencialUsuario.setRowSelectionInterval(this.getIndiceNuevoSecuencialUsuario(), this.getIndiceNuevoSecuencialUsuario());
				
				int iLastRow =  this.jTableDatosSecuencialUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSecuencialUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSecuencialUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSecuencialUsuario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();									
		
			SecuencialUsuario secuencialusuarioOrigen=new SecuencialUsuario();
			SecuencialUsuario secuencialusuarioDestino=new SecuencialUsuario();
				
			secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSecuencialUsuario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || secuencialusuariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSecuencialUsuario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioOrigen =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						secuencialusuarioOrigen =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialusuarioDestino =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						secuencialusuarioDestino =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				secuencialusuarioOrigen =secuencialusuariosSeleccionados.get(0);
				secuencialusuarioDestino =secuencialusuariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSecuencialUsuario(secuencialusuarioOrigen,secuencialusuarioDestino,true,false);
				
				secuencialusuarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(secuencialusuarioDestino,secuencialusuarioLogic.getSecuencialUsuarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialusuarioDestino,secuencialusuarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
				
				//this.jTableDatosSecuencialUsuario.setRowSelectionInterval(this.getIndiceNuevoSecuencialUsuario(), this.getIndiceNuevoSecuencialUsuario());
				
				int iLastRow =  this.jTableDatosSecuencialUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSecuencialUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSecuencialUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSecuencialUsuario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSecuencialUsuario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSecuencialUsuario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSecuencialUsuario.setVisible(!isVisible);
			this.jPanelPaginacionSecuencialUsuario.setVisible(!isVisible);
			this.jPanelAccionesSecuencialUsuario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSecuencialUsuario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSecuencialUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSecuencialUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySecuencialUsuario();
			
			this.abrirFrameOrderBySecuencialUsuario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySecuencialUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSecuencialUsuario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSecuencialUsuario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSecuencialUsuario.isMaximum()) {
					this.jInternalFrameDetalleFormSecuencialUsuario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSecuencialUsuario.setSize(this.jInternalFrameDetalleFormSecuencialUsuario.iWidthFormulario,this.jInternalFrameDetalleFormSecuencialUsuario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSecuencialUsuario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSecuencialUsuario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSecuencialUsuario.isMaximum()) {
						this.jInternalFrameDetalleFormSecuencialUsuario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSecuencialUsuario.jContentPaneDetalleSecuencialUsuario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSecuencialUsuario.jContentPaneDetalleSecuencialUsuario.getWidth(),SecuencialUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSecuencialUsuario.jContentPaneDetalleSecuencialUsuario.getWidth(),SecuencialUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSecuencialUsuario.jContentPaneDetalleSecuencialUsuario.getWidth(),SecuencialUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSecuencialUsuario.setVisible(true);
	        this.jInternalFrameDetalleFormSecuencialUsuario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySecuencialUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySecuencialUsuario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySecuencialUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencialUsuario,false,this);
				} else {
					this.jInternalFrameOrderBySecuencialUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencialUsuario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySecuencialUsuario);
				this.jInternalFrameOrderBySecuencialUsuario.setVisible(false);
				this.jInternalFrameOrderBySecuencialUsuario.setSelected(false);
				
				this.jInternalFrameOrderBySecuencialUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySecuencialUsuario"));
				
				this.inicializarActualizarBindingTablaOrderBySecuencialUsuario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSecuencialUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSecuencialUsuario==null) {
				
				this.jInternalFrameImportacionSecuencialUsuario=new ImportacionJInternalFrame(SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSecuencialUsuario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSecuencialUsuario);
				this.jInternalFrameImportacionSecuencialUsuario.setVisible(false);
				this.jInternalFrameImportacionSecuencialUsuario.setSelected(false);


				this.jInternalFrameImportacionSecuencialUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSecuencialUsuario"));
				this.jInternalFrameImportacionSecuencialUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSecuencialUsuario"));
				this.jInternalFrameImportacionSecuencialUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSecuencialUsuario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSecuencialUsuario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSecuencialUsuario==null) {
				this.jInternalFrameReporteDinamicoSecuencialUsuario=new ReporteDinamicoJInternalFrame(SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSecuencialUsuario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSecuencialUsuario);
				this.jInternalFrameReporteDinamicoSecuencialUsuario.setVisible(false);
				this.jInternalFrameReporteDinamicoSecuencialUsuario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSecuencialUsuario"));
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSecuencialUsuario"));
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSecuencialUsuario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSecuencialUsuario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSecuencialUsuario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSecuencialUsuario);
			
	       	this.jInternalFrameDetalleFormSecuencialUsuario.setVisible(false);
	        this.jInternalFrameDetalleFormSecuencialUsuario.setSelected(false);
			
			//this.jInternalFrameDetalleFormSecuencialUsuario.dispose();
			//this.jInternalFrameDetalleFormSecuencialUsuario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSecuencialUsuario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSecuencialUsuario.setVisible(true);
	        this.jInternalFrameReporteDinamicoSecuencialUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSecuencialUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSecuencialUsuario.setVisible(true);
	        this.jInternalFrameImportacionSecuencialUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySecuencialUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySecuencialUsuario.setVisible(true);
	        this.jInternalFrameOrderBySecuencialUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySecuencialUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySecuencialUsuario.setVisible(false);
	        this.jInternalFrameOrderBySecuencialUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSecuencialUsuario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSecuencialUsuario.setVisible(false);
	        this.jInternalFrameReporteDinamicoSecuencialUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSecuencialUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSecuencialUsuario.setVisible(false);
	        this.jInternalFrameImportacionSecuencialUsuario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSecuencialUsuario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSecuencialUsuario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSecuencialUsuario(true);
			//this.isEsNuevoSecuencialUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSecuencialUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSecuencialUsuario(false) ;
			
			if(secuencialusuarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSecuencialUsuario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencialUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSecuencialUsuarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSecuencialUsuario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSecuencialUsuario(true);
			//this.isEsNuevoSecuencialUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.secuencialusuario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSecuencialUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSecuencialUsuario(false) ;
			
			if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSecuencialUsuario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencialUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosForeignKey)throws Exception{
		TableColumn tableColumnUsuario=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO));
		TableCellEditor tableCellEditorUsuario =tableColumnUsuario.getCellEditor();

		UsuarioTableCell usuarioTableCellFk=(UsuarioTableCell)tableCellEditorUsuario;

		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.setusuariosForeignKey(usuariosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencialUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//usuarioTableCellFk.setRowActual(intSelectedRow);
			//usuarioTableCellFk.setusuariosForeignKeyActual(usuariosForeignKey);
		//}


		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.RecargarUsuariosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDocumentoGeneral(List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumentoGeneral=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL));
		TableCellEditor tableCellEditorTipoDocumentoGeneral =tableColumnTipoDocumentoGeneral.getCellEditor();

		TipoDocumentoGeneralTableCell tipodocumentogeneralTableCellFk=(TipoDocumentoGeneralTableCell)tableCellEditorTipoDocumentoGeneral;

		if(tipodocumentogeneralTableCellFk!=null) {
			tipodocumentogeneralTableCellFk.settipodocumentogeneralsForeignKey(tipodocumentogeneralsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencialUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentogeneralTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentogeneralTableCellFk.settipodocumentogeneralsForeignKeyActual(tipodocumentogeneralsForeignKey);
		//}


		if(tipodocumentogeneralTableCellFk!=null) {
			tipodocumentogeneralTableCellFk.RecargarTipoDocumentoGeneralsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSecuencialUsuario(false);
			
			//if(!this.isEsNuevoSecuencialUsuario) {								
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				
			}
			
			if(this.permiteMantenimiento(this.secuencialusuario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSecuencialUsuario=true;
					this.inicializarActualizarBindingTablaSecuencialUsuario(false);
					this.isEsNuevoSecuencialUsuario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSecuencialUsuario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSecuencialUsuario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSecuencialUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSecuencialUsuario(false);
				
				this.habilitarDeshabilitarControlesSecuencialUsuario(false);
			
												
				
				if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSecuencialUsuario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSecuencialUsuarioActionPerformed(evt,secuencialusuarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSecuencialUsuario(this.secuencialusuario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSecuencialUsuario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,secuencialusuarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.secuencialusuario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				this.secuencialusuario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				this.secuencialusuario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.secuencialusuario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SecuencialUsuarioModel) this.jTableDatosSecuencialUsuario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSecuencialUsuario=true;
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
				this.isEsNuevoSecuencialUsuario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSecuencialUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSecuencialUsuario(false);
				
				this.habilitarDeshabilitarControlesSecuencialUsuario(false);
				
				
				
				if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSecuencialUsuario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSecuencialUsuario.getRowCount()>=1) {
				jTableDatosSecuencialUsuario.removeRowSelectionInterval(0, jTableDatosSecuencialUsuario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSecuencialUsuario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSecuencialUsuario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencialUsuario(false) ;
			
			this.isEsNuevoSecuencialUsuario=false;
			
			if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSecuencialUsuario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSecuencialUsuario(false);
				
				//SI ES MANUAL
				if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSecuencialUsuario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSecuencialUsuario--;			
			//SecuencialUsuario secuencialusuarioAux= new SecuencialUsuario();			
			//secuencialusuarioAux.setId(this.iIdNuevoSecuencialUsuario);
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSecuencialUsuario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
			
			this.secuencialusuario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.secuencialusuarioLogic.getSecuencialUsuarios().add(this.secuencialusuarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.secuencialusuarios.add(this.secuencialusuarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			
			this.jTableDatosSecuencialUsuario.setRowSelectionInterval(this.getIndiceNuevoSecuencialUsuario(), this.getIndiceNuevoSecuencialUsuario());
			
			int iLastRow =  this.jTableDatosSecuencialUsuario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSecuencialUsuario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSecuencialUsuario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSecuencialUsuario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencialUsuario(false);
			
			//SI ES MANUAL
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSecuencialUsuario();
			}
			
			//this.abrirFrameTreeSecuencialUsuario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Secuencial UsuarioS ?", "MANTENIMIENTO DE Secuencial Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSecuencialUsuario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSecuencialUsuario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.secuencialusuarioReturnGeneral=secuencialusuarioLogic.procesarImportacionSecuencialUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.secuencialusuarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSecuencialUsuarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSecuencialUsuario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSecuencialUsuario.setFileImportacion(this.jInternalFrameImportacionSecuencialUsuario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSecuencialUsuario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSecuencialUsuario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSecuencialUsuario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSecuencialUsuario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		

		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SecuencialUsuarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SecuencialUsuarioBaseDesign.jrxml";
			
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
			
			this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumentoGeneral_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumentoGeneral_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumentoGeneral_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumentoGeneral_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_torizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_torizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_torizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_torizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gitos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gitos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gitos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gitos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoSecuencialUsuario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					sNombreCampoCategoria="id_tipo_documento_general";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoria="autorizacion";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS:
					sNombreCampoCategoria="digitos";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					sNombreCampoCategoriaValor="id_tipo_documento_general";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoriaValor="autorizacion";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS:
					sNombreCampoCategoriaValor="digitos";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Documento General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento_general");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"autorizacion");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Digitos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"digitos");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SecuencialUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.gettipodocumentogeneral_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getserie());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getautorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getdigitos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(SecuencialUsuario secuencialusuario:secuencialusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencialusuario.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelSecuencialUsuario(row);				
			//	iRow++;
			//}				
			
			//for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSecuencialUsuario(secuencialusuarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
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
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencialUsuario(false);
			
			//SI ES MANUAL
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSecuencialUsuario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencialUsuario(false);
			
			//SI ES MANUAL
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSecuencialUsuario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencialUsuario(false);
			
			//SI ES MANUAL
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSecuencialUsuario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSecuencialUsuario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSecuencialUsuario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSecuencialUsuario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSecuencialUsuario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSecuencialUsuario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSecuencialUsuario.setMinimumSize(dimensionMinimum);
		this.jTableDatosSecuencialUsuario.setMaximumSize(dimensionMaximum);
		this.jTableDatosSecuencialUsuario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSecuencialUsuario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSecuencialUsuario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSecuencialUsuario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSecuencialUsuario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSecuencialUsuario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSecuencialUsuario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSecuencialUsuario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSecuencialUsuario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSecuencialUsuario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSecuencialUsuario();
		
		this.inicializarActualizarBindingBotonesManualSecuencialUsuario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSecuencialUsuario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSecuencialUsuario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSecuencialUsuario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSecuencialUsuario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSecuencialUsuario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSecuencialUsuario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSecuencialUsuario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxPostAccionNuevoSecuencialUsuario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxPostAccionSinCerrarSecuencialUsuario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxPostAccionSinMensajeSecuencialUsuario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSecuencialUsuario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSecuencialUsuario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSecuencialUsuario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
				this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxPostAccionNuevoSecuencialUsuario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxPostAccionSinCerrarSecuencialUsuario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxPostAccionSinMensajeSecuencialUsuario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSecuencialUsuario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSecuencialUsuario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSecuencialUsuario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSecuencialUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSecuencialUsuario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSecuencialUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSecuencialUsuario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSecuencialUsuario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSecuencialUsuario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSecuencialUsuario(Boolean esInicializar) throws Exception {
		try	{	
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSecuencialUsuario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSecuencialUsuario() throws Exception {
		try	{
			if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSecuencialUsuario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSecuencialUsuario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSecuencialUsuario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSecuencialUsuario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSecuencialUsuario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSecuencialUsuario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSecuencialUsuario.addItem(reporte);
			}
			
			
			if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSecuencialUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSecuencialUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSecuencialUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSecuencialUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSecuencialUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSecuencialUsuario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSecuencialUsuario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSecuencialUsuario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSecuencialUsuario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSecuencialUsuario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
				
				if(this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSecuencialUsuario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSecuencialUsuario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.autorizacionBusquedaPorAutorizacion=this.jTextFieldautorizacionBusquedaPorAutorizacionSecuencialUsuario.getText();
		this.fecha_finBusquedaPorFechaFin=new Date(this.jDateChooserfecha_finBusquedaPorFechaFinSecuencialUsuario.getDate().getTime());
		this.fecha_inicioBusquedaPorFechaInicio=new Date(this.jDateChooserfecha_inicioBusquedaPorFechaInicioSecuencialUsuario.getDate().getTime());
		if(this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.getSelectedItem()!=null){this.id_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=((Usuario)this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.getSelectedItem()!=null){this.id_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=((TipoDocumentoGeneral)this.jComboBoxid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.getSelectedItem()).getId();}
		this.serieBusquedaPorSerie=this.jTextFieldserieBusquedaPorSerieSecuencialUsuario.getText();
		if(this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.getSelectedItem()!=null){this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral=((TipoDocumentoGeneral)this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralSecuencialUsuario.getSelectedItem()).getId();}
		if(this.jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.getSelectedItem()!=null){this.id_usuarioFK_IdUsuario=((Usuario)this.jComboBoxid_usuarioFK_IdUsuarioSecuencialUsuario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSecuencialUsuario(Boolean esInicializar) throws Exception {				
		if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSecuencialUsuario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSecuencialUsuario() throws Exception {
		this.inicializarActualizarBindingTablaSecuencialUsuario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySecuencialUsuario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSecuencialUsuarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSecuencialUsuario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=secuencialusuarioLogic.getSecuencialUsuarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=secuencialusuarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSecuencialUsuario.setModel(new SecuencialUsuarioModel(this.secuencialusuarioLogic.getSecuencialUsuarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSecuencialUsuario.setModel(new SecuencialUsuarioModel(this.secuencialusuarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySecuencialUsuario!=null && this.jInternalFrameOrderBySecuencialUsuario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySecuencialUsuario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO,secuencialusuarioConstantesFunciones.resaltarSeleccionarSecuencialUsuario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SecuencialUsuarioConstantesFunciones.SCLASSWEBTITULO,secuencialusuarioConstantesFunciones.resaltarSeleccionarSecuencialUsuario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_ID));

		if(this.secuencialusuarioConstantesFunciones.mostraridSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialusuarioConstantesFunciones.resaltaridSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activaridSecuencialUsuario,this,true,"idSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltaridSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activaridSecuencialUsuario,this,true,"idSecuencialUsuario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.secuencialusuarioConstantesFunciones.mostrarid_empresaSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_empresaSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_empresaSecuencialUsuario));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_empresaSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_empresaSecuencialUsuario,false,"id_empresaSecuencialUsuario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.secuencialusuarioConstantesFunciones.mostrarid_sucursalSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_sucursalSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_sucursalSecuencialUsuario));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_sucursalSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_sucursalSecuencialUsuario,false,"id_sucursalSecuencialUsuario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO));

		if(this.secuencialusuarioConstantesFunciones.mostrarid_usuarioSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_usuarioSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_usuarioSecuencialUsuario));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_usuarioSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_usuarioSecuencialUsuario,true,"id_usuarioSecuencialUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL));

		if(this.secuencialusuarioConstantesFunciones.mostrarid_tipo_documento_generalSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoGeneralTableCell(this.tipodocumentogeneralsForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_tipo_documento_generalSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_tipo_documento_generalSecuencialUsuario));
			tableColumn.setCellEditor(new TipoDocumentoGeneralTableCell(this.tipodocumentogeneralsForeignKey,this.secuencialusuarioConstantesFunciones.resaltarid_tipo_documento_generalSecuencialUsuario,this,this.secuencialusuarioConstantesFunciones.activarid_tipo_documento_generalSecuencialUsuario,true,"id_tipo_documento_generalSecuencialUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_SERIE));

		if(this.secuencialusuarioConstantesFunciones.mostrarserieSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialusuarioConstantesFunciones.resaltarserieSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarserieSecuencialUsuario,this,true,"serieSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltarserieSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarserieSecuencialUsuario,this,true,"serieSecuencialUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION));

		if(this.secuencialusuarioConstantesFunciones.mostrarautorizacionSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialusuarioConstantesFunciones.resaltarautorizacionSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarautorizacionSecuencialUsuario,this,true,"autorizacionSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltarautorizacionSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarautorizacionSecuencialUsuario,this,true,"autorizacionSecuencialUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL));

		if(this.secuencialusuarioConstantesFunciones.mostrarsecuencialSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialusuarioConstantesFunciones.resaltarsecuencialSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarsecuencialSecuencialUsuario,this,true,"secuencialSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltarsecuencialSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarsecuencialSecuencialUsuario,this,true,"secuencialSecuencialUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS));

		if(this.secuencialusuarioConstantesFunciones.mostrardigitosSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialusuarioConstantesFunciones.resaltardigitosSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activardigitosSecuencialUsuario,this,true,"digitosSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltardigitosSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activardigitosSecuencialUsuario,this,true,"digitosSecuencialUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO));

		if(this.secuencialusuarioConstantesFunciones.mostrarfecha_inicioSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.secuencialusuarioConstantesFunciones.resaltarfecha_inicioSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarfecha_inicioSecuencialUsuario,this,true,"fecha_inicioSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltarfecha_inicioSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarfecha_inicioSecuencialUsuario,this,true,"fecha_inicioSecuencialUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN));

		if(this.secuencialusuarioConstantesFunciones.mostrarfecha_finSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.secuencialusuarioConstantesFunciones.resaltarfecha_finSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarfecha_finSecuencialUsuario,this,true,"fecha_finSecuencialUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltarfecha_finSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activarfecha_finSecuencialUsuario,this,true,"fecha_finSecuencialUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.secuencialusuarioConstantesFunciones.mostraresta_activoSecuencialUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.secuencialusuarioConstantesFunciones.resaltaresta_activoSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activaresta_activoSecuencialUsuario));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.secuencialusuarioConstantesFunciones.resaltaresta_activoSecuencialUsuario,this.secuencialusuarioConstantesFunciones.activaresta_activoSecuencialUsuario,this,true,"esta_activoSecuencialUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.secuencialusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.secuencialusuarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSecuencialUsuario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.secuencialusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.secuencialusuarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSecuencialUsuario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.secuencialusuarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.secuencialusuarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSecuencialUsuario.addColumn(tableColumn);
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
			
			this.jTableDatosSecuencialUsuario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSecuencialUsuario.moveColumn(this.jTableDatosSecuencialUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSecuencialUsuario.moveColumn(this.jTableDatosSecuencialUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSecuencialUsuario.moveColumn(this.jTableDatosSecuencialUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSecuencialUsuario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSecuencialUsuario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSecuencialUsuario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSecuencialUsuario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSecuencialUsuario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSecuencialUsuario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSecuencialUsuario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=secuencialusuarioLogic.getSecuencialUsuarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=secuencialusuarios.size()-1;
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
		//this.jTableDatosSecuencialUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSecuencialUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSecuencialUsuario();
			
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
				
				//this.isEsNuevoSecuencialUsuario=false;
					
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
				if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSecuencialUsuario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSecuencialUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSecuencialUsuario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.secuencialusuario.getsType().equals("DUPLICADO")
				   || this.secuencialusuario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSecuencialUsuario=true;
				
				} else {
					this.isEsNuevoSecuencialUsuario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
					if(this.secuencialusuario.getId()>=0 && !this.secuencialusuario.getIsNew()) {						
						this.isEsNuevoSecuencialUsuario=false;
						
					} else {
						this.isEsNuevoSecuencialUsuario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSecuencialUsuario(esRelaciones);						
				
				this.seleccionarSecuencialUsuario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.secuencialusuario.getId()<0) {
					this.isEsNuevoSecuencialUsuario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSecuencialUsuario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSecuencialUsuario(evt,rowIndex);
				}	
				
				if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SecuencialUsuario: " + this.dDif); 
					}
				}								
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSecuencialUsuario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.secuencialusuario)) {
					if(this.secuencialusuario.getId()>0) {
						this.secuencialusuario.setIsDeleted(true);
						
						this.secuencialusuariosEliminados.add(this.secuencialusuario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.secuencialusuarioLogic.getSecuencialUsuarios().remove(this.secuencialusuario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.secuencialusuarios.remove(this.secuencialusuario);				
					}
					
					
					((SecuencialUsuarioModel) this.jTableDatosSecuencialUsuario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSecuencialUsuario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSecuencialUsuario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSecuencialUsuario) {
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSecuencialUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSecuencialUsuario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuario);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.secuencialusuarioConstantesFunciones.cargarid_empresaSecuencialUsuario || this.secuencialusuarioConstantesFunciones.event_dependid_empresaSecuencialUsuario) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.secuencialusuario.getid_empresa());
									//this.inicializarActualizarBindingSecuencialUsuario(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(secuencialusuario.getEmpresa()!=null) {
							this.empresasForeignKey.add(secuencialusuario.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.secuencialusuario.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.secuencialusuarioConstantesFunciones.cargarid_sucursalSecuencialUsuario || this.secuencialusuarioConstantesFunciones.event_dependid_sucursalSecuencialUsuario) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.secuencialusuario.getid_sucursal());
									//this.inicializarActualizarBindingSecuencialUsuario(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(secuencialusuario.getSucursal()!=null) {
							this.sucursalsForeignKey.add(secuencialusuario.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.secuencialusuario.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.secuencialusuarioConstantesFunciones.cargarid_usuarioSecuencialUsuario || this.secuencialusuarioConstantesFunciones.event_dependid_usuarioSecuencialUsuario) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.secuencialusuario.getid_usuario());
									//this.inicializarActualizarBindingSecuencialUsuario(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(secuencialusuario.getUsuario()!=null) {
							this.usuariosForeignKey.add(secuencialusuario.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.secuencialusuario.getid_usuario(),false,"Formulario");

					//TipoDocumentoGeneral
					if(!this.secuencialusuarioConstantesFunciones.cargarid_tipo_documento_generalSecuencialUsuario || this.secuencialusuarioConstantesFunciones.event_dependid_tipo_documento_generalSecuencialUsuario) {
						//this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(" where id="+this.secuencialusuario.getid_tipo_documento_general());
									//this.inicializarActualizarBindingSecuencialUsuario(false,false);
						this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>();

						if(secuencialusuario.getTipoDocumentoGeneral()!=null) {
							this.tipodocumentogeneralsForeignKey.add(secuencialusuario.getTipoDocumentoGeneral());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
						this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Todos");
					}
					this.setActualTipoDocumentoGeneralForeignKey(this.secuencialusuario.getid_tipo_documento_general(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSecuencialUsuario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSecuencialUsuario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSecuencialUsuario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSecuencialUsuario(SecuencialUsuario secuencialusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSecuencialUsuario(secuencialusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSecuencialUsuario(SecuencialUsuario secuencialusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSecuencialUsuario(secuencialusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySecuencialUsuario(secuencialusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySecuencialUsuario(secuencialusuario);
	}
	
	public void setVariablesObjetoActualToFormularioSecuencialUsuario(SecuencialUsuario secuencialusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setText(secuencialusuario.getId().toString());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setText(secuencialusuario.getserie());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setText(secuencialusuario.getautorizacion());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setText(secuencialusuario.getsecuencial());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setText(secuencialusuario.getdigitos().toString());
			this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setDate(secuencialusuario.getfecha_inicio());
			this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setDate(secuencialusuario.getfecha_fin());
			this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setSelected(secuencialusuario.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SecuencialUsuario secuencialusuarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,secuencialusuarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SecuencialUsuario secuencialusuarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				secuencialusuarioLocal=this.secuencialusuario;
			} else {
				secuencialusuarioLocal=this.secuencialusuarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(secuencialusuarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSecuencialUsuario(secuencialusuarioLocal,true);
					
					if(secuencialusuarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(secuencialusuarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(secuencialusuarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSecuencialUsuario(SecuencialUsuario secuencialusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSecuencialUsuario(secuencialusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(secuencialusuario);
	}
	
	public void setVariablesFormularioToObjetoActualSecuencialUsuario(SecuencialUsuario secuencialusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSecuencialUsuario(secuencialusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSecuencialUsuario(SecuencialUsuario secuencialusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.getText()==null || this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.getText()=="" || this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.getText()=="Id") {
				this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setText("0");
			}

			if(conColumnasBase) {secuencialusuario.setId(Long.parseLong(this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelIdSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setserie(this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelserieSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setautorizacion(this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelautorizacionSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setsecuencial(this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelsecuencialSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setdigitos(Integer.parseInt(this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabeldigitosSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setfecha_inicio(this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelfecha_inicioSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setfecha_fin(this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelfecha_finSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencialusuario.setesta_activo(this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencialUsuario.jLabelesta_activoSecuencialUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSecuencialUsuario(SecuencialUsuario secuencialusuarioBean,SecuencialUsuario secuencialusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && secuencialusuarioBean.getid_tipo_documento_general()!=null && !secuencialusuarioBean.getid_tipo_documento_general().equals(-1L))) {secuencialusuario.setid_tipo_documento_general(secuencialusuarioBean.getid_tipo_documento_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSecuencialUsuario(SecuencialUsuario secuencialusuarioOrigen,SecuencialUsuario secuencialusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && secuencialusuarioOrigen.getId()!=null && !secuencialusuarioOrigen.getId().equals(0L))) {secuencialusuario.setId(secuencialusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getid_tipo_documento_general()!=null && !secuencialusuarioOrigen.getid_tipo_documento_general().equals(-1L))) {secuencialusuario.setid_tipo_documento_general(secuencialusuarioOrigen.getid_tipo_documento_general());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getserie()!=null && !secuencialusuarioOrigen.getserie().equals(""))) {secuencialusuario.setserie(secuencialusuarioOrigen.getserie());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getautorizacion()!=null && !secuencialusuarioOrigen.getautorizacion().equals(""))) {secuencialusuario.setautorizacion(secuencialusuarioOrigen.getautorizacion());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getsecuencial()!=null && !secuencialusuarioOrigen.getsecuencial().equals(""))) {secuencialusuario.setsecuencial(secuencialusuarioOrigen.getsecuencial());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getdigitos()!=null && !secuencialusuarioOrigen.getdigitos().equals(0))) {secuencialusuario.setdigitos(secuencialusuarioOrigen.getdigitos());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getfecha_inicio()!=null && !secuencialusuarioOrigen.getfecha_inicio().equals(new Date()))) {secuencialusuario.setfecha_inicio(secuencialusuarioOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getfecha_fin()!=null && !secuencialusuarioOrigen.getfecha_fin().equals(new Date()))) {secuencialusuario.setfecha_fin(secuencialusuarioOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && secuencialusuarioOrigen.getesta_activo()!=null && !secuencialusuarioOrigen.getesta_activo().equals(false))) {secuencialusuario.setesta_activo(secuencialusuarioOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSecuencialUsuario(SecuencialUsuario secuencialusuario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setText(secuencialusuario.getId().toString());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setText(secuencialusuario.getserie());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setText(secuencialusuario.getautorizacion());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setText(secuencialusuario.getsecuencial());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setText(secuencialusuario.getdigitos().toString());
			this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setDate(secuencialusuario.getfecha_inicio());
			this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setDate(secuencialusuario.getfecha_fin());
			this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setSelected(secuencialusuario.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSecuencialUsuario(SecuencialUsuarioBean secuencialusuarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setText(secuencialusuarioBean.getId().toString());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setText(secuencialusuarioBean.getserie());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setText(secuencialusuarioBean.getautorizacion());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setText(secuencialusuarioBean.getsecuencial());
			this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setText(secuencialusuarioBean.getdigitos().toString());
			this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setDate(secuencialusuarioBean.getfecha_inicio());
			this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setDate(secuencialusuarioBean.getfecha_fin());
			this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setSelected(secuencialusuarioBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSecuencialUsuario(SecuencialUsuarioParameterReturnGeneral secuencialusuarioReturnGeneral,SecuencialUsuarioBean secuencialusuarioBean,Boolean conDefault) throws Exception { 
		try {
			SecuencialUsuario secuencialusuarioLocal=new SecuencialUsuario();
			
			secuencialusuarioLocal=secuencialusuarioReturnGeneral.getSecuencialUsuario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && secuencialusuarioLocal.getId()!=null && !secuencialusuarioLocal.getId().equals(0L))) {secuencialusuarioBean.setId(secuencialusuarioLocal.getId());}}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getid_tipo_documento_general()!=null && !secuencialusuarioLocal.getid_tipo_documento_general().equals(-1L))) {secuencialusuarioBean.setid_tipo_documento_general(secuencialusuarioLocal.getid_tipo_documento_general());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getserie()!=null && !secuencialusuarioLocal.getserie().equals(""))) {secuencialusuarioBean.setserie(secuencialusuarioLocal.getserie());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getautorizacion()!=null && !secuencialusuarioLocal.getautorizacion().equals(""))) {secuencialusuarioBean.setautorizacion(secuencialusuarioLocal.getautorizacion());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getsecuencial()!=null && !secuencialusuarioLocal.getsecuencial().equals(""))) {secuencialusuarioBean.setsecuencial(secuencialusuarioLocal.getsecuencial());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getdigitos()!=null && !secuencialusuarioLocal.getdigitos().equals(0))) {secuencialusuarioBean.setdigitos(secuencialusuarioLocal.getdigitos());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getfecha_inicio()!=null && !secuencialusuarioLocal.getfecha_inicio().equals(new Date()))) {secuencialusuarioBean.setfecha_inicio(secuencialusuarioLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getfecha_fin()!=null && !secuencialusuarioLocal.getfecha_fin().equals(new Date()))) {secuencialusuarioBean.setfecha_fin(secuencialusuarioLocal.getfecha_fin());}
			if(conDefault || (!conDefault && secuencialusuarioLocal.getesta_activo()!=null && !secuencialusuarioLocal.getesta_activo().equals(false))) {secuencialusuarioBean.setesta_activo(secuencialusuarioLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSecuencialUsuarioGenerico(Long idSecuencialUsuarioSeleccionado,JComboBox jComboBoxSecuencialUsuario,List<SecuencialUsuario> secuencialusuariosLocal)throws Exception {
		try {
			SecuencialUsuario  secuencialusuarioTemp=null;

			for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosLocal) {
				if(secuencialusuarioAux.getId()!=null && secuencialusuarioAux.getId().equals(idSecuencialUsuarioSeleccionado)) {
					secuencialusuarioTemp=secuencialusuarioAux;
					break;
				}
			}

			jComboBoxSecuencialUsuario.setSelectedItem(secuencialusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSecuencialUsuarioGenerico(JComboBox jComboBoxSecuencialUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSecuencialUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSecuencialUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSecuencialUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSecuencialUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSecuencialUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSecuencialUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			secuencialusuario=(SecuencialUsuario) secuencialusuarioLogic.getSecuencialUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			secuencialusuario =(SecuencialUsuario) secuencialusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!secuencialusuario.getIsNew() && !secuencialusuario.getIsChanged() && !secuencialusuario.getIsDeleted()) {
				sDescripcion=secuencialusuario.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=secuencialusuario.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!secuencialusuario.getIsNew() && !secuencialusuario.getIsChanged() && !secuencialusuario.getIsDeleted()) {
				sDescripcion=secuencialusuario.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=secuencialusuario.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!secuencialusuario.getIsNew() && !secuencialusuario.getIsChanged() && !secuencialusuario.getIsDeleted()) {
				sDescripcion=secuencialusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=secuencialusuario.getusuario_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumentoGeneral")) {
			//sDescripcion=this.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value);
			if(!secuencialusuario.getIsNew() && !secuencialusuario.getIsChanged() && !secuencialusuario.getIsDeleted()) {
				sDescripcion=secuencialusuario.gettipodocumentogeneral_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value);
				sDescripcion=secuencialusuario.gettipodocumentogeneral_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SecuencialUsuario secuencialusuarioRow=new SecuencialUsuario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			secuencialusuarioRow=(SecuencialUsuario) secuencialusuarioLogic.getSecuencialUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			secuencialusuarioRow=(SecuencialUsuario) secuencialusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSecuencialUsuario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario));			
			this.jButtonDuplicarSecuencialUsuario.setVisible((this.isVisibilidadCeldaDuplicarSecuencialUsuario && this.isPermisoDuplicarSecuencialUsuario));			
			this.jButtonCopiarSecuencialUsuario.setVisible((this.isVisibilidadCeldaCopiarSecuencialUsuario && this.isPermisoCopiarSecuencialUsuario));
			this.jButtonVerFormSecuencialUsuario.setVisible((this.isVisibilidadCeldaVerFormSecuencialUsuario && this.isPermisoVerFormSecuencialUsuario));
			
			this.jButtonAbrirOrderBySecuencialUsuario.setVisible((this.isVisibilidadCeldaOrdenSecuencialUsuario && this.isPermisoOrdenSecuencialUsuario));			
			
			this.jButtonNuevoRelacionesSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario));			
			this.jButtonNuevoGuardarCambiosSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarSecuencialUsuario.setVisible((this.isVisibilidadCeldaModificarSecuencialUsuario && this.isPermisoActualizarSecuencialUsuario));	
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarSecuencialUsuario.setVisible((this.isVisibilidadCeldaActualizarSecuencialUsuario && this.isPermisoActualizarSecuencialUsuario));	
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarSecuencialUsuario.setVisible((this.isVisibilidadCeldaEliminarSecuencialUsuario && this.isPermisoEliminarSecuencialUsuario));
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarSecuencialUsuario.setVisible(this.isVisibilidadCeldaCancelarSecuencialUsuario);							
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));			
			
			}
						
			this.jButtonGuardarCambiosTablaSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario));						
			this.jButtonDuplicarToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaDuplicarSecuencialUsuario && this.isPermisoDuplicarSecuencialUsuario));						
			this.jButtonCopiarToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaCopiarSecuencialUsuario && this.isPermisoCopiarSecuencialUsuario));			
			this.jButtonVerFormToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaVerFormSecuencialUsuario && this.isPermisoVerFormSecuencialUsuario));			
			this.jButtonAbrirOrderByToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaOrdenSecuencialUsuario && this.isPermisoOrdenSecuencialUsuario));
			this.jButtonNuevoRelacionesToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario));			
			this.jButtonNuevoGuardarCambiosToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));			
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaModificarSecuencialUsuario && this.isPermisoActualizarSecuencialUsuario));	
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaActualizarSecuencialUsuario  && this.isPermisoActualizarSecuencialUsuario));	
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaEliminarSecuencialUsuario && this.isPermisoEliminarSecuencialUsuario));
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarToolBarSecuencialUsuario.setVisible(this.isVisibilidadCeldaCancelarSecuencialUsuario);				
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario));			
			this.jMenuItemDuplicarSecuencialUsuario.setVisible((this.isVisibilidadCeldaDuplicarSecuencialUsuario && this.isPermisoDuplicarSecuencialUsuario));			
			this.jMenuItemCopiarSecuencialUsuario.setVisible((this.isVisibilidadCeldaCopiarSecuencialUsuario && this.isPermisoCopiarSecuencialUsuario));			
			this.jMenuItemVerFormSecuencialUsuario.setVisible((this.isVisibilidadCeldaVerFormSecuencialUsuario && this.isPermisoVerFormSecuencialUsuario));			
			this.jMenuItemAbrirOrderBySecuencialUsuario.setVisible((this.isVisibilidadCeldaOrdenSecuencialUsuario && this.isPermisoOrdenSecuencialUsuario));			
			//this.jMenuItemMostrarOcultarSecuencialUsuario.setVisible((this.isVisibilidadCeldaOrdenSecuencialUsuario && this.isPermisoOrdenSecuencialUsuario));
			this.jMenuItemDetalleAbrirOrderBySecuencialUsuario.setVisible((this.isVisibilidadCeldaOrdenSecuencialUsuario && this.isPermisoOrdenSecuencialUsuario));			
			//this.jMenuItemDetalleMostrarOcultarSecuencialUsuario.setVisible((this.isVisibilidadCeldaOrdenSecuencialUsuario && this.isPermisoOrdenSecuencialUsuario));			
			this.jMenuItemNuevoRelacionesSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario));			
			this.jMenuItemNuevoGuardarCambiosSecuencialUsuario.setVisible((this.isVisibilidadCeldaNuevoSecuencialUsuario && this.isPermisoNuevoSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));									
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemModificarSecuencialUsuario.setVisible((this.isVisibilidadCeldaModificarSecuencialUsuario && this.isPermisoActualizarSecuencialUsuario));	
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemActualizarSecuencialUsuario.setVisible((this.isVisibilidadCeldaActualizarSecuencialUsuario && this.isPermisoActualizarSecuencialUsuario));	
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemEliminarSecuencialUsuario.setVisible((this.isVisibilidadCeldaEliminarSecuencialUsuario && this.isPermisoEliminarSecuencialUsuario));
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemCancelarSecuencialUsuario.setVisible(this.isVisibilidadCeldaCancelarSecuencialUsuario);				
			}
			
			this.jMenuItemGuardarCambiosSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));						
			this.jMenuItemGuardarCambiosTablaSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=this.jButtonNuevoSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaDuplicarSecuencialUsuario=this.jButtonDuplicarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaCopiarSecuencialUsuario=this.jButtonCopiarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaVerFormSecuencialUsuario=this.jButtonVerFormSecuencialUsuario.isVisible();
			
			this.isVisibilidadCeldaOrdenSecuencialUsuario=this.jButtonAbrirOrderBySecuencialUsuario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=this.jButtonNuevoRelacionesSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaModificarSecuencialUsuario=this.jButtonModificarSecuencialUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.isVisibilidadCeldaActualizarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaEliminarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaCancelarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaGuardarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=this.jButtonGuardarCambiosTablaSecuencialUsuario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSecuencialUsuario=this.jButtonNuevoToolBarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=this.jButtonNuevoRelacionesToolBarSecuencialUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.isVisibilidadCeldaModificarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarToolBarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaActualizarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarToolBarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaEliminarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarToolBarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaCancelarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarToolBarSecuencialUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSecuencialUsuario=this.jButtonGuardarCambiosToolBarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=this.jButtonGuardarCambiosTablaToolBarSecuencialUsuario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSecuencialUsuario=this.jMenuItemNuevoSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=this.jMenuItemNuevoRelacionesSecuencialUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.isVisibilidadCeldaModificarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemModificarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaActualizarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemActualizarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaEliminarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemEliminarSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaCancelarSecuencialUsuario=this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemCancelarSecuencialUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSecuencialUsuario=this.jMenuItemGuardarCambiosSecuencialUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=this.jMenuItemGuardarCambiosTablaSecuencialUsuario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSecuencialUsuario(Boolean esInicializar) {
		if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
				//if(this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSecuencialUsuario();
			}
			
			this.inicializarActualizarBindingBotonesManualSecuencialUsuario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSecuencialUsuario() {
		this.jButtonNuevoSecuencialUsuario.setVisible(this.isPermisoNuevoSecuencialUsuario);			
		this.jButtonDuplicarSecuencialUsuario.setVisible(this.isPermisoDuplicarSecuencialUsuario);			
		this.jButtonCopiarSecuencialUsuario.setVisible(this.isPermisoCopiarSecuencialUsuario);			
		this.jButtonVerFormSecuencialUsuario.setVisible(this.isPermisoVerFormSecuencialUsuario);			
		
		this.jButtonAbrirOrderBySecuencialUsuario.setVisible(this.isPermisoOrdenSecuencialUsuario);					
		
		this.jButtonNuevoRelacionesSecuencialUsuario.setVisible(this.isPermisoNuevoSecuencialUsuario);			
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarSecuencialUsuario.setVisible(this.isPermisoActualizarSecuencialUsuario);	
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarSecuencialUsuario.setVisible(this.isPermisoActualizarSecuencialUsuario);	
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarSecuencialUsuario.setVisible(this.isPermisoEliminarSecuencialUsuario);
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarSecuencialUsuario.setVisible(this.isVisibilidadCeldaCancelarSecuencialUsuario);						
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.setVisible(this.isPermisoGuardarCambiosSecuencialUsuario);							
		}
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.setVisible(this.isPermisoActualizarSecuencialUsuario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSecuencialUsuario() {
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarSecuencialUsuario.setVisible(this.isPermisoActualizarSecuencialUsuario);	
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarSecuencialUsuario.setVisible(this.isPermisoActualizarSecuencialUsuario);	
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarSecuencialUsuario.setVisible(this.isPermisoEliminarSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarSecuencialUsuario.setVisible(this.isVisibilidadCeldaCancelarSecuencialUsuario);							
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.setVisible((this.isVisibilidadCeldaGuardarSecuencialUsuario && this.isPermisoGuardarCambiosSecuencialUsuario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSecuencialUsuario() {
		if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSecuencialUsuario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSecuencialUsuario() {
	}
	
	public void jTableDatosSecuencialUsuarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSecuencialUsuario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.secuencialusuario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSecuencialUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSecuencialUsuario(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencialUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencialUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.secuencialusuarioLogic.getConnexion());

				if(this.secuencialusuario.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.secuencialusuario.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencialUsuario=(TitledBorder)this.jScrollPanelDatosSecuencialUsuario.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSecuencialUsuario.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.secuencialusuario.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSecuencialUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSecuencialUsuario(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencialUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencialUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.secuencialusuarioLogic.getConnexion());

				if(this.secuencialusuario.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.secuencialusuario.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencialUsuario=(TitledBorder)this.jScrollPanelDatosSecuencialUsuario.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSecuencialUsuario.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.secuencialusuario.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioSecuencialUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebSecuencialUsuario(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencialUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencialUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.secuencialusuarioLogic.getConnexion());

				if(this.secuencialusuario.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.secuencialusuario.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencialUsuario=(TitledBorder)this.jScrollPanelDatosSecuencialUsuario.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderSecuencialUsuario.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.secuencialusuario.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documento_generalSecuencialUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumentogeneral=true;

			idTienePermisotipodocumentogeneral=this.tienePermisosUsuarioEnPaginaWebSecuencialUsuario(TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumentogeneral) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencialUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencialUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);

				this.tipodocumentogeneralBeanSwingJInternalFrame=new TipoDocumentoGeneralBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentogeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentogeneralBeanSwingJInternalFrame.getTipoDocumentoGeneralLogic().setConnexion(this.secuencialusuarioLogic.getConnexion());

				if(this.secuencialusuario.getid_tipo_documento_general()!=null) {
					this.tipodocumentogeneralBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentogeneralBeanSwingJInternalFrame.setIdActual(this.secuencialusuario.getid_tipo_documento_general());
					this.tipodocumentogeneralBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentogeneralBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumentoGeneral();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentogeneralBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencialUsuario=(TitledBorder)this.jScrollPanelDatosSecuencialUsuario.getBorder();
				TitledBorder titledBordertipodocumentogeneral=(TitledBorder)this.tipodocumentogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumentoGeneral.getBorder();

				titledBordertipodocumentogeneral.setTitle(titledBorderSecuencialUsuario.getTitle() + " -> Tipo Documento General");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documento_generalSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getid_tipo_documento_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento_general = "+this.secuencialusuario.getid_tipo_documento_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.secuencialusuario.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonautorizacionSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getautorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where autorizacion like '%"+this.secuencialusuario.getautorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.secuencialusuario.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondigitosSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getdigitos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where digitos = "+this.secuencialusuario.getdigitos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.secuencialusuario.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.secuencialusuario.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoSecuencialUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.getsecuencialusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencialusuario==null) {
						this.secuencialusuario = new SecuencialUsuario();
					}

					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);
				}

				if(this.secuencialusuario.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.secuencialusuario.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencialUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorAutorizacionSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosBusquedaPorAutorizacion();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaFinSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosBusquedaPorFechaFin();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaInicioSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosBusquedaPorFechaInicio();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSerieSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosBusquedaPorSerie();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosFK_IdEmpresa();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosFK_IdSucursal();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoGeneralSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosFK_IdTipoDocumentoGeneral();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioSecuencialUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencialUsuario(false,false);

			this.getSecuencialUsuariosFK_IdUsuario();

			this.inicializarActualizarBindingSecuencialUsuario(false);

			//if(SecuencialUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencialUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSecuencialUsuario() {
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
			this.jInternalFrameDetalleFormSecuencialUsuario.setVisible(false);	    			
			this.jInternalFrameDetalleFormSecuencialUsuario.dispose();
			this.jInternalFrameDetalleFormSecuencialUsuario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
			this.jInternalFrameReporteDinamicoSecuencialUsuario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSecuencialUsuario.dispose();
			this.jInternalFrameReporteDinamicoSecuencialUsuario=null;
		}
		
		if(this.jInternalFrameImportacionSecuencialUsuario!=null) {
			this.jInternalFrameImportacionSecuencialUsuario.setVisible(false);	    			
			this.jInternalFrameImportacionSecuencialUsuario.dispose();
			this.jInternalFrameImportacionSecuencialUsuario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSecuencialUsuario();
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSecuencialUsuario")) {
				jButtonDuplicarSecuencialUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSecuencialUsuario")) {
				jButtonCopiarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormSecuencialUsuario")) {
				jButtonVerFormSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSecuencialUsuario")) {
				jButtonDuplicarSecuencialUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSecuencialUsuario")) {
				jButtonDuplicarSecuencialUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSecuencialUsuario")) {
				jButtonModificarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSecuencialUsuario")) {
				jButtonModificarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSecuencialUsuario")) {
				jButtonModificarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSecuencialUsuario")) {
				jButtonActualizarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSecuencialUsuario")) {
				jButtonActualizarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSecuencialUsuario")) {
				jButtonActualizarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarSecuencialUsuario")) {
				jButtonEliminarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSecuencialUsuario")) {
				jButtonEliminarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSecuencialUsuario")) {
				jButtonEliminarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarSecuencialUsuario")) {
				jButtonCancelarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSecuencialUsuario")) {
				jButtonCancelarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSecuencialUsuario")) {
				jButtonCancelarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarSecuencialUsuario")) {
				jButtonCerrarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSecuencialUsuario")) {
				jButtonCerrarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSecuencialUsuario")) {
				jButtonCerrarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSecuencialUsuario")) {
				jButtonMostrarOcultarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSecuencialUsuario")) {
				jButtonCancelarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSecuencialUsuario")) {
				jButtonCopiarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSecuencialUsuario")) {
				jButtonVerFormSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSecuencialUsuario")) {
				jButtonCopiarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSecuencialUsuario")) {
				jButtonVerFormSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSecuencialUsuario")) {
				jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSecuencialUsuario")) {
				jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSecuencialUsuario")) {
				jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSecuencialUsuario")) {
				jButtonAnterioresSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSecuencialUsuario")) {
				jButtonAnterioresSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSecuencialUsuario")) {
				jButtonAnterioresSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSecuencialUsuario")) {
				jButtonSiguientesSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSecuencialUsuario")) {
				jButtonSiguientesSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSecuencialUsuario")) {
				jButtonSiguientesSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySecuencialUsuario") || sTipo.equals("MenuItemDetalleAbrirOrderBySecuencialUsuario")) {
				jButtonAbrirOrderBySecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSecuencialUsuario") || sTipo.equals("MenuItemDetalleMostrarOcultarSecuencialUsuario")) {
				jButtonMostrarOcultarSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSecuencialUsuario")) {
				jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSecuencialUsuario")) {
				jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSecuencialUsuario")) {
				jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSecuencialUsuario")) {
				jButtonCerrarReporteDinamicoSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSecuencialUsuario")) {
				jButtonGenerarReporteDinamicoSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSecuencialUsuario")) {
				
				jButtonGenerarExcelReporteDinamicoSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSecuencialUsuario")) {
				jButtonCerrarImportacionSecuencialUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSecuencialUsuario")) {
				
				jButtonGenerarImportacionSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSecuencialUsuario")) {
				
				jButtonAbrirImportacionSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSecuencialUsuario")) {
				jComboBoxTiposAccionesSecuencialUsuarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSecuencialUsuario")) {
				jComboBoxTiposRelacionesSecuencialUsuarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSecuencialUsuario")) {
				jComboBoxTiposAccionesSecuencialUsuarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSecuencialUsuario")) {
				
				jComboBoxTiposSeleccionarSecuencialUsuarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSecuencialUsuario")) {
				jTextFieldValorCampoGeneralSecuencialUsuarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySecuencialUsuario")) {
				jButtonAbrirOrderBySecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSecuencialUsuario")) {
				jButtonAbrirOrderBySecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySecuencialUsuario")) {
				jButtonCerrarOrderBySecuencialUsuarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSecuencialUsuarioBusqueda")) {
				this.jButtonidSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSecuencialUsuarioUpdate")) {
				this.jButtonid_empresaSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSecuencialUsuarioBusqueda")) {
				this.jButtonid_empresaSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSecuencialUsuarioUpdate")) {
				this.jButtonid_sucursalSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSecuencialUsuarioBusqueda")) {
				this.jButtonid_sucursalSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioSecuencialUsuarioUpdate")) {
				this.jButtonid_usuarioSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioSecuencialUsuarioBusqueda")) {
				this.jButtonid_usuarioSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documento_generalSecuencialUsuarioUpdate")) {
				this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documento_generalSecuencialUsuarioBusqueda")) {
				this.jButtonid_tipo_documento_generalSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieSecuencialUsuarioBusqueda")) {
				this.jButtonserieSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionSecuencialUsuarioBusqueda")) {
				this.jButtonautorizacionSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSecuencialUsuarioBusqueda")) {
				this.jButtonsecuencialSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("digitosSecuencialUsuarioBusqueda")) {
				this.jButtondigitosSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioSecuencialUsuarioBusqueda")) {
				this.jButtonfecha_inicioSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finSecuencialUsuarioBusqueda")) {
				this.jButtonfecha_finSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoSecuencialUsuarioBusqueda")) {
				this.jButtonesta_activoSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorAutorizacionSecuencialUsuario")) {
				this.jButtonBusquedaPorAutorizacionSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaFinSecuencialUsuario")) {
				this.jButtonBusquedaPorFechaFinSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaInicioSecuencialUsuario")) {
				this.jButtonBusquedaPorFechaInicioSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario")) {
				this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSerieSecuencialUsuario")) {
				this.jButtonBusquedaPorSerieSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoDocumentoGeneralSecuencialUsuario")) {
				this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUsuarioSecuencialUsuario")) {
				this.jButtonFK_IdUsuarioSecuencialUsuarioActionPerformed(evt);
			}
			
			;
			
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSecuencialUsuario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SecuencialUsuario secuencialusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				secuencialusuarioLocal=this.secuencialusuario;
			} else {
				secuencialusuarioLocal=this.secuencialusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
							
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
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
			
			


			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
								
						
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
								
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
							
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
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
			
			


			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
								
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSecuencialUsuario")) {
					jCheckBoxSeleccionarTodosSecuencialUsuarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSecuencialUsuario")) {
					jCheckBoxSeleccionadosSecuencialUsuarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSecuencialUsuario")) {
					
				}
				
				


				
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
												
				
				


				
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
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
			
			


			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencialusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencialusuario);
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
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
				
				


				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SecuencialUsuario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SecuencialUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialusuarioAnterior =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSecuencialUsuario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSecuencialUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSecuencialUsuario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.secuencialusuario =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.secuencialusuario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSecuencialUsuario")) {
				
				}
				
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSecuencialUsuario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSecuencialUsuario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSecuencialUsuario")) {
			
			}
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSecuencialUsuario();
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			if(sTipo.equals("NuevoSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSecuencialUsuario")) {
				jButtonDuplicarSecuencialUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSecuencialUsuario")) {
				jButtonCopiarSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSecuencialUsuario")) {
				jButtonVerFormSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSecuencialUsuario")) {
				jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSecuencialUsuario")) {
				jButtonModificarSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSecuencialUsuario")) {
				jButtonActualizarSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSecuencialUsuario")) {
				jButtonEliminarSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSecuencialUsuario")) {
				jButtonCancelarSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSecuencialUsuario")) {
				jButtonCerrarSecuencialUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSecuencialUsuario")) {
				jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSecuencialUsuario")) {
				jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySecuencialUsuario")) {
				jButtonAbrirOrderBySecuencialUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSecuencialUsuario")) {
				jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSecuencialUsuario")) {
				jButtonAnterioresSecuencialUsuarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSecuencialUsuario")) {
				jButtonSiguientesSecuencialUsuarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSecuencialUsuarioBusqueda")) {
				this.jButtonidSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSecuencialUsuarioUpdate")) {
				this.jButtonid_empresaSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSecuencialUsuarioBusqueda")) {
				this.jButtonid_empresaSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSecuencialUsuarioUpdate")) {
				this.jButtonid_sucursalSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSecuencialUsuarioBusqueda")) {
				this.jButtonid_sucursalSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioSecuencialUsuarioUpdate")) {
				this.jButtonid_usuarioSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioSecuencialUsuarioBusqueda")) {
				this.jButtonid_usuarioSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documento_generalSecuencialUsuarioUpdate")) {
				this.jButtonid_tipo_documento_generalSecuencialUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documento_generalSecuencialUsuarioBusqueda")) {
				this.jButtonid_tipo_documento_generalSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieSecuencialUsuarioBusqueda")) {
				this.jButtonserieSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionSecuencialUsuarioBusqueda")) {
				this.jButtonautorizacionSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialSecuencialUsuarioBusqueda")) {
				this.jButtonsecuencialSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("digitosSecuencialUsuarioBusqueda")) {
				this.jButtondigitosSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioSecuencialUsuarioBusqueda")) {
				this.jButtonfecha_inicioSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finSecuencialUsuarioBusqueda")) {
				this.jButtonfecha_finSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoSecuencialUsuarioBusqueda")) {
				this.jButtonesta_activoSecuencialUsuarioBusquedaActionPerformed(evt);
			}
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSecuencialUsuario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSecuencialUsuario")) {
				closingInternalFrameSecuencialUsuario();
				
			} else if(sTipo.equals("jButtonCancelarSecuencialUsuario")) {
				JInternalFrameBase jInternalFrameDetalleFormSecuencialUsuario = (JInternalFrameBase)evt.getSource();
	            	
	            SecuencialUsuarioBeanSwingJInternalFrame jInternalFrameParent=(SecuencialUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormSecuencialUsuario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSecuencialUsuarioActionPerformed(null);
			}
			
			SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.secuencialusuario,new Object(),this.secuencialusuarioParameterGeneral,this.secuencialusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSecuencialUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSecuencialUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSecuencialUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.secuencialusuario)) {
			if(!esControlTabla) {
				if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);			
				}
				
				if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSecuencialUsuario(this.secuencialusuario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.secuencialusuarioReturnGeneral=secuencialusuarioLogic.procesarEventosSecuencialUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencialusuarioLogic.getSecuencialUsuarios(),this.secuencialusuario,this.secuencialusuarioParameterGeneral,this.isEsNuevoSecuencialUsuario,classes);//this.secuencialusuarioLogic.getSecuencialUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSecuencialUsuario(this.secuencialusuarioReturnGeneral,this.secuencialusuarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSecuencialUsuario(classes,this.secuencialusuarioReturnGeneral,this.secuencialusuarioBean,false);
					}
						
					if(this.secuencialusuarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario());	
					}
						
					if(this.secuencialusuarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario(),classes);//this.secuencialusuarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSecuencialUsuario(this.secuencialusuario,classes);//this.secuencialusuarioBean);									
				}
			
				if(SecuencialUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSecuencialUsuario(this.secuencialusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencialUsuario(this.secuencialusuario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.secuencialusuarioAnterior!=null) {
						this.secuencialusuario=this.secuencialusuarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.secuencialusuarioReturnGeneral=secuencialusuarioLogic.procesarEventosSecuencialUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencialusuarioLogic.getSecuencialUsuarios(),this.secuencialusuario,this.secuencialusuarioParameterGeneral,this.isEsNuevoSecuencialUsuario,classes);//this.secuencialusuarioLogic.getSecuencialUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.secuencialusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.secuencialusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.secuencialusuarioReturnGeneral.getSecuencialUsuario(),secuencialusuarioLogic.getSecuencialUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.secuencialusuarioReturnGeneral.getSecuencialUsuario(),this.secuencialusuarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSecuencialUsuario.repaint();
				
				//((AbstractTableModel) this.jTableDatosSecuencialUsuario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSecuencialUsuario();
			}
		}
	}
	
	public void actualizarVisualTableDatosSecuencialUsuario() throws Exception {
		
		SecuencialUsuarioModel secuencialusuarioModel=(SecuencialUsuarioModel)this.jTableDatosSecuencialUsuario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			secuencialusuarioModel.secuencialusuarios=this.secuencialusuarioLogic.getSecuencialUsuarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			secuencialusuarioModel.secuencialusuarios=this.secuencialusuarios;
		}
		
		
		((SecuencialUsuarioModel) this.jTableDatosSecuencialUsuario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSecuencialUsuario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsecuencialusuarioAnterior(),this.secuencialusuarioLogic.getSecuencialUsuarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsecuencialusuarioAnterior(),this.secuencialusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSecuencialUsuario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSecuencialUsuario(SecuencialUsuario secuencialusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
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
										
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencialusuario,new Object(),generalEntityParameterGeneral,this.secuencialusuarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.secuencialusuarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SecuencialUsuarioConstantesFunciones.getClassesRelationshipsOfSecuencialUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SecuencialUsuarioConstantesFunciones.getClassesRelationshipsFromStringsOfSecuencialUsuario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSecuencialUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SecuencialUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencialusuario,new Object(),generalEntityParameterGeneral,this.secuencialusuarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSecuencialUsuario(SecuencialUsuarioBean secuencialusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSecuencialUsuario(ArrayList<Classe> classes,SecuencialUsuarioReturnGeneral secuencialusuarioReturnGeneral,SecuencialUsuarioBean secuencialusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSecuencialUsuario(SecuencialUsuario secuencialusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.secuencialusuario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSecuencialUsuario = new SecuencialUsuarioDetalleFormJInternalFrame(jDesktopPane,this.secuencialusuarioSessionBean.getConGuardarRelaciones(),this.secuencialusuarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.setVisible(false);
		this.jInternalFrameDetalleFormSecuencialUsuario.setSelected(false);						
		
		this.jInternalFrameDetalleFormSecuencialUsuario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSecuencialUsuario.secuencialusuarioLogic=this.secuencialusuarioLogic;
		
		this.cargarCombosFrameForeignKeySecuencialUsuario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSecuencialUsuario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSecuencialUsuario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySecuencialUsuario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySecuencialUsuario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSecuencialUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSecuencialUsuario"));
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"ModificarSecuencialUsuario"));

		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarSecuencialUsuario"));
					
		this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemModificarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarSecuencialUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"ActualizarSecuencialUsuario"));
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSecuencialUsuario"));
						
		this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemActualizarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSecuencialUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"EliminarSecuencialUsuario"));
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarSecuencialUsuario"));
								
		this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemEliminarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSecuencialUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CancelarSecuencialUsuario"));
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarSecuencialUsuario"));
					
		this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemCancelarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSecuencialUsuario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemDetalleCerrarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSecuencialUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSecuencialUsuario"));
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSecuencialUsuario"));
		
		
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSecuencialUsuario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonidSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_empresaSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_empresaSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_sucursalSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_sucursalSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_usuarioSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_usuarioSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonserieSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"serieSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonautorizacionSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonsecuencialSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtondigitosSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"digitosSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonfecha_inicioSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonfecha_finSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonesta_activoSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoSecuencialUsuarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSecuencialUsuario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSecuencialUsuario"));
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSecuencialUsuario"));
		}
		
		this.jTableDatosSecuencialUsuario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSecuencialUsuario"));
		
		this.jTableDatosSecuencialUsuario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSecuencialUsuario"));
		
		this.jButtonNuevoSecuencialUsuario.addActionListener(new ButtonActionListener(this,"NuevoSecuencialUsuario"));
		
		this.jButtonDuplicarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"DuplicarSecuencialUsuario"));
		
		this.jButtonCopiarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"CopiarSecuencialUsuario"));
		
		this.jButtonVerFormSecuencialUsuario.addActionListener(new ButtonActionListener(this,"VerFormSecuencialUsuario"));
		
		
		this.jButtonNuevoToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"NuevoToolBarSecuencialUsuario"));
			
		this.jButtonDuplicarToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSecuencialUsuario"));
			
		this.jMenuItemNuevoSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSecuencialUsuario"));
			
		this.jMenuItemDuplicarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSecuencialUsuario"));		
		
		
		this.jButtonNuevoRelacionesSecuencialUsuario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSecuencialUsuario"));
		
		
		this.jButtonNuevoRelacionesToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSecuencialUsuario"));
			
		this.jMenuItemNuevoRelacionesSecuencialUsuario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSecuencialUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"ModificarSecuencialUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonModificarToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarSecuencialUsuario"));
			
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemModificarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarSecuencialUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"ActualizarSecuencialUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonActualizarToolBarSecuencialUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSecuencialUsuario"));
				
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemActualizarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSecuencialUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"EliminarSecuencialUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonEliminarToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarSecuencialUsuario"));
						
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemEliminarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSecuencialUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CancelarSecuencialUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonCancelarToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarSecuencialUsuario"));
			
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemCancelarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSecuencialUsuario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSecuencialUsuario"));		
		
		
		this.jButtonCerrarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CerrarSecuencialUsuario"));
		
		
		this.jButtonCerrarToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CerrarToolBarSecuencialUsuario"));
			
		this.jMenuItemCerrarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSecuencialUsuario"));
			
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jMenuItemDetalleCerrarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSecuencialUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosSecuencialUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSecuencialUsuario"));
		}
		
		this.jButtonCopiarToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CopiarToolBarSecuencialUsuario"));
			
		this.jButtonVerFormToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"VerFormToolBarSecuencialUsuario"));
		
		this.jMenuItemGuardarCambiosSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSecuencialUsuario"));
			
		this.jMenuItemCopiarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSecuencialUsuario"));		
		
		this.jMenuItemVerFormSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSecuencialUsuario"));		
		
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSecuencialUsuario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSecuencialUsuario"));
			
		this.jMenuItemGuardarCambiosTablaSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSecuencialUsuario"));		
		
		
		
		this.jButtonRecargarInformacionSecuencialUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionSecuencialUsuario"));
					
		this.jButtonRecargarInformacionToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSecuencialUsuario"));
		
		this.jMenuItemRecargarInformacionSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSecuencialUsuario"));		
		
		
		
		this.jButtonAnterioresSecuencialUsuario.addActionListener (new ButtonActionListener(this,"AnterioresSecuencialUsuario"));
		
		
		this.jButtonAnterioresToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSecuencialUsuario"));
		
		this.jMenuItemAnterioresSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSecuencialUsuario"));		
		
		
		this.jButtonSiguientesSecuencialUsuario.addActionListener (new ButtonActionListener(this,"SiguientesSecuencialUsuario"));
		
		
		this.jButtonSiguientesToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSecuencialUsuario"));
			
		this.jMenuItemSiguientesSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSecuencialUsuario"));
			
		this.jMenuItemAbrirOrderBySecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySecuencialUsuario"));
			
		this.jMenuItemMostrarOcultarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSecuencialUsuario"));
			
		this.jMenuItemDetalleAbrirOrderBySecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySecuencialUsuario"));
			
		this.jMenuItemDetalleMostarOcultarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSecuencialUsuario"));		
		
		
		this.jButtonNuevoGuardarCambiosSecuencialUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSecuencialUsuario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSecuencialUsuario"));
			
		this.jMenuItemNuevoGuardarCambiosSecuencialUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSecuencialUsuario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSecuencialUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSecuencialUsuario"));

		this.jCheckBoxSeleccionadosSecuencialUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSecuencialUsuario"));
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSecuencialUsuario"));
		}
		
		
		this.jComboBoxTiposRelacionesSecuencialUsuario.addActionListener (new ButtonActionListener(this,"TiposRelacionesSecuencialUsuario"));
			
		this.jComboBoxTiposAccionesSecuencialUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesSecuencialUsuario"));
					
		this.jComboBoxTiposSeleccionarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSecuencialUsuario"));
			
		this.jTextFieldValorCampoGeneralSecuencialUsuario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSecuencialUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonidSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_empresaSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_empresaSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_sucursalSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_sucursalSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_usuarioSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_usuarioSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonserieSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"serieSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonautorizacionSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonsecuencialSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtondigitosSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"digitosSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonfecha_inicioSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonfecha_finSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonesta_activoSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoSecuencialUsuarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorAutorizacionSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorAutorizacionSecuencialUsuario"));

			this.jButtonBusquedaPorFechaFinSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaFinSecuencialUsuario"));

			this.jButtonBusquedaPorFechaInicioSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaInicioSecuencialUsuario"));

			this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario"));

			this.jButtonBusquedaPorSerieSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorSerieSecuencialUsuario"));

			this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoGeneralSecuencialUsuario"));

			this.jButtonFK_IdUsuarioSecuencialUsuario.addActionListener(new ButtonActionListener(this,"FK_IdUsuarioSecuencialUsuario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSecuencialUsuario!=null) {
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSecuencialUsuario"));
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSecuencialUsuario"));
				this.jInternalFrameReporteDinamicoSecuencialUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSecuencialUsuario"));
			}
			
			//this.jButtonCerrarReporteDinamicoSecuencialUsuario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSecuencialUsuario"));				
			//this.jButtonGenerarReporteDinamicoSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSecuencialUsuario"));
			//this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSecuencialUsuario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSecuencialUsuario!=null) {
				this.jInternalFrameImportacionSecuencialUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSecuencialUsuario"));
				this.jInternalFrameImportacionSecuencialUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSecuencialUsuario"));
				this.jInternalFrameImportacionSecuencialUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSecuencialUsuario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySecuencialUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderBySecuencialUsuario"));
			
			this.jButtonAbrirOrderByToolBarSecuencialUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSecuencialUsuario"));			
			
			if(this.jInternalFrameOrderBySecuencialUsuario!=null) {
				this.jInternalFrameOrderBySecuencialUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySecuencialUsuario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencialUsuario.jTabbedPaneRelacionesSecuencialUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSecuencialUsuario"));
		
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
            		closingInternalFrameSecuencialUsuario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSecuencialUsuario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSecuencialUsuario = (JInternalFrameBase)event.getSource();
	            	
	            SecuencialUsuarioBeanSwingJInternalFrame jInternalFrameParent=(SecuencialUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormSecuencialUsuario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSecuencialUsuarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSecuencialUsuario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSecuencialUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSecuencialUsuario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSecuencialUsuario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSecuencialUsuario";
		inputMap = this.jButtonNuevoSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSecuencialUsuario";
		inputMap = this.jButtonNuevoRelacionesSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSecuencialUsuarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSecuencialUsuario";
		inputMap = this.jButtonModificarSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSecuencialUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSecuencialUsuario";
		inputMap = this.jButtonActualizarSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSecuencialUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSecuencialUsuario";
		inputMap = this.jButtonEliminarSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSecuencialUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSecuencialUsuario";
		inputMap = this.jButtonCancelarSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSecuencialUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSecuencialUsuario";
		inputMap = this.jButtonCerrarSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSecuencialUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSecuencialUsuario";
		inputMap = this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonGuardarCambiosSecuencialUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSecuencialUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSecuencialUsuario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSecuencialUsuarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSecuencialUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSecuencialUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSecuencialUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSecuencialUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSecuencialUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSecuencialUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonidSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_empresaSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_empresaSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_sucursalSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_sucursalSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_usuarioSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_usuarioSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioSecuencialUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_tipo_documento_generalSecuencialUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalSecuencialUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonid_tipo_documento_generalSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonserieSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"serieSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonautorizacionSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonsecuencialSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"secuencialSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtondigitosSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"digitosSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonfecha_inicioSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonfecha_finSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finSecuencialUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencialUsuario.jButtonesta_activoSecuencialUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoSecuencialUsuarioBusqueda"));
		
		
		this.jButtonBusquedaPorAutorizacionSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorAutorizacionSecuencialUsuario"));

		this.jButtonBusquedaPorFechaFinSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaFinSecuencialUsuario"));

		this.jButtonBusquedaPorFechaInicioSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaInicioSecuencialUsuario"));

		this.jButtonBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario"));

		this.jButtonBusquedaPorSerieSecuencialUsuario.addActionListener(new ButtonActionListener(this,"BusquedaPorSerieSecuencialUsuario"));

		this.jButtonFK_IdTipoDocumentoGeneralSecuencialUsuario.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoGeneralSecuencialUsuario"));

		this.jButtonFK_IdUsuarioSecuencialUsuario.addActionListener(new ButtonActionListener(this,"FK_IdUsuarioSecuencialUsuario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSecuencialUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSecuencialUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSecuencialUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSecuencialUsuario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSecuencialUsuario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
					secuencialusuarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SecuencialUsuario secuencialusuarioAux:secuencialusuarios) {
					secuencialusuarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSecuencialUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSecuencialUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
						secuencialusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SecuencialUsuario secuencialusuarioAux:secuencialusuarios) {
						secuencialusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
					
						if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							secuencialusuarioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SecuencialUsuario secuencialusuarioAux:secuencialusuarios) {
						
						if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							secuencialusuarioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSecuencialUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSecuencialUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSecuencialUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSecuencialUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSecuencialUsuario.getSelectedRows();
			
			SecuencialUsuario secuencialusuarioLocal=new SecuencialUsuario();
			
			//this.seleccionarTodosSecuencialUsuario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialusuarioLocal =(SecuencialUsuario) this.secuencialusuarioLogic.getSecuencialUsuarios().toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					secuencialusuarioLocal =(SecuencialUsuario) this.secuencialusuarios.toArray()[this.jTableDatosSecuencialUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				secuencialusuarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
						secuencialusuarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SecuencialUsuario secuencialusuarioAux:secuencialusuarios) {
						secuencialusuarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSecuencialUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSecuencialUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSecuencialUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSecuencialUsuarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSecuencialUsuarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSecuencialUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSecuencialUsuario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSecuencialUsuario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarioLogic.getSecuencialUsuarios()) {
				
						if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							secuencialusuarioAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							secuencialusuarioAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							secuencialusuarioAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS)) {
							existe=true;
							secuencialusuarioAux.setdigitos(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							secuencialusuarioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							secuencialusuarioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SecuencialUsuario secuencialusuarioAux:secuencialusuarios) {
					
						if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							secuencialusuarioAux.setserie(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							secuencialusuarioAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							secuencialusuarioAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS)) {
							existe=true;
							secuencialusuarioAux.setdigitos(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							secuencialusuarioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							secuencialusuarioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSecuencialUsuarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSecuencialUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSecuencialUsuario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSecuencialUsuario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSecuencialUsuario) {				
					conSplash=true;//false;										
					
					//this.startProcessSecuencialUsuario(conSplash);
				
					this.generarReporteSecuencialUsuariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSecuencialUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSecuencialUsuariosSeleccionados(false);
				//this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSecuencialUsuariosSeleccionados(true);
				//this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSecuencialUsuario();
				
				this.exportarSecuencialUsuariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSecuencialUsuarios();
				//this.importarSecuencialUsuarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSecuencialUsuario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSecuencialUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Secuencial Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSecuencialUsuario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSecuencialUsuario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySecuencialUsuario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
				}	
			} 			
			else if(SecuencialUsuarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSecuencialUsuario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSecuencialUsuario(conSplash);
					
						//this.actualizarParametrosGeneralSecuencialUsuario();
						
						this.generarReporteProcesoAccionSecuencialUsuariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SecuencialUsuarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Secuencial UsuarioS SELECCIONADOS?", "MANTENIMIENTO DE Secuencial Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSecuencialUsuario();
				
						this.actualizarParametrosGeneralSecuencialUsuario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.secuencialusuarioReturnGeneral=secuencialusuarioLogic.procesarAccionSecuencialUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.secuencialusuarioLogic.getSecuencialUsuarios(),this.secuencialusuarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSecuencialUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSecuencialUsuario();
					
					SecuencialUsuarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSecuencialUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSecuencialUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxTiposAccionesFormularioSecuencialUsuario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSecuencialUsuario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSecuencialUsuarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSecuencialUsuario();
			
			if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
			SecuencialUsuario secuencialusuario=new SecuencialUsuario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSecuencialUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSecuencialUsuario.getSelectedItem();
			
			
			
			
			secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(secuencialusuariosSeleccionados.size()==1) {
				for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosSeleccionados) {
					secuencialusuario=secuencialusuarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSecuencialUsuario();
			
      		//this.finishProcessSecuencialUsuario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSecuencialUsuarioReturnGeneral() throws Exception {
		if(this.secuencialusuarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.secuencialusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.secuencialusuarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.secuencialusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.secuencialusuarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.secuencialusuarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSecuencialUsuario(false);
		}
		
		if(this.secuencialusuarioReturnGeneral.getConRetornoLista() || this.secuencialusuarioReturnGeneral.getConRetornoObjeto()) {
			if(this.secuencialusuarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.secuencialusuarioLogic.setSecuencialUsuarios(this.secuencialusuarioReturnGeneral.getSecuencialUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.secuencialusuarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.secuencialusuarioLogic.setSecuencialUsuario(this.secuencialusuarioReturnGeneral.getSecuencialUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSecuencialUsuario(false);
		}
	}
	
	public void actualizarParametrosGeneralSecuencialUsuario() throws Exception {
		
		
	}
	
	public ArrayList<SecuencialUsuario> getSecuencialUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSecuencialUsuario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SecuencialUsuario secuencialusuarioAux:secuencialusuarioLogic.getSecuencialUsuarios()) {
					if(secuencialusuarioAux.getIsSelected()) {
						secuencialusuariosSeleccionados.add(secuencialusuarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SecuencialUsuario secuencialusuarioAux:this.secuencialusuarios) {
					if(secuencialusuarioAux.getIsSelected()) {
						secuencialusuariosSeleccionados.add(secuencialusuarioAux);				
					}
				}
			}
			
			if(secuencialusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						secuencialusuariosSeleccionados.addAll(this.secuencialusuarioLogic.getSecuencialUsuarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						secuencialusuariosSeleccionados.addAll(this.secuencialusuarios);				
					}
				}
			}
		} else {
			secuencialusuariosSeleccionados.add(this.secuencialusuario);
		}
		
		return secuencialusuariosSeleccionados;
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
	
	public void generarReporteSecuencialUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSecuencialUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSecuencialUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSecuencialUsuariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSecuencialUsuariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Secuencial Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSecuencialUsuariosSeleccionados() throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados);
		
	}	
	
	public void generarReporteNormalSecuencialUsuariosSeleccionados() throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSecuencialUsuariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSecuencialUsuariosSeleccionados() throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSecuencialUsuario();
		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSecuencialUsuario();
		
		
		//this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados ,secuencialusuarioImplementable,secuencialusuarioImplementableHome);
	}
	
	public void mostrarImportacionSecuencialUsuarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSecuencialUsuario();
		
		this.abrirFrameImportacionSecuencialUsuario();		
		
			
		//this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados ,secuencialusuarioImplementable,secuencialusuarioImplementableHome);
	}
	
	public void importarSecuencialUsuarios() throws Exception {		
	
	}
	
	public void exportarSecuencialUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSecuencialUsuariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSecuencialUsuariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSecuencialUsuariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Secuencial Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSecuencialUsuariosSeleccionados() throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSecuencialUsuario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSecuencialUsuario(secuencialusuarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//secuencialusuarioAux.setsDetalleGeneralEntityReporte(secuencialusuarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSecuencialUsuario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_SERIE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSecuencialUsuario(SecuencialUsuario secuencialusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=secuencialusuario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.gettipodocumentogeneral_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getserie();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getautorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getdigitos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencialusuario.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSecuencialUsuariosSeleccionados() throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SecuencialUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSecuencialUsuario(row);				
				iRow++;
			}				
			
			for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSecuencialUsuario(secuencialusuarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSecuencialUsuariosSeleccionados() throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();		
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencialusuario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("secuencialusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("secuencialusuario");
			//elementRoot.appendChild(element);
		
			for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosSeleccionados) {
				element = document.createElement("secuencialusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSecuencialUsuario(secuencialusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSecuencialUsuario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_SERIE);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSecuencialUsuario(SecuencialUsuario secuencialusuario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.gettipodocumentogeneral_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getserie());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getautorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getdigitos());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencialusuario.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlSecuencialUsuario(SecuencialUsuario secuencialusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SecuencialUsuarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(secuencialusuario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SecuencialUsuarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(secuencialusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SecuencialUsuarioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(secuencialusuario.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SecuencialUsuarioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(secuencialusuario.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(SecuencialUsuarioConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(secuencialusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementtipodocumentogeneral_descripcion = document.createElement(SecuencialUsuarioConstantesFunciones.IDTIPODOCUMENTOGENERAL);
		elementtipodocumentogeneral_descripcion.appendChild(document.createTextNode(secuencialusuario.gettipodocumentogeneral_descripcion()));
		element.appendChild(elementtipodocumentogeneral_descripcion);

		Element elementserie = document.createElement(SecuencialUsuarioConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(secuencialusuario.getserie().trim()));
		element.appendChild(elementserie);

		Element elementautorizacion = document.createElement(SecuencialUsuarioConstantesFunciones.AUTORIZACION);
		elementautorizacion.appendChild(document.createTextNode(secuencialusuario.getautorizacion().trim()));
		element.appendChild(elementautorizacion);

		Element elementsecuencial = document.createElement(SecuencialUsuarioConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(secuencialusuario.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementdigitos = document.createElement(SecuencialUsuarioConstantesFunciones.DIGITOS);
		elementdigitos.appendChild(document.createTextNode(secuencialusuario.getdigitos().toString().trim()));
		element.appendChild(elementdigitos);

		Element elementfecha_inicio = document.createElement(SecuencialUsuarioConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(secuencialusuario.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(SecuencialUsuarioConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(secuencialusuario.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementesta_activo = document.createElement(SecuencialUsuarioConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(secuencialusuario.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoSecuencialUsuariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados=new ArrayList<SecuencialUsuario>();
		
		secuencialusuariosSeleccionados=this.getSecuencialUsuariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSecuencialUsuario(secuencialusuariosSeleccionados);
		
		this.generarReporteSecuencialUsuarios("Todos",secuencialusuariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSecuencialUsuario(ArrayList<SecuencialUsuario> secuencialusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SecuencialUsuario secuencialusuarioAux:secuencialusuariosSeleccionados) {
				secuencialusuarioAux.setsDetalleGeneralEntityReporte(secuencialusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.gettipodocumentogeneral_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getserie());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_AUTORIZACION)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getautorizacion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_DIGITOS)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(secuencialusuarioAux.getdigitos().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(secuencialusuarioAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(secuencialusuarioAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(SecuencialUsuarioConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					secuencialusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(secuencialusuarioAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSecuencialUsuario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSecuencialUsuario=true;
				this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=true;
				this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=true;
			}
			
			this.isVisibilidadCeldaModificarSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=false;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
			this.isVisibilidadCeldaModificarSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=true;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
			this.isVisibilidadCeldaModificarSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=true;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=true;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
			this.isVisibilidadCeldaModificarSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=true;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=true;
			this.isVisibilidadCeldaModificarSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=false;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=false;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
			this.isVisibilidadCeldaModificarSecuencialUsuario=true;
			this.isVisibilidadCeldaActualizarSecuencialUsuario=false;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
			this.isVisibilidadCeldaCancelarSecuencialUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarSecuencialUsuario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SecuencialUsuarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSecuencialUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=true;
		} else {
			this.actualizarEstadoPanelsSecuencialUsuario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSecuencialUsuario=false;
			//this.isVisibilidadCeldaVerFormSecuencialUsuario=false;
			this.isVisibilidadCeldaDuplicarSecuencialUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!secuencialusuarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
		} else {
			this.isVisibilidadCeldaNuevoSecuencialUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencialUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!secuencialusuarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;												
			}
			
			this.jButtonCerrarSecuencialUsuario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSecuencialUsuario=false;
		}
		
		if(!this.permiteMantenimiento(this.secuencialusuario)) {
			this.isVisibilidadCeldaActualizarSecuencialUsuario=false;
			this.isVisibilidadCeldaEliminarSecuencialUsuario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSecuencialUsuario() {
	}
	
	public void actualizarEstadoPanelsSecuencialUsuario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSecuencialUsuario!=null) {
				this.jScrollPanelDatosEdicionSecuencialUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencialUsuario!=null) {
				this.jScrollPanelDatosSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencialUsuario!=null) {
				this.jPanelPaginacionSecuencialUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
					this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.secuencialusuarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencialUsuario!=null) {
				this.jTabbedPaneBusquedasSecuencialUsuario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSecuencialUsuario!=null) {
				this.jPanelParametrosReportesSecuencialUsuario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorAutorizacion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorAutorizacion) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorAutorizacionSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaFin=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaFinSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaInicioSecuencialUsuario);}

			this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadBusquedaPorSerie=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorSerie) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorSerieSecuencialUsuario);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdUsuarioSecuencialUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorAutorizacion=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorAutorizacion) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorAutorizacionSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaFin=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaFinSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaInicioSecuencialUsuario);}

			this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadBusquedaPorSerie=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorSerie) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorSerieSecuencialUsuario);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdUsuarioSecuencialUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaPorAutorizacion=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorAutorizacion) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorAutorizacionSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaFin=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaFinSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaInicioSecuencialUsuario);}

			this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=isParaUsuario;
			if(!this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadBusquedaPorSerie=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorSerie) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorSerieSecuencialUsuario);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaUsuario;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdUsuarioSecuencialUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumentoGeneral(Boolean isParaTipoDocumentoGeneral){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoGeneralNegation=!isParaTipoDocumentoGeneral;

			this.isVisibilidadBusquedaPorAutorizacion=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorAutorizacion) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorAutorizacionSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaFin=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorFechaFin) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaFinSecuencialUsuario);}

			this.isVisibilidadBusquedaPorFechaInicio=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorFechaInicio) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorFechaInicioSecuencialUsuario);}

			this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral=isParaTipoDocumentoGeneral;
			if(!this.isVisibilidadBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadBusquedaPorSerie=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadBusquedaPorSerie) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelBusquedaPorSerieSecuencialUsuario);}

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaTipoDocumentoGeneral;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaTipoDocumentoGeneralNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasSecuencialUsuario.remove(jPanelFK_IdUsuarioSecuencialUsuario);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SecuencialUsuarioSessionBean secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		
		if(this.secuencialusuarioSessionBean==null) {
			this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		}
		
		this.secuencialusuarioSessionBean.setsUltimaBusquedaSecuencialUsuario(this.getsAccionBusqueda());
		this.secuencialusuarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.secuencialusuarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorAutorizacion")) {
			secuencialusuarioSessionBean.setautorizacion(this.getautorizacionBusquedaPorAutorizacion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaFin")) {
			secuencialusuarioSessionBean.setfecha_fin(this.getfecha_finBusquedaPorFechaFin());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaInicio")) {
			secuencialusuarioSessionBean.setfecha_inicio(this.getfecha_inicioBusquedaPorFechaInicio());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral")) {
			secuencialusuarioSessionBean.setid_usuario(this.getid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral());	
			secuencialusuarioSessionBean.setid_tipo_documento_general(this.getid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSerie")) {
			secuencialusuarioSessionBean.setserie(this.getserieBusquedaPorSerie());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			secuencialusuarioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			secuencialusuarioSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumentoGeneral")) {
			secuencialusuarioSessionBean.setid_tipo_documento_general(this.getid_tipo_documento_generalFK_IdTipoDocumentoGeneral());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			secuencialusuarioSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SecuencialUsuarioSessionBean secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		
		if(this.secuencialusuarioSessionBean==null) {
			this.secuencialusuarioSessionBean=new SecuencialUsuarioSessionBean();
		}
		
		if(this.secuencialusuarioSessionBean.getsUltimaBusquedaSecuencialUsuario()!=null&&!this.secuencialusuarioSessionBean.getsUltimaBusquedaSecuencialUsuario().equals("")) {
			this.setsAccionBusqueda(secuencialusuarioSessionBean.getsUltimaBusquedaSecuencialUsuario());
			this.setiNumeroPaginacion(secuencialusuarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(secuencialusuarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorAutorizacion")) {
				this.setautorizacionBusquedaPorAutorizacion(secuencialusuarioSessionBean.getautorizacion());
				secuencialusuarioSessionBean.setautorizacion("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaFin")) {
				this.setfecha_finBusquedaPorFechaFin(secuencialusuarioSessionBean.getfecha_fin());
				secuencialusuarioSessionBean.setfecha_fin(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaInicio")) {
				this.setfecha_inicioBusquedaPorFechaInicio(secuencialusuarioSessionBean.getfecha_inicio());
				secuencialusuarioSessionBean.setfecha_inicio(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral")) {
				this.setid_usuarioBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(secuencialusuarioSessionBean.getid_usuario());
				secuencialusuarioSessionBean.setid_usuario(-1L);
				this.setid_tipo_documento_generalBusquedaPorIdUsuarioPorIdTipoDocumentoGeneral(secuencialusuarioSessionBean.getid_tipo_documento_general());
				secuencialusuarioSessionBean.setid_tipo_documento_general(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSerie")) {
				this.setserieBusquedaPorSerie(secuencialusuarioSessionBean.getserie());
				secuencialusuarioSessionBean.setserie("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(secuencialusuarioSessionBean.getid_empresa());
				secuencialusuarioSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(secuencialusuarioSessionBean.getid_sucursal());
				secuencialusuarioSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumentoGeneral")) {
				this.setid_tipo_documento_generalFK_IdTipoDocumentoGeneral(secuencialusuarioSessionBean.getid_tipo_documento_general());
				secuencialusuarioSessionBean.setid_tipo_documento_general(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(secuencialusuarioSessionBean.getid_usuario());
				secuencialusuarioSessionBean.setid_usuario(-1L);
			}
		}
		
		this.secuencialusuarioSessionBean.setsUltimaBusquedaSecuencialUsuario("");
		this.secuencialusuarioSessionBean.setiNumeroPaginacion(SecuencialUsuarioConstantesFunciones.INUMEROPAGINACION);
		this.secuencialusuarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSecuencialUsuario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSecuencialUsuario() {
		this.updateBorderResaltarBusquedasFormularioSecuencialUsuario();
		this.updateVisibilidadBusquedasFormularioSecuencialUsuario();
		this.updateHabilitarBusquedasFormularioSecuencialUsuario();
	}
	
	public void updateBorderResaltarBusquedasFormularioSecuencialUsuario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSecuencialUsuario.getComponents().length>0) {
	

		if(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorAutorizacionSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorAutorizacionSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorAutorizacionSecuencialUsuario);
			}
		}

		if(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorFechaFinSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaFinSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorFechaFinSecuencialUsuario);
			}
		}

		if(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorFechaInicioSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaInicioSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorFechaInicioSecuencialUsuario);
			}
		}

		if(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			}
		}

		if(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorSerieSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorSerieSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorSerieSecuencialUsuario);
			}
		}

		if(this.secuencialusuarioConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralSecuencialUsuario);
			}
		}

		if(this.secuencialusuarioConstantesFunciones.resaltarFK_IdUsuarioSecuencialUsuario!=null) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdUsuarioSecuencialUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarFK_IdUsuarioSecuencialUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSecuencialUsuario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSecuencialUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorAutorizacionSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorAutorizacionSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorAutorizacionSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaFinSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorFechaFinSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorFechaFinSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaInicioSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorFechaInicioSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorFechaInicioSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorSerieSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorSerieSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarBusquedaPorSerieSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarFK_IdTipoDocumentoGeneralSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarFK_IdTipoDocumentoGeneralSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdUsuarioSecuencialUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialusuarioConstantesFunciones.mostrarFK_IdUsuarioSecuencialUsuario);
			if(!this.secuencialusuarioConstantesFunciones.mostrarFK_IdUsuarioSecuencialUsuario && index>-1) {
				this.jTabbedPaneBusquedasSecuencialUsuario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSecuencialUsuario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSecuencialUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorAutorizacionSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarBusquedaPorAutorizacionSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarBusquedaPorAutorizacionSecuencialUsuario);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaFinSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarBusquedaPorFechaFinSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarBusquedaPorFechaFinSecuencialUsuario);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaInicioSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarBusquedaPorFechaInicioSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarBusquedaPorFechaInicioSecuencialUsuario);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorSerieSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarBusquedaPorSerieSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarBusquedaPorSerieSecuencialUsuario);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarFK_IdTipoDocumentoGeneralSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarFK_IdTipoDocumentoGeneralSecuencialUsuario);
			}

			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdUsuarioSecuencialUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialusuarioConstantesFunciones.activarFK_IdUsuarioSecuencialUsuario);
				this.jTabbedPaneBusquedasSecuencialUsuario.setEnabledAt(index,this.secuencialusuarioConstantesFunciones.activarFK_IdUsuarioSecuencialUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSecuencialUsuario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorAutorizacion")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorAutorizacionSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarBusquedaPorAutorizacionSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorAutorizacionSecuencialUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaFin")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaFinSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarBusquedaPorFechaFinSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorFechaFinSecuencialUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaInicio")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorFechaInicioSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarBusquedaPorFechaInicioSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorFechaInicioSecuencialUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdUsuarioPorIdTipoDocumentoGeneral")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorIdUsuarioPorIdTipoDocumentoGeneralSecuencialUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSerie")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelBusquedaPorSerieSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarBusquedaPorSerieSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarBusquedaPorSerieSecuencialUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoDocumentoGeneral")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarFK_IdTipoDocumentoGeneralSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralSecuencialUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedasSecuencialUsuario.indexOfComponent(this.jPanelFK_IdUsuarioSecuencialUsuario);

			this.jTabbedPaneBusquedasSecuencialUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencialUsuario.getComponent(index);

			this.secuencialusuarioConstantesFunciones.setResaltarFK_IdUsuarioSecuencialUsuario(resaltar);

			jPanel.setBorder(this.secuencialusuarioConstantesFunciones.resaltarFK_IdUsuarioSecuencialUsuario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSecuencialUsuario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSecuencialUsuario() throws Exception {

		if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSecuencialUsuario();
		this.updateVisibilidadResaltarControlesFormularioSecuencialUsuario();
		this.updateHabilitarResaltarControlesFormularioSecuencialUsuario();
		
	}
	
	public void updateBorderResaltarControlesFormularioSecuencialUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.secuencialusuarioConstantesFunciones.resaltaridSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltaridSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarid_empresaSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarid_empresaSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarid_sucursalSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarid_sucursalSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarid_usuarioSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarid_usuarioSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarid_tipo_documento_generalSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarid_tipo_documento_generalSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarserieSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarserieSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarautorizacionSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarautorizacionSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarsecuencialSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarsecuencialSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltardigitosSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltardigitosSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarfecha_inicioSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarfecha_inicioSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltarfecha_finSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltarfecha_finSecuencialUsuario);}
		if(this.secuencialusuarioConstantesFunciones.resaltaresta_activoSecuencialUsuario!=null && this.jInternalFrameDetalleFormSecuencialUsuario!=null) {this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setBorderPainted(true);this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setBorder(this.secuencialusuarioConstantesFunciones.resaltaresta_activoSecuencialUsuario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSecuencialUsuario() throws Exception {		
		if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
	
		//this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostraridSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelidSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostraridSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_empresaSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelid_empresaSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_empresaSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_sucursalSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelid_sucursalSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_sucursalSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_usuarioSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelid_usuarioSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_usuarioSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_tipo_documento_generalSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelid_tipo_documento_generalSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarid_tipo_documento_generalSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarserieSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelserieSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarserieSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarautorizacionSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelautorizacionSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarautorizacionSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarsecuencialSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelsecuencialSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarsecuencialSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrardigitosSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPaneldigitosSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrardigitosSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarfecha_inicioSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelfecha_inicioSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarfecha_inicioSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarfecha_finSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelfecha_finSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostrarfecha_finSecuencialUsuario);
		//this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostraresta_activoSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jPanelesta_activoSecuencialUsuario.setVisible(this.secuencialusuarioConstantesFunciones.mostraresta_activoSecuencialUsuario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSecuencialUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormSecuencialUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSecuencialUsuario!=null) {
	
		this.jInternalFrameDetalleFormSecuencialUsuario.jLabelidSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activaridSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_empresaSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarid_empresaSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_sucursalSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarid_sucursalSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_usuarioSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarid_usuarioSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jComboBoxid_tipo_documento_generalSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarid_tipo_documento_generalSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldserieSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarserieSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldautorizacionSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarautorizacionSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFieldsecuencialSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarsecuencialSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jTextFielddigitosSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activardigitosSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_inicioSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarfecha_inicioSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jDateChooserfecha_finSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activarfecha_finSecuencialUsuario);
		this.jInternalFrameDetalleFormSecuencialUsuario.jCheckBoxesta_activoSecuencialUsuario.setEnabled(this.secuencialusuarioConstantesFunciones.activaresta_activoSecuencialUsuario);
		}
	}
	
		
}