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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.DatoGeneralUsuarioConstantesFunciones;
import com.bydan.erp.seguridad.util.DatoGeneralUsuarioParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.DatoGeneralUsuarioParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.DatoGeneralUsuarioBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class DatoGeneralUsuarioBeanSwingJInternalFrame extends DatoGeneralUsuarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DatoGeneralUsuarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DatoGeneralUsuario> datogeneralusuarioValidator = new ClassValidator<DatoGeneralUsuario>(DatoGeneralUsuario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DatoGeneralUsuario datogeneralusuario;	
	public DatoGeneralUsuario datogeneralusuarioAux;
	public DatoGeneralUsuario datogeneralusuarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DatoGeneralUsuario datogeneralusuarioTotales;
	public Long idDatoGeneralUsuarioActual;
	public Long iIdNuevoDatoGeneralUsuario=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboProvincia="";

	public List<Provincia> provinciasForeignKey;

	public List<Provincia> getprovinciasForeignKey() {
		return provinciasForeignKey;
	}

	public void setprovinciasForeignKey(List<Provincia> provinciasForeignKey) {
		this.provinciasForeignKey = provinciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Provincia provinciaForeignKey;

	public Provincia getprovinciaForeignKey() {
		return provinciaForeignKey;
	}

	public void setprovinciaForeignKey(Provincia provinciaForeignKey) {
		this.provinciaForeignKey = provinciaForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
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
	
	public Boolean isPermisoTodoDatoGeneralUsuario;
	public Boolean isPermisoNuevoDatoGeneralUsuario;
	public Boolean isPermisoActualizarDatoGeneralUsuario;
	public Boolean isPermisoActualizarOriginalDatoGeneralUsuario;
	public Boolean isPermisoEliminarDatoGeneralUsuario;
	public Boolean isPermisoGuardarCambiosDatoGeneralUsuario;
	public Boolean isPermisoConsultaDatoGeneralUsuario;
	public Boolean isPermisoBusquedaDatoGeneralUsuario;
	public Boolean isPermisoReporteDatoGeneralUsuario;
	public Boolean isPermisoPaginacionMedioDatoGeneralUsuario;
	public Boolean isPermisoPaginacionAltoDatoGeneralUsuario;
	public Boolean isPermisoPaginacionTodoDatoGeneralUsuario;
	public Boolean isPermisoCopiarDatoGeneralUsuario;
	public Boolean isPermisoVerFormDatoGeneralUsuario;
	public Boolean isPermisoDuplicarDatoGeneralUsuario;
	public Boolean isPermisoOrdenDatoGeneralUsuario;
	
	
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
	
	public DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioReturnGeneral;
	public DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDatoGeneralUsuario=false;
	public Boolean esParaAccionDesdeFormularioDatoGeneralUsuario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DatoGeneralUsuarioSessionBeanAdditional datogeneralusuarioSessionBeanAdditional=null;
	
	public DatoGeneralUsuarioSessionBeanAdditional getDatoGeneralUsuarioSessionBeanAdditional() {
		return this.datogeneralusuarioSessionBeanAdditional;
	}
	
	public void setDatoGeneralUsuarioSessionBeanAdditional(DatoGeneralUsuarioSessionBeanAdditional datogeneralusuarioSessionBeanAdditional) {
		try {
			this.datogeneralusuarioSessionBeanAdditional=datogeneralusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DatoGeneralUsuarioBeanSwingJInternalFrameAdditional datogeneralusuarioBeanSwingJInternalFrameAdditional=null;
	//public class DatoGeneralUsuarioBeanSwingJInternalFrame
	
	public DatoGeneralUsuarioBeanSwingJInternalFrameAdditional getDatoGeneralUsuarioBeanSwingJInternalFrameAdditional() {
		return this.datogeneralusuarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setDatoGeneralUsuarioBeanSwingJInternalFrameAdditional(DatoGeneralUsuarioBeanSwingJInternalFrameAdditional datogeneralusuarioBeanSwingJInternalFrameAdditional) {
		try {
			this.datogeneralusuarioBeanSwingJInternalFrameAdditional=datogeneralusuarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DatoGeneralUsuarioLogic datogeneralusuarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DatoGeneralUsuario datogeneralusuarioBean;
	public DatoGeneralUsuarioConstantesFunciones datogeneralusuarioConstantesFunciones;
	//public DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioReturnGeneral;
	
	//FK
	
	public UsuarioLogic usuarioLogic;
	public PaisLogic paisLogic;
	public ProvinciaLogic provinciaLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<DatoGeneralUsuario> datogeneralusuarios;	
	//public List<DatoGeneralUsuario> datogeneralusuariosEliminados;
	//public List<DatoGeneralUsuario> datogeneralusuariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
	public Boolean isVisibilidadCeldaDuplicarDatoGeneralUsuario=true;
	public Boolean isVisibilidadCeldaCopiarDatoGeneralUsuario=true;
	public Boolean isVisibilidadCeldaVerFormDatoGeneralUsuario=true;
	public Boolean isVisibilidadCeldaOrdenDatoGeneralUsuario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
	public Boolean isVisibilidadCeldaModificarDatoGeneralUsuario=false;
	public Boolean isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
	public Boolean isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
	public Boolean isVisibilidadCeldaCancelarDatoGeneralUsuario=false;
	public Boolean isVisibilidadCeldaGuardarDatoGeneralUsuario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoDatoGeneralUsuario() {
		return this.iIdNuevoDatoGeneralUsuario;
	}

	public void setiIdNuevoDatoGeneralUsuario(Long iIdNuevoDatoGeneralUsuario) {
		this.iIdNuevoDatoGeneralUsuario = iIdNuevoDatoGeneralUsuario;
	}
	
	public Long getidDatoGeneralUsuarioActual() {
		return this.idDatoGeneralUsuarioActual;
	}

	public void setidDatoGeneralUsuarioActual(Long idDatoGeneralUsuarioActual) {
		this.idDatoGeneralUsuarioActual = idDatoGeneralUsuarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DatoGeneralUsuario getdatogeneralusuario() {
		return this.datogeneralusuario;
	}

	public void setdatogeneralusuario(DatoGeneralUsuario datogeneralusuario) {
		this.datogeneralusuario = datogeneralusuario;
	}
	
	public DatoGeneralUsuario getdatogeneralusuarioAux() {
		return this.datogeneralusuarioAux;
	}

	public void setdatogeneralusuarioAux(DatoGeneralUsuario datogeneralusuarioAux) {
		this.datogeneralusuarioAux = datogeneralusuarioAux;
	}				
	
	public DatoGeneralUsuario getdatogeneralusuarioAnterior() {
		return this.datogeneralusuarioAnterior;
	}

	public void setdatogeneralusuarioAnterior(DatoGeneralUsuario datogeneralusuarioAnterior) {
		this.datogeneralusuarioAnterior = datogeneralusuarioAnterior;
	}	
	
	public DatoGeneralUsuario getdatogeneralusuarioTotales() {
		return this.datogeneralusuarioTotales;
	}

	public void setdatogeneralusuarioTotales(DatoGeneralUsuario datogeneralusuarioTotales) {
		this.datogeneralusuarioTotales = datogeneralusuarioTotales;
	}	
	
	public DatoGeneralUsuario getdatogeneralusuarioBean() {
		return this.datogeneralusuarioBean;
	}

	public void setdatogeneralusuarioBean(DatoGeneralUsuario datogeneralusuarioBean) {
		this.datogeneralusuarioBean = datogeneralusuarioBean;
	}	
	
	public DatoGeneralUsuarioParameterReturnGeneral getdatogeneralusuarioReturnGeneral() {
		return this.datogeneralusuarioReturnGeneral;
	}

	public void setdatogeneralusuarioReturnGeneral(DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioReturnGeneral) {
		this.datogeneralusuarioReturnGeneral = datogeneralusuarioReturnGeneral;
	}	
	
	
	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_provinciaFK_IdProvincia=-1L;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
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
	
	
	public DatoGeneralUsuarioLogic getDatoGeneralUsuarioLogic()	{		
		return datogeneralusuarioLogic;
	}

	public void setDatoGeneralUsuarioLogic(DatoGeneralUsuarioLogic datogeneralusuarioLogic) {
		this.datogeneralusuarioLogic = datogeneralusuarioLogic;
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
	
	public Boolean getIsEsNuevoDatoGeneralUsuario() {
		return isEsNuevoDatoGeneralUsuario;
	}

	public void setIsEsNuevoDatoGeneralUsuario(Boolean isEsNuevoDatoGeneralUsuario) {
		this.isEsNuevoDatoGeneralUsuario = isEsNuevoDatoGeneralUsuario;
	}

	public Boolean getEsParaAccionDesdeFormularioDatoGeneralUsuario() {
		return esParaAccionDesdeFormularioDatoGeneralUsuario;
	}
	
	public void setEsParaAccionDesdeFormularioDatoGeneralUsuario(Boolean esParaAccionDesdeFormularioDatoGeneralUsuario) {
		this.esParaAccionDesdeFormularioDatoGeneralUsuario = esParaAccionDesdeFormularioDatoGeneralUsuario;
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

			usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.datogeneralusuarioSessionBean==null) {
				this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
			}

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

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
					usuarioLogic.getEntityWithConnection(datogeneralusuarioSessionBean.getlidUsuarioActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.datogeneralusuarioSessionBean==null) {
				this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
			}

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(datogeneralusuarioSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosProvinciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.provinciasForeignKey=new ArrayList<Provincia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProvinciaLogic provinciaLogic=new ProvinciaLogic();

			provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.datogeneralusuarioSessionBean==null) {
				this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
			}

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

					provinciaLogic.getTodosProvinciasWithConnection(sFinalQuery,new Pagination());

					this.provinciasForeignKey=provinciaLogic.getProvincias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProvincia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getEntityWithConnection(datogeneralusuarioSessionBean.getlidProvinciaActual());
					this.provinciasForeignKey.add(provinciaLogic.getProvincia());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.datogeneralusuarioSessionBean==null) {
				this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
			}

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(datogeneralusuarioSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.datogeneralusuario!=null) {
						this.datogeneralusuario.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioDatoGeneralUsuario.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario!=null) {
						jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario!=null) {
							//jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.getItemCount()>0) {
								jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioDatoGeneralUsuarioGenerico)throws Exception
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
				jComboBoxid_usuarioDatoGeneralUsuarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioDatoGeneralUsuarioGenerico!=null && jComboBoxid_usuarioDatoGeneralUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioDatoGeneralUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.datogeneralusuario!=null) {
						this.datogeneralusuario.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisDatoGeneralUsuario.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisDatoGeneralUsuario!=null) {
						jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisDatoGeneralUsuario!=null) {
							//jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisDatoGeneralUsuarioGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisDatoGeneralUsuarioGenerico!=null && jComboBoxid_paisDatoGeneralUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_paisDatoGeneralUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProvinciaForeignKey(Long idProvinciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(provinciaTemp!=null) {

					if(this.datogeneralusuario!=null) {
						this.datogeneralusuario.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaDatoGeneralUsuario.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario!=null) {
						jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario!=null) {
							//jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.getItemCount()>0) {
								jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setSelectedIndex(0);
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

	public String getActualProvinciaForeignKeyDescripcion(Long idProvinciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}


			sDescripcion=ProvinciaConstantesFunciones.getProvinciaDescripcion(provinciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(provinciaTemp!=null) {
				jComboBoxid_provinciaDatoGeneralUsuarioGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaDatoGeneralUsuarioGenerico!=null && jComboBoxid_provinciaDatoGeneralUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_provinciaDatoGeneralUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.datogeneralusuario!=null) {
						this.datogeneralusuario.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadDatoGeneralUsuario.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario!=null) {
						jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario!=null) {
							//jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.getItemCount()>0) {
								jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadDatoGeneralUsuarioGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadDatoGeneralUsuarioGenerico!=null && jComboBoxid_ciudadDatoGeneralUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_ciudadDatoGeneralUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(DatoGeneralUsuario datogeneralusuario,JComboBox jComboBoxid_usuarioDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioDatoGeneralUsuarioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioDatoGeneralUsuarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				datogeneralusuario.setid_usuario(usuarioAux.getId());
				datogeneralusuario.setusuario_descripcion(DatoGeneralUsuarioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				datogeneralusuario.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(DatoGeneralUsuario datogeneralusuario,JComboBox jComboBoxid_paisDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisDatoGeneralUsuarioGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisDatoGeneralUsuarioGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				datogeneralusuario.setid_pais(paisAux.getId());
				datogeneralusuario.setpais_descripcion(DatoGeneralUsuarioConstantesFunciones.getPaisDescripcion(paisAux));
				datogeneralusuario.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(DatoGeneralUsuario datogeneralusuario,JComboBox jComboBoxid_provinciaDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaDatoGeneralUsuarioGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaDatoGeneralUsuarioGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				datogeneralusuario.setid_provincia(provinciaAux.getId());
				datogeneralusuario.setprovincia_descripcion(DatoGeneralUsuarioConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				datogeneralusuario.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(DatoGeneralUsuario datogeneralusuario,JComboBox jComboBoxid_ciudadDatoGeneralUsuarioGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadDatoGeneralUsuarioGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadDatoGeneralUsuarioGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				datogeneralusuario.setid_ciudad(ciudadAux.getId());
				datogeneralusuario.setciudad_descripcion(DatoGeneralUsuarioConstantesFunciones.getCiudadDescripcion(ciudadAux));
				datogeneralusuario.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
					}

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.addItem(usuario);
							}
						}

						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
					}

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.addItem(pais);
							}
						}

						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
					}

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.addItem(provincia);
							}
						}

						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { 
					}

					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.addItem(ciudad);
							}
						}

						if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDatoGeneralUsuario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DatoGeneralUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesDatoGeneralUsuario(this.datogeneralusuarioLogic.getDatoGeneralUsuarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DatoGeneralUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesDatoGeneralUsuario(this.datogeneralusuarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Provincia.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//datogeneralusuarioLogic.setDatoGeneralUsuarios(this.datogeneralusuarios);
			datogeneralusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DatoGeneralUsuarioParameterReturnGeneral getDatoGeneralUsuarioParameterGeneral() {
		return this.datogeneralusuarioParameterGeneral;
	}
	
	public void setDatoGeneralUsuarioParameterGeneral(DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioParameterGeneral) {
		this.datogeneralusuarioParameterGeneral = datogeneralusuarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDatoGeneralUsuario() {
		return isPermisoTodoDatoGeneralUsuario;
	}

	public void setIsPermisoTodoDatoGeneralUsuario(Boolean isPermisoTodoDatoGeneralUsuario) {
		this.isPermisoTodoDatoGeneralUsuario = isPermisoTodoDatoGeneralUsuario;
	}

	public Boolean getIsPermisoNuevoDatoGeneralUsuario() {
		return isPermisoNuevoDatoGeneralUsuario;
	}

	public void setIsPermisoNuevoDatoGeneralUsuario(Boolean isPermisoNuevoDatoGeneralUsuario) {
		this.isPermisoNuevoDatoGeneralUsuario = isPermisoNuevoDatoGeneralUsuario;
	}

	public Boolean getIsPermisoActualizarDatoGeneralUsuario() {
		return isPermisoActualizarDatoGeneralUsuario;
	}

	public void setIsPermisoActualizarDatoGeneralUsuario(Boolean isPermisoActualizarDatoGeneralUsuario) {
		this.isPermisoActualizarDatoGeneralUsuario = isPermisoActualizarDatoGeneralUsuario;
	}

	public Boolean getIsPermisoEliminarDatoGeneralUsuario() {
		return isPermisoEliminarDatoGeneralUsuario;
	}

	public void setIsPermisoEliminarDatoGeneralUsuario(Boolean isPermisoEliminarDatoGeneralUsuario) {
		this.isPermisoEliminarDatoGeneralUsuario = isPermisoEliminarDatoGeneralUsuario;
	}

	public Boolean getIsPermisoGuardarCambiosDatoGeneralUsuario() {
		return isPermisoGuardarCambiosDatoGeneralUsuario;
	}

	public void setIsPermisoGuardarCambiosDatoGeneralUsuario(Boolean isPermisoGuardarCambiosDatoGeneralUsuario) {
		this.isPermisoGuardarCambiosDatoGeneralUsuario = isPermisoGuardarCambiosDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoConsultaDatoGeneralUsuario() {
		return isPermisoConsultaDatoGeneralUsuario;
	}

	public void setIsPermisoConsultaDatoGeneralUsuario(Boolean isPermisoConsultaDatoGeneralUsuario) {
		this.isPermisoConsultaDatoGeneralUsuario = isPermisoConsultaDatoGeneralUsuario;
	}

	public Boolean getIsPermisoBusquedaDatoGeneralUsuario() {
		return isPermisoBusquedaDatoGeneralUsuario;
	}

	public void setIsPermisoBusquedaDatoGeneralUsuario(Boolean isPermisoBusquedaDatoGeneralUsuario) {
		this.isPermisoBusquedaDatoGeneralUsuario = isPermisoBusquedaDatoGeneralUsuario;
	}

	public Boolean getIsPermisoReporteDatoGeneralUsuario() {
		return isPermisoReporteDatoGeneralUsuario;
	}

	public void setIsPermisoReporteDatoGeneralUsuario(Boolean isPermisoReporteDatoGeneralUsuario) {
		this.isPermisoReporteDatoGeneralUsuario = isPermisoReporteDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoPaginacionMedioDatoGeneralUsuario() {
		return isPermisoPaginacionMedioDatoGeneralUsuario;
	}

	public void setIsPermisoPaginacionMedioDatoGeneralUsuario(Boolean isPermisoPaginacionMedioDatoGeneralUsuario) {
		this.isPermisoPaginacionMedioDatoGeneralUsuario = isPermisoPaginacionMedioDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoPaginacionTodoDatoGeneralUsuario() {
		return isPermisoPaginacionTodoDatoGeneralUsuario;
	}

	public void setIsPermisoPaginacionTodoDatoGeneralUsuario(Boolean isPermisoPaginacionTodoDatoGeneralUsuario) {
		this.isPermisoPaginacionTodoDatoGeneralUsuario = isPermisoPaginacionTodoDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoPaginacionAltoDatoGeneralUsuario() {
		return isPermisoPaginacionAltoDatoGeneralUsuario;
	}

	public void setIsPermisoPaginacionAltoDatoGeneralUsuario(Boolean isPermisoPaginacionAltoDatoGeneralUsuario) {
		this.isPermisoPaginacionAltoDatoGeneralUsuario = isPermisoPaginacionAltoDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoCopiarDatoGeneralUsuario() {
		return isPermisoCopiarDatoGeneralUsuario;
	}

	public void setIsPermisoCopiarDatoGeneralUsuario(Boolean isPermisoCopiarDatoGeneralUsuario) {
		this.isPermisoCopiarDatoGeneralUsuario = isPermisoCopiarDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoVerFormDatoGeneralUsuario() {
		return isPermisoVerFormDatoGeneralUsuario;
	}

	public void setIsPermisoVerFormDatoGeneralUsuario(Boolean isPermisoVerFormDatoGeneralUsuario) {
		this.isPermisoVerFormDatoGeneralUsuario = isPermisoVerFormDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoDuplicarDatoGeneralUsuario() {
		return isPermisoDuplicarDatoGeneralUsuario;
	}

	public void setIsPermisoDuplicarDatoGeneralUsuario(Boolean isPermisoDuplicarDatoGeneralUsuario) {
		this.isPermisoDuplicarDatoGeneralUsuario = isPermisoDuplicarDatoGeneralUsuario;
	}
	
	public Boolean getIsPermisoOrdenDatoGeneralUsuario() {
		return isPermisoOrdenDatoGeneralUsuario;
	}

	public void setIsPermisoOrdenDatoGeneralUsuario(Boolean isPermisoOrdenDatoGeneralUsuario) {
		this.isPermisoOrdenDatoGeneralUsuario = isPermisoOrdenDatoGeneralUsuario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDatoGeneralUsuario() {
		return isVisibilidadCeldaNuevoDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaNuevoDatoGeneralUsuario(Boolean isVisibilidadCeldaNuevoDatoGeneralUsuario) {
		this.isVisibilidadCeldaNuevoDatoGeneralUsuario = isVisibilidadCeldaNuevoDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDatoGeneralUsuario() {
		return isVisibilidadCeldaDuplicarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaDuplicarDatoGeneralUsuario(Boolean isVisibilidadCeldaDuplicarDatoGeneralUsuario) {
		this.isVisibilidadCeldaDuplicarDatoGeneralUsuario = isVisibilidadCeldaDuplicarDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDatoGeneralUsuario() {
		return isVisibilidadCeldaCopiarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaCopiarDatoGeneralUsuario(Boolean isVisibilidadCeldaCopiarDatoGeneralUsuario) {
		this.isVisibilidadCeldaCopiarDatoGeneralUsuario = isVisibilidadCeldaCopiarDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDatoGeneralUsuario() {
		return isVisibilidadCeldaVerFormDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaVerFormDatoGeneralUsuario(Boolean isVisibilidadCeldaVerFormDatoGeneralUsuario) {
		this.isVisibilidadCeldaVerFormDatoGeneralUsuario = isVisibilidadCeldaVerFormDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDatoGeneralUsuario() {
		return isVisibilidadCeldaOrdenDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaOrdenDatoGeneralUsuario(Boolean isVisibilidadCeldaOrdenDatoGeneralUsuario) {
		this.isVisibilidadCeldaOrdenDatoGeneralUsuario = isVisibilidadCeldaOrdenDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario() {
		return isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario(Boolean isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario) {
		this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario = isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDatoGeneralUsuario() {
		return isVisibilidadCeldaModificarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaModificarDatoGeneralUsuario(Boolean isVisibilidadCeldaModificarDatoGeneralUsuario) {
		this.isVisibilidadCeldaModificarDatoGeneralUsuario = isVisibilidadCeldaModificarDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDatoGeneralUsuario() {
		return isVisibilidadCeldaActualizarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaActualizarDatoGeneralUsuario(Boolean isVisibilidadCeldaActualizarDatoGeneralUsuario) {
		this.isVisibilidadCeldaActualizarDatoGeneralUsuario = isVisibilidadCeldaActualizarDatoGeneralUsuario;
	}

	public Boolean getIsVisibilidadCeldaEliminarDatoGeneralUsuario() {
		return isVisibilidadCeldaEliminarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaEliminarDatoGeneralUsuario(Boolean isVisibilidadCeldaEliminarDatoGeneralUsuario) {
		this.isVisibilidadCeldaEliminarDatoGeneralUsuario = isVisibilidadCeldaEliminarDatoGeneralUsuario;
	}

	public Boolean getIsVisibilidadCeldaCancelarDatoGeneralUsuario() {
		return isVisibilidadCeldaCancelarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaCancelarDatoGeneralUsuario(Boolean isVisibilidadCeldaCancelarDatoGeneralUsuario) {
		this.isVisibilidadCeldaCancelarDatoGeneralUsuario = isVisibilidadCeldaCancelarDatoGeneralUsuario;
	}

	public Boolean getIsVisibilidadCeldaGuardarDatoGeneralUsuario() {
		return isVisibilidadCeldaGuardarDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaGuardarDatoGeneralUsuario(Boolean isVisibilidadCeldaGuardarDatoGeneralUsuario) {
		this.isVisibilidadCeldaGuardarDatoGeneralUsuario = isVisibilidadCeldaGuardarDatoGeneralUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDatoGeneralUsuario() {
		return isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDatoGeneralUsuario(Boolean isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario) {
		this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario = isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario;
	}
		
	public DatoGeneralUsuarioSessionBean getdatogeneralusuarioSessionBean() {
		return this.datogeneralusuarioSessionBean;
	}
	
	public void setdatogeneralusuarioSessionBean(DatoGeneralUsuarioSessionBean datogeneralusuarioSessionBean) {
		this.datogeneralusuarioSessionBean=datogeneralusuarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioForeignKey(datogeneralusuario,null);
				this.setActualParaGuardarPaisForeignKey(datogeneralusuario,null);
				this.setActualParaGuardarProvinciaForeignKey(datogeneralusuario,null);
				this.setActualParaGuardarCiudadForeignKey(datogeneralusuario,null);
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
	
	public void bugActualizarReferenciaActual(DatoGeneralUsuario datogeneralusuario,DatoGeneralUsuario datogeneralusuarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDatoGeneralUsuario(datogeneralusuario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		datogeneralusuarioAux.setId(datogeneralusuario.getId());
		datogeneralusuarioAux.setVersionRow(datogeneralusuario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDatoGeneralUsuario();
		
			int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = datogeneralusuarioValidator.getInvalidValues(this.datogeneralusuario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			datogeneralusuarioLogic.setDatosCliente(datosCliente);
			datogeneralusuarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				datogeneralusuarioAux=new  DatoGeneralUsuario();
				
				datogeneralusuarioAux.setIsNew(true);
				datogeneralusuarioAux.setIsChanged(true);
				
				datogeneralusuarioAux.setDatoGeneralUsuarioOriginal(this.datogeneralusuario);
				
				datogeneralusuarioAux.setId(this.datogeneralusuario.getId());	
				datogeneralusuarioAux.setVersionRow(this.datogeneralusuario.getVersionRow());	
				datogeneralusuarioAux.setid_pais(this.datogeneralusuario.getid_pais());	
				datogeneralusuarioAux.setid_provincia(this.datogeneralusuario.getid_provincia());	
				datogeneralusuarioAux.setid_ciudad(this.datogeneralusuario.getid_ciudad());	
				datogeneralusuarioAux.setcedula(this.datogeneralusuario.getcedula());	
				datogeneralusuarioAux.setapellidos(this.datogeneralusuario.getapellidos());	
				datogeneralusuarioAux.setnombres(this.datogeneralusuario.getnombres());	
				datogeneralusuarioAux.settelefono(this.datogeneralusuario.gettelefono());	
				datogeneralusuarioAux.settelefono_movil(this.datogeneralusuario.gettelefono_movil());	
				datogeneralusuarioAux.sete_mail(this.datogeneralusuario.gete_mail());	
				datogeneralusuarioAux.seturl(this.datogeneralusuario.geturl());	
				datogeneralusuarioAux.setfecha_nacimiento(this.datogeneralusuario.getfecha_nacimiento());	
				datogeneralusuarioAux.setdireccion(this.datogeneralusuario.getdireccion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(datogeneralusuarioAux,datogeneralusuarioLogic.getDatoGeneralUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datogeneralusuarioAux,datogeneralusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.saveDatoGeneralUsuarios();//WithConnection
						//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datogeneralusuario,datogeneralusuarioAux);
					
					this.refrescarForeignKeysDescripcionesDatoGeneralUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datogeneralusuarioLogic.saveDatoGeneralUsuarioRelaciones(datogeneralusuarioAux);//WithConnection
								//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datogeneralusuario,datogeneralusuarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datogeneralusuarioAux,datogeneralusuarioLogic.getDatoGeneralUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datogeneralusuarioAux,datogeneralusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datogeneralusuario,datogeneralusuarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				datogeneralusuarioAux=new  DatoGeneralUsuario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() 
					|| (this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() && this.datogeneralusuario.getId()>=0)) {
						
					datogeneralusuarioAux.setIsNew(false);
				}
				
				datogeneralusuarioAux.setIsDeleted(false);
			
				datogeneralusuarioAux.setId(this.datogeneralusuario.getId());	
				datogeneralusuarioAux.setVersionRow(this.datogeneralusuario.getVersionRow());	
				datogeneralusuarioAux.setid_pais(this.datogeneralusuario.getid_pais());	
				datogeneralusuarioAux.setid_provincia(this.datogeneralusuario.getid_provincia());	
				datogeneralusuarioAux.setid_ciudad(this.datogeneralusuario.getid_ciudad());	
				datogeneralusuarioAux.setcedula(this.datogeneralusuario.getcedula());	
				datogeneralusuarioAux.setapellidos(this.datogeneralusuario.getapellidos());	
				datogeneralusuarioAux.setnombres(this.datogeneralusuario.getnombres());	
				datogeneralusuarioAux.settelefono(this.datogeneralusuario.gettelefono());	
				datogeneralusuarioAux.settelefono_movil(this.datogeneralusuario.gettelefono_movil());	
				datogeneralusuarioAux.sete_mail(this.datogeneralusuario.gete_mail());	
				datogeneralusuarioAux.seturl(this.datogeneralusuario.geturl());	
				datogeneralusuarioAux.setfecha_nacimiento(this.datogeneralusuario.getfecha_nacimiento());	
				datogeneralusuarioAux.setdireccion(this.datogeneralusuario.getdireccion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datogeneralusuarioAux,datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datogeneralusuarioAux,datogeneralusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.saveDatoGeneralUsuarios();//WithConnection
						//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datogeneralusuario,datogeneralusuarioAux);
					
					this.refrescarForeignKeysDescripcionesDatoGeneralUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datogeneralusuarioLogic.saveDatoGeneralUsuarioRelaciones(datogeneralusuarioAux);//WithConnection
								//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datogeneralusuario,datogeneralusuarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datogeneralusuarioAux,datogeneralusuarioLogic.getDatoGeneralUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datogeneralusuarioAux,datogeneralusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datogeneralusuario,datogeneralusuarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				datogeneralusuarioAux=new  DatoGeneralUsuario();
				
				datogeneralusuarioAux.setIsNew(false);
				datogeneralusuarioAux.setIsChanged(false);
				
				datogeneralusuarioAux.setIsDeleted(true);
				
				datogeneralusuarioAux.setId(this.datogeneralusuario.getId());	
				datogeneralusuarioAux.setVersionRow(this.datogeneralusuario.getVersionRow());	
				datogeneralusuarioAux.setid_pais(this.datogeneralusuario.getid_pais());	
				datogeneralusuarioAux.setid_provincia(this.datogeneralusuario.getid_provincia());	
				datogeneralusuarioAux.setid_ciudad(this.datogeneralusuario.getid_ciudad());	
				datogeneralusuarioAux.setcedula(this.datogeneralusuario.getcedula());	
				datogeneralusuarioAux.setapellidos(this.datogeneralusuario.getapellidos());	
				datogeneralusuarioAux.setnombres(this.datogeneralusuario.getnombres());	
				datogeneralusuarioAux.settelefono(this.datogeneralusuario.gettelefono());	
				datogeneralusuarioAux.settelefono_movil(this.datogeneralusuario.gettelefono_movil());	
				datogeneralusuarioAux.sete_mail(this.datogeneralusuario.gete_mail());	
				datogeneralusuarioAux.seturl(this.datogeneralusuario.geturl());	
				datogeneralusuarioAux.setfecha_nacimiento(this.datogeneralusuario.getfecha_nacimiento());	
				datogeneralusuarioAux.setdireccion(this.datogeneralusuario.getdireccion());	
				
				if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.datogeneralusuarioAux.getId()>=0) {	
						this.datogeneralusuariosEliminados.add(datogeneralusuarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(datogeneralusuarioAux,datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datogeneralusuarioAux,datogeneralusuarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.saveDatoGeneralUsuarios();//WithConnection
						//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datogeneralusuarioLogic.saveDatoGeneralUsuarioRelaciones(datogeneralusuarioAux);//WithConnection
								//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
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
							if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(datogeneralusuarioAux,datogeneralusuarioLogic.getDatoGeneralUsuarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(datogeneralusuarioAux,datogeneralusuarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(this.datogeneralusuariosEliminados);
					
					datogeneralusuarioLogic.saveDatoGeneralUsuarios();//WithConnection
					//datogeneralusuarioLogic.getSetVersionRowDatoGeneralUsuarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDatoGeneralUsuario();
				
				this.datogeneralusuariosEliminados= new ArrayList<DatoGeneralUsuario>();		
			}
			
			if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dato General Usuario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.datogeneralusuario=datogeneralusuarioAux;
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
      		//this.finishProcessDatoGeneralUsuario();
      	}
		
	}	
	
	public void actualizarRelaciones(DatoGeneralUsuario datogeneralusuarioLocal) throws Exception {
		
		if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DatoGeneralUsuario datogeneralusuarioLocal) throws Exception {	
		if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				datogeneralusuarioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				datogeneralusuarioLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				datogeneralusuarioLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				datogeneralusuarioLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDatoGeneralUsuarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = datogeneralusuarioValidator.getInvalidValues(this.datogeneralusuario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {
		try	{		
			DatoGeneralUsuarioConstantesFunciones.actualizarLista(datogeneralusuario,datogeneralusuarios,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DatoGeneralUsuario datogeneralusuario,List<DatoGeneralUsuario> datogeneralusuarios) throws Exception {
		try	{			
			DatoGeneralUsuarioConstantesFunciones.actualizarSelectedLista(datogeneralusuario,datogeneralusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DatoGeneralUsuario> datogeneralusuariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				datogeneralusuariosLocal=this.datogeneralusuarioLogic.getDatoGeneralUsuarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				datogeneralusuariosLocal=this.datogeneralusuarios;
			}
			//ARCHITECTURE
		
			for(DatoGeneralUsuario datogeneralusuarioLocal:datogeneralusuariosLocal) {
				if(this.permiteMantenimiento(datogeneralusuarioLocal) && datogeneralusuarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DatoGeneralUsuarioConstantesFunciones.getDatoGeneralUsuarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_paisDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.IDPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_provinciaDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_ciudadDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.CEDULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelcedulaDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.APELLIDOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelapellidosDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.NOMBRES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelnombresDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeltelefonoDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.TELEFONOMOVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeltelefono_movilDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabele_mailDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.URL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelurlDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.FECHANACIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelfecha_nacimientoDatoGeneralUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoGeneralUsuarioConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeldireccionDatoGeneralUsuario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_paisDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_provinciaDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_ciudadDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelcedulaDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelapellidosDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelnombresDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeltelefonoDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeltelefono_movilDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabele_mailDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelurlDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelfecha_nacimientoDatoGeneralUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeldireccionDatoGeneralUsuario,"");
		
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
		this.iIdNuevoDatoGeneralUsuario--;	
		
		
		this.datogeneralusuarioAux=new DatoGeneralUsuario();
		
		this.datogeneralusuarioAux.setId(this.iIdNuevoDatoGeneralUsuario);
		this.datogeneralusuarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datogeneralusuarioLogic.getDatoGeneralUsuarios().add(this.datogeneralusuarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.datogeneralusuarios.add(this.datogeneralusuarioAux);
		}
		//ARCHITECTURE
		
		this.datogeneralusuario=this.datogeneralusuarioAux;
		
		if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuario);
			this.setVariablesObjetoActualToFormularioForeignKeyDatoGeneralUsuario(this.datogeneralusuario);
		}
				
		//this.setDefaultControlesDatoGeneralUsuario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDatoGeneralUsuario();
		
		//PARA RELACION DE UNO A UNO
		this.datogeneralusuario.setId(this.id_usuarioFK_IdUsuario);
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDatoGeneralUsuario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoGeneralUsuario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoGeneralUsuario(this.datogeneralusuarioBean,this.datogeneralusuario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
			classes=DatoGeneralUsuarioConstantesFunciones.getClassesRelationshipsOfDatoGeneralUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.datogeneralusuarioReturnGeneral=datogeneralusuarioLogic.procesarEventosDatoGeneralUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),this.datogeneralusuario,this.datogeneralusuarioParameterGeneral,this.isEsNuevoDatoGeneralUsuario,classes);//this.datogeneralusuarioLogic.getDatoGeneralUsuario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral,this.datogeneralusuarioBean,false);
		
		if(this.datogeneralusuarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario());
		}
		
		if(this.datogeneralusuarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario(),classes);//this.datogeneralusuarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDatoGeneralUsuario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDatoGeneralUsuario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.RecargarFormDatoGeneralUsuario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
						
			if(datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoGeneralUsuario();
			}
			
			this.actualizarVisualTableDatosDatoGeneralUsuario();
			
			this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(this.getIndiceNuevoDatoGeneralUsuario(), this.getIndiceNuevoDatoGeneralUsuario());
			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
						
			this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDatoGeneralUsuario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarcedulaDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarapellidosDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarnombresDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activartelefonoDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activartelefono_movilDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activare_mailDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarurlDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarfecha_nacimientoDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activardireccionDatoGeneralUsuario);	
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarid_paisDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarid_provinciaDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setEnabled(isHabilitar && this.datogeneralusuarioConstantesFunciones.activarid_ciudadDatoGeneralUsuario);
	};
	
	public void setDefaultControlesDatoGeneralUsuario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDatoGeneralUsuario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.datogeneralusuarioSessionBean.setConGuardarRelaciones(true);			
			this.datogeneralusuarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.setVisible(true);
			
					
		} else {
			//this.datogeneralusuarioSessionBean.setConGuardarRelaciones(false);			
			this.datogeneralusuarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDatoGeneralUsuario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuarioAux.getId().equals(this.iIdNuevoDatoGeneralUsuario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarios) {
				if(datogeneralusuarioAux.getId().equals(this.iIdNuevoDatoGeneralUsuario)) {
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
	
	public int getIndiceActualDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuarioAux.getId().equals(datogeneralusuario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarios) {
				if(datogeneralusuarioAux.getId().equals(datogeneralusuario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuarioAux.getDatoGeneralUsuarioOriginal().getId().equals(datogeneralusuarioOriginal.getId())) {
					existe=true;
					datogeneralusuarioOriginal.setId(datogeneralusuarioAux.getId());
					datogeneralusuarioOriginal.setVersionRow(datogeneralusuarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarios) {
				if(datogeneralusuarioAux.getDatoGeneralUsuarioOriginal().getId().equals(datogeneralusuarioOriginal.getId())) {
					existe=true;
					datogeneralusuarioOriginal.setId(datogeneralusuarioAux.getId());
					datogeneralusuarioOriginal.setVersionRow(datogeneralusuarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDatoGeneralUsuario(Boolean esParaCancelar) throws Exception {
		datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
		datogeneralusuarioAux=new DatoGeneralUsuario();
		
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
					if(datogeneralusuarioAux.getId()<0) {
						datogeneralusuariosAux.add(datogeneralusuarioAux);
					}		
				}
				this.iIdNuevoDatoGeneralUsuario=0L;
				this.datogeneralusuarioLogic.getDatoGeneralUsuarios().removeAll(datogeneralusuariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarios) {
					if(datogeneralusuarioAux.getId()<0) {
						datogeneralusuariosAux.add(datogeneralusuarioAux);
					}		
				}
				this.iIdNuevoDatoGeneralUsuario=0L;
				this.datogeneralusuarios.removeAll(datogeneralusuariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDatoGeneralUsuario 
					&& this.datogeneralusuarioLogic.getDatoGeneralUsuarios().size()>0
					) {
					datogeneralusuarioAux=this.datogeneralusuarioLogic.getDatoGeneralUsuarios().get(this.datogeneralusuarioLogic.getDatoGeneralUsuarios().size() - 1);
				
					if(datogeneralusuarioAux.getId()<0) {
						this.datogeneralusuarioLogic.getDatoGeneralUsuarios().remove(datogeneralusuarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDatoGeneralUsuario && this.datogeneralusuarios.size()>0) {
					datogeneralusuarioAux=this.datogeneralusuarios.get(this.datogeneralusuarios.size() - 1);
				
					if(datogeneralusuarioAux.getId()<0) {
						this.datogeneralusuarios.remove(datogeneralusuarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDatoGeneralUsuario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(datogeneralusuario.getId()<0) {
				this.datogeneralusuarioLogic.getDatoGeneralUsuarios().remove(this.datogeneralusuario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(datogeneralusuario.getId()<0) {
				this.datogeneralusuarios.remove(this.datogeneralusuario);
			}
		}			
	}
	
	public void setEstadosInicialesDatoGeneralUsuario(List<DatoGeneralUsuario> datogeneralusuariosAux) throws Exception {
		DatoGeneralUsuarioConstantesFunciones.setEstadosInicialesDatoGeneralUsuario(datogeneralusuariosAux);
	}
	
	public void setEstadosInicialesDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuarioAux) throws Exception {
		DatoGeneralUsuarioConstantesFunciones.setEstadosInicialesDatoGeneralUsuario(datogeneralusuarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDatoGeneralUsuarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDatoGeneralUsuarioActual()) {
				if(!this.isEsNuevoDatoGeneralUsuario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDatoGeneralUsuario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDatoGeneralUsuarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dato General Usuario ?", "MANTENIMIENTO DE Dato General Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DatoGeneralUsuario datogeneralusuario) throws Exception {
		DatoGeneralUsuarioConstantesFunciones.seleccionarAsignar(this.datogeneralusuario,datogeneralusuario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDatoGeneralUsuario=this.isPermisoActualizarOriginalDatoGeneralUsuario;
			
			
			this.seleccionarAsignar(datogeneralusuario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoGeneralUsuarioConstantesFunciones.quitarEspaciosDatoGeneralUsuario(this.datogeneralusuario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.datogeneralusuarioSessionBean.setsFuncionBusquedaRapida(this.datogeneralusuarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDatoGeneralUsuario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDatoGeneralUsuario(esParaCancelar);				
				this.cancelarNuevoDatoGeneralUsuario(esParaCancelar);								
			}
			
			this.datogeneralusuario=new DatoGeneralUsuario();
			
			this.inicializarDatoGeneralUsuario();
			
			this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDatoGeneralUsuario() throws Exception {
		try {
			DatoGeneralUsuarioConstantesFunciones.inicializarDatoGeneralUsuario(this.datogeneralusuario);
			
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
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.datogeneralusuarioLogic.getDatoGeneralUsuarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDatoGeneralUsuarios(String sAccionBusqueda,List<DatoGeneralUsuario> datogeneralusuariosParaReportes) throws Exception {
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
					sPathReporteFinal="DatoGeneralUsuario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DatoGeneralUsuarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DatoGeneralUsuarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DatoGeneralUsuario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dato General Usuarios");		
		parameters.put("busquedapor", DatoGeneralUsuarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDatoGeneralUsuario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DatoGeneralUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DatoGeneralUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDatoGeneralUsuario=new JRBeanArrayDataSource(DatoGeneralUsuarioJInternalFrame.TraerDatoGeneralUsuarioBeans(datogeneralusuariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDatoGeneralUsuario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DatoGeneralUsuarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DatoGeneralUsuarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DatoGeneralUsuarioBean.TraerDatoGeneralUsuarioBeans(datogeneralusuariosParaReportes).toArray()));
							
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
				this.generarExcelReporteDatoGeneralUsuarios(sAccionBusqueda,sTipoArchivoReporte,datogeneralusuariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDatoGeneralUsuarios(sAccionBusqueda,sTipoArchivoReporte,datogeneralusuariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuarioActionPerformed(null);
					//this.generarExcelReporteDatoGeneralUsuarios(sAccionBusqueda,sTipoArchivoReporte,datogeneralusuariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDatoGeneralUsuarios(sAccionBusqueda,sTipoArchivoReporte,datogeneralusuariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDatoGeneralUsuarios(sAccionBusqueda,sTipoArchivoReporte,datogeneralusuariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDatoGeneralUsuarios(sAccionBusqueda,sTipoArchivoReporte,datogeneralusuariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDatoGeneralUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoGeneralUsuario> datogeneralusuariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoGeneralUsuarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoGeneralUsuario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DatoGeneralUsuario datogeneralusuario : datogeneralusuariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DatoGeneralUsuarioConstantesFunciones.generarExcelReporteDataDatoGeneralUsuario("NORMAL",row,workbook,datogeneralusuario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDatoGeneralUsuario(String sTipo,Row row,Workbook workbook) {
		
		DatoGeneralUsuarioConstantesFunciones.generarExcelReporteHeaderDatoGeneralUsuario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDatoGeneralUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoGeneralUsuario> datogeneralusuariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoGeneralUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DatoGeneralUsuario datogeneralusuario : datogeneralusuariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.getDatoGeneralUsuarioDescripcion(datogeneralusuario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getcedula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getapellidos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getnombres());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.gettelefono_movil());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.gete_mail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_URL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_URL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.geturl());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getfecha_nacimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datogeneralusuario.getdireccion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDatoGeneralUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoGeneralUsuario> datogeneralusuariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DatoGeneralUsuario> datogeneralusuariosRespaldo=null;
		
		classes=DatoGeneralUsuarioConstantesFunciones.getClassesRelationshipsOfDatoGeneralUsuario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.datogeneralusuarioLogic.setDatosCliente(this.datosCliente);
		this.datogeneralusuarioLogic.setDatosDeep(this.datosDeep);
		this.datogeneralusuarioLogic.setIsConDeep(true);
		
		datogeneralusuariosRespaldo=this.datogeneralusuarioLogic.getDatoGeneralUsuarios();
		
		this.datogeneralusuarioLogic.setDatoGeneralUsuarios(datogeneralusuariosParaReportes);	
		this.datogeneralusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		datogeneralusuariosParaReportes=this.datogeneralusuarioLogic.getDatoGeneralUsuarios();
		this.datogeneralusuarioLogic.setDatoGeneralUsuarios(datogeneralusuariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoGeneralUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoGeneralUsuario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DatoGeneralUsuario datogeneralusuario : datogeneralusuariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDatoGeneralUsuario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DatoGeneralUsuarioConstantesFunciones.generarExcelReporteDataDatoGeneralUsuario("NORMAL",row,workbook,datogeneralusuario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.getDatoGeneralUsuarioDescripcion(datogeneralusuario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDatoGeneralUsuario() throws Exception {		
		this.startProcessDatoGeneralUsuario(true);
	}
	
	public void startProcessDatoGeneralUsuario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDatoGeneralUsuario ,this.jPanelParametrosReportesDatoGeneralUsuario, this.jScrollPanelDatosDatoGeneralUsuario,this.jPanelPaginacionDatoGeneralUsuario, this.jScrollPanelDatosEdicionDatoGeneralUsuario, this.jPanelAccionesDatoGeneralUsuario,this.jPanelAccionesFormularioDatoGeneralUsuario,this.jmenuBarDatoGeneralUsuario,this.jmenuBarDetalleDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,this.jTtoolBarDetalleDatoGeneralUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoGeneralUsuario=this.jTabbedPaneBusquedasDatoGeneralUsuario; 
		
		final JPanel jPanelParametrosReportesDatoGeneralUsuario=this.jPanelParametrosReportesDatoGeneralUsuario;
		//final JScrollPane jScrollPanelDatosDatoGeneralUsuario=this.jScrollPanelDatosDatoGeneralUsuario;
		final JTable jTableDatosDatoGeneralUsuario=this.jTableDatosDatoGeneralUsuario;		
		final JPanel jPanelPaginacionDatoGeneralUsuario=this.jPanelPaginacionDatoGeneralUsuario;
		//final JScrollPane jScrollPanelDatosEdicionDatoGeneralUsuario=this.jScrollPanelDatosEdicionDatoGeneralUsuario;
		final JPanel jPanelAccionesDatoGeneralUsuario=this.jPanelAccionesDatoGeneralUsuario;
		
		JPanel jPanelCamposAuxiliarDatoGeneralUsuario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDatoGeneralUsuario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			jPanelCamposAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelCamposDatoGeneralUsuario;
			jPanelAccionesFormularioAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelAccionesFormularioDatoGeneralUsuario;
		}
		
		final JPanel jPanelCamposDatoGeneralUsuario=jPanelCamposAuxiliarDatoGeneralUsuario;
		final JPanel jPanelAccionesFormularioDatoGeneralUsuario=jPanelAccionesFormularioAuxiliarDatoGeneralUsuario;
		
		
		final JMenuBar jmenuBarDatoGeneralUsuario=this.jmenuBarDatoGeneralUsuario;
		final JToolBar jTtoolBarDatoGeneralUsuario=this.jTtoolBarDatoGeneralUsuario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDatoGeneralUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoGeneralUsuario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			jmenuBarDetalleAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jmenuBarDetalleDatoGeneralUsuario;
			jTtoolBarDetalleAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jTtoolBarDetalleDatoGeneralUsuario;
		}
		
		final JMenuBar jmenuBarDetalleDatoGeneralUsuario=jmenuBarDetalleAuxiliarDatoGeneralUsuario;
		final JToolBar jTtoolBarDetalleDatoGeneralUsuario=jTtoolBarDetalleAuxiliarDatoGeneralUsuario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoGeneralUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoGeneralUsuario;
			processRunnable.jTableDatos=jTableDatosDatoGeneralUsuario;
			processRunnable.jPanelCampos=jPanelCamposDatoGeneralUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoGeneralUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesDatoGeneralUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoGeneralUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarDatoGeneralUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoGeneralUsuario;
			processRunnable.jTtoolBar=jTtoolBarDatoGeneralUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoGeneralUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoGeneralUsuario ,jPanelParametrosReportesDatoGeneralUsuario,jTableDatosDatoGeneralUsuario, /*jScrollPanelDatosDatoGeneralUsuario,*/jPanelCamposDatoGeneralUsuario,jPanelPaginacionDatoGeneralUsuario, /*jScrollPanelDatosEdicionDatoGeneralUsuario,*/ jPanelAccionesDatoGeneralUsuario,jPanelAccionesFormularioDatoGeneralUsuario,jmenuBarDatoGeneralUsuario,jmenuBarDetalleDatoGeneralUsuario,jTtoolBarDatoGeneralUsuario,jTtoolBarDetalleDatoGeneralUsuario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoGeneralUsuario ,jPanelParametrosReportesDatoGeneralUsuario, jScrollPanelDatosDatoGeneralUsuario,jPanelPaginacionDatoGeneralUsuario, jScrollPanelDatosEdicionDatoGeneralUsuario, jPanelAccionesDatoGeneralUsuario,jPanelAccionesFormularioDatoGeneralUsuario,jmenuBarDatoGeneralUsuario,jmenuBarDetalleDatoGeneralUsuario,jTtoolBarDatoGeneralUsuario,jTtoolBarDetalleDatoGeneralUsuario);
						
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
	
	public void finishProcessDatoGeneralUsuario() {// throws Exception 
		this.finishProcessDatoGeneralUsuario(true);
	}
	
	public void finishProcessDatoGeneralUsuario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDatoGeneralUsuario ,this.jPanelParametrosReportesDatoGeneralUsuario, this.jScrollPanelDatosDatoGeneralUsuario,this.jPanelPaginacionDatoGeneralUsuario, this.jScrollPanelDatosEdicionDatoGeneralUsuario, this.jPanelAccionesDatoGeneralUsuario,this.jPanelAccionesFormularioDatoGeneralUsuario,this.jmenuBarDatoGeneralUsuario,this.jmenuBarDetalleDatoGeneralUsuario,this.jTtoolBarDatoGeneralUsuario,this.jTtoolBarDetalleDatoGeneralUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoGeneralUsuario=this.jTabbedPaneBusquedasDatoGeneralUsuario; 
		
		final JPanel jPanelParametrosReportesDatoGeneralUsuario=this.jPanelParametrosReportesDatoGeneralUsuario;
		//final JScrollPane jScrollPanelDatosDatoGeneralUsuario=this.jScrollPanelDatosDatoGeneralUsuario;
		final JTable jTableDatosDatoGeneralUsuario=this.jTableDatosDatoGeneralUsuario;		
		final JPanel jPanelPaginacionDatoGeneralUsuario=this.jPanelPaginacionDatoGeneralUsuario;
		//final JScrollPane jScrollPanelDatosEdicionDatoGeneralUsuario=this.jScrollPanelDatosEdicionDatoGeneralUsuario;
		final JPanel jPanelAccionesDatoGeneralUsuario=this.jPanelAccionesDatoGeneralUsuario;
		
		JPanel jPanelCamposAuxiliarDatoGeneralUsuario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDatoGeneralUsuario=new JPanel();
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			jPanelCamposAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelCamposDatoGeneralUsuario;
			jPanelAccionesFormularioAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelAccionesFormularioDatoGeneralUsuario;
		}
		
		final JPanel jPanelCamposDatoGeneralUsuario=jPanelCamposAuxiliarDatoGeneralUsuario;
		final JPanel jPanelAccionesFormularioDatoGeneralUsuario=jPanelAccionesFormularioAuxiliarDatoGeneralUsuario;
		
		
		final JMenuBar jmenuBarDatoGeneralUsuario=this.jmenuBarDatoGeneralUsuario;		
		final JToolBar jTtoolBarDatoGeneralUsuario=this.jTtoolBarDatoGeneralUsuario;
				
		JMenuBar jmenuBarDetalleAuxiliarDatoGeneralUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoGeneralUsuario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			jmenuBarDetalleAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jmenuBarDetalleDatoGeneralUsuario;
			jTtoolBarDetalleAuxiliarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jTtoolBarDetalleDatoGeneralUsuario;		
		}
		
		final JMenuBar jmenuBarDetalleDatoGeneralUsuario=jmenuBarDetalleAuxiliarDatoGeneralUsuario;
		final JToolBar jTtoolBarDetalleDatoGeneralUsuario=jTtoolBarDetalleAuxiliarDatoGeneralUsuario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoGeneralUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoGeneralUsuario;
			processRunnable.jTableDatos=jTableDatosDatoGeneralUsuario;
			processRunnable.jPanelCampos=jPanelCamposDatoGeneralUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoGeneralUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesDatoGeneralUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoGeneralUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarDatoGeneralUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoGeneralUsuario;
			processRunnable.jTtoolBar=jTtoolBarDatoGeneralUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoGeneralUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDatoGeneralUsuario ,jPanelParametrosReportesDatoGeneralUsuario, jTableDatosDatoGeneralUsuario,/*jScrollPanelDatosDatoGeneralUsuario,*/jPanelCamposDatoGeneralUsuario,jPanelPaginacionDatoGeneralUsuario, /*jScrollPanelDatosEdicionDatoGeneralUsuario,*/ jPanelAccionesDatoGeneralUsuario,jPanelAccionesFormularioDatoGeneralUsuario,jmenuBarDatoGeneralUsuario,jmenuBarDetalleDatoGeneralUsuario,jTtoolBarDatoGeneralUsuario,jTtoolBarDetalleDatoGeneralUsuario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDatoGeneralUsuario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDatoGeneralUsuario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDatoGeneralUsuario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDatoGeneralUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDatoGeneralUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDatoGeneralUsuario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDatoGeneralUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDatoGeneralUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDatoGeneralUsuario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.datogeneralusuarioConstantesFunciones.getsFinalQueryDatoGeneralUsuario();
		String  finalQueryPaginacionTodos=this.datogeneralusuarioConstantesFunciones.getsFinalQueryDatoGeneralUsuario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DatoGeneralUsuarioConstantesFunciones.getArrayColumnasGlobalesNoDatoGeneralUsuario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DatoGeneralUsuarioConstantesFunciones.getArrayColumnasGlobalesDatoGeneralUsuario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DatoGeneralUsuarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.datogeneralusuariosEliminados= new ArrayList<DatoGeneralUsuario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDatoGeneralUsuario();
		
				///*DatoGeneralUsuarioSessionBean*/this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
			
			if(this.datogeneralusuarioSessionBean==null) {
				this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
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
					this.iNumeroPaginacion=DatoGeneralUsuarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DatoGeneralUsuarioConstantesFunciones.getClassesForeignKeysOfDatoGeneralUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/datogeneralusuario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			datogeneralusuariosAux= new ArrayList<DatoGeneralUsuario>();
			
				
			datogeneralusuarioLogic.setDatosCliente(this.datosCliente);
			datogeneralusuarioLogic.setDatosDeep(this.datosDeep);
			datogeneralusuarioLogic.setIsConDeep(true);
			
			
			datogeneralusuarioLogic.getDatoGeneralUsuarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					datogeneralusuarioLogic.getTodosDatoGeneralUsuarios(finalQueryGlobal,pagination);
					
					//datogeneralusuarioLogic.getTodosDatoGeneralUsuariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(datogeneralusuarioLogic.getDatoGeneralUsuarios()==null|| datogeneralusuarioLogic.getDatoGeneralUsuarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datogeneralusuariosAux= new ArrayList<DatoGeneralUsuario>();
							datogeneralusuariosAux.addAll(datogeneralusuarioLogic.getDatoGeneralUsuarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuariosAux= new ArrayList<DatoGeneralUsuario>();
							datogeneralusuariosAux.addAll(datogeneralusuarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datogeneralusuarioLogic.getTodosDatoGeneralUsuarios(finalQueryGlobal+"",this.pagination);												
							
							//datogeneralusuarioLogic.getTodosDatoGeneralUsuariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuarioLogic.getDatoGeneralUsuarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());					
							datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(datogeneralusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuarios.addAll(datogeneralusuariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDatoGeneralUsuario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDatoGeneralUsuario=this.idActual;
				
				} else if(this.idDatoGeneralUsuarioActual!=null && this.idDatoGeneralUsuarioActual!=0L) {
					idDatoGeneralUsuario=idDatoGeneralUsuarioActual;
				}
				
					
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndicePorId(idDatoGeneralUsuario);
				
				this.datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					datogeneralusuarioLogic.getEntity(idDatoGeneralUsuario);
					
					//datogeneralusuarioLogic.getEntityWithConnection(idDatoGeneralUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
					datogeneralusuarioLogic.getDatoGeneralUsuarios().add(datogeneralusuarioLogic.getDatoGeneralUsuario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
					this.datogeneralusuarios.add(datogeneralusuario);
				}
				
				if(datogeneralusuarioLogic.getDatoGeneralUsuario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datogeneralusuarioLogic.getDatoGeneralUsuarios()==null||datogeneralusuarioLogic.getDatoGeneralUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datogeneralusuarios==null|| datogeneralusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
						datogeneralusuariosAux.addAll(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuariosAux.addAll(datogeneralusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoGeneralUsuarios("FK_IdCiudad",datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoGeneralUsuarios("FK_IdCiudad",datogeneralusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
						datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(datogeneralusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuarios.addAll(datogeneralusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datogeneralusuarioLogic.getDatoGeneralUsuarios()==null||datogeneralusuarioLogic.getDatoGeneralUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datogeneralusuarios==null|| datogeneralusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
						datogeneralusuariosAux.addAll(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuariosAux.addAll(datogeneralusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoGeneralUsuarios("FK_IdPais",datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoGeneralUsuarios("FK_IdPais",datogeneralusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
						datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(datogeneralusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuarios.addAll(datogeneralusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProvincia")) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datogeneralusuarioLogic.getDatoGeneralUsuarios()==null||datogeneralusuarioLogic.getDatoGeneralUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datogeneralusuarios==null|| datogeneralusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
						datogeneralusuariosAux.addAll(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuariosAux.addAll(datogeneralusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoGeneralUsuarios("FK_IdProvincia",datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoGeneralUsuarios("FK_IdProvincia",datogeneralusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
						datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(datogeneralusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuarios.addAll(datogeneralusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datogeneralusuarioLogic.getDatoGeneralUsuarios()==null||datogeneralusuarioLogic.getDatoGeneralUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datogeneralusuarios==null|| datogeneralusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
						datogeneralusuariosAux.addAll(datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuariosAux=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuariosAux.addAll(datogeneralusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoGeneralUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoGeneralUsuarios("FK_IdUsuario",datogeneralusuarioLogic.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoGeneralUsuarios("FK_IdUsuario",datogeneralusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioLogic.setDatoGeneralUsuarios(new ArrayList<DatoGeneralUsuario>());
						datogeneralusuarioLogic.getDatoGeneralUsuarios().addAll(datogeneralusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuarios=new ArrayList<DatoGeneralUsuario>();
							datogeneralusuarios.addAll(datogeneralusuariosAux);
						}
						//ARCHITECTURE
					}
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					Boolean isTieneDatosDatoGeneralUsuario=true;
					isTieneDatosDatoGeneralUsuario=datogeneralusuarioLogic.getDatoGeneralUsuarios()!=null && datogeneralusuarioLogic.getDatoGeneralUsuarios().size()>0;

					if(isTieneDatosDatoGeneralUsuario) {
					}
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					if(datogeneralusuarios!=null && datogeneralusuarios.size()>0) {
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDatoGeneralUsuario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDatoGeneralUsuario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datogeneralusuarioLogic.getDatoGeneralUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datogeneralusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datogeneralusuarioLogic.getDatoGeneralUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datogeneralusuarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DatoGeneralUsuario datogeneralusuario) {
		Boolean permite=true;
		
		if(this.datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DatoGeneralUsuarioConstantesFunciones.getOrderByListaDatoGeneralUsuario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DatoGeneralUsuarioConstantesFunciones.getOrderByListaDatoGeneralUsuario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoGeneralUsuario datogeneralusuario:this.datogeneralusuarios) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
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
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		datogeneralusuarioTotales=new DatoGeneralUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datogeneralusuarioLogic.getDatoGeneralUsuarios().remove(datogeneralusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datogeneralusuarios.remove(datogeneralusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		datogeneralusuarioTotales=new DatoGeneralUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoGeneralUsuario datogeneralusuario:datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoGeneralUsuarioConstantesFunciones.TotalizarValoresFilaDatoGeneralUsuario(this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),datogeneralusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoGeneralUsuario datogeneralusuario:this.datogeneralusuarios) {
				if(datogeneralusuario.getsType().equals(Constantes2.S_TOTALES)) {
					datogeneralusuarioTotales=datogeneralusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoGeneralUsuarioConstantesFunciones.TotalizarValoresFilaDatoGeneralUsuario(this.datogeneralusuarios,datogeneralusuarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDatoGeneralUsuariosFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoGeneralUsuariosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoGeneralUsuariosFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoGeneralUsuariosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDatoGeneralUsuariosFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoGeneralUsuariosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoGeneralUsuariosFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoGeneralUsuariosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datogeneralusuarioLogic.getDatoGeneralUsuariosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosDatoGeneralUsuario() {
		this.isPermisoTodoDatoGeneralUsuario=false;
		this.isPermisoNuevoDatoGeneralUsuario=false;
		this.isPermisoActualizarDatoGeneralUsuario=false;
		this.isPermisoActualizarOriginalDatoGeneralUsuario=false;
		this.isPermisoEliminarDatoGeneralUsuario=false;
		this.isPermisoGuardarCambiosDatoGeneralUsuario=false;
		this.isPermisoConsultaDatoGeneralUsuario=false;
		this.isPermisoBusquedaDatoGeneralUsuario=false;
		this.isPermisoReporteDatoGeneralUsuario=false;		
		this.isPermisoOrdenDatoGeneralUsuario=false;		
		this.isPermisoPaginacionMedioDatoGeneralUsuario=false;		
		this.isPermisoPaginacionAltoDatoGeneralUsuario=false;
		this.isPermisoPaginacionTodoDatoGeneralUsuario=false;
		this.isPermisoCopiarDatoGeneralUsuario=false;		
		this.isPermisoVerFormDatoGeneralUsuario=false;		
		this.isPermisoDuplicarDatoGeneralUsuario=false;		
		this.isPermisoOrdenDatoGeneralUsuario=false;		
	}
	
	public void setPermisosUsuarioDatoGeneralUsuario(Boolean isPermiso) {
		this.isPermisoTodoDatoGeneralUsuario=isPermiso;
		this.isPermisoNuevoDatoGeneralUsuario=isPermiso;
		this.isPermisoActualizarDatoGeneralUsuario=isPermiso;
		this.isPermisoActualizarOriginalDatoGeneralUsuario=isPermiso;
		this.isPermisoEliminarDatoGeneralUsuario=isPermiso;
		this.isPermisoGuardarCambiosDatoGeneralUsuario=isPermiso;
		this.isPermisoConsultaDatoGeneralUsuario=isPermiso;
		this.isPermisoBusquedaDatoGeneralUsuario=isPermiso;
		this.isPermisoReporteDatoGeneralUsuario=isPermiso;
		this.isPermisoOrdenDatoGeneralUsuario=isPermiso;		
		this.isPermisoPaginacionMedioDatoGeneralUsuario=isPermiso;		
		this.isPermisoPaginacionAltoDatoGeneralUsuario=isPermiso;		
		this.isPermisoPaginacionTodoDatoGeneralUsuario=isPermiso;		
		this.isPermisoCopiarDatoGeneralUsuario=isPermiso;		
		this.isPermisoVerFormDatoGeneralUsuario=isPermiso;		
		this.isPermisoDuplicarDatoGeneralUsuario=isPermiso;
		this.isPermisoOrdenDatoGeneralUsuario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDatoGeneralUsuario(Boolean isPermiso) {
		//this.isPermisoTodoDatoGeneralUsuario=isPermiso;
		this.isPermisoNuevoDatoGeneralUsuario=isPermiso;
		this.isPermisoActualizarDatoGeneralUsuario=isPermiso;
		this.isPermisoActualizarOriginalDatoGeneralUsuario=isPermiso;
		this.isPermisoEliminarDatoGeneralUsuario=isPermiso;
		this.isPermisoGuardarCambiosDatoGeneralUsuario=isPermiso;
		//this.isPermisoConsultaDatoGeneralUsuario=isPermiso;
		//this.isPermisoBusquedaDatoGeneralUsuario=isPermiso;
		//this.isPermisoReporteDatoGeneralUsuario=isPermiso;
		//this.isPermisoOrdenDatoGeneralUsuario=isPermiso;		
		//this.isPermisoPaginacionMedioDatoGeneralUsuario=isPermiso;		
		//this.isPermisoPaginacionAltoDatoGeneralUsuario=isPermiso;		
		//this.isPermisoPaginacionTodoDatoGeneralUsuario=isPermiso;		
		//this.isPermisoCopiarDatoGeneralUsuario=isPermiso;		
		//this.isPermisoDuplicarDatoGeneralUsuario=isPermiso;
		//this.isPermisoOrdenDatoGeneralUsuario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDatoGeneralUsuarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DatoGeneralUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDatoGeneralUsuario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDatoGeneralUsuarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDatoGeneralUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDatoGeneralUsuarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDatoGeneralUsuarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDatoGeneralUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DatoGeneralUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DatoGeneralUsuarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDatoGeneralUsuario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDatoGeneralUsuario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDatoGeneralUsuario=this.isPermisoActualizarDatoGeneralUsuario;
			this.isPermisoEliminarDatoGeneralUsuario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDatoGeneralUsuario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDatoGeneralUsuario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDatoGeneralUsuario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDatoGeneralUsuario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDatoGeneralUsuario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoGeneralUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDatoGeneralUsuario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDatoGeneralUsuario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDatoGeneralUsuario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDatoGeneralUsuario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDatoGeneralUsuario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDatoGeneralUsuario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoGeneralUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDatoGeneralUsuario.setToolTipText(this.jTableDatosDatoGeneralUsuario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDatoGeneralUsuario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDatoGeneralUsuario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DatoGeneralUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DatoGeneralUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDatoGeneralUsuario() throws Exception {
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
	public void inicializarCombosForeignKeyDatoGeneralUsuarioListas()throws Exception {
		try	{						
			
				this.usuariosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.provinciasForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDatoGeneralUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DatoGeneralUsuarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDatoGeneralUsuarioListas(false);
			} else {
			
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProvinciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDatoGeneralUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioReturnGeneral=new DatoGeneralUsuarioParameterReturnGeneral();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.datogeneralusuarioConstantesFunciones.cargarid_usuarioDatoGeneralUsuario)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFunciones.cargarid_usuarioDatoGeneralUsuario)) {

					if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+datogeneralusuarioSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.datogeneralusuarioConstantesFunciones.cargarid_paisDatoGeneralUsuario)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFunciones.cargarid_paisDatoGeneralUsuario)) {

					if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+datogeneralusuarioSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalProvincia="";

				if(((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0) && this.datogeneralusuarioConstantesFunciones.cargarid_provinciaDatoGeneralUsuario)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFunciones.cargarid_provinciaDatoGeneralUsuario)) {

					if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProvincia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

						finalQueryGlobalProvincia=Funciones.GetFinalQueryAppend(finalQueryGlobalProvincia, "");
						finalQueryGlobalProvincia+=ProvinciaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProvincia=" WHERE " + ConstantesSql.ID + "="+datogeneralusuarioSessionBean.getlidProvinciaActual();
					}
				} else {
					finalQueryGlobalProvincia="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.datogeneralusuarioConstantesFunciones.cargarid_ciudadDatoGeneralUsuario)
					 || (this.esRecargarFks && this.datogeneralusuarioConstantesFunciones.cargarid_ciudadDatoGeneralUsuario)) {

					if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+datogeneralusuarioSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				datogeneralusuarioReturnGeneral=datogeneralusuarioLogic.cargarCombosLoteForeignKeyDatoGeneralUsuario(finalQueryGlobalUsuario,finalQueryGlobalPais,finalQueryGlobalProvincia,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=datogeneralusuarioReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=datogeneralusuarioReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				this.provinciasForeignKey=datogeneralusuarioReturnGeneral.getprovinciasForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=datogeneralusuarioReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDatoGeneralUsuario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyProvincia();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {
			if(this.datogeneralusuarioSessionBean==null) {
				this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
			}

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				Provincia provincia=new Provincia();
				ProvinciaConstantesFunciones.setProvinciaDescripcion(provincia,Constantes.SMENSAJE_ESCOJA_OPCION);
				provincia.setId(null);

				if(!ProvinciaConstantesFunciones.ExisteEnLista(this.provinciasForeignKey,provincia,true)) {

					this.provinciasForeignKey.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.datogeneralusuarioSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDatoGeneralUsuario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDatoGeneralUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDatoGeneralUsuario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.datogeneralusuario.setfecha_nacimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoGeneralUsuario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario)throws Exception {	
		try {
			
			this.setActualUsuarioForeignKey(datogeneralusuario.getid_usuario(),false,"Formulario");
			this.setActualPaisForeignKey(datogeneralusuario.getid_pais(),false,"Formulario");
			this.setActualProvinciaForeignKey(datogeneralusuario.getid_provincia(),false,"Formulario");
			this.setActualCiudadForeignKey(datogeneralusuario.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDatoGeneralUsuario()throws Exception {	
		try {
			
			this.setActualUsuarioForeignKey(this.datogeneralusuarioConstantesFunciones.getid_usuario(),false,"Formulario");
			this.setActualPaisForeignKey(this.datogeneralusuarioConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualProvinciaForeignKey(this.datogeneralusuarioConstantesFunciones.getid_provincia(),false,"Formulario");
			this.setActualCiudadForeignKey(this.datogeneralusuarioConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDatoGeneralUsuario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDatoGeneralUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDatoGeneralUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDatoGeneralUsuario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDatoGeneralUsuario()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameProvinciasForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDatoGeneralUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDatoGeneralUsuario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_usuarioDatoGeneralUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public DatoGeneralUsuarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DatoGeneralUsuarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DatoGeneralUsuarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean(); 
		this.datogeneralusuarioConstantesFunciones=new DatoGeneralUsuarioConstantesFunciones(); 
		this.datogeneralusuarioBean=new DatoGeneralUsuario();//(this.datogeneralusuarioConstantesFunciones); 		
		this.datogeneralusuarioReturnGeneral=new DatoGeneralUsuarioParameterReturnGeneral(); 
		
		this.datogeneralusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DatoGeneralUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DatoGeneralUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DatoGeneralUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDatoGeneralUsuario(true);
			
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
			
			this.datogeneralusuarioConstantesFunciones=new DatoGeneralUsuarioConstantesFunciones(); 
			this.datogeneralusuarioBean=new DatoGeneralUsuario();//this.datogeneralusuarioConstantesFunciones); 			
			this.datogeneralusuarioReturnGeneral=new DatoGeneralUsuarioParameterReturnGeneral(); 
		
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato General Usuario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.datogeneralusuario=new DatoGeneralUsuario();
			this.datogeneralusuarios = new ArrayList<DatoGeneralUsuario>();
			this.datogeneralusuariosAux = new ArrayList<DatoGeneralUsuario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic=new DatoGeneralUsuarioLogic();
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.datogeneralusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.datogeneralusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDatoGeneralUsuario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoGeneralUsuario);	
					}
					
					if(this.jInternalFrameImportacionDatoGeneralUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoGeneralUsuario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDatoGeneralUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDatoGeneralUsuario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoGeneralUsuario);
				this.jInternalFrameDetalleFormDatoGeneralUsuario.setVisible(false);
				this.jInternalFrameDetalleFormDatoGeneralUsuario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoGeneralUsuario);
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setVisible(false);
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDatoGeneralUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDatoGeneralUsuario);
					this.jInternalFrameImportacionDatoGeneralUsuario.setVisible(false);
					this.jInternalFrameImportacionDatoGeneralUsuario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDatoGeneralUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDatoGeneralUsuario);
					this.jInternalFrameOrderByDatoGeneralUsuario.setVisible(false);
					this.jInternalFrameOrderByDatoGeneralUsuario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDatoGeneralUsuarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DatoGeneralUsuarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.datogeneralusuarioReturnGeneral=new DatoGeneralUsuarioParameterReturnGeneral();
			
			this.datogeneralusuarioParameterGeneral=new DatoGeneralUsuarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.datogeneralusuarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DatoGeneralUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoGeneralUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado(),this.datogeneralusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoGeneralUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado(),this.datogeneralusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaDuplicarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaCopiarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaVerFormDatoGeneralUsuario=true;
			this.isVisibilidadCeldaOrdenDatoGeneralUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdProvincia=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDatoGeneralUsuario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDatoGeneralUsuario(false);
			
			this.setPermisosUsuarioDatoGeneralUsuario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() 
				|| (this.datogeneralusuarioSessionBean.getEsGuardarRelacionado() && this.datogeneralusuarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDatoGeneralUsuarioClasesRelacionadas();
			}
			
			if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDatoGeneralUsuarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDatoGeneralUsuario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDatoGeneralUsuario();
			}
			
			if(!this.isPermisoBusquedaDatoGeneralUsuario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDatoGeneralUsuario,this.isPermisoPaginacionMedioDatoGeneralUsuario,this.isPermisoPaginacionTodoDatoGeneralUsuario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DatoGeneralUsuarioConstantesFunciones.getTiposSeleccionarDatoGeneralUsuario());
				
				this.tiposColumnasSelect=DatoGeneralUsuarioConstantesFunciones.getTiposSeleccionarDatoGeneralUsuario(true);
				
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
			//if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDatoGeneralUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDatoGeneralUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDatoGeneralUsuario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoGeneralUsuario() ;
			
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
			
			this.usuarioLogic=new UsuarioLogic();
			this.paisLogic=new PaisLogic();
			this.provinciaLogic=new ProvinciaLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				datogeneralusuarioImplementable= (DatoGeneralUsuarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoGeneralUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				datogeneralusuarioImplementableHome= (DatoGeneralUsuarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoGeneralUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.datogeneralusuarios= new ArrayList<DatoGeneralUsuario>();
			this.datogeneralusuariosEliminados= new ArrayList<DatoGeneralUsuario>();
						
			this.isEsNuevoDatoGeneralUsuario=false;
			this.esParaAccionDesdeFormularioDatoGeneralUsuario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDatoGeneralUsuario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDatoGeneralUsuario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DatoGeneralUsuarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDatoGeneralUsuario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDatoGeneralUsuario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDatoGeneralUsuario();
			}
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDatoGeneralUsuario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDatoGeneralUsuario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDatoGeneralUsuario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDatoGeneralUsuario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DatoGeneralUsuario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDatoGeneralUsuario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDatoGeneralUsuario")) {
				iIndex=this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDatoGeneralUsuario();	
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
	
	public void cargarCombosForeignKeyDatoGeneralUsuario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDatoGeneralUsuario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDatoGeneralUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDatoGeneralUsuarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDatoGeneralUsuario();
		
		this.cargarCombosFrameForeignKeyDatoGeneralUsuario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDatoGeneralUsuario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDatoGeneralUsuario();
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

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDatoGeneralUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			
			if(jTableDatosDatoGeneralUsuario.getRowCount()>=1) {
				jTableDatosDatoGeneralUsuario.removeRowSelectionInterval(0, jTableDatosDatoGeneralUsuario.getRowCount()-1);						
			}
			
			this.isEsNuevoDatoGeneralUsuario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDatoGeneralUsuario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDatoGeneralUsuario(true);			
			//this.datogeneralusuario=new DatoGeneralUsuario();
			//this.datogeneralusuario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario() ;
			
			if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoGeneralUsuario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.datogeneralusuario);	
			this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);				
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DatoGeneralUsuario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDatoGeneralUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDatoGeneralUsuario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDatoGeneralUsuario.getSelectedRows().length;			
			}
			
			datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDatoGeneralUsuario--;			
				//DatoGeneralUsuario datogeneralusuarioAux= new DatoGeneralUsuario();			
				//datogeneralusuarioAux.setId(this.iIdNuevoDatoGeneralUsuario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DatoGeneralUsuario datogeneralusuarioOrigen=new DatoGeneralUsuario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DatoGeneralUsuario datogeneralusuarioOrigen : datogeneralusuariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							datogeneralusuarioOrigen =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datogeneralusuarioOrigen =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDatoGeneralUsuario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.datogeneralusuario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDatoGeneralUsuario(datogeneralusuarioOrigen,this.datogeneralusuario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datogeneralusuarioLogic.getDatoGeneralUsuarios().add(this.datogeneralusuarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datogeneralusuarios.add(this.datogeneralusuarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
				
				this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(this.getIndiceNuevoDatoGeneralUsuario(), this.getIndiceNuevoDatoGeneralUsuario());
				
				int iLastRow =  this.jTableDatosDatoGeneralUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoGeneralUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoGeneralUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();									
		
			DatoGeneralUsuario datogeneralusuarioOrigen=new DatoGeneralUsuario();
			DatoGeneralUsuario datogeneralusuarioDestino=new DatoGeneralUsuario();
				
			datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDatoGeneralUsuario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || datogeneralusuariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDatoGeneralUsuario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioOrigen =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datogeneralusuarioOrigen =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datogeneralusuarioDestino =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datogeneralusuarioDestino =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				datogeneralusuarioOrigen =datogeneralusuariosSeleccionados.get(0);
				datogeneralusuarioDestino =datogeneralusuariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDatoGeneralUsuario(datogeneralusuarioOrigen,datogeneralusuarioDestino,true,false);
				
				datogeneralusuarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datogeneralusuarioDestino,datogeneralusuarioLogic.getDatoGeneralUsuarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datogeneralusuarioDestino,datogeneralusuarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
				
				//this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(this.getIndiceNuevoDatoGeneralUsuario(), this.getIndiceNuevoDatoGeneralUsuario());
				
				int iLastRow =  this.jTableDatosDatoGeneralUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoGeneralUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoGeneralUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDatoGeneralUsuario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(!isVisible);
			this.jPanelPaginacionDatoGeneralUsuario.setVisible(!isVisible);
			this.jPanelAccionesDatoGeneralUsuario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDatoGeneralUsuario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDatoGeneralUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDatoGeneralUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDatoGeneralUsuario();
			
			this.abrirFrameOrderByDatoGeneralUsuario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDatoGeneralUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDatoGeneralUsuario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoGeneralUsuario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDatoGeneralUsuario.isMaximum()) {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDatoGeneralUsuario.setSize(this.jInternalFrameDetalleFormDatoGeneralUsuario.iWidthFormulario,this.jInternalFrameDetalleFormDatoGeneralUsuario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDatoGeneralUsuario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDatoGeneralUsuario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDatoGeneralUsuario.isMaximum()) {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jContentPaneDetalleDatoGeneralUsuario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDatoGeneralUsuario.jContentPaneDetalleDatoGeneralUsuario.getWidth(),DatoGeneralUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDatoGeneralUsuario.jContentPaneDetalleDatoGeneralUsuario.getWidth(),DatoGeneralUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDatoGeneralUsuario.jContentPaneDetalleDatoGeneralUsuario.getWidth(),DatoGeneralUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDatoGeneralUsuario.setVisible(true);
	        this.jInternalFrameDetalleFormDatoGeneralUsuario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDatoGeneralUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDatoGeneralUsuario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDatoGeneralUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoGeneralUsuario,false,this);
				} else {
					this.jInternalFrameOrderByDatoGeneralUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoGeneralUsuario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDatoGeneralUsuario);
				this.jInternalFrameOrderByDatoGeneralUsuario.setVisible(false);
				this.jInternalFrameOrderByDatoGeneralUsuario.setSelected(false);
				
				this.jInternalFrameOrderByDatoGeneralUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoGeneralUsuario"));
				
				this.inicializarActualizarBindingTablaOrderByDatoGeneralUsuario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDatoGeneralUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDatoGeneralUsuario==null) {
				
				this.jInternalFrameImportacionDatoGeneralUsuario=new ImportacionJInternalFrame(DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoGeneralUsuario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDatoGeneralUsuario);
				this.jInternalFrameImportacionDatoGeneralUsuario.setVisible(false);
				this.jInternalFrameImportacionDatoGeneralUsuario.setSelected(false);


				this.jInternalFrameImportacionDatoGeneralUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoGeneralUsuario"));
				this.jInternalFrameImportacionDatoGeneralUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoGeneralUsuario"));
				this.jInternalFrameImportacionDatoGeneralUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoGeneralUsuario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDatoGeneralUsuario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario==null) {
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario=new ReporteDinamicoJInternalFrame(DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoGeneralUsuario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoGeneralUsuario);
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setVisible(false);
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoGeneralUsuario"));
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoGeneralUsuario"));
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoGeneralUsuario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoGeneralUsuario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDatoGeneralUsuario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoGeneralUsuario);
			
	       	this.jInternalFrameDetalleFormDatoGeneralUsuario.setVisible(false);
	        this.jInternalFrameDetalleFormDatoGeneralUsuario.setSelected(false);
			
			//this.jInternalFrameDetalleFormDatoGeneralUsuario.dispose();
			//this.jInternalFrameDetalleFormDatoGeneralUsuario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDatoGeneralUsuario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setVisible(true);
	        this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDatoGeneralUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDatoGeneralUsuario.setVisible(true);
	        this.jInternalFrameImportacionDatoGeneralUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDatoGeneralUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDatoGeneralUsuario.setVisible(true);
	        this.jInternalFrameOrderByDatoGeneralUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDatoGeneralUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDatoGeneralUsuario.setVisible(false);
	        this.jInternalFrameOrderByDatoGeneralUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDatoGeneralUsuario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setVisible(false);
	        this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDatoGeneralUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDatoGeneralUsuario.setVisible(false);
	        this.jInternalFrameImportacionDatoGeneralUsuario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDatoGeneralUsuario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDatoGeneralUsuario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDatoGeneralUsuario(true);
			//this.isEsNuevoDatoGeneralUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false) ;
			
			if(datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoGeneralUsuario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDatoGeneralUsuarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDatoGeneralUsuario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDatoGeneralUsuario(true);
			//this.isEsNuevoDatoGeneralUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.datogeneralusuario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false) ;
			
			if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoGeneralUsuario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosForeignKey)throws Exception{
		TableColumn tableColumnUsuario=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_ID));
		TableCellEditor tableCellEditorUsuario =tableColumnUsuario.getCellEditor();

		UsuarioTableCell usuarioTableCellFk=(UsuarioTableCell)tableCellEditorUsuario;

		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.setusuariosForeignKey(usuariosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoGeneralUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//usuarioTableCellFk.setRowActual(intSelectedRow);
			//usuarioTableCellFk.setusuariosForeignKeyActual(usuariosForeignKey);
		//}


		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.RecargarUsuariosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoGeneralUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoGeneralUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoGeneralUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDatoGeneralUsuario(false);
			
			//if(!this.isEsNuevoDatoGeneralUsuario) {								
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				
				//OTRA VEZ SE EJECUTA ESTO
				//PARA RELACION DE UNO A UNO
				if(this.isEsNuevoDatoGeneralUsuario) {
					this.datogeneralusuario.setId(this.id_usuarioFK_IdUsuario);
				}
			}
			
			if(this.permiteMantenimiento(this.datogeneralusuario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDatoGeneralUsuario=true;
					this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
					this.isEsNuevoDatoGeneralUsuario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDatoGeneralUsuario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDatoGeneralUsuario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(false);
				
				this.habilitarDeshabilitarControlesDatoGeneralUsuario(false);
			
												
				
				if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDatoGeneralUsuario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,datogeneralusuarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDatoGeneralUsuario(this.datogeneralusuario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,datogeneralusuarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.datogeneralusuario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				this.datogeneralusuario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				this.datogeneralusuario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.datogeneralusuario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DatoGeneralUsuarioModel) this.jTableDatosDatoGeneralUsuario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDatoGeneralUsuario=true;
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
				this.isEsNuevoDatoGeneralUsuario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(false);
				
				this.habilitarDeshabilitarControlesDatoGeneralUsuario(false);
				
				
				
				if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDatoGeneralUsuario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDatoGeneralUsuario.getRowCount()>=1) {
				jTableDatosDatoGeneralUsuario.removeRowSelectionInterval(0, jTableDatosDatoGeneralUsuario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDatoGeneralUsuario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(false) ;
			
			this.isEsNuevoDatoGeneralUsuario=false;
			
			if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDatoGeneralUsuario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDatoGeneralUsuario(false);
				
				//SI ES MANUAL
				if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDatoGeneralUsuario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDatoGeneralUsuario--;			
			//DatoGeneralUsuario datogeneralusuarioAux= new DatoGeneralUsuario();			
			//datogeneralusuarioAux.setId(this.iIdNuevoDatoGeneralUsuario);
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDatoGeneralUsuario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
			
			this.datogeneralusuario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.datogeneralusuarioLogic.getDatoGeneralUsuarios().add(this.datogeneralusuarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.datogeneralusuarios.add(this.datogeneralusuarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			
			this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(this.getIndiceNuevoDatoGeneralUsuario(), this.getIndiceNuevoDatoGeneralUsuario());
			
			int iLastRow =  this.jTableDatosDatoGeneralUsuario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDatoGeneralUsuario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDatoGeneralUsuario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
			
			//SI ES MANUAL
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoGeneralUsuario();
			}
			
			//this.abrirFrameTreeDatoGeneralUsuario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dato General UsuarioS ?", "MANTENIMIENTO DE Dato General Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDatoGeneralUsuario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDatoGeneralUsuario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.datogeneralusuarioReturnGeneral=datogeneralusuarioLogic.procesarImportacionDatoGeneralUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.datogeneralusuarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDatoGeneralUsuarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDatoGeneralUsuario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDatoGeneralUsuario.setFileImportacion(this.jInternalFrameImportacionDatoGeneralUsuario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDatoGeneralUsuario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDatoGeneralUsuario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDatoGeneralUsuario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDatoGeneralUsuario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		

		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DatoGeneralUsuarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DatoGeneralUsuarioBaseDesign.jrxml";
			
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
			
			this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Provincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Provincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Provincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Provincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoMovil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoMovil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoMovil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoMovil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_URL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_l_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_l_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_l_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_l_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaNacimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaNacimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaNacimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaNacimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoria="id_provincia";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoria="cedula";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS:
					sNombreCampoCategoria="apellidos";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES:
					sNombreCampoCategoria="nombres";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoria="telefono_movil";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="e_mail";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_URL:
					sNombreCampoCategoria="url";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoria="fecha_nacimiento";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoriaValor="id_provincia";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoriaValor="cedula";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS:
					sNombreCampoCategoriaValor="apellidos";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES:
					sNombreCampoCategoriaValor="nombres";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoriaValor="telefono_movil";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="e_mail";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_URL:
					sNombreCampoCategoriaValor="url";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO:
					sNombreCampoCategoriaValor="fecha_nacimiento";
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_provincia");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cedula");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellidos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidos");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombres",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombres");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Movil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_movil");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"E Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"e_mail");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_URL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Url",sNombreCampoCategoria,sNombreCampoCategoriaValor,"url");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Nacimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_nacimiento");
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
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
	
	public void jButtonGenerarExcelReporteDinamicoDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DatoGeneralUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getcedula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getapellidos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getnombres());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.gettelefono_movil());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.gete_mail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_URL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_URL);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.geturl());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getfecha_nacimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(DatoGeneralUsuario datogeneralusuario:datogeneralusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datogeneralusuario.getdireccion());
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
			//	this.getFilaCabeceraExportarExcelDatoGeneralUsuario(row);				
			//	iRow++;
			//}				
			
			//for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDatoGeneralUsuario(datogeneralusuarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
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
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
			
			//SI ES MANUAL
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoGeneralUsuario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
			
			//SI ES MANUAL
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoGeneralUsuario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
			
			//SI ES MANUAL
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoGeneralUsuario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDatoGeneralUsuario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDatoGeneralUsuario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDatoGeneralUsuario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDatoGeneralUsuario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDatoGeneralUsuario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDatoGeneralUsuario.setMinimumSize(dimensionMinimum);
		this.jTableDatosDatoGeneralUsuario.setMaximumSize(dimensionMaximum);
		this.jTableDatosDatoGeneralUsuario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDatoGeneralUsuario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDatoGeneralUsuario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDatoGeneralUsuario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDatoGeneralUsuario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDatoGeneralUsuario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDatoGeneralUsuario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoGeneralUsuario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDatoGeneralUsuario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDatoGeneralUsuario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDatoGeneralUsuario();
		
		this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDatoGeneralUsuario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoGeneralUsuario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDatoGeneralUsuario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDatoGeneralUsuario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDatoGeneralUsuario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDatoGeneralUsuario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDatoGeneralUsuario.jCheckBoxPostAccionNuevoDatoGeneralUsuario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDatoGeneralUsuario.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDatoGeneralUsuario.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDatoGeneralUsuario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDatoGeneralUsuario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jCheckBoxPostAccionNuevoDatoGeneralUsuario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jCheckBoxPostAccionSinCerrarDatoGeneralUsuario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jCheckBoxPostAccionSinMensajeDatoGeneralUsuario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDatoGeneralUsuario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDatoGeneralUsuario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDatoGeneralUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDatoGeneralUsuario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDatoGeneralUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDatoGeneralUsuario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDatoGeneralUsuario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDatoGeneralUsuario(Boolean esInicializar) throws Exception {
		try	{	
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDatoGeneralUsuario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDatoGeneralUsuario() throws Exception {
		try	{
			if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoGeneralUsuario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoGeneralUsuario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoGeneralUsuario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDatoGeneralUsuario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDatoGeneralUsuario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDatoGeneralUsuario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDatoGeneralUsuario.addItem(reporte);
			}
			
			
			if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDatoGeneralUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDatoGeneralUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDatoGeneralUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDatoGeneralUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDatoGeneralUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDatoGeneralUsuario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDatoGeneralUsuario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoGeneralUsuario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoGeneralUsuario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
				
				if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDatoGeneralUsuario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.getSelectedItem()!=null){this.id_ciudadFK_IdCiudad=((Ciudad)this.jComboBoxid_ciudadFK_IdCiudadDatoGeneralUsuario.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisDatoGeneralUsuario.getSelectedItem()).getId();}
		if(this.jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.getSelectedItem()!=null){this.id_provinciaFK_IdProvincia=((Provincia)this.jComboBoxid_provinciaFK_IdProvinciaDatoGeneralUsuario.getSelectedItem()).getId();}
		if(this.jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.getSelectedItem()!=null){this.id_usuarioFK_IdUsuario=((Usuario)this.jComboBoxid_usuarioFK_IdUsuarioDatoGeneralUsuario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDatoGeneralUsuario(Boolean esInicializar) throws Exception {				
		if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDatoGeneralUsuario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDatoGeneralUsuario() throws Exception {
		this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDatoGeneralUsuario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDatoGeneralUsuarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDatoGeneralUsuario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=datogeneralusuarioLogic.getDatoGeneralUsuarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=datogeneralusuarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDatoGeneralUsuario.setModel(new DatoGeneralUsuarioModel(this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDatoGeneralUsuario.setModel(new DatoGeneralUsuarioModel(this.datogeneralusuarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDatoGeneralUsuario!=null && this.jInternalFrameOrderByDatoGeneralUsuario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDatoGeneralUsuario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,datogeneralusuarioConstantesFunciones.resaltarSeleccionarDatoGeneralUsuario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DatoGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO,datogeneralusuarioConstantesFunciones.resaltarSeleccionarDatoGeneralUsuario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_ID));

		if(this.datogeneralusuarioConstantesFunciones.mostrarid_usuarioDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_ID,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datogeneralusuarioConstantesFunciones.resaltarid_usuarioDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarid_usuarioDatoGeneralUsuario,this,true,"id_usuarioDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltarid_usuarioDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarid_usuarioDatoGeneralUsuario,this,true,"id_usuarioDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS));

		if(this.datogeneralusuarioConstantesFunciones.mostrarid_paisDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.datogeneralusuarioConstantesFunciones.resaltarid_paisDatoGeneralUsuario,this,this.datogeneralusuarioConstantesFunciones.activarid_paisDatoGeneralUsuario));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.datogeneralusuarioConstantesFunciones.resaltarid_paisDatoGeneralUsuario,this,this.datogeneralusuarioConstantesFunciones.activarid_paisDatoGeneralUsuario,true,"id_paisDatoGeneralUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA));

		if(this.datogeneralusuarioConstantesFunciones.mostrarid_provinciaDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProvinciaTableCell(this.provinciasForeignKey,this.datogeneralusuarioConstantesFunciones.resaltarid_provinciaDatoGeneralUsuario,this,this.datogeneralusuarioConstantesFunciones.activarid_provinciaDatoGeneralUsuario));
			tableColumn.setCellEditor(new ProvinciaTableCell(this.provinciasForeignKey,this.datogeneralusuarioConstantesFunciones.resaltarid_provinciaDatoGeneralUsuario,this,this.datogeneralusuarioConstantesFunciones.activarid_provinciaDatoGeneralUsuario,true,"id_provinciaDatoGeneralUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD));

		if(this.datogeneralusuarioConstantesFunciones.mostrarid_ciudadDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.datogeneralusuarioConstantesFunciones.resaltarid_ciudadDatoGeneralUsuario,this,this.datogeneralusuarioConstantesFunciones.activarid_ciudadDatoGeneralUsuario));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.datogeneralusuarioConstantesFunciones.resaltarid_ciudadDatoGeneralUsuario,this,this.datogeneralusuarioConstantesFunciones.activarid_ciudadDatoGeneralUsuario,true,"id_ciudadDatoGeneralUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA));

		if(this.datogeneralusuarioConstantesFunciones.mostrarcedulaDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltarcedulaDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarcedulaDatoGeneralUsuario,this,true,"cedulaDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltarcedulaDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarcedulaDatoGeneralUsuario,this,true,"cedulaDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS));

		if(this.datogeneralusuarioConstantesFunciones.mostrarapellidosDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltarapellidosDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarapellidosDatoGeneralUsuario,this,true,"apellidosDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltarapellidosDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarapellidosDatoGeneralUsuario,this,true,"apellidosDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES));

		if(this.datogeneralusuarioConstantesFunciones.mostrarnombresDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltarnombresDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarnombresDatoGeneralUsuario,this,true,"nombresDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltarnombresDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarnombresDatoGeneralUsuario,this,true,"nombresDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO));

		if(this.datogeneralusuarioConstantesFunciones.mostrartelefonoDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltartelefonoDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activartelefonoDatoGeneralUsuario,this,true,"telefonoDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltartelefonoDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activartelefonoDatoGeneralUsuario,this,true,"telefonoDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL));

		if(this.datogeneralusuarioConstantesFunciones.mostrartelefono_movilDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltartelefono_movilDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activartelefono_movilDatoGeneralUsuario,this,true,"telefono_movilDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltartelefono_movilDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activartelefono_movilDatoGeneralUsuario,this,true,"telefono_movilDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL));

		if(this.datogeneralusuarioConstantesFunciones.mostrare_mailDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltare_mailDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activare_mailDatoGeneralUsuario,this,true,"e_mailDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltare_mailDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activare_mailDatoGeneralUsuario,this,true,"e_mailDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_URL));

		if(this.datogeneralusuarioConstantesFunciones.mostrarurlDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_URL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltarurlDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarurlDatoGeneralUsuario,this,true,"urlDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltarurlDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarurlDatoGeneralUsuario,this,true,"urlDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO));

		if(this.datogeneralusuarioConstantesFunciones.mostrarfecha_nacimientoDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.datogeneralusuarioConstantesFunciones.resaltarfecha_nacimientoDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarfecha_nacimientoDatoGeneralUsuario,this,true,"fecha_nacimientoDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltarfecha_nacimientoDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activarfecha_nacimientoDatoGeneralUsuario,this,true,"fecha_nacimientoDatoGeneralUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION));

		if(this.datogeneralusuarioConstantesFunciones.mostrardireccionDatoGeneralUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datogeneralusuarioConstantesFunciones.resaltardireccionDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activardireccionDatoGeneralUsuario,this,true,"direccionDatoGeneralUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datogeneralusuarioConstantesFunciones.resaltardireccionDatoGeneralUsuario,this.datogeneralusuarioConstantesFunciones.activardireccionDatoGeneralUsuario,this,true,"direccionDatoGeneralUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoGeneralUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoGeneralUsuario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoGeneralUsuario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDatoGeneralUsuario.addColumn(tableColumn);
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
			
			this.jTableDatosDatoGeneralUsuario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDatoGeneralUsuario.moveColumn(this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDatoGeneralUsuario.moveColumn(this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDatoGeneralUsuario.moveColumn(this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDatoGeneralUsuario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDatoGeneralUsuario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDatoGeneralUsuario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDatoGeneralUsuario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDatoGeneralUsuario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDatoGeneralUsuario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
		//this.jTableDatosDatoGeneralUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDatoGeneralUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDatoGeneralUsuario();
			
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
				
				//this.isEsNuevoDatoGeneralUsuario=false;
					
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
				if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoGeneralUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoGeneralUsuario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.datogeneralusuario.getsType().equals("DUPLICADO")
				   || this.datogeneralusuario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDatoGeneralUsuario=true;
				
				} else {
					this.isEsNuevoDatoGeneralUsuario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
					if(this.datogeneralusuario.getId()>=0 && !this.datogeneralusuario.getIsNew()) {						
						this.isEsNuevoDatoGeneralUsuario=false;
						
					} else {
						this.isEsNuevoDatoGeneralUsuario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDatoGeneralUsuario(esRelaciones);						
				
				this.seleccionarDatoGeneralUsuario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.datogeneralusuario.getId()<0) {
					this.isEsNuevoDatoGeneralUsuario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDatoGeneralUsuario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDatoGeneralUsuario(evt,rowIndex);
				}	
				
				if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DatoGeneralUsuario: " + this.dDif); 
					}
				}								
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDatoGeneralUsuario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.datogeneralusuario)) {
					if(this.datogeneralusuario.getId()>0) {
						this.datogeneralusuario.setIsDeleted(true);
						
						this.datogeneralusuariosEliminados.add(this.datogeneralusuario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datogeneralusuarioLogic.getDatoGeneralUsuarios().remove(this.datogeneralusuario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datogeneralusuarios.remove(this.datogeneralusuario);				
					}
					
					
					((DatoGeneralUsuarioModel) this.jTableDatosDatoGeneralUsuario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDatoGeneralUsuario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDatoGeneralUsuario) {
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoGeneralUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoGeneralUsuario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuario);
				}
				
				//ARCHITECTURE
				try {
					

					//Usuario
					if(!this.datogeneralusuarioConstantesFunciones.cargarid_usuarioDatoGeneralUsuario || this.datogeneralusuarioConstantesFunciones.event_dependid_usuarioDatoGeneralUsuario) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.datogeneralusuario.getid_usuario());
									//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(datogeneralusuario.getUsuario()!=null) {
							this.usuariosForeignKey.add(datogeneralusuario.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.datogeneralusuario.getid_usuario(),false,"Formulario");

					//Pais
					if(!this.datogeneralusuarioConstantesFunciones.cargarid_paisDatoGeneralUsuario || this.datogeneralusuarioConstantesFunciones.event_dependid_paisDatoGeneralUsuario) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.datogeneralusuario.getid_pais());
									//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(datogeneralusuario.getPais()!=null) {
							this.paissForeignKey.add(datogeneralusuario.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.datogeneralusuario.getid_pais(),false,"Formulario");

					//Provincia
					if(!this.datogeneralusuarioConstantesFunciones.cargarid_provinciaDatoGeneralUsuario || this.datogeneralusuarioConstantesFunciones.event_dependid_provinciaDatoGeneralUsuario) {
						//this.cargarCombosProvinciasForeignKeyLista(" where id="+this.datogeneralusuario.getid_provincia());
									//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
						this.provinciasForeignKey=new ArrayList<Provincia>();

						if(datogeneralusuario.getProvincia()!=null) {
							this.provinciasForeignKey.add(datogeneralusuario.getProvincia());
						}

						this.addItemDefectoCombosForeignKeyProvincia();
						this.cargarCombosFrameProvinciasForeignKey("Todos");
					}
					this.setActualProvinciaForeignKey(this.datogeneralusuario.getid_provincia(),false,"Formulario");

					//Ciudad
					if(!this.datogeneralusuarioConstantesFunciones.cargarid_ciudadDatoGeneralUsuario || this.datogeneralusuarioConstantesFunciones.event_dependid_ciudadDatoGeneralUsuario) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.datogeneralusuario.getid_ciudad());
									//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(datogeneralusuario.getCiudad()!=null) {
							this.ciudadsForeignKey.add(datogeneralusuario.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.datogeneralusuario.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDatoGeneralUsuario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDatoGeneralUsuario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDatoGeneralUsuario(datogeneralusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDatoGeneralUsuario(datogeneralusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDatoGeneralUsuario(datogeneralusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDatoGeneralUsuario(datogeneralusuario);
	}
	
	public void setVariablesObjetoActualToFormularioDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setText(datogeneralusuario.getId().toString());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setText(datogeneralusuario.getcedula());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setText(datogeneralusuario.getapellidos());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setText(datogeneralusuario.getnombres());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setText(datogeneralusuario.gettelefono());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setText(datogeneralusuario.gettelefono_movil());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setText(datogeneralusuario.gete_mail());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setText(datogeneralusuario.geturl());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setDate(datogeneralusuario.getfecha_nacimiento());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setText(datogeneralusuario.getdireccion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DatoGeneralUsuario datogeneralusuarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,datogeneralusuarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DatoGeneralUsuario datogeneralusuarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				datogeneralusuarioLocal=this.datogeneralusuario;
			} else {
				datogeneralusuarioLocal=this.datogeneralusuarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(datogeneralusuarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDatoGeneralUsuario(datogeneralusuarioLocal,true);
					
					if(datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(datogeneralusuarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(datogeneralusuarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(datogeneralusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(datogeneralusuario);
	}
	
	public void setVariablesFormularioToObjetoActualDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(datogeneralusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.getText()==null || this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.getText()=="" || this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.getText()=="Id") {
				this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setText("0");
			}

			if(conColumnasBase) {datogeneralusuario.setId(Long.parseLong(this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.getText()));}

		try {
			datogeneralusuario.setcedula(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelcedulaDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setapellidos(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelapellidosDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setnombres(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelnombresDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.settelefono(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeltelefonoDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.settelefono_movil(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeltelefono_movilDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.sete_mail(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabele_mailDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.seturl(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_URL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelurlDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setfecha_nacimiento(this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelfecha_nacimientoDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datogeneralusuario.setdireccion(this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabeldireccionDatoGeneralUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuarioBean,DatoGeneralUsuario datogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datogeneralusuarioBean.getId()!=null && !datogeneralusuarioBean.getId().equals(-1L))) {datogeneralusuario.setId(datogeneralusuarioBean.getId());}}
			if(conDefault || (!conDefault && datogeneralusuarioBean.getid_pais()!=null && !datogeneralusuarioBean.getid_pais().equals(-1L))) {datogeneralusuario.setid_pais(datogeneralusuarioBean.getid_pais());}
			if(conDefault || (!conDefault && datogeneralusuarioBean.getid_provincia()!=null && !datogeneralusuarioBean.getid_provincia().equals(-1L))) {datogeneralusuario.setid_provincia(datogeneralusuarioBean.getid_provincia());}
			if(conDefault || (!conDefault && datogeneralusuarioBean.getid_ciudad()!=null && !datogeneralusuarioBean.getid_ciudad().equals(-1L))) {datogeneralusuario.setid_ciudad(datogeneralusuarioBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuarioOrigen,DatoGeneralUsuario datogeneralusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datogeneralusuarioOrigen.getId()!=null && !datogeneralusuarioOrigen.getId().equals(-1L))) {datogeneralusuario.setId(datogeneralusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getid_pais()!=null && !datogeneralusuarioOrigen.getid_pais().equals(-1L))) {datogeneralusuario.setid_pais(datogeneralusuarioOrigen.getid_pais());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getid_provincia()!=null && !datogeneralusuarioOrigen.getid_provincia().equals(-1L))) {datogeneralusuario.setid_provincia(datogeneralusuarioOrigen.getid_provincia());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getid_ciudad()!=null && !datogeneralusuarioOrigen.getid_ciudad().equals(-1L))) {datogeneralusuario.setid_ciudad(datogeneralusuarioOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getcedula()!=null && !datogeneralusuarioOrigen.getcedula().equals(""))) {datogeneralusuario.setcedula(datogeneralusuarioOrigen.getcedula());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getapellidos()!=null && !datogeneralusuarioOrigen.getapellidos().equals(""))) {datogeneralusuario.setapellidos(datogeneralusuarioOrigen.getapellidos());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getnombres()!=null && !datogeneralusuarioOrigen.getnombres().equals(""))) {datogeneralusuario.setnombres(datogeneralusuarioOrigen.getnombres());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.gettelefono()!=null && !datogeneralusuarioOrigen.gettelefono().equals(""))) {datogeneralusuario.settelefono(datogeneralusuarioOrigen.gettelefono());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.gettelefono_movil()!=null && !datogeneralusuarioOrigen.gettelefono_movil().equals(""))) {datogeneralusuario.settelefono_movil(datogeneralusuarioOrigen.gettelefono_movil());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.gete_mail()!=null && !datogeneralusuarioOrigen.gete_mail().equals(""))) {datogeneralusuario.sete_mail(datogeneralusuarioOrigen.gete_mail());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.geturl()!=null && !datogeneralusuarioOrigen.geturl().equals(""))) {datogeneralusuario.seturl(datogeneralusuarioOrigen.geturl());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getfecha_nacimiento()!=null && !datogeneralusuarioOrigen.getfecha_nacimiento().equals(new Date()))) {datogeneralusuario.setfecha_nacimiento(datogeneralusuarioOrigen.getfecha_nacimiento());}
			if(conDefault || (!conDefault && datogeneralusuarioOrigen.getdireccion()!=null && !datogeneralusuarioOrigen.getdireccion().equals(""))) {datogeneralusuario.setdireccion(datogeneralusuarioOrigen.getdireccion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setText(datogeneralusuario.getId().toString());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setText(datogeneralusuario.getcedula());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setText(datogeneralusuario.getapellidos());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setText(datogeneralusuario.getnombres());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setText(datogeneralusuario.gettelefono());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setText(datogeneralusuario.gettelefono_movil());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setText(datogeneralusuario.gete_mail());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setText(datogeneralusuario.geturl());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setDate(datogeneralusuario.getfecha_nacimiento());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setText(datogeneralusuario.getdireccion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoGeneralUsuario(DatoGeneralUsuarioBean datogeneralusuarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setText(datogeneralusuarioBean.getId().toString());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setText(datogeneralusuarioBean.getcedula());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setText(datogeneralusuarioBean.getapellidos());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setText(datogeneralusuarioBean.getnombres());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setText(datogeneralusuarioBean.gettelefono());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setText(datogeneralusuarioBean.gettelefono_movil());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setText(datogeneralusuarioBean.gete_mail());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setText(datogeneralusuarioBean.geturl());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setDate(datogeneralusuarioBean.getfecha_nacimiento());
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setText(datogeneralusuarioBean.getdireccion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDatoGeneralUsuario(DatoGeneralUsuarioParameterReturnGeneral datogeneralusuarioReturnGeneral,DatoGeneralUsuarioBean datogeneralusuarioBean,Boolean conDefault) throws Exception { 
		try {
			DatoGeneralUsuario datogeneralusuarioLocal=new DatoGeneralUsuario();
			
			datogeneralusuarioLocal=datogeneralusuarioReturnGeneral.getDatoGeneralUsuario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datogeneralusuarioLocal.getId()!=null && !datogeneralusuarioLocal.getId().equals(-1L))) {datogeneralusuarioBean.setId(datogeneralusuarioLocal.getId());}}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getid_pais()!=null && !datogeneralusuarioLocal.getid_pais().equals(-1L))) {datogeneralusuarioBean.setid_pais(datogeneralusuarioLocal.getid_pais());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getid_provincia()!=null && !datogeneralusuarioLocal.getid_provincia().equals(-1L))) {datogeneralusuarioBean.setid_provincia(datogeneralusuarioLocal.getid_provincia());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getid_ciudad()!=null && !datogeneralusuarioLocal.getid_ciudad().equals(-1L))) {datogeneralusuarioBean.setid_ciudad(datogeneralusuarioLocal.getid_ciudad());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getcedula()!=null && !datogeneralusuarioLocal.getcedula().equals(""))) {datogeneralusuarioBean.setcedula(datogeneralusuarioLocal.getcedula());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getapellidos()!=null && !datogeneralusuarioLocal.getapellidos().equals(""))) {datogeneralusuarioBean.setapellidos(datogeneralusuarioLocal.getapellidos());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getnombres()!=null && !datogeneralusuarioLocal.getnombres().equals(""))) {datogeneralusuarioBean.setnombres(datogeneralusuarioLocal.getnombres());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.gettelefono()!=null && !datogeneralusuarioLocal.gettelefono().equals(""))) {datogeneralusuarioBean.settelefono(datogeneralusuarioLocal.gettelefono());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.gettelefono_movil()!=null && !datogeneralusuarioLocal.gettelefono_movil().equals(""))) {datogeneralusuarioBean.settelefono_movil(datogeneralusuarioLocal.gettelefono_movil());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.gete_mail()!=null && !datogeneralusuarioLocal.gete_mail().equals(""))) {datogeneralusuarioBean.sete_mail(datogeneralusuarioLocal.gete_mail());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.geturl()!=null && !datogeneralusuarioLocal.geturl().equals(""))) {datogeneralusuarioBean.seturl(datogeneralusuarioLocal.geturl());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getfecha_nacimiento()!=null && !datogeneralusuarioLocal.getfecha_nacimiento().equals(new Date()))) {datogeneralusuarioBean.setfecha_nacimiento(datogeneralusuarioLocal.getfecha_nacimiento());}
			if(conDefault || (!conDefault && datogeneralusuarioLocal.getdireccion()!=null && !datogeneralusuarioLocal.getdireccion().equals(""))) {datogeneralusuarioBean.setdireccion(datogeneralusuarioLocal.getdireccion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDatoGeneralUsuarioGenerico(Long idDatoGeneralUsuarioSeleccionado,JComboBox jComboBoxDatoGeneralUsuario,List<DatoGeneralUsuario> datogeneralusuariosLocal)throws Exception {
		try {
			DatoGeneralUsuario  datogeneralusuarioTemp=null;

			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosLocal) {
				if(datogeneralusuarioAux.getId()!=null && datogeneralusuarioAux.getId().equals(idDatoGeneralUsuarioSeleccionado)) {
					datogeneralusuarioTemp=datogeneralusuarioAux;
					break;
				}
			}

			jComboBoxDatoGeneralUsuario.setSelectedItem(datogeneralusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDatoGeneralUsuarioGenerico(JComboBox jComboBoxDatoGeneralUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoGeneralUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDatoGeneralUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoGeneralUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDatoGeneralUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDatoGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDatoGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datogeneralusuario=(DatoGeneralUsuario) datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datogeneralusuario =(DatoGeneralUsuario) datogeneralusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getpais_descripcion();
			}
		}

		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!datogeneralusuario.getIsNew() && !datogeneralusuario.getIsChanged() && !datogeneralusuario.getIsDeleted()) {
				sDescripcion=datogeneralusuario.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=datogeneralusuario.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DatoGeneralUsuario datogeneralusuarioRow=new DatoGeneralUsuario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datogeneralusuarioRow=(DatoGeneralUsuario) datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datogeneralusuarioRow=(DatoGeneralUsuario) datogeneralusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDatoGeneralUsuario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario));			
			this.jButtonDuplicarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaDuplicarDatoGeneralUsuario && this.isPermisoDuplicarDatoGeneralUsuario));			
			this.jButtonCopiarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaCopiarDatoGeneralUsuario && this.isPermisoCopiarDatoGeneralUsuario));
			this.jButtonVerFormDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaVerFormDatoGeneralUsuario && this.isPermisoVerFormDatoGeneralUsuario));
			
			this.jButtonAbrirOrderByDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaOrdenDatoGeneralUsuario && this.isPermisoOrdenDatoGeneralUsuario));			
			
			this.jButtonNuevoRelacionesDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario));			
			this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaModificarDatoGeneralUsuario && this.isPermisoActualizarDatoGeneralUsuario));	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaActualizarDatoGeneralUsuario && this.isPermisoActualizarDatoGeneralUsuario));	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaEliminarDatoGeneralUsuario && this.isPermisoEliminarDatoGeneralUsuario));
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarDatoGeneralUsuario.setVisible(this.isVisibilidadCeldaCancelarDatoGeneralUsuario);							
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));			
			
			}
						
			this.jButtonGuardarCambiosTablaDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario));						
			this.jButtonDuplicarToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaDuplicarDatoGeneralUsuario && this.isPermisoDuplicarDatoGeneralUsuario));						
			this.jButtonCopiarToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaCopiarDatoGeneralUsuario && this.isPermisoCopiarDatoGeneralUsuario));			
			this.jButtonVerFormToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaVerFormDatoGeneralUsuario && this.isPermisoVerFormDatoGeneralUsuario));			
			this.jButtonAbrirOrderByToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaOrdenDatoGeneralUsuario && this.isPermisoOrdenDatoGeneralUsuario));
			this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario));			
			this.jButtonNuevoGuardarCambiosToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));			
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaModificarDatoGeneralUsuario && this.isPermisoActualizarDatoGeneralUsuario));	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaActualizarDatoGeneralUsuario  && this.isPermisoActualizarDatoGeneralUsuario));	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaEliminarDatoGeneralUsuario && this.isPermisoEliminarDatoGeneralUsuario));
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarToolBarDatoGeneralUsuario.setVisible(this.isVisibilidadCeldaCancelarDatoGeneralUsuario);				
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario));			
			this.jMenuItemDuplicarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaDuplicarDatoGeneralUsuario && this.isPermisoDuplicarDatoGeneralUsuario));			
			this.jMenuItemCopiarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaCopiarDatoGeneralUsuario && this.isPermisoCopiarDatoGeneralUsuario));			
			this.jMenuItemVerFormDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaVerFormDatoGeneralUsuario && this.isPermisoVerFormDatoGeneralUsuario));			
			this.jMenuItemAbrirOrderByDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaOrdenDatoGeneralUsuario && this.isPermisoOrdenDatoGeneralUsuario));			
			//this.jMenuItemMostrarOcultarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaOrdenDatoGeneralUsuario && this.isPermisoOrdenDatoGeneralUsuario));
			this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaOrdenDatoGeneralUsuario && this.isPermisoOrdenDatoGeneralUsuario));			
			//this.jMenuItemDetalleMostrarOcultarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaOrdenDatoGeneralUsuario && this.isPermisoOrdenDatoGeneralUsuario));			
			this.jMenuItemNuevoRelacionesDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario));			
			this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaNuevoDatoGeneralUsuario && this.isPermisoNuevoDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));									
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemModificarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaModificarDatoGeneralUsuario && this.isPermisoActualizarDatoGeneralUsuario));	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemActualizarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaActualizarDatoGeneralUsuario && this.isPermisoActualizarDatoGeneralUsuario));	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemEliminarDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaEliminarDatoGeneralUsuario && this.isPermisoEliminarDatoGeneralUsuario));
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemCancelarDatoGeneralUsuario.setVisible(this.isVisibilidadCeldaCancelarDatoGeneralUsuario);				
			}
			
			this.jMenuItemGuardarCambiosDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));						
			this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=this.jButtonNuevoDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaDuplicarDatoGeneralUsuario=this.jButtonDuplicarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaCopiarDatoGeneralUsuario=this.jButtonCopiarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaVerFormDatoGeneralUsuario=this.jButtonVerFormDatoGeneralUsuario.isVisible();
			
			this.isVisibilidadCeldaOrdenDatoGeneralUsuario=this.jButtonAbrirOrderByDatoGeneralUsuario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=this.jButtonNuevoRelacionesDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=this.jButtonModificarDatoGeneralUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaGuardarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=this.jButtonGuardarCambiosTablaDatoGeneralUsuario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=this.jButtonNuevoToolBarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarToolBarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarToolBarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarToolBarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarToolBarDatoGeneralUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoGeneralUsuario=this.jButtonGuardarCambiosToolBarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=this.jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=this.jMenuItemNuevoDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=this.jMenuItemNuevoRelacionesDatoGeneralUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemModificarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemActualizarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemEliminarDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemCancelarDatoGeneralUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoGeneralUsuario=this.jMenuItemGuardarCambiosDatoGeneralUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDatoGeneralUsuario(Boolean esInicializar) {
		if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
				//if(this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDatoGeneralUsuario();
			}
			
			this.inicializarActualizarBindingBotonesManualDatoGeneralUsuario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDatoGeneralUsuario() {
		this.jButtonNuevoDatoGeneralUsuario.setVisible(this.isPermisoNuevoDatoGeneralUsuario);			
		this.jButtonDuplicarDatoGeneralUsuario.setVisible(this.isPermisoDuplicarDatoGeneralUsuario);			
		this.jButtonCopiarDatoGeneralUsuario.setVisible(this.isPermisoCopiarDatoGeneralUsuario);			
		this.jButtonVerFormDatoGeneralUsuario.setVisible(this.isPermisoVerFormDatoGeneralUsuario);			
		
		this.jButtonAbrirOrderByDatoGeneralUsuario.setVisible(this.isPermisoOrdenDatoGeneralUsuario);					
		
		this.jButtonNuevoRelacionesDatoGeneralUsuario.setVisible(this.isPermisoNuevoDatoGeneralUsuario);			
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarDatoGeneralUsuario.setVisible(this.isPermisoActualizarDatoGeneralUsuario);	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarDatoGeneralUsuario.setVisible(this.isPermisoActualizarDatoGeneralUsuario);	
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarDatoGeneralUsuario.setVisible(this.isPermisoEliminarDatoGeneralUsuario);
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarDatoGeneralUsuario.setVisible(this.isVisibilidadCeldaCancelarDatoGeneralUsuario);						
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.setVisible(this.isPermisoGuardarCambiosDatoGeneralUsuario);							
		}
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.setVisible(this.isPermisoActualizarDatoGeneralUsuario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoGeneralUsuario() {
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarDatoGeneralUsuario.setVisible(this.isPermisoActualizarDatoGeneralUsuario);	
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarDatoGeneralUsuario.setVisible(this.isPermisoActualizarDatoGeneralUsuario);	
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarDatoGeneralUsuario.setVisible(this.isPermisoEliminarDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarDatoGeneralUsuario.setVisible(this.isVisibilidadCeldaCancelarDatoGeneralUsuario);							
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.setVisible((this.isVisibilidadCeldaGuardarDatoGeneralUsuario && this.isPermisoGuardarCambiosDatoGeneralUsuario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDatoGeneralUsuario() {
		if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDatoGeneralUsuario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDatoGeneralUsuario() {
	}
	
	public void jTableDatosDatoGeneralUsuarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDatoGeneralUsuario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonid_usuarioDatoGeneralUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebDatoGeneralUsuario(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoGeneralUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.datogeneralusuarioLogic.getConnexion());

				if(this.datogeneralusuario.getId()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.datogeneralusuario.getId());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoGeneralUsuario=(TitledBorder)this.jScrollPanelDatosDatoGeneralUsuario.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderDatoGeneralUsuario.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.datogeneralusuario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisDatoGeneralUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebDatoGeneralUsuario(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoGeneralUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.datogeneralusuarioLogic.getConnexion());

				if(this.datogeneralusuario.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.datogeneralusuario.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoGeneralUsuario=(TitledBorder)this.jScrollPanelDatosDatoGeneralUsuario.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderDatoGeneralUsuario.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.datogeneralusuario.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaDatoGeneralUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebDatoGeneralUsuario(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoGeneralUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.datogeneralusuarioLogic.getConnexion());

				if(this.datogeneralusuario.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.datogeneralusuario.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoGeneralUsuario=(TitledBorder)this.jScrollPanelDatosDatoGeneralUsuario.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderDatoGeneralUsuario.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.datogeneralusuario.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadDatoGeneralUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebDatoGeneralUsuario(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoGeneralUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoGeneralUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.datogeneralusuarioLogic.getConnexion());

				if(this.datogeneralusuario.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.datogeneralusuario.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoGeneralUsuario=(TitledBorder)this.jScrollPanelDatosDatoGeneralUsuario.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderDatoGeneralUsuario.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.datogeneralusuario.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncedulaDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getcedula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cedula like '%"+this.datogeneralusuario.getcedula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidosDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getapellidos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidos like '%"+this.datogeneralusuario.getapellidos()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombresDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getnombres()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombres like '%"+this.datogeneralusuario.getnombres()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.datogeneralusuario.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_movilDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.gettelefono_movil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_movil like '%"+this.datogeneralusuario.gettelefono_movil()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtone_mailDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.gete_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where e_mail like '%"+this.datogeneralusuario.gete_mail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonurlDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.geturl()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where url like '%"+this.datogeneralusuario.geturl()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_nacimientoDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getfecha_nacimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_nacimiento = '"+Funciones2.getStringPostgresDate(this.datogeneralusuario.getfecha_nacimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionDatoGeneralUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.getdatogeneralusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datogeneralusuario==null) {
						this.datogeneralusuario = new DatoGeneralUsuario();
					}

					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);
				}

				if(this.datogeneralusuario.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.datogeneralusuario.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoGeneralUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);

			this.getDatoGeneralUsuariosFK_IdCiudad();

			this.inicializarActualizarBindingDatoGeneralUsuario(false);

			//if(DatoGeneralUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);

			this.getDatoGeneralUsuariosFK_IdPais();

			this.inicializarActualizarBindingDatoGeneralUsuario(false);

			//if(DatoGeneralUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);

			this.getDatoGeneralUsuariosFK_IdProvincia();

			this.inicializarActualizarBindingDatoGeneralUsuario(false);

			//if(DatoGeneralUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioDatoGeneralUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);

			this.getDatoGeneralUsuariosFK_IdUsuario();

			this.inicializarActualizarBindingDatoGeneralUsuario(false);

			//if(DatoGeneralUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datogeneralusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDatoGeneralUsuario() {
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.setVisible(false);	    			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.dispose();
			this.jInternalFrameDetalleFormDatoGeneralUsuario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
			this.jInternalFrameReporteDinamicoDatoGeneralUsuario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDatoGeneralUsuario.dispose();
			this.jInternalFrameReporteDinamicoDatoGeneralUsuario=null;
		}
		
		if(this.jInternalFrameImportacionDatoGeneralUsuario!=null) {
			this.jInternalFrameImportacionDatoGeneralUsuario.setVisible(false);	    			
			this.jInternalFrameImportacionDatoGeneralUsuario.dispose();
			this.jInternalFrameImportacionDatoGeneralUsuario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDatoGeneralUsuario();
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDatoGeneralUsuario")) {
				jButtonDuplicarDatoGeneralUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDatoGeneralUsuario")) {
				jButtonCopiarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormDatoGeneralUsuario")) {
				jButtonVerFormDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDatoGeneralUsuario")) {
				jButtonDuplicarDatoGeneralUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDatoGeneralUsuario")) {
				jButtonDuplicarDatoGeneralUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDatoGeneralUsuario")) {
				jButtonModificarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDatoGeneralUsuario")) {
				jButtonModificarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDatoGeneralUsuario")) {
				jButtonModificarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDatoGeneralUsuario")) {
				jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDatoGeneralUsuario")) {
				jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDatoGeneralUsuario")) {
				jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarDatoGeneralUsuario")) {
				jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDatoGeneralUsuario")) {
				jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDatoGeneralUsuario")) {
				jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarDatoGeneralUsuario")) {
				jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDatoGeneralUsuario")) {
				jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDatoGeneralUsuario")) {
				jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarDatoGeneralUsuario")) {
				jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDatoGeneralUsuario")) {
				jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDatoGeneralUsuario")) {
				jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDatoGeneralUsuario")) {
				jButtonMostrarOcultarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDatoGeneralUsuario")) {
				jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDatoGeneralUsuario")) {
				jButtonCopiarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDatoGeneralUsuario")) {
				jButtonVerFormDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDatoGeneralUsuario")) {
				jButtonCopiarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDatoGeneralUsuario")) {
				jButtonVerFormDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDatoGeneralUsuario")) {
				jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDatoGeneralUsuario")) {
				jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDatoGeneralUsuario")) {
				jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDatoGeneralUsuario")) {
				jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDatoGeneralUsuario")) {
				jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDatoGeneralUsuario")) {
				jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDatoGeneralUsuario")) {
				jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDatoGeneralUsuario")) {
				jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDatoGeneralUsuario")) {
				jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDatoGeneralUsuario") || sTipo.equals("MenuItemDetalleAbrirOrderByDatoGeneralUsuario")) {
				jButtonAbrirOrderByDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDatoGeneralUsuario") || sTipo.equals("MenuItemDetalleMostrarOcultarDatoGeneralUsuario")) {
				jButtonMostrarOcultarDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDatoGeneralUsuario")) {
				jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDatoGeneralUsuario")) {
				jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDatoGeneralUsuario")) {
				jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDatoGeneralUsuario")) {
				jButtonCerrarReporteDinamicoDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDatoGeneralUsuario")) {
				jButtonGenerarReporteDinamicoDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDatoGeneralUsuario")) {
				
				jButtonGenerarExcelReporteDinamicoDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDatoGeneralUsuario")) {
				jButtonCerrarImportacionDatoGeneralUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDatoGeneralUsuario")) {
				
				jButtonGenerarImportacionDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDatoGeneralUsuario")) {
				
				jButtonAbrirImportacionDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDatoGeneralUsuario")) {
				jComboBoxTiposAccionesDatoGeneralUsuarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDatoGeneralUsuario")) {
				jComboBoxTiposRelacionesDatoGeneralUsuarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDatoGeneralUsuario")) {
				jComboBoxTiposAccionesDatoGeneralUsuarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDatoGeneralUsuario")) {
				
				jComboBoxTiposSeleccionarDatoGeneralUsuarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDatoGeneralUsuario")) {
				jTextFieldValorCampoGeneralDatoGeneralUsuarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDatoGeneralUsuario")) {
				jButtonAbrirOrderByDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDatoGeneralUsuario")) {
				jButtonAbrirOrderByDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDatoGeneralUsuario")) {
				jButtonCerrarOrderByDatoGeneralUsuarioActionPerformed(evt);
			} 
						
			
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDatoGeneralUsuarioUpdate")) {
				this.jButtonid_usuarioDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_usuarioDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisDatoGeneralUsuarioUpdate")) {
				this.jButtonid_paisDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_paisDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaDatoGeneralUsuarioUpdate")) {
				this.jButtonid_provinciaDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_provinciaDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadDatoGeneralUsuarioUpdate")) {
				this.jButtonid_ciudadDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_ciudadDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaDatoGeneralUsuarioBusqueda")) {
				this.jButtoncedulaDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidosDatoGeneralUsuarioBusqueda")) {
				this.jButtonapellidosDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombresDatoGeneralUsuarioBusqueda")) {
				this.jButtonnombresDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoDatoGeneralUsuarioBusqueda")) {
				this.jButtontelefonoDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_movilDatoGeneralUsuarioBusqueda")) {
				this.jButtontelefono_movilDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailDatoGeneralUsuarioBusqueda")) {
				this.jButtone_mailDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("urlDatoGeneralUsuarioBusqueda")) {
				this.jButtonurlDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoDatoGeneralUsuarioBusqueda")) {
				this.jButtonfecha_nacimientoDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionDatoGeneralUsuarioBusqueda")) {
				this.jButtondireccionDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCiudadDatoGeneralUsuario")) {
				this.jButtonFK_IdCiudadDatoGeneralUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisDatoGeneralUsuario")) {
				this.jButtonFK_IdPaisDatoGeneralUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProvinciaDatoGeneralUsuario")) {
				this.jButtonFK_IdProvinciaDatoGeneralUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUsuarioDatoGeneralUsuario")) {
				this.jButtonFK_IdUsuarioDatoGeneralUsuarioActionPerformed(evt);
			}
			
			;
			
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDatoGeneralUsuario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DatoGeneralUsuario datogeneralusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				datogeneralusuarioLocal=this.datogeneralusuario;
			} else {
				datogeneralusuarioLocal=this.datogeneralusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
							
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
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
			
			


			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
								
						
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
								
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
							
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
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
			
			


			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
								
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDatoGeneralUsuario")) {
					jCheckBoxSeleccionarTodosDatoGeneralUsuarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDatoGeneralUsuario")) {
					jCheckBoxSeleccionadosDatoGeneralUsuarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDatoGeneralUsuario")) {
					
				}
				
				


				
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
												
				
				


				
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
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
			
			


			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datogeneralusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datogeneralusuario);
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
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
				
				


				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoGeneralUsuario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoGeneralUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoGeneralUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datogeneralusuarioAnterior =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDatoGeneralUsuario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDatoGeneralUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDatoGeneralUsuario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.datogeneralusuario =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.datogeneralusuario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDatoGeneralUsuario")) {
				
				}
				
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDatoGeneralUsuario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDatoGeneralUsuario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDatoGeneralUsuario")) {
			
			}
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDatoGeneralUsuario();
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			if(sTipo.equals("NuevoDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDatoGeneralUsuario")) {
				jButtonDuplicarDatoGeneralUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDatoGeneralUsuario")) {
				jButtonCopiarDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDatoGeneralUsuario")) {
				jButtonVerFormDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDatoGeneralUsuario")) {
				jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDatoGeneralUsuario")) {
				jButtonModificarDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDatoGeneralUsuario")) {
				jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDatoGeneralUsuario")) {
				jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDatoGeneralUsuario")) {
				jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDatoGeneralUsuario")) {
				jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDatoGeneralUsuario")) {
				jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDatoGeneralUsuario")) {
				jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDatoGeneralUsuario")) {
				jButtonAbrirOrderByDatoGeneralUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDatoGeneralUsuario")) {
				jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDatoGeneralUsuario")) {
				jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDatoGeneralUsuario")) {
				jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);			
			} 
			
			
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDatoGeneralUsuarioUpdate")) {
				this.jButtonid_usuarioDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_usuarioDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisDatoGeneralUsuarioUpdate")) {
				this.jButtonid_paisDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_paisDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaDatoGeneralUsuarioUpdate")) {
				this.jButtonid_provinciaDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_provinciaDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadDatoGeneralUsuarioUpdate")) {
				this.jButtonid_ciudadDatoGeneralUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadDatoGeneralUsuarioBusqueda")) {
				this.jButtonid_ciudadDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaDatoGeneralUsuarioBusqueda")) {
				this.jButtoncedulaDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidosDatoGeneralUsuarioBusqueda")) {
				this.jButtonapellidosDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombresDatoGeneralUsuarioBusqueda")) {
				this.jButtonnombresDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoDatoGeneralUsuarioBusqueda")) {
				this.jButtontelefonoDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_movilDatoGeneralUsuarioBusqueda")) {
				this.jButtontelefono_movilDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailDatoGeneralUsuarioBusqueda")) {
				this.jButtone_mailDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("urlDatoGeneralUsuarioBusqueda")) {
				this.jButtonurlDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_nacimientoDatoGeneralUsuarioBusqueda")) {
				this.jButtonfecha_nacimientoDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionDatoGeneralUsuarioBusqueda")) {
				this.jButtondireccionDatoGeneralUsuarioBusquedaActionPerformed(evt);
			}
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDatoGeneralUsuario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDatoGeneralUsuario")) {
				closingInternalFrameDatoGeneralUsuario();
				
			} else if(sTipo.equals("jButtonCancelarDatoGeneralUsuario")) {
				JInternalFrameBase jInternalFrameDetalleFormDatoGeneralUsuario = (JInternalFrameBase)evt.getSource();
	            	
	            DatoGeneralUsuarioBeanSwingJInternalFrame jInternalFrameParent=(DatoGeneralUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoGeneralUsuario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDatoGeneralUsuarioActionPerformed(null);
			}
			
			DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datogeneralusuario,new Object(),this.datogeneralusuarioParameterGeneral,this.datogeneralusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDatoGeneralUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDatoGeneralUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDatoGeneralUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.datogeneralusuario)) {
			if(!esControlTabla) {
				if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);			
				}
				
				if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datogeneralusuarioReturnGeneral=datogeneralusuarioLogic.procesarEventosDatoGeneralUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),this.datogeneralusuario,this.datogeneralusuarioParameterGeneral,this.isEsNuevoDatoGeneralUsuario,classes);//this.datogeneralusuarioLogic.getDatoGeneralUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral,this.datogeneralusuarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDatoGeneralUsuario(classes,this.datogeneralusuarioReturnGeneral,this.datogeneralusuarioBean,false);
					}
						
					if(this.datogeneralusuarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario());	
					}
						
					if(this.datogeneralusuarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario(),classes);//this.datogeneralusuarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDatoGeneralUsuario(this.datogeneralusuario,classes);//this.datogeneralusuarioBean);									
				}
			
				if(DatoGeneralUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDatoGeneralUsuario(this.datogeneralusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoGeneralUsuario(this.datogeneralusuario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.datogeneralusuarioAnterior!=null) {
						this.datogeneralusuario=this.datogeneralusuarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datogeneralusuarioReturnGeneral=datogeneralusuarioLogic.procesarEventosDatoGeneralUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),this.datogeneralusuario,this.datogeneralusuarioParameterGeneral,this.isEsNuevoDatoGeneralUsuario,classes);//this.datogeneralusuarioLogic.getDatoGeneralUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datogeneralusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datogeneralusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario(),datogeneralusuarioLogic.getDatoGeneralUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario(),this.datogeneralusuarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDatoGeneralUsuario.repaint();
				
				//((AbstractTableModel) this.jTableDatosDatoGeneralUsuario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDatoGeneralUsuario();
			}
		}
	}
	
	public void actualizarVisualTableDatosDatoGeneralUsuario() throws Exception {
		
		DatoGeneralUsuarioModel datogeneralusuarioModel=(DatoGeneralUsuarioModel)this.jTableDatosDatoGeneralUsuario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datogeneralusuarioModel.datogeneralusuarios=this.datogeneralusuarioLogic.getDatoGeneralUsuarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			datogeneralusuarioModel.datogeneralusuarios=this.datogeneralusuarios;
		}
		
		
		((DatoGeneralUsuarioModel) this.jTableDatosDatoGeneralUsuario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDatoGeneralUsuario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdatogeneralusuarioAnterior(),this.datogeneralusuarioLogic.getDatoGeneralUsuarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdatogeneralusuarioAnterior(),this.datogeneralusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDatoGeneralUsuario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
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
										
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datogeneralusuario,new Object(),generalEntityParameterGeneral,this.datogeneralusuarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DatoGeneralUsuarioConstantesFunciones.getClassesRelationshipsOfDatoGeneralUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DatoGeneralUsuarioConstantesFunciones.getClassesRelationshipsFromStringsOfDatoGeneralUsuario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDatoGeneralUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datogeneralusuario,new Object(),generalEntityParameterGeneral,this.datogeneralusuarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDatoGeneralUsuario(DatoGeneralUsuarioBean datogeneralusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDatoGeneralUsuario(ArrayList<Classe> classes,DatoGeneralUsuarioReturnGeneral datogeneralusuarioReturnGeneral,DatoGeneralUsuarioBean datogeneralusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.datogeneralusuario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario = new DatoGeneralUsuarioDetalleFormJInternalFrame(jDesktopPane,this.datogeneralusuarioSessionBean.getConGuardarRelaciones(),this.datogeneralusuarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.setVisible(false);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.setSelected(false);						
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.datogeneralusuarioLogic=this.datogeneralusuarioLogic;
		
		this.cargarCombosFrameForeignKeyDatoGeneralUsuario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoGeneralUsuario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoGeneralUsuario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDatoGeneralUsuario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDatoGeneralUsuario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoGeneralUsuario"));
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"ModificarDatoGeneralUsuario"));

		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoGeneralUsuario"));
					
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemModificarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoGeneralUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"ActualizarDatoGeneralUsuario"));
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoGeneralUsuario"));
						
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemActualizarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoGeneralUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"EliminarDatoGeneralUsuario"));
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoGeneralUsuario"));
								
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemEliminarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoGeneralUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CancelarDatoGeneralUsuario"));
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoGeneralUsuario"));
					
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemCancelarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoGeneralUsuario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemDetalleCerrarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoGeneralUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoGeneralUsuario"));
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoGeneralUsuario"));
		
		
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoGeneralUsuario"));
		
		
				
		
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_usuarioDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_usuarioDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_paisDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_paisDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_provinciaDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_provinciaDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_ciudadDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_ciudadDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtoncedulaDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"cedulaDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonapellidosDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"apellidosDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonnombresDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombresDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtontelefonoDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"telefonoDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtontelefono_movilDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"telefono_movilDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtone_mailDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"e_mailDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonurlDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"urlDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtondireccionDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"direccionDatoGeneralUsuarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoGeneralUsuario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDatoGeneralUsuario"));
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoGeneralUsuario"));
		}
		
		this.jTableDatosDatoGeneralUsuario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDatoGeneralUsuario"));
		
		this.jTableDatosDatoGeneralUsuario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDatoGeneralUsuario"));
		
		this.jButtonNuevoDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"NuevoDatoGeneralUsuario"));
		
		this.jButtonDuplicarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"DuplicarDatoGeneralUsuario"));
		
		this.jButtonCopiarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"CopiarDatoGeneralUsuario"));
		
		this.jButtonVerFormDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"VerFormDatoGeneralUsuario"));
		
		
		this.jButtonNuevoToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"NuevoToolBarDatoGeneralUsuario"));
			
		this.jButtonDuplicarToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDatoGeneralUsuario"));
			
		this.jMenuItemNuevoDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDatoGeneralUsuario"));
			
		this.jMenuItemDuplicarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDatoGeneralUsuario"));		
		
		
		this.jButtonNuevoRelacionesDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDatoGeneralUsuario"));
		
		
		this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDatoGeneralUsuario"));
			
		this.jMenuItemNuevoRelacionesDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDatoGeneralUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"ModificarDatoGeneralUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonModificarToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoGeneralUsuario"));
			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemModificarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoGeneralUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"ActualizarDatoGeneralUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonActualizarToolBarDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoGeneralUsuario"));
				
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemActualizarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoGeneralUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"EliminarDatoGeneralUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonEliminarToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoGeneralUsuario"));
						
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemEliminarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoGeneralUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CancelarDatoGeneralUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonCancelarToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoGeneralUsuario"));
			
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemCancelarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoGeneralUsuario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDatoGeneralUsuario"));		
		
		
		this.jButtonCerrarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CerrarDatoGeneralUsuario"));
		
		
		this.jButtonCerrarToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CerrarToolBarDatoGeneralUsuario"));
			
		this.jMenuItemCerrarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDatoGeneralUsuario"));
			
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jMenuItemDetalleCerrarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoGeneralUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosDatoGeneralUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoGeneralUsuario"));
		}
		
		this.jButtonCopiarToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CopiarToolBarDatoGeneralUsuario"));
			
		this.jButtonVerFormToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"VerFormToolBarDatoGeneralUsuario"));
		
		this.jMenuItemGuardarCambiosDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDatoGeneralUsuario"));
			
		this.jMenuItemCopiarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDatoGeneralUsuario"));		
		
		this.jMenuItemVerFormDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDatoGeneralUsuario"));		
		
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoGeneralUsuario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDatoGeneralUsuario"));
			
		this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoGeneralUsuario"));		
		
		
		
		this.jButtonRecargarInformacionDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionDatoGeneralUsuario"));
					
		this.jButtonRecargarInformacionToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDatoGeneralUsuario"));
		
		this.jMenuItemRecargarInformacionDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDatoGeneralUsuario"));		
		
		
		
		this.jButtonAnterioresDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"AnterioresDatoGeneralUsuario"));
		
		
		this.jButtonAnterioresToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDatoGeneralUsuario"));
		
		this.jMenuItemAnterioresDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDatoGeneralUsuario"));		
		
		
		this.jButtonSiguientesDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"SiguientesDatoGeneralUsuario"));
		
		
		this.jButtonSiguientesToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDatoGeneralUsuario"));
			
		this.jMenuItemSiguientesDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDatoGeneralUsuario"));
			
		this.jMenuItemAbrirOrderByDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDatoGeneralUsuario"));
			
		this.jMenuItemMostrarOcultarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDatoGeneralUsuario"));
			
		this.jMenuItemDetalleAbrirOrderByDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDatoGeneralUsuario"));
			
		this.jMenuItemDetalleMostarOcultarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDatoGeneralUsuario"));		
		
		
		this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDatoGeneralUsuario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDatoGeneralUsuario"));
			
		this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDatoGeneralUsuario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDatoGeneralUsuario"));

		this.jCheckBoxSeleccionadosDatoGeneralUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDatoGeneralUsuario"));
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoGeneralUsuario"));
		}
		
		
		this.jComboBoxTiposRelacionesDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"TiposRelacionesDatoGeneralUsuario"));
			
		this.jComboBoxTiposAccionesDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesDatoGeneralUsuario"));
					
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDatoGeneralUsuario"));
			
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDatoGeneralUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_usuarioDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_usuarioDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_paisDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_paisDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_provinciaDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_provinciaDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_ciudadDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_ciudadDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtoncedulaDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"cedulaDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonapellidosDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"apellidosDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonnombresDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombresDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtontelefonoDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"telefonoDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtontelefono_movilDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"telefono_movilDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtone_mailDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"e_mailDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonurlDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"urlDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtondireccionDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"direccionDatoGeneralUsuarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdCiudadDatoGeneralUsuario"));

			this.jButtonFK_IdPaisDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdPaisDatoGeneralUsuario"));

			this.jButtonFK_IdProvinciaDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaDatoGeneralUsuario"));

			this.jButtonFK_IdUsuarioDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdUsuarioDatoGeneralUsuario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDatoGeneralUsuario!=null) {
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoGeneralUsuario"));
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoGeneralUsuario"));
				this.jInternalFrameReporteDinamicoDatoGeneralUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoGeneralUsuario"));
			}
			
			//this.jButtonCerrarReporteDinamicoDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoGeneralUsuario"));				
			//this.jButtonGenerarReporteDinamicoDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoGeneralUsuario"));
			//this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoGeneralUsuario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDatoGeneralUsuario!=null) {
				this.jInternalFrameImportacionDatoGeneralUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoGeneralUsuario"));
				this.jInternalFrameImportacionDatoGeneralUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoGeneralUsuario"));
				this.jInternalFrameImportacionDatoGeneralUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoGeneralUsuario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByDatoGeneralUsuario"));
			
			this.jButtonAbrirOrderByToolBarDatoGeneralUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDatoGeneralUsuario"));			
			
			if(this.jInternalFrameOrderByDatoGeneralUsuario!=null) {
				this.jInternalFrameOrderByDatoGeneralUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoGeneralUsuario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoGeneralUsuario.jTabbedPaneRelacionesDatoGeneralUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoGeneralUsuario"));
		
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
            		closingInternalFrameDatoGeneralUsuario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDatoGeneralUsuario = (JInternalFrameBase)event.getSource();
	            	
	            DatoGeneralUsuarioBeanSwingJInternalFrame jInternalFrameParent=(DatoGeneralUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoGeneralUsuario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDatoGeneralUsuarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDatoGeneralUsuario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDatoGeneralUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDatoGeneralUsuario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDatoGeneralUsuario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDatoGeneralUsuario";
		inputMap = this.jButtonNuevoDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDatoGeneralUsuario";
		inputMap = this.jButtonNuevoRelacionesDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoGeneralUsuarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDatoGeneralUsuario";
		inputMap = this.jButtonModificarDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDatoGeneralUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDatoGeneralUsuario";
		inputMap = this.jButtonActualizarDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDatoGeneralUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDatoGeneralUsuario";
		inputMap = this.jButtonEliminarDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDatoGeneralUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDatoGeneralUsuario";
		inputMap = this.jButtonCancelarDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDatoGeneralUsuario";
		inputMap = this.jButtonCerrarDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDatoGeneralUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDatoGeneralUsuario";
		inputMap = this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonGuardarCambiosDatoGeneralUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDatoGeneralUsuario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDatoGeneralUsuarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDatoGeneralUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDatoGeneralUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDatoGeneralUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDatoGeneralUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDatoGeneralUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDatoGeneralUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_usuarioDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_usuarioDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_paisDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_paisDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_paisDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_provinciaDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_provinciaDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaDatoGeneralUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_ciudadDatoGeneralUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonid_ciudadDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtoncedulaDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"cedulaDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonapellidosDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"apellidosDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonnombresDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombresDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtontelefonoDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"telefonoDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtontelefono_movilDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"telefono_movilDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtone_mailDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"e_mailDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonurlDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"urlDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtonfecha_nacimientoDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_nacimientoDatoGeneralUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jButtondireccionDatoGeneralUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"direccionDatoGeneralUsuarioBusqueda"));
		
		
		this.jButtonFK_IdCiudadDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdCiudadDatoGeneralUsuario"));

		this.jButtonFK_IdPaisDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdPaisDatoGeneralUsuario"));

		this.jButtonFK_IdProvinciaDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaDatoGeneralUsuario"));

		this.jButtonFK_IdUsuarioDatoGeneralUsuario.addActionListener(new ButtonActionListener(this,"FK_IdUsuarioDatoGeneralUsuario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDatoGeneralUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDatoGeneralUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDatoGeneralUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDatoGeneralUsuario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDatoGeneralUsuario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
					datogeneralusuarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
					datogeneralusuarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDatoGeneralUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
						datogeneralusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
						datogeneralusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoGeneralUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoGeneralUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDatoGeneralUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDatoGeneralUsuario.getSelectedRows();
			
			DatoGeneralUsuario datogeneralusuarioLocal=new DatoGeneralUsuario();
			
			//this.seleccionarTodosDatoGeneralUsuario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datogeneralusuarioLocal =(DatoGeneralUsuario) this.datogeneralusuarioLogic.getDatoGeneralUsuarios().toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					datogeneralusuarioLocal =(DatoGeneralUsuario) this.datogeneralusuarios.toArray()[this.jTableDatosDatoGeneralUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				datogeneralusuarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
						datogeneralusuarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
						datogeneralusuarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoGeneralUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoGeneralUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoGeneralUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDatoGeneralUsuarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDatoGeneralUsuarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDatoGeneralUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDatoGeneralUsuario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
				
						if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							datogeneralusuarioAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS)) {
							existe=true;
							datogeneralusuarioAux.setapellidos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES)) {
							existe=true;
							datogeneralusuarioAux.setnombres(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							datogeneralusuarioAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							datogeneralusuarioAux.settelefono_movil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							datogeneralusuarioAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_URL)) {
							existe=true;
							datogeneralusuarioAux.seturl(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							datogeneralusuarioAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							datogeneralusuarioAux.setdireccion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarios) {
					
						if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							datogeneralusuarioAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS)) {
							existe=true;
							datogeneralusuarioAux.setapellidos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES)) {
							existe=true;
							datogeneralusuarioAux.setnombres(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							datogeneralusuarioAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							datogeneralusuarioAux.settelefono_movil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							datogeneralusuarioAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_URL)) {
							existe=true;
							datogeneralusuarioAux.seturl(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO)) {
							existe=true;
							datogeneralusuarioAux.setfecha_nacimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							datogeneralusuarioAux.setdireccion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDatoGeneralUsuarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDatoGeneralUsuario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDatoGeneralUsuario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDatoGeneralUsuario) {				
					conSplash=true;//false;										
					
					//this.startProcessDatoGeneralUsuario(conSplash);
				
					this.generarReporteDatoGeneralUsuariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDatoGeneralUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoGeneralUsuariosSeleccionados(false);
				//this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoGeneralUsuariosSeleccionados(true);
				//this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoGeneralUsuario();
				
				this.exportarDatoGeneralUsuariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDatoGeneralUsuarios();
				//this.importarDatoGeneralUsuarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoGeneralUsuario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDatoGeneralUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dato General Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDatoGeneralUsuario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDatoGeneralUsuario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDatoGeneralUsuario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
				}	
			} 			
			else if(DatoGeneralUsuarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDatoGeneralUsuario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDatoGeneralUsuario(conSplash);
					
						//this.actualizarParametrosGeneralDatoGeneralUsuario();
						
						this.generarReporteProcesoAccionDatoGeneralUsuariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dato General UsuarioS SELECCIONADOS?", "MANTENIMIENTO DE Dato General Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDatoGeneralUsuario();
				
						this.actualizarParametrosGeneralDatoGeneralUsuario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.datogeneralusuarioReturnGeneral=datogeneralusuarioLogic.procesarAccionDatoGeneralUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.datogeneralusuarioLogic.getDatoGeneralUsuarios(),this.datogeneralusuarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDatoGeneralUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDatoGeneralUsuario();
					
					DatoGeneralUsuarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDatoGeneralUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoGeneralUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxTiposAccionesFormularioDatoGeneralUsuario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDatoGeneralUsuario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDatoGeneralUsuarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDatoGeneralUsuario();
			
			if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
			DatoGeneralUsuario datogeneralusuario=new DatoGeneralUsuario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDatoGeneralUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDatoGeneralUsuario.getSelectedItem();
			
			
			
			
			datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(datogeneralusuariosSeleccionados.size()==1) {
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
					datogeneralusuario=datogeneralusuarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDatoGeneralUsuario();
			
      		//this.finishProcessDatoGeneralUsuario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDatoGeneralUsuarioReturnGeneral() throws Exception {
		if(this.datogeneralusuarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.datogeneralusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.datogeneralusuarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.datogeneralusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.datogeneralusuarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.datogeneralusuarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
		}
		
		if(this.datogeneralusuarioReturnGeneral.getConRetornoLista() || this.datogeneralusuarioReturnGeneral.getConRetornoObjeto()) {
			if(this.datogeneralusuarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datogeneralusuarioLogic.setDatoGeneralUsuarios(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.datogeneralusuarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datogeneralusuarioLogic.setDatoGeneralUsuario(this.datogeneralusuarioReturnGeneral.getDatoGeneralUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDatoGeneralUsuario(false);
		}
	}
	
	public void actualizarParametrosGeneralDatoGeneralUsuario() throws Exception {
		
		
	}
	
	public ArrayList<DatoGeneralUsuario> getDatoGeneralUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDatoGeneralUsuario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuarioLogic.getDatoGeneralUsuarios()) {
					if(datogeneralusuarioAux.getIsSelected()) {
						datogeneralusuariosSeleccionados.add(datogeneralusuarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoGeneralUsuario datogeneralusuarioAux:this.datogeneralusuarios) {
					if(datogeneralusuarioAux.getIsSelected()) {
						datogeneralusuariosSeleccionados.add(datogeneralusuarioAux);				
					}
				}
			}
			
			if(datogeneralusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						datogeneralusuariosSeleccionados.addAll(this.datogeneralusuarioLogic.getDatoGeneralUsuarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						datogeneralusuariosSeleccionados.addAll(this.datogeneralusuarios);				
					}
				}
			}
		} else {
			datogeneralusuariosSeleccionados.add(this.datogeneralusuario);
		}
		
		return datogeneralusuariosSeleccionados;
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
	
	public void generarReporteDatoGeneralUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDatoGeneralUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDatoGeneralUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoGeneralUsuariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoGeneralUsuariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dato General Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDatoGeneralUsuariosSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados);
		
	}	
	
	public void generarReporteNormalDatoGeneralUsuariosSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDatoGeneralUsuariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDatoGeneralUsuariosSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDatoGeneralUsuario();
		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDatoGeneralUsuario();
		
		
		//this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados ,datogeneralusuarioImplementable,datogeneralusuarioImplementableHome);
	}
	
	public void mostrarImportacionDatoGeneralUsuarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDatoGeneralUsuario();
		
		this.abrirFrameImportacionDatoGeneralUsuario();		
		
			
		//this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados ,datogeneralusuarioImplementable,datogeneralusuarioImplementableHome);
	}
	
	public void importarDatoGeneralUsuarios() throws Exception {		
	
	}
	
	public void exportarDatoGeneralUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDatoGeneralUsuariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDatoGeneralUsuariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDatoGeneralUsuariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dato General Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDatoGeneralUsuariosSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDatoGeneralUsuario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDatoGeneralUsuario(datogeneralusuarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//datogeneralusuarioAux.setsDetalleGeneralEntityReporte(datogeneralusuarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDatoGeneralUsuario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_URL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=datogeneralusuario.getusuario_descripcion();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getcedula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getapellidos();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getnombres();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.gettelefono_movil();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.gete_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.geturl();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getfecha_nacimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datogeneralusuario.getdireccion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDatoGeneralUsuariosSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DatoGeneralUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDatoGeneralUsuario(row);				
				iRow++;
			}				
			
			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDatoGeneralUsuario(datogeneralusuarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDatoGeneralUsuariosSeleccionados() throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();		
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datogeneralusuario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("datogeneralusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("datogeneralusuario");
			//elementRoot.appendChild(element);
		
			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
				element = document.createElement("datogeneralusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDatoGeneralUsuario(datogeneralusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato General Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDatoGeneralUsuario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_URL);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getcedula());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getapellidos());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getnombres());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.gettelefono_movil());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.gete_mail());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.geturl());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getfecha_nacimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(datogeneralusuario.getdireccion());				
	}
	
	public void setFilaDatosExportarXmlDatoGeneralUsuario(DatoGeneralUsuario datogeneralusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementusuario_descripcion = document.createElement(DatoGeneralUsuarioConstantesFunciones.ID);
		elementusuario_descripcion.appendChild(document.createTextNode(datogeneralusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DatoGeneralUsuarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(datogeneralusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(DatoGeneralUsuarioConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(datogeneralusuario.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementprovincia_descripcion = document.createElement(DatoGeneralUsuarioConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(datogeneralusuario.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementciudad_descripcion = document.createElement(DatoGeneralUsuarioConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(datogeneralusuario.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementcedula = document.createElement(DatoGeneralUsuarioConstantesFunciones.CEDULA);
		elementcedula.appendChild(document.createTextNode(datogeneralusuario.getcedula().trim()));
		element.appendChild(elementcedula);

		Element elementapellidos = document.createElement(DatoGeneralUsuarioConstantesFunciones.APELLIDOS);
		elementapellidos.appendChild(document.createTextNode(datogeneralusuario.getapellidos().trim()));
		element.appendChild(elementapellidos);

		Element elementnombres = document.createElement(DatoGeneralUsuarioConstantesFunciones.NOMBRES);
		elementnombres.appendChild(document.createTextNode(datogeneralusuario.getnombres().trim()));
		element.appendChild(elementnombres);

		Element elementtelefono = document.createElement(DatoGeneralUsuarioConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(datogeneralusuario.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefono_movil = document.createElement(DatoGeneralUsuarioConstantesFunciones.TELEFONOMOVIL);
		elementtelefono_movil.appendChild(document.createTextNode(datogeneralusuario.gettelefono_movil().trim()));
		element.appendChild(elementtelefono_movil);

		Element elemente_mail = document.createElement(DatoGeneralUsuarioConstantesFunciones.EMAIL);
		elemente_mail.appendChild(document.createTextNode(datogeneralusuario.gete_mail().trim()));
		element.appendChild(elemente_mail);

		Element elementurl = document.createElement(DatoGeneralUsuarioConstantesFunciones.URL);
		elementurl.appendChild(document.createTextNode(datogeneralusuario.geturl().trim()));
		element.appendChild(elementurl);

		Element elementfecha_nacimiento = document.createElement(DatoGeneralUsuarioConstantesFunciones.FECHANACIMIENTO);
		elementfecha_nacimiento.appendChild(document.createTextNode(datogeneralusuario.getfecha_nacimiento().toString().trim()));
		element.appendChild(elementfecha_nacimiento);

		Element elementdireccion = document.createElement(DatoGeneralUsuarioConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(datogeneralusuario.getdireccion().trim()));
		element.appendChild(elementdireccion);
	}
	
	public void generarReporteGroupGenericoDatoGeneralUsuariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados=new ArrayList<DatoGeneralUsuario>();
		
		datogeneralusuariosSeleccionados=this.getDatoGeneralUsuariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDatoGeneralUsuario(datogeneralusuariosSeleccionados);
		
		this.generarReporteDatoGeneralUsuarios("Todos",datogeneralusuariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDatoGeneralUsuario(ArrayList<DatoGeneralUsuario> datogeneralusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DatoGeneralUsuario datogeneralusuarioAux:datogeneralusuariosSeleccionados) {
				datogeneralusuarioAux.setsDetalleGeneralEntityReporte(datogeneralusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_CEDULA)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getcedula());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_APELLIDOS)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getapellidos());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_NOMBRES)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getnombres());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_TELEFONOMOVIL)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.gettelefono_movil());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.gete_mail());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_URL)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.geturl());
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_FECHANACIMIENTO)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(datogeneralusuarioAux.getfecha_nacimiento()));
				}
				 else if(sTipoSeleccionar.equals(DatoGeneralUsuarioConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					datogeneralusuarioAux.setsDescripcionGeneralEntityReporte1(datogeneralusuarioAux.getdireccion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoGeneralUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDatoGeneralUsuario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDatoGeneralUsuario=true;
				this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=true;
				this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=true;
			}
			
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=true;
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			this.isVisibilidadCeldaModificarDatoGeneralUsuario=true;
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaCancelarDatoGeneralUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoGeneralUsuario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DatoGeneralUsuarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=true;
		} else {
			this.actualizarEstadoPanelsDatoGeneralUsuario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDatoGeneralUsuario=false;
			//this.isVisibilidadCeldaVerFormDatoGeneralUsuario=false;
			this.isVisibilidadCeldaDuplicarDatoGeneralUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!datogeneralusuarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
		} else {
			this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!datogeneralusuarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;												
			}
			
			this.jButtonCerrarDatoGeneralUsuario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
		}
		
		if(!this.permiteMantenimiento(this.datogeneralusuario)) {
			this.isVisibilidadCeldaActualizarDatoGeneralUsuario=false;
			this.isVisibilidadCeldaEliminarDatoGeneralUsuario=false;
		}
		
		//SI ES UNO A UNO FK
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			
			if(datogeneralusuarioLogic.getDatoGeneralUsuarios().size()>0) {
									this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;	
									this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
									this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			}
			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			if(datogeneralusuarios.size()>0) {
				this.isVisibilidadCeldaNuevoDatoGeneralUsuario=false;	
				this.isVisibilidadCeldaNuevoRelacionesDatoGeneralUsuario=false;
				this.isVisibilidadCeldaGuardarCambiosDatoGeneralUsuario=false;
			}
		}
		//ARCHITECTURE
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDatoGeneralUsuario() {
	}
	
	public void actualizarEstadoPanelsDatoGeneralUsuario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosEdicionDatoGeneralUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoGeneralUsuario!=null) {
				this.jScrollPanelDatosDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoGeneralUsuario!=null) {
				this.jPanelPaginacionDatoGeneralUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
					this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.datogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoGeneralUsuario!=null) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDatoGeneralUsuario!=null) {
				this.jPanelParametrosReportesDatoGeneralUsuario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCiudad=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdCiudadDatoGeneralUsuario);}

			this.isVisibilidadFK_IdPais=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdPaisDatoGeneralUsuario);}

			this.isVisibilidadFK_IdProvincia=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdProvinciaDatoGeneralUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaUsuario;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdUsuarioDatoGeneralUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdCiudadDatoGeneralUsuario);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdPaisDatoGeneralUsuario);}

			this.isVisibilidadFK_IdProvincia=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdProvinciaDatoGeneralUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdUsuarioDatoGeneralUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadFK_IdCiudad=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdCiudadDatoGeneralUsuario);}

			this.isVisibilidadFK_IdPais=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdPaisDatoGeneralUsuario);}

			this.isVisibilidadFK_IdProvincia=isParaProvincia;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdProvinciaDatoGeneralUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdUsuarioDatoGeneralUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdCiudadDatoGeneralUsuario);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdPaisDatoGeneralUsuario);}

			this.isVisibilidadFK_IdProvincia=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdProvinciaDatoGeneralUsuario);}

			this.isVisibilidadFK_IdUsuario=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(jPanelFK_IdUsuarioDatoGeneralUsuario);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DatoGeneralUsuarioSessionBean datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		
		if(this.datogeneralusuarioSessionBean==null) {
			this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		}
		
		this.datogeneralusuarioSessionBean.setsUltimaBusquedaDatoGeneralUsuario(this.getsAccionBusqueda());
		this.datogeneralusuarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.datogeneralusuarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			datogeneralusuarioSessionBean.setid_ciudad(this.getid_ciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			datogeneralusuarioSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
			datogeneralusuarioSessionBean.setid_provincia(this.getid_provinciaFK_IdProvincia());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			datogeneralusuarioSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DatoGeneralUsuarioSessionBean datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		
		if(this.datogeneralusuarioSessionBean==null) {
			this.datogeneralusuarioSessionBean=new DatoGeneralUsuarioSessionBean();
		}
		
		if(this.datogeneralusuarioSessionBean.getsUltimaBusquedaDatoGeneralUsuario()!=null&&!this.datogeneralusuarioSessionBean.getsUltimaBusquedaDatoGeneralUsuario().equals("")) {
			this.setsAccionBusqueda(datogeneralusuarioSessionBean.getsUltimaBusquedaDatoGeneralUsuario());
			this.setiNumeroPaginacion(datogeneralusuarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(datogeneralusuarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setid_ciudadFK_IdCiudad(datogeneralusuarioSessionBean.getid_ciudad());
				datogeneralusuarioSessionBean.setid_ciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(datogeneralusuarioSessionBean.getid_pais());
				datogeneralusuarioSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
				this.setid_provinciaFK_IdProvincia(datogeneralusuarioSessionBean.getid_provincia());
				datogeneralusuarioSessionBean.setid_provincia(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(datogeneralusuarioSessionBean.getid_usuario());
				datogeneralusuarioSessionBean.setid_usuario(-1L);
			}
		}
		
		this.datogeneralusuarioSessionBean.setsUltimaBusquedaDatoGeneralUsuario("");
		this.datogeneralusuarioSessionBean.setiNumeroPaginacion(DatoGeneralUsuarioConstantesFunciones.INUMEROPAGINACION);
		this.datogeneralusuarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDatoGeneralUsuario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDatoGeneralUsuario() {
		this.updateBorderResaltarBusquedasFormularioDatoGeneralUsuario();
		this.updateVisibilidadBusquedasFormularioDatoGeneralUsuario();
		this.updateHabilitarBusquedasFormularioDatoGeneralUsuario();
	}
	
	public void updateBorderResaltarBusquedasFormularioDatoGeneralUsuario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponents().length>0) {
	

		if(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdCiudadDatoGeneralUsuario!=null) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdCiudadDatoGeneralUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdCiudadDatoGeneralUsuario);
			}
		}

		if(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdPaisDatoGeneralUsuario!=null) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdPaisDatoGeneralUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdPaisDatoGeneralUsuario);
			}
		}

		if(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdProvinciaDatoGeneralUsuario!=null) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdProvinciaDatoGeneralUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdProvinciaDatoGeneralUsuario);
			}
		}

		if(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdUsuarioDatoGeneralUsuario!=null) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdUsuarioDatoGeneralUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdUsuarioDatoGeneralUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDatoGeneralUsuario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdCiudadDatoGeneralUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarFK_IdCiudadDatoGeneralUsuario);
			if(!this.datogeneralusuarioConstantesFunciones.mostrarFK_IdCiudadDatoGeneralUsuario && index>-1) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdPaisDatoGeneralUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarFK_IdPaisDatoGeneralUsuario);
			if(!this.datogeneralusuarioConstantesFunciones.mostrarFK_IdPaisDatoGeneralUsuario && index>-1) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdProvinciaDatoGeneralUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarFK_IdProvinciaDatoGeneralUsuario);
			if(!this.datogeneralusuarioConstantesFunciones.mostrarFK_IdProvinciaDatoGeneralUsuario && index>-1) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdUsuarioDatoGeneralUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarFK_IdUsuarioDatoGeneralUsuario);
			if(!this.datogeneralusuarioConstantesFunciones.mostrarFK_IdUsuarioDatoGeneralUsuario && index>-1) {
				this.jTabbedPaneBusquedasDatoGeneralUsuario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDatoGeneralUsuario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdCiudadDatoGeneralUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFunciones.activarFK_IdCiudadDatoGeneralUsuario);
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setEnabledAt(index,this.datogeneralusuarioConstantesFunciones.activarFK_IdCiudadDatoGeneralUsuario);
			}

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdPaisDatoGeneralUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFunciones.activarFK_IdPaisDatoGeneralUsuario);
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setEnabledAt(index,this.datogeneralusuarioConstantesFunciones.activarFK_IdPaisDatoGeneralUsuario);
			}

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdProvinciaDatoGeneralUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFunciones.activarFK_IdProvinciaDatoGeneralUsuario);
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setEnabledAt(index,this.datogeneralusuarioConstantesFunciones.activarFK_IdProvinciaDatoGeneralUsuario);
			}

			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdUsuarioDatoGeneralUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datogeneralusuarioConstantesFunciones.activarFK_IdUsuarioDatoGeneralUsuario);
				this.jTabbedPaneBusquedasDatoGeneralUsuario.setEnabledAt(index,this.datogeneralusuarioConstantesFunciones.activarFK_IdUsuarioDatoGeneralUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDatoGeneralUsuario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdCiudadDatoGeneralUsuario);

			this.jTabbedPaneBusquedasDatoGeneralUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);

			this.datogeneralusuarioConstantesFunciones.setResaltarFK_IdCiudadDatoGeneralUsuario(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdCiudadDatoGeneralUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdPaisDatoGeneralUsuario);

			this.jTabbedPaneBusquedasDatoGeneralUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);

			this.datogeneralusuarioConstantesFunciones.setResaltarFK_IdPaisDatoGeneralUsuario(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdPaisDatoGeneralUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProvincia")) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdProvinciaDatoGeneralUsuario);

			this.jTabbedPaneBusquedasDatoGeneralUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);

			this.datogeneralusuarioConstantesFunciones.setResaltarFK_IdProvinciaDatoGeneralUsuario(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdProvinciaDatoGeneralUsuario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedasDatoGeneralUsuario.indexOfComponent(this.jPanelFK_IdUsuarioDatoGeneralUsuario);

			this.jTabbedPaneBusquedasDatoGeneralUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoGeneralUsuario.getComponent(index);

			this.datogeneralusuarioConstantesFunciones.setResaltarFK_IdUsuarioDatoGeneralUsuario(resaltar);

			jPanel.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarFK_IdUsuarioDatoGeneralUsuario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDatoGeneralUsuario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDatoGeneralUsuario() throws Exception {

		if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDatoGeneralUsuario();
		this.updateVisibilidadResaltarControlesFormularioDatoGeneralUsuario();
		this.updateHabilitarResaltarControlesFormularioDatoGeneralUsuario();
		
	}
	
	public void updateBorderResaltarControlesFormularioDatoGeneralUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.datogeneralusuarioConstantesFunciones.resaltarid_usuarioDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarid_usuarioDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarid_paisDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarid_paisDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarid_provinciaDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarid_provinciaDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarid_ciudadDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarid_ciudadDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarcedulaDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarcedulaDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarapellidosDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarapellidosDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarnombresDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarnombresDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltartelefonoDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltartelefonoDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltartelefono_movilDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltartelefono_movilDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltare_mailDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltare_mailDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarurlDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarurlDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltarfecha_nacimientoDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltarfecha_nacimientoDatoGeneralUsuario);}
		if(this.datogeneralusuarioConstantesFunciones.resaltardireccionDatoGeneralUsuario!=null && this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setBorder(this.datogeneralusuarioConstantesFunciones.resaltardireccionDatoGeneralUsuario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDatoGeneralUsuario() throws Exception {		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
	
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_usuarioDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelid_usuarioDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_usuarioDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_paisDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelid_paisDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_paisDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_provinciaDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelid_provinciaDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_provinciaDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_ciudadDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelid_ciudadDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarid_ciudadDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarcedulaDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelcedulaDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarcedulaDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarapellidosDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelapellidosDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarapellidosDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarnombresDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelnombresDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarnombresDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrartelefonoDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPaneltelefonoDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrartelefonoDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrartelefono_movilDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPaneltelefono_movilDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrartelefono_movilDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrare_mailDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanele_mailDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrare_mailDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarurlDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelurlDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarurlDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarfecha_nacimientoDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPanelfecha_nacimientoDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrarfecha_nacimientoDatoGeneralUsuario);
		//this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrardireccionDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jPaneldireccionDatoGeneralUsuario.setVisible(this.datogeneralusuarioConstantesFunciones.mostrardireccionDatoGeneralUsuario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDatoGeneralUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoGeneralUsuario!=null) {
	
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jLabelid_usuarioDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarid_usuarioDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_paisDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarid_paisDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_provinciaDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarid_provinciaDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jComboBoxid_ciudadDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarid_ciudadDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextFieldcedulaDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarcedulaDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaapellidosDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarapellidosDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreanombresDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarnombresDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefonoDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activartelefonoDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreatelefono_movilDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activartelefono_movilDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreae_mailDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activare_mailDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreaurlDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarurlDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jDateChooserfecha_nacimientoDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activarfecha_nacimientoDatoGeneralUsuario);
		this.jInternalFrameDetalleFormDatoGeneralUsuario.jTextAreadireccionDatoGeneralUsuario.setEnabled(this.datogeneralusuarioConstantesFunciones.activardireccionDatoGeneralUsuario);
		}
	}
	
		
}