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

import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SistemaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SistemaBean;
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
public class SistemaBeanSwingJInternalFrame extends SistemaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SistemaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Sistema> sistemaValidator = new ClassValidator<Sistema>(Sistema.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Sistema sistema;	
	public Sistema sistemaAux;
	public Sistema sistemaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Sistema sistemaTotales;
	public Long idSistemaActual;
	public Long iIdNuevoSistema=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosPerfil=false;

	public Boolean getIsTienePermisosPerfil() {
		return isTienePermisosPerfil;
	}

	public void setIsTienePermisosPerfil(Boolean isTienePermisosPerfil) {
		this.isTienePermisosPerfil= isTienePermisosPerfil;
	}


	public Boolean isTienePermisosOpcion=false;

	public Boolean getIsTienePermisosOpcion() {
		return isTienePermisosOpcion;
	}

	public void setIsTienePermisosOpcion(Boolean isTienePermisosOpcion) {
		this.isTienePermisosOpcion= isTienePermisosOpcion;
	}


	public Boolean isTienePermisosPaquete=false;

	public Boolean getIsTienePermisosPaquete() {
		return isTienePermisosPaquete;
	}

	public void setIsTienePermisosPaquete(Boolean isTienePermisosPaquete) {
		this.isTienePermisosPaquete= isTienePermisosPaquete;
	}


	public Boolean isTienePermisosModulo=false;

	public Boolean getIsTienePermisosModulo() {
		return isTienePermisosModulo;
	}

	public void setIsTienePermisosModulo(Boolean isTienePermisosModulo) {
		this.isTienePermisosModulo= isTienePermisosModulo;
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
	
	public Boolean isPermisoTodoSistema;
	public Boolean isPermisoNuevoSistema;
	public Boolean isPermisoActualizarSistema;
	public Boolean isPermisoActualizarOriginalSistema;
	public Boolean isPermisoEliminarSistema;
	public Boolean isPermisoGuardarCambiosSistema;
	public Boolean isPermisoConsultaSistema;
	public Boolean isPermisoBusquedaSistema;
	public Boolean isPermisoReporteSistema;
	public Boolean isPermisoPaginacionMedioSistema;
	public Boolean isPermisoPaginacionAltoSistema;
	public Boolean isPermisoPaginacionTodoSistema;
	public Boolean isPermisoCopiarSistema;
	public Boolean isPermisoVerFormSistema;
	public Boolean isPermisoDuplicarSistema;
	public Boolean isPermisoOrdenSistema;
	
	
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
	
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public SistemaParameterReturnGeneral sistemaParameterGeneral;
	
	

	public PerfilLogic perfilLogic=null;

	public PerfilLogic getPerfilLogic() {
		return perfilLogic;
	}

	public void setPerfilLogic(PerfilLogic perfilLogic) {
		this.perfilLogic = perfilLogic;
	}


	public OpcionLogic opcionLogic=null;

	public OpcionLogic getOpcionLogic() {
		return opcionLogic;
	}

	public void setOpcionLogic(OpcionLogic opcionLogic) {
		this.opcionLogic = opcionLogic;
	}


	public PaqueteLogic paqueteLogic=null;

	public PaqueteLogic getPaqueteLogic() {
		return paqueteLogic;
	}

	public void setPaqueteLogic(PaqueteLogic paqueteLogic) {
		this.paqueteLogic = paqueteLogic;
	}


	public ModuloLogic moduloLogic=null;

	public ModuloLogic getModuloLogic() {
		return moduloLogic;
	}

	public void setModuloLogic(ModuloLogic moduloLogic) {
		this.moduloLogic = moduloLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSistema=false;
	public Boolean esParaAccionDesdeFormularioSistema=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SistemaSessionBeanAdditional sistemaSessionBeanAdditional=null;
	
	public SistemaSessionBeanAdditional getSistemaSessionBeanAdditional() {
		return this.sistemaSessionBeanAdditional;
	}
	
	public void setSistemaSessionBeanAdditional(SistemaSessionBeanAdditional sistemaSessionBeanAdditional) {
		try {
			this.sistemaSessionBeanAdditional=sistemaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SistemaBeanSwingJInternalFrameAdditional sistemaBeanSwingJInternalFrameAdditional=null;
	//public class SistemaBeanSwingJInternalFrame
	
	public SistemaBeanSwingJInternalFrameAdditional getSistemaBeanSwingJInternalFrameAdditional() {
		return this.sistemaBeanSwingJInternalFrameAdditional;
	}
	
	public void setSistemaBeanSwingJInternalFrameAdditional(SistemaBeanSwingJInternalFrameAdditional sistemaBeanSwingJInternalFrameAdditional) {
		try {
			this.sistemaBeanSwingJInternalFrameAdditional=sistemaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SistemaLogic sistemaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Sistema sistemaBean;
	public SistemaConstantesFunciones sistemaConstantesFunciones;
	//public SistemaParameterReturnGeneral sistemaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Sistema> sistemas;	
	//public List<Sistema> sistemasEliminados;
	//public List<Sistema> sistemasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSistema=false;
	public Boolean isVisibilidadCeldaDuplicarSistema=true;
	public Boolean isVisibilidadCeldaCopiarSistema=true;
	public Boolean isVisibilidadCeldaVerFormSistema=true;
	public Boolean isVisibilidadCeldaOrdenSistema=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSistema=false;
	public Boolean isVisibilidadCeldaModificarSistema=false;
	public Boolean isVisibilidadCeldaActualizarSistema=false;
	public Boolean isVisibilidadCeldaEliminarSistema=false;
	public Boolean isVisibilidadCeldaCancelarSistema=false;
	public Boolean isVisibilidadCeldaGuardarSistema=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSistema=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombrePrincipal=false;
	
	public Long getiIdNuevoSistema() {
		return this.iIdNuevoSistema;
	}

	public void setiIdNuevoSistema(Long iIdNuevoSistema) {
		this.iIdNuevoSistema = iIdNuevoSistema;
	}
	
	public Long getidSistemaActual() {
		return this.idSistemaActual;
	}

	public void setidSistemaActual(Long idSistemaActual) {
		this.idSistemaActual = idSistemaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Sistema getsistema() {
		return this.sistema;
	}

	public void setsistema(Sistema sistema) {
		this.sistema = sistema;
	}
	
	public Sistema getsistemaAux() {
		return this.sistemaAux;
	}

	public void setsistemaAux(Sistema sistemaAux) {
		this.sistemaAux = sistemaAux;
	}				
	
	public Sistema getsistemaAnterior() {
		return this.sistemaAnterior;
	}

	public void setsistemaAnterior(Sistema sistemaAnterior) {
		this.sistemaAnterior = sistemaAnterior;
	}	
	
	public Sistema getsistemaTotales() {
		return this.sistemaTotales;
	}

	public void setsistemaTotales(Sistema sistemaTotales) {
		this.sistemaTotales = sistemaTotales;
	}	
	
	public Sistema getsistemaBean() {
		return this.sistemaBean;
	}

	public void setsistemaBean(Sistema sistemaBean) {
		this.sistemaBean = sistemaBean;
	}	
	
	public SistemaParameterReturnGeneral getsistemaReturnGeneral() {
		return this.sistemaReturnGeneral;
	}

	public void setsistemaReturnGeneral(SistemaParameterReturnGeneral sistemaReturnGeneral) {
		this.sistemaReturnGeneral = sistemaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombre_principalBusquedaPorNombrePrincipal="";

	public String getnombre_principalBusquedaPorNombrePrincipal() {
		return this.nombre_principalBusquedaPorNombrePrincipal;
	}

	public void setnombre_principalBusquedaPorNombrePrincipal(String nombre_principalBusquedaPorNombrePrincipal) {
		this.nombre_principalBusquedaPorNombrePrincipal = nombre_principalBusquedaPorNombrePrincipal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SistemaLogic getSistemaLogic()	{		
		return sistemaLogic;
	}

	public void setSistemaLogic(SistemaLogic sistemaLogic) {
		this.sistemaLogic = sistemaLogic;
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
	
	public Boolean getIsEsNuevoSistema() {
		return isEsNuevoSistema;
	}

	public void setIsEsNuevoSistema(Boolean isEsNuevoSistema) {
		this.isEsNuevoSistema = isEsNuevoSistema;
	}

	public Boolean getEsParaAccionDesdeFormularioSistema() {
		return esParaAccionDesdeFormularioSistema;
	}
	
	public void setEsParaAccionDesdeFormularioSistema(Boolean esParaAccionDesdeFormularioSistema) {
		this.esParaAccionDesdeFormularioSistema = esParaAccionDesdeFormularioSistema;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesSistema() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SistemaConstantesFunciones.refrescarForeignKeysDescripcionesSistema(this.sistemaLogic.getSistemas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SistemaConstantesFunciones.refrescarForeignKeysDescripcionesSistema(this.sistemas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//sistemaLogic.setSistemas(this.sistemas);
			sistemaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SistemaParameterReturnGeneral getSistemaParameterGeneral() {
		return this.sistemaParameterGeneral;
	}
	
	public void setSistemaParameterGeneral(SistemaParameterReturnGeneral sistemaParameterGeneral) {
		this.sistemaParameterGeneral = sistemaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSistema() {
		return isPermisoTodoSistema;
	}

	public void setIsPermisoTodoSistema(Boolean isPermisoTodoSistema) {
		this.isPermisoTodoSistema = isPermisoTodoSistema;
	}

	public Boolean getIsPermisoNuevoSistema() {
		return isPermisoNuevoSistema;
	}

	public void setIsPermisoNuevoSistema(Boolean isPermisoNuevoSistema) {
		this.isPermisoNuevoSistema = isPermisoNuevoSistema;
	}

	public Boolean getIsPermisoActualizarSistema() {
		return isPermisoActualizarSistema;
	}

	public void setIsPermisoActualizarSistema(Boolean isPermisoActualizarSistema) {
		this.isPermisoActualizarSistema = isPermisoActualizarSistema;
	}

	public Boolean getIsPermisoEliminarSistema() {
		return isPermisoEliminarSistema;
	}

	public void setIsPermisoEliminarSistema(Boolean isPermisoEliminarSistema) {
		this.isPermisoEliminarSistema = isPermisoEliminarSistema;
	}

	public Boolean getIsPermisoGuardarCambiosSistema() {
		return isPermisoGuardarCambiosSistema;
	}

	public void setIsPermisoGuardarCambiosSistema(Boolean isPermisoGuardarCambiosSistema) {
		this.isPermisoGuardarCambiosSistema = isPermisoGuardarCambiosSistema;
	}
	
	public Boolean getIsPermisoConsultaSistema() {
		return isPermisoConsultaSistema;
	}

	public void setIsPermisoConsultaSistema(Boolean isPermisoConsultaSistema) {
		this.isPermisoConsultaSistema = isPermisoConsultaSistema;
	}

	public Boolean getIsPermisoBusquedaSistema() {
		return isPermisoBusquedaSistema;
	}

	public void setIsPermisoBusquedaSistema(Boolean isPermisoBusquedaSistema) {
		this.isPermisoBusquedaSistema = isPermisoBusquedaSistema;
	}

	public Boolean getIsPermisoReporteSistema() {
		return isPermisoReporteSistema;
	}

	public void setIsPermisoReporteSistema(Boolean isPermisoReporteSistema) {
		this.isPermisoReporteSistema = isPermisoReporteSistema;
	}
	
	public Boolean getIsPermisoPaginacionMedioSistema() {
		return isPermisoPaginacionMedioSistema;
	}

	public void setIsPermisoPaginacionMedioSistema(Boolean isPermisoPaginacionMedioSistema) {
		this.isPermisoPaginacionMedioSistema = isPermisoPaginacionMedioSistema;
	}
	
	public Boolean getIsPermisoPaginacionTodoSistema() {
		return isPermisoPaginacionTodoSistema;
	}

	public void setIsPermisoPaginacionTodoSistema(Boolean isPermisoPaginacionTodoSistema) {
		this.isPermisoPaginacionTodoSistema = isPermisoPaginacionTodoSistema;
	}
	
	public Boolean getIsPermisoPaginacionAltoSistema() {
		return isPermisoPaginacionAltoSistema;
	}

	public void setIsPermisoPaginacionAltoSistema(Boolean isPermisoPaginacionAltoSistema) {
		this.isPermisoPaginacionAltoSistema = isPermisoPaginacionAltoSistema;
	}
	
	public Boolean getIsPermisoCopiarSistema() {
		return isPermisoCopiarSistema;
	}

	public void setIsPermisoCopiarSistema(Boolean isPermisoCopiarSistema) {
		this.isPermisoCopiarSistema = isPermisoCopiarSistema;
	}
	
	public Boolean getIsPermisoVerFormSistema() {
		return isPermisoVerFormSistema;
	}

	public void setIsPermisoVerFormSistema(Boolean isPermisoVerFormSistema) {
		this.isPermisoVerFormSistema = isPermisoVerFormSistema;
	}
	
	public Boolean getIsPermisoDuplicarSistema() {
		return isPermisoDuplicarSistema;
	}

	public void setIsPermisoDuplicarSistema(Boolean isPermisoDuplicarSistema) {
		this.isPermisoDuplicarSistema = isPermisoDuplicarSistema;
	}
	
	public Boolean getIsPermisoOrdenSistema() {
		return isPermisoOrdenSistema;
	}

	public void setIsPermisoOrdenSistema(Boolean isPermisoOrdenSistema) {
		this.isPermisoOrdenSistema = isPermisoOrdenSistema;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSistema() {
		return isVisibilidadCeldaNuevoSistema;
	}

	public void setIsVisibilidadCeldaNuevoSistema(Boolean isVisibilidadCeldaNuevoSistema) {
		this.isVisibilidadCeldaNuevoSistema = isVisibilidadCeldaNuevoSistema;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSistema() {
		return isVisibilidadCeldaDuplicarSistema;
	}

	public void setIsVisibilidadCeldaDuplicarSistema(Boolean isVisibilidadCeldaDuplicarSistema) {
		this.isVisibilidadCeldaDuplicarSistema = isVisibilidadCeldaDuplicarSistema;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSistema() {
		return isVisibilidadCeldaCopiarSistema;
	}

	public void setIsVisibilidadCeldaCopiarSistema(Boolean isVisibilidadCeldaCopiarSistema) {
		this.isVisibilidadCeldaCopiarSistema = isVisibilidadCeldaCopiarSistema;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSistema() {
		return isVisibilidadCeldaVerFormSistema;
	}

	public void setIsVisibilidadCeldaVerFormSistema(Boolean isVisibilidadCeldaVerFormSistema) {
		this.isVisibilidadCeldaVerFormSistema = isVisibilidadCeldaVerFormSistema;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSistema() {
		return isVisibilidadCeldaOrdenSistema;
	}

	public void setIsVisibilidadCeldaOrdenSistema(Boolean isVisibilidadCeldaOrdenSistema) {
		this.isVisibilidadCeldaOrdenSistema = isVisibilidadCeldaOrdenSistema;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSistema() {
		return isVisibilidadCeldaNuevoRelacionesSistema;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSistema(Boolean isVisibilidadCeldaNuevoRelacionesSistema) {
		this.isVisibilidadCeldaNuevoRelacionesSistema = isVisibilidadCeldaNuevoRelacionesSistema;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSistema() {
		return isVisibilidadCeldaModificarSistema;
	}

	public void setIsVisibilidadCeldaModificarSistema(Boolean isVisibilidadCeldaModificarSistema) {
		this.isVisibilidadCeldaModificarSistema = isVisibilidadCeldaModificarSistema;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSistema() {
		return isVisibilidadCeldaActualizarSistema;
	}

	public void setIsVisibilidadCeldaActualizarSistema(Boolean isVisibilidadCeldaActualizarSistema) {
		this.isVisibilidadCeldaActualizarSistema = isVisibilidadCeldaActualizarSistema;
	}

	public Boolean getIsVisibilidadCeldaEliminarSistema() {
		return isVisibilidadCeldaEliminarSistema;
	}

	public void setIsVisibilidadCeldaEliminarSistema(Boolean isVisibilidadCeldaEliminarSistema) {
		this.isVisibilidadCeldaEliminarSistema = isVisibilidadCeldaEliminarSistema;
	}

	public Boolean getIsVisibilidadCeldaCancelarSistema() {
		return isVisibilidadCeldaCancelarSistema;
	}

	public void setIsVisibilidadCeldaCancelarSistema(Boolean isVisibilidadCeldaCancelarSistema) {
		this.isVisibilidadCeldaCancelarSistema = isVisibilidadCeldaCancelarSistema;
	}

	public Boolean getIsVisibilidadCeldaGuardarSistema() {
		return isVisibilidadCeldaGuardarSistema;
	}

	public void setIsVisibilidadCeldaGuardarSistema(Boolean isVisibilidadCeldaGuardarSistema) {
		this.isVisibilidadCeldaGuardarSistema = isVisibilidadCeldaGuardarSistema;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSistema() {
		return isVisibilidadCeldaGuardarCambiosSistema;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSistema(Boolean isVisibilidadCeldaGuardarCambiosSistema) {
		this.isVisibilidadCeldaGuardarCambiosSistema = isVisibilidadCeldaGuardarCambiosSistema;
	}
		
	public SistemaSessionBean getsistemaSessionBean() {
		return this.sistemaSessionBean;
	}
	
	public void setsistemaSessionBean(SistemaSessionBean sistemaSessionBean) {
		this.sistemaSessionBean=sistemaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombrePrincipal() {
		return this.isVisibilidadBusquedaPorNombrePrincipal;
	}

	public void setisVisibilidadBusquedaPorNombrePrincipal(Boolean isVisibilidadBusquedaPorNombrePrincipal) {
		this.isVisibilidadBusquedaPorNombrePrincipal=isVisibilidadBusquedaPorNombrePrincipal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSistema(Sistema sistema)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(Sistema sistema,Sistema sistemaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSistema(sistema);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sistemaAux.setId(sistema.getId());
		sistemaAux.setVersionRow(sistema.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSistema();
		
			int intSelectedRow = this.jTableDatosSistema.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = sistemaValidator.getInvalidValues(this.sistema);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			sistemaLogic.setDatosCliente(datosCliente);
			sistemaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				sistemaAux=new  Sistema();
				
				sistemaAux.setIsNew(true);
				sistemaAux.setIsChanged(true);
				
				sistemaAux.setSistemaOriginal(this.sistema);
				
				sistemaAux.setId(this.sistema.getId());	
				sistemaAux.setVersionRow(this.sistema.getVersionRow());	
				sistemaAux.setcodigo(this.sistema.getcodigo());	
				sistemaAux.setnombre_principal(this.sistema.getnombre_principal());	
				sistemaAux.setnombre_secundario(this.sistema.getnombre_secundario());	
				sistemaAux.setestado(this.sistema.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sistemaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(sistemaAux,sistemaLogic.getSistemas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sistemaAux,sistemas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sistemaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaLogic.saveSistemas();//WithConnection
						//sistemaLogic.getSetVersionRowSistemas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils().addAll(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilsEliminados);
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes().addAll(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetesEliminados);
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos().addAll(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils.addAll(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilsEliminados);
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes.addAll(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetesEliminados);
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos.addAll(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								sistemaLogic.saveSistemaRelaciones(sistemaAux,this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils(),this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes(),this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());//WithConnection
								//sistemaLogic.getSetVersionRowSistemas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.setPerfils(new ArrayList<Perfil>());
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.setPaquetes(new ArrayList<Paquete>());
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.setModulos(new ArrayList<Modulo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils= new ArrayList<Perfil>();
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes= new ArrayList<Paquete>();
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos= new ArrayList<Modulo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setPerfils(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils());

							if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setOpcions(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setPaquetes(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes());

							if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setModulos(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.sistemaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(sistemaAux,sistemaLogic.getSistemas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(sistemaAux,sistemas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sistema,sistemaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				sistemaAux=new  Sistema();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.sistemaSessionBean.getEsGuardarRelacionado() 
					|| (this.sistemaSessionBean.getEsGuardarRelacionado() && this.sistema.getId()>=0)) {
						
					sistemaAux.setIsNew(false);
				}
				
				sistemaAux.setIsDeleted(false);
			
				sistemaAux.setId(this.sistema.getId());	
				sistemaAux.setVersionRow(this.sistema.getVersionRow());	
				sistemaAux.setcodigo(this.sistema.getcodigo());	
				sistemaAux.setnombre_principal(this.sistema.getnombre_principal());	
				sistemaAux.setnombre_secundario(this.sistema.getnombre_secundario());	
				sistemaAux.setestado(this.sistema.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sistemaAux,sistemaLogic.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sistemaAux,sistemas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sistemaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaLogic.saveSistemas();//WithConnection
						//sistemaLogic.getSetVersionRowSistemas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils().addAll(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilsEliminados);
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes().addAll(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetesEliminados);
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos().addAll(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils.addAll(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilsEliminados);
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes.addAll(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetesEliminados);
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos.addAll(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								sistemaLogic.saveSistemaRelaciones(sistemaAux,this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils(),this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes(),this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());//WithConnection
								//sistemaLogic.getSetVersionRowSistemas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.setPerfils(new ArrayList<Perfil>());
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.setPaquetes(new ArrayList<Paquete>());
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.setModulos(new ArrayList<Modulo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils= new ArrayList<Perfil>();
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes= new ArrayList<Paquete>();
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos= new ArrayList<Modulo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setPerfils(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils());

							if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setOpcions(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setPaquetes(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes());

							if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setModulos(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.sistemaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(sistemaAux,sistemaLogic.getSistemas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(sistemaAux,sistemas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sistema,sistemaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				sistemaAux=new  Sistema();
				
				sistemaAux.setIsNew(false);
				sistemaAux.setIsChanged(false);
				
				sistemaAux.setIsDeleted(true);
				
				sistemaAux.setId(this.sistema.getId());	
				sistemaAux.setVersionRow(this.sistema.getVersionRow());	
				sistemaAux.setcodigo(this.sistema.getcodigo());	
				sistemaAux.setnombre_principal(this.sistema.getnombre_principal());	
				sistemaAux.setnombre_secundario(this.sistema.getnombre_secundario());	
				sistemaAux.setestado(this.sistema.getestado());	
				
				if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.sistemaAux.getId()>=0) {	
						this.sistemasEliminados.add(sistemaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(sistemaAux,sistemaLogic.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sistemaAux,sistemas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sistemaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaLogic.saveSistemas();//WithConnection
						//sistemaLogic.getSetVersionRowSistemas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils().addAll(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilsEliminados);
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes().addAll(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetesEliminados);
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos().addAll(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils.addAll(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilsEliminados);
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes.addAll(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetesEliminados);
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos.addAll(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.perfilusuarioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jInternalFrameDetalleFormPerfil.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								sistemaLogic.saveSistemaRelaciones(sistemaAux,this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils(),this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes(),this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());//WithConnection
								//sistemaLogic.getSetVersionRowSistemas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.setPerfils(new ArrayList<Perfil>());
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.setPaquetes(new ArrayList<Paquete>());
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.setModulos(new ArrayList<Modulo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils= new ArrayList<Perfil>();
							this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes= new ArrayList<Paquete>();
							this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos= new ArrayList<Modulo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setPerfils(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils());

							if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setOpcions(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setPaquetes(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes());

							if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.quitarFilaTotales();}
							sistemaAux.setModulos(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.sistemaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(sistemaAux,sistemaLogic.getSistemas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(sistemaAux,sistemas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getSistemas().addAll(this.sistemasEliminados);
					
					sistemaLogic.saveSistemas();//WithConnection
					//sistemaLogic.getSetVersionRowSistemas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.sistemasEliminados= new ArrayList<Sistema>();		
			}
			
			if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sistema GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.sistema=sistemaAux;
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
      		//this.finishProcessSistema();
      	}
		
	}	
	
	public void actualizarRelaciones(Sistema sistemaLocal) throws Exception {
		
		if(this.sistemaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				sistemaLocal.setPerfils(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils());
				sistemaLocal.setOpcions(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());
				sistemaLocal.setPaquetes(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes());
				sistemaLocal.setModulos(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());
			
			} else {
			
				sistemaLocal.setPerfils(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfils);
				sistemaLocal.setOpcions(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcions);
				sistemaLocal.setPaquetes(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paquetes);
				sistemaLocal.setModulos(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.modulos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Sistema sistemaLocal) throws Exception {	
		if(this.sistemaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarSistemaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSistema.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sistemaValidator.getInvalidValues(this.sistema);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Sistema sistema,List<Sistema> sistemas) throws Exception {
		try	{		
			SistemaConstantesFunciones.actualizarLista(sistema,sistemas,this.sistemaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Sistema sistema,List<Sistema> sistemas) throws Exception {
		try	{			
			SistemaConstantesFunciones.actualizarSelectedLista(sistema,sistemas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Sistema> sistemasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sistemasLocal=this.sistemaLogic.getSistemas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sistemasLocal=this.sistemas;
			}
			//ARCHITECTURE
		
			for(Sistema sistemaLocal:sistemasLocal) {
				if(this.permiteMantenimiento(sistemaLocal) && sistemaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SistemaConstantesFunciones.getSistemaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SistemaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelcodigoSistema,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SistemaConstantesFunciones.NOMBREPRINCIPAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelnombre_principalSistema,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SistemaConstantesFunciones.NOMBRESECUNDARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelnombre_secundarioSistema,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SistemaConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelestadoSistema,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSistema.jLabelcodigoSistema,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSistema.jLabelnombre_principalSistema,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSistema.jLabelnombre_secundarioSistema,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSistema.jLabelestadoSistema,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Perfil")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistemaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);

				this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.getperfil().setSistema(this.sistema);
			}

			return;
		}
		 else  if(sTipo.equals("Opcion")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistemaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);

				this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.getopcion().setSistema(this.sistema);
			}

			return;
		}
		 else  if(sTipo.equals("Paquete")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistemaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);

				this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.getpaquete().setSistema(this.sistema);
			}

			return;
		}
		 else  if(sTipo.equals("Modulo")) {
			if(this.sistema==null) {
				this.sistema= new Sistema();
			}

			if(this.sistemaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSistema
				this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);

				this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.getmodulo().setSistema(this.sistema);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSistema--;	
		
		
		this.sistemaAux=new Sistema();
		
		this.sistemaAux.setId(this.iIdNuevoSistema);
		this.sistemaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sistemaLogic.getSistemas().add(this.sistemaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sistemas.add(this.sistemaAux);
		}
		//ARCHITECTURE
		
		this.sistema=this.sistemaAux;
		
		if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSistema(this.sistema);
			this.setVariablesObjetoActualToFormularioForeignKeySistema(this.sistema);
		}
				
		//this.setDefaultControlesSistema();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySistema();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySistema();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySistema();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSistema(this.sistemaBean,this.sistema,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SistemaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.sistemaSessionBean.getConGuardarRelaciones()) {
			classes=SistemaConstantesFunciones.getClassesRelationshipsOfSistema(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.sistemaReturnGeneral=sistemaLogic.procesarEventosSistemasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sistemaLogic.getSistemas(),this.sistema,this.sistemaParameterGeneral,this.isEsNuevoSistema,classes);//this.sistemaLogic.getSistema()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSistema(this.sistemaReturnGeneral,this.sistemaBean,false);
		
		if(this.sistemaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySistema(this.sistemaReturnGeneral.getSistema());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSistema(this.sistemaReturnGeneral.getSistema());
		}
		
		if(this.sistemaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSistema(this.sistemaReturnGeneral.getSistema(),classes);//this.sistemaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSistema(this.sistema,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySistema();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySistema();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SistemaBeanSwingJInternalFrameAdditional.RecargarFormSistema(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSistema(false);
						
			if(sistemaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilSessionBean.getEsGuardarRelacionado() && PerfilJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado() && OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteSessionBean.getEsGuardarRelacionado() && PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPaqueteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloSessionBean.getEsGuardarRelacionado() && ModuloJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonModuloActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSistema();
			}
			
			this.actualizarVisualTableDatosSistema();
			
			this.jTableDatosSistema.setRowSelectionInterval(this.getIndiceNuevoSistema(), this.getIndiceNuevoSistema());
			
			this.seleccionarFilaTablaSistemaActual();
						
			this.actualizarEstadoCeldasBotonesSistema("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSistema(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setEnabled(isHabilitar && this.sistemaConstantesFunciones.activarcodigoSistema);
		this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setEnabled(isHabilitar && this.sistemaConstantesFunciones.activarnombre_principalSistema);
		this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setEnabled(isHabilitar && this.sistemaConstantesFunciones.activarnombre_secundarioSistema);
		this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setEnabled(isHabilitar && this.sistemaConstantesFunciones.activarestadoSistema);	
		
	};
	
	public void setDefaultControlesSistema() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSistema(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sistemaSessionBean.setConGuardarRelaciones(true);			
			this.sistemaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.sistemaSessionBean.setConGuardarRelaciones(false);			
			this.sistemaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSistema() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
				if(sistemaAux.getId().equals(this.iIdNuevoSistema)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sistema sistemaAux:this.sistemas) {
				if(sistemaAux.getId().equals(this.iIdNuevoSistema)) {
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
	
	public int getIndiceActualSistema(Sistema sistema,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
				if(sistemaAux.getId().equals(sistema.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sistema sistemaAux:this.sistemas) {
				if(sistemaAux.getId().equals(sistema.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSistema(Sistema sistemaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
				if(sistemaAux.getSistemaOriginal().getId().equals(sistemaOriginal.getId())) {
					existe=true;
					sistemaOriginal.setId(sistemaAux.getId());
					sistemaOriginal.setVersionRow(sistemaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sistema sistemaAux:this.sistemas) {
				if(sistemaAux.getSistemaOriginal().getId().equals(sistemaOriginal.getId())) {
					existe=true;
					sistemaOriginal.setId(sistemaAux.getId());
					sistemaOriginal.setVersionRow(sistemaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSistema(Boolean esParaCancelar) throws Exception {
		sistemasAux=new ArrayList<Sistema>();
		sistemaAux=new Sistema();
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
					if(sistemaAux.getId()<0) {
						sistemasAux.add(sistemaAux);
					}		
				}
				this.iIdNuevoSistema=0L;
				this.sistemaLogic.getSistemas().removeAll(sistemasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sistema sistemaAux:this.sistemas) {
					if(sistemaAux.getId()<0) {
						sistemasAux.add(sistemaAux);
					}		
				}
				this.iIdNuevoSistema=0L;
				this.sistemas.removeAll(sistemasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSistema 
					&& this.sistemaLogic.getSistemas().size()>0
					) {
					sistemaAux=this.sistemaLogic.getSistemas().get(this.sistemaLogic.getSistemas().size() - 1);
				
					if(sistemaAux.getId()<0) {
						this.sistemaLogic.getSistemas().remove(sistemaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSistema && this.sistemas.size()>0) {
					sistemaAux=this.sistemas.get(this.sistemas.size() - 1);
				
					if(sistemaAux.getId()<0) {
						this.sistemas.remove(sistemaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSistema(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sistema.getId()<0) {
				this.sistemaLogic.getSistemas().remove(this.sistema);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sistema.getId()<0) {
				this.sistemas.remove(this.sistema);
			}
		}			
	}
	
	public void setEstadosInicialesSistema(List<Sistema> sistemasAux) throws Exception {
		SistemaConstantesFunciones.setEstadosInicialesSistema(sistemasAux);
	}
	
	public void setEstadosInicialesSistema(Sistema sistemaAux) throws Exception {
		SistemaConstantesFunciones.setEstadosInicialesSistema(sistemaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSistemaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSistema("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSistemaActual()) {
				if(!this.isEsNuevoSistema) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSistema("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSistema=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSistemaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sistema ?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSistema("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Sistema sistema) throws Exception {
		SistemaConstantesFunciones.seleccionarAsignar(this.sistema,sistema);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSistema=this.isPermisoActualizarOriginalSistema;
			
			
			this.seleccionarAsignar(sistema);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SistemaConstantesFunciones.quitarEspaciosSistema(this.sistema,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSistema("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sistemaSessionBean.setsFuncionBusquedaRapida(this.sistemaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSistema) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSistema(esParaCancelar);				
				this.cancelarNuevoSistema(esParaCancelar);								
			}
			
			this.sistema=new Sistema();
			
			this.inicializarSistema();
			
			this.actualizarEstadoCeldasBotonesSistema("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSistema() throws Exception {
		try {
			SistemaConstantesFunciones.inicializarSistema(this.sistema);
			
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
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sistemaLogic.getSistemas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSistemas(String sAccionBusqueda,List<Sistema> sistemasParaReportes) throws Exception {
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
					sPathReporteFinal="Sistema"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SistemaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SistemaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Sistema"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sistemas");		
		parameters.put("busquedapor", SistemaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Perfil.class));
			classes.add(new Classe(Opcion.class));
			classes.add(new Classe(Paquete.class));
			classes.add(new Classe(Modulo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					SistemaLogic sistemaLogicAuxiliar=new SistemaLogic();
					sistemaLogicAuxiliar.setDatosCliente(sistemaLogic.getDatosCliente());				
					sistemaLogicAuxiliar.setSistemas(sistemasParaReportes);
					
					sistemaLogicAuxiliar.cargarRelacionesLoteForeignKeySistemaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					sistemasParaReportes=sistemaLogicAuxiliar.getSistemas();
					
					//sistemaLogic.getNewConnexionToDeep();
					
					//for (Sistema sistema:sistemasParaReportes) {
					//	sistemaLogic.deepLoad(sistema, false, DeepLoadType.INCLUDE, classes);
					//}						
					//sistemaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//sistemaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePerfil = AuxiliarReportes.class.getResourceAsStream("PerfilDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfil", reportFilePerfil);

			InputStream reportFileOpcion = AuxiliarReportes.class.getResourceAsStream("OpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_opcion", reportFileOpcion);

			InputStream reportFilePaquete = AuxiliarReportes.class.getResourceAsStream("PaqueteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_paquete", reportFilePaquete);

			InputStream reportFileModulo = AuxiliarReportes.class.getResourceAsStream("ModuloDetalleRelacionesDesign.jasper");
			parameters.put("subreport_modulo", reportFileModulo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSistema=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SistemaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SistemaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSistema=new JRBeanArrayDataSource(SistemaJInternalFrame.TraerSistemaBeans(sistemasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSistema);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SistemaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SistemaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SistemaBean.TraerSistemaBeans(sistemasParaReportes).toArray()));
							
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
				this.generarExcelReporteSistemas(sAccionBusqueda,sTipoArchivoReporte,sistemasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSistemas(sAccionBusqueda,sTipoArchivoReporte,sistemasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSistemaActionPerformed(null);
					//this.generarExcelReporteSistemas(sAccionBusqueda,sTipoArchivoReporte,sistemasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSistemas(sAccionBusqueda,sTipoArchivoReporte,sistemasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSistemas(sAccionBusqueda,sTipoArchivoReporte,sistemasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSistemas(sAccionBusqueda,sTipoArchivoReporte,sistemasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSistemas(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sistemas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSistema("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Sistema sistema : sistemasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SistemaConstantesFunciones.generarExcelReporteDataSistema("NORMAL",row,workbook,sistema,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSistema(String sTipo,Row row,Workbook workbook) {
		
		SistemaConstantesFunciones.generarExcelReporteHeaderSistema(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSistemas(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sistemas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Sistema sistema : sistemasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SistemaConstantesFunciones.getSistemaDescripcion(sistema));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SistemaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SistemaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sistema.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sistema.getnombre_principal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sistema.getnombre_secundario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SistemaConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SistemaConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(sistema.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSistemas(String sAccionBusqueda,String sTipoArchivoReporte,List<Sistema> sistemasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Sistema> sistemasRespaldo=null;
		
		classes=SistemaConstantesFunciones.getClassesRelationshipsOfSistema(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sistemaLogic.setDatosCliente(this.datosCliente);
		this.sistemaLogic.setDatosDeep(this.datosDeep);
		this.sistemaLogic.setIsConDeep(true);
		
		sistemasRespaldo=this.sistemaLogic.getSistemas();
		
		this.sistemaLogic.setSistemas(sistemasParaReportes);	
		this.sistemaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sistemasParaReportes=this.sistemaLogic.getSistemas();
		this.sistemaLogic.setSistemas(sistemasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sistemas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSistema("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Sistema sistema : sistemasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSistema("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SistemaConstantesFunciones.generarExcelReporteDataSistema("NORMAL",row,workbook,sistema,cellStyleDataAux);
		
			
			


				//Perfil
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilConstantesFunciones.SCLASSWEBTITULO))) {

				if(sistema.getPerfils()!=null && sistema.getPerfils().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilConstantesFunciones.generarExcelReporteHeaderPerfil("RELACIONADO",row,workbook);
				}

				if(sistema.getPerfils()!=null) {
					i2=0;
					for(Perfil perfil : sistema.getPerfils()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PerfilConstantesFunciones.generarExcelReporteDataPerfil("RELACIONADO",row,workbook,perfil,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Opcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(OpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(sistema.getOpcions()!=null && sistema.getOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(OpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					OpcionConstantesFunciones.generarExcelReporteHeaderOpcion("RELACIONADO",row,workbook);
				}

				if(sistema.getOpcions()!=null) {
					i2=0;
					for(Opcion opcion : sistema.getOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						OpcionConstantesFunciones.generarExcelReporteDataOpcion("RELACIONADO",row,workbook,opcion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Paquete
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PaqueteConstantesFunciones.SCLASSWEBTITULO))) {

				if(sistema.getPaquetes()!=null && sistema.getPaquetes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PaqueteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PaqueteConstantesFunciones.generarExcelReporteHeaderPaquete("RELACIONADO",row,workbook);
				}

				if(sistema.getPaquetes()!=null) {
					i2=0;
					for(Paquete paquete : sistema.getPaquetes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PaqueteConstantesFunciones.generarExcelReporteDataPaquete("RELACIONADO",row,workbook,paquete,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Modulo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ModuloConstantesFunciones.SCLASSWEBTITULO))) {

				if(sistema.getModulos()!=null && sistema.getModulos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ModuloConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ModuloConstantesFunciones.generarExcelReporteHeaderModulo("RELACIONADO",row,workbook);
				}

				if(sistema.getModulos()!=null) {
					i2=0;
					for(Modulo modulo : sistema.getModulos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ModuloConstantesFunciones.generarExcelReporteDataModulo("RELACIONADO",row,workbook,modulo,cellStyleDataAuxHijo);
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
		cell.setCellValue(SistemaConstantesFunciones.getSistemaDescripcion(sistema));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSistema.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSistema.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSistema() throws Exception {		
		this.startProcessSistema(true);
	}
	
	public void startProcessSistema(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSistema ,this.jPanelParametrosReportesSistema, this.jScrollPanelDatosSistema,this.jPanelPaginacionSistema, this.jScrollPanelDatosEdicionSistema, this.jPanelAccionesSistema,this.jPanelAccionesFormularioSistema,this.jmenuBarSistema,this.jmenuBarDetalleSistema,this.jTtoolBarSistema,this.jTtoolBarDetalleSistema);		
		
		final JTabbedPane jTabbedPaneBusquedasSistema=this.jTabbedPaneBusquedasSistema; 
		
		final JPanel jPanelParametrosReportesSistema=this.jPanelParametrosReportesSistema;
		//final JScrollPane jScrollPanelDatosSistema=this.jScrollPanelDatosSistema;
		final JTable jTableDatosSistema=this.jTableDatosSistema;		
		final JPanel jPanelPaginacionSistema=this.jPanelPaginacionSistema;
		//final JScrollPane jScrollPanelDatosEdicionSistema=this.jScrollPanelDatosEdicionSistema;
		final JPanel jPanelAccionesSistema=this.jPanelAccionesSistema;
		
		JPanel jPanelCamposAuxiliarSistema=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSistema=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
			jPanelCamposAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jPanelCamposSistema;
			jPanelAccionesFormularioAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jPanelAccionesFormularioSistema;
		}
		
		final JPanel jPanelCamposSistema=jPanelCamposAuxiliarSistema;
		final JPanel jPanelAccionesFormularioSistema=jPanelAccionesFormularioAuxiliarSistema;
		
		
		final JMenuBar jmenuBarSistema=this.jmenuBarSistema;
		final JToolBar jTtoolBarSistema=this.jTtoolBarSistema;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSistema=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSistema=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
			jmenuBarDetalleAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jmenuBarDetalleSistema;
			jTtoolBarDetalleAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jTtoolBarDetalleSistema;
		}
		
		final JMenuBar jmenuBarDetalleSistema=jmenuBarDetalleAuxiliarSistema;
		final JToolBar jTtoolBarDetalleSistema=jTtoolBarDetalleAuxiliarSistema;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSistema;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSistema;
			processRunnable.jTableDatos=jTableDatosSistema;
			processRunnable.jPanelCampos=jPanelCamposSistema;
			processRunnable.jPanelPaginacion=jPanelPaginacionSistema;
			processRunnable.jPanelAcciones=jPanelAccionesSistema;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSistema;
			
			
			processRunnable.jmenuBar=jmenuBarSistema;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSistema;
			processRunnable.jTtoolBar=jTtoolBarSistema;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSistema;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSistema ,jPanelParametrosReportesSistema,jTableDatosSistema, /*jScrollPanelDatosSistema,*/jPanelCamposSistema,jPanelPaginacionSistema, /*jScrollPanelDatosEdicionSistema,*/ jPanelAccionesSistema,jPanelAccionesFormularioSistema,jmenuBarSistema,jmenuBarDetalleSistema,jTtoolBarSistema,jTtoolBarDetalleSistema);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSistema ,jPanelParametrosReportesSistema, jScrollPanelDatosSistema,jPanelPaginacionSistema, jScrollPanelDatosEdicionSistema, jPanelAccionesSistema,jPanelAccionesFormularioSistema,jmenuBarSistema,jmenuBarDetalleSistema,jTtoolBarSistema,jTtoolBarDetalleSistema);
						
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
	
	public void finishProcessSistema() {// throws Exception 
		this.finishProcessSistema(true);
	}
	
	public void finishProcessSistema(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSistema ,this.jPanelParametrosReportesSistema, this.jScrollPanelDatosSistema,this.jPanelPaginacionSistema, this.jScrollPanelDatosEdicionSistema, this.jPanelAccionesSistema,this.jPanelAccionesFormularioSistema,this.jmenuBarSistema,this.jmenuBarDetalleSistema,this.jTtoolBarSistema,this.jTtoolBarDetalleSistema);		
		
		final JTabbedPane jTabbedPaneBusquedasSistema=this.jTabbedPaneBusquedasSistema; 
		
		final JPanel jPanelParametrosReportesSistema=this.jPanelParametrosReportesSistema;
		//final JScrollPane jScrollPanelDatosSistema=this.jScrollPanelDatosSistema;
		final JTable jTableDatosSistema=this.jTableDatosSistema;		
		final JPanel jPanelPaginacionSistema=this.jPanelPaginacionSistema;
		//final JScrollPane jScrollPanelDatosEdicionSistema=this.jScrollPanelDatosEdicionSistema;
		final JPanel jPanelAccionesSistema=this.jPanelAccionesSistema;
		
		JPanel jPanelCamposAuxiliarSistema=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSistema=new JPanel();
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
			jPanelCamposAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jPanelCamposSistema;
			jPanelAccionesFormularioAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jPanelAccionesFormularioSistema;
		}
		
		final JPanel jPanelCamposSistema=jPanelCamposAuxiliarSistema;
		final JPanel jPanelAccionesFormularioSistema=jPanelAccionesFormularioAuxiliarSistema;
		
		
		final JMenuBar jmenuBarSistema=this.jmenuBarSistema;		
		final JToolBar jTtoolBarSistema=this.jTtoolBarSistema;
				
		JMenuBar jmenuBarDetalleAuxiliarSistema=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSistema=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
			jmenuBarDetalleAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jmenuBarDetalleSistema;
			jTtoolBarDetalleAuxiliarSistema=this.jInternalFrameDetalleFormSistema.jTtoolBarDetalleSistema;		
		}
		
		final JMenuBar jmenuBarDetalleSistema=jmenuBarDetalleAuxiliarSistema;
		final JToolBar jTtoolBarDetalleSistema=jTtoolBarDetalleAuxiliarSistema;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSistema;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSistema;
			processRunnable.jTableDatos=jTableDatosSistema;
			processRunnable.jPanelCampos=jPanelCamposSistema;
			processRunnable.jPanelPaginacion=jPanelPaginacionSistema;
			processRunnable.jPanelAcciones=jPanelAccionesSistema;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSistema;
			
			
			processRunnable.jmenuBar=jmenuBarSistema;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSistema;
			processRunnable.jTtoolBar=jTtoolBarSistema;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSistema;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSistema ,jPanelParametrosReportesSistema, jTableDatosSistema,/*jScrollPanelDatosSistema,*/jPanelCamposSistema,jPanelPaginacionSistema, /*jScrollPanelDatosEdicionSistema,*/ jPanelAccionesSistema,jPanelAccionesFormularioSistema,jmenuBarSistema,jmenuBarDetalleSistema,jTtoolBarSistema,jTtoolBarDetalleSistema));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSistema(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSistema(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSistema(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSistema(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSistema,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSistema,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSistema(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSistema,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSistema,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sistemaConstantesFunciones.getsFinalQuerySistema();
		String  finalQueryPaginacionTodos=this.sistemaConstantesFunciones.getsFinalQuerySistema();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SistemaConstantesFunciones.getArrayColumnasGlobalesNoSistema(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sistemasEliminados= new ArrayList<Sistema>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSistema();
		
				///*SistemaSessionBean*/this.sistemaSessionBean=new SistemaSessionBean();
			
			if(this.sistemaSessionBean==null) {
				this.sistemaSessionBean=new SistemaSessionBean();
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
					this.iNumeroPaginacion=SistemaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SistemaConstantesFunciones.getClassesForeignKeysOfSistema(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sistema."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sistemasAux= new ArrayList<Sistema>();
			
				
			sistemaLogic.setDatosCliente(this.datosCliente);
			sistemaLogic.setDatosDeep(this.datosDeep);
			sistemaLogic.setIsConDeep(true);
			
			
			sistemaLogic.getSistemaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					sistemaLogic.getTodosSistemas(finalQueryGlobal,pagination);
					
					//sistemaLogic.getTodosSistemasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(sistemaLogic.getSistemas()==null|| sistemaLogic.getSistemas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sistemasAux= new ArrayList<Sistema>();
							sistemasAux.addAll(sistemaLogic.getSistemas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemasAux= new ArrayList<Sistema>();
							sistemasAux.addAll(sistemas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sistemaLogic.getTodosSistemas(finalQueryGlobal+"",this.pagination);												
							
							//sistemaLogic.getTodosSistemasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSistemas("Todos",sistemaLogic.getSistemas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sistemaLogic.setSistemas(new ArrayList<Sistema>());					
							sistemaLogic.getSistemas().addAll(sistemasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemas=new ArrayList<Sistema>();
							sistemas.addAll(sistemasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSistema=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSistema=this.idActual;
				
				} else if(this.idSistemaActual!=null && this.idSistemaActual!=0L) {
					idSistema=idSistemaActual;
				}
				
					
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndicePorId(idSistema);
				
				this.sistemas=new ArrayList<Sistema>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					sistemaLogic.getEntity(idSistema);
					
					//sistemaLogic.getEntityWithConnection(idSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.setSistemas(new ArrayList<Sistema>());
					sistemaLogic.getSistemas().add(sistemaLogic.getSistema());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sistemas=new ArrayList<Sistema>();
					this.sistemas.add(sistema);
				}
				
				if(sistemaLogic.getSistema()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sistemaLogic.getSistemasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sistemaLogic.getSistemas()==null||sistemaLogic.getSistemas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sistemas==null|| sistemas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemasAux=new ArrayList<Sistema>();
						sistemasAux.addAll(sistemaLogic.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemasAux=new ArrayList<Sistema>();
							sistemasAux.addAll(sistemas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sistemaLogic.getSistemasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSistemas("BusquedaPorCodigo",sistemaLogic.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSistemas("BusquedaPorCodigo",sistemas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaLogic.setSistemas(new ArrayList<Sistema>());
						sistemaLogic.getSistemas().addAll(sistemasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemas=new ArrayList<Sistema>();
							sistemas.addAll(sistemasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombrePrincipal")) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sistemaLogic.getSistemasBusquedaPorNombrePrincipal(finalQueryGlobal,pagination,nombre_principalBusquedaPorNombrePrincipal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sistemaLogic.getSistemas()==null||sistemaLogic.getSistemas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sistemas==null|| sistemas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemasAux=new ArrayList<Sistema>();
						sistemasAux.addAll(sistemaLogic.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemasAux=new ArrayList<Sistema>();
							sistemasAux.addAll(sistemas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sistemaLogic.getSistemasBusquedaPorNombrePrincipal(finalQueryGlobal,pagination,nombre_principalBusquedaPorNombrePrincipal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SistemaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePrincipal(nombre_principalBusquedaPorNombrePrincipal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSistemas("BusquedaPorNombrePrincipal",sistemaLogic.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSistemas("BusquedaPorNombrePrincipal",sistemas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaLogic.setSistemas(new ArrayList<Sistema>());
						sistemaLogic.getSistemas().addAll(sistemasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemas=new ArrayList<Sistema>();
							sistemas.addAll(sistemasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSistema();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSistema();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sistemaLogic.getSistemas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sistemas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sistemaLogic.getSistemas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sistemas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Sistema sistema) {
		Boolean permite=true;
		
		if(this.sistema.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SistemaConstantesFunciones.getOrderByListaSistema();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SistemaConstantesFunciones.getOrderByListaSistema();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sistema sistema:sistemaLogic.getSistemas()) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sistema sistema:this.sistemas) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
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
			this.sistemaAux=new Sistema();
			this.sistemaAux.setsType(Constantes2.S_TOTALES);
			this.sistemaAux.setIsNew(false);
			this.sistemaAux.setIsChanged(false);
			this.sistemaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SistemaConstantesFunciones.TotalizarValoresFilaSistema(this.sistemaLogic.getSistemas(),this.sistemaAux);
				
				this.sistemaLogic.getSistemas().add(this.sistemaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SistemaConstantesFunciones.TotalizarValoresFilaSistema(this.sistemas,this.sistemaAux);
				
				this.sistemas.add(this.sistemaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sistemaTotales=new Sistema();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sistemaLogic.getSistemas().remove(sistemaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sistemas.remove(sistemaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sistemaTotales=new Sistema();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sistema sistema:sistemaLogic.getSistemas()) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SistemaConstantesFunciones.TotalizarValoresFilaSistema(this.sistemaLogic.getSistemas(),sistemaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sistema sistema:this.sistemas) {
				if(sistema.getsType().equals(Constantes2.S_TOTALES)) {
					sistemaTotales=sistema;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SistemaConstantesFunciones.TotalizarValoresFilaSistema(this.sistemas,sistemaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSistemasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSistemasBusquedaPorNombrePrincipal()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombrePrincipal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSistemaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getSistemaPorNombrePrincipal()throws Exception {
		try {
			sAccionBusqueda="PorNombrePrincipal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getSistemasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSistemasBusquedaPorNombrePrincipal(String sFinalQuery,String nombre_principal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemasBusquedaPorNombrePrincipal(sFinalQuery,this.pagination,nombre_principal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSistemaPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemaPorCodigo(codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSistemaPorNombrePrincipal(String nombre_principal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemaPorNombrePrincipal(nombre_principal);
				
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
	
	public void inicializarPermisosSistema() {
		this.isPermisoTodoSistema=false;
		this.isPermisoNuevoSistema=false;
		this.isPermisoActualizarSistema=false;
		this.isPermisoActualizarOriginalSistema=false;
		this.isPermisoEliminarSistema=false;
		this.isPermisoGuardarCambiosSistema=false;
		this.isPermisoConsultaSistema=false;
		this.isPermisoBusquedaSistema=false;
		this.isPermisoReporteSistema=false;		
		this.isPermisoOrdenSistema=false;		
		this.isPermisoPaginacionMedioSistema=false;		
		this.isPermisoPaginacionAltoSistema=false;
		this.isPermisoPaginacionTodoSistema=false;
		this.isPermisoCopiarSistema=false;		
		this.isPermisoVerFormSistema=false;		
		this.isPermisoDuplicarSistema=false;		
		this.isPermisoOrdenSistema=false;		
	}
	
	public void setPermisosUsuarioSistema(Boolean isPermiso) {
		this.isPermisoTodoSistema=isPermiso;
		this.isPermisoNuevoSistema=isPermiso;
		this.isPermisoActualizarSistema=isPermiso;
		this.isPermisoActualizarOriginalSistema=isPermiso;
		this.isPermisoEliminarSistema=isPermiso;
		this.isPermisoGuardarCambiosSistema=isPermiso;
		this.isPermisoConsultaSistema=isPermiso;
		this.isPermisoBusquedaSistema=isPermiso;
		this.isPermisoReporteSistema=isPermiso;
		this.isPermisoOrdenSistema=isPermiso;		
		this.isPermisoPaginacionMedioSistema=isPermiso;		
		this.isPermisoPaginacionAltoSistema=isPermiso;		
		this.isPermisoPaginacionTodoSistema=isPermiso;		
		this.isPermisoCopiarSistema=isPermiso;		
		this.isPermisoVerFormSistema=isPermiso;		
		this.isPermisoDuplicarSistema=isPermiso;
		this.isPermisoOrdenSistema=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSistema(Boolean isPermiso) {
		//this.isPermisoTodoSistema=isPermiso;
		this.isPermisoNuevoSistema=isPermiso;
		this.isPermisoActualizarSistema=isPermiso;
		this.isPermisoActualizarOriginalSistema=isPermiso;
		this.isPermisoEliminarSistema=isPermiso;
		this.isPermisoGuardarCambiosSistema=isPermiso;
		//this.isPermisoConsultaSistema=isPermiso;
		//this.isPermisoBusquedaSistema=isPermiso;
		//this.isPermisoReporteSistema=isPermiso;
		//this.isPermisoOrdenSistema=isPermiso;		
		//this.isPermisoPaginacionMedioSistema=isPermiso;		
		//this.isPermisoPaginacionAltoSistema=isPermiso;		
		//this.isPermisoPaginacionTodoSistema=isPermiso;		
		//this.isPermisoCopiarSistema=isPermiso;		
		//this.isPermisoDuplicarSistema=isPermiso;
		//this.isPermisoOrdenSistema=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSistemaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PerfilConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(OpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PaqueteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ModuloConstantesFunciones.SNOMBREOPCION);
		
		if(SistemaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPerfil=false;
		this.isTienePermisosPerfil=this.verificarGetPermisosUsuarioOpcionSistemaClaseRelacionada(this.opcionsRelacionadas,PerfilConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosOpcion=false;
		this.isTienePermisosOpcion=this.verificarGetPermisosUsuarioOpcionSistemaClaseRelacionada(this.opcionsRelacionadas,OpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPaquete=false;
		this.isTienePermisosPaquete=this.verificarGetPermisosUsuarioOpcionSistemaClaseRelacionada(this.opcionsRelacionadas,PaqueteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosModulo=false;
		this.isTienePermisosModulo=this.verificarGetPermisosUsuarioOpcionSistemaClaseRelacionada(this.opcionsRelacionadas,ModuloConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSistema(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSistemaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPerfil=conPermiso;
		this.isTienePermisosOpcion=conPermiso;
		this.isTienePermisosPaquete=conPermiso;
		this.isTienePermisosModulo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSistemaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSistemaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSistemaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPerfil && this.jInternalFrameDetalleFormSistema!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.remove(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosOpcion && this.jInternalFrameDetalleFormSistema!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.remove(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPaquete && this.jInternalFrameDetalleFormSistema!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.remove(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosModulo && this.jInternalFrameDetalleFormSistema!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.remove(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSistema() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SistemaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SistemaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSistema=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSistema=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSistema=this.isPermisoActualizarSistema;
			this.isPermisoEliminarSistema=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSistema=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSistema=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSistema=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSistema=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSistema=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSistema=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSistema=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSistema=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSistema=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSistema=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSistema=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSistema=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSistema=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSistema.setToolTipText(this.jTableDatosSistema.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSistema(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSistema(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SistemaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SistemaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSistema() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPerfil && this.sistemaConstantesFunciones.mostrarPerfilSistema && !SistemaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil");
			reporte.setsDescripcion("Perfil");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosOpcion && this.sistemaConstantesFunciones.mostrarOpcionSistema && !SistemaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Opcion");
			reporte.setsDescripcion("Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPaquete && this.sistemaConstantesFunciones.mostrarPaqueteSistema && !SistemaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Paquete");
			reporte.setsDescripcion("Paquete");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosModulo && this.sistemaConstantesFunciones.mostrarModuloSistema && !SistemaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Modulo");
			reporte.setsDescripcion("Modulo");
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
	
		
	public void inicializarCombosForeignKeySistemaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySistemaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SistemaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySistemaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeySistemaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySistema()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeySistema()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySistema(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySistema()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySistema();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySistema(Sistema sistema)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySistema(Sistema sistema,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySistema()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySistema()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySistema()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySistema()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSistema()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySistema()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySistema(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public SistemaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SistemaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SistemaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sistemaSessionBean=new SistemaSessionBean(); 
		this.sistemaConstantesFunciones=new SistemaConstantesFunciones(); 
		this.sistemaBean=new Sistema();//(this.sistemaConstantesFunciones); 		
		this.sistemaReturnGeneral=new SistemaParameterReturnGeneral(); 
		
		this.sistemaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sistemaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SistemaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SistemaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SistemaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSistema(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
			
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
			
			this.sistemaConstantesFunciones=new SistemaConstantesFunciones(); 
			this.sistemaBean=new Sistema();//this.sistemaConstantesFunciones); 			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral(); 
		
			SistemaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sistema Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.sistema=new Sistema();
			this.sistemas = new ArrayList<Sistema>();
			this.sistemasAux = new ArrayList<Sistema>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic=new SistemaLogic();
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			//this.sistemaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sistemaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSistema);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSistema!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSistema);	
					}
					
					if(this.jInternalFrameImportacionSistema!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSistema);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySistema!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySistema);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSistema!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSistema);
				this.jInternalFrameDetalleFormSistema.setVisible(false);
				this.jInternalFrameDetalleFormSistema.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSistema!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSistema);
					this.jInternalFrameReporteDinamicoSistema.setVisible(false);
					this.jInternalFrameReporteDinamicoSistema.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSistema!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSistema);
					this.jInternalFrameImportacionSistema.setVisible(false);
					this.jInternalFrameImportacionSistema.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySistema!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySistema);
					this.jInternalFrameOrderBySistema.setVisible(false);
					this.jInternalFrameOrderBySistema.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSistemaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SistemaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			this.sistemaParameterGeneral=new SistemaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sistemaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SistemaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PerfilConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(OpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PaqueteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ModuloConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SistemaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sistemaSessionBean.getEsGuardarRelacionado(),this.sistemaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SistemaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sistemaSessionBean.getEsGuardarRelacionado(),this.sistemaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaDuplicarSistema=true;
			this.isVisibilidadCeldaCopiarSistema=true;
			this.isVisibilidadCeldaVerFormSistema=true;
			this.isVisibilidadCeldaOrdenSistema=true;
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
			this.isVisibilidadCeldaModificarSistema=false;
			this.isVisibilidadCeldaActualizarSistema=false;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=false;
			this.isVisibilidadCeldaGuardarSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombrePrincipal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSistema("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSistema();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSistema(false);
			
			this.setPermisosUsuarioSistema();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sistemaSessionBean.getEsGuardarRelacionado() 
				|| (this.sistemaSessionBean.getEsGuardarRelacionado() && this.sistemaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSistemaClasesRelacionadas();
			}
			
			if(this.sistemaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSistemaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SistemaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSistema();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSistema();
			}
			
			if(!this.isPermisoBusquedaSistema) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSistema.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSistema,this.isPermisoPaginacionMedioSistema,this.isPermisoPaginacionTodoSistema);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SistemaConstantesFunciones.getTiposSeleccionarSistema());
				
				this.tiposColumnasSelect=SistemaConstantesFunciones.getTiposSeleccionarSistema(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSistema();				
				//this.tiposRelacionesSelect=SistemaConstantesFunciones.getTiposRelacionesSistema(true);
				
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
			//if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSistema();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioSistema(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioSistema(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSistema() ;
			
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
			
			
			this.perfilLogic=new PerfilLogic();
			this.opcionLogic=new OpcionLogic();
			this.paqueteLogic=new PaqueteLogic();
			this.moduloLogic=new ModuloLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				sistemaImplementable= (SistemaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SistemaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sistemaImplementableHome= (SistemaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SistemaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sistemas= new ArrayList<Sistema>();
			this.sistemasEliminados= new ArrayList<Sistema>();
						
			this.isEsNuevoSistema=false;
			this.esParaAccionDesdeFormularioSistema=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySistema(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSistema();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SistemaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SistemaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSistema("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSistema(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSistema!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSistema();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSistema();
			}
			
			SistemaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSistema.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSistema.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSistema.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSistema(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Sistema: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSistema() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PerfilConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(OpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(OpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PaqueteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PaqueteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ModuloConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ModuloConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSistema")) {
				iIndex=this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSistema.getSelectedRow();	
				
				

				if(sTitle.equals("Modulos")) {
					if(!ModuloJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSistema();

						this.cargarParteTabPanelRelacionadaModulo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Opciones")) {
					if(!OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSistema();

						this.cargarParteTabPanelRelacionadaOpcion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Paquetes")) {
					if(!PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSistema();

						this.cargarParteTabPanelRelacionadaPaquete(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Perfiles")) {
					if(!PerfilJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSistema();

						this.cargarParteTabPanelRelacionadaPerfil(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSistema();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaModulo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSistema.cargarSessionConBeanSwingJInternalFrameModulo(false,true,iIndex);
		this.jButtonModuloActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaModulo();

		//this.jTabbedPaneRelacionesSistema.updateUI();
		//this.jTabbedPaneRelacionesSistema.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSistema.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSistema.cargarSessionConBeanSwingJInternalFrameOpcion(false,true,iIndex);
		this.jButtonOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOpcion();

		//this.jTabbedPaneRelacionesSistema.updateUI();
		//this.jTabbedPaneRelacionesSistema.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSistema.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPaquete(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSistema.cargarSessionConBeanSwingJInternalFramePaquete(false,true,iIndex);
		this.jButtonPaqueteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPaquete();

		//this.jTabbedPaneRelacionesSistema.updateUI();
		//this.jTabbedPaneRelacionesSistema.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSistema.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfil(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSistema.cargarSessionConBeanSwingJInternalFramePerfil(false,true,iIndex);
		this.jButtonPerfilActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfil();

		//this.jTabbedPaneRelacionesSistema.updateUI();
		//this.jTabbedPaneRelacionesSistema.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSistema.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Perfil")) {
				int row=this.jTableDatosSistema.getSelectedRow();
				jButtonPerfilActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Opcion")) {
				int row=this.jTableDatosSistema.getSelectedRow();
				jButtonOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Paquete")) {
				int row=this.jTableDatosSistema.getSelectedRow();
				jButtonPaqueteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Modulo")) {
				int row=this.jTableDatosSistema.getSelectedRow();
				jButtonModuloActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Perfil")) {

					if(this.isTienePermisosPerfil && this.sistemaConstantesFunciones.mostrarPerfilSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Perfiles"+"("+PerfilConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfiles");

						if(sistemaConstantesFunciones.resaltarPerfilSistema!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFunciones.resaltarPerfilSistema);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFunciones.activarPerfilSistema);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Perfil"));

						

						this.jInternalFrameDetalleFormSistema.jmenuDetalleSistema.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Opcion")) {

					if(this.isTienePermisosOpcion && this.sistemaConstantesFunciones.mostrarOpcionSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Opciones"+"("+OpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Opciones");

						if(sistemaConstantesFunciones.resaltarOpcionSistema!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFunciones.resaltarOpcionSistema);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFunciones.activarOpcionSistema);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Opcion"));

						

						this.jInternalFrameDetalleFormSistema.jmenuDetalleSistema.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Paquete")) {

					if(this.isTienePermisosPaquete && this.sistemaConstantesFunciones.mostrarPaqueteSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Paquetes"+"("+PaqueteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Paquetes");

						if(sistemaConstantesFunciones.resaltarPaqueteSistema!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFunciones.resaltarPaqueteSistema);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFunciones.activarPaqueteSistema);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Paquete"));

						

						this.jInternalFrameDetalleFormSistema.jmenuDetalleSistema.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Modulo")) {

					if(this.isTienePermisosModulo && this.sistemaConstantesFunciones.mostrarModuloSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Modulos"+"("+ModuloConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Modulos");

						if(sistemaConstantesFunciones.resaltarModuloSistema!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(sistemaConstantesFunciones.resaltarModuloSistema);
						}

						jmenuItem.setEnabled(this.sistemaConstantesFunciones.activarModuloSistema);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Modulo"));

						

						this.jInternalFrameDetalleFormSistema.jmenuDetalleSistema.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySistema(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySistema(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySistemaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySistema();
		
		this.cargarCombosFrameForeignKeySistema();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySistema();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySistema();
		}
	}
	
	
	
	public void jButtonNuevoSistemaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sistemaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			
			if(jTableDatosSistema.getRowCount()>=1) {
				jTableDatosSistema.removeRowSelectionInterval(0, jTableDatosSistema.getRowCount()-1);						
			}
			
			this.isEsNuevoSistema=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSistema(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSistema(true);			
			//this.sistema=new Sistema();
			//this.sistema.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSistema(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSistema() ;
			
			if(SistemaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSistema(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sistema);	
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);				
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			if(this.sistemaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Sistema: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSistemaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSistema.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSistema.getSelectedRows().length;			
			}
			
			sistemasSeleccionados=this.getSistemasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSistema--;			
				//Sistema sistemaAux= new Sistema();			
				//sistemaAux.setId(this.iIdNuevoSistema);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Sistema sistemaOrigen=new Sistema();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Sistema sistemaOrigen : sistemasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSistema.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sistemaOrigen =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sistemaOrigen =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSistema();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sistema.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSistema(sistemaOrigen,this.sistema,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sistemaLogic.getSistemas().add(this.sistemaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sistemas.add(this.sistemaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSistema(false);
				
				this.jTableDatosSistema.setRowSelectionInterval(this.getIndiceNuevoSistema(), this.getIndiceNuevoSistema());
				
				int iLastRow =  this.jTableDatosSistema.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSistema.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSistema.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSistema(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();									
		
			Sistema sistemaOrigen=new Sistema();
			Sistema sistemaDestino=new Sistema();
				
			sistemasSeleccionados=this.getSistemasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSistema.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sistemasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSistema.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaOrigen =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sistemaOrigen =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sistemaDestino =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sistemaDestino =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sistemaOrigen =sistemasSeleccionados.get(0);
				sistemaDestino =sistemasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSistema(sistemaOrigen,sistemaDestino,true,false);
				
				sistemaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sistemaDestino,sistemaLogic.getSistemas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sistemaDestino,sistemas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSistema(false);
				
				//this.jTableDatosSistema.setRowSelectionInterval(this.getIndiceNuevoSistema(), this.getIndiceNuevoSistema());
				
				int iLastRow =  this.jTableDatosSistema.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSistema.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSistema.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSistema(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSistema.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSistema.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSistema.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSistema.setVisible(!isVisible);
			this.jPanelPaginacionSistema.setVisible(!isVisible);
			this.jPanelAccionesSistema.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSistema();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSistema();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSistema();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySistema();
			
			this.abrirFrameOrderBySistema();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySistema();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSistema(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSistema);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSistema.isMaximum()) {
					this.jInternalFrameDetalleFormSistema.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSistema.setSize(this.jInternalFrameDetalleFormSistema.iWidthFormulario,this.jInternalFrameDetalleFormSistema.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSistema.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSistema.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSistema.isMaximum()) {
						this.jInternalFrameDetalleFormSistema.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),SistemaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),SistemaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),SistemaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ModuloJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaModulo();
					}

					if(OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOpcion();
					}

					if(PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPaquete();
					}

					if(PerfilJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfil();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSistema.setVisible(true);
	        this.jInternalFrameDetalleFormSistema.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySistema() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySistema==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySistema=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySistema,false,this);
				} else {
					this.jInternalFrameOrderBySistema=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySistema,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySistema);
				this.jInternalFrameOrderBySistema.setVisible(false);
				this.jInternalFrameOrderBySistema.setSelected(false);
				
				this.jInternalFrameOrderBySistema.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySistema"));
				
				this.inicializarActualizarBindingTablaOrderBySistema();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSistema() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSistema==null) {
				
				this.jInternalFrameImportacionSistema=new ImportacionJInternalFrame(SistemaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSistema);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSistema);
				this.jInternalFrameImportacionSistema.setVisible(false);
				this.jInternalFrameImportacionSistema.setSelected(false);


				this.jInternalFrameImportacionSistema.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSistema"));
				this.jInternalFrameImportacionSistema.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSistema"));
				this.jInternalFrameImportacionSistema.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSistema"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSistema() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSistema==null) {
				this.jInternalFrameReporteDinamicoSistema=new ReporteDinamicoJInternalFrame(SistemaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSistema);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSistema);
				this.jInternalFrameReporteDinamicoSistema.setVisible(false);
				this.jInternalFrameReporteDinamicoSistema.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSistema.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSistema"));
				this.jInternalFrameReporteDinamicoSistema.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSistema"));
				this.jInternalFrameReporteDinamicoSistema.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSistema"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSistema();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaModulo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPaquete() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.jScrollPanelDatosPaquete.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.jScrollPanelDatosPaquete.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.jScrollPanelDatosPaquete.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.jScrollPanelDatosPaquete.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPerfil() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSistema.jContentPaneDetalleSistema.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSistema() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSistema);
			
	       	this.jInternalFrameDetalleFormSistema.setVisible(false);
	        this.jInternalFrameDetalleFormSistema.setSelected(false);
			
			//this.jInternalFrameDetalleFormSistema.dispose();
			//this.jInternalFrameDetalleFormSistema=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSistema() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSistema.setVisible(true);
	        this.jInternalFrameReporteDinamicoSistema.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSistema() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSistema.setVisible(true);
	        this.jInternalFrameImportacionSistema.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySistema() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySistema.setVisible(true);
	        this.jInternalFrameOrderBySistema.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySistema() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySistema.setVisible(false);
	        this.jInternalFrameOrderBySistema.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSistema() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSistema.setVisible(false);
	        this.jInternalFrameReporteDinamicoSistema.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSistema() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSistema.setVisible(false);
	        this.jInternalFrameImportacionSistema.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSistema(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSistema(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSistema.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSistema(true);
			//this.isEsNuevoSistema=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSistema("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSistema(false) ;
			
			if(sistemaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilSessionBean.getEsGuardarRelacionado() && PerfilJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado() && OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteSessionBean.getEsGuardarRelacionado() && PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPaqueteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloSessionBean.getEsGuardarRelacionado() && ModuloJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonModuloActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SistemaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSistema(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSistema(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSistemaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSistema(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSistema.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSistema(true);
			//this.isEsNuevoSistema=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sistema.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSistema("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSistema(false) ;
			
			if(SistemaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSistema(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSistema(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSistema(false);
			
			//if(!this.isEsNuevoSistema) {								
				int intSelectedRow = this.jTableDatosSistema.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				
			}
			
			if(this.permiteMantenimiento(this.sistema)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sistemaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSistema=true;
					this.inicializarActualizarBindingTablaSistema(false);
					this.isEsNuevoSistema=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSistema=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSistema=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSistema(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSistema(false);
				
				this.habilitarDeshabilitarControlesSistema(false);
			
												
				
				if(SistemaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSistema();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSistemaActionPerformed(evt,sistemaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSistema(this.sistema,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSistema.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sistemaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sistema.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSistemaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSistema.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				this.sistema.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				this.sistema.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sistema)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sistemaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SistemaModel) this.jTableDatosSistema.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSistema=true;
				this.inicializarActualizarBindingTablaSistema(false);
				this.isEsNuevoSistema=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSistema(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSistema(false);
				
				this.habilitarDeshabilitarControlesSistema(false);
				
				
				
				if(SistemaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSistema();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSistemaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSistema.getRowCount()>=1) {
				jTableDatosSistema.removeRowSelectionInterval(0, jTableDatosSistema.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSistema(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSistema(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSistema(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSistema(false) ;
			
			this.isEsNuevoSistema=false;
			
			if(SistemaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSistema();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSistemaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSistema(false);
				
				//SI ES MANUAL
				if(SistemaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSistema();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSistemaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSistema--;			
			//Sistema sistemaAux= new Sistema();			
			//sistemaAux.setId(this.iIdNuevoSistema);
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSistema();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
			
			this.sistema.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sistemaLogic.getSistemas().add(this.sistemaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sistemas.add(this.sistemaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSistema(false);
			
			this.jTableDatosSistema.setRowSelectionInterval(this.getIndiceNuevoSistema(), this.getIndiceNuevoSistema());
			
			int iLastRow =  this.jTableDatosSistema.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSistema.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSistema.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSistema(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSistemaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSistema(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSistema(false);
			
			//SI ES MANUAL
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSistema();
			}
			
			//this.abrirFrameTreeSistema();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSistemaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SistemaS ?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSistema.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSistema();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.sistemaReturnGeneral=sistemaLogic.procesarImportacionSistemasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.sistemaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSistemaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSistemaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSistema.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSistema.setFileImportacion(this.jInternalFrameImportacionSistema.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSistema.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSistema.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSistema.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSistema.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSistemaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		

		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SistemaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SistemaBaseDesign.jrxml";
			
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
			
			this.generarReporteSistemas("Todos",sistemasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SistemaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbrePrincipal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbrePrincipal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbrePrincipal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbrePrincipal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSecundario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSecundario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSecundario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSecundario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SistemaConstantesFunciones.LABEL_ESTADO:
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
		
		if(this.jInternalFrameReporteDinamicoSistema.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SistemaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL:
					sNombreCampoCategoria="nombre_principal";
					break;

				case SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO:
					sNombreCampoCategoria="nombre_secundario";
					break;

				case SistemaConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SistemaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL:
					sNombreCampoCategoriaValor="nombre_principal";
					break;

				case SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO:
					sNombreCampoCategoriaValor="nombre_secundario";
					break;

				case SistemaConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSistema.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSistema.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SistemaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Principal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_principal");
					break;

				case SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Secundario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_secundario");
					break;

				case SistemaConstantesFunciones.LABEL_ESTADO:
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
	
	public void jButtonGenerarExcelReporteDinamicoSistemaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Sistemas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SistemaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SistemaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Sistema sistema:sistemasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sistema.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL);
					iRow++;

					for(Sistema sistema:sistemasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sistema.getnombre_principal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO);
					iRow++;

					for(Sistema sistema:sistemasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sistema.getnombre_secundario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SistemaConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SistemaConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(Sistema sistema:sistemasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sistema.getestado());
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
			//	this.getFilaCabeceraExportarExcelSistema(row);				
			//	iRow++;
			//}				
			
			//for(Sistema sistemaAux:sistemasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSistema(sistemaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
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
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSistema(false);
			
			//SI ES MANUAL
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSistema();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSistemaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSistema(false);
			
			//SI ES MANUAL
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSistema();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSistemaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSistema(false);
			
			//SI ES MANUAL
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSistema();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSistema() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSistema.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSistema.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSistema.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSistema.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSistema.setMinimumSize(dimensionMinimum);
		this.jTableDatosSistema.setMaximumSize(dimensionMaximum);
		this.jTableDatosSistema.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSistema(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSistema(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSistema(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSistema(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSistema(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSistema(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSistema(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSistema(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SistemaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SistemaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSistema() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSistema();
		
		this.inicializarActualizarBindingBotonesManualSistema(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSistema();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSistema() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSistema(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSistema(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSistema.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSistema.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSistema.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSistema!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSistema.jCheckBoxPostAccionNuevoSistema.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSistema.jCheckBoxPostAccionSinCerrarSistema.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSistema.jCheckBoxPostAccionSinMensajeSistema.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSistema.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSistema.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSistema.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSistema!=null) {
				this.jInternalFrameDetalleFormSistema.jCheckBoxPostAccionNuevoSistema.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSistema.jCheckBoxPostAccionSinCerrarSistema.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSistema.jCheckBoxPostAccionSinMensajeSistema.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSistema.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSistema.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSistema.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSistema!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSistema.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSistema.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSistema.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSistema.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSistema!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSistema.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSistema.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSistema(Boolean esInicializar) throws Exception {
		try	{	
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSistema(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSistema() throws Exception {
		try	{
			if(SistemaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSistema();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSistema() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSistema() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSistema.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSistema.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSistema.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSistema.addItem(reporte);
			}
			
			
			if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSistema.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSistema.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSistema.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSistema.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSistema.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSistema.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSistema.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSistema();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSistema() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSistema!=null) {
				this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSistema!=null) {
				this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSistema.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSistema!=null) {
				
				if(this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSistema.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSistema.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSistema.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSistema.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSistema()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoSistema.getText();
		this.nombre_principalBusquedaPorNombrePrincipal=this.jTextAreanombre_principalBusquedaPorNombrePrincipalSistema.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSistema(Boolean esInicializar) throws Exception {				
		if(SistemaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSistema();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSistema() throws Exception {
		this.inicializarActualizarBindingTablaSistema(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySistema() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySistema.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySistema.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSistemaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistemaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySistema.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySistema.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSistema(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sistemaLogic.getSistemas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sistemas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSistema.setModel(new SistemaModel(this.sistemaLogic.getSistemas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSistema.setModel(new SistemaModel(this.sistemas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySistema!=null && this.jInternalFrameOrderBySistema.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySistema();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SistemaConstantesFunciones.SCLASSWEBTITULO,sistemaConstantesFunciones.resaltarSeleccionarSistema,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SistemaConstantesFunciones.SCLASSWEBTITULO,sistemaConstantesFunciones.resaltarSeleccionarSistema,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,SistemaConstantesFunciones.LABEL_ID));

		if(this.sistemaConstantesFunciones.mostraridSistema && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SistemaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sistemaConstantesFunciones.resaltaridSistema,this.sistemaConstantesFunciones.activaridSistema,this,true,"idSistema","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sistemaConstantesFunciones.resaltaridSistema,this.sistemaConstantesFunciones.activaridSistema,this,true,"idSistema","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,SistemaConstantesFunciones.LABEL_CODIGO));

		if(this.sistemaConstantesFunciones.mostrarcodigoSistema && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SistemaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sistemaConstantesFunciones.resaltarcodigoSistema,this.sistemaConstantesFunciones.activarcodigoSistema,this,true,"codigoSistema","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sistemaConstantesFunciones.resaltarcodigoSistema,this.sistemaConstantesFunciones.activarcodigoSistema,this,true,"codigoSistema","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL));

		if(this.sistemaConstantesFunciones.mostrarnombre_principalSistema && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sistemaConstantesFunciones.resaltarnombre_principalSistema,this.sistemaConstantesFunciones.activarnombre_principalSistema,this,true,"nombre_principalSistema","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sistemaConstantesFunciones.resaltarnombre_principalSistema,this.sistemaConstantesFunciones.activarnombre_principalSistema,this,true,"nombre_principalSistema","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO));

		if(this.sistemaConstantesFunciones.mostrarnombre_secundarioSistema && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sistemaConstantesFunciones.resaltarnombre_secundarioSistema,this.sistemaConstantesFunciones.activarnombre_secundarioSistema,this,true,"nombre_secundarioSistema","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sistemaConstantesFunciones.resaltarnombre_secundarioSistema,this.sistemaConstantesFunciones.activarnombre_secundarioSistema,this,true,"nombre_secundarioSistema","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,SistemaConstantesFunciones.LABEL_ESTADO));

		if(this.sistemaConstantesFunciones.mostrarestadoSistema && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SistemaConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.sistemaConstantesFunciones.resaltarestadoSistema,this.sistemaConstantesFunciones.activarestadoSistema));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.sistemaConstantesFunciones.resaltarestadoSistema,this.sistemaConstantesFunciones.activarestadoSistema,this,true,"estadoSistema","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SistemaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sistemaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPerfil && this.sistemaConstantesFunciones.mostrarPerfilSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Perfiles");
				tableColumn.setHeaderValue("Perfiles");
				tableColumn.setCellRenderer(new PerfilTableCell(sistemaConstantesFunciones.resaltarPerfilSistema,this,this.sistemaConstantesFunciones.activarPerfilSistema));
				tableColumn.setCellEditor(new PerfilTableCell(sistemaConstantesFunciones.resaltarPerfilSistema,this,this.sistemaConstantesFunciones.activarPerfilSistema));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSistema.addColumn(tableColumn);
			}

			if(this.isTienePermisosOpcion && this.sistemaConstantesFunciones.mostrarOpcionSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Opciones");
				tableColumn.setHeaderValue("Opciones");
				tableColumn.setCellRenderer(new OpcionTableCell(sistemaConstantesFunciones.resaltarOpcionSistema,this,this.sistemaConstantesFunciones.activarOpcionSistema));
				tableColumn.setCellEditor(new OpcionTableCell(sistemaConstantesFunciones.resaltarOpcionSistema,this,this.sistemaConstantesFunciones.activarOpcionSistema));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSistema.addColumn(tableColumn);
			}

			if(this.isTienePermisosPaquete && this.sistemaConstantesFunciones.mostrarPaqueteSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Paquetes");
				tableColumn.setHeaderValue("Paquetes");
				tableColumn.setCellRenderer(new PaqueteTableCell(sistemaConstantesFunciones.resaltarPaqueteSistema,this,this.sistemaConstantesFunciones.activarPaqueteSistema));
				tableColumn.setCellEditor(new PaqueteTableCell(sistemaConstantesFunciones.resaltarPaqueteSistema,this,this.sistemaConstantesFunciones.activarPaqueteSistema));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSistema.addColumn(tableColumn);
			}

			if(this.isTienePermisosModulo && this.sistemaConstantesFunciones.mostrarModuloSistema && !SistemaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Modulos");
				tableColumn.setHeaderValue("Modulos");
				tableColumn.setCellRenderer(new ModuloTableCell(sistemaConstantesFunciones.resaltarModuloSistema,this,this.sistemaConstantesFunciones.activarModuloSistema));
				tableColumn.setCellEditor(new ModuloTableCell(sistemaConstantesFunciones.resaltarModuloSistema,this,this.sistemaConstantesFunciones.activarModuloSistema));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSistema.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sistemaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sistemaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSistema.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				//tableColumn= new TableColumn();
				//tableColumn.setIdentifier(sLabelColumnAccion);
				//tableColumn.setHeaderValue(sLabelColumnAccion);
				//tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sistemaSessionBean.getEsGuardarRelacionado()));
				//tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sistemaSessionBean.getEsGuardarRelacionado()));
		
				//tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				//tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				//this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				//this.jTableDatosSistema.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSistema && this.isPermisoGuardarCambiosSistema) {
					//tableColumn= new TableColumn();
					//tableColumn.setIdentifier(Constantes2.S_ELI);
					//tableColumn.setHeaderValue(sLabelColumnAccionEli);
					//tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sistemaSessionBean.getEsGuardarRelacionado()));
					//tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sistemaSessionBean.getEsGuardarRelacionado()));
			
					//tableColumn.setPreferredWidth(65); 	 
					//tableColumn.setWidth(65); 	 
					//tableColumn.setMinWidth(65); 
					//tableColumn.setMaxWidth(65);
					
					//this.iWidthTableDefinicion+=65;
						
					//this.jTableDatosSistema.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.sistemaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosSistema.addColumn(tableColumn);
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
			
			this.jTableDatosSistema.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSistema && this.isPermisoGuardarCambiosSistema) {
				//iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		//iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.sistemaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSistema && this.isPermisoGuardarCambiosSistema) {
				////REUBICA ELIMINAR SIMPLE
				//jTableDatosSistema.moveColumn(this.jTableDatosSistema.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				//iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		//jTableDatosSistema.moveColumn(this.jTableDatosSistema.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.sistemaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSistema.moveColumn(this.jTableDatosSistema.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSistema.moveColumn(this.jTableDatosSistema.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSistema.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSistema.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSistema,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSistema.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSistema.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSistema.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSistema.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSistema.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=sistemaLogic.getSistemas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sistemas.size()-1;
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
		//this.jTableDatosSistema.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSistema.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSistema();
			
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
				
				//this.isEsNuevoSistema=false;
					
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
				if(this.sistemaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSistema==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSistema.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSistema.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sistema.getsType().equals("DUPLICADO")
				   || this.sistema.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSistema=true;
				
				} else {
					this.isEsNuevoSistema=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sistemaSessionBean.getEsGuardarRelacionado()) {
					if(this.sistema.getId()>=0 && !this.sistema.getIsNew()) {						
						this.isEsNuevoSistema=false;
						
					} else {
						this.isEsNuevoSistema=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSistema(esRelaciones);						
				
				this.seleccionarSistema(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sistema.getId()<0) {
					this.isEsNuevoSistema=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSistema(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSistema(evt,rowIndex);
				}	
				
				if(this.sistemaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Sistema: " + this.dDif); 
					}
				}								
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSistema(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sistema)) {
					if(this.sistema.getId()>0) {
						this.sistema.setIsDeleted(true);
						
						this.sistemasEliminados.add(this.sistema);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sistemaLogic.getSistemas().remove(this.sistema);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sistemas.remove(this.sistema);				
					}
					
					
					((SistemaModel) this.jTableDatosSistema.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSistema(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSistema(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSistema) {
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSistema.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSistema.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSistema(this.sistema);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSistema("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSistema(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSistema() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSistema(Sistema sistema) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSistema(sistema,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSistema(Sistema sistema,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSistema(sistema);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySistema(sistema,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySistema(sistema);
	}
	
	public void setVariablesObjetoActualToFormularioSistema(Sistema sistema) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSistema.jLabelidSistema.setText(sistema.getId().toString());
			this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setText(sistema.getcodigo());
			this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setText(sistema.getnombre_principal());
			this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setText(sistema.getnombre_secundario());
			this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setSelected(sistema.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Sistema sistemaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sistemaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Sistema sistemaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sistemaLocal=this.sistema;
			} else {
				sistemaLocal=this.sistemaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sistemaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSistema(sistemaLocal,true);
					
					if(sistemaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sistemaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sistemaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSistema(Sistema sistema,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSistema(sistema,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSistema(sistema);
	}
	
	public void setVariablesFormularioToObjetoActualSistema(Sistema sistema,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSistema(sistema,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSistema(Sistema sistema,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSistema.jLabelidSistema.getText()==null || this.jInternalFrameDetalleFormSistema.jLabelidSistema.getText()=="" || this.jInternalFrameDetalleFormSistema.jLabelidSistema.getText()=="Id") {
				this.jInternalFrameDetalleFormSistema.jLabelidSistema.setText("0");
			}

			if(conColumnasBase) {sistema.setId(Long.parseLong(this.jInternalFrameDetalleFormSistema.jLabelidSistema.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SistemaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelIdSistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setcodigo(this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SistemaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelcodigoSistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setnombre_principal(this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelnombre_principalSistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setnombre_secundario(this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelnombre_secundarioSistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sistema.setestado(this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SistemaConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSistema.jLabelestadoSistema,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSistema(Sistema sistemaBean,Sistema sistema,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSistema(Sistema sistemaOrigen,Sistema sistema,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sistemaOrigen.getId()!=null && !sistemaOrigen.getId().equals(0L))) {sistema.setId(sistemaOrigen.getId());}}
			if(conDefault || (!conDefault && sistemaOrigen.getcodigo()!=null && !sistemaOrigen.getcodigo().equals(""))) {sistema.setcodigo(sistemaOrigen.getcodigo());}
			if(conDefault || (!conDefault && sistemaOrigen.getnombre_principal()!=null && !sistemaOrigen.getnombre_principal().equals(""))) {sistema.setnombre_principal(sistemaOrigen.getnombre_principal());}
			if(conDefault || (!conDefault && sistemaOrigen.getnombre_secundario()!=null && !sistemaOrigen.getnombre_secundario().equals(""))) {sistema.setnombre_secundario(sistemaOrigen.getnombre_secundario());}
			if(conDefault || (!conDefault && sistemaOrigen.getestado()!=null && !sistemaOrigen.getestado().equals(false))) {sistema.setestado(sistemaOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSistema(Sistema sistema) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSistema.jLabelidSistema.setText(sistema.getId().toString());
			this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setText(sistema.getcodigo());
			this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setText(sistema.getnombre_principal());
			this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setText(sistema.getnombre_secundario());
			this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setSelected(sistema.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSistema(SistemaBean sistemaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSistema.jLabelidSistema.setText(sistemaBean.getId().toString());
			this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setText(sistemaBean.getcodigo());
			this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setText(sistemaBean.getnombre_principal());
			this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setText(sistemaBean.getnombre_secundario());
			this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setSelected(sistemaBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSistema(SistemaParameterReturnGeneral sistemaReturnGeneral,SistemaBean sistemaBean,Boolean conDefault) throws Exception { 
		try {
			Sistema sistemaLocal=new Sistema();
			
			sistemaLocal=sistemaReturnGeneral.getSistema();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sistemaLocal.getId()!=null && !sistemaLocal.getId().equals(0L))) {sistemaBean.setId(sistemaLocal.getId());}}
			if(conDefault || (!conDefault && sistemaLocal.getcodigo()!=null && !sistemaLocal.getcodigo().equals(""))) {sistemaBean.setcodigo(sistemaLocal.getcodigo());}
			if(conDefault || (!conDefault && sistemaLocal.getnombre_principal()!=null && !sistemaLocal.getnombre_principal().equals(""))) {sistemaBean.setnombre_principal(sistemaLocal.getnombre_principal());}
			if(conDefault || (!conDefault && sistemaLocal.getnombre_secundario()!=null && !sistemaLocal.getnombre_secundario().equals(""))) {sistemaBean.setnombre_secundario(sistemaLocal.getnombre_secundario());}
			if(conDefault || (!conDefault && sistemaLocal.getestado()!=null && !sistemaLocal.getestado().equals(false))) {sistemaBean.setestado(sistemaLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSistemaGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxSistema,List<Sistema> sistemasLocal)throws Exception {
		try {
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasLocal) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			jComboBoxSistema.setSelectedItem(sistemaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSistemaGenerico(JComboBox jComboBoxSistema,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSistema.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSistema.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSistema.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSistema.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSistema.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSistema.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Perfil")) {
			jButtonPerfilActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Opcion")) {
			jButtonOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Paquete")) {
			jButtonPaqueteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Modulo")) {
			jButtonModuloActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sistema=(Sistema) sistemaLogic.getSistemas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sistema =(Sistema) sistemas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Sistema sistemaRow=new Sistema();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sistemaRow=(Sistema) sistemaLogic.getSistemas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sistemaRow=(Sistema) sistemas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPerfilActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSistema==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						this.sistema = new Sistema();
					}
				}

				if(this.isTienePermisosPerfil && this.permiteMantenimiento(this.sistema)) {
					PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup=new PerfilBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup;
					} else {
						perfilBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();
					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//perfilBeanSwingJInternalFrame.perfilSessionBean.setConGuardarRelaciones(false);
						//perfilBeanSwingJInternalFrame.perfilSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSistema.cargarPerfilBeanSwingJInternalFrame(sistemas,this.sistema,perfilBeanSwingJInternalFrame,/*conInicializar,*/perfilBeanSwingJInternalFrame.perfilSessionBean.getConGuardarRelaciones(),perfilBeanSwingJInternalFrame.perfilSessionBean.getEsGuardarRelacionado());
					perfilBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilBeanSwingJInternalFrame.actualizarEstadoPanelsPerfil("no_relacionado");

						perfilBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilConstantesFunciones.ITAMANIOFILATABLA + (PerfilConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatosSistema.getBorder();
						TitledBorder titledBorderPerfil=(TitledBorder)perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

						titledBorderPerfil.setTitle(titledBorderSistema.getTitle() + " -> Perfil");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilBeanSwingJInternalFrame);
						}

						perfilBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilBeanSwingJInternalFrame);

						perfilBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.sistemaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSistema==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						this.sistema = new Sistema();
					}
				}

				if(this.isTienePermisosOpcion && this.permiteMantenimiento(this.sistema)) {
					OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						opcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup;
					} else {
						opcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();
					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//opcionBeanSwingJInternalFrame.opcionSessionBean.setConGuardarRelaciones(false);
						//opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					opcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSistema.cargarOpcionBeanSwingJInternalFrame(sistemas,this.sistema,opcionBeanSwingJInternalFrame,/*conInicializar,*/opcionBeanSwingJInternalFrame.opcionSessionBean.getConGuardarRelaciones(),opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado());
					opcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("no_relacionado");

						opcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(OpcionConstantesFunciones.ITAMANIOFILATABLA + (OpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						opcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatosSistema.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

						titledBorderOpcion.setTitle(titledBorderSistema.getTitle() + " -> Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}

						opcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

						opcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.sistemaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPaqueteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSistema==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						this.sistema = new Sistema();
					}
				}

				if(this.isTienePermisosPaquete && this.permiteMantenimiento(this.sistema)) {
					PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup=new PaqueteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						paqueteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup;
					} else {
						paqueteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();
					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//paqueteBeanSwingJInternalFrame.paqueteSessionBean.setConGuardarRelaciones(false);
						//paqueteBeanSwingJInternalFrame.paqueteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					paqueteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSistema.cargarPaqueteBeanSwingJInternalFrame(sistemas,this.sistema,paqueteBeanSwingJInternalFrame,/*conInicializar,*/paqueteBeanSwingJInternalFrame.paqueteSessionBean.getConGuardarRelaciones(),paqueteBeanSwingJInternalFrame.paqueteSessionBean.getEsGuardarRelacionado());
					paqueteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						paqueteBeanSwingJInternalFrame.actualizarEstadoPanelsPaquete("no_relacionado");

						paqueteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PaqueteConstantesFunciones.ITAMANIOFILATABLA + (PaqueteConstantesFunciones.ITAMANIOFILATABLA/2));

						paqueteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatosSistema.getBorder();
						TitledBorder titledBorderPaquete=(TitledBorder)paqueteBeanSwingJInternalFrame.jScrollPanelDatosPaquete.getBorder();

						titledBorderPaquete.setTitle(titledBorderSistema.getTitle() + " -> Paquete");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,paqueteBeanSwingJInternalFrame);
						}

						paqueteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(paqueteBeanSwingJInternalFrame);

						paqueteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.sistemaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Paquete",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonModuloActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Sistema sistema) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSistema==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema = (Sistema)this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.sistema = (Sistema)this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(sistema!=null) {
						this.sistema = sistema;
					} else {
						this.sistema = new Sistema();
					}
				}

				if(this.isTienePermisosModulo && this.permiteMantenimiento(this.sistema)) {
					ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup=new ModuloBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						moduloBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup;
					} else {
						moduloBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame;
					}

					List<Sistema> sistemas=new ArrayList<Sistema>();
					sistemas.add(this.sistema);
					if(!esRelacionado) {
						//moduloBeanSwingJInternalFrame.moduloSessionBean.setConGuardarRelaciones(false);
						//moduloBeanSwingJInternalFrame.moduloSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					moduloBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSistema.cargarModuloBeanSwingJInternalFrame(sistemas,this.sistema,moduloBeanSwingJInternalFrame,/*conInicializar,*/moduloBeanSwingJInternalFrame.moduloSessionBean.getConGuardarRelaciones(),moduloBeanSwingJInternalFrame.moduloSessionBean.getEsGuardarRelacionado());
					moduloBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						moduloBeanSwingJInternalFrame.actualizarEstadoPanelsModulo("no_relacionado");

						moduloBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ModuloConstantesFunciones.ITAMANIOFILATABLA + (ModuloConstantesFunciones.ITAMANIOFILATABLA/2));

						moduloBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSistema=(TitledBorder)this.jScrollPanelDatosSistema.getBorder();
						TitledBorder titledBorderModulo=(TitledBorder)moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

						titledBorderModulo.setTitle(titledBorderSistema.getTitle() + " -> Modulo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,moduloBeanSwingJInternalFrame);
						}

						moduloBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(moduloBeanSwingJInternalFrame);

						moduloBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.sistemaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Modulo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSistema(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSistema.setVisible((this.isVisibilidadCeldaNuevoSistema && this.isPermisoNuevoSistema));			
			this.jButtonDuplicarSistema.setVisible((this.isVisibilidadCeldaDuplicarSistema && this.isPermisoDuplicarSistema));			
			this.jButtonCopiarSistema.setVisible((this.isVisibilidadCeldaCopiarSistema && this.isPermisoCopiarSistema));
			this.jButtonVerFormSistema.setVisible((this.isVisibilidadCeldaVerFormSistema && this.isPermisoVerFormSistema));
			
			this.jButtonAbrirOrderBySistema.setVisible((this.isVisibilidadCeldaOrdenSistema && this.isPermisoOrdenSistema));			
			
			this.jButtonNuevoRelacionesSistema.setVisible((this.isVisibilidadCeldaNuevoRelacionesSistema && this.isPermisoNuevoSistema));			
			this.jButtonNuevoGuardarCambiosSistema.setVisible((this.isVisibilidadCeldaNuevoSistema && this.isPermisoNuevoSistema && this.isPermisoGuardarCambiosSistema));
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.jInternalFrameDetalleFormSistema.jButtonModificarSistema.setVisible((this.isVisibilidadCeldaModificarSistema && this.isPermisoActualizarSistema));	
			this.jInternalFrameDetalleFormSistema.jButtonActualizarSistema.setVisible((this.isVisibilidadCeldaActualizarSistema && this.isPermisoActualizarSistema));	
			this.jInternalFrameDetalleFormSistema.jButtonEliminarSistema.setVisible((this.isVisibilidadCeldaEliminarSistema && this.isPermisoEliminarSistema));
			this.jInternalFrameDetalleFormSistema.jButtonCancelarSistema.setVisible(this.isVisibilidadCeldaCancelarSistema);							
			this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.setVisible((this.isVisibilidadCeldaGuardarSistema && this.isPermisoGuardarCambiosSistema));			
			
			}
						
			this.jButtonGuardarCambiosTablaSistema.setVisible((this.isVisibilidadCeldaGuardarCambiosSistema && this.isPermisoGuardarCambiosSistema));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSistema.setVisible((this.isVisibilidadCeldaNuevoSistema && this.isPermisoNuevoSistema));						
			this.jButtonDuplicarToolBarSistema.setVisible((this.isVisibilidadCeldaDuplicarSistema && this.isPermisoDuplicarSistema));						
			this.jButtonCopiarToolBarSistema.setVisible((this.isVisibilidadCeldaCopiarSistema && this.isPermisoCopiarSistema));			
			this.jButtonVerFormToolBarSistema.setVisible((this.isVisibilidadCeldaVerFormSistema && this.isPermisoVerFormSistema));			
			this.jButtonAbrirOrderByToolBarSistema.setVisible((this.isVisibilidadCeldaOrdenSistema && this.isPermisoOrdenSistema));
			this.jButtonNuevoRelacionesToolBarSistema.setVisible((this.isVisibilidadCeldaNuevoRelacionesSistema && this.isPermisoNuevoSistema));			
			this.jButtonNuevoGuardarCambiosToolBarSistema.setVisible((this.isVisibilidadCeldaNuevoSistema && this.isPermisoNuevoSistema && this.isPermisoGuardarCambiosSistema));			
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.jInternalFrameDetalleFormSistema.jButtonModificarToolBarSistema.setVisible((this.isVisibilidadCeldaModificarSistema && this.isPermisoActualizarSistema));	
			this.jInternalFrameDetalleFormSistema.jButtonActualizarToolBarSistema.setVisible((this.isVisibilidadCeldaActualizarSistema  && this.isPermisoActualizarSistema));	
			this.jInternalFrameDetalleFormSistema.jButtonEliminarToolBarSistema.setVisible((this.isVisibilidadCeldaEliminarSistema && this.isPermisoEliminarSistema));
			this.jInternalFrameDetalleFormSistema.jButtonCancelarToolBarSistema.setVisible(this.isVisibilidadCeldaCancelarSistema);				
			this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosToolBarSistema.setVisible((this.isVisibilidadCeldaGuardarSistema && this.isPermisoGuardarCambiosSistema));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSistema.setVisible((this.isVisibilidadCeldaGuardarCambiosSistema && this.isPermisoGuardarCambiosSistema));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSistema.setVisible((this.isVisibilidadCeldaNuevoSistema && this.isPermisoNuevoSistema));			
			this.jMenuItemDuplicarSistema.setVisible((this.isVisibilidadCeldaDuplicarSistema && this.isPermisoDuplicarSistema));			
			this.jMenuItemCopiarSistema.setVisible((this.isVisibilidadCeldaCopiarSistema && this.isPermisoCopiarSistema));			
			this.jMenuItemVerFormSistema.setVisible((this.isVisibilidadCeldaVerFormSistema && this.isPermisoVerFormSistema));			
			this.jMenuItemAbrirOrderBySistema.setVisible((this.isVisibilidadCeldaOrdenSistema && this.isPermisoOrdenSistema));			
			//this.jMenuItemMostrarOcultarSistema.setVisible((this.isVisibilidadCeldaOrdenSistema && this.isPermisoOrdenSistema));
			this.jMenuItemDetalleAbrirOrderBySistema.setVisible((this.isVisibilidadCeldaOrdenSistema && this.isPermisoOrdenSistema));			
			//this.jMenuItemDetalleMostrarOcultarSistema.setVisible((this.isVisibilidadCeldaOrdenSistema && this.isPermisoOrdenSistema));			
			this.jMenuItemNuevoRelacionesSistema.setVisible((this.isVisibilidadCeldaNuevoRelacionesSistema && this.isPermisoNuevoSistema));			
			this.jMenuItemNuevoGuardarCambiosSistema.setVisible((this.isVisibilidadCeldaNuevoSistema && this.isPermisoNuevoSistema && this.isPermisoGuardarCambiosSistema));									
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.jInternalFrameDetalleFormSistema.jMenuItemModificarSistema.setVisible((this.isVisibilidadCeldaModificarSistema && this.isPermisoActualizarSistema));	
			this.jInternalFrameDetalleFormSistema.jMenuItemActualizarSistema.setVisible((this.isVisibilidadCeldaActualizarSistema && this.isPermisoActualizarSistema));	
			this.jInternalFrameDetalleFormSistema.jMenuItemEliminarSistema.setVisible((this.isVisibilidadCeldaEliminarSistema && this.isPermisoEliminarSistema));
			this.jInternalFrameDetalleFormSistema.jMenuItemCancelarSistema.setVisible(this.isVisibilidadCeldaCancelarSistema);				
			}
			
			this.jMenuItemGuardarCambiosSistema.setVisible((this.isVisibilidadCeldaGuardarSistema && this.isPermisoGuardarCambiosSistema));						
			this.jMenuItemGuardarCambiosTablaSistema.setVisible((this.isVisibilidadCeldaGuardarCambiosSistema && this.isPermisoGuardarCambiosSistema));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSistema=this.jButtonNuevoSistema.isVisible();
			this.isVisibilidadCeldaDuplicarSistema=this.jButtonDuplicarSistema.isVisible();
			this.isVisibilidadCeldaCopiarSistema=this.jButtonCopiarSistema.isVisible();
			this.isVisibilidadCeldaVerFormSistema=this.jButtonVerFormSistema.isVisible();
			
			this.isVisibilidadCeldaOrdenSistema=this.jButtonAbrirOrderBySistema.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSistema=this.jButtonNuevoRelacionesSistema.isVisible();
			this.isVisibilidadCeldaModificarSistema=this.jButtonModificarSistema.isVisible();
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.isVisibilidadCeldaActualizarSistema=this.jInternalFrameDetalleFormSistema.jButtonActualizarSistema.isVisible();
			this.isVisibilidadCeldaEliminarSistema=this.jInternalFrameDetalleFormSistema.jButtonEliminarSistema.isVisible();
			this.isVisibilidadCeldaCancelarSistema=this.jInternalFrameDetalleFormSistema.jButtonCancelarSistema.isVisible();
			this.isVisibilidadCeldaGuardarSistema=this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSistema=this.jButtonGuardarCambiosTablaSistema.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSistema=this.jButtonNuevoToolBarSistema.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSistema=this.jButtonNuevoRelacionesToolBarSistema.isVisible();
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.isVisibilidadCeldaModificarSistema=this.jInternalFrameDetalleFormSistema.jButtonModificarToolBarSistema.isVisible();
			this.isVisibilidadCeldaActualizarSistema=this.jInternalFrameDetalleFormSistema.jButtonActualizarToolBarSistema.isVisible();
			this.isVisibilidadCeldaEliminarSistema=this.jInternalFrameDetalleFormSistema.jButtonEliminarToolBarSistema.isVisible();
			this.isVisibilidadCeldaCancelarSistema=this.jInternalFrameDetalleFormSistema.jButtonCancelarToolBarSistema.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSistema=this.jButtonGuardarCambiosToolBarSistema.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSistema=this.jButtonGuardarCambiosTablaToolBarSistema.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSistema=this.jMenuItemNuevoSistema.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSistema=this.jMenuItemNuevoRelacionesSistema.isVisible();
			
			if(this.jInternalFrameDetalleFormSistema!=null) {
			this.isVisibilidadCeldaModificarSistema=this.jInternalFrameDetalleFormSistema.jMenuItemModificarSistema.isVisible();
			this.isVisibilidadCeldaActualizarSistema=this.jInternalFrameDetalleFormSistema.jMenuItemActualizarSistema.isVisible();
			this.isVisibilidadCeldaEliminarSistema=this.jInternalFrameDetalleFormSistema.jMenuItemEliminarSistema.isVisible();
			this.isVisibilidadCeldaCancelarSistema=this.jInternalFrameDetalleFormSistema.jMenuItemCancelarSistema.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSistema=this.jMenuItemGuardarCambiosSistema.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSistema=this.jMenuItemGuardarCambiosTablaSistema.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSistema(Boolean esInicializar) {
		if(SistemaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sistemaSessionBean.getConGuardarRelaciones()) {
				//if(this.sistemaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSistema();
			}
			
			this.inicializarActualizarBindingBotonesManualSistema(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSistema() {
		this.jButtonNuevoSistema.setVisible(this.isPermisoNuevoSistema);			
		this.jButtonDuplicarSistema.setVisible(this.isPermisoDuplicarSistema);			
		this.jButtonCopiarSistema.setVisible(this.isPermisoCopiarSistema);			
		this.jButtonVerFormSistema.setVisible(this.isPermisoVerFormSistema);			
		
		this.jButtonAbrirOrderBySistema.setVisible(this.isPermisoOrdenSistema);					
		
		this.jButtonNuevoRelacionesSistema.setVisible(this.isPermisoNuevoSistema);			
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonModificarSistema.setVisible(this.isPermisoActualizarSistema);	
			this.jInternalFrameDetalleFormSistema.jButtonActualizarSistema.setVisible(this.isPermisoActualizarSistema);	
			this.jInternalFrameDetalleFormSistema.jButtonEliminarSistema.setVisible(this.isPermisoEliminarSistema);
			this.jInternalFrameDetalleFormSistema.jButtonCancelarSistema.setVisible(this.isVisibilidadCeldaCancelarSistema);						
			this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.setVisible(this.isPermisoGuardarCambiosSistema);							
		}
		
		this.jButtonGuardarCambiosTablaSistema.setVisible(this.isPermisoActualizarSistema);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSistema() {
		this.jInternalFrameDetalleFormSistema.jButtonModificarSistema.setVisible(this.isPermisoActualizarSistema);	
		this.jInternalFrameDetalleFormSistema.jButtonActualizarSistema.setVisible(this.isPermisoActualizarSistema);	
		this.jInternalFrameDetalleFormSistema.jButtonEliminarSistema.setVisible(this.isPermisoEliminarSistema);
		this.jInternalFrameDetalleFormSistema.jButtonCancelarSistema.setVisible(this.isVisibilidadCeldaCancelarSistema);							
		this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.setVisible((this.isVisibilidadCeldaGuardarSistema && this.isPermisoGuardarCambiosSistema));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSistema() {
		if(SistemaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSistema();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSistema() {
	}
	
	public void jTableDatosSistemaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSistema(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSistemaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSistema.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSistema(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				}

				if(this.sistema.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sistema.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSistema(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSistemaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSistema.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSistema(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				}

				if(this.sistema.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.sistema.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSistema(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_principalSistemaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSistema.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSistema(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				}

				if(this.sistema.getnombre_principal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_principal like '%"+this.sistema.getnombre_principal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSistema(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_secundarioSistemaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSistema.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSistema(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				}

				if(this.sistema.getnombre_secundario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_secundario like '%"+this.sistema.getnombre_secundario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSistema(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoSistemaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSistema.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSistema(this.getsistema(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sistema==null) {
						this.sistema = new Sistema();
					}

					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);
				}

				if(this.sistema.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.sistema.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSistema(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoSistemaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSistema(false,false);

			this.getSistemasBusquedaPorCodigo();

			this.inicializarActualizarBindingSistema(false);

			//if(SistemaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSistema(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombrePrincipalSistemaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSistema(false,false);

			this.getSistemasBusquedaPorNombrePrincipal();

			this.inicializarActualizarBindingSistema(false);

			//if(SistemaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSistema(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sistemaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSistema() {
		if(this.jInternalFrameDetalleFormSistema!=null) {
		

		if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
			this.jInternalFrameDetalleFormSistema.setVisible(false);	    			
			this.jInternalFrameDetalleFormSistema.dispose();
			this.jInternalFrameDetalleFormSistema=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSistema!=null) {
			this.jInternalFrameReporteDinamicoSistema.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSistema.dispose();
			this.jInternalFrameReporteDinamicoSistema=null;
		}
		
		if(this.jInternalFrameImportacionSistema!=null) {
			this.jInternalFrameImportacionSistema.setVisible(false);	    			
			this.jInternalFrameImportacionSistema.dispose();
			this.jInternalFrameImportacionSistema=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSistema();
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			
			if(sTipo.equals("NuevoSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSistema")) {
				jButtonDuplicarSistemaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSistema")) {
				jButtonCopiarSistemaActionPerformed(evt);
			} else if(sTipo.equals("VerFormSistema")) {
				jButtonVerFormSistemaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSistema")) {
				jButtonDuplicarSistemaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSistema")) {
				jButtonDuplicarSistemaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSistema")) {
				jButtonModificarSistemaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSistema")) {
				jButtonModificarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSistema")) {
				jButtonModificarSistemaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSistema")) {
				jButtonActualizarSistemaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSistema")) {
				jButtonActualizarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSistema")) {
				jButtonActualizarSistemaActionPerformed(evt);
			} else if(sTipo.equals("EliminarSistema")) {
				jButtonEliminarSistemaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSistema")) {
				jButtonEliminarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSistema")) {
				jButtonEliminarSistemaActionPerformed(evt);
			} else if(sTipo.equals("CancelarSistema")) {
				jButtonCancelarSistemaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSistema")) {
				jButtonCancelarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSistema")) {
				jButtonCancelarSistemaActionPerformed(evt);
			} else if(sTipo.equals("CerrarSistema")) {
				jButtonCerrarSistemaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSistema")) {
				jButtonCerrarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSistema")) {
				jButtonCerrarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSistema")) {
				jButtonMostrarOcultarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSistema")) {
				jButtonCancelarSistemaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSistema")) {
				jButtonCopiarSistemaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSistema")) {
				jButtonVerFormSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSistema")) {
				jButtonCopiarSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSistema")) {
				jButtonVerFormSistemaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSistema")) {
				jButtonRecargarInformacionSistemaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSistema")) {
				jButtonRecargarInformacionSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSistema")) {
				jButtonRecargarInformacionSistemaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSistema")) {
				jButtonAnterioresSistemaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSistema")) {
				jButtonAnterioresSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSistema")) {
				jButtonAnterioresSistemaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSistema")) {
				jButtonSiguientesSistemaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSistema")) {
				jButtonSiguientesSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSistema")) {
				jButtonSiguientesSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySistema") || sTipo.equals("MenuItemDetalleAbrirOrderBySistema")) {
				jButtonAbrirOrderBySistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSistema") || sTipo.equals("MenuItemDetalleMostrarOcultarSistema")) {
				jButtonMostrarOcultarSistemaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSistema")) {
				jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSistema")) {
				jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSistema")) {
				jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSistema")) {
				jButtonCerrarReporteDinamicoSistemaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSistema")) {
				jButtonGenerarReporteDinamicoSistemaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSistema")) {
				
				jButtonGenerarExcelReporteDinamicoSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSistema")) {
				jButtonCerrarImportacionSistemaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSistema")) {
				
				jButtonGenerarImportacionSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSistema")) {
				
				jButtonAbrirImportacionSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSistema")) {
				jComboBoxTiposAccionesSistemaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSistema")) {
				jComboBoxTiposRelacionesSistemaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSistema")) {
				jComboBoxTiposAccionesSistemaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSistema")) {
				
				jComboBoxTiposSeleccionarSistemaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSistema")) {
				jTextFieldValorCampoGeneralSistemaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySistema")) {
				jButtonAbrirOrderBySistemaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSistema")) {
				jButtonAbrirOrderBySistemaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySistema")) {
				jButtonCerrarOrderBySistemaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSistemaBusqueda")) {
				this.jButtonidSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSistemaBusqueda")) {
				this.jButtoncodigoSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_principalSistemaBusqueda")) {
				this.jButtonnombre_principalSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_secundarioSistemaBusqueda")) {
				this.jButtonnombre_secundarioSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoSistemaBusqueda")) {
				this.jButtonestadoSistemaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoSistema")) {
				this.jButtonBusquedaPorCodigoSistemaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombrePrincipalSistema")) {
				this.jButtonBusquedaPorNombrePrincipalSistemaActionPerformed(evt);
			}
			
			;
			
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSistema();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Sistema sistemaLocal=null;
			
			if(!this.getEsControlTabla()) {
				sistemaLocal=this.sistema;
			} else {
				sistemaLocal=this.sistemaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
							
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
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
			
			


			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
								
						
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
								
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
							
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
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
			
			


			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
								
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSistema")) {
					jCheckBoxSeleccionarTodosSistemaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSistema")) {
					jCheckBoxSeleccionadosSistemaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSistema")) {
					
				}
				
				


				
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
												
				
				


				
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
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
			
			


			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSistemaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sistema);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sistema);
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
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
				
				


				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sistema.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sistema.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSistemaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sistemaAnterior =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sistemaAnterior =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSistema")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSistemaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSistema.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sistema =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sistema =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sistema);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSistema")) {
				
				}
				
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSistema")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSistema.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSistema")) {
			
			}
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSistema();
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			if(sTipo.equals("NuevoSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSistema")) {
				jButtonDuplicarSistemaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSistema")) {
				jButtonCopiarSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSistema")) {
				jButtonVerFormSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSistema")) {
				jButtonNuevoSistemaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSistema")) {
				jButtonModificarSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSistema")) {
				jButtonActualizarSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSistema")) {
				jButtonEliminarSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSistema")) {
				jButtonCancelarSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSistema")) {
				jButtonCerrarSistemaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSistema")) {
				jButtonGuardarCambiosSistemaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSistema")) {
				jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySistema")) {
				jButtonAbrirOrderBySistemaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSistema")) {
				jButtonRecargarInformacionSistemaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSistema")) {
				jButtonAnterioresSistemaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSistema")) {
				jButtonSiguientesSistemaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSistemaBusqueda")) {
				this.jButtonidSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSistemaBusqueda")) {
				this.jButtoncodigoSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_principalSistemaBusqueda")) {
				this.jButtonnombre_principalSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_secundarioSistemaBusqueda")) {
				this.jButtonnombre_secundarioSistemaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoSistemaBusqueda")) {
				this.jButtonestadoSistemaBusquedaActionPerformed(evt);
			}
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSistema();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSistema")) {
				closingInternalFrameSistema();
				
			} else if(sTipo.equals("jButtonCancelarSistema")) {
				JInternalFrameBase jInternalFrameDetalleFormSistema = (JInternalFrameBase)evt.getSource();
	            	
	            SistemaBeanSwingJInternalFrame jInternalFrameParent=(SistemaBeanSwingJInternalFrame)jInternalFrameDetalleFormSistema.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSistemaActionPerformed(null);
			}
			
			SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sistema,new Object(),this.sistemaParameterGeneral,this.sistemaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSistema(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSistema(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSistema(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sistema)) {
			if(!esControlTabla) {
				if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);			
				}
				
				if(this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSistema(this.sistema,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sistemaReturnGeneral=sistemaLogic.procesarEventosSistemasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistemaLogic.getSistemas(),this.sistema,this.sistemaParameterGeneral,this.isEsNuevoSistema,classes);//this.sistemaLogic.getSistema()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSistema(this.sistemaReturnGeneral,this.sistemaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sistemaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSistema(classes,this.sistemaReturnGeneral,this.sistemaBean,false);
					}
						
					if(this.sistemaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySistema(this.sistemaReturnGeneral.getSistema());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSistema(this.sistemaReturnGeneral.getSistema());	
					}
						
					if(this.sistemaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSistema(this.sistemaReturnGeneral.getSistema(),classes);//this.sistemaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSistema(this.sistema,classes);//this.sistemaBean);									
				}
			
				if(SistemaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSistema(this.sistema,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSistema(this.sistema);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sistemaAnterior!=null) {
						this.sistema=this.sistemaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sistemaReturnGeneral=sistemaLogic.procesarEventosSistemasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistemaLogic.getSistemas(),this.sistema,this.sistemaParameterGeneral,this.isEsNuevoSistema,classes);//this.sistemaLogic.getSistema()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sistemaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sistemaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sistemaReturnGeneral.getSistema(),sistemaLogic.getSistemas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sistemaReturnGeneral.getSistema(),this.sistemas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSistema.repaint();
				
				//((AbstractTableModel) this.jTableDatosSistema.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSistema();
			}
		}
	}
	
	public void actualizarVisualTableDatosSistema() throws Exception {
		
		SistemaModel sistemaModel=(SistemaModel)this.jTableDatosSistema.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sistemaModel.sistemas=this.sistemaLogic.getSistemas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sistemaModel.sistemas=this.sistemas;
		}
		
		
		((SistemaModel) this.jTableDatosSistema.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSistema() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsistemaAnterior(),this.sistemaLogic.getSistemas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsistemaAnterior(),this.sistemas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSistema();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSistema(Sistema sistema,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Perfil.class)) {
					this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.setPerfils(sistema.getPerfils());
					this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(sistema.getOpcions());
					this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Paquete.class)) {
					this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.setPaquetes(sistema.getPaquetes());
					this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPaquete(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Modulo.class)) {
					this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.setModulos(sistema.getModulos());
					this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
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
										
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistema,new Object(),generalEntityParameterGeneral,this.sistemaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sistemaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SistemaConstantesFunciones.getClassesRelationshipsOfSistema(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SistemaConstantesFunciones.getClassesRelationshipsFromStringsOfSistema(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSistema(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SistemaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sistema,new Object(),generalEntityParameterGeneral,this.sistemaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSistema(SistemaBean sistemaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Perfil.class)) {
					this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.setPerfils(sistema.getPerfils());
					this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(sistema.getOpcions());
					this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Paquete.class)) {
					this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.setPaquetes(sistema.getPaquetes());
					this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPaquete(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Modulo.class)) {
					this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.setModulos(sistema.getModulos());
					this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSistema(ArrayList<Classe> classes,SistemaReturnGeneral sistemaReturnGeneral,SistemaBean sistemaBean,Boolean conDefault) throws Exception {
		
			this.sistemaBean.setPerfils(sistemaReturnGeneral.getSistema().getPerfils());
			this.sistemaBean.setOpcions(sistemaReturnGeneral.getSistema().getOpcions());
			this.sistemaBean.setPaquetes(sistemaReturnGeneral.getSistema().getPaquetes());
			this.sistemaBean.setModulos(sistemaReturnGeneral.getSistema().getModulos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSistema(Sistema sistema,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Perfil.class)) {
					sistema.setPerfils(this.jInternalFrameDetalleFormSistema.perfilBeanSwingJInternalFrame.perfilLogic.getPerfils());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					sistema.setOpcions(this.jInternalFrameDetalleFormSistema.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Paquete.class)) {
					sistema.setPaquetes(this.jInternalFrameDetalleFormSistema.paqueteBeanSwingJInternalFrame.paqueteLogic.getPaquetes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Modulo.class)) {
					sistema.setModulos(this.jInternalFrameDetalleFormSistema.moduloBeanSwingJInternalFrame.moduloLogic.getModulos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.sistema)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSistema = new SistemaDetalleFormJInternalFrame(jDesktopPane,this.sistemaSessionBean.getConGuardarRelaciones(),this.sistemaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSistema);
		this.jInternalFrameDetalleFormSistema.setVisible(false);
		this.jInternalFrameDetalleFormSistema.setSelected(false);						
		
		this.jInternalFrameDetalleFormSistema.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSistema.sistemaLogic=this.sistemaLogic;
		
		this.cargarCombosFrameForeignKeySistema("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSistema();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSistema();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySistema("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySistema();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSistema.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSistema"));
		
		this.jInternalFrameDetalleFormSistema.jButtonModificarSistema.addActionListener(new ButtonActionListener(this,"ModificarSistema"));

		
		this.jInternalFrameDetalleFormSistema.jButtonModificarToolBarSistema.addActionListener(new ButtonActionListener(this,"ModificarToolBarSistema"));
					
		this.jInternalFrameDetalleFormSistema.jMenuItemModificarSistema.addActionListener(new ButtonActionListener(this,"MenuItemModificarSistema"));		
		
		
		
		this.jInternalFrameDetalleFormSistema.jButtonActualizarSistema.addActionListener (new ButtonActionListener(this,"ActualizarSistema"));
		
		
		this.jInternalFrameDetalleFormSistema.jButtonActualizarToolBarSistema.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSistema"));
						
		this.jInternalFrameDetalleFormSistema.jMenuItemActualizarSistema.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSistema"));		
		
		
		
		this.jInternalFrameDetalleFormSistema.jButtonEliminarSistema.addActionListener (new ButtonActionListener(this,"EliminarSistema"));
		
		
		this.jInternalFrameDetalleFormSistema.jButtonEliminarToolBarSistema.addActionListener (new ButtonActionListener(this,"EliminarToolBarSistema"));
								
		this.jInternalFrameDetalleFormSistema.jMenuItemEliminarSistema.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSistema"));		
		
		
		
		this.jInternalFrameDetalleFormSistema.jButtonCancelarSistema.addActionListener (new ButtonActionListener(this,"CancelarSistema"));
		
		
		this.jInternalFrameDetalleFormSistema.jButtonCancelarToolBarSistema.addActionListener (new ButtonActionListener(this,"CancelarToolBarSistema"));
					
		this.jInternalFrameDetalleFormSistema.jMenuItemCancelarSistema.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSistema"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSistema.jMenuItemDetalleCerrarSistema.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSistema"));		
		
		
		
		this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosToolBarSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSistema"));
		
		
		
		this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosToolBarSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSistema"));
		
		
		
		this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSistema"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonidSistemaBusqueda.addActionListener(new ButtonActionListener(this,"idSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtoncodigoSistemaBusqueda.addActionListener(new ButtonActionListener(this,"codigoSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonnombre_principalSistemaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_principalSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonnombre_secundarioSistemaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_secundarioSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonestadoSistemaBusqueda.addActionListener(new ButtonActionListener(this,"estadoSistemaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSistema"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSistema"));
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSistema"));
		}
		
		this.jTableDatosSistema.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSistema"));
		
		this.jTableDatosSistema.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSistema"));
		
		this.jButtonNuevoSistema.addActionListener(new ButtonActionListener(this,"NuevoSistema"));
		
		this.jButtonDuplicarSistema.addActionListener(new ButtonActionListener(this,"DuplicarSistema"));
		
		this.jButtonCopiarSistema.addActionListener(new ButtonActionListener(this,"CopiarSistema"));
		
		this.jButtonVerFormSistema.addActionListener(new ButtonActionListener(this,"VerFormSistema"));
		
		
		this.jButtonNuevoToolBarSistema.addActionListener(new ButtonActionListener(this,"NuevoToolBarSistema"));
			
		this.jButtonDuplicarToolBarSistema.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSistema"));
			
		this.jMenuItemNuevoSistema.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSistema"));
			
		this.jMenuItemDuplicarSistema.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSistema"));		
		
		
		this.jButtonNuevoRelacionesSistema.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSistema"));
		
		
		this.jButtonNuevoRelacionesToolBarSistema.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSistema"));
			
		this.jMenuItemNuevoRelacionesSistema.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSistema"));		
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonModificarSistema.addActionListener(new ButtonActionListener(this,"ModificarSistema"));
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonModificarToolBarSistema.addActionListener(new ButtonActionListener(this,"ModificarToolBarSistema"));
			
			this.jInternalFrameDetalleFormSistema.jMenuItemModificarSistema.addActionListener(new ButtonActionListener(this,"MenuItemModificarSistema"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSistema.jButtonActualizarSistema.addActionListener (new ButtonActionListener(this,"ActualizarSistema"));
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonActualizarToolBarSistema.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSistema"));
				
			this.jInternalFrameDetalleFormSistema.jMenuItemActualizarSistema.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSistema"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonEliminarSistema.addActionListener (new ButtonActionListener(this,"EliminarSistema"));
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonEliminarToolBarSistema.addActionListener (new ButtonActionListener(this,"EliminarToolBarSistema"));
						
			this.jInternalFrameDetalleFormSistema.jMenuItemEliminarSistema.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSistema"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonCancelarSistema.addActionListener (new ButtonActionListener(this,"CancelarSistema"));
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonCancelarToolBarSistema.addActionListener (new ButtonActionListener(this,"CancelarToolBarSistema"));
			
			this.jInternalFrameDetalleFormSistema.jMenuItemCancelarSistema.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSistema"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSistema.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSistema"));		
		
		
		this.jButtonCerrarSistema.addActionListener (new ButtonActionListener(this,"CerrarSistema"));
		
		
		this.jButtonCerrarToolBarSistema.addActionListener (new ButtonActionListener(this,"CerrarToolBarSistema"));
			
		this.jMenuItemCerrarSistema.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSistema"));
			
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jMenuItemDetalleCerrarSistema.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSistema"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosSistema"));
		}
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosToolBarSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSistema"));
		}
		
		this.jButtonCopiarToolBarSistema.addActionListener (new ButtonActionListener(this,"CopiarToolBarSistema"));
			
		this.jButtonVerFormToolBarSistema.addActionListener (new ButtonActionListener(this,"VerFormToolBarSistema"));
		
		this.jMenuItemGuardarCambiosSistema.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSistema"));
			
		this.jMenuItemCopiarSistema.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSistema"));		
		
		this.jMenuItemVerFormSistema.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSistema"));		
		
		
		this.jButtonGuardarCambiosTablaSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSistema"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSistema"));
			
		this.jMenuItemGuardarCambiosTablaSistema.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSistema"));		
		
		
		
		this.jButtonRecargarInformacionSistema.addActionListener (new ButtonActionListener(this,"RecargarInformacionSistema"));
					
		this.jButtonRecargarInformacionToolBarSistema.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSistema"));
		
		this.jMenuItemRecargarInformacionSistema.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSistema"));		
		
		
		
		this.jButtonAnterioresSistema.addActionListener (new ButtonActionListener(this,"AnterioresSistema"));
		
		
		this.jButtonAnterioresToolBarSistema.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSistema"));
		
		this.jMenuItemAnterioresSistema.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSistema"));		
		
		
		this.jButtonSiguientesSistema.addActionListener (new ButtonActionListener(this,"SiguientesSistema"));
		
		
		this.jButtonSiguientesToolBarSistema.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSistema"));
			
		this.jMenuItemSiguientesSistema.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSistema"));
			
		this.jMenuItemAbrirOrderBySistema.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySistema"));
			
		this.jMenuItemMostrarOcultarSistema.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSistema"));
			
		this.jMenuItemDetalleAbrirOrderBySistema.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySistema"));
			
		this.jMenuItemDetalleMostarOcultarSistema.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSistema"));		
		
		
		this.jButtonNuevoGuardarCambiosSistema.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSistema"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSistema.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSistema"));
			
		this.jMenuItemNuevoGuardarCambiosSistema.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSistema"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSistema.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSistema"));

		this.jCheckBoxSeleccionadosSistema.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSistema"));
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSistema"));
		}
		
		
		this.jComboBoxTiposRelacionesSistema.addActionListener (new ButtonActionListener(this,"TiposRelacionesSistema"));
			
		this.jComboBoxTiposAccionesSistema.addActionListener (new ButtonActionListener(this,"TiposAccionesSistema"));
					
		this.jComboBoxTiposSeleccionarSistema.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSistema"));
			
		this.jTextFieldValorCampoGeneralSistema.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSistema"));		
		
		
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonidSistemaBusqueda.addActionListener(new ButtonActionListener(this,"idSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtoncodigoSistemaBusqueda.addActionListener(new ButtonActionListener(this,"codigoSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonnombre_principalSistemaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_principalSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonnombre_secundarioSistemaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_secundarioSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonestadoSistemaBusqueda.addActionListener(new ButtonActionListener(this,"estadoSistemaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoSistema.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSistema"));

			this.jButtonBusquedaPorNombrePrincipalSistema.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePrincipalSistema"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSistema!=null) {
				this.jInternalFrameReporteDinamicoSistema.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSistema"));
				this.jInternalFrameReporteDinamicoSistema.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSistema"));
				this.jInternalFrameReporteDinamicoSistema.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSistema"));
			}
			
			//this.jButtonCerrarReporteDinamicoSistema.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSistema"));				
			//this.jButtonGenerarReporteDinamicoSistema.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSistema"));
			//this.jButtonGenerarExcelReporteDinamicoSistema.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSistema"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSistema!=null) {
				this.jInternalFrameImportacionSistema.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSistema"));
				this.jInternalFrameImportacionSistema.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSistema"));
				this.jInternalFrameImportacionSistema.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSistema"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySistema.addActionListener (new ButtonActionListener(this,"AbrirOrderBySistema"));
			
			this.jButtonAbrirOrderByToolBarSistema.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSistema"));			
			
			if(this.jInternalFrameOrderBySistema!=null) {
				this.jInternalFrameOrderBySistema.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySistema"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSistema!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSistema.jTabbedPaneRelacionesSistema.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSistema"));
		
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
            		closingInternalFrameSistema();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSistema.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSistema = (JInternalFrameBase)event.getSource();
	            	
	            SistemaBeanSwingJInternalFrame jInternalFrameParent=(SistemaBeanSwingJInternalFrame)jInternalFrameDetalleFormSistema.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSistemaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSistema.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSistemaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSistema.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSistema.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSistemaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSistemaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSistemaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSistema";
		inputMap = this.jButtonNuevoSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSistemaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSistemaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSistemaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSistemaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSistema";
		inputMap = this.jButtonNuevoRelacionesSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSistemaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSistema";
		inputMap = this.jButtonModificarSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSistemaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSistema";
		inputMap = this.jButtonActualizarSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSistemaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSistema";
		inputMap = this.jButtonEliminarSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSistemaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSistema";
		inputMap = this.jButtonCancelarSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSistemaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSistema";
		inputMap = this.jButtonCerrarSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSistemaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSistema";
		inputMap = this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSistema.jButtonGuardarCambiosSistema.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSistemaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSistema.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSistemaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSistema.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSistemaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSistema.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSistemaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSistema.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSistemaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonidSistemaBusqueda.addActionListener(new ButtonActionListener(this,"idSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtoncodigoSistemaBusqueda.addActionListener(new ButtonActionListener(this,"codigoSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonnombre_principalSistemaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_principalSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonnombre_secundarioSistemaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_secundarioSistemaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSistema.jButtonestadoSistemaBusqueda.addActionListener(new ButtonActionListener(this,"estadoSistemaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoSistema.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSistema"));

		this.jButtonBusquedaPorNombrePrincipalSistema.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePrincipalSistema"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSistema.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSistemaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSistemaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSistema.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSistema(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
					sistemaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sistema sistemaAux:sistemas) {
					sistemaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSistemaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSistema(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
						sistemaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sistema sistemaAux:sistemas) {
						sistemaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
					
						if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							sistemaAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sistema sistemaAux:sistemas) {
						
						if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							sistemaAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSistema(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSistema.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSistema.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSistemaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSistema(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSistema.getSelectedRows();
			
			Sistema sistemaLocal=new Sistema();
			
			//this.seleccionarTodosSistema(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLocal =(Sistema) this.sistemaLogic.getSistemas().toArray()[this.jTableDatosSistema.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sistemaLocal =(Sistema) this.sistemas.toArray()[this.jTableDatosSistema.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sistemaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
						sistemaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sistema sistemaAux:sistemas) {
						sistemaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSistema(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSistema.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSistema.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSistemaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSistemaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSistemaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSistema(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSistema.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sistema sistemaAux:this.sistemaLogic.getSistemas()) {
				
						if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							sistemaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL)) {
							existe=true;
							sistemaAux.setnombre_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO)) {
							existe=true;
							sistemaAux.setnombre_secundario(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sistema sistemaAux:sistemas) {
					
						if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							sistemaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL)) {
							existe=true;
							sistemaAux.setnombre_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO)) {
							existe=true;
							sistemaAux.setnombre_secundario(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSistema(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSistemaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSistema(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSistema=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSistema.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSistema) {				
					conSplash=true;//false;										
					
					//this.startProcessSistema(conSplash);
				
					this.generarReporteSistemasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSistemasSeleccionados();
				//this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSistemasSeleccionados(false);
				//this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSistemasSeleccionados(true);
				//this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSistema();
				
				this.exportarSistemasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSistemas();
				//this.importarSistemas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSistema();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSistemasSeleccionados();
				//this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSistema();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSistema)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySistema(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
				}	
			} 			
			else if(SistemaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSistema) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSistema(conSplash);
					
						//this.actualizarParametrosGeneralSistema();
						
						this.generarReporteProcesoAccionSistemasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SistemaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SistemaS SELECCIONADOS?", "MANTENIMIENTO DE Sistema", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSistema();
				
						this.actualizarParametrosGeneralSistema();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.sistemaReturnGeneral=sistemaLogic.procesarAccionSistemasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sistemaLogic.getSistemas(),this.sistemaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSistemaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSistema();
					
					SistemaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSistemaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSistema.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSistema.jComboBoxTiposAccionesFormularioSistema.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSistema(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSistemaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSistema();
			
			if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
			Sistema sistema=new Sistema();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSistema(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSistema.getSelectedItem();
			
			
			
			
			sistemasSeleccionados=this.getSistemasSeleccionados(true);
			//this.sTipoAccion;
			
			if(sistemasSeleccionados.size()==1) {
				for(Sistema sistemaAux:sistemasSeleccionados) {
					sistema=sistemaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Perfil")) {
					jButtonPerfilActionPerformed(null,rowIndex,true,false,sistema);
				}
				else if(this.sTipoRelacion.equals("Opcion")) {
					jButtonOpcionActionPerformed(null,rowIndex,true,false,sistema);
				}
				else if(this.sTipoRelacion.equals("Paquete")) {
					jButtonPaqueteActionPerformed(null,rowIndex,true,false,sistema);
				}
				else if(this.sTipoRelacion.equals("Modulo")) {
					jButtonModuloActionPerformed(null,rowIndex,true,false,sistema);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSistema();
			
      		//this.finishProcessSistema(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSistemaReturnGeneral() throws Exception {
		if(this.sistemaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sistemaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sistemaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sistemaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sistemaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sistemaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSistema(false);
		}
		
		if(this.sistemaReturnGeneral.getConRetornoLista() || this.sistemaReturnGeneral.getConRetornoObjeto()) {
			if(this.sistemaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sistemaLogic.setSistemas(this.sistemaReturnGeneral.getSistemas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.sistemaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sistemaLogic.setSistema(this.sistemaReturnGeneral.getSistema());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSistema(false);
		}
	}
	
	public void actualizarParametrosGeneralSistema() throws Exception {
		
		
	}
	
	public ArrayList<Sistema> getSistemasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSistema) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Sistema sistemaAux:sistemaLogic.getSistemas()) {
					if(sistemaAux.getIsSelected()) {
						sistemasSeleccionados.add(sistemaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sistema sistemaAux:this.sistemas) {
					if(sistemaAux.getIsSelected()) {
						sistemasSeleccionados.add(sistemaAux);				
					}
				}
			}
			
			if(sistemasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sistemasSeleccionados.addAll(this.sistemaLogic.getSistemas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sistemasSeleccionados.addAll(this.sistemas);				
					}
				}
			}
		} else {
			sistemasSeleccionados.add(this.sistema);
		}
		
		return sistemasSeleccionados;
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
	
	public void generarReporteSistemasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSistemasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSistemasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSistemasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSistemasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSistemasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sistema",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSistemasSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSistemas("Todos",sistemasSeleccionados);
		
	}	
	
	public void generarReporteNormalSistemasSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSistemas("Todos",sistemasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSistemasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSistemas("Todos",sistemasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSistemasSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSistema();
		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSistema();
		
		
		//this.generarReporteSistemas("Todos",sistemasSeleccionados ,sistemaImplementable,sistemaImplementableHome);
	}
	
	public void mostrarImportacionSistemas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSistema();
		
		this.abrirFrameImportacionSistema();		
		
			
		//this.generarReporteSistemas("Todos",sistemasSeleccionados ,sistemaImplementable,sistemaImplementableHome);
	}
	
	public void importarSistemas() throws Exception {		
	
	}
	
	public void exportarSistemasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSistemasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSistemasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSistemasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sistema",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSistemasSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSistema(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Sistema sistemaAux:sistemasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSistema(sistemaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sistemaAux.setsDetalleGeneralEntityReporte(sistemaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSistema(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SistemaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SistemaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SistemaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SistemaConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSistema(Sistema sistema,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sistema.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getnombre_principal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getnombre_secundario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sistema.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSistemasSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Sistemas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSistema(row);				
				iRow++;
			}				
			
			for(Sistema sistemaAux:sistemasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSistema(sistemaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSistemasSeleccionados() throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();		
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sistema.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sistemas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sistema");
			//elementRoot.appendChild(element);
		
			for(Sistema sistemaAux:sistemasSeleccionados) {
				element = document.createElement("sistema");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSistema(sistemaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sistemaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sistema",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSistema(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SistemaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SistemaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SistemaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SistemaConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSistema(Sistema sistema,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sistema.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sistema.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(sistema.getnombre_principal());
		cell = row.createCell(iColumn++);cell.setCellValue(sistema.getnombre_secundario());
		cell = row.createCell(iColumn++);cell.setCellValue(sistema.getestado());				
	}
	
	public void setFilaDatosExportarXmlSistema(Sistema sistema,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SistemaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sistema.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SistemaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sistema.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(SistemaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(sistema.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_principal = document.createElement(SistemaConstantesFunciones.NOMBREPRINCIPAL);
		elementnombre_principal.appendChild(document.createTextNode(sistema.getnombre_principal().trim()));
		element.appendChild(elementnombre_principal);

		Element elementnombre_secundario = document.createElement(SistemaConstantesFunciones.NOMBRESECUNDARIO);
		elementnombre_secundario.appendChild(document.createTextNode(sistema.getnombre_secundario().trim()));
		element.appendChild(elementnombre_secundario);

		Element elementestado = document.createElement(SistemaConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(sistema.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoSistemasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Sistema> sistemasSeleccionados=new ArrayList<Sistema>();
		
		sistemasSeleccionados=this.getSistemasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSistema(sistemasSeleccionados);
		
		this.generarReporteSistemas("Todos",sistemasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSistema(ArrayList<Sistema> sistemasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Sistema sistemaAux:sistemasSeleccionados) {
				sistemaAux.setsDetalleGeneralEntityReporte(sistemaAux.toString());
			
				if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(sistemaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_NOMBREPRINCIPAL)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(sistemaAux.getnombre_principal());
				}
				 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_NOMBRESECUNDARIO)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(sistemaAux.getnombre_secundario());
				}
				 else if(sTipoSeleccionar.equals(SistemaConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					sistemaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(sistemaAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SistemaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSistema(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSistema=true;
				this.isVisibilidadCeldaNuevoRelacionesSistema=true;
				this.isVisibilidadCeldaGuardarCambiosSistema=true;
			}
			
			this.isVisibilidadCeldaModificarSistema=false;
			this.isVisibilidadCeldaActualizarSistema=false;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=true;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
			this.isVisibilidadCeldaModificarSistema=false;
			this.isVisibilidadCeldaActualizarSistema=true;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=true;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
			this.isVisibilidadCeldaModificarSistema=false;
			this.isVisibilidadCeldaActualizarSistema=true;
			this.isVisibilidadCeldaEliminarSistema=true;
			this.isVisibilidadCeldaCancelarSistema=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=true;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
			this.isVisibilidadCeldaModificarSistema=false;
			this.isVisibilidadCeldaActualizarSistema=true;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=false;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSistema=true;
			this.isVisibilidadCeldaNuevoRelacionesSistema=true;
			this.isVisibilidadCeldaGuardarCambiosSistema=true;
			this.isVisibilidadCeldaModificarSistema=false;
			this.isVisibilidadCeldaActualizarSistema=false;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=true;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
			this.isVisibilidadCeldaActualizarSistema=false;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=false;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
			this.isVisibilidadCeldaModificarSistema=true;
			this.isVisibilidadCeldaActualizarSistema=false;
			this.isVisibilidadCeldaEliminarSistema=false;
			this.isVisibilidadCeldaCancelarSistema=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSistema=false;
				} else {
					this.isVisibilidadCeldaGuardarSistema=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SistemaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSistema=true;
			this.isVisibilidadCeldaNuevoRelacionesSistema=true;
			this.isVisibilidadCeldaGuardarCambiosSistema=true;
		} else {
			this.actualizarEstadoPanelsSistema(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSistema=false;
			//this.isVisibilidadCeldaVerFormSistema=false;
			this.isVisibilidadCeldaDuplicarSistema=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sistemaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
		} else {
			this.isVisibilidadCeldaNuevoSistema=false;
			this.isVisibilidadCeldaGuardarCambiosSistema=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sistemaSessionBean.getEsGuardarRelacionado()) {
			if(!sistemaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSistema=false;												
			}
			
			this.jButtonCerrarSistema.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSistema=false;
		}
		
		if(!this.permiteMantenimiento(this.sistema)) {
			this.isVisibilidadCeldaActualizarSistema=false;
			this.isVisibilidadCeldaEliminarSistema=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSistema() {
		this.isVisibilidadCeldaNuevoSistema=false;
		this.isVisibilidadCeldaGuardarCambiosSistema=false;
	}
	
	public void actualizarEstadoPanelsSistema(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(true);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(false);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(false);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(false);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(true);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(true);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSistema!=null) {
				this.jScrollPanelDatosEdicionSistema.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSistema!=null) {
				this.jScrollPanelDatosSistema.setVisible(true);
			}
			
			if(this.jPanelPaginacionSistema!=null) {
				this.jPanelPaginacionSistema.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sistemaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSistema!=null) {
					this.jTabbedPaneBusquedasSistema.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sistemaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSistema!=null) {
				this.jTabbedPaneBusquedasSistema.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSistema!=null) {
				this.jPanelParametrosReportesSistema.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionSistemaParaPerfiles() throws Exception {
		Boolean isPaginaPopupPerfil=false;

		try {

			if(this.sistemaSessionBean==null) {
				this.sistemaSessionBean=new SistemaSessionBean();
			}

			if(this.jInternalFrameDetalleFormSistema.perfilSessionBean==null) {
				this.jInternalFrameDetalleFormSistema.perfilSessionBean=new PerfilSessionBean();
			}

			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setsPathNavegacionActual(sistemaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfil=this.jInternalFrameDetalleFormSistema.perfilSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfil(true);
			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfil(SistemaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setlidSistemaActual(this.idSistemaActual);
			this.jInternalFrameDetalleFormSistema.perfilSessionBean.setNoMantenimiento(true);

			sistemaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySistema(true);
			sistemaSessionBean.setlIdSistemaActualForeignKey(this.idSistemaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSistemaParaOpciones() throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(this.sistemaSessionBean==null) {
				this.sistemaSessionBean=new SistemaSessionBean();
			}

			if(this.jInternalFrameDetalleFormSistema.opcionSessionBean==null) {
				this.jInternalFrameDetalleFormSistema.opcionSessionBean=new OpcionSessionBean();
			}

			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setsPathNavegacionActual(sistemaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupOpcion=this.jInternalFrameDetalleFormSistema.opcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOpcion(true);
			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion(SistemaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setlidSistemaActual(this.idSistemaActual);
			this.jInternalFrameDetalleFormSistema.opcionSessionBean.setNoMantenimiento(true);

			sistemaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySistema(true);
			sistemaSessionBean.setlIdSistemaActualForeignKey(this.idSistemaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSistemaParaPaquetes() throws Exception {
		Boolean isPaginaPopupPaquete=false;

		try {

			if(this.sistemaSessionBean==null) {
				this.sistemaSessionBean=new SistemaSessionBean();
			}

			if(this.jInternalFrameDetalleFormSistema.paqueteSessionBean==null) {
				this.jInternalFrameDetalleFormSistema.paqueteSessionBean=new PaqueteSessionBean();
			}

			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setsPathNavegacionActual(sistemaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PaqueteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPaquete=this.jInternalFrameDetalleFormSistema.paqueteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePaquete(true);
			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePaquete(SistemaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setlidSistemaActual(this.idSistemaActual);
			this.jInternalFrameDetalleFormSistema.paqueteSessionBean.setNoMantenimiento(true);

			sistemaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySistema(true);
			sistemaSessionBean.setlIdSistemaActualForeignKey(this.idSistemaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionSistemaParaModulos() throws Exception {
		Boolean isPaginaPopupModulo=false;

		try {

			if(this.sistemaSessionBean==null) {
				this.sistemaSessionBean=new SistemaSessionBean();
			}

			if(this.jInternalFrameDetalleFormSistema.moduloSessionBean==null) {
				this.jInternalFrameDetalleFormSistema.moduloSessionBean=new ModuloSessionBean();
			}

			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setsPathNavegacionActual(sistemaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ModuloConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupModulo=this.jInternalFrameDetalleFormSistema.moduloSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeModulo(true);
			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeModulo(SistemaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setisBusquedaDesdeForeignKeySesionSistema(true);
			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setlidSistemaActual(this.idSistemaActual);
			this.jInternalFrameDetalleFormSistema.moduloSessionBean.setNoMantenimiento(true);

			sistemaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySistema(true);
			sistemaSessionBean.setlIdSistemaActualForeignKey(this.idSistemaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SistemaSessionBean sistemaSessionBean=new SistemaSessionBean();
		
		if(this.sistemaSessionBean==null) {
			this.sistemaSessionBean=new SistemaSessionBean();
		}
		
		this.sistemaSessionBean.setsUltimaBusquedaSistema(this.getsAccionBusqueda());
		this.sistemaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.sistemaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			sistemaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombrePrincipal")) {
			sistemaSessionBean.setnombre_principal(this.getnombre_principalBusquedaPorNombrePrincipal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SistemaSessionBean sistemaSessionBean=new SistemaSessionBean();
		
		if(this.sistemaSessionBean==null) {
			this.sistemaSessionBean=new SistemaSessionBean();
		}
		
		if(this.sistemaSessionBean.getsUltimaBusquedaSistema()!=null&&!this.sistemaSessionBean.getsUltimaBusquedaSistema().equals("")) {
			this.setsAccionBusqueda(sistemaSessionBean.getsUltimaBusquedaSistema());
			this.setiNumeroPaginacion(sistemaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(sistemaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(sistemaSessionBean.getcodigo());
				sistemaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombrePrincipal")) {
				this.setnombre_principalBusquedaPorNombrePrincipal(sistemaSessionBean.getnombre_principal());
				sistemaSessionBean.setnombre_principal("");
			}
		}
		
		this.sistemaSessionBean.setsUltimaBusquedaSistema("");
		this.sistemaSessionBean.setiNumeroPaginacion(SistemaConstantesFunciones.INUMEROPAGINACION);
		this.sistemaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSistema(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSistema() {
		this.updateBorderResaltarBusquedasFormularioSistema();
		this.updateVisibilidadBusquedasFormularioSistema();
		this.updateHabilitarBusquedasFormularioSistema();
	}
	
	public void updateBorderResaltarBusquedasFormularioSistema() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSistema.getComponents().length>0) {
	

		if(this.sistemaConstantesFunciones.resaltarBusquedaPorCodigoSistema!=null) {
			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorCodigoSistema);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);
				jPanel.setBorder(this.sistemaConstantesFunciones.resaltarBusquedaPorCodigoSistema);
			}
		}

		if(this.sistemaConstantesFunciones.resaltarBusquedaPorNombrePrincipalSistema!=null) {
			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorNombrePrincipalSistema);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);
				jPanel.setBorder(this.sistemaConstantesFunciones.resaltarBusquedaPorNombrePrincipalSistema);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSistema() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSistema.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorCodigoSistema);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sistemaConstantesFunciones.mostrarBusquedaPorCodigoSistema);
			if(!this.sistemaConstantesFunciones.mostrarBusquedaPorCodigoSistema && index>-1) {
				this.jTabbedPaneBusquedasSistema.remove(index);
			}

			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorNombrePrincipalSistema);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sistemaConstantesFunciones.mostrarBusquedaPorNombrePrincipalSistema);
			if(!this.sistemaConstantesFunciones.mostrarBusquedaPorNombrePrincipalSistema && index>-1) {
				this.jTabbedPaneBusquedasSistema.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSistema() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSistema.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorCodigoSistema);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sistemaConstantesFunciones.activarBusquedaPorCodigoSistema);
				this.jTabbedPaneBusquedasSistema.setEnabledAt(index,this.sistemaConstantesFunciones.activarBusquedaPorCodigoSistema);
			}

			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorNombrePrincipalSistema);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sistemaConstantesFunciones.activarBusquedaPorNombrePrincipalSistema);
				this.jTabbedPaneBusquedasSistema.setEnabledAt(index,this.sistemaConstantesFunciones.activarBusquedaPorNombrePrincipalSistema);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSistema(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorCodigoSistema);

			this.jTabbedPaneBusquedasSistema.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);

			this.sistemaConstantesFunciones.setResaltarBusquedaPorCodigoSistema(resaltar);

			jPanel.setBorder(this.sistemaConstantesFunciones.resaltarBusquedaPorCodigoSistema);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombrePrincipal")) {
			index= this.jTabbedPaneBusquedasSistema.indexOfComponent(this.jPanelBusquedaPorNombrePrincipalSistema);

			this.jTabbedPaneBusquedasSistema.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSistema.getComponent(index);

			this.sistemaConstantesFunciones.setResaltarBusquedaPorNombrePrincipalSistema(resaltar);

			jPanel.setBorder(this.sistemaConstantesFunciones.resaltarBusquedaPorNombrePrincipalSistema);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSistema.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSistema() throws Exception {

		if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSistema();
		this.updateVisibilidadResaltarControlesFormularioSistema();
		this.updateHabilitarResaltarControlesFormularioSistema();
		
	}
	
	public void updateBorderResaltarControlesFormularioSistema() throws Exception {
		if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sistemaConstantesFunciones.resaltaridSistema!=null && this.jInternalFrameDetalleFormSistema!=null) {this.jInternalFrameDetalleFormSistema.jLabelidSistema.setBorder(this.sistemaConstantesFunciones.resaltaridSistema);}
		if(this.sistemaConstantesFunciones.resaltarcodigoSistema!=null && this.jInternalFrameDetalleFormSistema!=null) {this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setBorder(this.sistemaConstantesFunciones.resaltarcodigoSistema);}
		if(this.sistemaConstantesFunciones.resaltarnombre_principalSistema!=null && this.jInternalFrameDetalleFormSistema!=null) {this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setBorder(this.sistemaConstantesFunciones.resaltarnombre_principalSistema);}
		if(this.sistemaConstantesFunciones.resaltarnombre_secundarioSistema!=null && this.jInternalFrameDetalleFormSistema!=null) {this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setBorder(this.sistemaConstantesFunciones.resaltarnombre_secundarioSistema);}
		if(this.sistemaConstantesFunciones.resaltarestadoSistema!=null && this.jInternalFrameDetalleFormSistema!=null) {this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setBorderPainted(true);this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setBorder(this.sistemaConstantesFunciones.resaltarestadoSistema);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSistema() throws Exception {		
		if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
	
		//this.jInternalFrameDetalleFormSistema.jLabelidSistema.setVisible(this.sistemaConstantesFunciones.mostraridSistema);
		this.jInternalFrameDetalleFormSistema.jPanelidSistema.setVisible(this.sistemaConstantesFunciones.mostraridSistema);
		//this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setVisible(this.sistemaConstantesFunciones.mostrarcodigoSistema);
		this.jInternalFrameDetalleFormSistema.jPanelcodigoSistema.setVisible(this.sistemaConstantesFunciones.mostrarcodigoSistema);
		//this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setVisible(this.sistemaConstantesFunciones.mostrarnombre_principalSistema);
		this.jInternalFrameDetalleFormSistema.jPanelnombre_principalSistema.setVisible(this.sistemaConstantesFunciones.mostrarnombre_principalSistema);
		//this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setVisible(this.sistemaConstantesFunciones.mostrarnombre_secundarioSistema);
		this.jInternalFrameDetalleFormSistema.jPanelnombre_secundarioSistema.setVisible(this.sistemaConstantesFunciones.mostrarnombre_secundarioSistema);
		//this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setVisible(this.sistemaConstantesFunciones.mostrarestadoSistema);
		this.jInternalFrameDetalleFormSistema.jPanelestadoSistema.setVisible(this.sistemaConstantesFunciones.mostrarestadoSistema);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSistema() throws Exception {
		if(this.jInternalFrameDetalleFormSistema==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSistema!=null) {
	
		this.jInternalFrameDetalleFormSistema.jLabelidSistema.setEnabled(this.sistemaConstantesFunciones.activaridSistema);
		this.jInternalFrameDetalleFormSistema.jTextFieldcodigoSistema.setEnabled(this.sistemaConstantesFunciones.activarcodigoSistema);
		this.jInternalFrameDetalleFormSistema.jTextAreanombre_principalSistema.setEnabled(this.sistemaConstantesFunciones.activarnombre_principalSistema);
		this.jInternalFrameDetalleFormSistema.jTextAreanombre_secundarioSistema.setEnabled(this.sistemaConstantesFunciones.activarnombre_secundarioSistema);
		this.jInternalFrameDetalleFormSistema.jCheckBoxestadoSistema.setEnabled(this.sistemaConstantesFunciones.activarestadoSistema);
		}
	}
	
		
}