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

import com.bydan.erp.seguridad.util.PerfilConstantesFunciones;
import com.bydan.erp.seguridad.util.PerfilParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PerfilParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PerfilBean;
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
public class PerfilBeanSwingJInternalFrame extends PerfilJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PerfilBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Perfil> perfilValidator = new ClassValidator<Perfil>(Perfil.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Perfil perfil;	
	public Perfil perfilAux;
	public Perfil perfilAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Perfil perfilTotales;
	public Long idPerfilActual;
	public Long iIdNuevoPerfil=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboSistema="";

	public List<Sistema> sistemasForeignKey;

	public List<Sistema> getsistemasForeignKey() {
		return sistemasForeignKey;
	}

	public void setsistemasForeignKey(List<Sistema> sistemasForeignKey) {
		this.sistemasForeignKey = sistemasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sistema sistemaForeignKey;

	public Sistema getsistemaForeignKey() {
		return sistemaForeignKey;
	}

	public void setsistemaForeignKey(Sistema sistemaForeignKey) {
		this.sistemaForeignKey = sistemaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPerfilOpcion=false;

	public Boolean getIsTienePermisosPerfilOpcion() {
		return isTienePermisosPerfilOpcion;
	}

	public void setIsTienePermisosPerfilOpcion(Boolean isTienePermisosPerfilOpcion) {
		this.isTienePermisosPerfilOpcion= isTienePermisosPerfilOpcion;
	}


	public Boolean isTienePermisosPerfilUsuario=false;

	public Boolean getIsTienePermisosPerfilUsuario() {
		return isTienePermisosPerfilUsuario;
	}

	public void setIsTienePermisosPerfilUsuario(Boolean isTienePermisosPerfilUsuario) {
		this.isTienePermisosPerfilUsuario= isTienePermisosPerfilUsuario;
	}


	public Boolean isTienePermisosUsuarioOpcion=false;

	public Boolean getIsTienePermisosUsuarioOpcion() {
		return isTienePermisosUsuarioOpcion;
	}

	public void setIsTienePermisosUsuarioOpcion(Boolean isTienePermisosUsuarioOpcion) {
		this.isTienePermisosUsuarioOpcion= isTienePermisosUsuarioOpcion;
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
	
	public Boolean isPermisoTodoPerfil;
	public Boolean isPermisoNuevoPerfil;
	public Boolean isPermisoActualizarPerfil;
	public Boolean isPermisoActualizarOriginalPerfil;
	public Boolean isPermisoEliminarPerfil;
	public Boolean isPermisoGuardarCambiosPerfil;
	public Boolean isPermisoConsultaPerfil;
	public Boolean isPermisoBusquedaPerfil;
	public Boolean isPermisoReportePerfil;
	public Boolean isPermisoPaginacionMedioPerfil;
	public Boolean isPermisoPaginacionAltoPerfil;
	public Boolean isPermisoPaginacionTodoPerfil;
	public Boolean isPermisoCopiarPerfil;
	public Boolean isPermisoVerFormPerfil;
	public Boolean isPermisoDuplicarPerfil;
	public Boolean isPermisoOrdenPerfil;
	
	
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
	
	public PerfilParameterReturnGeneral perfilReturnGeneral;
	public PerfilParameterReturnGeneral perfilParameterGeneral;
	
	

	public UsuarioOpcionLogic usuarioopcionLogic=null;

	public UsuarioOpcionLogic getUsuarioOpcionLogic() {
		return usuarioopcionLogic;
	}

	public void setUsuarioOpcionLogic(UsuarioOpcionLogic usuarioopcionLogic) {
		this.usuarioopcionLogic = usuarioopcionLogic;
	}


	public PerfilUsuarioLogic perfilusuarioLogic=null;

	public PerfilUsuarioLogic getPerfilUsuarioLogic() {
		return perfilusuarioLogic;
	}

	public void setPerfilUsuarioLogic(PerfilUsuarioLogic perfilusuarioLogic) {
		this.perfilusuarioLogic = perfilusuarioLogic;
	}


	public PerfilOpcionLogic perfilopcionLogic=null;

	public PerfilOpcionLogic getPerfilOpcionLogic() {
		return perfilopcionLogic;
	}

	public void setPerfilOpcionLogic(PerfilOpcionLogic perfilopcionLogic) {
		this.perfilopcionLogic = perfilopcionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPerfil=false;
	public Boolean esParaAccionDesdeFormularioPerfil=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PerfilSessionBeanAdditional perfilSessionBeanAdditional=null;
	
	public PerfilSessionBeanAdditional getPerfilSessionBeanAdditional() {
		return this.perfilSessionBeanAdditional;
	}
	
	public void setPerfilSessionBeanAdditional(PerfilSessionBeanAdditional perfilSessionBeanAdditional) {
		try {
			this.perfilSessionBeanAdditional=perfilSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PerfilBeanSwingJInternalFrameAdditional perfilBeanSwingJInternalFrameAdditional=null;
	//public class PerfilBeanSwingJInternalFrame
	
	public PerfilBeanSwingJInternalFrameAdditional getPerfilBeanSwingJInternalFrameAdditional() {
		return this.perfilBeanSwingJInternalFrameAdditional;
	}
	
	public void setPerfilBeanSwingJInternalFrameAdditional(PerfilBeanSwingJInternalFrameAdditional perfilBeanSwingJInternalFrameAdditional) {
		try {
			this.perfilBeanSwingJInternalFrameAdditional=perfilBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PerfilLogic perfilLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Perfil perfilBean;
	public PerfilConstantesFunciones perfilConstantesFunciones;
	//public PerfilParameterReturnGeneral perfilReturnGeneral;
	
	//FK
	
	public SistemaLogic sistemaLogic;
	
	//PARAMETROS
	
	
	//public List<Perfil> perfils;	
	//public List<Perfil> perfilsEliminados;
	//public List<Perfil> perfilsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPerfil=false;
	public Boolean isVisibilidadCeldaDuplicarPerfil=true;
	public Boolean isVisibilidadCeldaCopiarPerfil=true;
	public Boolean isVisibilidadCeldaVerFormPerfil=true;
	public Boolean isVisibilidadCeldaOrdenPerfil=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPerfil=false;
	public Boolean isVisibilidadCeldaModificarPerfil=false;
	public Boolean isVisibilidadCeldaActualizarPerfil=false;
	public Boolean isVisibilidadCeldaEliminarPerfil=false;
	public Boolean isVisibilidadCeldaCancelarPerfil=false;
	public Boolean isVisibilidadCeldaGuardarPerfil=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPerfil=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorNombre2=false;
	public Boolean isVisibilidadFK_IdSistema=false;
	
	public Long getiIdNuevoPerfil() {
		return this.iIdNuevoPerfil;
	}

	public void setiIdNuevoPerfil(Long iIdNuevoPerfil) {
		this.iIdNuevoPerfil = iIdNuevoPerfil;
	}
	
	public Long getidPerfilActual() {
		return this.idPerfilActual;
	}

	public void setidPerfilActual(Long idPerfilActual) {
		this.idPerfilActual = idPerfilActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Perfil getperfil() {
		return this.perfil;
	}

	public void setperfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public Perfil getperfilAux() {
		return this.perfilAux;
	}

	public void setperfilAux(Perfil perfilAux) {
		this.perfilAux = perfilAux;
	}				
	
	public Perfil getperfilAnterior() {
		return this.perfilAnterior;
	}

	public void setperfilAnterior(Perfil perfilAnterior) {
		this.perfilAnterior = perfilAnterior;
	}	
	
	public Perfil getperfilTotales() {
		return this.perfilTotales;
	}

	public void setperfilTotales(Perfil perfilTotales) {
		this.perfilTotales = perfilTotales;
	}	
	
	public Perfil getperfilBean() {
		return this.perfilBean;
	}

	public void setperfilBean(Perfil perfilBean) {
		this.perfilBean = perfilBean;
	}	
	
	public PerfilParameterReturnGeneral getperfilReturnGeneral() {
		return this.perfilReturnGeneral;
	}

	public void setperfilReturnGeneral(PerfilParameterReturnGeneral perfilReturnGeneral) {
		this.perfilReturnGeneral = perfilReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String nombre2BusquedaPorNombre2="";

	public String getnombre2BusquedaPorNombre2() {
		return this.nombre2BusquedaPorNombre2;
	}

	public void setnombre2BusquedaPorNombre2(String nombre2BusquedaPorNombre2) {
		this.nombre2BusquedaPorNombre2 = nombre2BusquedaPorNombre2;
	}

	public Long id_sistemaFK_IdSistema=-1L;

	public Long getid_sistemaFK_IdSistema() {
		return this.id_sistemaFK_IdSistema;
	}

	public void setid_sistemaFK_IdSistema(Long id_sistemaFK_IdSistema) {
		this.id_sistemaFK_IdSistema = id_sistemaFK_IdSistema;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PerfilLogic getPerfilLogic()	{		
		return perfilLogic;
	}

	public void setPerfilLogic(PerfilLogic perfilLogic) {
		this.perfilLogic = perfilLogic;
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
	
	public Boolean getIsEsNuevoPerfil() {
		return isEsNuevoPerfil;
	}

	public void setIsEsNuevoPerfil(Boolean isEsNuevoPerfil) {
		this.isEsNuevoPerfil = isEsNuevoPerfil;
	}

	public Boolean getEsParaAccionDesdeFormularioPerfil() {
		return esParaAccionDesdeFormularioPerfil;
	}
	
	public void setEsParaAccionDesdeFormularioPerfil(Boolean esParaAccionDesdeFormularioPerfil) {
		this.esParaAccionDesdeFormularioPerfil = esParaAccionDesdeFormularioPerfil;
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
	
	
	public void cargarCombosSistemasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sistemasForeignKey=new ArrayList<Sistema>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SistemaLogic sistemaLogic=new SistemaLogic();

			sistemaLogic.getSistemaDataAccess().setIsForForeingKeyData(true);

			if(this.perfilSessionBean==null) {
				this.perfilSessionBean=new PerfilSessionBean();
			}

			if(!this.perfilSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemaDataAccess().setIsForForeingKeyData(true);

					sistemaLogic.getTodosSistemasWithConnection(sFinalQuery,new Pagination());

					this.sistemasForeignKey=sistemaLogic.getSistemas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSistema(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getEntityWithConnection(perfilSessionBean.getlidSistemaActual());
					this.sistemasForeignKey.add(sistemaLogic.getSistema());
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

	
	
	public void setActualSistemaForeignKey(Long idSistemaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sistemaTemp!=null) {

					if(this.perfil!=null) {
						this.perfil.setSistema(sistemaTemp);
					}

					if(this.jInternalFrameDetalleFormPerfil!=null) {
						this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setSelectedItem(sistemaTemp);
					}
				} else {
					//jComboBoxid_sistemaPerfil.setSelectedItem(sistemaTemp);
					if(this.jInternalFrameDetalleFormPerfil!=null) {
						if(this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaFK_IdSistemaPerfil!=null) {
						jComboBoxid_sistemaFK_IdSistemaPerfil.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaFK_IdSistemaPerfil!=null) {
							//jComboBoxid_sistemaFK_IdSistemaPerfil.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaFK_IdSistemaPerfil.getItemCount()>0) {
								jComboBoxid_sistemaFK_IdSistemaPerfil.setSelectedIndex(0);
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

	public String getActualSistemaForeignKeyDescripcion(Long idSistemaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}


			sDescripcion=SistemaConstantesFunciones.getSistemaDescripcion(sistemaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSistemaForeignKeyGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxid_sistemaPerfilGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sistemaTemp!=null) {
				jComboBoxid_sistemaPerfilGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(jComboBoxid_sistemaPerfilGenerico!=null && jComboBoxid_sistemaPerfilGenerico.getItemCount()>0) {
					jComboBoxid_sistemaPerfilGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaForeignKey(Perfil perfil,JComboBox jComboBoxid_sistemaPerfilGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(jComboBoxid_sistemaPerfilGenerico==null) {
				sistemaAux=(Sistema)this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.getSelectedItem();
			} else {
				sistemaAux=(Sistema)jComboBoxid_sistemaPerfilGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				perfil.setid_sistema(sistemaAux.getId());
				perfil.setsistema_descripcion(PerfilConstantesFunciones.getSistemaDescripcion(sistemaAux));
				perfil.setSistema(sistemaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSistemasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSistema=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PerfilJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfil!=null) { 
							this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.addItem(sistema);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfil!=null) { 
					}

					if(!PerfilJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaPerfil.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaFK_IdSistemaPerfil.addItem(sistema);
							}
						}

						if(!PerfilJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameSistemaForeignKey(Sistema sistema,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfil!=null) {
							this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setSelectedItem(sistema);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfil!=null) {
							this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaFK_IdSistemaPerfil.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaPerfil.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPerfil() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PerfilConstantesFunciones.refrescarForeignKeysDescripcionesPerfil(this.perfilLogic.getPerfils());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PerfilConstantesFunciones.refrescarForeignKeysDescripcionesPerfil(this.perfils);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//perfilLogic.setPerfils(this.perfils);
			perfilLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PerfilParameterReturnGeneral getPerfilParameterGeneral() {
		return this.perfilParameterGeneral;
	}
	
	public void setPerfilParameterGeneral(PerfilParameterReturnGeneral perfilParameterGeneral) {
		this.perfilParameterGeneral = perfilParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPerfil() {
		return isPermisoTodoPerfil;
	}

	public void setIsPermisoTodoPerfil(Boolean isPermisoTodoPerfil) {
		this.isPermisoTodoPerfil = isPermisoTodoPerfil;
	}

	public Boolean getIsPermisoNuevoPerfil() {
		return isPermisoNuevoPerfil;
	}

	public void setIsPermisoNuevoPerfil(Boolean isPermisoNuevoPerfil) {
		this.isPermisoNuevoPerfil = isPermisoNuevoPerfil;
	}

	public Boolean getIsPermisoActualizarPerfil() {
		return isPermisoActualizarPerfil;
	}

	public void setIsPermisoActualizarPerfil(Boolean isPermisoActualizarPerfil) {
		this.isPermisoActualizarPerfil = isPermisoActualizarPerfil;
	}

	public Boolean getIsPermisoEliminarPerfil() {
		return isPermisoEliminarPerfil;
	}

	public void setIsPermisoEliminarPerfil(Boolean isPermisoEliminarPerfil) {
		this.isPermisoEliminarPerfil = isPermisoEliminarPerfil;
	}

	public Boolean getIsPermisoGuardarCambiosPerfil() {
		return isPermisoGuardarCambiosPerfil;
	}

	public void setIsPermisoGuardarCambiosPerfil(Boolean isPermisoGuardarCambiosPerfil) {
		this.isPermisoGuardarCambiosPerfil = isPermisoGuardarCambiosPerfil;
	}
	
	public Boolean getIsPermisoConsultaPerfil() {
		return isPermisoConsultaPerfil;
	}

	public void setIsPermisoConsultaPerfil(Boolean isPermisoConsultaPerfil) {
		this.isPermisoConsultaPerfil = isPermisoConsultaPerfil;
	}

	public Boolean getIsPermisoBusquedaPerfil() {
		return isPermisoBusquedaPerfil;
	}

	public void setIsPermisoBusquedaPerfil(Boolean isPermisoBusquedaPerfil) {
		this.isPermisoBusquedaPerfil = isPermisoBusquedaPerfil;
	}

	public Boolean getIsPermisoReportePerfil() {
		return isPermisoReportePerfil;
	}

	public void setIsPermisoReportePerfil(Boolean isPermisoReportePerfil) {
		this.isPermisoReportePerfil = isPermisoReportePerfil;
	}
	
	public Boolean getIsPermisoPaginacionMedioPerfil() {
		return isPermisoPaginacionMedioPerfil;
	}

	public void setIsPermisoPaginacionMedioPerfil(Boolean isPermisoPaginacionMedioPerfil) {
		this.isPermisoPaginacionMedioPerfil = isPermisoPaginacionMedioPerfil;
	}
	
	public Boolean getIsPermisoPaginacionTodoPerfil() {
		return isPermisoPaginacionTodoPerfil;
	}

	public void setIsPermisoPaginacionTodoPerfil(Boolean isPermisoPaginacionTodoPerfil) {
		this.isPermisoPaginacionTodoPerfil = isPermisoPaginacionTodoPerfil;
	}
	
	public Boolean getIsPermisoPaginacionAltoPerfil() {
		return isPermisoPaginacionAltoPerfil;
	}

	public void setIsPermisoPaginacionAltoPerfil(Boolean isPermisoPaginacionAltoPerfil) {
		this.isPermisoPaginacionAltoPerfil = isPermisoPaginacionAltoPerfil;
	}
	
	public Boolean getIsPermisoCopiarPerfil() {
		return isPermisoCopiarPerfil;
	}

	public void setIsPermisoCopiarPerfil(Boolean isPermisoCopiarPerfil) {
		this.isPermisoCopiarPerfil = isPermisoCopiarPerfil;
	}
	
	public Boolean getIsPermisoVerFormPerfil() {
		return isPermisoVerFormPerfil;
	}

	public void setIsPermisoVerFormPerfil(Boolean isPermisoVerFormPerfil) {
		this.isPermisoVerFormPerfil = isPermisoVerFormPerfil;
	}
	
	public Boolean getIsPermisoDuplicarPerfil() {
		return isPermisoDuplicarPerfil;
	}

	public void setIsPermisoDuplicarPerfil(Boolean isPermisoDuplicarPerfil) {
		this.isPermisoDuplicarPerfil = isPermisoDuplicarPerfil;
	}
	
	public Boolean getIsPermisoOrdenPerfil() {
		return isPermisoOrdenPerfil;
	}

	public void setIsPermisoOrdenPerfil(Boolean isPermisoOrdenPerfil) {
		this.isPermisoOrdenPerfil = isPermisoOrdenPerfil;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPerfil() {
		return isVisibilidadCeldaNuevoPerfil;
	}

	public void setIsVisibilidadCeldaNuevoPerfil(Boolean isVisibilidadCeldaNuevoPerfil) {
		this.isVisibilidadCeldaNuevoPerfil = isVisibilidadCeldaNuevoPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPerfil() {
		return isVisibilidadCeldaDuplicarPerfil;
	}

	public void setIsVisibilidadCeldaDuplicarPerfil(Boolean isVisibilidadCeldaDuplicarPerfil) {
		this.isVisibilidadCeldaDuplicarPerfil = isVisibilidadCeldaDuplicarPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPerfil() {
		return isVisibilidadCeldaCopiarPerfil;
	}

	public void setIsVisibilidadCeldaCopiarPerfil(Boolean isVisibilidadCeldaCopiarPerfil) {
		this.isVisibilidadCeldaCopiarPerfil = isVisibilidadCeldaCopiarPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPerfil() {
		return isVisibilidadCeldaVerFormPerfil;
	}

	public void setIsVisibilidadCeldaVerFormPerfil(Boolean isVisibilidadCeldaVerFormPerfil) {
		this.isVisibilidadCeldaVerFormPerfil = isVisibilidadCeldaVerFormPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPerfil() {
		return isVisibilidadCeldaOrdenPerfil;
	}

	public void setIsVisibilidadCeldaOrdenPerfil(Boolean isVisibilidadCeldaOrdenPerfil) {
		this.isVisibilidadCeldaOrdenPerfil = isVisibilidadCeldaOrdenPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPerfil() {
		return isVisibilidadCeldaNuevoRelacionesPerfil;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPerfil(Boolean isVisibilidadCeldaNuevoRelacionesPerfil) {
		this.isVisibilidadCeldaNuevoRelacionesPerfil = isVisibilidadCeldaNuevoRelacionesPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPerfil() {
		return isVisibilidadCeldaModificarPerfil;
	}

	public void setIsVisibilidadCeldaModificarPerfil(Boolean isVisibilidadCeldaModificarPerfil) {
		this.isVisibilidadCeldaModificarPerfil = isVisibilidadCeldaModificarPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPerfil() {
		return isVisibilidadCeldaActualizarPerfil;
	}

	public void setIsVisibilidadCeldaActualizarPerfil(Boolean isVisibilidadCeldaActualizarPerfil) {
		this.isVisibilidadCeldaActualizarPerfil = isVisibilidadCeldaActualizarPerfil;
	}

	public Boolean getIsVisibilidadCeldaEliminarPerfil() {
		return isVisibilidadCeldaEliminarPerfil;
	}

	public void setIsVisibilidadCeldaEliminarPerfil(Boolean isVisibilidadCeldaEliminarPerfil) {
		this.isVisibilidadCeldaEliminarPerfil = isVisibilidadCeldaEliminarPerfil;
	}

	public Boolean getIsVisibilidadCeldaCancelarPerfil() {
		return isVisibilidadCeldaCancelarPerfil;
	}

	public void setIsVisibilidadCeldaCancelarPerfil(Boolean isVisibilidadCeldaCancelarPerfil) {
		this.isVisibilidadCeldaCancelarPerfil = isVisibilidadCeldaCancelarPerfil;
	}

	public Boolean getIsVisibilidadCeldaGuardarPerfil() {
		return isVisibilidadCeldaGuardarPerfil;
	}

	public void setIsVisibilidadCeldaGuardarPerfil(Boolean isVisibilidadCeldaGuardarPerfil) {
		this.isVisibilidadCeldaGuardarPerfil = isVisibilidadCeldaGuardarPerfil;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPerfil() {
		return isVisibilidadCeldaGuardarCambiosPerfil;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPerfil(Boolean isVisibilidadCeldaGuardarCambiosPerfil) {
		this.isVisibilidadCeldaGuardarCambiosPerfil = isVisibilidadCeldaGuardarCambiosPerfil;
	}
		
	public PerfilSessionBean getperfilSessionBean() {
		return this.perfilSessionBean;
	}
	
	public void setperfilSessionBean(PerfilSessionBean perfilSessionBean) {
		this.perfilSessionBean=perfilSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorNombre2() {
		return this.isVisibilidadBusquedaPorNombre2;
	}

	public void setisVisibilidadBusquedaPorNombre2(Boolean isVisibilidadBusquedaPorNombre2) {
		this.isVisibilidadBusquedaPorNombre2=isVisibilidadBusquedaPorNombre2;
	}

	public Boolean getisVisibilidadFK_IdSistema() {
		return this.isVisibilidadFK_IdSistema;
	}

	public void setisVisibilidadFK_IdSistema(Boolean isVisibilidadFK_IdSistema) {
		this.isVisibilidadFK_IdSistema=isVisibilidadFK_IdSistema;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPerfil(Perfil perfil)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaForeignKey(perfil,null);
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
	
	public void bugActualizarReferenciaActual(Perfil perfil,Perfil perfilAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPerfil(perfil);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		perfilAux.setId(perfil.getId());
		perfilAux.setVersionRow(perfil.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPerfil();
		
			int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = perfilValidator.getInvalidValues(this.perfil);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			perfilLogic.setDatosCliente(datosCliente);
			perfilLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				perfilAux=new  Perfil();
				
				perfilAux.setIsNew(true);
				perfilAux.setIsChanged(true);
				
				perfilAux.setPerfilOriginal(this.perfil);
				
				perfilAux.setId(this.perfil.getId());	
				perfilAux.setVersionRow(this.perfil.getVersionRow());	
				perfilAux.setid_sistema(this.perfil.getid_sistema());	
				perfilAux.setcodigo(this.perfil.getcodigo());	
				perfilAux.setnombre(this.perfil.getnombre());	
				perfilAux.setnombre2(this.perfil.getnombre2());	
				perfilAux.setestado(this.perfil.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(perfilAux,perfilLogic.getPerfils());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilAux,perfils);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.perfilSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilLogic.savePerfils();//WithConnection
						//perfilLogic.getSetVersionRowPerfils();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfil,perfilAux);
					
					this.refrescarForeignKeysDescripcionesPerfil();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios().addAll(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuariosEliminados);
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios.addAll(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuariosEliminados);
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilLogic.savePerfilRelaciones(perfilAux,this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios(),this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());//WithConnection
								//perfilLogic.getSetVersionRowPerfils();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfil,perfilAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios= new ArrayList<PerfilUsuario>();
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setUsuarioOpcions(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setPerfilUsuarios(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios());

							if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setPerfilOpcions(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilAux,perfilLogic.getPerfils());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilAux,perfils);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfil,perfilAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				perfilAux=new  Perfil();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.perfilSessionBean.getEsGuardarRelacionado() 
					|| (this.perfilSessionBean.getEsGuardarRelacionado() && this.perfil.getId()>=0)) {
						
					perfilAux.setIsNew(false);
				}
				
				perfilAux.setIsDeleted(false);
			
				perfilAux.setId(this.perfil.getId());	
				perfilAux.setVersionRow(this.perfil.getVersionRow());	
				perfilAux.setid_sistema(this.perfil.getid_sistema());	
				perfilAux.setcodigo(this.perfil.getcodigo());	
				perfilAux.setnombre(this.perfil.getnombre());	
				perfilAux.setnombre2(this.perfil.getnombre2());	
				perfilAux.setestado(this.perfil.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilAux,perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilAux,perfils);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.perfilSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilLogic.savePerfils();//WithConnection
						//perfilLogic.getSetVersionRowPerfils();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfil,perfilAux);
					
					this.refrescarForeignKeysDescripcionesPerfil();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios().addAll(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuariosEliminados);
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios.addAll(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuariosEliminados);
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilLogic.savePerfilRelaciones(perfilAux,this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios(),this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());//WithConnection
								//perfilLogic.getSetVersionRowPerfils();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfil,perfilAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios= new ArrayList<PerfilUsuario>();
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setUsuarioOpcions(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setPerfilUsuarios(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios());

							if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setPerfilOpcions(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilAux,perfilLogic.getPerfils());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilAux,perfils);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfil,perfilAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				perfilAux=new  Perfil();
				
				perfilAux.setIsNew(false);
				perfilAux.setIsChanged(false);
				
				perfilAux.setIsDeleted(true);
				
				perfilAux.setId(this.perfil.getId());	
				perfilAux.setVersionRow(this.perfil.getVersionRow());	
				perfilAux.setid_sistema(this.perfil.getid_sistema());	
				perfilAux.setcodigo(this.perfil.getcodigo());	
				perfilAux.setnombre(this.perfil.getnombre());	
				perfilAux.setnombre2(this.perfil.getnombre2());	
				perfilAux.setestado(this.perfil.getestado());	
				
				if(this.perfilSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.perfilAux.getId()>=0) {	
						this.perfilsEliminados.add(perfilAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(perfilAux,perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilAux,perfils);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.perfilSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilLogic.savePerfils();//WithConnection
						//perfilLogic.getSetVersionRowPerfils();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios().addAll(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuariosEliminados);
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios.addAll(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuariosEliminados);
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilLogic.savePerfilRelaciones(perfilAux,this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios(),this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());//WithConnection
								//perfilLogic.getSetVersionRowPerfils();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios= new ArrayList<PerfilUsuario>();
							this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setUsuarioOpcions(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setPerfilUsuarios(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios());

							if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							perfilAux.setPerfilOpcions(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.perfilSessionBean.getEstaModoGuardarRelaciones() 
								|| this.perfilSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(perfilAux,perfilLogic.getPerfils());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(perfilAux,perfils);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getPerfils().addAll(this.perfilsEliminados);
					
					perfilLogic.savePerfils();//WithConnection
					//perfilLogic.getSetVersionRowPerfils();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPerfil();
				
				this.perfilsEliminados= new ArrayList<Perfil>();		
			}
			
			if(this.perfilSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Perfil GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.perfil=perfilAux;
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
      		//this.finishProcessPerfil();
      	}
		
	}	
	
	public void actualizarRelaciones(Perfil perfilLocal) throws Exception {
		
		if(this.perfilSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				perfilLocal.setUsuarioOpcions(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());
				perfilLocal.setPerfilUsuarios(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios());
				perfilLocal.setPerfilOpcions(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
			
			} else {
			
				perfilLocal.setUsuarioOpcions(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcions);
				perfilLocal.setPerfilUsuarios(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarios);
				perfilLocal.setPerfilOpcions(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Perfil perfilLocal) throws Exception {	
		if(this.perfilSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SistemaDetalleFormJInternalFrame.class)) {
				SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrameLocal=(SistemaBeanSwingJInternalFrame) ((SistemaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sistemaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSistema(sistemaBeanSwingJInternalFrameLocal.getsistema(),true);
				sistemaBeanSwingJInternalFrameLocal.actualizarLista(sistemaBeanSwingJInternalFrameLocal.sistema,this.sistemasForeignKey);

				sistemaBeanSwingJInternalFrameLocal.actualizarRelaciones(sistemaBeanSwingJInternalFrameLocal.sistema);

				perfilLocal.setSistema(sistemaBeanSwingJInternalFrameLocal.sistema);

				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey("Formulario");
				this.setActualSistemaForeignKey(sistemaBeanSwingJInternalFrameLocal.sistema.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPerfilActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = perfilValidator.getInvalidValues(this.perfil);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Perfil perfil,List<Perfil> perfils) throws Exception {
		try	{		
			PerfilConstantesFunciones.actualizarLista(perfil,perfils,this.perfilSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Perfil perfil,List<Perfil> perfils) throws Exception {
		try	{			
			PerfilConstantesFunciones.actualizarSelectedLista(perfil,perfils);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Perfil> perfilsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				perfilsLocal=this.perfilLogic.getPerfils();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				perfilsLocal=this.perfils;
			}
			//ARCHITECTURE
		
			for(Perfil perfilLocal:perfilsLocal) {
				if(this.permiteMantenimiento(perfilLocal) && perfilLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PerfilConstantesFunciones.getPerfilLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PerfilConstantesFunciones.IDSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelid_sistemaPerfil,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelcodigoPerfil,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelnombrePerfil,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilConstantesFunciones.NOMBRE2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelnombre2Perfil,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelestadoPerfil,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfil.jLabelid_sistemaPerfil,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfil.jLabelcodigoPerfil,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfil.jLabelnombrePerfil,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfil.jLabelnombre2Perfil,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfil.jLabelestadoPerfil,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("UsuarioOpcion")) {
			if(this.perfil==null) {
				this.perfil= new Perfil();
			}

			if(this.perfilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPerfil
				this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);

				this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.getusuarioopcion().setPerfil(this.perfil);
			}

			return;
		}
		 else  if(sTipo.equals("PerfilUsuario")) {
			if(this.perfil==null) {
				this.perfil= new Perfil();
			}

			if(this.perfilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPerfil
				this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);

				this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.getperfilusuario().setPerfil(this.perfil);
			}

			return;
		}
		 else  if(sTipo.equals("PerfilOpcion")) {
			if(this.perfil==null) {
				this.perfil= new Perfil();
			}

			if(this.perfilSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPerfil
				this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);

				this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.getperfilopcion().setPerfil(this.perfil);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPerfil--;	
		
		
		this.perfilAux=new Perfil();
		
		this.perfilAux.setId(this.iIdNuevoPerfil);
		this.perfilAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilLogic.getPerfils().add(this.perfilAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.perfils.add(this.perfilAux);
		}
		//ARCHITECTURE
		
		this.perfil=this.perfilAux;
		
		if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPerfil(this.perfil);
			this.setVariablesObjetoActualToFormularioForeignKeyPerfil(this.perfil);
		}
				
		//this.setDefaultControlesPerfil();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPerfil();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPerfil();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfil();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfil(this.perfilBean,this.perfil,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PerfilConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.perfilSessionBean.getConGuardarRelaciones()) {
			classes=PerfilConstantesFunciones.getClassesRelationshipsOfPerfil(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.perfilReturnGeneral=perfilLogic.procesarEventosPerfilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilLogic.getPerfils(),this.perfil,this.perfilParameterGeneral,this.isEsNuevoPerfil,classes);//this.perfilLogic.getPerfil()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPerfil(this.perfilReturnGeneral,this.perfilBean,false);
		
		if(this.perfilReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPerfil(this.perfilReturnGeneral.getPerfil());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPerfil(this.perfilReturnGeneral.getPerfil());
		}
		
		if(this.perfilReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPerfil(this.perfilReturnGeneral.getPerfil(),classes);//this.perfilBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPerfil(this.perfil,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPerfil();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPerfil();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilBeanSwingJInternalFrameAdditional.RecargarFormPerfil(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPerfil(false);
						
			if(perfilSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado() && PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.getEsGuardarRelacionado() && PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilUsuarioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado() && UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUsuarioOpcionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfil();
			}
			
			this.actualizarVisualTableDatosPerfil();
			
			this.jTableDatosPerfil.setRowSelectionInterval(this.getIndiceNuevoPerfil(), this.getIndiceNuevoPerfil());
			
			this.seleccionarFilaTablaPerfilActual();
						
			this.actualizarEstadoCeldasBotonesPerfil("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPerfil(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setEnabled(isHabilitar && this.perfilConstantesFunciones.activarcodigoPerfil);
		this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setEnabled(isHabilitar && this.perfilConstantesFunciones.activarnombrePerfil);
		this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setEnabled(isHabilitar && this.perfilConstantesFunciones.activarnombre2Perfil);
		this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setEnabled(isHabilitar && this.perfilConstantesFunciones.activarestadoPerfil);	
		
		this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setEnabled(isHabilitar && this.perfilConstantesFunciones.activarid_sistemaPerfil);
	};
	
	public void setDefaultControlesPerfil() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPerfil(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.perfilSessionBean.setConGuardarRelaciones(true);			
			this.perfilSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.perfilSessionBean.setConGuardarRelaciones(false);			
			this.perfilSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPerfil() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
				if(perfilAux.getId().equals(this.iIdNuevoPerfil)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Perfil perfilAux:this.perfils) {
				if(perfilAux.getId().equals(this.iIdNuevoPerfil)) {
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
	
	public int getIndiceActualPerfil(Perfil perfil,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
				if(perfilAux.getId().equals(perfil.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Perfil perfilAux:this.perfils) {
				if(perfilAux.getId().equals(perfil.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPerfil(Perfil perfilOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
				if(perfilAux.getPerfilOriginal().getId().equals(perfilOriginal.getId())) {
					existe=true;
					perfilOriginal.setId(perfilAux.getId());
					perfilOriginal.setVersionRow(perfilAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Perfil perfilAux:this.perfils) {
				if(perfilAux.getPerfilOriginal().getId().equals(perfilOriginal.getId())) {
					existe=true;
					perfilOriginal.setId(perfilAux.getId());
					perfilOriginal.setVersionRow(perfilAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPerfil(Boolean esParaCancelar) throws Exception {
		perfilsAux=new ArrayList<Perfil>();
		perfilAux=new Perfil();
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
					if(perfilAux.getId()<0) {
						perfilsAux.add(perfilAux);
					}		
				}
				this.iIdNuevoPerfil=0L;
				this.perfilLogic.getPerfils().removeAll(perfilsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Perfil perfilAux:this.perfils) {
					if(perfilAux.getId()<0) {
						perfilsAux.add(perfilAux);
					}		
				}
				this.iIdNuevoPerfil=0L;
				this.perfils.removeAll(perfilsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPerfil 
					&& this.perfilLogic.getPerfils().size()>0
					) {
					perfilAux=this.perfilLogic.getPerfils().get(this.perfilLogic.getPerfils().size() - 1);
				
					if(perfilAux.getId()<0) {
						this.perfilLogic.getPerfils().remove(perfilAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPerfil && this.perfils.size()>0) {
					perfilAux=this.perfils.get(this.perfils.size() - 1);
				
					if(perfilAux.getId()<0) {
						this.perfils.remove(perfilAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPerfil(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(perfil.getId()<0) {
				this.perfilLogic.getPerfils().remove(this.perfil);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(perfil.getId()<0) {
				this.perfils.remove(this.perfil);
			}
		}			
	}
	
	public void setEstadosInicialesPerfil(List<Perfil> perfilsAux) throws Exception {
		PerfilConstantesFunciones.setEstadosInicialesPerfil(perfilsAux);
	}
	
	public void setEstadosInicialesPerfil(Perfil perfilAux) throws Exception {
		PerfilConstantesFunciones.setEstadosInicialesPerfil(perfilAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPerfilActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPerfil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPerfilActual()) {
				if(!this.isEsNuevoPerfil) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPerfil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPerfil=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPerfilActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Perfil ?", "MANTENIMIENTO DE Perfil", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPerfil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Perfil perfil) throws Exception {
		PerfilConstantesFunciones.seleccionarAsignar(this.perfil,perfil);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPerfil=this.isPermisoActualizarOriginalPerfil;
			
			
			this.seleccionarAsignar(perfil);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilConstantesFunciones.quitarEspaciosPerfil(this.perfil,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPerfil("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.perfilSessionBean.setsFuncionBusquedaRapida(this.perfilSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPerfil) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPerfil(esParaCancelar);				
				this.cancelarNuevoPerfil(esParaCancelar);								
			}
			
			this.perfil=new Perfil();
			
			this.inicializarPerfil();
			
			this.actualizarEstadoCeldasBotonesPerfil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPerfil() throws Exception {
		try {
			PerfilConstantesFunciones.inicializarPerfil(this.perfil);
			
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
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.perfilLogic.getPerfils().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePerfils(String sAccionBusqueda,List<Perfil> perfilsParaReportes) throws Exception {
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
					sPathReporteFinal="Perfil"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PerfilMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PerfilMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Perfil"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Perfiles");		
		parameters.put("busquedapor", PerfilConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PerfilOpcion.class));
			classes.add(new Classe(PerfilUsuario.class));
			classes.add(new Classe(UsuarioOpcion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PerfilLogic perfilLogicAuxiliar=new PerfilLogic();
					perfilLogicAuxiliar.setDatosCliente(perfilLogic.getDatosCliente());				
					perfilLogicAuxiliar.setPerfils(perfilsParaReportes);
					
					perfilLogicAuxiliar.cargarRelacionesLoteForeignKeyPerfilWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					perfilsParaReportes=perfilLogicAuxiliar.getPerfils();
					
					//perfilLogic.getNewConnexionToDeep();
					
					//for (Perfil perfil:perfilsParaReportes) {
					//	perfilLogic.deepLoad(perfil, false, DeepLoadType.INCLUDE, classes);
					//}						
					//perfilLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//perfilLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePerfilOpcion = AuxiliarReportes.class.getResourceAsStream("PerfilOpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfilopcion", reportFilePerfilOpcion);

			InputStream reportFilePerfilUsuario = AuxiliarReportes.class.getResourceAsStream("PerfilUsuarioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfilusuario", reportFilePerfilUsuario);

			InputStream reportFileUsuarioOpcion = AuxiliarReportes.class.getResourceAsStream("UsuarioOpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_usuarioopcion", reportFileUsuarioOpcion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePerfil=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PerfilConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PerfilConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePerfil=new JRBeanArrayDataSource(PerfilJInternalFrame.TraerPerfilBeans(perfilsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePerfil);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PerfilConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PerfilConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PerfilBean.TraerPerfilBeans(perfilsParaReportes).toArray()));
							
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
				this.generarExcelReportePerfils(sAccionBusqueda,sTipoArchivoReporte,perfilsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPerfils(sAccionBusqueda,sTipoArchivoReporte,perfilsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPerfilActionPerformed(null);
					//this.generarExcelReportePerfils(sAccionBusqueda,sTipoArchivoReporte,perfilsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPerfils(sAccionBusqueda,sTipoArchivoReporte,perfilsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPerfils(sAccionBusqueda,sTipoArchivoReporte,perfilsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPerfils(sAccionBusqueda,sTipoArchivoReporte,perfilsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePerfils(String sAccionBusqueda,String sTipoArchivoReporte,List<Perfil> perfilsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Perfils");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfil("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Perfil perfil : perfilsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PerfilConstantesFunciones.generarExcelReporteDataPerfil("NORMAL",row,workbook,perfil,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPerfil(String sTipo,Row row,Workbook workbook) {
		
		PerfilConstantesFunciones.generarExcelReporteHeaderPerfil(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPerfils(String sAccionBusqueda,String sTipoArchivoReporte,List<Perfil> perfilsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Perfils");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Perfil perfil : perfilsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PerfilConstantesFunciones.getPerfilDescripcion(perfil));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilConstantesFunciones.LABEL_IDSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilConstantesFunciones.LABEL_IDSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfil.getsistema_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfil.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfil.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilConstantesFunciones.LABEL_NOMBRE2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilConstantesFunciones.LABEL_NOMBRE2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfil.getnombre2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfil.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPerfils(String sAccionBusqueda,String sTipoArchivoReporte,List<Perfil> perfilsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Perfil> perfilsRespaldo=null;
		
		classes=PerfilConstantesFunciones.getClassesRelationshipsOfPerfil(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.perfilLogic.setDatosCliente(this.datosCliente);
		this.perfilLogic.setDatosDeep(this.datosDeep);
		this.perfilLogic.setIsConDeep(true);
		
		perfilsRespaldo=this.perfilLogic.getPerfils();
		
		this.perfilLogic.setPerfils(perfilsParaReportes);	
		this.perfilLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		perfilsParaReportes=this.perfilLogic.getPerfils();
		this.perfilLogic.setPerfils(perfilsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Perfils");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfil("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Perfil perfil : perfilsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPerfil("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PerfilConstantesFunciones.generarExcelReporteDataPerfil("NORMAL",row,workbook,perfil,cellStyleDataAux);
		
			
			


				//UsuarioOpcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(perfil.getUsuarioOpcions()!=null && perfil.getUsuarioOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UsuarioOpcionConstantesFunciones.generarExcelReporteHeaderUsuarioOpcion("RELACIONADO",row,workbook);
				}

				if(perfil.getUsuarioOpcions()!=null) {
					i2=0;
					for(UsuarioOpcion usuarioopcion : perfil.getUsuarioOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						UsuarioOpcionConstantesFunciones.generarExcelReporteDataUsuarioOpcion("RELACIONADO",row,workbook,usuarioopcion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PerfilUsuario
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO))) {

				if(perfil.getPerfilUsuarios()!=null && perfil.getPerfilUsuarios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilUsuarioConstantesFunciones.generarExcelReporteHeaderPerfilUsuario("RELACIONADO",row,workbook);
				}

				if(perfil.getPerfilUsuarios()!=null) {
					i2=0;
					for(PerfilUsuario perfilusuario : perfil.getPerfilUsuarios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PerfilUsuarioConstantesFunciones.generarExcelReporteDataPerfilUsuario("RELACIONADO",row,workbook,perfilusuario,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PerfilOpcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(perfil.getPerfilOpcions()!=null && perfil.getPerfilOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilOpcionConstantesFunciones.generarExcelReporteHeaderPerfilOpcion("RELACIONADO",row,workbook);
				}

				if(perfil.getPerfilOpcions()!=null) {
					i2=0;
					for(PerfilOpcion perfilopcion : perfil.getPerfilOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PerfilOpcionConstantesFunciones.generarExcelReporteDataPerfilOpcion("RELACIONADO",row,workbook,perfilopcion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PerfilConstantesFunciones.getPerfilDescripcion(perfil));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfil.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfil.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPerfil() throws Exception {		
		this.startProcessPerfil(true);
	}
	
	public void startProcessPerfil(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPerfil ,this.jPanelParametrosReportesPerfil, this.jScrollPanelDatosPerfil,this.jPanelPaginacionPerfil, this.jScrollPanelDatosEdicionPerfil, this.jPanelAccionesPerfil,this.jPanelAccionesFormularioPerfil,this.jmenuBarPerfil,this.jmenuBarDetallePerfil,this.jTtoolBarPerfil,this.jTtoolBarDetallePerfil);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfil=this.jTabbedPaneBusquedasPerfil; 
		
		final JPanel jPanelParametrosReportesPerfil=this.jPanelParametrosReportesPerfil;
		//final JScrollPane jScrollPanelDatosPerfil=this.jScrollPanelDatosPerfil;
		final JTable jTableDatosPerfil=this.jTableDatosPerfil;		
		final JPanel jPanelPaginacionPerfil=this.jPanelPaginacionPerfil;
		//final JScrollPane jScrollPanelDatosEdicionPerfil=this.jScrollPanelDatosEdicionPerfil;
		final JPanel jPanelAccionesPerfil=this.jPanelAccionesPerfil;
		
		JPanel jPanelCamposAuxiliarPerfil=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPerfil=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
			jPanelCamposAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jPanelCamposPerfil;
			jPanelAccionesFormularioAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jPanelAccionesFormularioPerfil;
		}
		
		final JPanel jPanelCamposPerfil=jPanelCamposAuxiliarPerfil;
		final JPanel jPanelAccionesFormularioPerfil=jPanelAccionesFormularioAuxiliarPerfil;
		
		
		final JMenuBar jmenuBarPerfil=this.jmenuBarPerfil;
		final JToolBar jTtoolBarPerfil=this.jTtoolBarPerfil;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPerfil=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfil=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
			jmenuBarDetalleAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jmenuBarDetallePerfil;
			jTtoolBarDetalleAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jTtoolBarDetallePerfil;
		}
		
		final JMenuBar jmenuBarDetallePerfil=jmenuBarDetalleAuxiliarPerfil;
		final JToolBar jTtoolBarDetallePerfil=jTtoolBarDetalleAuxiliarPerfil;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfil;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfil;
			processRunnable.jTableDatos=jTableDatosPerfil;
			processRunnable.jPanelCampos=jPanelCamposPerfil;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfil;
			processRunnable.jPanelAcciones=jPanelAccionesPerfil;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfil;
			
			
			processRunnable.jmenuBar=jmenuBarPerfil;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfil;
			processRunnable.jTtoolBar=jTtoolBarPerfil;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfil;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfil ,jPanelParametrosReportesPerfil,jTableDatosPerfil, /*jScrollPanelDatosPerfil,*/jPanelCamposPerfil,jPanelPaginacionPerfil, /*jScrollPanelDatosEdicionPerfil,*/ jPanelAccionesPerfil,jPanelAccionesFormularioPerfil,jmenuBarPerfil,jmenuBarDetallePerfil,jTtoolBarPerfil,jTtoolBarDetallePerfil);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfil ,jPanelParametrosReportesPerfil, jScrollPanelDatosPerfil,jPanelPaginacionPerfil, jScrollPanelDatosEdicionPerfil, jPanelAccionesPerfil,jPanelAccionesFormularioPerfil,jmenuBarPerfil,jmenuBarDetallePerfil,jTtoolBarPerfil,jTtoolBarDetallePerfil);
						
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
	
	public void finishProcessPerfil() {// throws Exception 
		this.finishProcessPerfil(true);
	}
	
	public void finishProcessPerfil(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPerfil ,this.jPanelParametrosReportesPerfil, this.jScrollPanelDatosPerfil,this.jPanelPaginacionPerfil, this.jScrollPanelDatosEdicionPerfil, this.jPanelAccionesPerfil,this.jPanelAccionesFormularioPerfil,this.jmenuBarPerfil,this.jmenuBarDetallePerfil,this.jTtoolBarPerfil,this.jTtoolBarDetallePerfil);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfil=this.jTabbedPaneBusquedasPerfil; 
		
		final JPanel jPanelParametrosReportesPerfil=this.jPanelParametrosReportesPerfil;
		//final JScrollPane jScrollPanelDatosPerfil=this.jScrollPanelDatosPerfil;
		final JTable jTableDatosPerfil=this.jTableDatosPerfil;		
		final JPanel jPanelPaginacionPerfil=this.jPanelPaginacionPerfil;
		//final JScrollPane jScrollPanelDatosEdicionPerfil=this.jScrollPanelDatosEdicionPerfil;
		final JPanel jPanelAccionesPerfil=this.jPanelAccionesPerfil;
		
		JPanel jPanelCamposAuxiliarPerfil=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPerfil=new JPanel();
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
			jPanelCamposAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jPanelCamposPerfil;
			jPanelAccionesFormularioAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jPanelAccionesFormularioPerfil;
		}
		
		final JPanel jPanelCamposPerfil=jPanelCamposAuxiliarPerfil;
		final JPanel jPanelAccionesFormularioPerfil=jPanelAccionesFormularioAuxiliarPerfil;
		
		
		final JMenuBar jmenuBarPerfil=this.jmenuBarPerfil;		
		final JToolBar jTtoolBarPerfil=this.jTtoolBarPerfil;
				
		JMenuBar jmenuBarDetalleAuxiliarPerfil=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfil=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
			jmenuBarDetalleAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jmenuBarDetallePerfil;
			jTtoolBarDetalleAuxiliarPerfil=this.jInternalFrameDetalleFormPerfil.jTtoolBarDetallePerfil;		
		}
		
		final JMenuBar jmenuBarDetallePerfil=jmenuBarDetalleAuxiliarPerfil;
		final JToolBar jTtoolBarDetallePerfil=jTtoolBarDetalleAuxiliarPerfil;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfil;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfil;
			processRunnable.jTableDatos=jTableDatosPerfil;
			processRunnable.jPanelCampos=jPanelCamposPerfil;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfil;
			processRunnable.jPanelAcciones=jPanelAccionesPerfil;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfil;
			
			
			processRunnable.jmenuBar=jmenuBarPerfil;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfil;
			processRunnable.jTtoolBar=jTtoolBarPerfil;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfil;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPerfil ,jPanelParametrosReportesPerfil, jTableDatosPerfil,/*jScrollPanelDatosPerfil,*/jPanelCamposPerfil,jPanelPaginacionPerfil, /*jScrollPanelDatosEdicionPerfil,*/ jPanelAccionesPerfil,jPanelAccionesFormularioPerfil,jmenuBarPerfil,jmenuBarDetallePerfil,jTtoolBarPerfil,jTtoolBarDetallePerfil));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPerfil(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPerfil(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPerfil(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPerfil(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPerfil,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePerfil,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPerfil(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPerfil,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePerfil,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.perfilConstantesFunciones.getsFinalQueryPerfil();
		String  finalQueryPaginacionTodos=this.perfilConstantesFunciones.getsFinalQueryPerfil();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PerfilConstantesFunciones.getArrayColumnasGlobalesNoPerfil(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.perfilsEliminados= new ArrayList<Perfil>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPerfil();
		
				///*PerfilSessionBean*/this.perfilSessionBean=new PerfilSessionBean();
			
			if(this.perfilSessionBean==null) {
				this.perfilSessionBean=new PerfilSessionBean();
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
					this.iNumeroPaginacion=PerfilConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PerfilConstantesFunciones.getClassesForeignKeysOfPerfil(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/perfil."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			perfilsAux= new ArrayList<Perfil>();
			
				
			perfilLogic.setDatosCliente(this.datosCliente);
			perfilLogic.setDatosDeep(this.datosDeep);
			perfilLogic.setIsConDeep(true);
			
			
			perfilLogic.getPerfilDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					perfilLogic.getTodosPerfils(finalQueryGlobal,pagination);
					
					//perfilLogic.getTodosPerfilsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(perfilLogic.getPerfils()==null|| perfilLogic.getPerfils().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilsAux= new ArrayList<Perfil>();
							perfilsAux.addAll(perfilLogic.getPerfils());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilsAux= new ArrayList<Perfil>();
							perfilsAux.addAll(perfils);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilLogic.getTodosPerfils(finalQueryGlobal+"",this.pagination);												
							
							//perfilLogic.getTodosPerfilsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePerfils("Todos",perfilLogic.getPerfils() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilLogic.setPerfils(new ArrayList<Perfil>());					
							perfilLogic.getPerfils().addAll(perfilsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfils=new ArrayList<Perfil>();
							perfils.addAll(perfilsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPerfil=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPerfil=this.idActual;
				
				} else if(this.idPerfilActual!=null && this.idPerfilActual!=0L) {
					idPerfil=idPerfilActual;
				}
				
					
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndicePorId(idPerfil);
				
				this.perfils=new ArrayList<Perfil>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					perfilLogic.getEntity(idPerfil);
					
					//perfilLogic.getEntityWithConnection(idPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.setPerfils(new ArrayList<Perfil>());
					perfilLogic.getPerfils().add(perfilLogic.getPerfil());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfils=new ArrayList<Perfil>();
					this.perfils.add(perfil);
				}
				
				if(perfilLogic.getPerfil()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilLogic.getPerfilsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilLogic.getPerfils()==null||perfilLogic.getPerfils().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfils==null|| perfils.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilsAux=new ArrayList<Perfil>();
						perfilsAux.addAll(perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilsAux=new ArrayList<Perfil>();
							perfilsAux.addAll(perfils);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilLogic.getPerfilsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfils("BusquedaPorNombre",perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfils("BusquedaPorNombre",perfils);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilLogic.setPerfils(new ArrayList<Perfil>());
						perfilLogic.getPerfils().addAll(perfilsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfils=new ArrayList<Perfil>();
							perfils.addAll(perfilsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre2")) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre2(nombre2BusquedaPorNombre2);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilLogic.getPerfilsBusquedaPorNombre2(finalQueryGlobal,pagination,nombre2BusquedaPorNombre2);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre2(nombre2BusquedaPorNombre2);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre2(nombre2BusquedaPorNombre2);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilLogic.getPerfils()==null||perfilLogic.getPerfils().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfils==null|| perfils.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilsAux=new ArrayList<Perfil>();
						perfilsAux.addAll(perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilsAux=new ArrayList<Perfil>();
							perfilsAux.addAll(perfils);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilLogic.getPerfilsBusquedaPorNombre2(finalQueryGlobal,pagination,nombre2BusquedaPorNombre2);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre2(nombre2BusquedaPorNombre2);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceBusquedaPorNombre2(nombre2BusquedaPorNombre2);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfils("BusquedaPorNombre2",perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfils("BusquedaPorNombre2",perfils);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilLogic.setPerfils(new ArrayList<Perfil>());
						perfilLogic.getPerfils().addAll(perfilsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfils=new ArrayList<Perfil>();
							perfils.addAll(perfilsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSistema")) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilLogic.getPerfilsFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilLogic.getPerfils()==null||perfilLogic.getPerfils().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfils==null|| perfils.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilsAux=new ArrayList<Perfil>();
						perfilsAux.addAll(perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilsAux=new ArrayList<Perfil>();
							perfilsAux.addAll(perfils);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilLogic.getPerfilsFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfils("FK_IdSistema",perfilLogic.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfils("FK_IdSistema",perfils);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilLogic.setPerfils(new ArrayList<Perfil>());
						perfilLogic.getPerfils().addAll(perfilsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfils=new ArrayList<Perfil>();
							perfils.addAll(perfilsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPerfil();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPerfil();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilLogic.getPerfils().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfils.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilLogic.getPerfils().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfils.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Perfil perfil) {
		Boolean permite=true;
		
		if(this.perfil.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PerfilConstantesFunciones.getOrderByListaPerfil();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PerfilConstantesFunciones.getOrderByListaPerfil();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Perfil perfil:perfilLogic.getPerfils()) {
				if(perfil.getsType().equals(Constantes2.S_TOTALES)) {
					perfilTotales=perfil;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Perfil perfil:this.perfils) {
				if(perfil.getsType().equals(Constantes2.S_TOTALES)) {
					perfilTotales=perfil;
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
			this.perfilAux=new Perfil();
			this.perfilAux.setsType(Constantes2.S_TOTALES);
			this.perfilAux.setIsNew(false);
			this.perfilAux.setIsChanged(false);
			this.perfilAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PerfilConstantesFunciones.TotalizarValoresFilaPerfil(this.perfilLogic.getPerfils(),this.perfilAux);
				
				this.perfilLogic.getPerfils().add(this.perfilAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PerfilConstantesFunciones.TotalizarValoresFilaPerfil(this.perfils,this.perfilAux);
				
				this.perfils.add(this.perfilAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		perfilTotales=new Perfil();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilLogic.getPerfils().remove(perfilTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfils.remove(perfilTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		perfilTotales=new Perfil();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Perfil perfil:perfilLogic.getPerfils()) {
				if(perfil.getsType().equals(Constantes2.S_TOTALES)) {
					perfilTotales=perfil;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilConstantesFunciones.TotalizarValoresFilaPerfil(this.perfilLogic.getPerfils(),perfilTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Perfil perfil:this.perfils) {
				if(perfil.getsType().equals(Constantes2.S_TOTALES)) {
					perfilTotales=perfil;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilConstantesFunciones.TotalizarValoresFilaPerfil(this.perfils,perfilTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPerfilsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilsBusquedaPorNombre2()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre2";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilsFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilPorIdSistemaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdSistemaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getPerfilsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getPerfilsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilsBusquedaPorNombre2(String sFinalQuery,String nombre2)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getPerfilsBusquedaPorNombre2(sFinalQuery,this.pagination,nombre2);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilsFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getPerfilsFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilPorIdSistemaPorNombre(Long id_sistema,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getPerfilPorIdSistemaPorNombre(id_sistema,nombre);
				
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
	
	public void inicializarPermisosPerfil() {
		this.isPermisoTodoPerfil=false;
		this.isPermisoNuevoPerfil=false;
		this.isPermisoActualizarPerfil=false;
		this.isPermisoActualizarOriginalPerfil=false;
		this.isPermisoEliminarPerfil=false;
		this.isPermisoGuardarCambiosPerfil=false;
		this.isPermisoConsultaPerfil=false;
		this.isPermisoBusquedaPerfil=false;
		this.isPermisoReportePerfil=false;		
		this.isPermisoOrdenPerfil=false;		
		this.isPermisoPaginacionMedioPerfil=false;		
		this.isPermisoPaginacionAltoPerfil=false;
		this.isPermisoPaginacionTodoPerfil=false;
		this.isPermisoCopiarPerfil=false;		
		this.isPermisoVerFormPerfil=false;		
		this.isPermisoDuplicarPerfil=false;		
		this.isPermisoOrdenPerfil=false;		
	}
	
	public void setPermisosUsuarioPerfil(Boolean isPermiso) {
		this.isPermisoTodoPerfil=isPermiso;
		this.isPermisoNuevoPerfil=isPermiso;
		this.isPermisoActualizarPerfil=isPermiso;
		this.isPermisoActualizarOriginalPerfil=isPermiso;
		this.isPermisoEliminarPerfil=isPermiso;
		this.isPermisoGuardarCambiosPerfil=isPermiso;
		this.isPermisoConsultaPerfil=isPermiso;
		this.isPermisoBusquedaPerfil=isPermiso;
		this.isPermisoReportePerfil=isPermiso;
		this.isPermisoOrdenPerfil=isPermiso;		
		this.isPermisoPaginacionMedioPerfil=isPermiso;		
		this.isPermisoPaginacionAltoPerfil=isPermiso;		
		this.isPermisoPaginacionTodoPerfil=isPermiso;		
		this.isPermisoCopiarPerfil=isPermiso;		
		this.isPermisoVerFormPerfil=isPermiso;		
		this.isPermisoDuplicarPerfil=isPermiso;
		this.isPermisoOrdenPerfil=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPerfil(Boolean isPermiso) {
		//this.isPermisoTodoPerfil=isPermiso;
		this.isPermisoNuevoPerfil=isPermiso;
		this.isPermisoActualizarPerfil=isPermiso;
		this.isPermisoActualizarOriginalPerfil=isPermiso;
		this.isPermisoEliminarPerfil=isPermiso;
		this.isPermisoGuardarCambiosPerfil=isPermiso;
		//this.isPermisoConsultaPerfil=isPermiso;
		//this.isPermisoBusquedaPerfil=isPermiso;
		//this.isPermisoReportePerfil=isPermiso;
		//this.isPermisoOrdenPerfil=isPermiso;		
		//this.isPermisoPaginacionMedioPerfil=isPermiso;		
		//this.isPermisoPaginacionAltoPerfil=isPermiso;		
		//this.isPermisoPaginacionTodoPerfil=isPermiso;		
		//this.isPermisoCopiarPerfil=isPermiso;		
		//this.isPermisoDuplicarPerfil=isPermiso;
		//this.isPermisoOrdenPerfil=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPerfilClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PerfilUsuarioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
		
		if(PerfilJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPerfilOpcion=false;
		this.isTienePermisosPerfilOpcion=this.verificarGetPermisosUsuarioOpcionPerfilClaseRelacionada(this.opcionsRelacionadas,PerfilOpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPerfilUsuario=false;
		this.isTienePermisosPerfilUsuario=this.verificarGetPermisosUsuarioOpcionPerfilClaseRelacionada(this.opcionsRelacionadas,PerfilUsuarioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosUsuarioOpcion=false;
		this.isTienePermisosUsuarioOpcion=this.verificarGetPermisosUsuarioOpcionPerfilClaseRelacionada(this.opcionsRelacionadas,UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPerfil(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPerfilClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPerfilOpcion=conPermiso;
		this.isTienePermisosPerfilUsuario=conPermiso;
		this.isTienePermisosUsuarioOpcion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPerfilClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPerfilClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPerfilClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPerfilOpcion && this.jInternalFrameDetalleFormPerfil!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.remove(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPerfilUsuario && this.jInternalFrameDetalleFormPerfil!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.remove(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosUsuarioOpcion && this.jInternalFrameDetalleFormPerfil!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.remove(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPerfil() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PerfilJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.perfilSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PerfilConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPerfil=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPerfil=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPerfil=this.isPermisoActualizarPerfil;
			this.isPermisoEliminarPerfil=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPerfil=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPerfil=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPerfil=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPerfil=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePerfil=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfil=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPerfil=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPerfil=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPerfil=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPerfil=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPerfil=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPerfil=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfil=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.perfilSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPerfil.setToolTipText(this.jTableDatosPerfil.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPerfil(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPerfil(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PerfilJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PerfilJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPerfil() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosUsuarioOpcion && this.perfilConstantesFunciones.mostrarUsuarioOpcionPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Usuario Opcion");
			reporte.setsDescripcion("Usuario Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPerfilUsuario && this.perfilConstantesFunciones.mostrarPerfilUsuarioPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Usuarios Perfiles ");
			reporte.setsDescripcion("Usuarios Perfiles ");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPerfilOpcion && this.perfilConstantesFunciones.mostrarPerfilOpcionPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil Opcion");
			reporte.setsDescripcion("Perfil Opcion");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyPerfilListas()throws Exception {
		try	{						
			
				this.sistemasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPerfilListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PerfilJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPerfilListas(false);
			} else {
			
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeySistemaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SistemaConstantesFunciones.SFINALQUERY;

				this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPerfilListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PerfilParameterReturnGeneral perfilReturnGeneral=new PerfilParameterReturnGeneral();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0) && this.perfilConstantesFunciones.cargarid_sistemaPerfil)
					 || (this.esRecargarFks && this.perfilConstantesFunciones.cargarid_sistemaPerfil)) {

					if(!this.perfilSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=SistemaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+perfilSessionBean.getlidSistemaActual();
					}
				} else {
					finalQueryGlobalSistema="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilReturnGeneral=perfilLogic.cargarCombosLoteForeignKeyPerfil(finalQueryGlobalSistema);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasForeignKey=perfilReturnGeneral.getsistemasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPerfil()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySistema();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			if(this.perfilSessionBean==null) {
				this.perfilSessionBean=new PerfilSessionBean();
			}

			if(!this.perfilSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
				Sistema sistema=new Sistema();
				SistemaConstantesFunciones.setSistemaDescripcion(sistema,Constantes.SMENSAJE_ESCOJA_OPCION);
				sistema.setId(null);

				if(!SistemaConstantesFunciones.ExisteEnLista(this.sistemasForeignKey,sistema,true)) {

					this.sistemasForeignKey.add(0,sistema);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPerfil()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPerfil(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPerfil()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfil();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPerfil(Perfil perfil)throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(perfil.getid_sistema(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPerfil(Perfil perfil,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPerfil()throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(this.perfilConstantesFunciones.getid_sistema(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPerfil()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPerfil()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPerfil()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPerfil()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPerfil()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPerfil(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPerfil()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil!=null && this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PerfilBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PerfilBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.perfilSessionBean=new PerfilSessionBean(); 
		this.perfilConstantesFunciones=new PerfilConstantesFunciones(); 
		this.perfilBean=new Perfil();//(this.perfilConstantesFunciones); 		
		this.perfilReturnGeneral=new PerfilParameterReturnGeneral(); 
		
		this.perfilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PerfilBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PerfilBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PerfilBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPerfil(true);
			
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
			
			this.perfilConstantesFunciones=new PerfilConstantesFunciones(); 
			this.perfilBean=new Perfil();//this.perfilConstantesFunciones); 			
			this.perfilReturnGeneral=new PerfilParameterReturnGeneral(); 
		
			PerfilBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.perfil=new Perfil();
			this.perfils = new ArrayList<Perfil>();
			this.perfilsAux = new ArrayList<Perfil>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic=new PerfilLogic();
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			//this.perfilSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.perfilSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPerfil);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPerfil!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfil);	
					}
					
					if(this.jInternalFrameImportacionPerfil!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfil);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPerfil!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPerfil);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPerfil!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfil);
				this.jInternalFrameDetalleFormPerfil.setVisible(false);
				this.jInternalFrameDetalleFormPerfil.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPerfil!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfil);
					this.jInternalFrameReporteDinamicoPerfil.setVisible(false);
					this.jInternalFrameReporteDinamicoPerfil.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPerfil!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPerfil);
					this.jInternalFrameImportacionPerfil.setVisible(false);
					this.jInternalFrameImportacionPerfil.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPerfil!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPerfil);
					this.jInternalFrameOrderByPerfil.setVisible(false);
					this.jInternalFrameOrderByPerfil.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPerfilActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PerfilConstantesFunciones.INUMEROPAGINACION;
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
			
			this.perfilReturnGeneral=new PerfilParameterReturnGeneral();
			
			this.perfilParameterGeneral=new PerfilParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.perfilLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PerfilJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.perfilSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PerfilUsuarioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilSessionBean.getEsGuardarRelacionado(),this.perfilSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilSessionBean.getEsGuardarRelacionado(),this.perfilSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaDuplicarPerfil=true;
			this.isVisibilidadCeldaCopiarPerfil=true;
			this.isVisibilidadCeldaVerFormPerfil=true;
			this.isVisibilidadCeldaOrdenPerfil=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
			this.isVisibilidadCeldaModificarPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=false;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=false;
			this.isVisibilidadCeldaGuardarPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorNombre2=true;
			this.isVisibilidadFK_IdSistema=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPerfil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPerfil();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPerfil(false);
			
			this.setPermisosUsuarioPerfil();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilSessionBean.getEsGuardarRelacionado() 
				|| (this.perfilSessionBean.getEsGuardarRelacionado() && this.perfilSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPerfilClasesRelacionadas();
			}
			
			if(this.perfilSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPerfilClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PerfilJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPerfil();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPerfil();
			}
			
			if(!this.isPermisoBusquedaPerfil) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPerfil.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPerfil,this.isPermisoPaginacionMedioPerfil,this.isPermisoPaginacionTodoPerfil);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PerfilConstantesFunciones.getTiposSeleccionarPerfil());
				
				this.tiposColumnasSelect=PerfilConstantesFunciones.getTiposSeleccionarPerfil(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPerfil();				
				//this.tiposRelacionesSelect=PerfilConstantesFunciones.getTiposRelacionesPerfil(true);
				
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
			//if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPerfil();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPerfil(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPerfil(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfil() ;
			
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
			
			
			this.usuarioopcionLogic=new UsuarioOpcionLogic();
			this.perfilusuarioLogic=new PerfilUsuarioLogic();
			this.perfilopcionLogic=new PerfilOpcionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.sistemaLogic=new SistemaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				perfilImplementable= (PerfilImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				perfilImplementableHome= (PerfilImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.perfils= new ArrayList<Perfil>();
			this.perfilsEliminados= new ArrayList<Perfil>();
						
			this.isEsNuevoPerfil=false;
			this.esParaAccionDesdeFormularioPerfil=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.sistemasForeignKey=new ArrayList<Sistema>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPerfil(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPerfil();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PerfilBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PerfilConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPerfil("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPerfil(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPerfil!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPerfil();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPerfil();
			}
			
			PerfilBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPerfil.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPerfil.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPerfil.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPerfil(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Perfil: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPerfil() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPerfil")) {
				iIndex=this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPerfil.getSelectedRow();	
				
				

				if(sTitle.equals("Perfil Opciones")) {
					if(!PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPerfil();

						this.cargarParteTabPanelRelacionadaPerfilOpcion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Usuarios Perfiles s")) {
					if(!PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPerfil();

						this.cargarParteTabPanelRelacionadaPerfilUsuario(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Usuario Opciones")) {
					if(!UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPerfil();

						this.cargarParteTabPanelRelacionadaUsuarioOpcion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPerfil();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPerfilOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPerfil.cargarSessionConBeanSwingJInternalFramePerfilOpcion(false,true,iIndex);
		this.jButtonPerfilOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilOpcion();

		//this.jTabbedPaneRelacionesPerfil.updateUI();
		//this.jTabbedPaneRelacionesPerfil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPerfil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfilUsuario(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPerfil.cargarSessionConBeanSwingJInternalFramePerfilUsuario(false,true,iIndex);
		this.jButtonPerfilUsuarioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilUsuario();

		//this.jTabbedPaneRelacionesPerfil.updateUI();
		//this.jTabbedPaneRelacionesPerfil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPerfil.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaUsuarioOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPerfil.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(false,true,iIndex);
		this.jButtonUsuarioOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUsuarioOpcion();

		//this.jTabbedPaneRelacionesPerfil.updateUI();
		//this.jTabbedPaneRelacionesPerfil.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPerfil.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("UsuarioOpcion")) {
				int row=this.jTableDatosPerfil.getSelectedRow();
				jButtonUsuarioOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PerfilUsuario")) {
				int row=this.jTableDatosPerfil.getSelectedRow();
				jButtonPerfilUsuarioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PerfilOpcion")) {
				int row=this.jTableDatosPerfil.getSelectedRow();
				jButtonPerfilOpcionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Usuario Opcion")) {

					if(this.isTienePermisosUsuarioOpcion && this.perfilConstantesFunciones.mostrarUsuarioOpcionPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Usuario Opciones"+"("+UsuarioOpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Usuario Opciones");

						if(perfilConstantesFunciones.resaltarUsuarioOpcionPerfil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(perfilConstantesFunciones.resaltarUsuarioOpcionPerfil);
						}

						jmenuItem.setEnabled(this.perfilConstantesFunciones.activarUsuarioOpcionPerfil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"UsuarioOpcion"));

						

						this.jInternalFrameDetalleFormPerfil.jmenuDetallePerfil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Usuarios Perfiles ")) {

					if(this.isTienePermisosPerfilUsuario && this.perfilConstantesFunciones.mostrarPerfilUsuarioPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Usuarios Perfiles s"+"("+PerfilUsuarioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Usuarios Perfiles s");

						if(perfilConstantesFunciones.resaltarPerfilUsuarioPerfil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(perfilConstantesFunciones.resaltarPerfilUsuarioPerfil);
						}

						jmenuItem.setEnabled(this.perfilConstantesFunciones.activarPerfilUsuarioPerfil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilUsuario"));

						

						this.jInternalFrameDetalleFormPerfil.jmenuDetallePerfil.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Perfil Opcion")) {

					if(this.isTienePermisosPerfilOpcion && this.perfilConstantesFunciones.mostrarPerfilOpcionPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Perfil Opciones"+"("+PerfilOpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfil Opciones");

						if(perfilConstantesFunciones.resaltarPerfilOpcionPerfil!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(perfilConstantesFunciones.resaltarPerfilOpcionPerfil);
						}

						jmenuItem.setEnabled(this.perfilConstantesFunciones.activarPerfilOpcionPerfil);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilOpcion"));

						

						this.jInternalFrameDetalleFormPerfil.jmenuDetallePerfil.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPerfil(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPerfil(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPerfil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPerfilListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPerfil();
		
		this.cargarCombosFrameForeignKeyPerfil();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPerfil();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPerfil();
		}
	}
	
	

	public void cargarCombosForeignKeySistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSistema(this.sistemasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPerfilActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.perfilSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			
			if(jTableDatosPerfil.getRowCount()>=1) {
				jTableDatosPerfil.removeRowSelectionInterval(0, jTableDatosPerfil.getRowCount()-1);						
			}
			
			this.isEsNuevoPerfil=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPerfil(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPerfil(true);			
			//this.perfil=new Perfil();
			//this.perfil.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfil(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfil() ;
			
			if(PerfilJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfil(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.perfil);	
			this.actualizarInformacion("INFO_PADRE",false,this.perfil);				
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			if(this.perfilSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Perfil: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPerfilActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPerfil.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPerfil.getSelectedRows().length;			
			}
			
			perfilsSeleccionados=this.getPerfilsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPerfil--;			
				//Perfil perfilAux= new Perfil();			
				//perfilAux.setId(this.iIdNuevoPerfil);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Perfil perfilOrigen=new Perfil();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Perfil perfilOrigen : perfilsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							perfilOrigen =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilOrigen =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPerfil();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.perfil.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPerfil(perfilOrigen,this.perfil,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilLogic.getPerfils().add(this.perfilAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfils.add(this.perfilAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPerfil(false);
				
				this.jTableDatosPerfil.setRowSelectionInterval(this.getIndiceNuevoPerfil(), this.getIndiceNuevoPerfil());
				
				int iLastRow =  this.jTableDatosPerfil.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfil.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfil.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfil(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();									
		
			Perfil perfilOrigen=new Perfil();
			Perfil perfilDestino=new Perfil();
				
			perfilsSeleccionados=this.getPerfilsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPerfil.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || perfilsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPerfil.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilOrigen =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilOrigen =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilDestino =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilDestino =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				perfilOrigen =perfilsSeleccionados.get(0);
				perfilDestino =perfilsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPerfil(perfilOrigen,perfilDestino,true,false);
				
				perfilDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilDestino,perfilLogic.getPerfils());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilDestino,perfils);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPerfil(false);
				
				//this.jTableDatosPerfil.setRowSelectionInterval(this.getIndiceNuevoPerfil(), this.getIndiceNuevoPerfil());
				
				int iLastRow =  this.jTableDatosPerfil.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfil.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfil.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfil(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPerfil.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPerfil.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPerfil.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPerfil.setVisible(!isVisible);
			this.jPanelPaginacionPerfil.setVisible(!isVisible);
			this.jPanelAccionesPerfil.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePerfil();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPerfil();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPerfil();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPerfil();
			
			this.abrirFrameOrderByPerfil();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPerfil();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePerfil(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfil);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPerfil.isMaximum()) {
					this.jInternalFrameDetalleFormPerfil.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPerfil.setSize(this.jInternalFrameDetalleFormPerfil.iWidthFormulario,this.jInternalFrameDetalleFormPerfil.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPerfil.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPerfil.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPerfil.isMaximum()) {
						this.jInternalFrameDetalleFormPerfil.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth(),PerfilConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth(),PerfilConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth(),PerfilConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfilOpcion();
					}

					if(PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfilUsuario();
					}

					if(UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaUsuarioOpcion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPerfil.setVisible(true);
	        this.jInternalFrameDetalleFormPerfil.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPerfil() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPerfil==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPerfil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfil,false,this);
				} else {
					this.jInternalFrameOrderByPerfil=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfil,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPerfil);
				this.jInternalFrameOrderByPerfil.setVisible(false);
				this.jInternalFrameOrderByPerfil.setSelected(false);
				
				this.jInternalFrameOrderByPerfil.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfil"));
				
				this.inicializarActualizarBindingTablaOrderByPerfil();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPerfil() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPerfil==null) {
				
				this.jInternalFrameImportacionPerfil=new ImportacionJInternalFrame(PerfilConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfil);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPerfil);
				this.jInternalFrameImportacionPerfil.setVisible(false);
				this.jInternalFrameImportacionPerfil.setSelected(false);


				this.jInternalFrameImportacionPerfil.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfil"));
				this.jInternalFrameImportacionPerfil.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfil"));
				this.jInternalFrameImportacionPerfil.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfil"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPerfil() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPerfil==null) {
				this.jInternalFrameReporteDinamicoPerfil=new ReporteDinamicoJInternalFrame(PerfilConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfil);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfil);
				this.jInternalFrameReporteDinamicoPerfil.setVisible(false);
				this.jInternalFrameReporteDinamicoPerfil.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPerfil.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfil"));
				this.jInternalFrameReporteDinamicoPerfil.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfil"));
				this.jInternalFrameReporteDinamicoPerfil.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfil"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfil();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPerfilOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPerfilUsuario() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.jScrollPanelDatosPerfilUsuario.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.jScrollPanelDatosPerfilUsuario.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.jScrollPanelDatosPerfilUsuario.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.jScrollPanelDatosPerfilUsuario.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaUsuarioOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPerfil.jContentPaneDetallePerfil.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePerfil() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfil);
			
	       	this.jInternalFrameDetalleFormPerfil.setVisible(false);
	        this.jInternalFrameDetalleFormPerfil.setSelected(false);
			
			//this.jInternalFrameDetalleFormPerfil.dispose();
			//this.jInternalFrameDetalleFormPerfil=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPerfil() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPerfil.setVisible(true);
	        this.jInternalFrameReporteDinamicoPerfil.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPerfil() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPerfil.setVisible(true);
	        this.jInternalFrameImportacionPerfil.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPerfil() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPerfil.setVisible(true);
	        this.jInternalFrameOrderByPerfil.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPerfil() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPerfil.setVisible(false);
	        this.jInternalFrameOrderByPerfil.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPerfil() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPerfil.setVisible(false);
	        this.jInternalFrameReporteDinamicoPerfil.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPerfil() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPerfil.setVisible(false);
	        this.jInternalFrameImportacionPerfil.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPerfil(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPerfil(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPerfil(true);
			//this.isEsNuevoPerfil=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPerfil("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfil(false) ;
			
			if(perfilSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado() && PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.getEsGuardarRelacionado() && PerfilUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilUsuarioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado() && UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUsuarioOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PerfilJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfil(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfil(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPerfilActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPerfil(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPerfil(true);
			//this.isEsNuevoPerfil=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.perfil.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPerfil("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPerfil(false) ;
			
			if(PerfilJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfil(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfil(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasForeignKey)throws Exception{
		TableColumn tableColumnSistema=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		SistemaTableCell sistemaTableCellFk=(SistemaTableCell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasForeignKey(sistemasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfil.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sistemaTableCellFk.setRowActual(intSelectedRow);
			//sistemaTableCellFk.setsistemasForeignKeyActual(sistemasForeignKey);
		//}


		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.RecargarSistemasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPerfil(false);
			
			//if(!this.isEsNuevoPerfil) {								
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				
			}
			
			if(this.permiteMantenimiento(this.perfil)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPerfil=true;
					this.inicializarActualizarBindingTablaPerfil(false);
					this.isEsNuevoPerfil=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPerfil=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPerfil=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfil(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfil(false);
				
				this.habilitarDeshabilitarControlesPerfil(false);
			
												
				
				if(PerfilJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePerfil();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPerfilActionPerformed(evt,perfilSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPerfil(this.perfil,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPerfil.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,perfilSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.perfil.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPerfilActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				this.perfil.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				this.perfil.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.perfil)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PerfilModel) this.jTableDatosPerfil.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPerfil=true;
				this.inicializarActualizarBindingTablaPerfil(false);
				this.isEsNuevoPerfil=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfil(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfil(false);
				
				this.habilitarDeshabilitarControlesPerfil(false);
				
				
				
				if(PerfilJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePerfil();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPerfilActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPerfil.getRowCount()>=1) {
				jTableDatosPerfil.removeRowSelectionInterval(0, jTableDatosPerfil.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPerfil(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPerfil(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfil(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfil(false) ;
			
			this.isEsNuevoPerfil=false;
			
			if(PerfilJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePerfil();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPerfilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPerfil(false);
				
				//SI ES MANUAL
				if(PerfilJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPerfil();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPerfilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPerfil--;			
			//Perfil perfilAux= new Perfil();			
			//perfilAux.setId(this.iIdNuevoPerfil);
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPerfil();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
			
			this.perfil.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.perfilLogic.getPerfils().add(this.perfilAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.perfils.add(this.perfilAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPerfil(false);
			
			this.jTableDatosPerfil.setRowSelectionInterval(this.getIndiceNuevoPerfil(), this.getIndiceNuevoPerfil());
			
			int iLastRow =  this.jTableDatosPerfil.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPerfil.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPerfil.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPerfil(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPerfilActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPerfil(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfil(false);
			
			//SI ES MANUAL
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfil();
			}
			
			//this.abrirFrameTreePerfil();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPerfilActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PerfilES ?", "MANTENIMIENTO DE Perfil", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPerfil.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPerfil();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.perfilReturnGeneral=perfilLogic.procesarImportacionPerfilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.perfilParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPerfilReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPerfilActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPerfil.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPerfil.setFileImportacion(this.jInternalFrameImportacionPerfil.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPerfil.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPerfil.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPerfil.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPerfil.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPerfilActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		

		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PerfilBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PerfilBaseDesign.jrxml";
			
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
			
			this.generarReportePerfils("Todos",perfilsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilConstantesFunciones.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPerfil.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PerfilConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case PerfilConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE2:
					sNombreCampoCategoria="nombre2";
					break;

				case PerfilConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PerfilConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case PerfilConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE2:
					sNombreCampoCategoriaValor="nombre2";
					break;

				case PerfilConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPerfil.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfil.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilConstantesFunciones.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case PerfilConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Alterno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre2");
					break;

				case PerfilConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
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
	
	public void jButtonGenerarExcelReporteDinamicoPerfilActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Perfils");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PerfilConstantesFunciones.LABEL_IDSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilConstantesFunciones.LABEL_IDSISTEMA);
					iRow++;

					for(Perfil perfil:perfilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfil.getsistema_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Perfil perfil:perfilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfil.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Perfil perfil:perfilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfil.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilConstantesFunciones.LABEL_NOMBRE2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilConstantesFunciones.LABEL_NOMBRE2);
					iRow++;

					for(Perfil perfil:perfilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfil.getnombre2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(Perfil perfil:perfilsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfil.getestado());
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
			//	this.getFilaCabeceraExportarExcelPerfil(row);				
			//	iRow++;
			//}				
			
			//for(Perfil perfilAux:perfilsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPerfil(perfilAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
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
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfil(false);
			
			//SI ES MANUAL
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfil();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPerfilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfil(false);
			
			//SI ES MANUAL
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfil();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPerfilActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfil(false);
			
			//SI ES MANUAL
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfil();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPerfil() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPerfil.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPerfil.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPerfil.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPerfil.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPerfil.setMinimumSize(dimensionMinimum);
		this.jTableDatosPerfil.setMaximumSize(dimensionMaximum);
		this.jTableDatosPerfil.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPerfil(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPerfil(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPerfil(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPerfil(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPerfil(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPerfil(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfil(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPerfil(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PerfilJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PerfilJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPerfil() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPerfil();
		
		this.inicializarActualizarBindingBotonesManualPerfil(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPerfil();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfil() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPerfil(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPerfil(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPerfil.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPerfil.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePerfil.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPerfil!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPerfil.jCheckBoxPostAccionNuevoPerfil.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPerfil.jCheckBoxPostAccionSinCerrarPerfil.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPerfil.jCheckBoxPostAccionSinMensajePerfil.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPerfil.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPerfil.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePerfil.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPerfil!=null) {
				this.jInternalFrameDetalleFormPerfil.jCheckBoxPostAccionNuevoPerfil.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPerfil.jCheckBoxPostAccionSinCerrarPerfil.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPerfil.jCheckBoxPostAccionSinMensajePerfil.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPerfil.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPerfil.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPerfil.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPerfil!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPerfil.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPerfil.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPerfil.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPerfil.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPerfil!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPerfil.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPerfil.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPerfil(Boolean esInicializar) throws Exception {
		try	{	
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPerfil(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPerfil() throws Exception {
		try	{
			if(PerfilJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfil();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfil() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfil() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPerfil.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPerfil.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPerfil.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPerfil.addItem(reporte);
			}
			
			
			if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPerfil.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPerfil.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPerfil.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPerfil.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPerfil.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPerfil.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPerfil.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfil();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfil() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfil!=null) {
				this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfil!=null) {
				this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfil.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPerfil!=null) {
				
				if(this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfil.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPerfil.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfil.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfil.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPerfil()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombrePerfil.getText();
		this.nombre2BusquedaPorNombre2=this.jTextAreanombre2BusquedaPorNombre2Perfil.getText();
		if(this.jComboBoxid_sistemaFK_IdSistemaPerfil.getSelectedItem()!=null){this.id_sistemaFK_IdSistema=((Sistema)this.jComboBoxid_sistemaFK_IdSistemaPerfil.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPerfil(Boolean esInicializar) throws Exception {				
		if(PerfilJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPerfil();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPerfil() throws Exception {
		this.inicializarActualizarBindingTablaPerfil(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPerfil() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPerfilOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPerfil(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=perfilLogic.getPerfils().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=perfils.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPerfil.setModel(new PerfilModel(this.perfilLogic.getPerfils(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPerfil.setModel(new PerfilModel(this.perfils,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPerfil!=null && this.jInternalFrameOrderByPerfil.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPerfil();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PerfilConstantesFunciones.SCLASSWEBTITULO,perfilConstantesFunciones.resaltarSeleccionarPerfil,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PerfilConstantesFunciones.SCLASSWEBTITULO,perfilConstantesFunciones.resaltarSeleccionarPerfil,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_ID));

		if(this.perfilConstantesFunciones.mostraridPerfil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.perfilConstantesFunciones.resaltaridPerfil,this.perfilConstantesFunciones.activaridPerfil,this,true,"idPerfil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilConstantesFunciones.resaltaridPerfil,this.perfilConstantesFunciones.activaridPerfil,this,true,"idPerfil","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_IDSISTEMA));

		if(this.perfilConstantesFunciones.mostrarid_sistemaPerfil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilConstantesFunciones.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SistemaTableCell(this.sistemasForeignKey,this.perfilConstantesFunciones.resaltarid_sistemaPerfil,this,this.perfilConstantesFunciones.activarid_sistemaPerfil));
			tableColumn.setCellEditor(new SistemaTableCell(this.sistemasForeignKey,this.perfilConstantesFunciones.resaltarid_sistemaPerfil,this,this.perfilConstantesFunciones.activarid_sistemaPerfil,true,"id_sistemaPerfil","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_CODIGO));

		if(this.perfilConstantesFunciones.mostrarcodigoPerfil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.perfilConstantesFunciones.resaltarcodigoPerfil,this.perfilConstantesFunciones.activarcodigoPerfil,this,true,"codigoPerfil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilConstantesFunciones.resaltarcodigoPerfil,this.perfilConstantesFunciones.activarcodigoPerfil,this,true,"codigoPerfil","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_NOMBRE));

		if(this.perfilConstantesFunciones.mostrarnombrePerfil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.perfilConstantesFunciones.resaltarnombrePerfil,this.perfilConstantesFunciones.activarnombrePerfil,this,true,"nombrePerfil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilConstantesFunciones.resaltarnombrePerfil,this.perfilConstantesFunciones.activarnombrePerfil,this,true,"nombrePerfil","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_NOMBRE2));

		if(this.perfilConstantesFunciones.mostrarnombre2Perfil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilConstantesFunciones.LABEL_NOMBRE2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.perfilConstantesFunciones.resaltarnombre2Perfil,this.perfilConstantesFunciones.activarnombre2Perfil,this,true,"nombre2Perfil","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilConstantesFunciones.resaltarnombre2Perfil,this.perfilConstantesFunciones.activarnombre2Perfil,this,true,"nombre2Perfil","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfil,PerfilConstantesFunciones.LABEL_ESTADO));

		if(this.perfilConstantesFunciones.mostrarestadoPerfil && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilConstantesFunciones.resaltarestadoPerfil,this.perfilConstantesFunciones.activarestadoPerfil));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilConstantesFunciones.resaltarestadoPerfil,this.perfilConstantesFunciones.activarestadoPerfil,this,true,"estadoPerfil","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.perfilSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosUsuarioOpcion && this.perfilConstantesFunciones.mostrarUsuarioOpcionPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Usuario Opciones");
				tableColumn.setHeaderValue("Usuario Opciones");
				tableColumn.setCellRenderer(new UsuarioOpcionTableCell(perfilConstantesFunciones.resaltarUsuarioOpcionPerfil,this,this.perfilConstantesFunciones.activarUsuarioOpcionPerfil));
				tableColumn.setCellEditor(new UsuarioOpcionTableCell(perfilConstantesFunciones.resaltarUsuarioOpcionPerfil,this,this.perfilConstantesFunciones.activarUsuarioOpcionPerfil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPerfil.addColumn(tableColumn);
			}

			if(this.isTienePermisosPerfilUsuario && this.perfilConstantesFunciones.mostrarPerfilUsuarioPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Usuarios Perfiles s");
				tableColumn.setHeaderValue("Usuarios Perfiles s");
				tableColumn.setCellRenderer(new PerfilUsuarioTableCell(perfilConstantesFunciones.resaltarPerfilUsuarioPerfil,this,this.perfilConstantesFunciones.activarPerfilUsuarioPerfil));
				tableColumn.setCellEditor(new PerfilUsuarioTableCell(perfilConstantesFunciones.resaltarPerfilUsuarioPerfil,this,this.perfilConstantesFunciones.activarPerfilUsuarioPerfil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPerfil.addColumn(tableColumn);
			}

			if(this.isTienePermisosPerfilOpcion && this.perfilConstantesFunciones.mostrarPerfilOpcionPerfil && !PerfilConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Perfil Opciones");
				tableColumn.setHeaderValue("Perfil Opciones");
				tableColumn.setCellRenderer(new PerfilOpcionTableCell(perfilConstantesFunciones.resaltarPerfilOpcionPerfil,this,this.perfilConstantesFunciones.activarPerfilOpcionPerfil));
				tableColumn.setCellEditor(new PerfilOpcionTableCell(perfilConstantesFunciones.resaltarPerfilOpcionPerfil,this,this.perfilConstantesFunciones.activarPerfilOpcionPerfil));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPerfil.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfil.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfil.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPerfil && this.isPermisoGuardarCambiosPerfil) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.perfilSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.perfilSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPerfil.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.perfilSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosPerfil.addColumn(tableColumn);
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
			
			this.jTableDatosPerfil.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfil && this.isPermisoGuardarCambiosPerfil) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.perfilSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfil && this.isPermisoGuardarCambiosPerfil) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPerfil.moveColumn(this.jTableDatosPerfil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPerfil.moveColumn(this.jTableDatosPerfil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.perfilSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPerfil.moveColumn(this.jTableDatosPerfil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPerfil.moveColumn(this.jTableDatosPerfil.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPerfil.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPerfil.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPerfil,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPerfil.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPerfil.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPerfil.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPerfil.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPerfil.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=perfilLogic.getPerfils().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=perfils.size()-1;
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
		//this.jTableDatosPerfil.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPerfil.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPerfil();
			
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
				
				//this.isEsNuevoPerfil=false;
					
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
				if(this.perfilSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPerfil==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfil.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfil.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.perfil.getsType().equals("DUPLICADO")
				   || this.perfil.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPerfil=true;
				
				} else {
					this.isEsNuevoPerfil=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.perfilSessionBean.getEsGuardarRelacionado()) {
					if(this.perfil.getId()>=0 && !this.perfil.getIsNew()) {						
						this.isEsNuevoPerfil=false;
						
					} else {
						this.isEsNuevoPerfil=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPerfil(esRelaciones);						
				
				this.seleccionarPerfil(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.perfil.getId()<0) {
					this.isEsNuevoPerfil=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPerfil(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPerfil(evt,rowIndex);
				}	
				
				if(this.perfilSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Perfil: " + this.dDif); 
					}
				}								
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPerfil(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.perfil)) {
					if(this.perfil.getId()>0) {
						this.perfil.setIsDeleted(true);
						
						this.perfilsEliminados.add(this.perfil);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilLogic.getPerfils().remove(this.perfil);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfils.remove(this.perfil);				
					}
					
					
					((PerfilModel) this.jTableDatosPerfil.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfil(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPerfil(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPerfil) {
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfil.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfil.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPerfil(this.perfil);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.perfilConstantesFunciones.cargarid_sistemaPerfil || this.perfilConstantesFunciones.event_dependid_sistemaPerfil) {
						//this.cargarCombosSistemasForeignKeyLista(" where id="+this.perfil.getid_sistema());
									//this.inicializarActualizarBindingPerfil(false,false);
						this.sistemasForeignKey=new ArrayList<Sistema>();

						if(perfil.getSistema()!=null) {
							this.sistemasForeignKey.add(perfil.getSistema());
						}

						this.addItemDefectoCombosForeignKeySistema();
						this.cargarCombosFrameSistemasForeignKey("Todos");
					}
					this.setActualSistemaForeignKey(this.perfil.getid_sistema(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPerfil("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPerfil(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfil() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfil(Perfil perfil) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPerfil(perfil,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfil(Perfil perfil,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPerfil(perfil);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPerfil(perfil,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPerfil(perfil);
	}
	
	public void setVariablesObjetoActualToFormularioPerfil(Perfil perfil) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setText(perfil.getId().toString());
			this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setText(perfil.getcodigo());
			this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setText(perfil.getnombre());
			this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setText(perfil.getnombre2());
			this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setSelected(perfil.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Perfil perfilLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,perfilLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Perfil perfilLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				perfilLocal=this.perfil;
			} else {
				perfilLocal=this.perfilAnterior;
			}
		}
		
		if(this.permiteMantenimiento(perfilLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPerfil(perfilLocal,true);
					
					if(perfilSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(perfilLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.perfilSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(perfilLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPerfil(Perfil perfil,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfil(perfil,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPerfil(perfil);
	}
	
	public void setVariablesFormularioToObjetoActualPerfil(Perfil perfil,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfil(perfil,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPerfil(Perfil perfil,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.getText()==null || this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.getText()=="" || this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.getText()=="Id") {
				this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setText("0");
			}

			if(conColumnasBase) {perfil.setId(Long.parseLong(this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelIdPerfil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfil.setcodigo(this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelcodigoPerfil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfil.setnombre(this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelnombrePerfil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfil.setnombre2(this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilConstantesFunciones.LABEL_NOMBRE2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelnombre2Perfil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfil.setestado(this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfil.jLabelestadoPerfil,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfil(Perfil perfilBean,Perfil perfil,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && perfilBean.getid_sistema()!=null && !perfilBean.getid_sistema().equals(-1L))) {perfil.setid_sistema(perfilBean.getid_sistema());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPerfil(Perfil perfilOrigen,Perfil perfil,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilOrigen.getId()!=null && !perfilOrigen.getId().equals(0L))) {perfil.setId(perfilOrigen.getId());}}
			if(conDefault || (!conDefault && perfilOrigen.getid_sistema()!=null && !perfilOrigen.getid_sistema().equals(-1L))) {perfil.setid_sistema(perfilOrigen.getid_sistema());}
			if(conDefault || (!conDefault && perfilOrigen.getcodigo()!=null && !perfilOrigen.getcodigo().equals(""))) {perfil.setcodigo(perfilOrigen.getcodigo());}
			if(conDefault || (!conDefault && perfilOrigen.getnombre()!=null && !perfilOrigen.getnombre().equals(""))) {perfil.setnombre(perfilOrigen.getnombre());}
			if(conDefault || (!conDefault && perfilOrigen.getnombre2()!=null && !perfilOrigen.getnombre2().equals(""))) {perfil.setnombre2(perfilOrigen.getnombre2());}
			if(conDefault || (!conDefault && perfilOrigen.getestado()!=null && !perfilOrigen.getestado().equals(false))) {perfil.setestado(perfilOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfil(Perfil perfil) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setText(perfil.getId().toString());
			this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setText(perfil.getcodigo());
			this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setText(perfil.getnombre());
			this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setText(perfil.getnombre2());
			this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setSelected(perfil.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfil(PerfilBean perfilBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setText(perfilBean.getId().toString());
			this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setText(perfilBean.getcodigo());
			this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setText(perfilBean.getnombre());
			this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setText(perfilBean.getnombre2());
			this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setSelected(perfilBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPerfil(PerfilParameterReturnGeneral perfilReturnGeneral,PerfilBean perfilBean,Boolean conDefault) throws Exception { 
		try {
			Perfil perfilLocal=new Perfil();
			
			perfilLocal=perfilReturnGeneral.getPerfil();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilLocal.getId()!=null && !perfilLocal.getId().equals(0L))) {perfilBean.setId(perfilLocal.getId());}}
			if(conDefault || (!conDefault && perfilLocal.getid_sistema()!=null && !perfilLocal.getid_sistema().equals(-1L))) {perfilBean.setid_sistema(perfilLocal.getid_sistema());}
			if(conDefault || (!conDefault && perfilLocal.getcodigo()!=null && !perfilLocal.getcodigo().equals(""))) {perfilBean.setcodigo(perfilLocal.getcodigo());}
			if(conDefault || (!conDefault && perfilLocal.getnombre()!=null && !perfilLocal.getnombre().equals(""))) {perfilBean.setnombre(perfilLocal.getnombre());}
			if(conDefault || (!conDefault && perfilLocal.getnombre2()!=null && !perfilLocal.getnombre2().equals(""))) {perfilBean.setnombre2(perfilLocal.getnombre2());}
			if(conDefault || (!conDefault && perfilLocal.getestado()!=null && !perfilLocal.getestado().equals(false))) {perfilBean.setestado(perfilLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPerfilGenerico(Long idPerfilSeleccionado,JComboBox jComboBoxPerfil,List<Perfil> perfilsLocal)throws Exception {
		try {
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsLocal) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}

			jComboBoxPerfil.setSelectedItem(perfilTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPerfilGenerico(JComboBox jComboBoxPerfil,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfil.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPerfil.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfil.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPerfil.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPerfil.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPerfil.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PerfilOpcion")) {
			jButtonPerfilOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PerfilUsuario")) {
			jButtonPerfilUsuarioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("UsuarioOpcion")) {
			jButtonUsuarioOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfil=(Perfil) perfilLogic.getPerfils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfil =(Perfil) perfils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
			if(!perfil.getIsNew() && !perfil.getIsChanged() && !perfil.getIsDeleted()) {
				sDescripcion=perfil.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
				sDescripcion=perfil.getsistema_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Perfil perfilRow=new Perfil();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilRow=(Perfil) perfilLogic.getPerfils().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilRow=(Perfil) perfils.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPerfilOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Perfil perfil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPerfil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil = (Perfil)this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.perfil = (Perfil)this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(perfil!=null) {
						this.perfil = perfil;
					} else {
						this.perfil = new Perfil();
					}
				}

				if(this.isTienePermisosPerfilOpcion && this.permiteMantenimiento(this.perfil)) {
					PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup;
					} else {
						perfilopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame;
					}

					List<Perfil> perfils=new ArrayList<Perfil>();
					perfils.add(this.perfil);
					if(!esRelacionado) {
						//perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setConGuardarRelaciones(false);
						//perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilopcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPerfil.cargarPerfilOpcionBeanSwingJInternalFrame(perfils,this.perfil,perfilopcionBeanSwingJInternalFrame,/*conInicializar,*/perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getConGuardarRelaciones(),perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado());
					perfilopcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("no_relacionado");

						perfilopcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA + (PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilopcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPerfil=(TitledBorder)this.jScrollPanelDatosPerfil.getBorder();
						TitledBorder titledBorderPerfilOpcion=(TitledBorder)perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.getBorder();

						titledBorderPerfilOpcion.setTitle(titledBorderPerfil.getTitle() + " -> Perfil Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilopcionBeanSwingJInternalFrame);
						}

						perfilopcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilopcionBeanSwingJInternalFrame);

						perfilopcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.perfilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPerfilUsuarioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Perfil perfil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPerfil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil = (Perfil)this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.perfil = (Perfil)this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(perfil!=null) {
						this.perfil = perfil;
					} else {
						this.perfil = new Perfil();
					}
				}

				if(this.isTienePermisosPerfilUsuario && this.permiteMantenimiento(this.perfil)) {
					PerfilUsuarioBeanSwingJInternalFrame perfilusuarioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup=new PerfilUsuarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilusuarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup;
					} else {
						perfilusuarioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame;
					}

					List<Perfil> perfils=new ArrayList<Perfil>();
					perfils.add(this.perfil);
					if(!esRelacionado) {
						//perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setConGuardarRelaciones(false);
						//perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilusuarioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPerfil.cargarPerfilUsuarioBeanSwingJInternalFrame(perfils,this.perfil,perfilusuarioBeanSwingJInternalFrame,/*conInicializar,*/perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.getConGuardarRelaciones(),perfilusuarioBeanSwingJInternalFrame.perfilusuarioSessionBean.getEsGuardarRelacionado());
					perfilusuarioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilusuarioBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilUsuario("no_relacionado");

						perfilusuarioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilUsuarioConstantesFunciones.ITAMANIOFILATABLA + (PerfilUsuarioConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilusuarioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPerfil=(TitledBorder)this.jScrollPanelDatosPerfil.getBorder();
						TitledBorder titledBorderPerfilUsuario=(TitledBorder)perfilusuarioBeanSwingJInternalFrame.jScrollPanelDatosPerfilUsuario.getBorder();

						titledBorderPerfilUsuario.setTitle(titledBorderPerfil.getTitle() + " -> Usuarios Perfiles ");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilusuarioBeanSwingJInternalFrame);
						}

						perfilusuarioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilusuarioBeanSwingJInternalFrame);

						perfilusuarioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.perfilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Usuarios Perfiles ",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonUsuarioOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Perfil perfil) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPerfil==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil = (Perfil)this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.perfil = (Perfil)this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(perfil!=null) {
						this.perfil = perfil;
					} else {
						this.perfil = new Perfil();
					}
				}

				if(this.isTienePermisosUsuarioOpcion && this.permiteMantenimiento(this.perfil)) {
					UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						usuarioopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup;
					} else {
						usuarioopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame;
					}

					List<Perfil> perfils=new ArrayList<Perfil>();
					perfils.add(this.perfil);
					if(!esRelacionado) {
						//usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setConGuardarRelaciones(false);
						//usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					usuarioopcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPerfil.cargarUsuarioOpcionBeanSwingJInternalFrame(perfils,this.perfil,usuarioopcionBeanSwingJInternalFrame,/*conInicializar,*/usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getConGuardarRelaciones(),usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado());
					usuarioopcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");

						usuarioopcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA + (UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						usuarioopcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPerfil=(TitledBorder)this.jScrollPanelDatosPerfil.getBorder();
						TitledBorder titledBorderUsuarioOpcion=(TitledBorder)usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.getBorder();

						titledBorderUsuarioOpcion.setTitle(titledBorderPerfil.getTitle() + " -> Usuario Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,usuarioopcionBeanSwingJInternalFrame);
						}

						usuarioopcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(usuarioopcionBeanSwingJInternalFrame);

						usuarioopcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.perfilSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Usuario Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPerfil(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPerfil.setVisible((this.isVisibilidadCeldaNuevoPerfil && this.isPermisoNuevoPerfil));			
			this.jButtonDuplicarPerfil.setVisible((this.isVisibilidadCeldaDuplicarPerfil && this.isPermisoDuplicarPerfil));			
			this.jButtonCopiarPerfil.setVisible((this.isVisibilidadCeldaCopiarPerfil && this.isPermisoCopiarPerfil));
			this.jButtonVerFormPerfil.setVisible((this.isVisibilidadCeldaVerFormPerfil && this.isPermisoVerFormPerfil));
			
			this.jButtonAbrirOrderByPerfil.setVisible((this.isVisibilidadCeldaOrdenPerfil && this.isPermisoOrdenPerfil));			
			
			this.jButtonNuevoRelacionesPerfil.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfil && this.isPermisoNuevoPerfil));			
			this.jButtonNuevoGuardarCambiosPerfil.setVisible((this.isVisibilidadCeldaNuevoPerfil && this.isPermisoNuevoPerfil && this.isPermisoGuardarCambiosPerfil));
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.jInternalFrameDetalleFormPerfil.jButtonModificarPerfil.setVisible((this.isVisibilidadCeldaModificarPerfil && this.isPermisoActualizarPerfil));	
			this.jInternalFrameDetalleFormPerfil.jButtonActualizarPerfil.setVisible((this.isVisibilidadCeldaActualizarPerfil && this.isPermisoActualizarPerfil));	
			this.jInternalFrameDetalleFormPerfil.jButtonEliminarPerfil.setVisible((this.isVisibilidadCeldaEliminarPerfil && this.isPermisoEliminarPerfil));
			this.jInternalFrameDetalleFormPerfil.jButtonCancelarPerfil.setVisible(this.isVisibilidadCeldaCancelarPerfil);							
			this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.setVisible((this.isVisibilidadCeldaGuardarPerfil && this.isPermisoGuardarCambiosPerfil));			
			
			}
						
			this.jButtonGuardarCambiosTablaPerfil.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfil && this.isPermisoGuardarCambiosPerfil));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPerfil.setVisible((this.isVisibilidadCeldaNuevoPerfil && this.isPermisoNuevoPerfil));						
			this.jButtonDuplicarToolBarPerfil.setVisible((this.isVisibilidadCeldaDuplicarPerfil && this.isPermisoDuplicarPerfil));						
			this.jButtonCopiarToolBarPerfil.setVisible((this.isVisibilidadCeldaCopiarPerfil && this.isPermisoCopiarPerfil));			
			this.jButtonVerFormToolBarPerfil.setVisible((this.isVisibilidadCeldaVerFormPerfil && this.isPermisoVerFormPerfil));			
			this.jButtonAbrirOrderByToolBarPerfil.setVisible((this.isVisibilidadCeldaOrdenPerfil && this.isPermisoOrdenPerfil));
			this.jButtonNuevoRelacionesToolBarPerfil.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfil && this.isPermisoNuevoPerfil));			
			this.jButtonNuevoGuardarCambiosToolBarPerfil.setVisible((this.isVisibilidadCeldaNuevoPerfil && this.isPermisoNuevoPerfil && this.isPermisoGuardarCambiosPerfil));			
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.jInternalFrameDetalleFormPerfil.jButtonModificarToolBarPerfil.setVisible((this.isVisibilidadCeldaModificarPerfil && this.isPermisoActualizarPerfil));	
			this.jInternalFrameDetalleFormPerfil.jButtonActualizarToolBarPerfil.setVisible((this.isVisibilidadCeldaActualizarPerfil  && this.isPermisoActualizarPerfil));	
			this.jInternalFrameDetalleFormPerfil.jButtonEliminarToolBarPerfil.setVisible((this.isVisibilidadCeldaEliminarPerfil && this.isPermisoEliminarPerfil));
			this.jInternalFrameDetalleFormPerfil.jButtonCancelarToolBarPerfil.setVisible(this.isVisibilidadCeldaCancelarPerfil);				
			this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosToolBarPerfil.setVisible((this.isVisibilidadCeldaGuardarPerfil && this.isPermisoGuardarCambiosPerfil));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPerfil.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfil && this.isPermisoGuardarCambiosPerfil));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPerfil.setVisible((this.isVisibilidadCeldaNuevoPerfil && this.isPermisoNuevoPerfil));			
			this.jMenuItemDuplicarPerfil.setVisible((this.isVisibilidadCeldaDuplicarPerfil && this.isPermisoDuplicarPerfil));			
			this.jMenuItemCopiarPerfil.setVisible((this.isVisibilidadCeldaCopiarPerfil && this.isPermisoCopiarPerfil));			
			this.jMenuItemVerFormPerfil.setVisible((this.isVisibilidadCeldaVerFormPerfil && this.isPermisoVerFormPerfil));			
			this.jMenuItemAbrirOrderByPerfil.setVisible((this.isVisibilidadCeldaOrdenPerfil && this.isPermisoOrdenPerfil));			
			//this.jMenuItemMostrarOcultarPerfil.setVisible((this.isVisibilidadCeldaOrdenPerfil && this.isPermisoOrdenPerfil));
			this.jMenuItemDetalleAbrirOrderByPerfil.setVisible((this.isVisibilidadCeldaOrdenPerfil && this.isPermisoOrdenPerfil));			
			//this.jMenuItemDetalleMostrarOcultarPerfil.setVisible((this.isVisibilidadCeldaOrdenPerfil && this.isPermisoOrdenPerfil));			
			this.jMenuItemNuevoRelacionesPerfil.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfil && this.isPermisoNuevoPerfil));			
			this.jMenuItemNuevoGuardarCambiosPerfil.setVisible((this.isVisibilidadCeldaNuevoPerfil && this.isPermisoNuevoPerfil && this.isPermisoGuardarCambiosPerfil));									
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.jInternalFrameDetalleFormPerfil.jMenuItemModificarPerfil.setVisible((this.isVisibilidadCeldaModificarPerfil && this.isPermisoActualizarPerfil));	
			this.jInternalFrameDetalleFormPerfil.jMenuItemActualizarPerfil.setVisible((this.isVisibilidadCeldaActualizarPerfil && this.isPermisoActualizarPerfil));	
			this.jInternalFrameDetalleFormPerfil.jMenuItemEliminarPerfil.setVisible((this.isVisibilidadCeldaEliminarPerfil && this.isPermisoEliminarPerfil));
			this.jInternalFrameDetalleFormPerfil.jMenuItemCancelarPerfil.setVisible(this.isVisibilidadCeldaCancelarPerfil);				
			}
			
			this.jMenuItemGuardarCambiosPerfil.setVisible((this.isVisibilidadCeldaGuardarPerfil && this.isPermisoGuardarCambiosPerfil));						
			this.jMenuItemGuardarCambiosTablaPerfil.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfil && this.isPermisoGuardarCambiosPerfil));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPerfil=this.jButtonNuevoPerfil.isVisible();
			this.isVisibilidadCeldaDuplicarPerfil=this.jButtonDuplicarPerfil.isVisible();
			this.isVisibilidadCeldaCopiarPerfil=this.jButtonCopiarPerfil.isVisible();
			this.isVisibilidadCeldaVerFormPerfil=this.jButtonVerFormPerfil.isVisible();
			
			this.isVisibilidadCeldaOrdenPerfil=this.jButtonAbrirOrderByPerfil.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPerfil=this.jButtonNuevoRelacionesPerfil.isVisible();
			this.isVisibilidadCeldaModificarPerfil=this.jButtonModificarPerfil.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.isVisibilidadCeldaActualizarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonActualizarPerfil.isVisible();
			this.isVisibilidadCeldaEliminarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonEliminarPerfil.isVisible();
			this.isVisibilidadCeldaCancelarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonCancelarPerfil.isVisible();
			this.isVisibilidadCeldaGuardarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPerfil=this.jButtonGuardarCambiosTablaPerfil.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPerfil=this.jButtonNuevoToolBarPerfil.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfil=this.jButtonNuevoRelacionesToolBarPerfil.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.isVisibilidadCeldaModificarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonModificarToolBarPerfil.isVisible();
			this.isVisibilidadCeldaActualizarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonActualizarToolBarPerfil.isVisible();
			this.isVisibilidadCeldaEliminarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonEliminarToolBarPerfil.isVisible();
			this.isVisibilidadCeldaCancelarPerfil=this.jInternalFrameDetalleFormPerfil.jButtonCancelarToolBarPerfil.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfil=this.jButtonGuardarCambiosToolBarPerfil.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfil=this.jButtonGuardarCambiosTablaToolBarPerfil.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPerfil=this.jMenuItemNuevoPerfil.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfil=this.jMenuItemNuevoRelacionesPerfil.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.isVisibilidadCeldaModificarPerfil=this.jInternalFrameDetalleFormPerfil.jMenuItemModificarPerfil.isVisible();
			this.isVisibilidadCeldaActualizarPerfil=this.jInternalFrameDetalleFormPerfil.jMenuItemActualizarPerfil.isVisible();
			this.isVisibilidadCeldaEliminarPerfil=this.jInternalFrameDetalleFormPerfil.jMenuItemEliminarPerfil.isVisible();
			this.isVisibilidadCeldaCancelarPerfil=this.jInternalFrameDetalleFormPerfil.jMenuItemCancelarPerfil.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfil=this.jMenuItemGuardarCambiosPerfil.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfil=this.jMenuItemGuardarCambiosTablaPerfil.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPerfil(Boolean esInicializar) {
		if(PerfilJInternalFrame.ISBINDING_MANUAL) {			
			if(this.perfilSessionBean.getConGuardarRelaciones()) {
				//if(this.perfilSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPerfil();
			}
			
			this.inicializarActualizarBindingBotonesManualPerfil(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPerfil() {
		this.jButtonNuevoPerfil.setVisible(this.isPermisoNuevoPerfil);			
		this.jButtonDuplicarPerfil.setVisible(this.isPermisoDuplicarPerfil);			
		this.jButtonCopiarPerfil.setVisible(this.isPermisoCopiarPerfil);			
		this.jButtonVerFormPerfil.setVisible(this.isPermisoVerFormPerfil);			
		
		this.jButtonAbrirOrderByPerfil.setVisible(this.isPermisoOrdenPerfil);					
		
		this.jButtonNuevoRelacionesPerfil.setVisible(this.isPermisoNuevoPerfil);			
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonModificarPerfil.setVisible(this.isPermisoActualizarPerfil);	
			this.jInternalFrameDetalleFormPerfil.jButtonActualizarPerfil.setVisible(this.isPermisoActualizarPerfil);	
			this.jInternalFrameDetalleFormPerfil.jButtonEliminarPerfil.setVisible(this.isPermisoEliminarPerfil);
			this.jInternalFrameDetalleFormPerfil.jButtonCancelarPerfil.setVisible(this.isVisibilidadCeldaCancelarPerfil);						
			this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.setVisible(this.isPermisoGuardarCambiosPerfil);							
		}
		
		this.jButtonGuardarCambiosTablaPerfil.setVisible(this.isPermisoActualizarPerfil);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePerfil() {
		this.jInternalFrameDetalleFormPerfil.jButtonModificarPerfil.setVisible(this.isPermisoActualizarPerfil);	
		this.jInternalFrameDetalleFormPerfil.jButtonActualizarPerfil.setVisible(this.isPermisoActualizarPerfil);	
		this.jInternalFrameDetalleFormPerfil.jButtonEliminarPerfil.setVisible(this.isPermisoEliminarPerfil);
		this.jInternalFrameDetalleFormPerfil.jButtonCancelarPerfil.setVisible(this.isVisibilidadCeldaCancelarPerfil);							
		this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.setVisible((this.isVisibilidadCeldaGuardarPerfil && this.isPermisoGuardarCambiosPerfil));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPerfil() {
		if(PerfilJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPerfil();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPerfil() {
	}
	
	public void jTableDatosPerfilListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPerfil(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPerfilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfil==null) {
						this.perfil = new Perfil();
					}

					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				}

				if(this.perfil.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.perfil.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sistemaPerfilUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWebPerfil(SistemaConstantesFunciones.CLASSNAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfil.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfil.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);

				this.sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sistemaBeanSwingJInternalFrame.getSistemaLogic().setConnexion(this.perfilLogic.getConnexion());

				if(this.perfil.getid_sistema()!=null) {
					this.sistemaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJInternalFrame.setIdActual(this.perfil.getid_sistema());
					this.sistemaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.inicializarActualizarBindingTablaSistema();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfil=(TitledBorder)this.jScrollPanelDatosPerfil.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJInternalFrame.jScrollPanelDatosSistema.getBorder();

				titledBordersistema.setTitle(titledBorderPerfil.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sistemaPerfilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfil==null) {
						this.perfil = new Perfil();
					}

					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				}

				if(this.perfil.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.perfil.getid_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPerfilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfil==null) {
						this.perfil = new Perfil();
					}

					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				}

				if(this.perfil.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.perfil.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePerfilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfil==null) {
						this.perfil = new Perfil();
					}

					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				}

				if(this.perfil.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.perfil.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre2PerfilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfil==null) {
						this.perfil = new Perfil();
					}

					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				}

				if(this.perfil.getnombre2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre2 like '%"+this.perfil.getnombre2()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPerfilBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfil.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfil(this.getperfil(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfil==null) {
						this.perfil = new Perfil();
					}

					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);
				}

				if(this.perfil.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.perfil.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfil(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombrePerfilActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfil(false,false);

			this.getPerfilsBusquedaPorNombre();

			this.inicializarActualizarBindingPerfil(false);

			//if(PerfilBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfil(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombre2PerfilActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfil(false,false);

			this.getPerfilsBusquedaPorNombre2();

			this.inicializarActualizarBindingPerfil(false);

			//if(PerfilBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfil(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSistemaPerfilActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfil(false,false);

			this.getPerfilsFK_IdSistema();

			this.inicializarActualizarBindingPerfil(false);

			//if(PerfilBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfil(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePerfil() {
		if(this.jInternalFrameDetalleFormPerfil!=null) {
		

		if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
			this.jInternalFrameDetalleFormPerfil.setVisible(false);	    			
			this.jInternalFrameDetalleFormPerfil.dispose();
			this.jInternalFrameDetalleFormPerfil=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPerfil!=null) {
			this.jInternalFrameReporteDinamicoPerfil.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPerfil.dispose();
			this.jInternalFrameReporteDinamicoPerfil=null;
		}
		
		if(this.jInternalFrameImportacionPerfil!=null) {
			this.jInternalFrameImportacionPerfil.setVisible(false);	    			
			this.jInternalFrameImportacionPerfil.dispose();
			this.jInternalFrameImportacionPerfil=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPerfil();
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			
			if(sTipo.equals("NuevoPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPerfil")) {
				jButtonDuplicarPerfilActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPerfil")) {
				jButtonCopiarPerfilActionPerformed(evt);
			} else if(sTipo.equals("VerFormPerfil")) {
				jButtonVerFormPerfilActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPerfil")) {
				jButtonDuplicarPerfilActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPerfil")) {
				jButtonDuplicarPerfilActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPerfil")) {
				jButtonModificarPerfilActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPerfil")) {
				jButtonModificarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPerfil")) {
				jButtonModificarPerfilActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPerfil")) {
				jButtonActualizarPerfilActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPerfil")) {
				jButtonActualizarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPerfil")) {
				jButtonActualizarPerfilActionPerformed(evt);
			} else if(sTipo.equals("EliminarPerfil")) {
				jButtonEliminarPerfilActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPerfil")) {
				jButtonEliminarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPerfil")) {
				jButtonEliminarPerfilActionPerformed(evt);
			} else if(sTipo.equals("CancelarPerfil")) {
				jButtonCancelarPerfilActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPerfil")) {
				jButtonCancelarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPerfil")) {
				jButtonCancelarPerfilActionPerformed(evt);
			} else if(sTipo.equals("CerrarPerfil")) {
				jButtonCerrarPerfilActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPerfil")) {
				jButtonCerrarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPerfil")) {
				jButtonCerrarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPerfil")) {
				jButtonMostrarOcultarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPerfil")) {
				jButtonCancelarPerfilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPerfil")) {
				jButtonCopiarPerfilActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPerfil")) {
				jButtonVerFormPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPerfil")) {
				jButtonCopiarPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPerfil")) {
				jButtonVerFormPerfilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPerfil")) {
				jButtonRecargarInformacionPerfilActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPerfil")) {
				jButtonRecargarInformacionPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPerfil")) {
				jButtonRecargarInformacionPerfilActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPerfil")) {
				jButtonAnterioresPerfilActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPerfil")) {
				jButtonAnterioresPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePerfil")) {
				jButtonAnterioresPerfilActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPerfil")) {
				jButtonSiguientesPerfilActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPerfil")) {
				jButtonSiguientesPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPerfil")) {
				jButtonSiguientesPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPerfil") || sTipo.equals("MenuItemDetalleAbrirOrderByPerfil")) {
				jButtonAbrirOrderByPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPerfil") || sTipo.equals("MenuItemDetalleMostrarOcultarPerfil")) {
				jButtonMostrarOcultarPerfilActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPerfil")) {
				jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPerfil")) {
				jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPerfil")) {
				jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPerfil")) {
				jButtonCerrarReporteDinamicoPerfilActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPerfil")) {
				jButtonGenerarReporteDinamicoPerfilActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPerfil")) {
				
				jButtonGenerarExcelReporteDinamicoPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPerfil")) {
				jButtonCerrarImportacionPerfilActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPerfil")) {
				
				jButtonGenerarImportacionPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPerfil")) {
				
				jButtonAbrirImportacionPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPerfil")) {
				jComboBoxTiposAccionesPerfilActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPerfil")) {
				jComboBoxTiposRelacionesPerfilActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPerfil")) {
				jComboBoxTiposAccionesPerfilActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPerfil")) {
				
				jComboBoxTiposSeleccionarPerfilActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPerfil")) {
				jTextFieldValorCampoGeneralPerfilActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPerfil")) {
				jButtonAbrirOrderByPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPerfil")) {
				jButtonAbrirOrderByPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPerfil")) {
				jButtonCerrarOrderByPerfilActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilBusqueda")) {
				this.jButtonidPerfilBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaPerfilUpdate")) {
				this.jButtonid_sistemaPerfilUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaPerfilBusqueda")) {
				this.jButtonid_sistemaPerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPerfilBusqueda")) {
				this.jButtoncodigoPerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePerfilBusqueda")) {
				this.jButtonnombrePerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre2PerfilBusqueda")) {
				this.jButtonnombre2PerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilBusqueda")) {
				this.jButtonestadoPerfilBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombrePerfil")) {
				this.jButtonBusquedaPorNombrePerfilActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombre2Perfil")) {
				this.jButtonBusquedaPorNombre2PerfilActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSistemaPerfil")) {
				this.jButtonFK_IdSistemaPerfilActionPerformed(evt);
			}
			
			;
			
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPerfil();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Perfil perfilLocal=null;
			
			if(!this.getEsControlTabla()) {
				perfilLocal=this.perfil;
			} else {
				perfilLocal=this.perfilAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
							
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
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
			
			


			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
								
						
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
								
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
							
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
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
			
			


			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
								
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPerfil")) {
					jCheckBoxSeleccionarTodosPerfilItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPerfil")) {
					jCheckBoxSeleccionadosPerfilItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPerfil")) {
					
				}
				
				


				
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
												
				
				


				
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
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
			
			


			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfil);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfil);
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
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
				
				


				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Perfil.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Perfil.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilAnterior =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilAnterior =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPerfil")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPerfilListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPerfil.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.perfil =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.perfil =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.perfil);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPerfil")) {
				
				}
				
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPerfil")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPerfil.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPerfil")) {
			
			}
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPerfil();
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			if(sTipo.equals("NuevoPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPerfil")) {
				jButtonDuplicarPerfilActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPerfil")) {
				jButtonCopiarPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPerfil")) {
				jButtonVerFormPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPerfil")) {
				jButtonNuevoPerfilActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPerfil")) {
				jButtonModificarPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPerfil")) {
				jButtonActualizarPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPerfil")) {
				jButtonEliminarPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPerfil")) {
				jButtonCancelarPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPerfil")) {
				jButtonCerrarPerfilActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPerfil")) {
				jButtonGuardarCambiosPerfilActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPerfil")) {
				jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPerfil")) {
				jButtonAbrirOrderByPerfilActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPerfil")) {
				jButtonRecargarInformacionPerfilActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPerfil")) {
				jButtonAnterioresPerfilActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPerfil")) {
				jButtonSiguientesPerfilActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilBusqueda")) {
				this.jButtonidPerfilBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaPerfilUpdate")) {
				this.jButtonid_sistemaPerfilUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaPerfilBusqueda")) {
				this.jButtonid_sistemaPerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPerfilBusqueda")) {
				this.jButtoncodigoPerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePerfilBusqueda")) {
				this.jButtonnombrePerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre2PerfilBusqueda")) {
				this.jButtonnombre2PerfilBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilBusqueda")) {
				this.jButtonestadoPerfilBusquedaActionPerformed(evt);
			}
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPerfil();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePerfil")) {
				closingInternalFramePerfil();
				
			} else if(sTipo.equals("jButtonCancelarPerfil")) {
				JInternalFrameBase jInternalFrameDetalleFormPerfil = (JInternalFrameBase)evt.getSource();
	            	
	            PerfilBeanSwingJInternalFrame jInternalFrameParent=(PerfilBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfil.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPerfilActionPerformed(null);
			}
			
			PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfil,new Object(),this.perfilParameterGeneral,this.perfilReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPerfil(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPerfil(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPerfil(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.perfil)) {
			if(!esControlTabla) {
				if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);			
				}
				
				if(this.perfilSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPerfil(this.perfil,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilReturnGeneral=perfilLogic.procesarEventosPerfilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilLogic.getPerfils(),this.perfil,this.perfilParameterGeneral,this.isEsNuevoPerfil,classes);//this.perfilLogic.getPerfil()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPerfil(this.perfilReturnGeneral,this.perfilBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.perfilSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPerfil(classes,this.perfilReturnGeneral,this.perfilBean,false);
					}
						
					if(this.perfilReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPerfil(this.perfilReturnGeneral.getPerfil());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPerfil(this.perfilReturnGeneral.getPerfil());	
					}
						
					if(this.perfilReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPerfil(this.perfilReturnGeneral.getPerfil(),classes);//this.perfilBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPerfil(this.perfil,classes);//this.perfilBean);									
				}
			
				if(PerfilJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPerfil(this.perfil,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfil(this.perfil);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.perfilAnterior!=null) {
						this.perfil=this.perfilAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilReturnGeneral=perfilLogic.procesarEventosPerfilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilLogic.getPerfils(),this.perfil,this.perfilParameterGeneral,this.isEsNuevoPerfil,classes);//this.perfilLogic.getPerfil()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.perfilReturnGeneral.getPerfil(),perfilLogic.getPerfils());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.perfilReturnGeneral.getPerfil(),this.perfils);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPerfil.repaint();
				
				//((AbstractTableModel) this.jTableDatosPerfil.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPerfil();
			}
		}
	}
	
	public void actualizarVisualTableDatosPerfil() throws Exception {
		
		PerfilModel perfilModel=(PerfilModel)this.jTableDatosPerfil.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilModel.perfils=this.perfilLogic.getPerfils();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			perfilModel.perfils=this.perfils;
		}
		
		
		((PerfilModel) this.jTableDatosPerfil.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPerfil() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperfilAnterior(),this.perfilLogic.getPerfils());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperfilAnterior(),this.perfils);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPerfil();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPerfil(Perfil perfil,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(perfil.getUsuarioOpcions());
					this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilUsuario.class)) {
					this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.setPerfilUsuarios(perfil.getPerfilUsuarios());
					this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilUsuario(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(perfil.getPerfilOpcions());
					this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
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
										
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfil,new Object(),generalEntityParameterGeneral,this.perfilReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.perfilSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PerfilConstantesFunciones.getClassesRelationshipsOfPerfil(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PerfilConstantesFunciones.getClassesRelationshipsFromStringsOfPerfil(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPerfil(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PerfilBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfil,new Object(),generalEntityParameterGeneral,this.perfilReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPerfil(PerfilBean perfilBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(perfil.getUsuarioOpcions());
					this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilUsuario.class)) {
					this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.setPerfilUsuarios(perfil.getPerfilUsuarios());
					this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilUsuario(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(perfil.getPerfilOpcions());
					this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPerfil(ArrayList<Classe> classes,PerfilReturnGeneral perfilReturnGeneral,PerfilBean perfilBean,Boolean conDefault) throws Exception {
		
			this.perfilBean.setUsuarioOpcions(perfilReturnGeneral.getPerfil().getUsuarioOpcions());
			this.perfilBean.setPerfilUsuarios(perfilReturnGeneral.getPerfil().getPerfilUsuarios());
			this.perfilBean.setPerfilOpcions(perfilReturnGeneral.getPerfil().getPerfilOpcions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPerfil(Perfil perfil,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					perfil.setUsuarioOpcions(this.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilUsuario.class)) {
					perfil.setPerfilUsuarios(this.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.perfilusuarioLogic.getPerfilUsuarios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					perfil.setPerfilOpcions(this.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.perfil)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPerfil = new PerfilDetalleFormJInternalFrame(jDesktopPane,this.perfilSessionBean.getConGuardarRelaciones(),this.perfilSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfil);
		this.jInternalFrameDetalleFormPerfil.setVisible(false);
		this.jInternalFrameDetalleFormPerfil.setSelected(false);						
		
		this.jInternalFrameDetalleFormPerfil.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPerfil.perfilLogic=this.perfilLogic;
		
		this.cargarCombosFrameForeignKeyPerfil("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePerfil();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfil();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPerfil("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPerfil();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPerfil.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfil"));
		
		this.jInternalFrameDetalleFormPerfil.jButtonModificarPerfil.addActionListener(new ButtonActionListener(this,"ModificarPerfil"));

		
		this.jInternalFrameDetalleFormPerfil.jButtonModificarToolBarPerfil.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfil"));
					
		this.jInternalFrameDetalleFormPerfil.jMenuItemModificarPerfil.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfil"));		
		
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonActualizarPerfil.addActionListener (new ButtonActionListener(this,"ActualizarPerfil"));
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonActualizarToolBarPerfil.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfil"));
						
		this.jInternalFrameDetalleFormPerfil.jMenuItemActualizarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfil"));		
		
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonEliminarPerfil.addActionListener (new ButtonActionListener(this,"EliminarPerfil"));
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonEliminarToolBarPerfil.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfil"));
								
		this.jInternalFrameDetalleFormPerfil.jMenuItemEliminarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfil"));		
		
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonCancelarPerfil.addActionListener (new ButtonActionListener(this,"CancelarPerfil"));
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonCancelarToolBarPerfil.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfil"));
					
		this.jInternalFrameDetalleFormPerfil.jMenuItemCancelarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfil"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPerfil.jMenuItemDetalleCerrarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfil"));		
		
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosToolBarPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfil"));
		
		
		
		this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosToolBarPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfil"));
		
		
		
		this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfil"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonidPerfilBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfil.jButtonid_sistemaPerfilUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonid_sistemaPerfilBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtoncodigoPerfilBusqueda.addActionListener(new ButtonActionListener(this,"codigoPerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonnombrePerfilBusqueda.addActionListener(new ButtonActionListener(this,"nombrePerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonnombre2PerfilBusqueda.addActionListener(new ButtonActionListener(this,"nombre2PerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonestadoPerfilBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfil"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePerfil"));
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfil"));
		}
		
		this.jTableDatosPerfil.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPerfil"));
		
		this.jTableDatosPerfil.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPerfil"));
		
		this.jButtonNuevoPerfil.addActionListener(new ButtonActionListener(this,"NuevoPerfil"));
		
		this.jButtonDuplicarPerfil.addActionListener(new ButtonActionListener(this,"DuplicarPerfil"));
		
		this.jButtonCopiarPerfil.addActionListener(new ButtonActionListener(this,"CopiarPerfil"));
		
		this.jButtonVerFormPerfil.addActionListener(new ButtonActionListener(this,"VerFormPerfil"));
		
		
		this.jButtonNuevoToolBarPerfil.addActionListener(new ButtonActionListener(this,"NuevoToolBarPerfil"));
			
		this.jButtonDuplicarToolBarPerfil.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPerfil"));
			
		this.jMenuItemNuevoPerfil.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPerfil"));
			
		this.jMenuItemDuplicarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPerfil"));		
		
		
		this.jButtonNuevoRelacionesPerfil.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPerfil"));
		
		
		this.jButtonNuevoRelacionesToolBarPerfil.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPerfil"));
			
		this.jMenuItemNuevoRelacionesPerfil.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPerfil"));		
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonModificarPerfil.addActionListener(new ButtonActionListener(this,"ModificarPerfil"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonModificarToolBarPerfil.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfil"));
			
			this.jInternalFrameDetalleFormPerfil.jMenuItemModificarPerfil.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPerfil.jButtonActualizarPerfil.addActionListener (new ButtonActionListener(this,"ActualizarPerfil"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonActualizarToolBarPerfil.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfil"));
				
			this.jInternalFrameDetalleFormPerfil.jMenuItemActualizarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonEliminarPerfil.addActionListener (new ButtonActionListener(this,"EliminarPerfil"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonEliminarToolBarPerfil.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfil"));
						
			this.jInternalFrameDetalleFormPerfil.jMenuItemEliminarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonCancelarPerfil.addActionListener (new ButtonActionListener(this,"CancelarPerfil"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonCancelarToolBarPerfil.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfil"));
			
			this.jInternalFrameDetalleFormPerfil.jMenuItemCancelarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfil"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPerfil.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPerfil"));		
		
		
		this.jButtonCerrarPerfil.addActionListener (new ButtonActionListener(this,"CerrarPerfil"));
		
		
		this.jButtonCerrarToolBarPerfil.addActionListener (new ButtonActionListener(this,"CerrarToolBarPerfil"));
			
		this.jMenuItemCerrarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPerfil"));
			
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jMenuItemDetalleCerrarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfil"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosPerfil"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosToolBarPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfil"));
		}
		
		this.jButtonCopiarToolBarPerfil.addActionListener (new ButtonActionListener(this,"CopiarToolBarPerfil"));
			
		this.jButtonVerFormToolBarPerfil.addActionListener (new ButtonActionListener(this,"VerFormToolBarPerfil"));
		
		this.jMenuItemGuardarCambiosPerfil.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPerfil"));
			
		this.jMenuItemCopiarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPerfil"));		
		
		this.jMenuItemVerFormPerfil.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPerfil"));		
		
		
		this.jButtonGuardarCambiosTablaPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfil"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPerfil"));
			
		this.jMenuItemGuardarCambiosTablaPerfil.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfil"));		
		
		
		
		this.jButtonRecargarInformacionPerfil.addActionListener (new ButtonActionListener(this,"RecargarInformacionPerfil"));
					
		this.jButtonRecargarInformacionToolBarPerfil.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPerfil"));
		
		this.jMenuItemRecargarInformacionPerfil.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPerfil"));		
		
		
		
		this.jButtonAnterioresPerfil.addActionListener (new ButtonActionListener(this,"AnterioresPerfil"));
		
		
		this.jButtonAnterioresToolBarPerfil.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPerfil"));
		
		this.jMenuItemAnterioresPerfil.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPerfil"));		
		
		
		this.jButtonSiguientesPerfil.addActionListener (new ButtonActionListener(this,"SiguientesPerfil"));
		
		
		this.jButtonSiguientesToolBarPerfil.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPerfil"));
			
		this.jMenuItemSiguientesPerfil.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPerfil"));
			
		this.jMenuItemAbrirOrderByPerfil.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPerfil"));
			
		this.jMenuItemMostrarOcultarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPerfil"));
			
		this.jMenuItemDetalleAbrirOrderByPerfil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPerfil"));
			
		this.jMenuItemDetalleMostarOcultarPerfil.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPerfil"));		
		
		
		this.jButtonNuevoGuardarCambiosPerfil.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPerfil"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfil.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPerfil"));
			
		this.jMenuItemNuevoGuardarCambiosPerfil.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPerfil"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPerfil.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPerfil"));

		this.jCheckBoxSeleccionadosPerfil.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPerfil"));
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfil"));
		}
		
		
		this.jComboBoxTiposRelacionesPerfil.addActionListener (new ButtonActionListener(this,"TiposRelacionesPerfil"));
			
		this.jComboBoxTiposAccionesPerfil.addActionListener (new ButtonActionListener(this,"TiposAccionesPerfil"));
					
		this.jComboBoxTiposSeleccionarPerfil.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPerfil"));
			
		this.jTextFieldValorCampoGeneralPerfil.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPerfil"));		
		
		
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonidPerfilBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfil.jButtonid_sistemaPerfilUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonid_sistemaPerfilBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtoncodigoPerfilBusqueda.addActionListener(new ButtonActionListener(this,"codigoPerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonnombrePerfilBusqueda.addActionListener(new ButtonActionListener(this,"nombrePerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonnombre2PerfilBusqueda.addActionListener(new ButtonActionListener(this,"nombre2PerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonestadoPerfilBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombrePerfil.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePerfil"));

			this.jButtonBusquedaPorNombre2Perfil.addActionListener(new ButtonActionListener(this,"BusquedaPorNombre2Perfil"));

			this.jButtonFK_IdSistemaPerfil.addActionListener(new ButtonActionListener(this,"FK_IdSistemaPerfil"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPerfil!=null) {
				this.jInternalFrameReporteDinamicoPerfil.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfil"));
				this.jInternalFrameReporteDinamicoPerfil.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfil"));
				this.jInternalFrameReporteDinamicoPerfil.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfil"));
			}
			
			//this.jButtonCerrarReporteDinamicoPerfil.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfil"));				
			//this.jButtonGenerarReporteDinamicoPerfil.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfil"));
			//this.jButtonGenerarExcelReporteDinamicoPerfil.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfil"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPerfil!=null) {
				this.jInternalFrameImportacionPerfil.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfil"));
				this.jInternalFrameImportacionPerfil.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfil"));
				this.jInternalFrameImportacionPerfil.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfil"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPerfil.addActionListener (new ButtonActionListener(this,"AbrirOrderByPerfil"));
			
			this.jButtonAbrirOrderByToolBarPerfil.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPerfil"));			
			
			if(this.jInternalFrameOrderByPerfil!=null) {
				this.jInternalFrameOrderByPerfil.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfil"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPerfil!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfil.jTabbedPaneRelacionesPerfil.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfil"));
		
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
            		closingInternalFramePerfil();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPerfil.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPerfil = (JInternalFrameBase)event.getSource();
	            	
	            PerfilBeanSwingJInternalFrame jInternalFrameParent=(PerfilBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfil.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPerfilActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPerfil.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPerfilListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPerfil.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPerfil.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPerfil";
		inputMap = this.jButtonNuevoPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPerfil";
		inputMap = this.jButtonNuevoRelacionesPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPerfil";
		inputMap = this.jButtonModificarPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPerfilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPerfil";
		inputMap = this.jButtonActualizarPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPerfilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPerfil";
		inputMap = this.jButtonEliminarPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPerfilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPerfil";
		inputMap = this.jButtonCancelarPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPerfilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPerfil";
		inputMap = this.jButtonCerrarPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPerfilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPerfil";
		inputMap = this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPerfil.jButtonGuardarCambiosPerfil.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPerfilActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPerfil.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPerfilItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPerfil.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPerfilActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPerfil.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPerfilActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPerfil.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPerfilActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonidPerfilBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfil.jButtonid_sistemaPerfilUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonid_sistemaPerfilBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtoncodigoPerfilBusqueda.addActionListener(new ButtonActionListener(this,"codigoPerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonnombrePerfilBusqueda.addActionListener(new ButtonActionListener(this,"nombrePerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonnombre2PerfilBusqueda.addActionListener(new ButtonActionListener(this,"nombre2PerfilBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfil.jButtonestadoPerfilBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilBusqueda"));
		
		
		this.jButtonBusquedaPorNombrePerfil.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePerfil"));

		this.jButtonBusquedaPorNombre2Perfil.addActionListener(new ButtonActionListener(this,"BusquedaPorNombre2Perfil"));

		this.jButtonFK_IdSistemaPerfil.addActionListener(new ButtonActionListener(this,"FK_IdSistemaPerfil"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPerfil.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPerfilActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPerfilActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPerfil.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPerfil(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
					perfilAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Perfil perfilAux:perfils) {
					perfilAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPerfilItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfil(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
						perfilAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Perfil perfilAux:perfils) {
						perfilAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
					
						if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Perfil perfilAux:perfils) {
						
						if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPerfil(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfil.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfil.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfil,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPerfilItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfil(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPerfil.getSelectedRows();
			
			Perfil perfilLocal=new Perfil();
			
			//this.seleccionarTodosPerfil(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLocal =(Perfil) this.perfilLogic.getPerfils().toArray()[this.jTableDatosPerfil.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					perfilLocal =(Perfil) this.perfils.toArray()[this.jTableDatosPerfil.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				perfilLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
						perfilAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Perfil perfilAux:perfils) {
						perfilAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPerfil(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfil.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfil.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfil,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPerfilItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPerfilParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPerfilActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPerfil(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPerfil.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Perfil perfilAux:this.perfilLogic.getPerfils()) {
				
						if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							perfilAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							perfilAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_NOMBRE2)) {
							existe=true;
							perfilAux.setnombre2(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Perfil perfilAux:perfils) {
					
						if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							perfilAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							perfilAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_NOMBRE2)) {
							existe=true;
							perfilAux.setnombre2(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPerfil(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPerfilActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPerfil(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPerfil=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPerfil.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePerfil) {				
					conSplash=true;//false;										
					
					//this.startProcessPerfil(conSplash);
				
					this.generarReportePerfilsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPerfilsSeleccionados();
				//this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilsSeleccionados(false);
				//this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilsSeleccionados(true);
				//this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfil();
				
				this.exportarPerfilsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPerfils();
				//this.importarPerfils();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfil();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPerfilsSeleccionados();
				//this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Perfil", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPerfil();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPerfil)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPerfil(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
				}	
			} 			
			else if(PerfilBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePerfil) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPerfil(conSplash);
					
						//this.actualizarParametrosGeneralPerfil();
						
						this.generarReporteProcesoAccionPerfilsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PerfilBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PerfilES SELECCIONADOS?", "MANTENIMIENTO DE Perfil", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPerfil();
				
						this.actualizarParametrosGeneralPerfil();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.perfilReturnGeneral=perfilLogic.procesarAccionPerfilsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.perfilLogic.getPerfils(),this.perfilParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPerfilReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPerfil();
					
					PerfilBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPerfilReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfil.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfil.jComboBoxTiposAccionesFormularioPerfil.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPerfil(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPerfilActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPerfil();
			
			if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
			Perfil perfil=new Perfil();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPerfil(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPerfil.getSelectedItem();
			
			
			
			
			perfilsSeleccionados=this.getPerfilsSeleccionados(true);
			//this.sTipoAccion;
			
			if(perfilsSeleccionados.size()==1) {
				for(Perfil perfilAux:perfilsSeleccionados) {
					perfil=perfilAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Usuario Opcion")) {
					jButtonUsuarioOpcionActionPerformed(null,rowIndex,true,false,perfil);
				}
				else if(this.sTipoRelacion.equals("Usuarios Perfiles ")) {
					jButtonPerfilUsuarioActionPerformed(null,rowIndex,true,false,perfil);
				}
				else if(this.sTipoRelacion.equals("Perfil Opcion")) {
					jButtonPerfilOpcionActionPerformed(null,rowIndex,true,false,perfil);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPerfil();
			
      		//this.finishProcessPerfil(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPerfilReturnGeneral() throws Exception {
		if(this.perfilReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.perfilReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.perfilReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.perfilReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.perfilReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.perfilReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPerfil(false);
		}
		
		if(this.perfilReturnGeneral.getConRetornoLista() || this.perfilReturnGeneral.getConRetornoObjeto()) {
			if(this.perfilReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilLogic.setPerfils(this.perfilReturnGeneral.getPerfils());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.perfilReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilLogic.setPerfil(this.perfilReturnGeneral.getPerfil());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPerfil(false);
		}
	}
	
	public void actualizarParametrosGeneralPerfil() throws Exception {
		
		
	}
	
	public ArrayList<Perfil> getPerfilsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPerfil) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Perfil perfilAux:perfilLogic.getPerfils()) {
					if(perfilAux.getIsSelected()) {
						perfilsSeleccionados.add(perfilAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Perfil perfilAux:this.perfils) {
					if(perfilAux.getIsSelected()) {
						perfilsSeleccionados.add(perfilAux);				
					}
				}
			}
			
			if(perfilsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						perfilsSeleccionados.addAll(this.perfilLogic.getPerfils());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						perfilsSeleccionados.addAll(this.perfils);				
					}
				}
			}
		} else {
			perfilsSeleccionados.add(this.perfil);
		}
		
		return perfilsSeleccionados;
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
	
	public void generarReportePerfilsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPerfilsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPerfilsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPerfilsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Perfil",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPerfilsSeleccionados() throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePerfils("Todos",perfilsSeleccionados);
		
	}	
	
	public void generarReporteNormalPerfilsSeleccionados() throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePerfils("Todos",perfilsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPerfilsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePerfils("Todos",perfilsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPerfilsSeleccionados() throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPerfil();
		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPerfil();
		
		
		//this.generarReportePerfils("Todos",perfilsSeleccionados ,perfilImplementable,perfilImplementableHome);
	}
	
	public void mostrarImportacionPerfils() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPerfil();
		
		this.abrirFrameImportacionPerfil();		
		
			
		//this.generarReportePerfils("Todos",perfilsSeleccionados ,perfilImplementable,perfilImplementableHome);
	}
	
	public void importarPerfils() throws Exception {		
	
	}
	
	public void exportarPerfilsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPerfilsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPerfilsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPerfilsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Perfil",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPerfilsSeleccionados() throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPerfil(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Perfil perfilAux:perfilsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPerfil(perfilAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//perfilAux.setsDetalleGeneralEntityReporte(perfilAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPerfil(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_NOMBRE2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPerfil(Perfil perfil,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=perfil.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=perfil.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfil.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfil.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfil.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfil.getnombre2();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfil.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPerfilsSeleccionados() throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Perfils");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPerfil(row);				
				iRow++;
			}				
			
			for(Perfil perfilAux:perfilsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPerfil(perfilAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPerfilsSeleccionados() throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();		
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfil.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("perfils");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("perfil");
			//elementRoot.appendChild(element);
		
			for(Perfil perfilAux:perfilsSeleccionados) {
				element = document.createElement("perfil");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPerfil(perfilAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPerfil(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_IDSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_NOMBRE2);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPerfil(Perfil perfil,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(perfil.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(perfil.getsistema_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfil.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(perfil.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(perfil.getnombre2());
		cell = row.createCell(iColumn++);cell.setCellValue(perfil.getestado());				
	}
	
	public void setFilaDatosExportarXmlPerfil(Perfil perfil,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PerfilConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(perfil.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PerfilConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(perfil.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(PerfilConstantesFunciones.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(perfil.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementcodigo = document.createElement(PerfilConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(perfil.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PerfilConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(perfil.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre2 = document.createElement(PerfilConstantesFunciones.NOMBRE2);
		elementnombre2.appendChild(document.createTextNode(perfil.getnombre2().trim()));
		element.appendChild(elementnombre2);

		Element elementestado = document.createElement(PerfilConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(perfil.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoPerfilsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Perfil> perfilsSeleccionados=new ArrayList<Perfil>();
		
		perfilsSeleccionados=this.getPerfilsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPerfil(perfilsSeleccionados);
		
		this.generarReportePerfils("Todos",perfilsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPerfil(ArrayList<Perfil> perfilsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Perfil perfilAux:perfilsSeleccionados) {
				perfilAux.setsDetalleGeneralEntityReporte(perfilAux.toString());
			
				if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_IDSISTEMA)) {
					existe=true;
					perfilAux.setsDescripcionGeneralEntityReporte1(perfilAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					perfilAux.setsDescripcionGeneralEntityReporte1(perfilAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					perfilAux.setsDescripcionGeneralEntityReporte1(perfilAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_NOMBRE2)) {
					existe=true;
					perfilAux.setsDescripcionGeneralEntityReporte1(perfilAux.getnombre2());
				}
				 else if(sTipoSeleccionar.equals(PerfilConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					perfilAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPerfil(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPerfil=true;
				this.isVisibilidadCeldaNuevoRelacionesPerfil=true;
				this.isVisibilidadCeldaGuardarCambiosPerfil=true;
			}
			
			this.isVisibilidadCeldaModificarPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=false;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
			this.isVisibilidadCeldaModificarPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=true;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
			this.isVisibilidadCeldaModificarPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=true;
			this.isVisibilidadCeldaEliminarPerfil=true;
			this.isVisibilidadCeldaCancelarPerfil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
			this.isVisibilidadCeldaModificarPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=true;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPerfil=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=true;
			this.isVisibilidadCeldaGuardarCambiosPerfil=true;
			this.isVisibilidadCeldaModificarPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=false;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
			this.isVisibilidadCeldaActualizarPerfil=false;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
			this.isVisibilidadCeldaModificarPerfil=true;
			this.isVisibilidadCeldaActualizarPerfil=false;
			this.isVisibilidadCeldaEliminarPerfil=false;
			this.isVisibilidadCeldaCancelarPerfil=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfil=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfil=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PerfilJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPerfil=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfil=true;
			this.isVisibilidadCeldaGuardarCambiosPerfil=true;
		} else {
			this.actualizarEstadoPanelsPerfil(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPerfil=false;
			//this.isVisibilidadCeldaVerFormPerfil=false;
			this.isVisibilidadCeldaDuplicarPerfil=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!perfilSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
		} else {
			this.isVisibilidadCeldaNuevoPerfil=false;
			this.isVisibilidadCeldaGuardarCambiosPerfil=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(perfilSessionBean.getEsGuardarRelacionado()) {
			if(!perfilSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPerfil=false;												
			}
			
			this.jButtonCerrarPerfil.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPerfil=false;
		}
		
		if(!this.permiteMantenimiento(this.perfil)) {
			this.isVisibilidadCeldaActualizarPerfil=false;
			this.isVisibilidadCeldaEliminarPerfil=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPerfil() {
		this.isVisibilidadCeldaNuevoPerfil=false;
		this.isVisibilidadCeldaGuardarCambiosPerfil=false;
	}
	
	public void actualizarEstadoPanelsPerfil(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPerfil!=null) {
				this.jScrollPanelDatosEdicionPerfil.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfil!=null) {
				this.jScrollPanelDatosPerfil.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfil!=null) {
				this.jPanelPaginacionPerfil.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.perfilSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPerfil!=null) {
					this.jTabbedPaneBusquedasPerfil.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.perfilSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfil!=null) {
				this.jTabbedPaneBusquedasPerfil.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPerfil!=null) {
				this.jPanelParametrosReportesPerfil.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibilidadBusquedaPorNombre=isParaSistemaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPerfil.remove(jPanelBusquedaPorNombrePerfil);}

			this.isVisibilidadBusquedaPorNombre2=isParaSistemaNegation;
			if(!this.isVisibilidadBusquedaPorNombre2) {this.jTabbedPaneBusquedasPerfil.remove(jPanelBusquedaPorNombre2Perfil);}

			this.isVisibilidadFK_IdSistema=isParaSistema;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasPerfil.remove(jPanelFK_IdSistemaPerfil);}
		}
		
	}
	
	

	public String registrarSesionPerfilParaPerfilOpciones() throws Exception {
		Boolean isPaginaPopupPerfilOpcion=false;

		try {

			if(this.perfilSessionBean==null) {
				this.perfilSessionBean=new PerfilSessionBean();
			}

			if(this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean==null) {
				this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setsPathNavegacionActual(perfilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilOpcion=this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfilOpcion(false);
			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilOpcion(PerfilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionPerfil(true);
			this.jInternalFrameDetalleFormPerfil.perfilopcionSessionBean.setlidPerfilActual(this.idPerfilActual);

			perfilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfil(true);
			perfilSessionBean.setlIdPerfilActualForeignKey(this.idPerfilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPerfilParaPerfilUsuarios() throws Exception {
		Boolean isPaginaPopupPerfilUsuario=false;

		try {

			if(this.perfilSessionBean==null) {
				this.perfilSessionBean=new PerfilSessionBean();
			}

			if(this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean==null) {
				this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
			}

			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setsPathNavegacionActual(perfilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilUsuario=this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfilUsuario(false);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilUsuario(PerfilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setisBusquedaDesdeForeignKeySesionPerfil(true);
			this.jInternalFrameDetalleFormPerfil.perfilusuarioSessionBean.setlidPerfilActual(this.idPerfilActual);

			perfilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfil(true);
			perfilSessionBean.setlIdPerfilActualForeignKey(this.idPerfilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPerfilParaUsuarioOpciones() throws Exception {
		Boolean isPaginaPopupUsuarioOpcion=false;

		try {

			if(this.perfilSessionBean==null) {
				this.perfilSessionBean=new PerfilSessionBean();
			}

			if(this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean==null) {
				this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setsPathNavegacionActual(perfilSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUsuarioOpcion=this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion(false);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion(PerfilConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionPerfil(true);
			this.jInternalFrameDetalleFormPerfil.usuarioopcionSessionBean.setlidPerfilActual(this.idPerfilActual);

			perfilSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfil(true);
			perfilSessionBean.setlIdPerfilActualForeignKey(this.idPerfilActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PerfilSessionBean perfilSessionBean=new PerfilSessionBean();
		
		if(this.perfilSessionBean==null) {
			this.perfilSessionBean=new PerfilSessionBean();
		}
		
		this.perfilSessionBean.setsUltimaBusquedaPerfil(this.getsAccionBusqueda());
		this.perfilSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.perfilSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			perfilSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre2")) {
			perfilSessionBean.setnombre2(this.getnombre2BusquedaPorNombre2());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
			perfilSessionBean.setid_sistema(this.getid_sistemaFK_IdSistema());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PerfilSessionBean perfilSessionBean=new PerfilSessionBean();
		
		if(this.perfilSessionBean==null) {
			this.perfilSessionBean=new PerfilSessionBean();
		}
		
		if(this.perfilSessionBean.getsUltimaBusquedaPerfil()!=null&&!this.perfilSessionBean.getsUltimaBusquedaPerfil().equals("")) {
			this.setsAccionBusqueda(perfilSessionBean.getsUltimaBusquedaPerfil());
			this.setiNumeroPaginacion(perfilSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(perfilSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(perfilSessionBean.getnombre());
				perfilSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre2")) {
				this.setnombre2BusquedaPorNombre2(perfilSessionBean.getnombre2());
				perfilSessionBean.setnombre2("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
				this.setid_sistemaFK_IdSistema(perfilSessionBean.getid_sistema());
				perfilSessionBean.setid_sistema(-1L);
			}
		}
		
		this.perfilSessionBean.setsUltimaBusquedaPerfil("");
		this.perfilSessionBean.setiNumeroPaginacion(PerfilConstantesFunciones.INUMEROPAGINACION);
		this.perfilSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPerfil(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPerfil() {
		this.updateBorderResaltarBusquedasFormularioPerfil();
		this.updateVisibilidadBusquedasFormularioPerfil();
		this.updateHabilitarBusquedasFormularioPerfil();
	}
	
	public void updateBorderResaltarBusquedasFormularioPerfil() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPerfil.getComponents().length>0) {
	

		if(this.perfilConstantesFunciones.resaltarBusquedaPorNombrePerfil!=null) {
			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombrePerfil);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
				jPanel.setBorder(this.perfilConstantesFunciones.resaltarBusquedaPorNombrePerfil);
			}
		}

		if(this.perfilConstantesFunciones.resaltarBusquedaPorNombre2Perfil!=null) {
			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombre2Perfil);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
				jPanel.setBorder(this.perfilConstantesFunciones.resaltarBusquedaPorNombre2Perfil);
			}
		}

		if(this.perfilConstantesFunciones.resaltarFK_IdSistemaPerfil!=null) {
			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelFK_IdSistemaPerfil);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
				jPanel.setBorder(this.perfilConstantesFunciones.resaltarFK_IdSistemaPerfil);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPerfil() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPerfil.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombrePerfil);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilConstantesFunciones.mostrarBusquedaPorNombrePerfil);
			if(!this.perfilConstantesFunciones.mostrarBusquedaPorNombrePerfil && index>-1) {
				this.jTabbedPaneBusquedasPerfil.remove(index);
			}

			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombre2Perfil);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilConstantesFunciones.mostrarBusquedaPorNombre2Perfil);
			if(!this.perfilConstantesFunciones.mostrarBusquedaPorNombre2Perfil && index>-1) {
				this.jTabbedPaneBusquedasPerfil.remove(index);
			}

			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelFK_IdSistemaPerfil);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilConstantesFunciones.mostrarFK_IdSistemaPerfil);
			if(!this.perfilConstantesFunciones.mostrarFK_IdSistemaPerfil && index>-1) {
				this.jTabbedPaneBusquedasPerfil.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPerfil() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPerfil.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombrePerfil);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilConstantesFunciones.activarBusquedaPorNombrePerfil);
				this.jTabbedPaneBusquedasPerfil.setEnabledAt(index,this.perfilConstantesFunciones.activarBusquedaPorNombrePerfil);
			}

			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombre2Perfil);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilConstantesFunciones.activarBusquedaPorNombre2Perfil);
				this.jTabbedPaneBusquedasPerfil.setEnabledAt(index,this.perfilConstantesFunciones.activarBusquedaPorNombre2Perfil);
			}

			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelFK_IdSistemaPerfil);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilConstantesFunciones.activarFK_IdSistemaPerfil);
				this.jTabbedPaneBusquedasPerfil.setEnabledAt(index,this.perfilConstantesFunciones.activarFK_IdSistemaPerfil);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPerfil(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombrePerfil);

			this.jTabbedPaneBusquedasPerfil.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);

			this.perfilConstantesFunciones.setResaltarBusquedaPorNombrePerfil(resaltar);

			jPanel.setBorder(this.perfilConstantesFunciones.resaltarBusquedaPorNombrePerfil);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre2")) {
			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelBusquedaPorNombre2Perfil);

			this.jTabbedPaneBusquedasPerfil.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);

			this.perfilConstantesFunciones.setResaltarBusquedaPorNombre2Perfil(resaltar);

			jPanel.setBorder(this.perfilConstantesFunciones.resaltarBusquedaPorNombre2Perfil);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSistema")) {
			index= this.jTabbedPaneBusquedasPerfil.indexOfComponent(this.jPanelFK_IdSistemaPerfil);

			this.jTabbedPaneBusquedasPerfil.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfil.getComponent(index);

			this.perfilConstantesFunciones.setResaltarFK_IdSistemaPerfil(resaltar);

			jPanel.setBorder(this.perfilConstantesFunciones.resaltarFK_IdSistemaPerfil);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPerfil.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPerfil() throws Exception {

		if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPerfil();
		this.updateVisibilidadResaltarControlesFormularioPerfil();
		this.updateHabilitarResaltarControlesFormularioPerfil();
		
	}
	
	public void updateBorderResaltarControlesFormularioPerfil() throws Exception {
		if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.perfilConstantesFunciones.resaltaridPerfil!=null && this.jInternalFrameDetalleFormPerfil!=null) {this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setBorder(this.perfilConstantesFunciones.resaltaridPerfil);}
		if(this.perfilConstantesFunciones.resaltarid_sistemaPerfil!=null && this.jInternalFrameDetalleFormPerfil!=null) {this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setBorder(this.perfilConstantesFunciones.resaltarid_sistemaPerfil);}
		if(this.perfilConstantesFunciones.resaltarcodigoPerfil!=null && this.jInternalFrameDetalleFormPerfil!=null) {this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setBorder(this.perfilConstantesFunciones.resaltarcodigoPerfil);}
		if(this.perfilConstantesFunciones.resaltarnombrePerfil!=null && this.jInternalFrameDetalleFormPerfil!=null) {this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setBorder(this.perfilConstantesFunciones.resaltarnombrePerfil);}
		if(this.perfilConstantesFunciones.resaltarnombre2Perfil!=null && this.jInternalFrameDetalleFormPerfil!=null) {this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setBorder(this.perfilConstantesFunciones.resaltarnombre2Perfil);}
		if(this.perfilConstantesFunciones.resaltarestadoPerfil!=null && this.jInternalFrameDetalleFormPerfil!=null) {this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setBorderPainted(true);this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setBorder(this.perfilConstantesFunciones.resaltarestadoPerfil);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPerfil() throws Exception {		
		if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
	
		//this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setVisible(this.perfilConstantesFunciones.mostraridPerfil);
		this.jInternalFrameDetalleFormPerfil.jPanelidPerfil.setVisible(this.perfilConstantesFunciones.mostraridPerfil);
		//this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setVisible(this.perfilConstantesFunciones.mostrarid_sistemaPerfil);
		this.jInternalFrameDetalleFormPerfil.jPanelid_sistemaPerfil.setVisible(this.perfilConstantesFunciones.mostrarid_sistemaPerfil);
		//this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setVisible(this.perfilConstantesFunciones.mostrarcodigoPerfil);
		this.jInternalFrameDetalleFormPerfil.jPanelcodigoPerfil.setVisible(this.perfilConstantesFunciones.mostrarcodigoPerfil);
		//this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setVisible(this.perfilConstantesFunciones.mostrarnombrePerfil);
		this.jInternalFrameDetalleFormPerfil.jPanelnombrePerfil.setVisible(this.perfilConstantesFunciones.mostrarnombrePerfil);
		//this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setVisible(this.perfilConstantesFunciones.mostrarnombre2Perfil);
		this.jInternalFrameDetalleFormPerfil.jPanelnombre2Perfil.setVisible(this.perfilConstantesFunciones.mostrarnombre2Perfil);
		//this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setVisible(this.perfilConstantesFunciones.mostrarestadoPerfil);
		this.jInternalFrameDetalleFormPerfil.jPanelestadoPerfil.setVisible(this.perfilConstantesFunciones.mostrarestadoPerfil);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPerfil() throws Exception {
		if(this.jInternalFrameDetalleFormPerfil==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfil!=null) {
	
		this.jInternalFrameDetalleFormPerfil.jLabelidPerfil.setEnabled(this.perfilConstantesFunciones.activaridPerfil);
		this.jInternalFrameDetalleFormPerfil.jComboBoxid_sistemaPerfil.setEnabled(this.perfilConstantesFunciones.activarid_sistemaPerfil);
		this.jInternalFrameDetalleFormPerfil.jTextFieldcodigoPerfil.setEnabled(this.perfilConstantesFunciones.activarcodigoPerfil);
		this.jInternalFrameDetalleFormPerfil.jTextFieldnombrePerfil.setEnabled(this.perfilConstantesFunciones.activarnombrePerfil);
		this.jInternalFrameDetalleFormPerfil.jTextAreanombre2Perfil.setEnabled(this.perfilConstantesFunciones.activarnombre2Perfil);
		this.jInternalFrameDetalleFormPerfil.jCheckBoxestadoPerfil.setEnabled(this.perfilConstantesFunciones.activarestadoPerfil);
		}
	}
	
		
}